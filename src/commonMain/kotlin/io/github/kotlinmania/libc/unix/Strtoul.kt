package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun strtoul(s: COpaquePointer?, endp: COpaquePointer?, base: Int): ULong
