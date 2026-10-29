package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun sendfile64(outFd: Int, inFd: Int, offset: Long?, count: ULong): Long
