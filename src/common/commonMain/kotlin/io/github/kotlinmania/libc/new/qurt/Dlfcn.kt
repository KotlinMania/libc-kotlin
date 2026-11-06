// port-lint: source new/qurt/dlfcn.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.LibcDynamicFfi

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

public fun dlopen(filename: String?, flag: CInt): COpaquePointer? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        val rawRet = LibcDynamicFfi.invoke("dlopen", -1, longArrayOf(__cstr_0, flag.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun dlclose(handle: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("dlclose", -1, longArrayOf(handle?.value ?: 0L)).toInt()
}

public fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? {
    val __cstr_1 = if (symbol == null) 0L else LibcDynamicFfi.allocUtf8CString(symbol)
    try {
        val rawRet = LibcDynamicFfi.invoke("dlsym", -1, longArrayOf(handle?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun dlerror(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("dlerror", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}
