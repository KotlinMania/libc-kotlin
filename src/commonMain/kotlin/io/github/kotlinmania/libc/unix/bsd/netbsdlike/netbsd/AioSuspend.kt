package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int
