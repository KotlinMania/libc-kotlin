package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong

public typealias BlkcntT = Long

public typealias BlksizeT = Long

public typealias ClockT = Long

public typealias FsblkcntT = CUlong

public typealias FsfilcntT = CUlong

public typealias FswordT = CLong

public typealias InoT = CUlong

public typealias NlinkT = CUint

public typealias OffT = CLong

// [uClibc docs] Note stat64 has the same shape as stat for x86-64.
public typealias Stat64 = Stat

public typealias SusecondsT = CLong

public typealias TimeT = CInt

public typealias WcharT = CInt

public typealias PthreadT = CUlong

public typealias Fsblkcnt64T = ULong

public typealias Fsfilcnt64T = ULong

public typealias U64 = CUlong

public typealias S64 = CLong
