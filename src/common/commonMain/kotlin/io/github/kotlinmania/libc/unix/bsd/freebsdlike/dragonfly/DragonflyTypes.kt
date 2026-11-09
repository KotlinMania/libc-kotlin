package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.UintptrT

public typealias DevT = UInt

public typealias WcharT = Int

public typealias ClockT = ULong

public typealias InoT = ULong

public typealias LwpidT = Int

public typealias NlinkT = UInt

public typealias BlksizeT = Long

public typealias ClockidT = CUlong

public typealias TimeT = Long

public typealias SusecondsT = Long

public typealias UuidT = Uuid

public typealias FsblkcntT = ULong

public typealias FsfilcntT = ULong

public typealias IdtypeT = CUint

public typealias ShmattT = CUint

public typealias MqdT = CInt

public typealias SemT = Sem?

public typealias CpusetT = CpumaskT

public typealias CpuSetT = CpumaskT

public typealias RegisterT = CLong

public typealias UmtxT = CInt

public typealias PthreadBarrierattrT = CInt

public typealias PthreadBarrierT = UintptrT

public typealias PthreadSpinlockT = UintptrT

public typealias SegszT = Int

public typealias VmProtT = UByte

public typealias VmMaptypeT = UByte

public typealias VmInheritT = Byte

public typealias VmSubsysT = CInt

public typealias VmEflagsT = CUint

public typealias VmMapT = COpaquePointer?

public typealias VmMapEntryT = COpaquePointer?

public typealias Pmap = CAnonymousPmap

public sealed class Sem {
}

public sealed class Lwpstat(public val value: UInt) {
    public data object Lsrun : Lwpstat(1u)
    public data object Lsstop : Lwpstat(2u)
    public data object Lssleep : Lwpstat(3u)
}

public sealed class Procstat(public val value: UInt) {
    public data object Sidl : Procstat(1u)
    public data object Sactive : Procstat(2u)
    public data object Sstop : Procstat(3u)
    public data object Szomb : Procstat(4u)
    public data object Score : Procstat(5u)
}
