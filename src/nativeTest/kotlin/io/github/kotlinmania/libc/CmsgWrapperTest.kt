@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.vxworks.cMSGALIGN
import io.github.kotlinmania.libc.vxworks.cMSGSPACE
import io.github.kotlinmania.libc.vxworks.cMSGLEN
import io.github.kotlinmania.libc.vxworks.cMSGDATA
import io.github.kotlinmania.libc.vxworks.cMSGFIRSTHDR
import kotlinx.cinterop.ExperimentalForeignApi
import kotlin.test.Test
import kotlin.test.assertNull
import kotlin.test.assertFailsWith

/**
 * Tests exercising the C wrapper (libc_wrapper.c) via cinterop.
 *
 * CMSG_ALIGN/SPACE/LEN require per-platform actuals (size_t width differs
 * across 32-bit and 64-bit native targets), so they throw on shared nativeMain.
 * CMSG_DATA and CMSG_FIRSTHDR use COpaquePointer params (pointer-sized, not
 * size_t) and work on all native targets.
 */
class CmsgWrapperTest {

    @Test
    fun cmsgAlignThrowsOnSharedNative() {
        assertFailsWith(UnsupportedOperationException::class) { cMSGALIGN(1uL) }
    }

    @Test
    fun cmsgSpaceThrowsOnSharedNative() {
        assertFailsWith(UnsupportedOperationException::class) { cMSGSPACE(0u) }
    }

    @Test
    fun cmsgLenThrowsOnSharedNative() {
        assertFailsWith(UnsupportedOperationException::class) { cMSGLEN(0u) }
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