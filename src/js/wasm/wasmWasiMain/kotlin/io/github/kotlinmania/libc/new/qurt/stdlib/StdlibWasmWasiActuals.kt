@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

public actual fun malloc(size: SizeT): COpaquePointer? =
    null

public actual fun calloc(nmemb: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun realloc(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    null

public actual fun free(ptr: COpaquePointer?) {
}

public actual fun abort(): Nothing =
    error("Unreachable noreturn C function abort")

public actual fun exit(status: CInt): Nothing =
    error("Unreachable noreturn C function exit")

public actual fun atexit(function: AtexitFunctionCallback): CInt =
    0

public actual fun getenv(name: String?): COpaquePointer? =
    null

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    0

public actual fun unsetenv(name: String?): CInt =
    0

public actual fun atoi(nptr: String?): CInt =
    0

public actual fun atol(nptr: String?): CLong =
    0L

public actual fun atoll(nptr: String?): CLonglong =
    0L

public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong =
    0L

public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlong =
    0uL

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLonglong =
    0L

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlonglong =
    0uL

public actual fun strtod(nptr: String?, endptr: COpaquePointer?): CDouble =
    0.0

public actual fun strtof(nptr: String?, endptr: COpaquePointer?): CFloat =
    0.0f

public actual fun rand(): CInt =
    0

public actual fun srand(seed: CUint) {
}

public actual fun qsort(base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback) {
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): COpaquePointer? =
    null

public actual fun abs(j: CInt): CInt =
    0

public actual fun labs(j: CLong): CLong =
    0L

public actual fun llabs(j: CLonglong): CLonglong =
    0L

public actual fun div(numer: CInt, denom: CInt): DivT =
    DivT()

public actual fun ldiv(numer: CLong, denom: CLong): LdivT =
    LdivT()

public actual fun lldiv(numer: CLonglong, denom: CLonglong): LldivT =
    LldivT()
