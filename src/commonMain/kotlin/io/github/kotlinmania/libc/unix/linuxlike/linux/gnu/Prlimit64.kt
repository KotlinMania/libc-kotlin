package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64

public expect fun prlimit64(pid: Int, resource: UInt, newLimit: Rlimit64?, oldLimit: Rlimit64?): Int
