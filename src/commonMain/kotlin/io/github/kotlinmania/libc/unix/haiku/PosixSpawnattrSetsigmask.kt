package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, sigmask: ULong?): Int
