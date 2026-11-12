@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.new.netbsd.utmp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun utmpname(file: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpUtmpname")

@kotlin.wasm.WasmImport("libc", "libcNewNetbsdUtmpSetutent")
private external fun wasiLibcNewNetbsdUtmpSetutent(): Unit

public actual fun setutent(): Unit =
    wasiLibcNewNetbsdUtmpSetutent()

public actual fun getutent(): MutPtr<Utmp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewNetbsdUtmpGetutent")

@kotlin.wasm.WasmImport("libc", "libcNewNetbsdUtmpEndutent")
private external fun wasiLibcNewNetbsdUtmpEndutent(): Unit

public actual fun endutent(): Unit =
    wasiLibcNewNetbsdUtmpEndutent()
