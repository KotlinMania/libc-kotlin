package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun setpriority(which: Int, who: Int, priority: Int): Int
