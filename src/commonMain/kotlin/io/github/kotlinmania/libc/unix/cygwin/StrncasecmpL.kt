package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun strncasecmpL(s1: String?, s2: String?, n: ULong, loc: io.github.kotlinmania.libc.COpaquePointer?): Int
