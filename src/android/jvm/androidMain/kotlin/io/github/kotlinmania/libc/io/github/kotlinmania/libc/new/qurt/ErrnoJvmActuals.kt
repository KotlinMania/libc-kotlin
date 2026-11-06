package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

internal object ErrnoRawLibc {
    external fun errnoLocation(): Long?
}

public actual fun errnoLocation(): CInt? =
    ErrnoRawLibc.errnoLocation()
