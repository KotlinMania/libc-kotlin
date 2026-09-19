@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.vxworks.cMSGALIGN
import io.github.kotlinmania.libc.vxworks.cMSGSPACE
import io.github.kotlinmania.libc.vxworks.cMSGLEN
import io.github.kotlinmania.libc.vxworks.cMSGDATA
import io.github.kotlinmania.libc.vxworks.cMSGFIRSTHDR
import io.github.kotlinmania.libc.vxworks.malloc
import io.github.kotlinmania.libc.vxworks.free
import io.github.kotlinmania.libc.vxworks.memset
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * Tests exercising the C wrapper (libc_wrapper.c) via cinterop.
 * The C wrapper exposes CMSG macros as functions callable from Kotlin.
 *
 * These tests assert portable invariants that hold across all supported
 * native ABIs (macOS, Linux, Windows/MinGW). They never hardcode
 * platform-specific byte counts; instead they derive expected values
 * from other CMSG calls at runtime.
 *
 * Key cross-platform relationships:
 * - CMSG_LEN(N) = CMSG_LEN(0) + N  (linear in payload length)
 * - CMSG_SPACE(0) = CMSG_LEN(0)    (both equal the aligned header size)
 * - CMSG_SPACE(N) >= CMSG_SPACE(0) + N  (space rounds up, never down)
 * - CMSG_SPACE(N) >= CMSG_LEN(N)  (space includes alignment padding)
 * - CMSG_DATA offset = CMSG_LEN(0) (data starts after aligned header)
 *
 * Note: cMSGALIGN wraps libc_cmsg_align which uses sizeof(size_t),
 * while CMSG_SPACE/CMSG_LEN use the platform's own CMSG_ALIGN which
 * may differ (e.g. macOS uses 4-byte __DARWIN_ALIGN32 vs sizeof(size_t)
 * = 8). Therefore cMSGALIGN cannot predict CMSG_SPACE deltas on all
 * platforms.
 */
class CmsgWrapperTest {

    @Test
    fun cmsgAlignRoundsUpToSizeOf() {
        // CMSG_ALIGN rounds up to sizeof(size_t) boundary.
        // On all current 64-bit native targets sizeof(size_t) = 8.
        // Derive the alignment unit from the smallest non-zero aligned value.
        val align = cMSGALIGN(1uL)
        assertEquals(0uL, cMSGALIGN(0uL))
        assertEquals(align, cMSGALIGN(1uL))
        assertEquals(align, cMSGALIGN(align))
        assertEquals(align * 2u, cMSGALIGN(align + 1uL))
        // Verify idempotence: align(align(x)) == align(x)
        var len = 0uL
        while (len <= 200uL) {
            val a = cMSGALIGN(len)
            assertEquals(a, cMSGALIGN(a), "CMSG_ALIGN should be idempotent for $len")
            len += 7uL
        }
    }

    @Test
    fun cmsgSpaceGrowsWithLength() {
        // CMSG_SPACE is monotonically non-decreasing in length.
        val s0 = cMSGSPACE(0u)
        val s4 = cMSGSPACE(4u)
        val s100 = cMSGSPACE(100u)
        assertTrue(s0 <= s4, "CMSG_SPACE(0) <= CMSG_SPACE(4)")
        assertTrue(s4 <= s100, "CMSG_SPACE(4) <= CMSG_SPACE(100)")

        // Portable invariant: CMSG_SPACE(N) >= CMSG_SPACE(0) + N.
        // The actual delta depends on the platform's CMSG_ALIGN boundary:
        //   - macOS uses 4-byte alignment (__DARWIN_ALIGN32), so SPACE(4)-SPACE(0) = 4
        //   - 64-bit Linux uses 8-byte alignment (sizeof(size_t)), so SPACE(4)-SPACE(0) = 8
        // The >= relationship holds universally because CMSG_SPACE(N) =
        // CMSG_ALIGN(sizeof(cmsghdr)) + CMSG_ALIGN(N) and CMSG_ALIGN(N) >= N.
        for (len in 0u..200u) {
            val space = cMSGSPACE(len)
            assertTrue(space >= s0 + len,
                "CMSG_SPACE($len) >= CMSG_SPACE(0) + $len")
        }
    }

    @Test
    fun cmsgLenGrowsWithLength() {
        // CMSG_LEN(len) = CMSG_ALIGN(sizeof(cmsghdr)) + len
        // The delta CMSG_LEN(N) - CMSG_LEN(0) = N on every platform.
        val l0 = cMSGLEN(0u)
        val l4 = cMSGLEN(4u)
        assertEquals(l0 + 4u, l4, "CMSG_LEN(4) = CMSG_LEN(0) + 4")

        // Also verify for larger lengths
        val l100 = cMSGLEN(100u)
        assertEquals(l0 + 100u, l100, "CMSG_LEN(100) = CMSG_LEN(0) + 100")
    }

    @Test
    fun cmsgSpaceEqualsLenAtZero() {
        // CMSG_SPACE(0) == CMSG_LEN(0) on every platform because both
        // equal CMSG_ALIGN(sizeof(cmsghdr)).
        assertEquals(cMSGLEN(0u).toULong(), cMSGSPACE(0u).toULong(),
            "CMSG_SPACE(0) == CMSG_LEN(0)")
    }

    @Test
    fun cmsgSpaceAndLenRelationship() {
        // CMSG_SPACE(len) >= CMSG_LEN(len) for all len
        for (len in 0u..100u) {
            val space = cMSGSPACE(len)
            val clen = cMSGLEN(len)
            assertTrue(space >= clen, "CMSG_SPACE($len) >= CMSG_LEN($len)")
        }
    }

    @Test
    fun cmsgFirsthdrReturnsNullForZeroControl() {
        // All-zero msghdr means msg_controllen = 0, so FIRSTHDR returns null
        val buf = malloc(128uL)
        assertNotNull(buf)
        memset(buf, 0, 128uL)

        val result = cMSGFIRSTHDR(COpaquePointer(buf.value))
        assertNull(result)

        free(buf)
    }

    @Test
    fun cmsgDataAdvancesPastHeader() {
        val buf = malloc(64uL)
        assertNotNull(buf)
        memset(buf, 0, 64uL)

        val cmsgAddr = COpaquePointer(buf.value)
        val dataPtr = cMSGDATA(cmsgAddr)
        assertNotNull(dataPtr)

        // CMSG_DATA = cmsg + CMSG_ALIGN(sizeof(cmsghdr)).
        // The aligned header size equals CMSG_LEN(0) on every platform:
        //   CMSG_LEN(0) = CMSG_ALIGN(sizeof(cmsghdr))
        // macOS:  sizeof(cmsghdr)=12, CMSG_ALIGN to 4-byte → offset = 12
        // Linux:  sizeof(cmsghdr)=16, CMSG_ALIGN to 8-byte → offset = 16
        // Derive the expected offset from CMSG_LEN(0) instead of hardcoding.
        val expectedOffset = cMSGLEN(0u).toULong()
        assertEquals(buf.value + expectedOffset.toLong(), dataPtr.value,
            "CMSG_DATA should advance by CMSG_ALIGN(sizeof(cmsghdr)) = CMSG_LEN(0)")

        free(buf)
    }

    @Test
    fun cmsgDataNullInputReturnsNull() {
        assertNull(cMSGDATA(null))
    }

    @Test
    fun cmsgFirsthdrNullInputReturnsNull() {
        assertNull(cMSGFIRSTHDR(null))
    }
}
