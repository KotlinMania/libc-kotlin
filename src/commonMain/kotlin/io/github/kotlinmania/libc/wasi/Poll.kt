package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun poll(fds: Pollfd?, nfds: ULong, timeout: Int): Int
