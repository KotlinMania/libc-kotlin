package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun initgroups(user: String?, basegroup: Int): Int
