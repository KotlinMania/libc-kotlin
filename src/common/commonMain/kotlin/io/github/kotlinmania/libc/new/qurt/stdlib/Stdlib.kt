// port-lint: source new/qurt/stdlib.rs
package io.github.kotlinmania.libc.new.qurt.stdlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.new.qurt.DivT
import io.github.kotlinmania.libc.new.qurt.LdivT
import io.github.kotlinmania.libc.new.qurt.LldivT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `stdlib.h`

public fun interface AtexitFunctionCallback {
    public operator fun invoke()
}

public fun interface QsortComparCallback {
    public operator fun invoke(arg0: ConstPtr, arg1: ConstPtr): CInt
}

// Exit status constants
public val EXIT_SUCCESS: CInt = 0

public val EXIT_FAILURE: CInt = 1

// Maximum values
public val RAND_MAX: CInt = 32767

// Memory management
public expect fun malloc(size: SizeT): MutPtr

public expect fun calloc(nmemb: SizeT, size: SizeT): MutPtr

public expect fun realloc(ptr: MutPtr, size: SizeT): MutPtr

public expect fun free(ptr: MutPtr)

// Process control
public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun atexit(function: AtexitFunctionCallback): CInt

// Environment
public expect fun getenv(name: ConstPtr): MutPtr

public expect fun setenv(name: ConstPtr, value: ConstPtr, overwrite: CInt): CInt

public expect fun unsetenv(name: ConstPtr): CInt

// String/number conversion
public expect fun atoi(nptr: ConstPtr): CInt

public expect fun atol(nptr: ConstPtr): CLong

public expect fun atoll(nptr: ConstPtr): CLonglong

public expect fun strtol(nptr: ConstPtr, endptr: MutPtr, base: CInt): CLong

public expect fun strtoul(nptr: ConstPtr, endptr: MutPtr, base: CInt): CUlong

public expect fun strtoll(nptr: ConstPtr, endptr: MutPtr, base: CInt): CLonglong

public expect fun strtoull(nptr: ConstPtr, endptr: MutPtr, base: CInt): CUlonglong

public expect fun strtod(nptr: ConstPtr, endptr: MutPtr): CDouble

public expect fun strtof(nptr: ConstPtr, endptr: MutPtr): CFloat

// Random numbers
public expect fun rand(): CInt

public expect fun srand(seed: CUint)

// Searching and sorting
public expect fun qsort(base: MutPtr, nmemb: SizeT, size: SizeT, compar: QsortComparCallback)

public expect fun bsearch(key: ConstPtr, base: ConstPtr, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): MutPtr

// Integer arithmetic
public expect fun abs(j: CInt): CInt

public expect fun labs(j: CLong): CLong

public expect fun llabs(j: CLonglong): CLonglong

public expect fun div(numer: CInt, denom: CInt): DivT

public expect fun ldiv(numer: CLong, denom: CLong): LdivT

public expect fun lldiv(numer: CLonglong, denom: CLonglong): LldivT
