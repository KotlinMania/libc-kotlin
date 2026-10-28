package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun listen(socket: Int, backlog: Int): Int
