package io.github.kotlinmania.libc.unix.linuxlike.linux.musl
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Rlimit

public expect fun prlimit(pid: Int, resource: Int, newLimit: Rlimit?, oldLimit: Rlimit?): Int
