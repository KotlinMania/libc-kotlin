@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.spawn

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT

public actual fun posixSpawnattrSetQosClassNp(attr: COpaquePointer?, qosClass: QosClassT): CInt =
    0

public actual fun posixSpawnattrGetQosClassNp(attr: COpaquePointer?, qosClass: COpaquePointer?): CInt =
    0
