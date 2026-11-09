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

private object NewQurtStdlibJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_qurt_stdlib_malloc(size: Long): Long

    @JvmStatic
    external fun libc_new_qurt_stdlib_calloc(nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libc_new_qurt_stdlib_realloc(ptr: Long, size: Long): Long

    @JvmStatic
    external fun libc_new_qurt_stdlib_free(ptr: Long)

    @JvmStatic
    external fun libc_new_qurt_stdlib_abort()

    @JvmStatic
    external fun libc_new_qurt_stdlib_exit(status: Int)

    @JvmStatic
    external fun libc_new_qurt_stdlib_atexit(function: Long): Int

    @JvmStatic
    external fun libc_new_qurt_stdlib_getenv(name: String?): Long

    @JvmStatic
    external fun libc_new_qurt_stdlib_setenv(name: String?, value: String?, overwrite: Int): Int

    @JvmStatic
    external fun libc_new_qurt_stdlib_unsetenv(name: String?): Int

    @JvmStatic
    external fun libc_new_qurt_stdlib_atoi(nptr: String?): Int

    @JvmStatic
    external fun libc_new_qurt_stdlib_atol(nptr: String?): Long

    @JvmStatic
    external fun libc_new_qurt_stdlib_atoll(nptr: String?): Long

    @JvmStatic
    external fun libc_new_qurt_stdlib_strtol(nptr: String?, endptr: Long, base: Int): Long

    @JvmStatic
    external fun libc_new_qurt_stdlib_strtoul(nptr: String?, endptr: Long, base: Int): Long

    @JvmStatic
    external fun libc_new_qurt_stdlib_strtoll(nptr: String?, endptr: Long, base: Int): Long

    @JvmStatic
    external fun libc_new_qurt_stdlib_strtoull(nptr: String?, endptr: Long, base: Int): Long

    @JvmStatic
    external fun libc_new_qurt_stdlib_strtod(nptr: String?, endptr: Long): Double

    @JvmStatic
    external fun libc_new_qurt_stdlib_strtof(nptr: String?, endptr: Long): Float

    @JvmStatic
    external fun libc_new_qurt_stdlib_rand(): Int

    @JvmStatic
    external fun libc_new_qurt_stdlib_srand(seed: Int)

    @JvmStatic
    external fun libc_new_qurt_stdlib_qsort(base: Long, nmemb: Long, size: Long, compar: Long)

    @JvmStatic
    external fun libc_new_qurt_stdlib_bsearch(key: Long, base: Long, nmemb: Long, size: Long, compar: Long): Long

    @JvmStatic
    external fun libc_new_qurt_stdlib_abs(j: Int): Int

    @JvmStatic
    external fun libc_new_qurt_stdlib_labs(j: Long): Long

    @JvmStatic
    external fun libc_new_qurt_stdlib_llabs(j: Long): Long
}

public actual fun malloc(size: SizeT): COpaquePointer? =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_malloc(size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun calloc(nmemb: SizeT, size: SizeT): COpaquePointer? =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_calloc(nmemb.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_realloc((ptr?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(ptr: COpaquePointer?) {
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_free((ptr?.value ?: 0L))
}

public actual fun abort(): Nothing {
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(function: AtexitFunctionCallback): CInt =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_atexit(0L)

public actual fun getenv(name: String?): COpaquePointer? =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_getenv(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_setenv(name, value, overwrite)

public actual fun unsetenv(name: String?): CInt =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_unsetenv(name)

public actual fun atoi(nptr: String?): CInt =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_atoi(nptr)

public actual fun atol(nptr: String?): CLong =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_atol(nptr)

public actual fun atoll(nptr: String?): CLonglong =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_atoll(nptr)

public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_strtol(nptr, (endptr?.value ?: 0L), base)

public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlong =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_strtoul(nptr, (endptr?.value ?: 0L), base).toULong()

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLonglong =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_strtoll(nptr, (endptr?.value ?: 0L), base)

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlonglong =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_strtoull(nptr, (endptr?.value ?: 0L), base).toULong()

public actual fun strtod(nptr: String?, endptr: COpaquePointer?): CDouble =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_strtod(nptr, (endptr?.value ?: 0L))

public actual fun strtof(nptr: String?, endptr: COpaquePointer?): CFloat =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_strtof(nptr, (endptr?.value ?: 0L))

public actual fun rand(): CInt =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_rand()

public actual fun srand(seed: CUint) {
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_srand(seed.toInt())
}

public actual fun qsort(base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback) {
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_qsort((base?.value ?: 0L), nmemb.toLong(), size.toLong(), 0L)
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): COpaquePointer? =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_bsearch((key?.value ?: 0L), (base?.value ?: 0L), nmemb.toLong(), size.toLong(), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun abs(j: CInt): CInt =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_abs(j)

public actual fun labs(j: CLong): CLong =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_labs(j)

public actual fun llabs(j: CLonglong): CLonglong =
    NewQurtStdlibJniBridge.libc_new_qurt_stdlib_llabs(j)

public actual fun div(numer: CInt, denom: CInt): DivT =
    DivT()

public actual fun ldiv(numer: CLong, denom: CLong): LdivT =
    LdivT()

public actual fun lldiv(numer: CLonglong, denom: CLonglong): LldivT =
    LldivT()
