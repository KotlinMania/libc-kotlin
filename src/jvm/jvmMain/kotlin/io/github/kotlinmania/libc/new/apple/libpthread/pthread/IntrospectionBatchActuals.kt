// port-lint: source Introspection.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*

public actual fun pthreadIntrospectionSetspecificNp(thread: ULong, key: Int, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadIntrospectionSetspecificNp not available on JVM — no C library access")

public actual fun pthreadIntrospectionGetspecificNp(thread: ULong, key: Int): COpaquePointer? =
    throw UnsupportedOperationException("pthreadIntrospectionGetspecificNp not available on JVM — no C library access")
