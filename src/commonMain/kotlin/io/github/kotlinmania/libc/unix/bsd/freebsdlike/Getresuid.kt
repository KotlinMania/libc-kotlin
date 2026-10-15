package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): Int
