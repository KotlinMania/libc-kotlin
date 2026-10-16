package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: ULong?): Int
