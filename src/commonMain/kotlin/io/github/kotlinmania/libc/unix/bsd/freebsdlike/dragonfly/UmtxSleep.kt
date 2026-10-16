package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public expect fun umtxSleep(ptr: Int?, value: Int, timeout: Int): Int
