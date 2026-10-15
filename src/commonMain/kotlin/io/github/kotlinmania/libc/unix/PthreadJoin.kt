package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun pthreadJoin(native: ULong, value: COpaquePointer?): Int
