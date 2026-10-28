package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun read(fd: Int, buf: COpaquePointer?, count: ULong): Long
