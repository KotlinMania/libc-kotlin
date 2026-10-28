package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun initgroups(user: String?, group: UInt): Int
