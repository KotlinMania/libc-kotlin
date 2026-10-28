package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun poll(fds: Pollfd?, nfds: UInt, timeout: Int): Int
