// port-lint: source Stat.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt.sys
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.qurt.Stat
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun stat(pathname: String?, statbuf: Stat?): Int =
    throw UnsupportedOperationException("stat requires manual FFI bridge — not yet implemented")

public actual fun fstat(fd: Int, statbuf: Stat?): Int =
    throw UnsupportedOperationException("fstat requires manual FFI bridge — not yet implemented")
