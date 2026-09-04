// port-lint: source Stdlib.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc requires manual FFI bridge — not yet implemented")

public actual fun calloc(nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc requires manual FFI bridge — not yet implemented")

public actual fun realloc(ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires manual FFI bridge — not yet implemented")

public actual fun free(ptr: COpaquePointer?) {
    throw UnsupportedOperationException("free requires manual FFI bridge — not yet implemented")
}

public actual fun getenv(name: String?): String? =
    throw UnsupportedOperationException("getenv requires manual FFI bridge — not yet implemented")

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    throw UnsupportedOperationException("setenv requires manual FFI bridge — not yet implemented")

public actual fun unsetenv(name: String?): CInt =
    throw UnsupportedOperationException("unsetenv requires manual FFI bridge — not yet implemented")

public actual fun atoi(nptr: String?): CInt =
    throw UnsupportedOperationException("atoi requires manual FFI bridge — not yet implemented")

public actual fun atol(nptr: String?): CLong =
    throw UnsupportedOperationException("atol requires manual FFI bridge — not yet implemented")

public actual fun atoll(nptr: String?): CLongLong =
    throw UnsupportedOperationException("atoll requires manual FFI bridge — not yet implemented")

public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("strtol requires manual FFI bridge — not yet implemented")

public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge — not yet implemented")

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll requires manual FFI bridge — not yet implemented")

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull requires manual FFI bridge — not yet implemented")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand requires manual FFI bridge — not yet implemented")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires manual FFI bridge — not yet implemented")
}

public actual fun abs(j: CInt): CInt =
    throw UnsupportedOperationException("abs requires manual FFI bridge — not yet implemented")

public actual fun labs(j: CLong): CLong =
    throw UnsupportedOperationException("labs requires manual FFI bridge — not yet implemented")

public actual fun llabs(j: CLongLong): CLongLong =
    throw UnsupportedOperationException("llabs requires manual FFI bridge — not yet implemented")

public actual fun atexit(function: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atexit requires manual FFI bridge — not yet implemented")

public actual fun qsort(base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?) {
    throw UnsupportedOperationException("qsort requires manual FFI bridge — not yet implemented")
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch requires manual FFI bridge — not yet implemented")
