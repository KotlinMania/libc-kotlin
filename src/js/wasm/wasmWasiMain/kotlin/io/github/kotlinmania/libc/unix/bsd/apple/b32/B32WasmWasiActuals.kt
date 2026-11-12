@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun exchangedata(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>, options: CUlong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleB32Exchangedata")
