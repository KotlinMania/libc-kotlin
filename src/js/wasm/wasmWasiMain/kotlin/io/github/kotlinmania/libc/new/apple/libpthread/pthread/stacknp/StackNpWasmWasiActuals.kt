@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.stacknp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.UintptrT

public actual fun pthreadStackFrameDecodeNp(frameAddr: UintptrT, returnAddr: COpaquePointer?): UintptrT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
