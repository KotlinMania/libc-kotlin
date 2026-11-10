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
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun calloc(nmemb: SizeT, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realloc(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun free(ptr: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun abort(): Nothing =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exit(status: CInt): Nothing =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atexit(function: AtexitFunctionCallback): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getenv(name: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unsetenv(name: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atoi(nptr: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atol(nptr: String?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atoll(nptr: String?): CLonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtod(nptr: String?, endptr: COpaquePointer?): CDouble =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtof(nptr: String?, endptr: COpaquePointer?): CFloat =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun srand(seed: CUint): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qsort(base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun abs(j: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun labs(j: CLong): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun llabs(j: CLonglong): CLonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun div(numer: CInt, denom: CInt): DivT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldiv(numer: CLong, denom: CLong): LdivT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lldiv(numer: CLonglong, denom: CLonglong): LldivT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
