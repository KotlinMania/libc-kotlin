package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public expect fun sysCheckpoint(tpe: Int, fd: Int, pid: Int, retval: Int): Int
