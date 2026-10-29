package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun connect(socket: Int, address: Sockaddr?, len: UInt): Int
