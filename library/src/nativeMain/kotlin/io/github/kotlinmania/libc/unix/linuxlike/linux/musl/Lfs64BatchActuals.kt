// port-lint: source Lfs64.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires FFI bridge")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires FFI bridge")
