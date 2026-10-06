// port-lint: source Errno.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation not available on WASI — no C library access")

public actual fun errno(): CInt? =
    throw UnsupportedOperationException("errno not available on WASI — no C library access")

public actual fun setErrno(value: CInt): Unit =
    throw UnsupportedOperationException("setErrno not available on WASI — no C library access")
