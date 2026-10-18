package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT

import io.github.kotlinmania.libc.*

public expect fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int
