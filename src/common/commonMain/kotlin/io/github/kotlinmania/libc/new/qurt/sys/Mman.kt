// port-lint: source new/qurt/sys/mman.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.SizeT

// Header: `sys / mman.h`
//
// Memory mapping functions and constants from Hexagon toolchain.

// Memory protection constants
public val PROT_NONE: CInt = 0x00

public val PROT_READ: CInt = 0x01

public val PROT_WRITE: CInt = 0x02

public val PROT_EXEC: CInt = 0x04

// Memory mapping constants
public val MAP_SHARED: CInt = 0x0001

public val MAP_PRIVATE: CInt = 0x0002

public val MAP_FIXED: CInt = 0x0010

public val MAP_ANON: CInt = 0x1000

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val MAP_FILE: CInt = 0x0000

public val MAP_RENAME: CInt = 0x0020

public val MAP_NORESERVE: CInt = 0x0040

public val MAP_INHERIT: CInt = 0x0080

public val MAP_HASSEMAPHORE: CInt = 0x0200

public val MAP_TRYFIXED: CInt = 0x0400

public val MAP_WIRED: CInt = 0x0800

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

// Memory sync constants
public val MS_ASYNC: CInt = 0x01

public val MS_INVALIDATE: CInt = 0x02

public val MS_SYNC: CInt = 0x04

// Memory lock constants
public val MCL_CURRENT: CInt = 0x01

public val MCL_FUTURE: CInt = 0x02

public fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mmap", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong(), flags.toLong(), fd.toLong(), offset))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun munmap(addr: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("munmap", -1, longArrayOf(addr?.value ?: 0L, len.toLong())).toInt()
}

public fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt {
    return LibcDynamicFfi.invoke("mprotect", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong())).toInt()
}

public fun mlock(addr: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("mlock", -1, longArrayOf(addr?.value ?: 0L, len.toLong())).toInt()
}

public fun munlock(addr: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("munlock", -1, longArrayOf(addr?.value ?: 0L, len.toLong())).toInt()
}

public fun mlockall(flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mlockall", -1, longArrayOf(flags.toLong())).toInt()
}

public fun munlockall(): CInt {
    return LibcDynamicFfi.invoke("munlockall", -1, longArrayOf()).toInt()
}

public fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("msync", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), flags.toLong())).toInt()
}
