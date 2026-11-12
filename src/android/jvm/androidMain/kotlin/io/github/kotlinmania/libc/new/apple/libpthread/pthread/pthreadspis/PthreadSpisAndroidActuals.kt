@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.pthreadspis

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewAppleLibpthreadPthreadPthreadspisPthreadSpisJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewAppleLibpthreadPthreadPthreadspisPthreadSpisPthreadCreateFromMachThread(thread: Long, attr: Long, f: Long, value: Long): Int
}

public actual fun pthreadCreateFromMachThread(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFromMachThreadFCallback, value: MutPtr<CVoid>): CInt =
    NewAppleLibpthreadPthreadPthreadspisPthreadSpisJniBridge.libcNewAppleLibpthreadPthreadPthreadspisPthreadSpisPthreadCreateFromMachThread(thread.rawAddress, attr.rawAddress, 0L, value.rawAddress)
