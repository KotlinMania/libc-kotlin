// port-lint: source Mman.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires manual FFI bridge — not yet implemented")

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    libc.cinterop.libc_munmap(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len)
public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    libc.cinterop.libc_mprotect(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, prot)
public actual fun mlock(addr: COpaquePointer?, len: ULong): CInt =
    libc.cinterop.libc_mlock(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len)
public actual fun munlock(addr: COpaquePointer?, len: ULong): CInt =
    libc.cinterop.libc_munlock(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len)
public actual fun mlockall(flags: CInt): CInt = libc.cinterop.libc_mlockall(flags)
public actual fun munlockall(): CInt = libc.cinterop.libc_munlockall()
public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    libc.cinterop.libc_msync(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, flags)
