@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import libc.cinterop.libc_dlclose
import libc.cinterop.libc_dlerror

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlopen requires manual FFI bridge — not yet implemented")

public actual fun dlerror(): String? {
    val result = libc_dlerror()
    return result?.toKString()
}

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym requires manual FFI bridge — not yet implemented")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    libc.cinterop.libc_dlclose(handle?.value?.toCPointer<kotlinx.cinterop.ByteVar>())