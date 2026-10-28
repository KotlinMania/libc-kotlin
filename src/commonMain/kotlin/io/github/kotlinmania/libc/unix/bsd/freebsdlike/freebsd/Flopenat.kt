package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun flopenat(fd: Int, path: String?, flags: Int, vararg args: Any?): Int
