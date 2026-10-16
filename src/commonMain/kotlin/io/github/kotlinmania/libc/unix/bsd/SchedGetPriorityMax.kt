package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public expect fun schedGetPriorityMax(policy: Int): Int
