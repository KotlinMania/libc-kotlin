package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun mallocx(size: ULong, flags: Int): COpaquePointer?
