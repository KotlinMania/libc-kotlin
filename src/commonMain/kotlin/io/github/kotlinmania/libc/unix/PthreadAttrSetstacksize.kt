package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSetstacksize(attr: io.github.kotlinmania.libc.COpaquePointer?, stackSize: ULong): Int
