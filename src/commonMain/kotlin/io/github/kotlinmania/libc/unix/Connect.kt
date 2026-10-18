package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

public expect fun connect(socket: Int, address: Sockaddr?, len: UInt): Int
