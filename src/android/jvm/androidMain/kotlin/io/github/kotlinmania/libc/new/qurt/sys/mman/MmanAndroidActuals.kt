@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.mman

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtSysMmanJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewQurtSysMmanMmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libcNewQurtSysMmanMunmap(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcNewQurtSysMmanMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcNewQurtSysMmanMlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcNewQurtSysMmanMunlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcNewQurtSysMmanMlockall(flags: Int): Int

    @JvmStatic
    external fun libcNewQurtSysMmanMunlockall(): Int

    @JvmStatic
    external fun libcNewQurtSysMmanMsync(addr: Long, len: Long, flags: Int): Int
}

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    MutPtr(NewQurtSysMmanJniBridge.libcNewQurtSysMmanMmap(addr.rawAddress, len.toLong(), prot, flags, fd, offset))

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    NewQurtSysMmanJniBridge.libcNewQurtSysMmanMunmap(addr.rawAddress, len.toLong())

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    NewQurtSysMmanJniBridge.libcNewQurtSysMmanMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    NewQurtSysMmanJniBridge.libcNewQurtSysMmanMlock(addr.rawAddress, len.toLong())

public actual fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    NewQurtSysMmanJniBridge.libcNewQurtSysMmanMunlock(addr.rawAddress, len.toLong())

public actual fun mlockall(flags: CInt): CInt =
    NewQurtSysMmanJniBridge.libcNewQurtSysMmanMlockall(flags)

public actual fun munlockall(): CInt =
    NewQurtSysMmanJniBridge.libcNewQurtSysMmanMunlockall()

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    NewQurtSysMmanJniBridge.libcNewQurtSysMmanMsync(addr.rawAddress, len.toLong(), flags)
