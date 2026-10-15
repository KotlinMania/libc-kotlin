// port-lint: source Stat.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*

public actual fun stat(pathname: String?, statbuf: Stat?): Int =
    throw UnsupportedOperationException("stat requires N-API addon")

public actual fun fstat(fd: Int, statbuf: Stat?): Int =
    throw UnsupportedOperationException("fstat requires N-API addon")
