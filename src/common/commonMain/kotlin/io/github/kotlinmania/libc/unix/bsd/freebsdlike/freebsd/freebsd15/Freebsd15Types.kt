package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CUint

// APIs in FreeBSD 15 that have changed since 11.
public typealias NlinkT = ULong

public typealias DevT = ULong

public typealias InoT = ULong

public typealias ShmattT = CUint

public typealias KpaddrT = ULong

public typealias KssizeT = Long

public typealias DomainsetT = CAnonymousDomainset
