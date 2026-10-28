package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun strtoull(s: String?, endp: COpaquePointer?, base: Int): ULong
