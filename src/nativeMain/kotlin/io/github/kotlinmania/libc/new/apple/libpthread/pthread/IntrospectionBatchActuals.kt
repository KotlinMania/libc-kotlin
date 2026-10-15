// port-lint: source Introspection.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun pthreadIntrospectionSetspecificNp(thread: ULong, key: Int, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadIntrospectionSetspecificNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadIntrospectionGetspecificNp(thread: ULong, key: Int): COpaquePointer? =
    throw UnsupportedOperationException("pthreadIntrospectionGetspecificNp requires manual FFI bridge — not yet implemented")
