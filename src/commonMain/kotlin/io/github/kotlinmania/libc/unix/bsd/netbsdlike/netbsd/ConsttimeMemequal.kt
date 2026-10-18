package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun consttimeMemequal(a: COpaquePointer?, b: COpaquePointer?, len: ULong): Int
