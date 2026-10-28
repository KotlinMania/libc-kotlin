package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.COpaquePointer

public fun interface GlobErrorHandler {
    public operator fun invoke(path: String?, error: Int): Int
}

public fun interface ThreadExitHandler {
    public operator fun invoke(value: COpaquePointer?): Unit
}
