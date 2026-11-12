@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.mman

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libcNewQurtSysMmanMlock
import io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libcNewQurtSysMmanMlockall
import io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libcNewQurtSysMmanMmap
import io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libcNewQurtSysMmanMprotect
import io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libcNewQurtSysMmanMsync
import io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libcNewQurtSysMmanMunlock
import io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libcNewQurtSysMmanMunlockall
import io.github.kotlinmania.libc.new.qurt.sys.mman.cinterop.libcNewQurtSysMmanMunmap
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    MutPtr(libcNewQurtSysMmanMmap(addr.rawAddress.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.toLong() ?: 0L)

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    libcNewQurtSysMmanMunmap(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcNewQurtSysMmanMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    libcNewQurtSysMmanMlock(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    libcNewQurtSysMmanMunlock(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun mlockall(flags: CInt): CInt =
    libcNewQurtSysMmanMlockall(flags)

public actual fun munlockall(): CInt =
    libcNewQurtSysMmanMunlockall()

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    libcNewQurtSysMmanMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)
