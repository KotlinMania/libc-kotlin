package io.github.kotlinmania.libc

import kotlin.test.Test
import kotlin.test.assertFailsWith

class HostIoTest {
    @Test
    fun nativeMemoryPreservesBytesAcrossCopyAndResize() {
        if (testIsBrowser()) assertFailsWith<UnsupportedOperationException> { verifyHostMemory() } else verifyHostMemory()
    }

    @Test
    fun realDescriptorsPreserveBytesAndExposeHostErrors() {
        if (testIsBrowser()) assertFailsWith<UnsupportedOperationException> { verifyHostDescriptorIo() } else verifyHostDescriptorIo()
    }
}
