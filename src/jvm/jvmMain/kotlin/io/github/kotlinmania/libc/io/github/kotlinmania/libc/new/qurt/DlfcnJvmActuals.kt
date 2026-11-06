package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

internal object DlfcnRawLibc {
    external fun dlopen(filename: String?, flag: Int): Long?
    external fun dlclose(handle: Long): Int
    external fun dlsym(handle: Long, symbol: String?): Long?
    external fun dlerror(): Long?
}

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    DlfcnRawLibc.dlopen(filename, flag).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    DlfcnRawLibc.dlclose(handle?.value ?: 0L)

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    DlfcnRawLibc.dlsym(handle?.value ?: 0L, symbol).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlerror(): COpaquePointer? =
    DlfcnRawLibc.dlerror().let { if (it == 0L) null else COpaquePointer(it) }
