@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT

private object NewCommonLinuxlikePthreadJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_common_linuxlike_pthread_pthreadGetaffinityNp(thread: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_new_common_linuxlike_pthread_pthreadGetattrNp(native: Long, attr: Long): Int

    @JvmStatic
    external fun libc_new_common_linuxlike_pthread_pthreadGetnameNp(thread: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libc_new_common_linuxlike_pthread_pthreadSetaffinityNp(thread: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_new_common_linuxlike_pthread_pthreadSetnameNp(thread: Long, name: String?): Int
}

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    NewCommonLinuxlikePthreadJniBridge.libc_new_common_linuxlike_pthread_pthreadGetaffinityNp(thread.toLong(), cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    NewCommonLinuxlikePthreadJniBridge.libc_new_common_linuxlike_pthread_pthreadGetattrNp(native.toLong(), (attr?.value ?: 0L))

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    NewCommonLinuxlikePthreadJniBridge.libc_new_common_linuxlike_pthread_pthreadGetnameNp(thread.toLong(), (name?.value ?: 0L), len.toLong())

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    NewCommonLinuxlikePthreadJniBridge.libc_new_common_linuxlike_pthread_pthreadSetaffinityNp(thread.toLong(), cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    NewCommonLinuxlikePthreadJniBridge.libc_new_common_linuxlike_pthread_pthreadSetnameNp(thread.toLong(), name)
