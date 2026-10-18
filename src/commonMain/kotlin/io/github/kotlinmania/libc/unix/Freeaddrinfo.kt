package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Addrinfo

public expect fun freeaddrinfo(res: Addrinfo?)
