package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun strtoul(s: String?, endp: COpaquePointer?, base: Int): ULong
