// port-lint: source types.rs
package io.github.kotlinmania.libc

/**
 * Common C type aliases shared across all platform modules.
 *
 * In the upstream Rust crate, each platform module (sgx.rs, switch.rs,
 * xous.rs, trusty.rs, etc.) defines these types with identical values.
 * The Rust `cfg_if!` chain selects exactly one platform module per target,
 * so there is never a duplicate at compile time. In the Kotlin port all
 * platform files reside in commonMain and are compiled together, so the
 * shared definitions are consolidated here to avoid redeclarations.
 *
 * Platform-specific sub-packages may declare their own typealias with the
 * same name to shadow the root declaration with a platform-specific width.
 */

// --- Fixed-width integer types (from unix/mod.rs) ---
public typealias IntmaxT = Long
public typealias UintmaxT = ULong
public typealias SizeT = ULong
public typealias PtrdiffT = Long
public typealias IntptrT = Long
public typealias UintptrT = ULong
public typealias SsizeT = Long
public typealias OffT = Long
public typealias WcharT = UInt

// --- C standard integer types (from primitives.rs) ---
public typealias CSchar = Byte
public typealias CUChar = UByte
public typealias CUchar = UByte
public typealias CShort = Short
public typealias CUShort = UShort
public typealias CUshort = UShort
public typealias CLonglong = Long
public typealias CUlonglong = ULong
public typealias CLongLong = Long
public typealias CULongLong = ULong
public typealias CFloat = Float
public typealias CDouble = Double
public typealias CChar = Byte
public typealias CInt = Int
public typealias CUInt = UInt
public typealias CUint = UInt
public typealias CLong = Long
public typealias CUlong = ULong
public typealias CULong = ULong
public typealias Int8T = Byte
public typealias Int16T = Short
public typealias Int32T = Int
public typealias Int64T = Long
public typealias Uint8T = UByte
public typealias Uint16T = UShort
public typealias Uint32T = UInt
public typealias Uint64T = ULong
public typealias Int128 = ByteArray
public typealias Uint128 = ByteArray
public typealias Int128T = ByteArray
public typealias Uint128T = ByteArray

// --- Unix common types (from unix/mod.rs) ---
public typealias PidT = Int
public typealias InAddrT = UInt
public typealias InPortT = UShort
public typealias SighandlerT = ULong
public typealias CcT = CUChar

// --- Linux-like common types (from unix/linux_like/mod.rs) ---
public typealias SaFamilyT = UShort
public typealias SpeedT = CUInt
public typealias TcflagT = CUInt
public typealias ClockidT = CInt
public typealias TimerT = COpaquePointer?
public typealias UsecondsT = UInt
public typealias KeyT = CInt
public typealias IdT = CUInt

// --- File system types (common across platforms) ---
public typealias DevT = ULong
public typealias InoT = ULong
public typealias Ino64T = ULong
public typealias Off64T = Long
public typealias BlkcntT = Long
public typealias BlksizeT = Long
public typealias NlinkT = ULong
public typealias FsblkcntT = ULong
public typealias FsfilcntT = ULong
public typealias FsidT = ULong

// --- Signal types ---
public typealias SigsetT = ULong

// --- Process/user types ---
public typealias UidT = UInt
public typealias GidT = UInt
public typealias ModeT = UInt

// --- Misc common types ---
public typealias NlItem = CInt
public typealias FswordT = Long
public typealias Ioctl = CInt
public typealias SocklenT = UInt
public typealias LocaleT = COpaquePointer?
public typealias PthreadT = ULong
public typealias PthreadAttrT = COpaquePointer?
public typealias PthreadMutexT = COpaquePointer?
public typealias PthreadMutexattrT = COpaquePointer?
public typealias PthreadCondT = COpaquePointer?
public typealias PthreadCondattrT = COpaquePointer?
public typealias PthreadRwlockT = COpaquePointer?
public typealias PthreadRwlockattrT = COpaquePointer?
public typealias PthreadKeyT = CInt
public typealias PthreadOnceT = CInt

// --- Resource limit types ---
public typealias RlimitResourceT = CInt

// --- 64-bit types ---
public typealias U64 = ULong
public typealias U32 = UInt

// --- Additional type aliases needed by platform modules ---
public typealias SegszT = Long
public typealias Blkcnt64T = Long
public typealias Fsblkcnt64T = ULong
public typealias Fsfilcnt64T = ULong
public typealias Rlimit64T = ULong
public typealias MsgqnumT = ULong
public typealias MsglenT = ULong
public typealias MqdT = CInt
public typealias ShmattT = UShort
public typealias UcredT = UInt
public typealias TimeT = Long

// --- Constants ---
public const val INT_MIN: CInt = -2147483648
public const val INT_MAX: CInt = 2147483647

// --- Common struct definitions ---
// These are defined in multiple platform modules in the Rust source, but
// in the Kotlin port all platform files are compiled together in commonMain.
// The definitions here provide the canonical versions; platform modules that
// need different field layouts may shadow them with their own data classes.

public data class Sockaddr(
    val saFamily: SaFamilyT,
    val saData: List<CChar>,
)

public data class Timeval(
    val tvSec: TimeT,
    val tvUsec: CLong,
)

public data class Timespec(
    val tvSec: TimeT,
    val tvNsec: CLong,
)

public data class Rlimit(
    val rlimCur: ULong,
    val rlimMax: ULong,
)

public data class Rlimit64(
    val rlimCur: ULong,
    val rlimMax: ULong,
)

public data class Group(
    val grName: String?,
    val grPasswd: String?,
    val grGid: GidT,
    val grMem: List<String?>,
)

public data class In6Addr(
    val s6Addr: List<UByte>,
)

public data class Winsize(
    val wsRow: CUShort,
    val wsCol: CUShort,
    val wsXpixel: CUShort,
    val wsYpixel: CUShort,
)

public data class Rusage(
    val ruUtime: Timeval,
    val ruStime: Timeval,
    val ruMaxrss: CLong,
    val ruIxrss: CLong,
    val ruIdrss: CLong,
    val ruIsrss: CLong,
    val ruMinflt: CLong,
    val ruMajflt: CLong,
    val ruNswap: CLong,
    val ruInblock: CLong,
    val ruOublock: CLong,
    val ruMsgsnd: CLong,
    val ruMsgrcv: CLong,
    val ruNsignals: CLong,
    val ruNvcsw: CLong,
    val ruNivcsw: CLong,
)

public data class Cmsghdr(
    val cmsgLen: ULong,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class Sigval(
    val sivalPtr: COpaquePointer?,
)

public data class Itimerval(
    val itInterval: Timeval,
    val itValue: Timeval,
)

public data class Timezone(
    val tzMinuteswest: CInt,
    val tzDsttime: CInt,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: CInt,
    val ssSize: ULong,
)

public data class SchedParam(
    val schedPriority: CInt,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cCc: List<CcT>,
    val cLine: CcT,
    val cIspeed: SpeedT,
    val cOspeed: SpeedT,
)

public data class KvmT(
    val private: COpaquePointer?,
)

public data class SemT(
    val `val`: IntArray,
)