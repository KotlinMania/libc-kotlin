@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.stacknp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.qurt.UintptrT
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun pthreadStackFrameDecodeNp(frameAddr: UintptrT, returnAddr: MutPtr<UintptrT>): UintptrT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewAppleLibpthreadPthreadStacknpStackNpPthreadStackFrameDecodeNp")
