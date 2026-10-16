package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun xuname(nmln: Int, buf: COpaquePointer?): Int
