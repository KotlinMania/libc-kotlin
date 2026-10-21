package io.github.kotlinmania.libc

public fun interface SignalRestorer {
    public operator fun invoke(): Unit
}

public fun interface SignalHandler {
    public operator fun invoke(signal: Int): Unit
}
