@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.vxworks.cmsgAlign
import io.github.kotlinmania.libc.vxworks.cmsgData
import io.github.kotlinmania.libc.vxworks.cmsgFirstHdr
import io.github.kotlinmania.libc.vxworks.cmsgLen
import io.github.kotlinmania.libc.vxworks.cmsgSpace
import kotlinx.cinterop.ExperimentalForeignApi
import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertNull

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
        assertFailsWith(UnsupportedOperationException::class) { cmsgAlign(1uL) }
    }

    @Test
    fun cmsgSpaceThrowsOnSharedNative() {
        assertFailsWith(UnsupportedOperationException::class) { cmsgSpace(0u) }
    }

    @Test
    fun cmsgLenThrowsOnSharedNative() {
        assertFailsWith(UnsupportedOperationException::class) { cmsgLen(0u) }
    }

    @Test
    fun cmsgDataNullInputReturnsNull() {
        assertNull(cmsgData(null))
    }

    @Test
    fun cmsgFirsthdrNullInputReturnsNull() {
        assertNull(cmsgFirstHdr(null))
    }
}
