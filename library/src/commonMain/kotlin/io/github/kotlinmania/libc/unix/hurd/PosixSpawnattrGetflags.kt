package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: Short?): Int
