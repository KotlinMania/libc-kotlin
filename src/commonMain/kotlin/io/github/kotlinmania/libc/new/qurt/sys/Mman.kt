// port-lint: source new/qurt/sys/mman.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public const val PROT_NONE: CInt = 0x00
public const val PROT_READ: CInt = 0x01
public const val PROT_WRITE: CInt = 0x02
public const val PROT_EXEC: CInt = 0x04
public const val MAP_SHARED: CInt = 0x0001
public const val MAP_PRIVATE: CInt = 0x0002
public const val MAP_FIXED: CInt = 0x0010
public const val MAP_ANON: CInt = 0x1000
public const val MAP_ANONYMOUS: CInt = MAP_ANON
public const val MAP_FILE: CInt = 0x0000
public const val MAP_RENAME: CInt = 0x0020
public const val MAP_NORESERVE: CInt = 0x0040
public const val MAP_INHERIT: CInt = 0x0080
public const val MAP_HASSEMAPHORE: CInt = 0x0200
public const val MAP_TRYFIXED: CInt = 0x0400
public const val MAP_WIRED: CInt = 0x0800
public const val MS_ASYNC: CInt = 0x01
public const val MS_INVALIDATE: CInt = 0x02
public const val MS_SYNC: CInt = 0x04
public const val MCL_CURRENT: CInt = 0x01
public const val MCL_FUTURE: CInt = 0x02

public expect fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer?
public expect fun munmap(addr: COpaquePointer?, len: ULong): CInt
public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt
public expect fun mlock(addr: COpaquePointer?, len: ULong): CInt
public expect fun munlock(addr: COpaquePointer?, len: ULong): CInt
public expect fun mlockall(flags: CInt): CInt
public expect fun munlockall(): CInt
public expect fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt
