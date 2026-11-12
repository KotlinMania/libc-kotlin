@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.dlfcn

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ffi.CVoid
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

public actual fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    MutPtr(NewQurtDlfcnJniBridge.libcNewQurtDlfcnDlopen(filename.rawAddress, flag))

public actual fun dlclose(handle: MutPtr<CVoid>): CInt =
    NewQurtDlfcnJniBridge.libcNewQurtDlfcnDlclose(handle.rawAddress)

public actual fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid> =
    MutPtr(NewQurtDlfcnJniBridge.libcNewQurtDlfcnDlsym(handle.rawAddress, symbol.rawAddress))

public actual fun dlerror(): MutPtr<CChar> =
    MutPtr(NewQurtDlfcnJniBridge.libcNewQurtDlfcnDlerror())
