package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun strtol(s: COpaquePointer?, endp: COpaquePointer?, base: Int): Long
