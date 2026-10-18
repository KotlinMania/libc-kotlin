package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun sigwait(set: ULong?, sig: Int?): Int
