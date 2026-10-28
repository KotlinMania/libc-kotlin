package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun procPidRusage(pid: Int, flavor: Int, buffer: io.github.kotlinmania.libc.COpaquePointer?): Int
