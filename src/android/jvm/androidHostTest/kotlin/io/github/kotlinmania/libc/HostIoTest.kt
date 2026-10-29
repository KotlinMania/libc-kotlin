package io.github.kotlinmania.libc

import kotlin.test.Test

class HostIoTest {
    @Test
    fun nativeMemoryPreservesBytesAcrossCopyAndResize() = verifyHostMemory()

    @Test
    fun realDescriptorsPreserveBytesAndExposeHostErrors() = verifyHostDescriptorIo()
}
