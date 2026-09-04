// port-lint: source Mman.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires manual FFI bridge — not yet implemented")

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munmap requires manual FFI bridge — not yet implemented")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires manual FFI bridge — not yet implemented")

public actual fun mlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("mlock requires manual FFI bridge — not yet implemented")

public actual fun munlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munlock requires manual FFI bridge — not yet implemented")

public actual fun mlockall(flags: CInt): CInt =
    throw UnsupportedOperationException("mlockall requires manual FFI bridge — not yet implemented")

public actual fun munlockall(): CInt =
    throw UnsupportedOperationException("munlockall requires manual FFI bridge — not yet implemented")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync requires manual FFI bridge — not yet implemented")
