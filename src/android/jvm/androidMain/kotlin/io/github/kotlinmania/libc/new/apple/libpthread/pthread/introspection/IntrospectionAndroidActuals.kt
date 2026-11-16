@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.introspection

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewAppleLibpthreadPthreadIntrospectionJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionHookInstall(hook: Long): Long

    @JvmStatic
    external fun libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionSetspecificNp(thread: Long, key: Long, value: Long): Int

    @JvmStatic
    external fun libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionGetspecificNp(thread: Long, key: Long): Long
}

public actual fun pthreadIntrospectionHookInstall(hook: PthreadIntrospectionHookT): PthreadIntrospectionHookT =
    PthreadIntrospectionHookT { _, _, _, _ -> }

public actual fun pthreadIntrospectionSetspecificNp(thread: PthreadT, key: PthreadKeyT, value: ConstPtr): CInt =
    NewAppleLibpthreadPthreadIntrospectionJniBridge.libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionSetspecificNp(thread.toLong(), key.toLong(), value.rawAddress)

public actual fun pthreadIntrospectionGetspecificNp(thread: PthreadT, key: PthreadKeyT): MutPtr =
    MutPtr(NewAppleLibpthreadPthreadIntrospectionJniBridge.libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionGetspecificNp(thread.toLong(), key.toLong()))
