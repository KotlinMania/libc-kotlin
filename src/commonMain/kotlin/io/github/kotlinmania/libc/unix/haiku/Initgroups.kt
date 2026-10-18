package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun initgroups(name: String?, basegid: UInt): Int
