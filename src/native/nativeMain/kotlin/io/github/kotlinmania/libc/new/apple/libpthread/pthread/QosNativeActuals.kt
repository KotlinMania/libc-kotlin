@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun pthreadAttrSetQosClassNp(attr: PthreadAttrT?, cls: QosClassT, priority: CInt): CInt =
    libc.cinterop.libc_qos_pthread_attr_set_qos_class_np(attr?.value?.toCPointer<ByteVar>(), cls.value.toInt(), priority)

public actual fun pthreadAttrGetQosClassNp(attr: PthreadAttrT?, cls: QosClassT?, priority: CInt?): CInt =
    libc.cinterop.libc_qos_pthread_attr_get_qos_class_np(attr?.value?.toCPointer<ByteVar>(), cls?.value?.toLong()?.toCPointer<ByteVar>(), priority?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetQosClassSelfNp(cls: QosClassT, priority: CInt): CInt =
    libc.cinterop.libc_qos_pthread_set_qos_class_self_np(cls.value.toInt(), priority)

public actual fun pthreadGetQosClassNp(thread: PthreadT, cls: QosClassT?, priority: CInt?): CInt =
    libc.cinterop.libc_qos_pthread_get_qos_class_np(thread.toInt(), cls?.value?.toLong()?.toCPointer<ByteVar>(), priority?.value?.toCPointer<ByteVar>())
