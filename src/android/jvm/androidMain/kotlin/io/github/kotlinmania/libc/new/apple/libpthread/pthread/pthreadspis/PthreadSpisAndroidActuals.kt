@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.pthreadspis

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

private object NewAppleLibpthreadPthreadPthreadspisPthreadSpisJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_apple_libpthread_pthread_pthreadspis_pthread_spis_pthreadCreateFromMachThread(thread: Long, attr: Long, f: Long, value: Long): Int
}

public actual fun pthreadCreateFromMachThread(thread: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFromMachThreadFCallback, value: COpaquePointer?): CInt =
    NewAppleLibpthreadPthreadPthreadspisPthreadSpisJniBridge.libc_new_apple_libpthread_pthread_pthreadspis_pthread_spis_pthreadCreateFromMachThread((thread?.value ?: 0L), (attr?.value ?: 0L), 0L, (value?.value ?: 0L))
