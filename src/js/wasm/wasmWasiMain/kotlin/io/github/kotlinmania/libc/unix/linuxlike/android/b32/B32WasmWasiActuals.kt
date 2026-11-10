@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

public actual fun timegm64(tm: COpaquePointer?): Time64T =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
