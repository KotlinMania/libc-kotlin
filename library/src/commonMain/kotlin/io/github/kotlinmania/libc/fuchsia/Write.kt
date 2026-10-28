package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun write(fd: Int, buf: COpaquePointer?, count: ULong): Long
