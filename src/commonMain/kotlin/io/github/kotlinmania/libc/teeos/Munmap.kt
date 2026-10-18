package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun munmap(addr: COpaquePointer?, len: ULong): Int
