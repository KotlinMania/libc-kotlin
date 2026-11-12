@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.new.netbsd.utmpx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.netbsd.utmp.Utmp
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

public actual fun getutxent(): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxGetutxent")

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxGetutxid")

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxGetutxline")

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxPututxline")

public actual fun updwtmpx(file: ConstPtr<CChar>, ut: ConstPtr<Utmpx>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxUpdwtmpx")

public actual fun getlastlogx(fname: ConstPtr<CChar>, uid: UidT, ll: MutPtr<Lastlogx>): MutPtr<Lastlogx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxGetlastlogx")

public actual fun updlastlogx(fname: ConstPtr<CChar>, uid: UidT, ll: MutPtr<Lastlogx>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxUpdlastlogx")

public actual fun getutmp(ux: ConstPtr<Utmpx>, u: MutPtr<Utmp>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxGetutmp")

public actual fun getutmpx(u: ConstPtr<Utmp>, ux: MutPtr<Utmpx>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxGetutmpx")

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpxUtmpxname")
