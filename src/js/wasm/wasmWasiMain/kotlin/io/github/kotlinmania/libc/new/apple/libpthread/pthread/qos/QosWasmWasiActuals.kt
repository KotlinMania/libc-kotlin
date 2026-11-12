@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.qos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun pthreadAttrSetQosClassNp(attr: MutPtr<PthreadAttrT>, cls: QosClassT, priority: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewAppleLibpthreadPthreadQosPthreadAttrSetQosClassNp")

public actual fun pthreadAttrGetQosClassNp(attr: MutPtr<PthreadAttrT>, cls: MutPtr<QosClassT>, priority: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewAppleLibpthreadPthreadQosPthreadAttrGetQosClassNp")

public actual fun pthreadSetQosClassSelfNp(cls: QosClassT, priority: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewAppleLibpthreadPthreadQosPthreadSetQosClassSelfNp")

public actual fun pthreadGetQosClassNp(thread: PthreadT, cls: MutPtr<QosClassT>, priority: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewAppleLibpthreadPthreadQosPthreadGetQosClassNp")
