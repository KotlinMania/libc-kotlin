// port-lint: source windows/msvc/mod.rs
package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*

public const val EOTHER: CInt = 131

public fun stricmp(s1: String?, s2: String?): CInt = -1

public fun strnicmp(s1: String?, s2: String?, n: ULong): CInt = -1

public fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, count: ULong): COpaquePointer? = null
