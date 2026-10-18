package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*

public expect fun eventfd(initval: UInt, flags: Int): Int
