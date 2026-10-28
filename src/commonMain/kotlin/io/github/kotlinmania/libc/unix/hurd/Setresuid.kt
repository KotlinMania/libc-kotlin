package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun setresuid(ruid: UInt, euid: UInt, suid: UInt): Int
