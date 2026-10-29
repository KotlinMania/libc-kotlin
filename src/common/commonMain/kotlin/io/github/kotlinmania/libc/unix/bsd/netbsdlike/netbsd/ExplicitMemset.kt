package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun explicitMemset(b: COpaquePointer?, c: Int, len: ULong)
