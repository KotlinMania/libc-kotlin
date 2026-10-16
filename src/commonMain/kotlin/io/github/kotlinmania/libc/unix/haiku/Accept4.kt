package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun accept4(socket: Int, address: Sockaddr?, addressLength: UInt?, flags: Int): Int
