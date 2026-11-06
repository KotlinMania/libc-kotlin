// port-lint: source new/qurt/stdlib.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.LibcDynamicFfi

// Header: `stdlib.h`

public fun interface AtexitFunctionCallback {
    public operator fun invoke()
}

public fun interface QsortComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?): CInt
}

// Exit status constants
public val EXIT_SUCCESS: CInt = 0

public val EXIT_FAILURE: CInt = 1

// Maximum values
public val RAND_MAX: CInt = 32767

// Memory management
public fun malloc(size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("malloc", -1, longArrayOf(size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun calloc(nmemb: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("calloc", -1, longArrayOf(nmemb.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun realloc(ptr: COpaquePointer?, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("realloc", -1, longArrayOf(ptr?.value ?: 0L, size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun free(ptr: COpaquePointer?) {
    LibcDynamicFfi.invoke("free", -1, longArrayOf(ptr?.value ?: 0L))
}

// Process control
public fun abort(): Nothing {
    LibcDynamicFfi.invoke("abort", -1, longArrayOf())
    error("unreachable")
}

public fun exit(status: CInt): Nothing {
    LibcDynamicFfi.invoke("exit", -1, longArrayOf(status.toLong()))
    error("unreachable")
}

public fun atexit(function: AtexitFunctionCallback): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("atexit", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

// Environment
public fun getenv(name: String?): COpaquePointer? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getenv", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun setenv(name: String?, value: String?, overwrite: CInt): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    val __cstr_1 = if (value == null) 0L else LibcDynamicFfi.allocUtf8CString(value)
    try {
        return LibcDynamicFfi.invoke("setenv", -1, longArrayOf(__cstr_0, __cstr_1, overwrite.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun unsetenv(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("unsetenv", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// String/number conversion
public fun atoi(nptr: String?): CInt {
    val __cstr_0 = if (nptr == null) 0L else LibcDynamicFfi.allocUtf8CString(nptr)
    try {
        return LibcDynamicFfi.invoke("atoi", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atol(nptr: String?): CLong {
    val __cstr_0 = if (nptr == null) 0L else LibcDynamicFfi.allocUtf8CString(nptr)
    try {
        return LibcDynamicFfi.invoke("atol", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atoll(nptr: String?): CLonglong {
    val __cstr_0 = if (nptr == null) 0L else LibcDynamicFfi.allocUtf8CString(nptr)
    try {
        return LibcDynamicFfi.invoke("atoll", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong {
    val __cstr_0 = if (nptr == null) 0L else LibcDynamicFfi.allocUtf8CString(nptr)
    try {
        return LibcDynamicFfi.invoke("strtol", -1, longArrayOf(__cstr_0, endptr?.value ?: 0L, base.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlong {
    val __cstr_0 = if (nptr == null) 0L else LibcDynamicFfi.allocUtf8CString(nptr)
    try {
        return LibcDynamicFfi.invoke("strtoul", -1, longArrayOf(__cstr_0, endptr?.value ?: 0L, base.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLonglong {
    val __cstr_0 = if (nptr == null) 0L else LibcDynamicFfi.allocUtf8CString(nptr)
    try {
        return LibcDynamicFfi.invoke("strtoll", -1, longArrayOf(__cstr_0, endptr?.value ?: 0L, base.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlonglong {
    val __cstr_0 = if (nptr == null) 0L else LibcDynamicFfi.allocUtf8CString(nptr)
    try {
        return LibcDynamicFfi.invoke("strtoull", -1, longArrayOf(__cstr_0, endptr?.value ?: 0L, base.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtod(nptr: String?, endptr: COpaquePointer?): CDouble {
    val __cstr_0 = if (nptr == null) 0L else LibcDynamicFfi.allocUtf8CString(nptr)
    try {
        return LibcDynamicFfi.invokeFp("strtod", 0, false, longArrayOf(__cstr_0, endptr?.value ?: 0L))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtof(nptr: String?, endptr: COpaquePointer?): CFloat {
    val __cstr_0 = if (nptr == null) 0L else LibcDynamicFfi.allocUtf8CString(nptr)
    try {
        return LibcDynamicFfi.invokeFp("strtof", 0, true, longArrayOf(__cstr_0, endptr?.value ?: 0L)).toFloat()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// Random numbers
public fun rand(): CInt {
    return LibcDynamicFfi.invoke("rand", -1, longArrayOf()).toInt()
}

public fun srand(seed: CUint) {
    LibcDynamicFfi.invoke("srand", -1, longArrayOf(seed.toLong()))
}

// Searching and sorting
public fun qsort(base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback) {
    val __scratch_3 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("qsort", -1, longArrayOf(base?.value ?: 0L, nmemb.toLong(), size.toLong(), __scratch_3))
    } finally {
        if (__scratch_3 != 0L) LibcDynamicFfi.freeMem(__scratch_3)
    }
}

public fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): COpaquePointer? {
    val __scratch_4 = LibcDynamicFfi.allocZeroed(4096)
    try {
        val rawRet = LibcDynamicFfi.invoke("bsearch", -1, longArrayOf(key?.value ?: 0L, base?.value ?: 0L, nmemb.toLong(), size.toLong(), __scratch_4))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__scratch_4 != 0L) LibcDynamicFfi.freeMem(__scratch_4)
    }
}

// Integer arithmetic
public fun abs(j: CInt): CInt {
    return LibcDynamicFfi.invoke("abs", -1, longArrayOf(j.toLong())).toInt()
}

public fun labs(j: CLong): CLong {
    return LibcDynamicFfi.invoke("labs", -1, longArrayOf(j))
}

public fun llabs(j: CLonglong): CLonglong {
    return LibcDynamicFfi.invoke("llabs", -1, longArrayOf(j))
}

public fun div(numer: CInt, denom: CInt): DivT {
    LibcDynamicFfi.invoke("div", -1, longArrayOf(numer.toLong(), denom.toLong()))
    return null as DivT
}

public fun ldiv(numer: CLong, denom: CLong): LdivT {
    LibcDynamicFfi.invoke("ldiv", -1, longArrayOf(numer, denom))
    return null as LdivT
}

public fun lldiv(numer: CLonglong, denom: CLonglong): LldivT {
    LibcDynamicFfi.invoke("lldiv", -1, longArrayOf(numer, denom))
    return null as LldivT
}
