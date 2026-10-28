package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun pthreadSetspecific(key: UInt, value: COpaquePointer?): Int
