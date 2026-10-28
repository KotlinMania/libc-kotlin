package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.SockaddrUn

public expect fun sunLen(s: SockaddrUn): ULong
