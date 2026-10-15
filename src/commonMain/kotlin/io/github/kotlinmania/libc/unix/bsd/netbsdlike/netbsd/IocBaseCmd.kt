package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public fun iocBaseCmd(x: UInt): UInt = x and (IOCPARM_MASK shl IOCPARM_SHIFT.toInt()).inv()
