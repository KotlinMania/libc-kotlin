@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun pthreadIntrospectionHookInstall(hook: PthreadIntrospectionHookT): PthreadIntrospectionHookT {
    libc.cinterop.libc_introspection_pthread_introspection_hook_install(hook.value.toCPointer<ByteVar>())
    return hook
}

public actual fun pthreadIntrospectionSetspecificNp(thread: PthreadT, key: PthreadKeyT, value: COpaquePointer?): CInt =
    libc.cinterop.libc_introspection_pthread_introspection_setspecific_np(thread.toLong().toCPointer<ByteVar>(), key.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadIntrospectionGetspecificNp(thread: PthreadT, key: PthreadKeyT): COpaquePointer? =
    libc.cinterop.libc_introspection_pthread_introspection_getspecific_np(thread.toLong().toCPointer<ByteVar>(), key.toInt())?.let { COpaquePointer(it.toLong()) }
