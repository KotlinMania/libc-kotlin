// port-lint: source Mman.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires manual FFI bridge — not yet implemented")

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    platform.posix.munmap(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len)
public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    platform.posix.mprotect(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, prot)
public actual fun mlock(addr: COpaquePointer?, len: ULong): CInt =
    platform.posix.mlock(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len)
public actual fun munlock(addr: COpaquePointer?, len: ULong): CInt =
    platform.posix.munlock(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len)
public actual fun mlockall(flags: CInt): CInt = platform.posix.mlockall(flags)
public actual fun munlockall(): CInt = platform.posix.munlockall()
public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    platform.posix.msync(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, flags)
