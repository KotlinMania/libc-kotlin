package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

public fun interface FnCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

// APIs that were changed after FreeBSD 11
// The type of `nlinkT` changed from `UShort` to `ULong` in FreeBSD 12:
public typealias NlinkT = UShort

// Type of `devT` changed from `UInt` to `ULong` in FreeBSD 12:
public typealias DevT = UInt

// Type of `inoT` changed from `__uint32_t` to `__uint64_t` in FreeBSD 12:
public typealias InoT = UInt
