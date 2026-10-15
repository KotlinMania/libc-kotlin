package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer?
