package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias PthreadT = MutPtr

public typealias ClockT = CLong

public typealias TimeT = Long

public typealias SusecondsT = Long

public typealias InoT = ULong

public typealias OffT = Long

public typealias BlkcntT = Long

public typealias ShmattT = CUlong

public typealias MsgqnumT = CUlong

public typealias MsglenT = CUlong

public typealias FsblkcntT = CUlonglong

public typealias Fsblkcnt64T = CUlonglong

public typealias FsfilcntT = CUlonglong

public typealias Fsfilcnt64T = CUlonglong

public typealias RlimT = CUlonglong

public typealias Ioctl = CInt
