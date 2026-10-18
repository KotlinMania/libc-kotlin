package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc not available on WASI — no C library access")

public actual fun calloc(nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc not available on WASI — no C library access")

public actual fun realloc(ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on WASI — no C library access")

public actual fun free(ptr: COpaquePointer?): Unit = throw UnsupportedOperationException("free not available on WASI — no C library access")

public actual fun getenv(name: String?): String? =
    throw UnsupportedOperationException("getenv not available on WASI — no C library access")

public actual fun setenv(name: String?, value: String?, overwrite: Int): Int =
    throw UnsupportedOperationException("setenv not available on WASI — no C library access")

public actual fun unsetenv(name: String?): Int =
    throw UnsupportedOperationException("unsetenv not available on WASI — no C library access")

public actual fun atoi(nptr: String?): Int =
    throw UnsupportedOperationException("atoi not available on WASI — no C library access")

public actual fun atol(nptr: String?): Long =
    throw UnsupportedOperationException("atol not available on WASI — no C library access")

public actual fun atoll(nptr: String?): Long =
    throw UnsupportedOperationException("atoll not available on WASI — no C library access")

public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtol not available on WASI — no C library access")

public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul not available on WASI — no C library access")

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtoll not available on WASI — no C library access")

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoull not available on WASI — no C library access")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand not available on WASI — no C library access")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand not available on WASI — no C library access")

public actual fun abs(j: Int): Int =
    throw UnsupportedOperationException("abs not available on WASI — no C library access")

public actual fun labs(j: Long): Long =
    throw UnsupportedOperationException("labs not available on WASI — no C library access")

public actual fun llabs(j: Long): Long =
    throw UnsupportedOperationException("llabs not available on WASI — no C library access")

public actual fun atexit(function: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit not available on WASI — no C library access")

public actual fun qsort(base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsort not available on WASI — no C library access")

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch not available on WASI — no C library access")
