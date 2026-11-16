@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.qos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewAppleLibpthreadPthreadQosJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewAppleLibpthreadPthreadQosPthreadAttrGetQosClassNp(attr: Long, cls: Long, priority: Long): Int

    @JvmStatic
    external fun libcNewAppleLibpthreadPthreadQosPthreadGetQosClassNp(thread: Long, cls: Long, priority: Long): Int
}

public actual fun pthreadAttrSetQosClassNp(attr: MutPtr, cls: QosClassT, priority: CInt): CInt =
    0

public actual fun pthreadAttrGetQosClassNp(attr: MutPtr, cls: MutPtr, priority: MutPtr): CInt =
    NewAppleLibpthreadPthreadQosJniBridge.libcNewAppleLibpthreadPthreadQosPthreadAttrGetQosClassNp(attr.rawAddress, cls.rawAddress, priority.rawAddress)

public actual fun pthreadSetQosClassSelfNp(cls: QosClassT, priority: CInt): CInt =
    0

public actual fun pthreadGetQosClassNp(thread: PthreadT, cls: MutPtr, priority: MutPtr): CInt =
    NewAppleLibpthreadPthreadQosJniBridge.libcNewAppleLibpthreadPthreadQosPthreadGetQosClassNp(thread.toLong(), cls.rawAddress, priority.rawAddress)
