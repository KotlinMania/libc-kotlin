package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun schedGetPriorityMax(policy: Int): Int
