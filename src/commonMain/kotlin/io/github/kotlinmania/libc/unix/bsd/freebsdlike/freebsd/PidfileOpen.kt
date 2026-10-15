package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun pidfileOpen(path: String?, mode: UInt, pidptr: Int?): Pidfh?
