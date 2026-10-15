package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun extattrListFd(fd: Int, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long
