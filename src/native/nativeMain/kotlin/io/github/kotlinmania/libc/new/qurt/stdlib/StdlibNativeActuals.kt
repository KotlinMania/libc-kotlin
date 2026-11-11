@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_abort
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_abs
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_atexit
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_atoi
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_atol
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_atoll
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_bsearch
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_calloc
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_exit
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_free
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_getenv
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_labs
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_llabs
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_malloc
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_qsort
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_rand
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_realloc
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_setenv
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_srand
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_strtod
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_strtof
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_strtol
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_strtoll
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_strtoul
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_strtoull
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libc_new_qurt_stdlib_unsetenv
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun malloc(size: SizeT): COpaquePointer? =
    libc_new_qurt_stdlib_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun calloc(nmemb: SizeT, size: SizeT): COpaquePointer? =
    libc_new_qurt_stdlib_calloc(nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    libc_new_qurt_stdlib_realloc(ptr?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun free(ptr: COpaquePointer?) {
    libc_new_qurt_stdlib_free(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun abort(): Nothing {
    libc_new_qurt_stdlib_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    libc_new_qurt_stdlib_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(function: AtexitFunctionCallback): CInt =
    libc_new_qurt_stdlib_atexit(0L.toCPointer<ByteVar>())

public actual fun getenv(name: String?): COpaquePointer? =
    libc_new_qurt_stdlib_getenv(name)?.let { COpaquePointer(it.toLong()) }

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    libc_new_qurt_stdlib_setenv(name, value, overwrite)

public actual fun unsetenv(name: String?): CInt =
    libc_new_qurt_stdlib_unsetenv(name)

public actual fun atoi(nptr: String?): CInt =
    libc_new_qurt_stdlib_atoi(nptr)

public actual fun atol(nptr: String?): CLong =
    libc_new_qurt_stdlib_atol(nptr)

public actual fun atoll(nptr: String?): CLonglong =
    libc_new_qurt_stdlib_atoll(nptr)

public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong =
    libc_new_qurt_stdlib_strtol(nptr, endptr?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlong =
    libc_new_qurt_stdlib_strtoul(nptr, endptr?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLonglong =
    libc_new_qurt_stdlib_strtoll(nptr, endptr?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlonglong =
    libc_new_qurt_stdlib_strtoull(nptr, endptr?.value?.toCPointer<ByteVar>(), base)

public actual fun strtod(nptr: String?, endptr: COpaquePointer?): CDouble =
    libc_new_qurt_stdlib_strtod(nptr, endptr?.value?.toCPointer<ByteVar>())

public actual fun strtof(nptr: String?, endptr: COpaquePointer?): CFloat =
    libc_new_qurt_stdlib_strtof(nptr, endptr?.value?.toCPointer<ByteVar>())

public actual fun rand(): CInt =
    libc_new_qurt_stdlib_rand()

public actual fun srand(seed: CUint) {
    libc_new_qurt_stdlib_srand(seed)
}

public actual fun qsort(base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback) {
    libc_new_qurt_stdlib_qsort(base?.value?.toCPointer<ByteVar>(), nmemb, size, 0L.toCPointer<ByteVar>())
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): COpaquePointer? =
    libc_new_qurt_stdlib_bsearch(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nmemb, size, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun abs(j: CInt): CInt =
    libc_new_qurt_stdlib_abs(j)

public actual fun labs(j: CLong): CLong =
    libc_new_qurt_stdlib_labs(j)

public actual fun llabs(j: CLonglong): CLonglong =
    libc_new_qurt_stdlib_llabs(j)

public actual fun div(numer: CInt, denom: CInt): DivT =
    DivT()

public actual fun ldiv(numer: CLong, denom: CLong): LdivT =
    LdivT()

public actual fun lldiv(numer: CLonglong, denom: CLonglong): LldivT =
    LldivT()
