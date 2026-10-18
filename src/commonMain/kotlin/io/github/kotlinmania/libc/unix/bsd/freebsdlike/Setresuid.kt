package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun setresuid(ruid: UInt, euid: UInt, suid: UInt): Int
