package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

public expect fun accept(socket: Int, address: Sockaddr?, addressLen: UInt?): Int
