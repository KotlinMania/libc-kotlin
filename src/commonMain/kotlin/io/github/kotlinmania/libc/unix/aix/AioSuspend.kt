package io.github.kotlinmania.libc.unix.aix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun aioSuspend(list: COpaquePointer?, nent: Int, timeout: Timespec?): Int
