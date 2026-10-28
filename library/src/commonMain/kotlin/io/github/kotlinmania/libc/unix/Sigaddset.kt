package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun sigaddset(set: ULong?, signum: Int): Int
