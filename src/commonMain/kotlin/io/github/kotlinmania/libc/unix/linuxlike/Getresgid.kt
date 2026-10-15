package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun getresgid(rgid: UInt?, egid: UInt?, sgid: UInt?): Int
