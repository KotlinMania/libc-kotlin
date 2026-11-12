@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibAbort
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibAbs
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibAtexit
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibAtoi
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibAtol
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibAtoll
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibBsearch
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibCalloc
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibExit
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibFree
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibGetenv
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibLabs
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibLlabs
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibMalloc
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibQsort
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibRand
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibRealloc
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibSetenv
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibSrand
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibStrtod
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibStrtof
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibStrtol
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibStrtoll
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibStrtoul
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibStrtoull
import io.github.kotlinmania.libc.new.qurt.stdlib.cinterop.libcNewQurtStdlibUnsetenv
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    MutPtr(libcNewQurtStdlibMalloc(size)?.toLong() ?: 0L)

public actual fun calloc(nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcNewQurtStdlibCalloc(nmemb, size)?.toLong() ?: 0L)

public actual fun realloc(ptr: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcNewQurtStdlibRealloc(ptr.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun free(ptr: MutPtr<CVoid>) {
    libcNewQurtStdlibFree(ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun abort(): Nothing {
    libcNewQurtStdlibAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    libcNewQurtStdlibExit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(function: AtexitFunctionCallback): CInt =
    libcNewQurtStdlibAtexit(0L.toCPointer<ByteVar>())

public actual fun getenv(name: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcNewQurtStdlibGetenv(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setenv(name: ConstPtr<CChar>, value: ConstPtr<CChar>, overwrite: CInt): CInt =
    libcNewQurtStdlibSetenv(name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), overwrite)

public actual fun unsetenv(name: ConstPtr<CChar>): CInt =
    libcNewQurtStdlibUnsetenv(name.rawAddress.toCPointer<ByteVar>())

public actual fun atoi(nptr: ConstPtr<CChar>): CInt =
    libcNewQurtStdlibAtoi(nptr.rawAddress.toCPointer<ByteVar>())

public actual fun atol(nptr: ConstPtr<CChar>): CLong =
    libcNewQurtStdlibAtol(nptr.rawAddress.toCPointer<ByteVar>())

public actual fun atoll(nptr: ConstPtr<CChar>): CLonglong =
    libcNewQurtStdlibAtoll(nptr.rawAddress.toCPointer<ByteVar>())

public actual fun strtol(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    libcNewQurtStdlibStrtol(nptr.rawAddress.toCPointer<ByteVar>(), endptr.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoul(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    libcNewQurtStdlibStrtoul(nptr.rawAddress.toCPointer<ByteVar>(), endptr.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoll(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    libcNewQurtStdlibStrtoll(nptr.rawAddress.toCPointer<ByteVar>(), endptr.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoull(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    libcNewQurtStdlibStrtoull(nptr.rawAddress.toCPointer<ByteVar>(), endptr.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtod(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>): CDouble =
    libcNewQurtStdlibStrtod(nptr.rawAddress.toCPointer<ByteVar>(), endptr.rawAddress.toCPointer<ByteVar>())

public actual fun strtof(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>): CFloat =
    libcNewQurtStdlibStrtof(nptr.rawAddress.toCPointer<ByteVar>(), endptr.rawAddress.toCPointer<ByteVar>())

public actual fun rand(): CInt =
    libcNewQurtStdlibRand()

public actual fun srand(seed: CUint) {
    libcNewQurtStdlibSrand(seed)
}

public actual fun qsort(base: MutPtr<CVoid>, nmemb: SizeT, size: SizeT, compar: QsortComparCallback) {
    libcNewQurtStdlibQsort(base.rawAddress.toCPointer<ByteVar>(), nmemb, size, 0L.toCPointer<ByteVar>())
}

public actual fun bsearch(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): MutPtr<CVoid> =
    MutPtr(libcNewQurtStdlibBsearch(key.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), nmemb, size, 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun abs(j: CInt): CInt =
    libcNewQurtStdlibAbs(j)

public actual fun labs(j: CLong): CLong =
    libcNewQurtStdlibLabs(j)

public actual fun llabs(j: CLonglong): CLonglong =
    libcNewQurtStdlibLlabs(j)

public actual fun div(numer: CInt, denom: CInt): DivT =
    DivT()

public actual fun ldiv(numer: CLong, denom: CLong): LdivT =
    LdivT()

public actual fun lldiv(numer: CLonglong, denom: CLonglong): LldivT =
    LldivT()
