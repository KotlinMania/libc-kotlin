package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    throw UnsupportedOperationException("shutdown is not available on Windows (mingwX64)")

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    throw UnsupportedOperationException("socket is not available on Windows (mingwX64)")
