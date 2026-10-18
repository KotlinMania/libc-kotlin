package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun setresgid(rgid: UInt, egid: UInt, sgid: UInt): Int
