package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun posixMemalign(a: COpaquePointer?, b: ULong, c: ULong): Int
