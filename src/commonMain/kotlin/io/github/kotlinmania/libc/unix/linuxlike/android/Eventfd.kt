package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun eventfd(initval: UInt, flags: Int): Int
