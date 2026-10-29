package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun mlock(addr: COpaquePointer?, len: ULong): Int
