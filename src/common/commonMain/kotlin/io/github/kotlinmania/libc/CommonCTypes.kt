// Auto-generated: common C type aliases for libc-kotlin
// These types are referenced via the root package io.github.kotlinmania.libc
// but defined in per-platform sub-packages. This file provides Apple-relevant
// definitions so they resolve on Apple targets.
package io.github.kotlinmania.libc

// Base C types (supplementing primitives.kt)
public typealias SizeT = ULong
public typealias UintptrT = ULong
public typealias OffT = Long
public typealias SsizeT = Long
public typealias PidT = Int
public typealias SusecondsT = CInt
public typealias TimeT = Long
public typealias SvalT = CInt
public typealias ClockidT = CUint
public typealias TimerT = CInt
public typealias SaFamilyT = CUshort
public typealias InAddrT = CUint
public typealias InPortT = CUshort
public typealias IdT = CInt
public typealias UsecondsT = CUint
public typealias NFdsT = CInt
public typealias FdMask = CUint
public typealias ModeT = CUint
public typealias SocklenT = CUint

// Apple-relevant platform type aliases (from apple_mod.kt, bsd_mod.kt, unix_mod.kt)
public typealias TcflagT = CUlong
public typealias SpeedT = CUlong
public typealias NlItem = CInt
public typealias Ioctl = CUlong
public typealias GidT = CUshort
public typealias UidT = CUshort
public typealias DevT = Int
public typealias FsblkcntT = CUint
public typealias FsfilcntT = CUint
public typealias SigsetT = UInt
public typealias FswordT = Long
public typealias Off64T = Long
public typealias PthreadT = ULong
public typealias RlimitResourceT = CInt
public typealias KeyT = CInt
public typealias LocaleT = COpaquePointer?
public typealias InoT = ULong
public typealias U64 = CUlong
public typealias BlksizeT = Int
public typealias NlinkT = UShort
public typealias BlkcntT = Long
public typealias U32 = CUint
public typealias U16 = CUshort
public typealias CcT = CUchar
public typealias SighandlerT = ULong
public typealias MqdT = CInt
public typealias PthreadAttrT = COpaquePointer?
public typealias PthreadMutexT = COpaquePointer?
public typealias PthreadCondT = COpaquePointer?
public typealias PthreadMutexAttrT = COpaquePointer?
public typealias PthreadCondAttrT = COpaquePointer?
public typealias PthreadRwlockT = COpaquePointer?
public typealias PthreadRwlockAttrT = COpaquePointer?
public typealias PthreadKeyT = CUint
public typealias PthreadOnceT = COpaquePointer?

// Class type aliases (pointing to Apple-relevant definitions in sub-packages)
public typealias FILE = io.github.kotlinmania.libc.unix.FILE
public typealias DIR = io.github.kotlinmania.libc.unix.DIR
public typealias Group = io.github.kotlinmania.libc.unix.Group
public typealias Sigval = io.github.kotlinmania.libc.unix.Sigval
public typealias IpcPerm = io.github.kotlinmania.libc.unix.bsd.apple.IpcPerm
public typealias SiginfoT = io.github.kotlinmania.libc.unix.bsd.apple.SiginfoT
public typealias Cmsghdr = io.github.kotlinmania.libc.unix.bsd.Cmsghdr
public typealias FsidT = io.github.kotlinmania.libc.unix.bsd.FsidT
public typealias SchedParam = io.github.kotlinmania.libc.new.apple.libpthread.pthread.SchedParam
public typealias In6Addr = io.github.kotlinmania.libc.unix.In6Addr
public typealias Iovec = io.github.kotlinmania.libc.unix.Iovec
public typealias Msghdr = io.github.kotlinmania.libc.unix.bsd.Msghdr
public typealias Sockaddr = io.github.kotlinmania.libc.unix.bsd.Sockaddr
public typealias Stat = io.github.kotlinmania.libc.unix.bsd.apple.Stat
public typealias Termios = io.github.kotlinmania.libc.unix.bsd.apple.Termios
public typealias Rlimit = io.github.kotlinmania.libc.unix.Rlimit
public typealias Itimerval = io.github.kotlinmania.libc.unix.Itimerval
public typealias Timeval = io.github.kotlinmania.libc.unix.Timeval
public typealias Timespec = io.github.kotlinmania.libc.unix.Timespec
public typealias Tms = io.github.kotlinmania.libc.unix.Tms
public typealias Tm = io.github.kotlinmania.libc.unix.bsd.apple.Tm
public typealias Pollfd = io.github.kotlinmania.libc.unix.Pollfd
public typealias Flock = io.github.kotlinmania.libc.unix.bsd.apple.Flock
public typealias Statvfs = io.github.kotlinmania.libc.unix.bsd.apple.Statvfs
public typealias Sigaction = io.github.kotlinmania.libc.unix.bsd.apple.Sigaction
public typealias StackT = io.github.kotlinmania.libc.unix.bsd.apple.StackT

// Additional platform type aliases
public typealias UQuadT = CUlong
public typealias ShmattT = CUint
public typealias Fsblkcnt64T = ULong
public typealias Blkcnt64T = Long
public typealias MsglenT = ULong
public typealias MsgqnumT = ULong
public typealias SegszT = Int
public typealias RlimT = ULong
public typealias Fsfilcnt64T = ULong
public typealias Ino64T = ULong
public typealias PthreadCondattrT = COpaquePointer?
public typealias PthreadMutexattrT = COpaquePointer?
public typealias S32 = CInt
public typealias KvmT = Unit
public typealias PosixSpawnattrT = COpaquePointer?
public typealias SctpAssocT = CUint

// Additional class type aliases
public typealias Winsize = io.github.kotlinmania.libc.unix.Winsize
public typealias Rusage = io.github.kotlinmania.libc.unix.Rusage
public typealias SysdirSearchPathDomainMaskT = io.github.kotlinmania.libc.unix.bsd.apple.SysdirSearchPathDomainMaskT
// Corrected class type aliases (verified locations)
public typealias Passwd = io.github.kotlinmania.libc.unix.bsd.Passwd
public class Mmsghdr(public var msgHdr: Msghdr?, public var msgLen: UInt)
public typealias Timezone = io.github.kotlinmania.libc.unix.bsd.apple.Timezone
public class Itimerspec(public var itInterval: Timespec, public var itValue: Timespec)
public typealias Sigevent = io.github.kotlinmania.libc.unix.bsd.apple.Sigevent

// Additional Apple-specific type aliases
public typealias KernReturnT = CInt
public typealias CopyfileFlagsT = UInt
public typealias MachPortT = CUint
public typealias BooleanT = CInt
public typealias OsLogT = COpaquePointer?
public typealias WcharT = Int
public typealias VmProtT = CInt
public typealias TypeId = CInt
public typealias Itimer = CInt
public typealias QosClassT = io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT
public typealias MallocZoneT = io.github.kotlinmania.libc.unix.bsd.apple.b64.x8664.MallocZoneT
public typealias PthreadRwlockattrT = io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.PthreadRwlockattrT
public typealias FdSet = io.github.kotlinmania.libc.unix.bsd.FdSet
public typealias PthreadBarrierattrT = COpaquePointer?
public typealias PthreadSpinlockT = COpaquePointer?
public typealias PthreadBarrierT = COpaquePointer?
public typealias SemT = CInt
public typealias SyncAttr = COpaquePointer?

// More Apple-specific types
public typealias OsLogTypeT = UByte
public typealias ClockT = CUlong
public typealias TaskT = CUint
public typealias SysdirSearchPathEnumerationState = CUint
public typealias IntegerT = CInt
public typealias CopyfileStatusT = UInt
public typealias InAddr = io.github.kotlinmania.libc.unix.bsd.apple.InAddr
public typealias GlobT = io.github.kotlinmania.libc.unix.bsd.apple.GlobT
public typealias Dirent = io.github.kotlinmania.libc.unix.bsd.apple.Dirent
// C macro: align to 4-byte boundary
public fun DARWIN_ALIGN32(len: Int): Int = (len + 3) and 3.inv()

// Lowercase aliases (kexe output uses lowercase, CommonCTypes uses uppercase)
public typealias pthreadOnceT = PthreadOnceT
public typealias pthreadRwlockT = PthreadRwlockT
public typealias pthreadMutexT = PthreadMutexT
public typealias pthreadCondT = PthreadCondT

// More Apple-specific types from apple_mod.kt
public typealias WSTATUS = CInt
public typealias SockaddrIn6 = io.github.kotlinmania.libc.unix.bsd.SockaddrIn6
public typealias OsSignpostTypeT = COpaquePointer?
public typealias OsSignpostIdT = COpaquePointer?
public typealias Kevent = COpaquePointer?
public typealias Kevent64S = COpaquePointer?
public typealias MachMsgTypeNumberT = CUint
public typealias Utsname = COpaquePointer?
public typealias IntptrT = Long
public typealias PolicyT = CInt
public typealias SaeAssocidT = COpaquePointer?
public typealias SaeConnidT = COpaquePointer?
public typealias WSTOPSIG = COpaquePointer?
public typealias CCCryptorStatus = COpaquePointer?
public typealias IfData = io.github.kotlinmania.libc.unix.bsd.apple.b64.IfData
public typealias PthreadJitWriteCallbackT = COpaquePointer?
public typealias Addrinfo = COpaquePointer?
public fun CMSG_FIRSTHDR(x: COpaquePointer?): COpaquePointer? = null
public fun CMSG_NXTHDR(x: COpaquePointer?): COpaquePointer? = null
public fun CMSG_DATA(x: COpaquePointer?): COpaquePointer? = null
public fun CMSG_SPACE(x: COpaquePointer?): COpaquePointer? = null

// Additional missing types
public typealias NaturalT = CULong
public typealias NfdsT = CUint
public typealias DlInfo = COpaquePointer?
public typealias Ifaddrs = COpaquePointer?
public typealias ShmidDs = COpaquePointer?
public typealias MachTimebaseInfo = COpaquePointer?
public typealias VmAddressT = CULong
public typealias VmSizeT = CULong
public typealias UuidT = COpaquePointer?
public typealias McontextT = COpaquePointer?
public typealias Timeval32 = COpaquePointer?
public typealias DarwinArmExceptionState64 = COpaquePointer?
public typealias DarwinArmThreadState64 = COpaquePointer?
public typealias DarwinArmNeonState64 = COpaquePointer?
public typealias DarwinX86ExceptionState64 = COpaquePointer?
public typealias DarwinX86ThreadState64 = COpaquePointer?
public typealias DarwinX86FloatState64 = COpaquePointer?
public typealias Formatter = COpaquePointer?
public typealias Pollfd = COpaquePointer?

// More missing types from nativeMain actuals
public typealias MachErrorT = CInt
public typealias CCRNGStatus = CInt
public typealias VmMapT = CULong
public typealias MachVmSizeT = CULong
public typealias MachVmOffsetT = CULong
public typealias MemEntryNamePortT = CUint
public typealias MemoryObjectOffsetT = CULong
public typealias VmInheritT = CInt
public typealias LedgerArrayT = COpaquePointer?
public typealias SfHdtr = COpaquePointer?
