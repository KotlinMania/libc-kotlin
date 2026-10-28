package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun setpriority(which: UInt, who: UInt, prio: Int): Int
