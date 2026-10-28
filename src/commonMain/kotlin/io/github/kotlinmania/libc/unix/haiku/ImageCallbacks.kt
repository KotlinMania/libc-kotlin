package io.github.kotlinmania.libc.unix.haiku

public fun interface ImageInitializer {
    public operator fun invoke(): Unit
}

public fun interface ImageTerminator {
    public operator fun invoke(): Unit
}
