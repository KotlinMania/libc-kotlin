// port-lint: source Stdlib.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc requires N-API addon")

public actual fun calloc(nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc requires N-API addon")

public actual fun realloc(ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires N-API addon")

public actual fun free(ptr: COpaquePointer?) {
    throw UnsupportedOperationException("free requires N-API addon")
}

public actual fun getenv(name: String?): String? =
    throw UnsupportedOperationException("getenv requires N-API addon")

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    throw UnsupportedOperationException("setenv requires N-API addon")

public actual fun unsetenv(name: String?): CInt =
    throw UnsupportedOperationException("unsetenv requires N-API addon")

public actual fun atoi(nptr: String?): CInt =
    throw UnsupportedOperationException("atoi requires N-API addon")

public actual fun atol(nptr: String?): CLong =
    throw UnsupportedOperationException("atol requires N-API addon")

public actual fun atoll(nptr: String?): CLongLong =
    throw UnsupportedOperationException("atoll requires N-API addon")

public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("strtol requires N-API addon")

public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul requires N-API addon")

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll requires N-API addon")

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull requires N-API addon")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires N-API addon")
}

public actual fun abs(j: CInt): CInt =
    throw UnsupportedOperationException("abs requires N-API addon")

public actual fun labs(j: CLong): CLong =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun llabs(j: CLongLong): CLongLong =
    throw UnsupportedOperationException("llabs requires N-API addon")


public actual fun atexit(function: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atexit requires N-API addon")

public actual fun qsort(base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?) {
    throw UnsupportedOperationException("qsort requires N-API addon")
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch requires N-API addon")
