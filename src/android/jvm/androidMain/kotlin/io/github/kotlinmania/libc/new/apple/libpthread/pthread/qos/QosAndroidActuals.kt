@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.qos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT
import io.github.kotlinmania.libc.new.qurt.PthreadT

private object NewAppleLibpthreadPthreadQosJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_apple_libpthread_pthread_qos_pthreadAttrGetQosClassNp(attr: Long, cls: Long, priority: Long): Int

    @JvmStatic
    external fun libc_new_apple_libpthread_pthread_qos_pthreadGetQosClassNp(thread: Long, cls: Long, priority: Long): Int
}

public actual fun pthreadAttrSetQosClassNp(attr: COpaquePointer?, cls: QosClassT, priority: CInt): CInt =
    0

public actual fun pthreadAttrGetQosClassNp(attr: COpaquePointer?, cls: COpaquePointer?, priority: COpaquePointer?): CInt =
    NewAppleLibpthreadPthreadQosJniBridge.libc_new_apple_libpthread_pthread_qos_pthreadAttrGetQosClassNp((attr?.value ?: 0L), (cls?.value ?: 0L), (priority?.value ?: 0L))

public actual fun pthreadSetQosClassSelfNp(cls: QosClassT, priority: CInt): CInt =
    0

public actual fun pthreadGetQosClassNp(thread: PthreadT, cls: COpaquePointer?, priority: COpaquePointer?): CInt =
    NewAppleLibpthreadPthreadQosJniBridge.libc_new_apple_libpthread_pthread_qos_pthreadGetQosClassNp(thread.toLong(), (cls?.value ?: 0L), (priority?.value ?: 0L))
