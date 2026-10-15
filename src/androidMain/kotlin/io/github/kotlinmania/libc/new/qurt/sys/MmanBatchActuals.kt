// port-lint: source Mman.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer? =
    throw UnsupportedOperationException("mmap not available on Android host — use androidNative target for FFI")

public actual fun munmap(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munmap not available on Android host — use androidNative target for FFI")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on Android host — use androidNative target for FFI")

public actual fun mlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("mlock not available on Android host — use androidNative target for FFI")

public actual fun munlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munlock not available on Android host — use androidNative target for FFI")

public actual fun mlockall(flags: Int): Int =
    throw UnsupportedOperationException("mlockall not available on Android host — use androidNative target for FFI")

public actual fun munlockall(): Int =
    throw UnsupportedOperationException("munlockall not available on Android host — use androidNative target for FFI")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync not available on Android host — use androidNative target for FFI")
