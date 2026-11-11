@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.spawn

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.spawn.cinterop.libc_new_apple_libpthread_pthread_spawn_posixSpawnattrGetQosClassNp
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun posixSpawnattrSetQosClassNp(attr: COpaquePointer?, qosClass: QosClassT): CInt =
    0

public actual fun posixSpawnattrGetQosClassNp(attr: COpaquePointer?, qosClass: COpaquePointer?): CInt =
    libc_new_apple_libpthread_pthread_spawn_posixSpawnattrGetQosClassNp(attr?.value?.toCPointer<ByteVar>(), qosClass?.value?.toCPointer<ByteVar>())
