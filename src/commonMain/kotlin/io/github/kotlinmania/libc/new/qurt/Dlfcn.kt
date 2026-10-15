// port-lint: source new/qurt/dlfcn.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val RTLD_LAZY: Int = 1
public const val RTLD_NOW: Int = 2
public const val RTLD_GLOBAL: Int = 0x100
public const val RTLD_LOCAL: Int = 0x200
public const val DL_LAZY: Int = RTLD_LAZY

public expect fun dlopen(filename: String?, flag: Int): COpaquePointer?

public expect fun dlclose(handle: COpaquePointer?): Int

public expect fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer?

public expect fun dlerror(): String?
