package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrGetstacksize(attr: io.github.kotlinmania.libc.COpaquePointer?, stacksize: ULong?): Int
