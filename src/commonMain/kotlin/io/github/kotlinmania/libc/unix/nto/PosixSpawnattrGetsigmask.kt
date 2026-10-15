package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrGetsigmask(attr: ULong?, default: SigsetT?): Int
