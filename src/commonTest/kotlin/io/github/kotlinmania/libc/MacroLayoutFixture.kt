package io.github.kotlinmania.libc

/** Reads addresses, extent and compiler offsets from the actual ABI fixture. */
internal expect fun macroLayoutValue(index: Int): ULong
