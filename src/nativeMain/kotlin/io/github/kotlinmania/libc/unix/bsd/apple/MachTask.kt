@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.apple

public actual fun machTaskSelf(): MachPortT {
    val port = libc.cinterop.libc_mach_task_self()
    if (port == 0u) throw UnsupportedOperationException("Mach task ports require an Apple kernel")
    return port
}
