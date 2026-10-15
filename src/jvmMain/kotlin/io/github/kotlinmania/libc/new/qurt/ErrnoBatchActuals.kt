// port-lint: source Errno.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation not available on JVM — no C library access")

public actual fun errno(): Int? =
    throw UnsupportedOperationException("errno not available on JVM — no C library access")

public actual fun setErrno(value: Int): Unit =
    throw UnsupportedOperationException("setErrno not available on JVM — no C library access")
