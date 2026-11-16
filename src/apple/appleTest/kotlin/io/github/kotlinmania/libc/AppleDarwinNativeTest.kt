package io.github.kotlinmania.libc

import kotlin.test.Test

class AppleDarwinNativeTest {
    @Test
    fun darwinNativeErrnoIconvAndPthreadEnosysWork() {
        verifyAppleDarwinFfi()
    }
}
