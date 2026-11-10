@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.spawn

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT

public actual fun posixSpawnattrSetQosClassNp(attr: COpaquePointer?, qosClass: QosClassT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrGetQosClassNp(attr: COpaquePointer?, qosClass: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
