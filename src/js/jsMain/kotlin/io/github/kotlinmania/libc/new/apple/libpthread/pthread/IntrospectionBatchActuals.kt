package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*

public actual fun pthreadIntrospectionSetspecificNp(thread: ULong, key: Int, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadIntrospectionSetspecificNp requires N-API addon")

public actual fun pthreadIntrospectionGetspecificNp(thread: ULong, key: Int): COpaquePointer? =
    throw UnsupportedOperationException("pthreadIntrospectionGetspecificNp requires N-API addon")

public actual fun pthreadIntrospectionHookInstall(hook: PthreadIntrospectionHook?): PthreadIntrospectionHook? =
    throw UnsupportedOperationException("pthreadIntrospectionHookInstall requires N-API addon")
