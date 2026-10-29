package io.github.kotlinmania.libc

import kotlin.test.Test

class HostIoTest(
    private val directory: String,
) {
    @Test
    fun androidNativeMemoryPreservesBytesAcrossCopyAndResize() = verifyHostMemory()

    @Test
    fun androidDescriptorsPreserveBytesAndExposeHostErrors() {
        verifyHostDescriptorIo(directory)
    }
}
