package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.Statfs

import io.github.kotlinmania.libc.*

public expect fun statfs(path: String?, buf: Statfs?): Int
