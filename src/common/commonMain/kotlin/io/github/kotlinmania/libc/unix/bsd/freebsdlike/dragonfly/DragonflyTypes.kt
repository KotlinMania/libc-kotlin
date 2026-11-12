package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

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

public typealias SemT = MutPtr<Sem>

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

public typealias VmMapT = MutPtr<CAnonymousVmMap>

public typealias VmMapEntryT = MutPtr<VmMapEntry>

public typealias Pmap = CAnonymousPmap

public class Sem(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}

public enum class Lwpstat(
    public val value: UInt,
) {
    LSRUN(1u),
    LSSTOP(2u),
    LSSLEEP(3u),
}

public enum class Procstat(
    public val value: UInt,
) {
    SIDL(1u),
    SACTIVE(2u),
    SSTOP(3u),
    SZOMB(4u),
    SCORE(5u),
}
