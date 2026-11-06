package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.COpaquePointer

internal object MmanRawLibc {
    external fun mmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long?
    external fun munmap(addr: Long, len: Long): Int
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun mlock(addr: Long, len: Long): Int
    external fun munlock(addr: Long, len: Long): Int
    external fun mlockall(flags: Int): Int
    external fun munlockall(): Int
    external fun msync(addr: Long, len: Long, flags: Int): Int
}

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    MmanRawLibc.mmap(addr?.value ?: 0L, len, prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    MmanRawLibc.munmap(addr?.value ?: 0L, len)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    MmanRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    MmanRawLibc.mlock(addr?.value ?: 0L, len)

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    MmanRawLibc.munlock(addr?.value ?: 0L, len)

public actual fun mlockall(flags: CInt): CInt =
    MmanRawLibc.mlockall(flags)

public actual fun munlockall(): CInt =
    MmanRawLibc.munlockall()

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    MmanRawLibc.msync(addr?.value ?: 0L, len, flags)
