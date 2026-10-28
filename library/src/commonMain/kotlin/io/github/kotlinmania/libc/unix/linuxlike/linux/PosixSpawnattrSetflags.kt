package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: Short): Int
