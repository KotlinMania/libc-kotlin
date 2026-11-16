package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort

public typealias BlkcntT = Int

public typealias BlksizeT = Int

public typealias ClockidT = CUlong

// supports multicast
public typealias DevT = CShort

public typealias InoT = CUshort

public typealias OffT = CLong

public typealias FsblkcntT = ULong

public typealias FsfilcntT = UInt

public typealias IdT = UInt

public typealias KeyT = CInt

public typealias LoffT = CLonglong

public typealias ModeT = CUint

public typealias NfdsT = UInt

public typealias NlinkT = CUshort

public typealias PthreadT = CUlong

public typealias PthreadKeyT = CUint

public typealias RlimT = UInt

public typealias SaFamilyT = UShort

public typealias SocklenT = UInt

public typealias SpeedT = UInt

public typealias SusecondsT = Int

public typealias TcflagT = UShort

public typealias UsecondsT = UInt

public typealias TimeT = CLonglong
