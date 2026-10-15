// port-lint: source new/qurt/stdlib.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val EXIT_SUCCESS: Int = 0
public const val EXIT_FAILURE: Int = 1
public const val RAND_MAX: Int = 32767

public expect fun malloc(size: ULong): COpaquePointer?

public expect fun calloc(nmemb: ULong, size: ULong): COpaquePointer?

public expect fun realloc(ptr: COpaquePointer?, size: ULong): COpaquePointer?

public expect fun free(ptr: COpaquePointer?)

public fun abort(): Nothing = throw UnsupportedOperationException()

public fun exit(status: Int): Nothing = throw UnsupportedOperationException()

public expect fun atexit(function: (() -> Unit)?): Int

public expect fun getenv(name: String?): String?

public expect fun setenv(name: String?, value: String?, overwrite: Int): Int

public expect fun unsetenv(name: String?): Int

public expect fun atoi(nptr: String?): Int

public expect fun atol(nptr: String?): Long

public expect fun atoll(nptr: String?): Long

public expect fun strtol(nptr: String?, endptr: COpaquePointer?, base: Int): Long

public expect fun strtoul(nptr: String?, endptr: COpaquePointer?, base: Int): ULong

public expect fun strtoll(nptr: String?, endptr: COpaquePointer?, base: Int): Long

public expect fun strtoull(nptr: String?, endptr: COpaquePointer?, base: Int): ULong

public fun strtod(nptr: String?, endptr: COpaquePointer?): Double = 0.0

public fun strtof(nptr: String?, endptr: COpaquePointer?): Float = 0.0f

public expect fun rand(): Int

public expect fun srand(seed: UInt)

public expect fun qsort(base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?)

public expect fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer?

public expect fun abs(j: Int): Int

public expect fun labs(j: Long): Long

public expect fun llabs(j: Long): Long

public fun div(numer: Int, denom: Int): DivT = throw UnsupportedOperationException("Not implemented on this platform")

public fun ldiv(numer: Long, denom: Long): LdivT = throw UnsupportedOperationException("Not implemented on this platform")

public fun lldiv(numer: Long, denom: Long): LldivT = throw UnsupportedOperationException("Not implemented on this platform")
