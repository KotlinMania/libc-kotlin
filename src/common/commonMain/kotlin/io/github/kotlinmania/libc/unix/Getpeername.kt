package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

public expect fun getpeername(socket: Int, address: Sockaddr?, addressLen: UInt?): Int
