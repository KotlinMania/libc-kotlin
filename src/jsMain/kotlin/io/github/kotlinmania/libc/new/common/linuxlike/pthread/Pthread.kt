// port-lint: source new/common/linux_like/pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadAttrT
import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadT

public actual class CpuSetT internal constructor(
    internal val rawHandle: Int,
)

@JsModule("libc-kotlin-pthread")
@JsNonModule
private external object PthreadLinuxNpAddon {
    fun getaffinityNp(thread: Int, cpusetsize: Int, cpuset: Int): Int

    fun getattrNp(thread: Int, attr: Int): Int

    fun getnameNp(thread: Int, name: ByteArray, len: Int): Int

    fun setaffinityNp(thread: Int, cpusetsize: Int, cpuset: Int): Int

    fun setnameNp(thread: Int, name: String): Int
}

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int =
    PthreadLinuxNpAddon.getaffinityNp(thread.rawHandle, cpusetsize.toInt(), cpuset.rawHandle)

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT): Int =
    PthreadLinuxNpAddon.getattrNp(native.rawHandle, attr.rawHandle)

public actual fun pthreadGetnameNp(thread: PthreadT, name: ByteArray, len: ULong): Int =
    PthreadLinuxNpAddon.getnameNp(thread.rawHandle, name, len.toInt())

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int =
    PthreadLinuxNpAddon.setaffinityNp(thread.rawHandle, cpusetsize.toInt(), cpuset.rawHandle)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String): Int =
    PthreadLinuxNpAddon.setnameNp(thread.rawHandle, name)
