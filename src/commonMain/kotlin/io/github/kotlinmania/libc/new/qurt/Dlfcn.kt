// port-lint: source new/qurt/dlfcn.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

/**
 * Header: `dlfcn.h`.
 */

public const val RTLD_LAZY: CInt = 1
public const val RTLD_NOW: CInt = 2
public const val RTLD_GLOBAL: CInt = 0x100
public const val RTLD_LOCAL: CInt = 0x200

public const val DL_LAZY: CInt = RTLD_LAZY

// RTLD_NEXT / RTLD_DEFAULT / RTLD_SELF are the sentinel pointer values
// `-1/-2/-3 as *mut c_void`; integer-to-pointer constants cannot be expressed
// in common Kotlin.

public expect fun dlopen(filename: String?, flag: CInt): COpaquePointer?

public expect fun dlclose(handle: COpaquePointer?): CInt

public expect fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer?

public expect fun dlerror(): String?
