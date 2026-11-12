@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.new.qurt.dlfcn

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtDlfcnDlopen")

public actual fun dlclose(handle: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtDlfcnDlclose")

public actual fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtDlfcnDlsym")

public actual fun dlerror(): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtDlfcnDlerror")
