package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun getfhat(fd: Int, path: String?, fhp: Fhandle?, flag: Int): Int
