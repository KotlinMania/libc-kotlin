package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.Passwd

public expect fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int
