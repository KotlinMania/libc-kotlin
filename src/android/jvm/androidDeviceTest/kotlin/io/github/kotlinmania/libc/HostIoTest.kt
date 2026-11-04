package io.github.kotlinmania.libc

import androidx.test.platform.app.InstrumentationRegistry
import kotlin.test.Test

class HostIoTest {
    @Test
    fun androidNativeMemoryPreservesBytesAcrossCopyAndResize() = verifyHostMemory()

    @Test
    fun androidDescriptorsPreserveBytesAndExposeHostErrors() {
        val instrumentation = InstrumentationRegistry.getInstrumentation()
        verifyHostDescriptorIo(instrumentation.targetContext.cacheDir.absolutePath)
    }
}
