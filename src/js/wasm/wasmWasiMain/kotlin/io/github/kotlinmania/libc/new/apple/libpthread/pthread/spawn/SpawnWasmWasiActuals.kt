@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.spawn

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun posixSpawnattrSetQosClassNp(attr: MutPtr, qosClass: QosClassT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewAppleLibpthreadPthreadSpawnPosixSpawnattrSetQosClassNp")

public actual fun posixSpawnattrGetQosClassNp(attr: ConstPtr, qosClass: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewAppleLibpthreadPthreadSpawnPosixSpawnattrGetQosClassNp")
