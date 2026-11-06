package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.COpaquePointer

public actual fun stricmp(s1: String?, s2: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').stricmp(s1, s2)") as CInt

public actual fun strnicmp(s1: String?, s2: String?, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strnicmp(s1, s2, n)") as CInt

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, count: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memccpy(dest?.value ?: 0L, src?.value ?: 0L, c, count)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }
