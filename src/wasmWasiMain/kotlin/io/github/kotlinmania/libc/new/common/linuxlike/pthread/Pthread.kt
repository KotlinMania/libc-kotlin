@file:OptIn(kotlin.wasm.ExperimentalWasmInterop::class)

// port-lint: source new/common/linux_like/pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadAttrT
import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadT
import kotlin.wasm.WasmImport

public actual class CpuSetT internal constructor(internal val rawHandle: Int)

@WasmImport("libc_kotlin_pthread", "getaffinity_np")
private external fun wasiPthreadGetaffinityNp(thread: Int, cpusetsize: Int, cpuset: Int): Int

@WasmImport("libc_kotlin_pthread", "getattr_np")
private external fun wasiPthreadGetattrNp(thread: Int, attr: Int): Int

@WasmImport("libc_kotlin_pthread", "getname_np")
private external fun wasiPthreadGetnameNp(thread: Int, namePtr: Int, len: Int): Int

@WasmImport("libc_kotlin_pthread", "setaffinity_np")
private external fun wasiPthreadSetaffinityNp(thread: Int, cpusetsize: Int, cpuset: Int): Int

@WasmImport("libc_kotlin_pthread", "setname_np")
private external fun wasiPthreadSetnameNp(thread: Int, namePtr: Int, nameLen: Int): Int

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int =
    wasiPthreadGetaffinityNp(thread.rawHandle, cpusetsize.toInt(), cpuset.rawHandle)

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT): Int =
    wasiPthreadGetattrNp(native.rawHandle, attr.rawHandle)

public actual fun pthreadGetnameNp(thread: PthreadT, name: ByteArray, len: ULong): Int =
    wasiPthreadGetnameNp(thread.rawHandle, 0, len.toInt())

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int =
    wasiPthreadSetaffinityNp(thread.rawHandle, cpusetsize.toInt(), cpuset.rawHandle)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String): Int =
    wasiPthreadSetnameNp(thread.rawHandle, 0, name.length)
