// port-lint: source Stdlib.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import kotlinx.cinterop.toLong
import libc.cinterop.libc_abs
import libc.cinterop.libc_atoi
import libc.cinterop.libc_atol
import libc.cinterop.libc_atoll
import libc.cinterop.libc_calloc
import libc.cinterop.libc_free
import libc.cinterop.libc_getenv
import libc.cinterop.libc_labs
import libc.cinterop.libc_llabs
import libc.cinterop.libc_malloc
import libc.cinterop.libc_rand
import libc.cinterop.libc_setenv
import libc.cinterop.libc_srand
import libc.cinterop.libc_unsetenv

public actual fun malloc(size: ULong): COpaquePointer? =
    libc.cinterop.libc_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun calloc(nmemb: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_calloc(nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires FFI bridge")

public actual fun free(ptr: COpaquePointer?) {
    if (ptr == null) return
    val pPtr: CPointer<ByteVar>? = ptr.value.toCPointer()
    if (ptr.allocationAlignment != 0uL) libc.cinterop.libc_aligned_free(pPtr) else libc.cinterop.libc_free(pPtr)
}

public actual fun getenv(name: String?): String? {
    if (name == null) return null
    return libc.cinterop.libc_getenv(name)?.toKString()
}

public actual fun setenv(name: String?, value: String?, overwrite: Int): Int {
    if (name == null) return -1
    if (value == null) return -1
    return libc.cinterop.libc_setenv(name, value, overwrite)
}

public actual fun unsetenv(name: String?): Int {
    if (name == null) return -1
    return libc.cinterop.libc_unsetenv(name)
}

public actual fun atoi(nptr: String?): Int {
    if (nptr == null) return 0
    return libc.cinterop.libc_atoi(nptr)
}

public actual fun atol(nptr: String?): Long =
    libc.cinterop.libc_atol(nptr)

public actual fun atoll(nptr: String?): Long {
    if (nptr == null) return 0
    return libc.cinterop.libc_atoll(nptr)
}

public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtol requires FFI bridge")

public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge — not yet implemented")

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtoll requires manual FFI bridge — not yet implemented")

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoull requires manual FFI bridge — not yet implemented")

public actual fun rand(): Int =
    libc.cinterop.libc_rand()

public actual fun srand(seed: UInt) {
    libc_srand(seed)
}

public actual fun abs(j: Int): Int =
    libc.cinterop.libc_abs(j)

public actual fun labs(j: Long): Long =
    libc.cinterop.libc_labs(j)

public actual fun llabs(j: Long): Long =
    libc.cinterop.libc_llabs(j)

public actual fun atexit(function: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit requires manual FFI bridge — not yet implemented")

public actual fun qsort(base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsort requires manual FFI bridge — not yet implemented")

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch requires manual FFI bridge — not yet implemented")
