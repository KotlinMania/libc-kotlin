package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun strtoul(s: String?, p: COpaquePointer?, base: Int): ULong
