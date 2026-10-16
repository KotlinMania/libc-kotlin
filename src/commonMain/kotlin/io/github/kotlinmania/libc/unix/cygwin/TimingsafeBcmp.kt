package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): Int
