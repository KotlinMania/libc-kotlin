package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint

public fun interface FnCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

// APIs in FreeBSD 13 that have changed since 11.
public typealias NlinkT = ULong

public typealias DevT = ULong

public typealias InoT = ULong

public typealias ShmattT = CUint

public typealias KpaddrT = ULong

public typealias KssizeT = Long

public typealias DomainsetT = CAnonymousDomainset
