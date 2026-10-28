// port-lint: source new/qurt/sys/mman.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*

public const val PROT_NONE: Int = 0x00
public const val PROT_READ: Int = 0x01
public const val PROT_WRITE: Int = 0x02
public const val PROT_EXEC: Int = 0x04
public const val MAP_SHARED: Int = 0x0001
public const val MAP_PRIVATE: Int = 0x0002
public const val MAP_FIXED: Int = 0x0010
public const val MAP_ANON: Int = 0x1000
public const val MAP_ANONYMOUS: Int = MAP_ANON
public const val MAP_FILE: Int = 0x0000
public const val MAP_RENAME: Int = 0x0020
public const val MAP_NORESERVE: Int = 0x0040
public const val MAP_INHERIT: Int = 0x0080
public const val MAP_HASSEMAPHORE: Int = 0x0200
public const val MAP_TRYFIXED: Int = 0x0400
public const val MAP_WIRED: Int = 0x0800
public const val MS_ASYNC: Int = 0x01
public const val MS_INVALIDATE: Int = 0x02
public const val MS_SYNC: Int = 0x04
public const val MCL_CURRENT: Int = 0x01
public const val MCL_FUTURE: Int = 0x02

public expect fun mmap(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer?

public expect fun munmap(addr: COpaquePointer?, len: ULong): Int

public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int

public expect fun mlock(addr: COpaquePointer?, len: ULong): Int

public expect fun munlock(addr: COpaquePointer?, len: ULong): Int

public expect fun mlockall(flags: Int): Int

public expect fun munlockall(): Int

public expect fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int
