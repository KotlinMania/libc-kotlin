package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int): Int
