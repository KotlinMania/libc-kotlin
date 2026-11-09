@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.dlfcn

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

private object NewQurtDlfcnJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_qurt_dlfcn_dlopen(filename: String?, flag: Int): Long

    @JvmStatic
    external fun libc_new_qurt_dlfcn_dlclose(handle: Long): Int

    @JvmStatic
    external fun libc_new_qurt_dlfcn_dlsym(handle: Long, symbol: String?): Long

    @JvmStatic
    external fun libc_new_qurt_dlfcn_dlerror(): Long
}

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    NewQurtDlfcnJniBridge.libc_new_qurt_dlfcn_dlopen(filename, flag).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    NewQurtDlfcnJniBridge.libc_new_qurt_dlfcn_dlclose((handle?.value ?: 0L))

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    NewQurtDlfcnJniBridge.libc_new_qurt_dlfcn_dlsym((handle?.value ?: 0L), symbol).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlerror(): COpaquePointer? =
    NewQurtDlfcnJniBridge.libc_new_qurt_dlfcn_dlerror().let { if (it == 0L) null else COpaquePointer(it) }
