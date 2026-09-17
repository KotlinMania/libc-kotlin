// port-lint: source Stat.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*

public actual fun stat(pathname: String?, statbuf: Stat?): CInt =
    throw UnsupportedOperationException("stat not available on Android host — use androidNative target for FFI")

public actual fun fstat(fd: CInt, statbuf: Stat?): CInt =
    throw UnsupportedOperationException("fstat not available on Android host — use androidNative target for FFI")

