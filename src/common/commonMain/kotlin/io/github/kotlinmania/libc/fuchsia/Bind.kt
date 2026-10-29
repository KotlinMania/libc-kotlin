package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int
