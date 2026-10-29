package io.github.kotlinmania.libc.unix.newlib
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

public expect fun bind(fd: Int, addr: Sockaddr?, len: UInt): Int
