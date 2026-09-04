// port-lint: source Stat.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*

public actual fun stat(pathname: String?, statbuf: Stat?): CInt =
    throw UnsupportedOperationException("stat requires N-API addon")

public actual fun fstat(fd: CInt, statbuf: Stat?): CInt =
    throw UnsupportedOperationException("fstat requires N-API addon")

