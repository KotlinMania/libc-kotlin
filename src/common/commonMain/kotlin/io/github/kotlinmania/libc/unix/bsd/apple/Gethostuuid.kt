package io.github.kotlinmania.libc.unix.bsd.apple
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun gethostuuid(id: COpaquePointer?, timeout: Timespec?): Int
