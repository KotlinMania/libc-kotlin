package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrGetflags(attr: ULong?, flags: Short?): Int
