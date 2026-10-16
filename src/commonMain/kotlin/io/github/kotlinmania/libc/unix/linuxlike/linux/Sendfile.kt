package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun sendfile(outFd: Int, inFd: Int, offset: Long?, count: ULong): Long
