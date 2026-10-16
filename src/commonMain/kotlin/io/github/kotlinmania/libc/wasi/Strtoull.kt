package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun strtoull(s: String?, endp: COpaquePointer?, base: Int): ULong
