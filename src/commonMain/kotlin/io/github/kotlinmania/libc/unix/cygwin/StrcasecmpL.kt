package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun strcasecmpL(s1: String?, s2: String?, loc: io.github.kotlinmania.libc.COpaquePointer?): Int
