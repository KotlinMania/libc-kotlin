package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrGetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short?): Int
