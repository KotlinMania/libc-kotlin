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
 */
class CmsgWrapperTest {

    @Test
    fun cmsgAlignRoundsUp() {
        assertEquals(0uL, cMSGALIGN(0uL))
        assertEquals(8uL, cMSGALIGN(1uL))
        assertEquals(8uL, cMSGALIGN(8uL))
        assertEquals(16uL, cMSGALIGN(9uL))
        assertEquals(16uL, cMSGALIGN(16uL))
    }

    @Test
    fun cmsgSpaceGrowsWithLength() {
        val s0 = cMSGSPACE(0u)
        val s4 = cMSGSPACE(4u)
        val s100 = cMSGSPACE(100u)
        assertTrue(s0 < s4, "CMSG_SPACE(0) < CMSG_SPACE(4)")
        assertTrue(s4 < s100, "CMSG_SPACE(4) < CMSG_SPACE(100)")
        assertEquals(s0 + 4u, s4, "CMSG_SPACE(4) = CMSG_SPACE(0) + 4")
    }

    @Test
    fun cmsgLenGrowsWithLength() {
        val l0 = cMSGLEN(0u)
        val l4 = cMSGLEN(4u)
        assertEquals(l0 + 4u, l4, "CMSG_LEN(4) = CMSG_LEN(0) + 4")
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

        // CMSG_DATA = cmsg + CMSG_ALIGN(sizeof(cmsghdr))
        // sizeof(cmsghdr) on macOS = 12 bytes, aligned to 16
        val hdrAlign = 12uL
        assertEquals(buf.value + hdrAlign.toLong(), dataPtr.value,
            "CMSG_DATA should advance by sizeof(cmsghdr) = 12")

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
