package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.COpaquePointer

public actual fun pthreadIntrospectionHookInstall(hook: PthreadIntrospectionHookT): PthreadIntrospectionHookT =
    js("require('@kotlinmania/libc-native-bindings').pthreadIntrospectionHookInstall(hook)") as PthreadIntrospectionHookT

public actual fun pthreadIntrospectionSetspecificNp(thread: PthreadT, key: PthreadKeyT, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadIntrospectionSetspecificNp(thread, key, value?.value ?: 0L)") as CInt

public actual fun pthreadIntrospectionGetspecificNp(thread: PthreadT, key: PthreadKeyT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').pthreadIntrospectionGetspecificNp(thread, key)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }
