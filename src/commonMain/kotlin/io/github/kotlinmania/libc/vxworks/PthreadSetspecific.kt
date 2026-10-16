package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadSetspecific(key: ULong, value: COpaquePointer?): Int
