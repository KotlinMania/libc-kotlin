package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

import io.github.kotlinmania.libc.*

public expect fun cpusetSetdomain(level: Int, which: Int, id: UInt, setsize: ULong, mask: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13.CAnonymousDomainset?, policy: Int): Int
