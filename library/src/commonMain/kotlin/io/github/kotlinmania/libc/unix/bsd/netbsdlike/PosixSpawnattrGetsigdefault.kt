package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrGetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, default: ULong?): Int
