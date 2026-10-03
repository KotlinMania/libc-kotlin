package io.github.kotlinmania.libc.unix.bsd.apple

public actual fun machTaskSelf(): MachPortT =
    throw UnsupportedOperationException("Mach task ports require an Apple native target")
