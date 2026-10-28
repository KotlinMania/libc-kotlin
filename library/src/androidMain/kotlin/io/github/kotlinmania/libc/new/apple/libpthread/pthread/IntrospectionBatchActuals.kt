// port-lint: source Introspection.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*

public actual fun pthreadIntrospectionSetspecificNp(thread: ULong, key: Int, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadIntrospectionSetspecificNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadIntrospectionGetspecificNp(thread: ULong, key: Int): COpaquePointer? =
    throw UnsupportedOperationException("pthreadIntrospectionGetspecificNp not available on Android host — use androidNative target for FFI")
