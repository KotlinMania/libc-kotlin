package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

internal object StdlibRawLibc {
    external fun malloc(size: Long): Long?
    external fun calloc(nmemb: Long, size: Long): Long?
    external fun realloc(ptr: Long, size: Long): Long?
    external fun free(ptr: Long)
    external fun abort(): Long
    external fun exit(status: Int): Long
    external fun atexit(function: Long): Int
    external fun getenv(name: String?): Long?
    external fun setenv(name: String?, value: String?, overwrite: Int): Int
    external fun unsetenv(name: String?): Int
    external fun atoi(nptr: String?): Int
    external fun atol(nptr: String?): Long
    external fun atoll(nptr: String?): Long
    external fun strtol(nptr: String?, endptr: Long, base: Int): Long
    external fun strtoul(nptr: String?, endptr: Long, base: Int): Long
    external fun strtoll(nptr: String?, endptr: Long, base: Int): Long
    external fun strtoull(nptr: String?, endptr: Long, base: Int): Long
    external fun strtod(nptr: String?, endptr: Long): Double
    external fun strtof(nptr: String?, endptr: Long): Float
    external fun rand(): Int
    external fun srand(seed: Int)
    external fun qsort(base: Long, nmemb: Long, size: Long, compar: Long)
    external fun bsearch(key: Long, base: Long, nmemb: Long, size: Long, compar: Long): Long?
    external fun abs(j: Int): Int
    external fun labs(j: Long): Long
    external fun llabs(j: Long): Long
    external fun div(numer: Int, denom: Int): Long
    external fun ldiv(numer: Long, denom: Long): Long
    external fun lldiv(numer: Long, denom: Long): Long
}

public actual fun malloc(size: SizeT): COpaquePointer? =
    StdlibRawLibc.malloc(size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun calloc(nmemb: SizeT, size: SizeT): COpaquePointer? =
    StdlibRawLibc.calloc(nmemb, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    StdlibRawLibc.realloc(ptr?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(ptr: COpaquePointer?) {
    StdlibRawLibc.free(ptr?.value ?: 0L)
}

public actual fun abort(): Nothing =
    StdlibRawLibc.abort()

public actual fun exit(status: CInt): Nothing =
    StdlibRawLibc.exit(status)

public actual fun atexit(function: AtexitFunctionCallback): CInt =
    StdlibRawLibc.atexit(function)

public actual fun getenv(name: String?): COpaquePointer? =
    StdlibRawLibc.getenv(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    StdlibRawLibc.setenv(name, value, overwrite)

public actual fun unsetenv(name: String?): CInt =
    StdlibRawLibc.unsetenv(name)

public actual fun atoi(nptr: String?): CInt =
    StdlibRawLibc.atoi(nptr)

public actual fun atol(nptr: String?): CLong =
    StdlibRawLibc.atol(nptr)

public actual fun atoll(nptr: String?): CLonglong =
    StdlibRawLibc.atoll(nptr)

public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong =
    StdlibRawLibc.strtol(nptr, endptr?.value ?: 0L, base)

public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlong =
    StdlibRawLibc.strtoul(nptr, endptr?.value ?: 0L, base)

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLonglong =
    StdlibRawLibc.strtoll(nptr, endptr?.value ?: 0L, base)

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlonglong =
    StdlibRawLibc.strtoull(nptr, endptr?.value ?: 0L, base)

public actual fun strtod(nptr: String?, endptr: COpaquePointer?): CDouble =
    StdlibRawLibc.strtod(nptr, endptr?.value ?: 0L)

public actual fun strtof(nptr: String?, endptr: COpaquePointer?): CFloat =
    StdlibRawLibc.strtof(nptr, endptr?.value ?: 0L)

public actual fun rand(): CInt =
    StdlibRawLibc.rand()

public actual fun srand(seed: CUint) {
    StdlibRawLibc.srand(seed)
}

public actual fun qsort(base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback) {
    StdlibRawLibc.qsort(base?.value ?: 0L, nmemb, size, compar)
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): COpaquePointer? =
    StdlibRawLibc.bsearch(key?.value ?: 0L, base?.value ?: 0L, nmemb, size, compar).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun abs(j: CInt): CInt =
    StdlibRawLibc.abs(j)

public actual fun labs(j: CLong): CLong =
    StdlibRawLibc.labs(j)

public actual fun llabs(j: CLonglong): CLonglong =
    StdlibRawLibc.llabs(j)

public actual fun div(numer: CInt, denom: CInt): DivT =
    StdlibRawLibc.div(numer, denom)

public actual fun ldiv(numer: CLong, denom: CLong): LdivT =
    StdlibRawLibc.ldiv(numer, denom)

public actual fun lldiv(numer: CLonglong, denom: CLonglong): LldivT =
    StdlibRawLibc.lldiv(numer, denom)
