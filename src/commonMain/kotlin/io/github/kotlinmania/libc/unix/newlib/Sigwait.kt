package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public expect fun sigwait(set: SigsetT?, sig: Int?): Int
