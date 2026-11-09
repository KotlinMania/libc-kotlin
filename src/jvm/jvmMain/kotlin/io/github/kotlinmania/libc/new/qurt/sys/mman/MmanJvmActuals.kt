@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.mman

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.SizeT

private object NewQurtSysMmanJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_qurt_sys_mman_mmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libc_new_qurt_sys_mman_munmap(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_new_qurt_sys_mman_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_new_qurt_sys_mman_mlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_new_qurt_sys_mman_munlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_new_qurt_sys_mman_mlockall(flags: Int): Int

    @JvmStatic
    external fun libc_new_qurt_sys_mman_munlockall(): Int

    @JvmStatic
    external fun libc_new_qurt_sys_mman_msync(addr: Long, len: Long, flags: Int): Int
}

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    NewQurtSysMmanJniBridge.libc_new_qurt_sys_mman_mmap((addr?.value ?: 0L), len.toLong(), prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    NewQurtSysMmanJniBridge.libc_new_qurt_sys_mman_munmap((addr?.value ?: 0L), len.toLong())

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    NewQurtSysMmanJniBridge.libc_new_qurt_sys_mman_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    NewQurtSysMmanJniBridge.libc_new_qurt_sys_mman_mlock((addr?.value ?: 0L), len.toLong())

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    NewQurtSysMmanJniBridge.libc_new_qurt_sys_mman_munlock((addr?.value ?: 0L), len.toLong())

public actual fun mlockall(flags: CInt): CInt =
    NewQurtSysMmanJniBridge.libc_new_qurt_sys_mman_mlockall(flags)

public actual fun munlockall(): CInt =
    NewQurtSysMmanJniBridge.libc_new_qurt_sys_mman_munlockall()

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    NewQurtSysMmanJniBridge.libc_new_qurt_sys_mman_msync((addr?.value ?: 0L), len.toLong(), flags)
