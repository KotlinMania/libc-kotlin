package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun procctl(idtype: UInt, id: UInt, cmd: Int, data: COpaquePointer?): Int
