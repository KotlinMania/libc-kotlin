package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.unix.bsd.Sockaddr

import io.github.kotlinmania.libc.*

public expect fun sctpBindx(s: Int, addrs: Sockaddr?, num: Int, tpe: Int): Int
