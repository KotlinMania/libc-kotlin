package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun cpusetGetid(level: Int, which: Int, id: UInt, setid: Int?): Int
