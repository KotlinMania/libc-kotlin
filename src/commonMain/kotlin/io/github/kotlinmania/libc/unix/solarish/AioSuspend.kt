package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int
