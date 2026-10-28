package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int
