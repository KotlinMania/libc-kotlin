package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.COpaquePointer

internal object IntrospectionRawLibc {
    external fun pthreadIntrospectionHookInstall(hook: Long): Long
    external fun pthreadIntrospectionSetspecificNp(thread: Long, key: Long, value: Long): Int
    external fun pthreadIntrospectionGetspecificNp(thread: Long, key: Long): Long?
}

public actual fun pthreadIntrospectionHookInstall(hook: PthreadIntrospectionHookT): PthreadIntrospectionHookT =
    IntrospectionRawLibc.pthreadIntrospectionHookInstall(hook)

public actual fun pthreadIntrospectionSetspecificNp(thread: PthreadT, key: PthreadKeyT, value: COpaquePointer?): CInt =
    IntrospectionRawLibc.pthreadIntrospectionSetspecificNp(thread, key, value?.value ?: 0L)

public actual fun pthreadIntrospectionGetspecificNp(thread: PthreadT, key: PthreadKeyT): COpaquePointer? =
    IntrospectionRawLibc.pthreadIntrospectionGetspecificNp(thread, key).let { if (it == 0L) null else COpaquePointer(it) }
