package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun prlimit64(pid: Int, resource: Int, newLimit: Rlimit64?, oldLimit: Rlimit64?): Int
