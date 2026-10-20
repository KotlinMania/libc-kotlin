package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.COpaquePointer

public fun interface ContextCoroutine {
    public operator fun invoke(context: UcontextT?, argument: COpaquePointer?): Unit
}
