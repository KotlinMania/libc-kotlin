package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun getfh(path: String?, fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?): Int
