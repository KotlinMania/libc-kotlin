package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun setpriority(which: UInt, who: UInt, prio: Int): Int
