package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.windows.SizeT

public expect fun stricmp(s1: String?, s2: String?): CInt

public expect fun strnicmp(s1: String?, s2: String?, n: SizeT): CInt

public expect fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, count: SizeT): COpaquePointer?
