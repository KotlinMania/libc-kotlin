package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun capIoctlsGet(fd: Int, cmds: ULong?, maxcmds: ULong): Long
