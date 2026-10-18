package io.github.kotlinmania.libc.unix.linuxlike.android
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64

public expect fun getrlimit64(resource: Int, rlim: Rlimit64?): Int
