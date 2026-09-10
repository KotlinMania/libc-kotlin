// port-lint: source Introspection.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*

public actual fun pthreadIntrospectionSetspecificNp(thread: PthreadT, key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadIntrospectionSetspecificNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadIntrospectionGetspecificNp(thread: PthreadT, key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadIntrospectionGetspecificNp not available on Android host — use androidNative target for FFI")

