// port-lint: source libc/src/new/qurt/dlfcn.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val RTLD_LAZY: CInt = 1
public const val RTLD_NOW: CInt = 2
public const val RTLD_GLOBAL: CInt = 0x100
public const val RTLD_LOCAL: CInt = 0x200
public const val DL_LAZY: CInt = RTLD_LAZY

public fun dlopen(filename: String?, flag: CInt): COpaquePointer? = null

public fun dlclose(handle: COpaquePointer?): CInt = -1

public fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? = null

public fun dlerror(): String? = null
