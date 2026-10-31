package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.internal.RawLibc

public actual fun errnoLocation(): Int? = RawLibc.errno()

internal actual fun setErrnoValue(value: Int): Unit =
    throw UnsupportedOperationException("setErrno requires N-API addon")
