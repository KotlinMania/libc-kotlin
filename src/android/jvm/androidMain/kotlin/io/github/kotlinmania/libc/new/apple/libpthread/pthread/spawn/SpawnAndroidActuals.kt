@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.spawn

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT

private object NewAppleLibpthreadPthreadSpawnJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_apple_libpthread_pthread_spawn_posixSpawnattrGetQosClassNp(attr: Long, qosClass: Long): Int
}

public actual fun posixSpawnattrSetQosClassNp(attr: COpaquePointer?, qosClass: QosClassT): CInt =
    0

public actual fun posixSpawnattrGetQosClassNp(attr: COpaquePointer?, qosClass: COpaquePointer?): CInt =
    NewAppleLibpthreadPthreadSpawnJniBridge.libc_new_apple_libpthread_pthread_spawn_posixSpawnattrGetQosClassNp((attr?.value ?: 0L), (qosClass?.value ?: 0L))
