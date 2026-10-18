package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun extattrDeleteFd(fd: Int, attrnamespace: Int, attrname: String?): Int
