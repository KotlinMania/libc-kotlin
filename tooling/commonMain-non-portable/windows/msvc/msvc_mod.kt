// port-lint: source windows/msvc/msvc_mod.rs
package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

// POSIX Supplement (from errno.h)
// This particular error code is only currently available in msvc toolchain
public val EOTHER: CInt = 131

public expect fun stricmp(s1: String?, s2: String?): CInt

public expect fun strnicmp(s1: String?, s2: String?, n: SizeT): CInt

public expect fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, count: SizeT): COpaquePointer?
