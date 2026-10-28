package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: Int): Int
