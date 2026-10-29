package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): Int
