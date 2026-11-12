@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.new.netbsd.utmpx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.UidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcNewNetbsdUtmpxSetutxent")
private external fun wasiLibcNewNetbsdUtmpxSetutxent(): Unit

public actual fun setutxent(): Unit =
    wasiLibcNewNetbsdUtmpxSetutxent()

@kotlin.wasm.WasmImport("libc", "libcNewNetbsdUtmpxEndutxent")
private external fun wasiLibcNewNetbsdUtmpxEndutxent(): Unit

public actual fun endutxent(): Unit =
    wasiLibcNewNetbsdUtmpxEndutxent()

public actual fun getutxent(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxGetutxent")

public actual fun getutxid(ut: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxGetutxid")

public actual fun getutxline(ut: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxGetutxline")

public actual fun pututxline(ut: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxPututxline")

public actual fun updwtmpx(file: ConstPtr, ut: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxUpdwtmpx")

public actual fun getlastlogx(fname: ConstPtr, uid: UidT, ll: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxGetlastlogx")

public actual fun updlastlogx(fname: ConstPtr, uid: UidT, ll: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxUpdlastlogx")

public actual fun getutmp(ux: ConstPtr, u: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxGetutmp")

public actual fun getutmpx(u: ConstPtr, ux: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxGetutmpx")

public actual fun utmpxname(file: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxUtmpxname")
