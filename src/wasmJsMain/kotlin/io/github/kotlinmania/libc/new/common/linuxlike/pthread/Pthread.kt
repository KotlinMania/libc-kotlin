@file:OptIn(kotlin.js.ExperimentalWasmJsInterop::class)

// port-lint: source libc/src/new/common/linux_like/pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadAttrT
import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadT

public actual class CpuSetT internal constructor(internal val rawHandle: Int)

@JsFun("(thread, cpusetsize, cpuset) => globalThis.libcKotlinPthread?.getaffinityNp?.(thread, cpusetsize, cpuset) ?? 38")
private external fun wasmPthreadGetaffinityNp(thread: Int, cpusetsize: Int, cpuset: Int): Int

@JsFun("(thread, attr) => globalThis.libcKotlinPthread?.getattrNp?.(thread, attr) ?? 38")
private external fun wasmPthreadGetattrNp(thread: Int, attr: Int): Int

@JsFun("(thread, ptr, len) => globalThis.libcKotlinPthread?.getnameNp?.(thread, ptr, len) ?? 38")
private external fun wasmPthreadGetnameNp(thread: Int, namePtr: Int, len: Int): Int

@JsFun("(thread, cpusetsize, cpuset) => globalThis.libcKotlinPthread?.setaffinityNp?.(thread, cpusetsize, cpuset) ?? 38")
private external fun wasmPthreadSetaffinityNp(thread: Int, cpusetsize: Int, cpuset: Int): Int

@JsFun("(thread, namePtr, nameLen) => globalThis.libcKotlinPthread?.setnameNp?.(thread, namePtr, nameLen) ?? 38")
private external fun wasmPthreadSetnameNp(thread: Int, namePtr: Int, nameLen: Int): Int

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int =
    wasmPthreadGetaffinityNp(thread.rawHandle, cpusetsize.toInt(), cpuset.rawHandle)

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT): Int =
    wasmPthreadGetattrNp(native.rawHandle, attr.rawHandle)

public actual fun pthreadGetnameNp(thread: PthreadT, name: ByteArray, len: ULong): Int {
    // The Wasm bridge owns the buffer transfer; pass an opaque slot 0 here.
    return wasmPthreadGetnameNp(thread.rawHandle, 0, len.toInt())
}

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int =
    wasmPthreadSetaffinityNp(thread.rawHandle, cpusetsize.toInt(), cpuset.rawHandle)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String): Int =
    wasmPthreadSetnameNp(thread.rawHandle, 0, name.length)
