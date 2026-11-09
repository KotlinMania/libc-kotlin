// port-lint: source new/qurt/dlfcn.rs
package io.github.kotlinmania.libc.new.qurt.dlfcn

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

// Header: `dlfcn.h`
//
// Dynamic linking functions and constants from Hexagon toolchain.

// Values for dlopen `mode`
public val RTLD_LAZY: CInt = 1

public val RTLD_NOW: CInt = 2

public val RTLD_GLOBAL: CInt = 0x100

public val RTLD_LOCAL: CInt = 0x200

// Compatibility constant
public val DL_LAZY: CInt = RTLD_LAZY

// Special handles
public val RTLD_NEXT: COpaquePointer? = COpaquePointer((-1).toLong())

public val RTLD_DEFAULT: COpaquePointer? = COpaquePointer((-2).toLong())

public val RTLD_SELF: COpaquePointer? = COpaquePointer((-3).toLong())

public expect fun dlopen(filename: String?, flag: CInt): COpaquePointer?

public expect fun dlclose(handle: COpaquePointer?): CInt

public expect fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer?

public expect fun dlerror(): COpaquePointer?
