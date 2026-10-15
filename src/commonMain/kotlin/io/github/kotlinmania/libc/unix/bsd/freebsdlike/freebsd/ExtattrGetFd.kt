package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun extattrGetFd(fd: Int, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long
