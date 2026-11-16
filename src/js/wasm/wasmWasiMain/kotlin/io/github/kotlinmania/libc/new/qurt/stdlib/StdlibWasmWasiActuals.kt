@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module libc.
public actual fun malloc(size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibMalloc")

public actual fun calloc(nmemb: SizeT, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibCalloc")

public actual fun realloc(ptr: MutPtr, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibRealloc")

public actual fun free(ptr: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibFree")

@kotlin.wasm.WasmImport("libc", "libcNewQurtStdlibAbort")
private external fun wasiLibcNewQurtStdlibAbort(): Unit

public actual fun abort(): Nothing {
    wasiLibcNewQurtStdlibAbort()
    error("C noreturn function libcNewQurtStdlibAbort returned")
}

@kotlin.wasm.WasmImport("libc", "libcNewQurtStdlibExit")
private external fun wasiLibcNewQurtStdlibExit(status: Int): Unit

public actual fun exit(status: CInt): Nothing {
    wasiLibcNewQurtStdlibExit(status)
    error("C noreturn function libcNewQurtStdlibExit returned")
}

public actual fun atexit(function: AtexitFunctionCallback): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibAtexit")

public actual fun getenv(name: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibGetenv")

public actual fun setenv(name: ConstPtr, value: ConstPtr, overwrite: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibSetenv")

public actual fun unsetenv(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibUnsetenv")

public actual fun atoi(nptr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibAtoi")

public actual fun atol(nptr: ConstPtr): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibAtol")

public actual fun atoll(nptr: ConstPtr): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibAtoll")

public actual fun strtol(nptr: ConstPtr, endptr: MutPtr, base: CInt): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibStrtol")

public actual fun strtoul(nptr: ConstPtr, endptr: MutPtr, base: CInt): CUlong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibStrtoul")

public actual fun strtoll(nptr: ConstPtr, endptr: MutPtr, base: CInt): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibStrtoll")

public actual fun strtoull(nptr: ConstPtr, endptr: MutPtr, base: CInt): CUlonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibStrtoull")

public actual fun strtod(nptr: ConstPtr, endptr: MutPtr): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibStrtod")

public actual fun strtof(nptr: ConstPtr, endptr: MutPtr): CFloat =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibStrtof")

@kotlin.wasm.WasmImport("libc", "libcNewQurtStdlibRand")
private external fun wasiLibcNewQurtStdlibRand(): Int

public actual fun rand(): CInt =
    wasiLibcNewQurtStdlibRand()

@kotlin.wasm.WasmImport("libc", "libcNewQurtStdlibSrand")
private external fun wasiLibcNewQurtStdlibSrand(seed: Int): Unit

public actual fun srand(seed: CUint): Unit =
    wasiLibcNewQurtStdlibSrand(seed.toInt())

public actual fun qsort(base: MutPtr, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibQsort")

public actual fun bsearch(key: ConstPtr, base: ConstPtr, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibBsearch")

@kotlin.wasm.WasmImport("libc", "libcNewQurtStdlibAbs")
private external fun wasiLibcNewQurtStdlibAbs(j: Int): Int

public actual fun abs(j: CInt): CInt =
    wasiLibcNewQurtStdlibAbs(j)

@kotlin.wasm.WasmImport("libc", "libcNewQurtStdlibLabs")
private external fun wasiLibcNewQurtStdlibLabs(j: Long): Long

public actual fun labs(j: CLong): CLong =
    wasiLibcNewQurtStdlibLabs(j)

@kotlin.wasm.WasmImport("libc", "libcNewQurtStdlibLlabs")
private external fun wasiLibcNewQurtStdlibLlabs(j: Long): Long

public actual fun llabs(j: CLonglong): CLonglong =
    wasiLibcNewQurtStdlibLlabs(j)

public actual fun div(numer: CInt, denom: CInt): DivT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibDiv")

public actual fun ldiv(numer: CLong, denom: CLong): LdivT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibLdiv")

public actual fun lldiv(numer: CLonglong, denom: CLonglong): LldivT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtStdlibLldiv")
