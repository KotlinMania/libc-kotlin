// port-lint: source Stdlib.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc not available on WASI — no C library access")

public actual fun calloc(nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc not available on WASI — no C library access")

public actual fun realloc(ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on WASI — no C library access")

public actual fun free(ptr: COpaquePointer?) {
    throw UnsupportedOperationException("free not available on WASI — no C library access")
}

public actual fun getenv(name: String?): String? =
    throw UnsupportedOperationException("getenv not available on WASI — no C library access")

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    throw UnsupportedOperationException("setenv not available on WASI — no C library access")

public actual fun unsetenv(name: String?): CInt =
    throw UnsupportedOperationException("unsetenv not available on WASI — no C library access")

public actual fun atoi(nptr: String?): CInt =
    throw UnsupportedOperationException("atoi not available on WASI — no C library access")

public actual fun atol(nptr: String?): CLong =
    throw UnsupportedOperationException("atol not available on WASI — no C library access")

public actual fun atoll(nptr: String?): CLongLong =
    throw UnsupportedOperationException("atoll not available on WASI — no C library access")

public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("strtol not available on WASI — no C library access")

public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul not available on WASI — no C library access")

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll not available on WASI — no C library access")

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull not available on WASI — no C library access")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand not available on WASI — no C library access")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand not available on WASI — no C library access")
}

public actual fun abs(j: CInt): CInt =
    throw UnsupportedOperationException("abs not available on WASI — no C library access")

public actual fun labs(j: CLong): CLong =
    throw UnsupportedOperationException("labs not available on WASI — no C library access")

public actual fun llabs(j: CLongLong): CLongLong =
    throw UnsupportedOperationException("llabs not available on WASI — no C library access")


public actual fun atexit(function: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atexit not available on WASI — no C library access")

public actual fun qsort(base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?) {
    throw UnsupportedOperationException("qsort not available on WASI — no C library access")
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch not available on WASI — no C library access")
