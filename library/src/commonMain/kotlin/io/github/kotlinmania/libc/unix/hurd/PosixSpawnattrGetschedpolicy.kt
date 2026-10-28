package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: Int?): Int
