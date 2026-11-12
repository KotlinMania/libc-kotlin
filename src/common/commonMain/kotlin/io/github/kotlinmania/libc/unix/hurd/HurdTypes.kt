package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CSchar
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.Int64T
import io.github.kotlinmania.libc.Uint64T
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.hurd.b64.SquadType
import io.github.kotlinmania.libc.unix.hurd.b64.SwordType
import io.github.kotlinmania.libc.unix.hurd.b64.UquadType
import io.github.kotlinmania.libc.unix.hurd.b64.UwordType
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// types
public typealias S16Type = CShort

public typealias U16Type = CUshort

public typealias S32Type = CInt

public typealias U32Type = CUint

public typealias SlongwordType = CLong

public typealias UlongwordType = CUlong

public typealias UChar = CUchar

public typealias UShort = CUshort

public typealias UInt = CUint

public typealias ULong = CUlong

public typealias Int8T = CSchar

public typealias Uint8T = CUchar

public typealias Int16T = CShort

public typealias Uint16T = CUshort

public typealias Int32T = CInt

public typealias Uint32T = CUint

public typealias IntLeast8T = Int8T

public typealias UintLeast8T = Uint8T

public typealias IntLeast16T = Int16T

public typealias UintLeast16T = Uint16T

public typealias IntLeast32T = Int32T

public typealias UintLeast32T = Uint32T

public typealias IntLeast64T = Int64T

public typealias UintLeast64T = Uint64T

public typealias DevT = UwordType

public typealias UidT = U32Type

public typealias GidT = U32Type

public typealias InoT = UlongwordType

public typealias Ino64T = UquadType

public typealias ModeT = U32Type

public typealias NlinkT = UwordType

public typealias OffT = SlongwordType

public typealias Off64T = SquadType

public typealias PidT = S32Type

public typealias RlimT = UlongwordType

public typealias Rlim64T = UquadType

public typealias BlkcntT = SlongwordType

public typealias Blkcnt64T = SquadType

public typealias FsblkcntT = UlongwordType

public typealias Fsblkcnt64T = UquadType

public typealias FsfilcntT = UlongwordType

public typealias Fsfilcnt64T = UquadType

public typealias FswordT = SwordType

public typealias IdT = U32Type

public typealias ClockT = SlongwordType

public typealias TimeT = SlongwordType

public typealias UsecondsT = U32Type

public typealias SusecondsT = SlongwordType

public typealias Suseconds64T = SquadType

public typealias DaddrT = S32Type

public typealias KeyT = S32Type

public typealias ClockidT = S32Type

public typealias TimerT = UwordType

public typealias BlksizeT = SlongwordType

public typealias FsidT = UquadType

public typealias SsizeT = SwordType

public typealias SyscallSlongT = SlongwordType

public typealias SyscallUlongT = UlongwordType

public typealias CpuMask = UlongwordType

public typealias LoffT = Off64T

public typealias CaddrT = MutPtr<CChar>

public typealias IntptrT = SwordType

public typealias PtrdiffT = SwordType

public typealias SocklenT = U32Type

public typealias SigAtomicT = CInt

public typealias Time64T = Int64T

public typealias WcharT = CInt

public typealias WintT = CUint

public typealias InAddrT = UInt

public typealias Float32 = Float

public typealias Float64 = Double

public typealias Float32x = Double

public typealias Float64x = Double

public typealias LocaleT = MutPtr<LocaleStruct>

public typealias Ulong = CUlong

public typealias Ushort = CUshort

public typealias Uint = CUint

public typealias UInt8T = Uint8T

public typealias UInt16T = Uint16T

public typealias UInt32T = Uint32T

public typealias UInt64T = Uint64T

public typealias RegisterT = CInt

public typealias SigsetT = CUlong

public typealias FdMask = CLong

public typealias PthreadSpinlockT = CInt

public typealias TssT = CInt

public typealias ThrdT = CLong

public typealias PthreadT = CLong

public typealias PthreadProcessShared = CUint

public typealias PthreadInheritsched = CUint

public typealias PthreadContentionscope = CUint

public typealias PthreadDetachstate = CUint

public typealias PthreadAttrT = PthreadAttr

public typealias PthreadMutexProtocol = CUint

public typealias PthreadMutexType = CUint

public typealias PthreadMutexRobustness = CUint

public typealias PthreadMutexattrT = PthreadMutexattr

public typealias PthreadMutexT = PthreadMutex

public typealias PthreadCondattrT = PthreadCondattr

public typealias PthreadCondT = PthreadCond

public typealias PthreadRwlockattrT = PthreadRwlockattr

public typealias PthreadRwlockT = PthreadRwlock

public typealias PthreadBarrierattrT = PthreadBarrierattr

public typealias PthreadBarrierT = PthreadBarrier

public typealias PthreadKey = CInt

public typealias PthreadKeyT = PthreadKey

public typealias PthreadOnceT = PthreadOnce

public typealias RlimitResource = CUint

public typealias RlimitResourceT = RlimitResource

public typealias RusageWho = CInt

public typealias PriorityWhich = CUint

public typealias SaFamilyT = CUchar

public typealias InPortT = UShort

public typealias SigvalT = Sigval

public typealias SigeventT = Sigevent

public typealias NfdsT = CUlong

public typealias TcflagT = CUint

public typealias CcT = CUchar

public typealias SpeedT = CInt

public typealias GregT = CInt

public typealias GregsetT = IntArray

public typealias IoctlDir = CUint

public typealias IoctlDatum = CUint

public typealias ErrorTCodes = CInt

public typealias IntFast8T = CSchar

public typealias UintFast8T = CUchar

public typealias TcpSeq = UInt

public typealias TcpCaState = CUint

public typealias IdtypeT = CUint

public typealias MqdT = CInt

public typealias LmidT = CLong

public typealias RegoffT = CInt

public typealias NlItem = CInt

public typealias IconvT = MutPtr<CVoid>

// structs
// functions
public class Fpos64T(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}

public class Timezone(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}
