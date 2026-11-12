@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.sys.types.CpuSetT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewCommonLinuxlikePthreadJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewCommonLinuxlikePthreadPthreadGetaffinityNp(thread: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcNewCommonLinuxlikePthreadPthreadGetattrNp(native: Long, attr: Long): Int

    @JvmStatic
    external fun libcNewCommonLinuxlikePthreadPthreadGetnameNp(thread: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libcNewCommonLinuxlikePthreadPthreadSetaffinityNp(thread: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcNewCommonLinuxlikePthreadPthreadSetnameNp(thread: Long, name: Long): Int
}

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    NewCommonLinuxlikePthreadJniBridge.libcNewCommonLinuxlikePthreadPthreadGetaffinityNp(thread.toLong(), cpusetsize.toLong(), cpuset.rawAddress)

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    NewCommonLinuxlikePthreadJniBridge.libcNewCommonLinuxlikePthreadPthreadGetattrNp(native.toLong(), attr.rawAddress)

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    NewCommonLinuxlikePthreadJniBridge.libcNewCommonLinuxlikePthreadPthreadGetnameNp(thread.toLong(), name.rawAddress, len.toLong())

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    NewCommonLinuxlikePthreadJniBridge.libcNewCommonLinuxlikePthreadPthreadSetaffinityNp(thread.toLong(), cpusetsize.toLong(), cpuset.rawAddress)

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    NewCommonLinuxlikePthreadJniBridge.libcNewCommonLinuxlikePthreadPthreadSetnameNp(thread.toLong(), name.rawAddress)
