package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun getsockname(socket: Int, address: Sockaddr?, addressLen: UInt?): Int
