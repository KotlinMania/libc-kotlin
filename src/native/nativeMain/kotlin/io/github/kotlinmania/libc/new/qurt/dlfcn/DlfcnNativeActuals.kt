@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.dlfcn

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.dlfcn.cinterop.libcNewQurtDlfcnDlclose
import io.github.kotlinmania.libc.new.qurt.dlfcn.cinterop.libcNewQurtDlfcnDlerror
import io.github.kotlinmania.libc.new.qurt.dlfcn.cinterop.libcNewQurtDlfcnDlopen
import io.github.kotlinmania.libc.new.qurt.dlfcn.cinterop.libcNewQurtDlfcnDlsym
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    MutPtr(libcNewQurtDlfcnDlopen(filename.rawAddress.toCPointer<ByteVar>(), flag)?.toLong() ?: 0L)

public actual fun dlclose(handle: MutPtr<CVoid>): CInt =
    libcNewQurtDlfcnDlclose(handle.rawAddress.toCPointer<ByteVar>())

public actual fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid> =
    MutPtr(libcNewQurtDlfcnDlsym(handle.rawAddress.toCPointer<ByteVar>(), symbol.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dlerror(): MutPtr<CChar> =
    MutPtr(libcNewQurtDlfcnDlerror()?.toLong() ?: 0L)
