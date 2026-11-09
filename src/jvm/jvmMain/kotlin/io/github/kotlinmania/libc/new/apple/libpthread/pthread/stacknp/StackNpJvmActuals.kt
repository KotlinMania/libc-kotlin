@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.stacknp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.UintptrT

private object NewAppleLibpthreadPthreadStacknpStackNpJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_apple_libpthread_pthread_stacknp_stack_np_pthreadStackFrameDecodeNp(frameAddr: Long, returnAddr: Long): Long
}

public actual fun pthreadStackFrameDecodeNp(frameAddr: UintptrT, returnAddr: COpaquePointer?): UintptrT =
    NewAppleLibpthreadPthreadStacknpStackNpJniBridge.libc_new_apple_libpthread_pthread_stacknp_stack_np_pthreadStackFrameDecodeNp(frameAddr.toLong(), (returnAddr?.value ?: 0L)).toULong()
