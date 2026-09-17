// port-lint: source Stdlib.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toLong
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import libc.cinterop.libc_labs
import libc.cinterop.libc_setenv
import libc.cinterop.libc_calloc
import libc.cinterop.libc_atoll
import libc.cinterop.libc_unsetenv
import libc.cinterop.libc_strtol
import libc.cinterop.libc_malloc
import libc.cinterop.libc_getenv
import libc.cinterop.libc_realloc
import libc.cinterop.libc_abs
import libc.cinterop.libc_llabs
import libc.cinterop.libc_atoi
import libc.cinterop.libc_rand
import libc.cinterop.libc_srand
import kotlinx.cinterop.CPointer
import libc.cinterop.libc_free

public actual fun malloc(size: ULong): COpaquePointer? =
    libc.cinterop.libc_malloc(size)?.let { COpaquePointer(it.toLong()) }
public actual fun calloc(nmemb: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_calloc(nmemb, size)?.let { COpaquePointer(it.toLong()) }
public actual fun realloc(ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    libc.cinterop.libc_realloc(ptr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }
public actual fun free(ptr: COpaquePointer?) {
    if (ptr == null) return
    val pPtr: CPointer<ByteVar>? = ptr.value.toCPointer()
    libc_free(pPtr)
}

public actual fun getenv(name: String?): String? {
    if (name == null) return null
    return libc.cinterop.libc_getenv(name)?.toKString()
}
public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt {
    if (name == null) return -1
    if (value == null) return -1
    return libc.cinterop.libc_setenv(name, value, overwrite)
}
public actual fun unsetenv(name: String?): CInt {
    if (name == null) return -1
    return libc.cinterop.libc_unsetenv(name)
}
public actual fun atoi(nptr: String?): CInt {
    if (nptr == null) return 0
    return libc.cinterop.libc_atoi(nptr)
}
public actual fun atol(nptr: String?): CLong {
    if (nptr == null) return 0
    return libc.cinterop.libc_atol(nptr)
}
public actual fun atoll(nptr: String?): CLongLong {
    if (nptr == null) return 0
    return libc.cinterop.libc_atoll(nptr)
}
public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong {
    if (nptr == null) return 0
    return libc.cinterop.libc_strtol(nptr, endptr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), base)
}
public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge — not yet implemented")

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll requires manual FFI bridge — not yet implemented")

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull requires manual FFI bridge — not yet implemented")

public actual fun rand(): CInt =
    libc.cinterop.libc_rand()
public actual fun srand(seed: CUInt): Unit {
    libc_srand(seed)
}

public actual fun abs(j: CInt): CInt =
    libc.cinterop.libc_abs(j)
public actual fun labs(j: CLong): CLong =
    libc.cinterop.libc_labs(j)
public actual fun llabs(j: CLongLong): CLongLong =
    libc.cinterop.libc_llabs(j)
public actual fun atexit(function: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atexit requires manual FFI bridge — not yet implemented")

public actual fun qsort(base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?) {
    throw UnsupportedOperationException("qsort requires manual FFI bridge — not yet implemented")
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch requires manual FFI bridge — not yet implemented")
