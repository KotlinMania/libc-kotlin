@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun pthreadIntrospectionHookInstall(hook: PthreadIntrospectionHookT): PthreadIntrospectionHookT =
    io.github.kotlinmania.libc.new.apple.libpthread.pthread.cinterop.libc_introspection_pthread_introspection_hook_install(hook.toInt())

public actual fun pthreadIntrospectionSetspecificNp(thread: PthreadT, key: PthreadKeyT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.apple.libpthread.pthread.cinterop.libc_introspection_pthread_introspection_setspecific_np(thread.toInt(), key.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadIntrospectionGetspecificNp(thread: PthreadT, key: PthreadKeyT): COpaquePointer? =
    io.github.kotlinmania.libc.new.apple.libpthread.pthread.cinterop.libc_introspection_pthread_introspection_getspecific_np(thread.toInt(), key.toInt())?.let { COpaquePointer(it.toLong()) }
