package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun strtoll(s: String?, endp: COpaquePointer?, base: Int): Long
