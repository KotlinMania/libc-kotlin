package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSetdetachstate(attr: io.github.kotlinmania.libc.COpaquePointer?, state: Int): Int
