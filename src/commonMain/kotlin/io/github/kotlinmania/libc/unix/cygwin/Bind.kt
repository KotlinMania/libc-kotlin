package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun bind(socket: Int, address: Sockaddr?, addressLen: Int): Int
