package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dlopen(filename, flag)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dlclose(handle?.value ?: 0L)") as CInt

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dlsym(handle?.value ?: 0L, symbol)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlerror(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dlerror()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }
