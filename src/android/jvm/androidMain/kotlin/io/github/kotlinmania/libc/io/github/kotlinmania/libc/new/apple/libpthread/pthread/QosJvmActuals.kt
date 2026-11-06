package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.COpaquePointer

internal object QosRawLibc {
    external fun pthreadAttrSetQosClassNp(attr: Long, cls: Long, priority: Int): Int
    external fun pthreadAttrGetQosClassNp(attr: Long, cls: Long, priority: Long): Int
    external fun pthreadSetQosClassSelfNp(cls: Long, priority: Int): Int
    external fun pthreadGetQosClassNp(thread: Long, cls: Long, priority: Long): Int
}

public actual fun pthreadAttrSetQosClassNp(attr: PthreadAttrT?, cls: QosClassT, priority: CInt): CInt =
    QosRawLibc.pthreadAttrSetQosClassNp(attr?.toLong() ?: 0L, cls, priority)

public actual fun pthreadAttrGetQosClassNp(attr: PthreadAttrT?, cls: QosClassT?, priority: CInt?): CInt =
    QosRawLibc.pthreadAttrGetQosClassNp(attr?.toLong() ?: 0L, cls?.toLong() ?: 0L, priority?.toLong() ?: 0L)

public actual fun pthreadSetQosClassSelfNp(cls: QosClassT, priority: CInt): CInt =
    QosRawLibc.pthreadSetQosClassSelfNp(cls, priority)

public actual fun pthreadGetQosClassNp(thread: PthreadT, cls: QosClassT?, priority: CInt?): CInt =
    QosRawLibc.pthreadGetQosClassNp(thread, cls?.toLong() ?: 0L, priority?.toLong() ?: 0L)
