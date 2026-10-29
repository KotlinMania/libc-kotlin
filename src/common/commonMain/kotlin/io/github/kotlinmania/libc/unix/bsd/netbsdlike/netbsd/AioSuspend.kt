package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int
