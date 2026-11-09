@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.mman

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.SizeT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libc_new_qurt_sys_mman_mmap(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libc_new_qurt_sys_mman_munmap(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libc_new_qurt_sys_mman_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libc_new_qurt_sys_mman_mlock(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libc_new_qurt_sys_mman_munlock(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun mlockall(flags: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libc_new_qurt_sys_mman_mlockall(flags)

public actual fun munlockall(): CInt =
    io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libc_new_qurt_sys_mman_munlockall()

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libc_new_qurt_sys_mman_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)
