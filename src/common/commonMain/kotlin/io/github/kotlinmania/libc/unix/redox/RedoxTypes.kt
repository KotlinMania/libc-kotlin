package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong

public typealias WcharT = Int

public typealias BlkcntT = CUlong

public typealias BlksizeT = CLong

public typealias ClockT = CLong

public typealias ClockidT = CInt

public typealias DevT = CUlonglong

public typealias FsblkcntT = CUlong

public typealias FsfilcntT = CUlong

public typealias InoT = CUlonglong

public typealias ModeT = CInt

public typealias NfdsT = CUlong

public typealias NlinkT = CUlong

public typealias OffT = CLonglong

public typealias PthreadT = COpaquePointer?

// Must be Int due to library/std/sysCommon/threadLocal.rs,
// should technically be *mut cVoid
public typealias PthreadKeyT = ULong

public typealias RlimT = CUlonglong

public typealias SaFamilyT = UShort

public typealias SemT = COpaquePointer?

public typealias SigsetT = CUlonglong

public typealias SocklenT = UInt

public typealias SpeedT = UInt

public typealias SusecondsT = CInt

public typealias TcflagT = UInt

public typealias TimeT = CLonglong

public typealias IdT = CUint

public typealias UidT = CInt

public typealias GidT = CInt

// intentionally not public, only used for fdSet
public class Timezone(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}
