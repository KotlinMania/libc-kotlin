package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun setpriority(which: Int, who: UInt, prio: Int): Int
