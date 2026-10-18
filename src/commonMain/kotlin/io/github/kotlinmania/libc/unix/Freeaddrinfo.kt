package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.unix.linuxlike.Addrinfo

import io.github.kotlinmania.libc.*

public expect fun freeaddrinfo(res: Addrinfo?)
