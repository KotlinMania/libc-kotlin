@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun malloc(size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun calloc(nmemb: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_calloc(nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_realloc(ptr?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun free(ptr: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_stdlib_free(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun abort(): Nothing {
    io.github.kotlinmania.libc.cinterop.libc_stdlib_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    io.github.kotlinmania.libc.cinterop.libc_stdlib_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(function: AtexitFunctionCallback): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_atexit(function.toInt())

public actual fun getenv(name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_getenv(name)?.let { COpaquePointer(it.toLong()) }

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_setenv(name, value, overwrite)

public actual fun unsetenv(name: String?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_unsetenv(name)

public actual fun atoi(nptr: String?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_atoi(nptr)

public actual fun atol(nptr: String?): CLong =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_atol(nptr)

public actual fun atoll(nptr: String?): CLonglong =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_atoll(nptr)

public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_strtol(nptr, endptr?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlong =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_strtoul(nptr, endptr?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLonglong =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_strtoll(nptr, endptr?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlonglong =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_strtoull(nptr, endptr?.value?.toCPointer<ByteVar>(), base)

public actual fun strtod(nptr: String?, endptr: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_strtod(nptr, endptr?.value?.toCPointer<ByteVar>())

public actual fun strtof(nptr: String?, endptr: COpaquePointer?): CFloat =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_strtof(nptr, endptr?.value?.toCPointer<ByteVar>())

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_rand()

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.cinterop.libc_stdlib_srand(seed)
}

public actual fun qsort(base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback) {
    io.github.kotlinmania.libc.cinterop.libc_stdlib_qsort(base?.value?.toCPointer<ByteVar>(), nmemb, size, compar.toInt())
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_bsearch(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nmemb, size, compar.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun abs(j: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_abs(j)

public actual fun labs(j: CLong): CLong =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_labs(j)

public actual fun llabs(j: CLonglong): CLonglong =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_llabs(j)

public actual fun div(numer: CInt, denom: CInt): DivT =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_div(numer, denom)

public actual fun ldiv(numer: CLong, denom: CLong): LdivT =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_ldiv(numer, denom)

public actual fun lldiv(numer: CLonglong, denom: CLonglong): LldivT =
    io.github.kotlinmania.libc.cinterop.libc_stdlib_lldiv(numer, denom)
