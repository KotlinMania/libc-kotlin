@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import kotlinx.cinterop.toLong
import libc.cinterop.libc_dlclose
import libc.cinterop.libc_dlerror

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    libc.cinterop
        .libc_dlopen(filename, flag)
        ?.toLong()
        ?.let { COpaquePointer(it) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    libc.cinterop.libc_dlclose(handle?.value?.toCPointer<ByteVar>())

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    libc.cinterop
        .libc_dlsym(handle?.value?.toCPointer<ByteVar>(), symbol)
        ?.toLong()
        ?.let { COpaquePointer(it) }

public actual fun dlerror(): String? =
    libc.cinterop.libc_dlerror()?.toKString()
