package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, pgroup: Int): Int
