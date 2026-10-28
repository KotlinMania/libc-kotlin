package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public fun align(p: ULong, b: ULong): ULong = (p + b - 1uL) and (b - 1uL).inv()
