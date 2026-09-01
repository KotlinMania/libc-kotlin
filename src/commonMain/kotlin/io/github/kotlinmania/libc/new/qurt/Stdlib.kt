// port-lint: source new/qurt/stdlib.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val EXIT_SUCCESS: CInt = 0
public const val EXIT_FAILURE: CInt = 1
public const val RAND_MAX: CInt = 32767

public fun malloc(size: ULong): COpaquePointer? = null

public fun calloc(nmemb: ULong, size: ULong): COpaquePointer? = null

public fun realloc(ptr: COpaquePointer?, size: ULong): COpaquePointer? = null

public fun free(ptr: COpaquePointer?) { }

public fun abort(): Nothing = throw UnsupportedOperationException()

public fun exit(status: CInt): Nothing = throw UnsupportedOperationException()

public fun atexit(function: (() -> Unit)?): CInt = -1

public fun getenv(name: String?): String? = null

public fun setenv(name: String?, value: String?, overwrite: CInt): CInt = -1

public fun unsetenv(name: String?): CInt = -1

public fun atoi(nptr: String?): CInt = -1

public fun atol(nptr: String?): CLong = -1L

public fun atoll(nptr: String?): CLongLong = -1L

public fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong = -1L

public fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CULong = 0uL

public fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLongLong = -1L

public fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CULongLong = 0uL

public fun strtod(nptr: String?, endptr: COpaquePointer?): CDouble = 0.0

public fun strtof(nptr: String?, endptr: COpaquePointer?): CFloat = 0.0f

public fun rand(): CInt = -1

public fun srand(seed: CUInt) { }

public fun qsort(base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?) { }

public fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? = null

public fun abs(j: CInt): CInt = -1

public fun labs(j: CLong): CLong = -1L

public fun llabs(j: CLongLong): CLongLong = -1L

public fun div(numer: CInt, denom: CInt): DivT = throw UnsupportedOperationException("Not implemented on this platform")

public fun ldiv(numer: CLong, denom: CLong): LdivT = throw UnsupportedOperationException("Not implemented on this platform")

public fun lldiv(numer: CLongLong, denom: CLongLong): LldivT = throw UnsupportedOperationException("Not implemented on this platform")
