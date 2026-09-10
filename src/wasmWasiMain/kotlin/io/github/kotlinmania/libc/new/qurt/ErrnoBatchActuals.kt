// port-lint: source Errno.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation not available on WASI — no C library access")

