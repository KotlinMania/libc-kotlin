package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): Int
