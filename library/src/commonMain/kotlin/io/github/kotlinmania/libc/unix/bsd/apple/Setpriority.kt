package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun setpriority(which: Int, who: UInt, prio: Int): Int
