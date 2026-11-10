@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.errno

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

public actual fun errnoLocation(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
