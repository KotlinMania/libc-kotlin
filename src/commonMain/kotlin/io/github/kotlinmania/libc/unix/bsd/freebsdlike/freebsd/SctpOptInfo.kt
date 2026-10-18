package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun sctpOptInfo(s: Int, id: UInt, opt: Int, arg: COpaquePointer?, size: UInt?): Int
