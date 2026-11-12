@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.stdlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtStdlibJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewQurtStdlibMalloc(size: Long): Long

    @JvmStatic
    external fun libcNewQurtStdlibCalloc(nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libcNewQurtStdlibRealloc(ptr: Long, size: Long): Long

    @JvmStatic
    external fun libcNewQurtStdlibFree(ptr: Long)

    @JvmStatic
    external fun libcNewQurtStdlibAbort()

    @JvmStatic
    external fun libcNewQurtStdlibExit(status: Int)

    @JvmStatic
    external fun libcNewQurtStdlibAtexit(function: Long): Int

    @JvmStatic
    external fun libcNewQurtStdlibGetenv(name: Long): Long

    @JvmStatic
    external fun libcNewQurtStdlibSetenv(name: Long, value: Long, overwrite: Int): Int

    @JvmStatic
    external fun libcNewQurtStdlibUnsetenv(name: Long): Int

    @JvmStatic
    external fun libcNewQurtStdlibAtoi(nptr: Long): Int

    @JvmStatic
    external fun libcNewQurtStdlibAtol(nptr: Long): Long

    @JvmStatic
    external fun libcNewQurtStdlibAtoll(nptr: Long): Long

    @JvmStatic
    external fun libcNewQurtStdlibStrtol(nptr: Long, endptr: Long, base: Int): Long

    @JvmStatic
    external fun libcNewQurtStdlibStrtoul(nptr: Long, endptr: Long, base: Int): Long

    @JvmStatic
    external fun libcNewQurtStdlibStrtoll(nptr: Long, endptr: Long, base: Int): Long

    @JvmStatic
    external fun libcNewQurtStdlibStrtoull(nptr: Long, endptr: Long, base: Int): Long

    @JvmStatic
    external fun libcNewQurtStdlibStrtod(nptr: Long, endptr: Long): Double

    @JvmStatic
    external fun libcNewQurtStdlibStrtof(nptr: Long, endptr: Long): Float

    @JvmStatic
    external fun libcNewQurtStdlibRand(): Int

    @JvmStatic
    external fun libcNewQurtStdlibSrand(seed: Int)

    @JvmStatic
    external fun libcNewQurtStdlibQsort(base: Long, nmemb: Long, size: Long, compar: Long)

    @JvmStatic
    external fun libcNewQurtStdlibBsearch(key: Long, base: Long, nmemb: Long, size: Long, compar: Long): Long

    @JvmStatic
    external fun libcNewQurtStdlibAbs(j: Int): Int

    @JvmStatic
    external fun libcNewQurtStdlibLabs(j: Long): Long

    @JvmStatic
    external fun libcNewQurtStdlibLlabs(j: Long): Long
}

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    MutPtr(NewQurtStdlibJniBridge.libcNewQurtStdlibMalloc(size.toLong()))

public actual fun calloc(nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(NewQurtStdlibJniBridge.libcNewQurtStdlibCalloc(nmemb.toLong(), size.toLong()))

public actual fun realloc(ptr: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(NewQurtStdlibJniBridge.libcNewQurtStdlibRealloc(ptr.rawAddress, size.toLong()))

public actual fun free(ptr: MutPtr<CVoid>) {
    NewQurtStdlibJniBridge.libcNewQurtStdlibFree(ptr.rawAddress)
}

public actual fun abort(): Nothing {
    NewQurtStdlibJniBridge.libcNewQurtStdlibAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    NewQurtStdlibJniBridge.libcNewQurtStdlibExit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(function: AtexitFunctionCallback): CInt =
    NewQurtStdlibJniBridge.libcNewQurtStdlibAtexit(0L)

public actual fun getenv(name: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(NewQurtStdlibJniBridge.libcNewQurtStdlibGetenv(name.rawAddress))

public actual fun setenv(name: ConstPtr<CChar>, value: ConstPtr<CChar>, overwrite: CInt): CInt =
    NewQurtStdlibJniBridge.libcNewQurtStdlibSetenv(name.rawAddress, value.rawAddress, overwrite)

public actual fun unsetenv(name: ConstPtr<CChar>): CInt =
    NewQurtStdlibJniBridge.libcNewQurtStdlibUnsetenv(name.rawAddress)

public actual fun atoi(nptr: ConstPtr<CChar>): CInt =
    NewQurtStdlibJniBridge.libcNewQurtStdlibAtoi(nptr.rawAddress)

public actual fun atol(nptr: ConstPtr<CChar>): CLong =
    NewQurtStdlibJniBridge.libcNewQurtStdlibAtol(nptr.rawAddress)

public actual fun atoll(nptr: ConstPtr<CChar>): CLonglong =
    NewQurtStdlibJniBridge.libcNewQurtStdlibAtoll(nptr.rawAddress)

public actual fun strtol(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    NewQurtStdlibJniBridge.libcNewQurtStdlibStrtol(nptr.rawAddress, endptr.rawAddress, base)

public actual fun strtoul(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    NewQurtStdlibJniBridge.libcNewQurtStdlibStrtoul(nptr.rawAddress, endptr.rawAddress, base).toULong()

public actual fun strtoll(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    NewQurtStdlibJniBridge.libcNewQurtStdlibStrtoll(nptr.rawAddress, endptr.rawAddress, base)

public actual fun strtoull(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    NewQurtStdlibJniBridge.libcNewQurtStdlibStrtoull(nptr.rawAddress, endptr.rawAddress, base).toULong()

public actual fun strtod(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>): CDouble =
    NewQurtStdlibJniBridge.libcNewQurtStdlibStrtod(nptr.rawAddress, endptr.rawAddress)

public actual fun strtof(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>): CFloat =
    NewQurtStdlibJniBridge.libcNewQurtStdlibStrtof(nptr.rawAddress, endptr.rawAddress)

public actual fun rand(): CInt =
    NewQurtStdlibJniBridge.libcNewQurtStdlibRand()

public actual fun srand(seed: CUint) {
    NewQurtStdlibJniBridge.libcNewQurtStdlibSrand(seed.toInt())
}

public actual fun qsort(base: MutPtr<CVoid>, nmemb: SizeT, size: SizeT, compar: QsortComparCallback) {
    NewQurtStdlibJniBridge.libcNewQurtStdlibQsort(base.rawAddress, nmemb.toLong(), size.toLong(), 0L)
}

public actual fun bsearch(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): MutPtr<CVoid> =
    MutPtr(NewQurtStdlibJniBridge.libcNewQurtStdlibBsearch(key.rawAddress, base.rawAddress, nmemb.toLong(), size.toLong(), 0L))

public actual fun abs(j: CInt): CInt =
    NewQurtStdlibJniBridge.libcNewQurtStdlibAbs(j)

public actual fun labs(j: CLong): CLong =
    NewQurtStdlibJniBridge.libcNewQurtStdlibLabs(j)

public actual fun llabs(j: CLonglong): CLonglong =
    NewQurtStdlibJniBridge.libcNewQurtStdlibLlabs(j)

public actual fun div(numer: CInt, denom: CInt): DivT =
    DivT()

public actual fun ldiv(numer: CLong, denom: CLong): LdivT =
    LdivT()

public actual fun lldiv(numer: CLonglong, denom: CLonglong): LldivT =
    LldivT()
