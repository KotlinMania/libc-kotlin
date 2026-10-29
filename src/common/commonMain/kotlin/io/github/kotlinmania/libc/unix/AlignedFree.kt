package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

/** Releases an aligned allocation, including an address reconstructed after an FFI round trip. */
public expect fun alignedFree(p: COpaquePointer?): Unit
