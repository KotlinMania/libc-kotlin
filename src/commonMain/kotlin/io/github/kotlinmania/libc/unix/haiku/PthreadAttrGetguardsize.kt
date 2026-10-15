package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong?): Int
