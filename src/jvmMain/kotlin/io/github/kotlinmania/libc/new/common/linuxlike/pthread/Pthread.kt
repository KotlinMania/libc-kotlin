// port-lint: source new/common/linux_like/pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadAttrT
import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadT

public actual class CpuSetT internal constructor(
    internal val rawHandle: Long,
)

private object PthreadLinuxNpNative {
    init {
        System.loadLibrary("libc_kotlin_pthread")
    }

    @JvmStatic external fun getaffinityNp(thread: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic external fun getattrNp(thread: Long, attr: Long): Int

    @JvmStatic external fun getnameNp(thread: Long, name: ByteArray, len: Long): Int

    @JvmStatic external fun setaffinityNp(thread: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic external fun setnameNp(thread: Long, name: String): Int
}

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int =
    PthreadLinuxNpNative.getaffinityNp(thread.rawHandle, cpusetsize.toLong(), cpuset.rawHandle)

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT): Int =
    PthreadLinuxNpNative.getattrNp(native.rawHandle, attr.rawHandle)

public actual fun pthreadGetnameNp(thread: PthreadT, name: ByteArray, len: ULong): Int =
    PthreadLinuxNpNative.getnameNp(thread.rawHandle, name, len.toLong())

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int =
    PthreadLinuxNpNative.setaffinityNp(thread.rawHandle, cpusetsize.toLong(), cpuset.rawHandle)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String): Int =
    PthreadLinuxNpNative.setnameNp(thread.rawHandle, name)
