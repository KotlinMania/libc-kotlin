package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrGetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, pgroup: Int?): Int
