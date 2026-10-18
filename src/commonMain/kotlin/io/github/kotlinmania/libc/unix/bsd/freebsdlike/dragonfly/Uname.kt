package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly
import io.github.kotlinmania.libc.unix.bsd.Utsname

import io.github.kotlinmania.libc.*

public expect fun uname(buf: Utsname?): Int
