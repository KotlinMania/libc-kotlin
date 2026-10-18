package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.Statfs

public expect fun getfsstat(buf: Statfs?, bufsize: Long, mode: Int): Int
