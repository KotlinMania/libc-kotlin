package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public expect fun setutxdb(type: UInt, file: String?): Int
