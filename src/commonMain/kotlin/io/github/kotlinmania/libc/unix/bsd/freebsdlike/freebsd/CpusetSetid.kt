package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun cpusetSetid(which: Int, id: UInt, setid: Int): Int
