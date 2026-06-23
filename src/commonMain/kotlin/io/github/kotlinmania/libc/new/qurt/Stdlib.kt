// port-lint: source new/qurt/stdlib.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public const val EXIT_SUCCESS: CInt = 0
public const val EXIT_FAILURE: CInt = 1
public const val RAND_MAX: CInt = 32767

public expect fun malloc(size: ULong): COpaquePointer?
public expect fun calloc(nmemb: ULong, size: ULong): COpaquePointer?
public expect fun realloc(ptr: COpaquePointer?, size: ULong): COpaquePointer?
public expect fun free(ptr: COpaquePointer?)
public expect fun abort(): Nothing
public expect fun exit(status: CInt): Nothing
public expect fun atexit(function: (() -> Unit)?): CInt
public expect fun getenv(name: String?): String?
public expect fun setenv(name: String?, value: String?, overwrite: CInt): CInt
public expect fun unsetenv(name: String?): CInt
public expect fun atoi(nptr: String?): CInt
public expect fun atol(nptr: String?): CLong
public expect fun atoll(nptr: String?): CLongLong
public expect fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong
public expect fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CULong
public expect fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLongLong
public expect fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CULongLong
public expect fun strtod(nptr: String?, endptr: COpaquePointer?): CDouble
public expect fun strtof(nptr: String?, endptr: COpaquePointer?): CFloat
public expect fun rand(): CInt
public expect fun srand(seed: CUInt)
public expect fun qsort(base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?)
public expect fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer?
public expect fun abs(j: CInt): CInt
public expect fun labs(j: CLong): CLong
public expect fun llabs(j: CLongLong): CLongLong
public expect fun div(numer: CInt, denom: CInt): DivT
public expect fun ldiv(numer: CLong, denom: CLong): LdivT
public expect fun lldiv(numer: CLongLong, denom: CLongLong): LldivT
