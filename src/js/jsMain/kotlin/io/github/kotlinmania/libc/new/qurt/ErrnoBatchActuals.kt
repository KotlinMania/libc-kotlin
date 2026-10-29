// port-lint: source Errno.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation requires N-API addon")

public actual fun errno(): Int? =
    throw UnsupportedOperationException("errno requires N-API addon")

public actual fun setErrno(value: Int): Unit =
    throw UnsupportedOperationException("setErrno requires N-API addon")
