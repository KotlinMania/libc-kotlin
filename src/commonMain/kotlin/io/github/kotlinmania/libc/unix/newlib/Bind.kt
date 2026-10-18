package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public expect fun bind(fd: Int, addr: Sockaddr?, len: UInt): Int
