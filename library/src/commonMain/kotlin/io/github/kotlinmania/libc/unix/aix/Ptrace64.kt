package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun ptrace64(request: Int, id: Long, addr: Long, data: Int, buff: Int?): Int
