package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun munlock(addr: COpaquePointer?, len: ULong): Int
