@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

public actual fun getcontext(ucp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setcontext(ucp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun makecontext(ucp: COpaquePointer?, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
