@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.qos

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.qos.cinterop.libc_new_apple_libpthread_pthread_qos_pthreadAttrGetQosClassNp
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.qos.cinterop.libc_new_apple_libpthread_pthread_qos_pthreadGetQosClassNp
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadAttrSetQosClassNp(attr: COpaquePointer?, cls: QosClassT, priority: CInt): CInt =
    0

public actual fun pthreadAttrGetQosClassNp(attr: COpaquePointer?, cls: COpaquePointer?, priority: COpaquePointer?): CInt =
    libc_new_apple_libpthread_pthread_qos_pthreadAttrGetQosClassNp(attr?.value?.toCPointer<ByteVar>(), cls?.value?.toCPointer<ByteVar>(), priority?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetQosClassSelfNp(cls: QosClassT, priority: CInt): CInt =
    0

public actual fun pthreadGetQosClassNp(thread: PthreadT, cls: COpaquePointer?, priority: COpaquePointer?): CInt =
    libc_new_apple_libpthread_pthread_qos_pthreadGetQosClassNp(thread.toLong().toCPointer<ByteVar>(), cls?.value?.toCPointer<ByteVar>(), priority?.value?.toCPointer<ByteVar>())
