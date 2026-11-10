@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

public actual fun utmpname(file: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setutent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getutent(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endutent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
