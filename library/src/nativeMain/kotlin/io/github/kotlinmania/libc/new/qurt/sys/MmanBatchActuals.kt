// port-lint: source Mman.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import libc.cinterop.libc_mlockall
import libc.cinterop.libc_munlockall

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires manual FFI bridge — not yet implemented")

public actual fun munmap(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munmap requires FFI bridge")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires FFI bridge")

public actual fun mlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("mlock requires FFI bridge")

public actual fun munlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munlock requires FFI bridge")

public actual fun mlockall(flags: Int): Int = libc.cinterop.libc_mlockall(flags)

public actual fun munlockall(): Int = libc.cinterop.libc_munlockall()

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync requires FFI bridge")
