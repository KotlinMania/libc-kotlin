package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: ULong?): Int
