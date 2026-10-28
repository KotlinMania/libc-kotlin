package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun pthreadSetspecific(key: Int, value: COpaquePointer?): Int
