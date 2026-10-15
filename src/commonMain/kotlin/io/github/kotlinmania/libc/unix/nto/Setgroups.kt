package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun setgroups(ngroups: Int, ptr: UInt?): Int
