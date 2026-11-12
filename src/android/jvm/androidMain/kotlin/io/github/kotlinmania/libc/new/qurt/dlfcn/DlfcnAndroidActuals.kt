@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.dlfcn

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtDlfcnJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewQurtDlfcnDlopen(filename: Long, flag: Int): Long

    @JvmStatic
    external fun libcNewQurtDlfcnDlclose(handle: Long): Int

    @JvmStatic
    external fun libcNewQurtDlfcnDlsym(handle: Long, symbol: Long): Long

    @JvmStatic
    external fun libcNewQurtDlfcnDlerror(): Long
}

public actual fun dlopen(filename: ConstPtr, flag: CInt): MutPtr =
    MutPtr(NewQurtDlfcnJniBridge.libcNewQurtDlfcnDlopen(filename.rawAddress, flag))

public actual fun dlclose(handle: MutPtr): CInt =
    NewQurtDlfcnJniBridge.libcNewQurtDlfcnDlclose(handle.rawAddress)

public actual fun dlsym(handle: MutPtr, symbol: ConstPtr): MutPtr =
    MutPtr(NewQurtDlfcnJniBridge.libcNewQurtDlfcnDlsym(handle.rawAddress, symbol.rawAddress))

public actual fun dlerror(): MutPtr =
    MutPtr(NewQurtDlfcnJniBridge.libcNewQurtDlfcnDlerror())
