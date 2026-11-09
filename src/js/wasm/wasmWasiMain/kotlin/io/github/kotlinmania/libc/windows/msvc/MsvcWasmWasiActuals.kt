@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.windows.SizeT

public actual fun stricmp(s1: String?, s2: String?): CInt =
    0

public actual fun strnicmp(s1: String?, s2: String?, n: SizeT): CInt =
    0

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, count: SizeT): COpaquePointer? =
    null
