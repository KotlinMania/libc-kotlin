package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun devnameR(dev: ULong, mode: UInt, buf: String?, len: Int): String?
