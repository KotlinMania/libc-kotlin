package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun capIoctlsLimit(fd: Int, cmds: ULong?, ncmds: ULong): Int
