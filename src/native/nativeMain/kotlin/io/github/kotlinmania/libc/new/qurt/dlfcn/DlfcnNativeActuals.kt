@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.dlfcn

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.dlfcn.cinterop.libc_new_qurt_dlfcn_dlclose
import io.github.kotlinmania.libc.new.qurt.dlfcn.cinterop.libc_new_qurt_dlfcn_dlerror
import io.github.kotlinmania.libc.new.qurt.dlfcn.cinterop.libc_new_qurt_dlfcn_dlopen
import io.github.kotlinmania.libc.new.qurt.dlfcn.cinterop.libc_new_qurt_dlfcn_dlsym
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    libc_new_qurt_dlfcn_dlopen(filename, flag)?.let { COpaquePointer(it.toLong()) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    libc_new_qurt_dlfcn_dlclose(handle?.value?.toCPointer<ByteVar>())

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    libc_new_qurt_dlfcn_dlsym(handle?.value?.toCPointer<ByteVar>(), symbol)?.let { COpaquePointer(it.toLong()) }

public actual fun dlerror(): COpaquePointer? =
    libc_new_qurt_dlfcn_dlerror()?.let { COpaquePointer(it.toLong()) }
