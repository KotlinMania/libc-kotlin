package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun ptrace(request: Int, pid: Int, addr: String?, data: Int): Int
