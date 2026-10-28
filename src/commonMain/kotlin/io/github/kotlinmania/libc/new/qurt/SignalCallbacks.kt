package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

public fun interface SignalNotification {
    public operator fun invoke(value: Sigval): Unit
}

public fun interface SignalAction {
    public operator fun invoke(signal: Int, info: SiginfoT?, context: COpaquePointer?): Unit
}
