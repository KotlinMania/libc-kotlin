package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public actual fun shutdown(socket: Int, how: Int): Int =
    throw UnsupportedOperationException("shutdown is not available on Windows (mingwX64)")

public actual fun socket(domain: Int, type: Int, protocol: Int): Int =
    throw UnsupportedOperationException("socket is not available on Windows (mingwX64)")
