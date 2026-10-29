package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.COpaquePointer

public fun interface PthreadIntrospectionHook {
    public operator fun invoke(event: UInt, thread: ULong, address: COpaquePointer?, size: ULong): Unit
}
