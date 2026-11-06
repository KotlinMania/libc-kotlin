package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

public actual fun malloc(size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').malloc(size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun calloc(nmemb: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').calloc(nmemb, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').realloc(ptr?.value ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(ptr: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').free(ptr?.value ?: 0L)")
}

public actual fun abort(): Nothing =
    js("require('@kotlinmania/libc-native-bindings').abort()") as Nothing

public actual fun exit(status: CInt): Nothing =
    js("require('@kotlinmania/libc-native-bindings').exit(status)") as Nothing

public actual fun atexit(function: AtexitFunctionCallback): CInt =
    js("require('@kotlinmania/libc-native-bindings').atexit(function)") as CInt

public actual fun getenv(name: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getenv(name)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setenv(name, value, overwrite)") as CInt

public actual fun unsetenv(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').unsetenv(name)") as CInt

public actual fun atoi(nptr: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').atoi(nptr)") as CInt

public actual fun atol(nptr: String?): CLong =
    js("require('@kotlinmania/libc-native-bindings').atol(nptr)") as CLong

public actual fun atoll(nptr: String?): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').atoll(nptr)") as CLonglong

public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').strtol(nptr, endptr?.value ?: 0L, base)") as CLong

public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlong =
    js("require('@kotlinmania/libc-native-bindings').strtoul(nptr, endptr?.value ?: 0L, base)") as CUlong

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').strtoll(nptr, endptr?.value ?: 0L, base)") as CLonglong

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlonglong =
    js("require('@kotlinmania/libc-native-bindings').strtoull(nptr, endptr?.value ?: 0L, base)") as CUlonglong

public actual fun strtod(nptr: String?, endptr: COpaquePointer?): CDouble =
    js("require('@kotlinmania/libc-native-bindings').strtod(nptr, endptr?.value ?: 0L)") as CDouble

public actual fun strtof(nptr: String?, endptr: COpaquePointer?): CFloat =
    js("require('@kotlinmania/libc-native-bindings').strtof(nptr, endptr?.value ?: 0L)") as CFloat

public actual fun rand(): CInt =
    js("require('@kotlinmania/libc-native-bindings').rand()") as CInt

public actual fun srand(seed: CUint) {
    js("require('@kotlinmania/libc-native-bindings').srand(seed)")
}

public actual fun qsort(base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback) {
    js("require('@kotlinmania/libc-native-bindings').qsort(base?.value ?: 0L, nmemb, size, compar)")
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').bsearch(key?.value ?: 0L, base?.value ?: 0L, nmemb, size, compar)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun abs(j: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').abs(j)") as CInt

public actual fun labs(j: CLong): CLong =
    js("require('@kotlinmania/libc-native-bindings').labs(j)") as CLong

public actual fun llabs(j: CLonglong): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').llabs(j)") as CLonglong

public actual fun div(numer: CInt, denom: CInt): DivT =
    js("require('@kotlinmania/libc-native-bindings').div(numer, denom)") as DivT

public actual fun ldiv(numer: CLong, denom: CLong): LdivT =
    js("require('@kotlinmania/libc-native-bindings').ldiv(numer, denom)") as LdivT

public actual fun lldiv(numer: CLonglong, denom: CLonglong): LldivT =
    js("require('@kotlinmania/libc-native-bindings').lldiv(numer, denom)") as LldivT
