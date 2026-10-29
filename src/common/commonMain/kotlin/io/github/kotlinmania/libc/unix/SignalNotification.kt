package io.github.kotlinmania.libc.unix

public fun interface SignalNotification {
    public operator fun invoke(value: Sigval): Unit
}
