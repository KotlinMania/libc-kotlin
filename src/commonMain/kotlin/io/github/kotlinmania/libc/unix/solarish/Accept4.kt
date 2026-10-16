package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun accept4(fd: Int, address: Sockaddr?, addressLen: UInt?, flags: Int): Int
