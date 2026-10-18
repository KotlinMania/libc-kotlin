package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64

public expect fun getrlimit64(resource: UInt, rlim: Rlimit64?): Int
