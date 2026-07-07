// port-lint: source windows/msvc/mod.rs
package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*

public const val EOTHER: CInt = 131

public expect fun stricmp(s1: String?, s2: String?): CInt

public expect fun strnicmp(s1: String?, s2: String?, n: ULong): CInt

public expect fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, count: ULong): COpaquePointer?
