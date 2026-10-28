package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrGetinheritsched(attr: io.github.kotlinmania.libc.COpaquePointer?, inheritsched: Int?): Int
