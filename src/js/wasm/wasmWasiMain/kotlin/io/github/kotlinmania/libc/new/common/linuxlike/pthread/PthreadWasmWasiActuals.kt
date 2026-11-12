@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.sys.types.CpuSetT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonLinuxlikePthreadPthreadGetaffinityNp")

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonLinuxlikePthreadPthreadGetattrNp")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonLinuxlikePthreadPthreadGetnameNp")

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonLinuxlikePthreadPthreadSetaffinityNp")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonLinuxlikePthreadPthreadSetnameNp")
