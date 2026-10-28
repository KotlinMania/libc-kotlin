package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: Int?): Int
