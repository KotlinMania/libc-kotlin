package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.COpaquePointer

internal object MsvcModRawLibc {
    external fun stricmp(s1: String?, s2: String?): Int
    external fun strnicmp(s1: String?, s2: String?, n: Long): Int
    external fun memccpy(dest: Long, src: Long, c: Int, count: Long): Long?
}

public actual fun stricmp(s1: String?, s2: String?): CInt =
    MsvcModRawLibc.stricmp(s1, s2)

public actual fun strnicmp(s1: String?, s2: String?, n: SizeT): CInt =
    MsvcModRawLibc.strnicmp(s1, s2, n)

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, count: SizeT): COpaquePointer? =
    MsvcModRawLibc.memccpy(dest?.value ?: 0L, src?.value ?: 0L, c, count).let { if (it == 0L) null else COpaquePointer(it) }
