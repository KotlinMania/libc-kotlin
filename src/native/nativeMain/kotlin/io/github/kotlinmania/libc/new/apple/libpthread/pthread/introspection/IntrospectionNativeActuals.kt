@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.introspection

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.introspection.cinterop.libc_new_apple_libpthread_pthread_introspection_pthreadIntrospectionGetspecificNp
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.introspection.cinterop.libc_new_apple_libpthread_pthread_introspection_pthreadIntrospectionSetspecificNp
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun pthreadIntrospectionHookInstall(hook: PthreadIntrospectionHookT): PthreadIntrospectionHookT =
    PthreadIntrospectionHookT { _, _, _, _ -> }

public actual fun pthreadIntrospectionSetspecificNp(thread: PthreadT, key: PthreadKeyT, value: COpaquePointer?): CInt =
    libc_new_apple_libpthread_pthread_introspection_pthreadIntrospectionSetspecificNp(thread.toLong().toCPointer<ByteVar>(), key, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadIntrospectionGetspecificNp(thread: PthreadT, key: PthreadKeyT): COpaquePointer? =
    libc_new_apple_libpthread_pthread_introspection_pthreadIntrospectionGetspecificNp(thread.toLong().toCPointer<ByteVar>(), key)?.let { COpaquePointer(it.toLong()) }
