package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun prlimit(pid: Int, resource: UInt, newLimit: Rlimit?, oldLimit: Rlimit?): Int
