package io.github.kotlinmania.libc.unix.bsd.apple

public actual fun machTaskSelf(): UInt =
    throw UnsupportedOperationException("Mach task ports require an Apple native target")
