@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.introspection

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.introspection.cinterop.libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionGetspecificNp
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.introspection.cinterop.libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionSetspecificNp
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun pthreadIntrospectionHookInstall(hook: PthreadIntrospectionHookT): PthreadIntrospectionHookT =
    PthreadIntrospectionHookT { _, _, _, _ -> }

public actual fun pthreadIntrospectionSetspecificNp(thread: PthreadT, key: PthreadKeyT, value: ConstPtr): CInt =
    libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionSetspecificNp(thread.toLong().toCPointer<ByteVar>(), key, value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadIntrospectionGetspecificNp(thread: PthreadT, key: PthreadKeyT): MutPtr =
    MutPtr(libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionGetspecificNp(thread.toLong().toCPointer<ByteVar>(), key)?.toLong() ?: 0L)
