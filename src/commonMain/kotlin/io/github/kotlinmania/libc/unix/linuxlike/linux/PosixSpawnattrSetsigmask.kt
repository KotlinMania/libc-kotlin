package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: ULong?): Int
