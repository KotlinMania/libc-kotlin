package io.github.kotlinmania.libc

internal actual fun macroLayoutValue(index: Int): ULong =
    error("Real C ABI layout fixture is not linked for WASI (probe $index); this target has not passed macro parity")
