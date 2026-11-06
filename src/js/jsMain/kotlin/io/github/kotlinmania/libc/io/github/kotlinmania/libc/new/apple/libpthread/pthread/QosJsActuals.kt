package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.COpaquePointer

public actual fun pthreadAttrSetQosClassNp(attr: PthreadAttrT?, cls: QosClassT, priority: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetQosClassNp(attr?.toLong() ?: 0L, cls, priority)") as CInt

public actual fun pthreadAttrGetQosClassNp(attr: PthreadAttrT?, cls: QosClassT?, priority: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetQosClassNp(attr?.toLong() ?: 0L, cls?.toLong() ?: 0L, priority?.toLong() ?: 0L)") as CInt

public actual fun pthreadSetQosClassSelfNp(cls: QosClassT, priority: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetQosClassSelfNp(cls, priority)") as CInt

public actual fun pthreadGetQosClassNp(thread: PthreadT, cls: QosClassT?, priority: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetQosClassNp(thread, cls?.toLong() ?: 0L, priority?.toLong() ?: 0L)") as CInt
