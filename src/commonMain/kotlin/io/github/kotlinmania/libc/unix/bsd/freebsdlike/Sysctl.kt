package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun sysctl(name: Int?, namelen: UInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int
