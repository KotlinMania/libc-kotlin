package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.internal.RawLibc

public actual fun errnoLocation(): Int? = RawLibc.errno()

internal actual fun setErrnoValue(value: Int): Unit =
    throw UnsupportedOperationException("setErrno not available on JVM — no C library access")
