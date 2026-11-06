@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadAttrSetQosClassNp(attr: PthreadAttrT?, cls: QosClassT, priority: CInt): CInt =
    io.github.kotlinmania.libc.new.apple.libpthread.pthread.cinterop.libc_qos_pthread_attr_set_qos_class_np(attr?.value?.toCPointer<ByteVar>(), cls.toInt(), priority)

public actual fun pthreadAttrGetQosClassNp(attr: PthreadAttrT?, cls: QosClassT?, priority: CInt?): CInt =
    io.github.kotlinmania.libc.new.apple.libpthread.pthread.cinterop.libc_qos_pthread_attr_get_qos_class_np(attr?.value?.toCPointer<ByteVar>(), cls?.value?.toCPointer<ByteVar>(), priority?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetQosClassSelfNp(cls: QosClassT, priority: CInt): CInt =
    io.github.kotlinmania.libc.new.apple.libpthread.pthread.cinterop.libc_qos_pthread_set_qos_class_self_np(cls.toInt(), priority)

public actual fun pthreadGetQosClassNp(thread: PthreadT, cls: QosClassT?, priority: CInt?): CInt =
    io.github.kotlinmania.libc.new.apple.libpthread.pthread.cinterop.libc_qos_pthread_get_qos_class_np(thread.toInt(), cls?.value?.toCPointer<ByteVar>(), priority?.value?.toCPointer<ByteVar>())
