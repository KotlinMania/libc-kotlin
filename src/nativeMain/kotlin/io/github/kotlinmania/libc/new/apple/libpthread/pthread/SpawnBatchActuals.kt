// port-lint: source Spawn.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun posixSpawnattrSetQosClassNp(attr: io.github.kotlinmania.libc.COpaquePointer?, qosClass: QosClassT): Int =
    throw UnsupportedOperationException("posixSpawnattrSetQosClassNp requires manual FFI bridge for ambiguous type")

public actual fun posixSpawnattrGetQosClassNp(attr: io.github.kotlinmania.libc.COpaquePointer?, qosClass: QosClassT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetQosClassNp requires manual FFI bridge for ambiguous type")
