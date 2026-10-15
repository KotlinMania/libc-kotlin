// port-lint: source Fcntl.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun open(pathname: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open not available on Android host — use androidNative target for FFI")

public actual fun creat(pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("creat not available on Android host — use androidNative target for FFI")

public actual fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("fcntl not available on Android host — use androidNative target for FFI")
