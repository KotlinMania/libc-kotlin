@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.new.qurt.sys.mman

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSysMmanMmap")

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSysMmanMunmap")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSysMmanMprotect")

public actual fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSysMmanMlock")

public actual fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSysMmanMunlock")

@kotlin.wasm.WasmImport("libc", "libcNewQurtSysMmanMlockall")
private external fun wasiLibcNewQurtSysMmanMlockall(flags: Int): Int

public actual fun mlockall(flags: CInt): CInt =
    wasiLibcNewQurtSysMmanMlockall(flags).toInt()

@kotlin.wasm.WasmImport("libc", "libcNewQurtSysMmanMunlockall")
private external fun wasiLibcNewQurtSysMmanMunlockall(): Int

public actual fun munlockall(): CInt =
    wasiLibcNewQurtSysMmanMunlockall().toInt()

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSysMmanMsync")
