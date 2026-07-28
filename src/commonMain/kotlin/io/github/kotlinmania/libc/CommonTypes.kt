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

// --- Constants ---
public const val INT_MIN: CInt = -2147483648
public const val INT_MAX: CInt = 2147483647