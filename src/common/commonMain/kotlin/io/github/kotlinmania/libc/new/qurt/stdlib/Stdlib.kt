// port-lint: source new/qurt/stdlib.rs
package io.github.kotlinmania.libc.new.qurt.stdlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.new.qurt.DivT
import io.github.kotlinmania.libc.new.qurt.LdivT
import io.github.kotlinmania.libc.new.qurt.LldivT
import io.github.kotlinmania.libc.new.qurt.SizeT

// Header: `stdlib.h`

public fun interface AtexitFunctionCallback {
    public operator fun invoke()
}

public fun interface QsortComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?): CInt
}

// Exit status constants
public val EXIT_SUCCESS: CInt = 0

public val EXIT_FAILURE: CInt = 1

// Maximum values
public val RAND_MAX: CInt = 32767

// Memory management
public expect fun malloc(size: SizeT): COpaquePointer?

public expect fun calloc(nmemb: SizeT, size: SizeT): COpaquePointer?

public expect fun realloc(ptr: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun free(ptr: COpaquePointer?)

// Process control
public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun atexit(function: AtexitFunctionCallback): CInt

// Environment
public expect fun getenv(name: String?): COpaquePointer?

public expect fun setenv(name: String?, value: String?, overwrite: CInt): CInt

public expect fun unsetenv(name: String?): CInt

// String/number conversion
public expect fun atoi(nptr: String?): CInt

public expect fun atol(nptr: String?): CLong

public expect fun atoll(nptr: String?): CLonglong

public expect fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong

public expect fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlong

public expect fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLonglong

public expect fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlonglong

public expect fun strtod(nptr: String?, endptr: COpaquePointer?): CDouble

public expect fun strtof(nptr: String?, endptr: COpaquePointer?): CFloat

// Random numbers
public expect fun rand(): CInt

public expect fun srand(seed: CUint)

// Searching and sorting
public expect fun qsort(base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback)

public expect fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): COpaquePointer?

// Integer arithmetic
public expect fun abs(j: CInt): CInt

public expect fun labs(j: CLong): CLong

public expect fun llabs(j: CLonglong): CLonglong

public expect fun div(numer: CInt, denom: CInt): DivT

public expect fun ldiv(numer: CLong, denom: CLong): LdivT

public expect fun lldiv(numer: CLonglong, denom: CLonglong): LldivT
