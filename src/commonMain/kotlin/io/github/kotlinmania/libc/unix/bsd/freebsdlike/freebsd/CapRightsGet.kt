package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun capRightsGet(version: Int, fd: Int, rightsp: CapRightsT?): Int
