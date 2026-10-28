package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetsigdefault(attr: ULong?, default: SigsetT?): Int
