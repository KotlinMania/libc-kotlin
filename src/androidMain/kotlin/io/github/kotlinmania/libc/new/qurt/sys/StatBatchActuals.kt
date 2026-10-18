// port-lint: source Stat.rs
package io.github.kotlinmania.libc.new.qurt.sys
import io.github.kotlinmania.libc.new.qurt.Stat

import io.github.kotlinmania.libc.*

public actual fun stat(pathname: String?, statbuf: Stat?): Int =
    throw UnsupportedOperationException("stat not available on Android host — use androidNative target for FFI")

public actual fun fstat(fd: Int, statbuf: Stat?): Int =
    throw UnsupportedOperationException("fstat not available on Android host — use androidNative target for FFI")
