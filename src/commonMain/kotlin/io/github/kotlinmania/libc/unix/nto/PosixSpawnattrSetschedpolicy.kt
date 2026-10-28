package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetschedpolicy(attr: ULong?, flags: Int): Int
