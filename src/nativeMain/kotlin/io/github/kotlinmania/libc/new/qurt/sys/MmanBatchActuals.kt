// port-lint: source Mman.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.ByteVar
import libc.cinterop.libc_munlockall
import libc.cinterop.libc_msync
import libc.cinterop.libc_munmap
import libc.cinterop.libc_mlock
import libc.cinterop.libc_mlockall
import libc.cinterop.libc_mprotect

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires manual FFI bridge — not yet implemented")

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munmap requires FFI bridge")
public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires FFI bridge")
public actual fun mlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("mlock requires FFI bridge")
public actual fun munlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munlock requires FFI bridge")
public actual fun mlockall(flags: CInt): CInt = libc.cinterop.libc_mlockall(flags)
public actual fun munlockall(): CInt = libc.cinterop.libc_munlockall()
public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync requires FFI bridge")
