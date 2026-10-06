// port-lint: source Errno.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation requires N-API addon")

public actual fun errno(): CInt? =
    throw UnsupportedOperationException("errno requires N-API addon")

public actual fun setErrno(value: CInt): Unit =
    throw UnsupportedOperationException("setErrno requires N-API addon")
