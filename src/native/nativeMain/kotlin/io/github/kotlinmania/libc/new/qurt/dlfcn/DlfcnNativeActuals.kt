@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.dlfcn

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.dlfcn.cinterop.libcNewQurtDlfcnDlclose
import io.github.kotlinmania.libc.new.qurt.dlfcn.cinterop.libcNewQurtDlfcnDlerror
import io.github.kotlinmania.libc.new.qurt.dlfcn.cinterop.libcNewQurtDlfcnDlopen
import io.github.kotlinmania.libc.new.qurt.dlfcn.cinterop.libcNewQurtDlfcnDlsym
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun dlopen(filename: ConstPtr, flag: CInt): MutPtr =
    MutPtr(libcNewQurtDlfcnDlopen(filename.rawAddress.toCPointer<ByteVar>(), flag)?.toLong() ?: 0L)

public actual fun dlclose(handle: MutPtr): CInt =
    libcNewQurtDlfcnDlclose(handle.rawAddress.toCPointer<ByteVar>())

public actual fun dlsym(handle: MutPtr, symbol: ConstPtr): MutPtr =
    MutPtr(libcNewQurtDlfcnDlsym(handle.rawAddress.toCPointer<ByteVar>(), symbol.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dlerror(): MutPtr =
    MutPtr(libcNewQurtDlfcnDlerror()?.toLong() ?: 0L)
