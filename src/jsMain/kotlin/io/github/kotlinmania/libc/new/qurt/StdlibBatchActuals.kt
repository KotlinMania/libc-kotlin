// port-lint: source Stdlib.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun malloc(size: ULong): COpaquePointer? =
    mallocNapi(size)

public actual fun calloc(nmemb: ULong, size: ULong): COpaquePointer? =
    callocNapi(nmemb, size)

public actual fun realloc(ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    reallocNapi(ptr, size)

public actual fun free(ptr: COpaquePointer?) {
    freeNapi(ptr)
}

public actual fun getenv(name: String?): String? =
    getenvNapi(name)

public actual fun setenv(name: String?, value: String?, overwrite: Int): Int =
    throw UnsupportedOperationException("setenv requires N-API addon")

public actual fun unsetenv(name: String?): Int =
    throw UnsupportedOperationException("unsetenv requires N-API addon")

public actual fun atoi(nptr: String?): Int =
    atoiNapi(nptr)

public actual fun atol(nptr: String?): Long =
    throw UnsupportedOperationException("atol requires N-API addon")

public actual fun atoll(nptr: String?): Long =
    throw UnsupportedOperationException("atoll requires N-API addon")

public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: Int): Long =
    strtolNapi(nptr, base)

public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul requires N-API addon")

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtoll requires N-API addon")

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoull requires N-API addon")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand requires N-API addon")

public actual fun abs(j: Int): Int =
    LibcNative.abs(j)

public actual fun labs(j: Long): Long =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun llabs(j: Long): Long =
    throw UnsupportedOperationException("llabs requires N-API addon")

public actual fun atexit(function: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit requires N-API addon")

public actual fun qsort(base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsort requires N-API addon")

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch requires N-API addon")
