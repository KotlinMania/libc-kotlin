@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.unix.bsd.apple.machTaskSelf
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class MachTaskTest {
    @Test
    fun returnsCurrentKernelTaskPort() {
        assertNotEquals(0u, machTaskSelf())
        assertEquals(platform.darwin.mach_task_self_, machTaskSelf())
    }
}
