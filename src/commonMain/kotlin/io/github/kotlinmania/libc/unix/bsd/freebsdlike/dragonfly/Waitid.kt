package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT

public expect fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int
