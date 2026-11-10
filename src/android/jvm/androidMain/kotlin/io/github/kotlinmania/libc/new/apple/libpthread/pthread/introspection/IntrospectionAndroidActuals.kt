@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.introspection

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadT

private object NewAppleLibpthreadPthreadIntrospectionJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_apple_libpthread_pthread_introspection_pthreadIntrospectionHookInstall(hook: Long): Long

    @JvmStatic
    external fun libc_new_apple_libpthread_pthread_introspection_pthreadIntrospectionSetspecificNp(thread: Long, key: Long, value: Long): Int

    @JvmStatic
    external fun libc_new_apple_libpthread_pthread_introspection_pthreadIntrospectionGetspecificNp(thread: Long, key: Long): Long
}

public actual fun pthreadIntrospectionHookInstall(hook: PthreadIntrospectionHookT): PthreadIntrospectionHookT =
    PthreadIntrospectionHookT { _, _, _, _ -> }

public actual fun pthreadIntrospectionSetspecificNp(thread: PthreadT, key: PthreadKeyT, value: COpaquePointer?): CInt =
    NewAppleLibpthreadPthreadIntrospectionJniBridge.libc_new_apple_libpthread_pthread_introspection_pthreadIntrospectionSetspecificNp(thread.toLong(), key.toLong(), (value?.value ?: 0L))

public actual fun pthreadIntrospectionGetspecificNp(thread: PthreadT, key: PthreadKeyT): COpaquePointer? =
    NewAppleLibpthreadPthreadIntrospectionJniBridge.libc_new_apple_libpthread_pthread_introspection_pthreadIntrospectionGetspecificNp(thread.toLong(), key.toLong()).let { if (it == 0L) null else COpaquePointer(it) }
