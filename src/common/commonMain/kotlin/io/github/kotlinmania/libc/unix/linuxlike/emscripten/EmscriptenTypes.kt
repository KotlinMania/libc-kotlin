package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.Rlimit

public typealias WcharT = Int

public typealias DevT = UInt

public typealias SocklenT = UInt

public typealias PthreadT = CUlong

public typealias ModeT = UInt

public typealias ShmattT = CUlong

public typealias MqdT = CInt

public typealias MsgqnumT = CUlong

public typealias MsglenT = CUlong

public typealias NfdsT = CUlong

public typealias NlItem = CInt

public typealias IdtypeT = CUint

public typealias LoffT = Long

public typealias PthreadKeyT = CUint

public typealias ClockT = CLong

public typealias TimeT = Long

public typealias SusecondsT = CLong

public typealias InoT = ULong

public typealias OffT = Long

public typealias BlkcntT = Int

public typealias BlksizeT = CLong

public typealias FsblkcntT = UInt

public typealias FsfilcntT = UInt

public typealias RlimT = ULong

public typealias NlinkT = UInt

public typealias Ino64T = InoT

public typealias Off64T = OffT

public typealias Blkcnt64T = BlkcntT

public typealias Rlim64T = RlimT

public typealias Rlimit64 = Rlimit

public typealias Flock64 = Flock

public typealias Stat64 = Stat

public typealias Statfs64 = Statfs

public typealias Statvfs64 = Statvfs

public typealias Dirent64 = Dirent

public class Fpos64T(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}
