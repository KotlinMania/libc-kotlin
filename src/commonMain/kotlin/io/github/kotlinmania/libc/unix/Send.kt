package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun send(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long
