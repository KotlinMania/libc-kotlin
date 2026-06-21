// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias Ioctl = CInt
public typealias ClockT = CLong
public typealias TimeT = CLong
public typealias SusecondsT = CLong
public typealias OffT = CLong
public typealias BlkcntT = CULong
public typealias BlksizeT = CULong
public typealias NlinkT = UInt
public typealias PthreadT = CLong
public typealias PthreadMutexattrT = CLong
public typealias PthreadRwlockattrT = CLong
public typealias PthreadBarrierattrT = CInt
public typealias PthreadCondattrT = CLong
public typealias PthreadKeyT = CInt
public typealias FsfilcntT = CULong
public typealias FsblkcntT = CULong
public typealias NfdsT = CUInt
public typealias RlimT = CULong
public typealias DevT = CULong
public typealias InoT = CULong
public typealias Ino64T = ULong
public typealias CPUBITTYPE = CULong
public typealias IdtypeT = CInt
public typealias LoffT = CLongLong
public typealias KernelLoffT = CLongLong
public typealias KernelPidT = CInt
public typealias U8 = CUChar
public typealias U16 = CUShort
public typealias S16 = CShort
public typealias U32 = CUInt
public typealias S32 = CInt
public typealias Elf32Addr = UInt
public typealias Elf32Half = UShort
public typealias Elf32Off = UInt
public typealias Elf32Word = UInt
public typealias Elf64Addr = ULong
public typealias Elf64Half = UShort
public typealias Elf64Off = ULong
public typealias Elf64Word = UInt
public typealias Elf64Xword = ULong
public typealias EventfdT = ULong
public typealias PosixSpawnFileActionsT = COpaquePointer?
public typealias PosixSpawnattrT = COpaquePointer?

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: CInt,
    val ssSize: ULong,
)

public data class FsidT(
    val val: IntArray,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cLine: CcT,
    val cCc: List<CcT>,
)

public data class Termios2(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cLine: CcT,
    val cCc: List<CcT>,
    val cIspeed: SpeedT,
    val cOspeed: SpeedT,
)

public data class Mallinfo(
    val arena: ULong,
    val ordblks: ULong,
    val smblks: ULong,
    val hblks: ULong,
    val hblkhd: ULong,
    val usmblks: ULong,
    val fsmblks: ULong,
    val uordblks: ULong,
    val fordblks: ULong,
    val keepcost: ULong,
)

public data class Flock(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: OffT,
    val lLen: OffT,
    val lPid: PidT,
)

public data class Flock64(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: KernelLoffT,
    val lLen: KernelLoffT,
    val lPid: KernelPidT,
)

public data class CpuSetT(
    val bits: List<CPUBITTYPE>,
    val bits: List<CPUBITTYPE>,
)

public data class SemT(
    val count: CUInt,
)

public data class ExitStatus(
    val eTermination: CShort,
    val eExit: CShort,
)

public data class Statvfs(
    val fBsize: CULong,
    val fFrsize: CULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFavail: FsfilcntT,
    val fFsid: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
)

public data class SignalfdSiginfo(
    val ssiSigno: UInt,
    val ssiErrno: Int,
    val ssiCode: Int,
    val ssiPid: UInt,
    val ssiUid: UInt,
    val ssiFd: Int,
    val ssiTid: UInt,
    val ssiBand: UInt,
    val ssiOverrun: UInt,
    val ssiTrapno: UInt,
    val ssiStatus: Int,
    val ssiInt: Int,
    val ssiPtr: CULongLong,
    val ssiUtime: CULongLong,
    val ssiStime: CULongLong,
    val ssiAddr: CULongLong,
    val ssiAddrLsb: UShort,
    val ssiSyscall: Int,
    val ssiCallAddr: ULong,
    val ssiArch: UInt,
)

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)

public data class Genlmsghdr(
    val cmd: UByte,
    val version: UByte,
    val reserved: UShort,
)

public data class Nlmsghdr(
    val nlmsgLen: UInt,
    val nlmsgType: UShort,
    val nlmsgFlags: UShort,
    val nlmsgSeq: UInt,
    val nlmsgPid: UInt,
)

public data class Nlmsgerr(
    val error: CInt,
    val msg: Nlmsghdr,
)

public data class NlPktinfo(
    val group: UInt,
)

public data class NlMmapReq(
    val nmBlockSize: CUInt,
    val nmBlockNr: CUInt,
    val nmFrameSize: CUInt,
    val nmFrameNr: CUInt,
)

public data class NlMmapHdr(
    val nmStatus: CUInt,
    val nmLen: CUInt,
    val nmGroup: UInt,
    val nmPid: UInt,
    val nmUid: UInt,
    val nmGid: UInt,
)

public data class Nlattr(
    val nlaLen: UShort,
    val nlaType: UShort,
)

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: CInt,
)

public data class InotifyEvent(
    val wd: CInt,
    val mask: UInt,
    val cookie: UInt,
    val len: UInt,
)

public data class SockExtendedErr(
    val eeErrno: UInt,
    val eeOrigin: UByte,
    val eeType: UByte,
    val eeCode: UByte,
    val eePad: UByte,
    val eeInfo: UInt,
    val eeData: UInt,
)

public data class RegexT(
    val reMagic: CInt,
    val reNsub: ULong,
    val reEndp: String?,
    val reGuts: COpaquePointer?,
)

public data class RegmatchT(
    val rmSo: SsizeT,
    val rmEo: SsizeT,
)

public data class SockaddrVm(
    val svmFamily: SaFamilyT,
    val svmReserved1: CUShort,
    val svmPort: CUInt,
    val svmCid: CUInt,
    val svmZero: UByteArray,
)

public data class Elf32Phdr(
    val pType: Elf32Word,
    val pOffset: Elf32Off,
    val pVaddr: Elf32Addr,
    val pPaddr: Elf32Addr,
    val pFilesz: Elf32Word,
    val pMemsz: Elf32Word,
    val pFlags: Elf32Word,
    val pAlign: Elf32Word,
)

public data class Elf64Phdr(
    val pType: Elf64Word,
    val pFlags: Elf64Word,
    val pOffset: Elf64Off,
    val pVaddr: Elf64Addr,
    val pPaddr: Elf64Addr,
    val pFilesz: Elf64Xword,
    val pMemsz: Elf64Xword,
    val pAlign: Elf64Xword,
)

public data class DlPhdrInfo(
    val dlpiAddr: Elf64Addr,
    val dlpiAddr: Elf32Addr,
    val dlpiName: String?,
    val dlpiPhdr: Elf64Phdr?,
    val dlpiPhdr: Elf32Phdr?,
    val dlpiPhnum: Elf64Half,
    val dlpiPhnum: Elf32Half,
    val dlpiAdds: CULongLong,
    val dlpiSubs: CULongLong,
    val dlpiTlsModid: ULong,
    val dlpiTlsData: COpaquePointer?,
)

public data class SeccompData(
    val nr: CInt,
    val arch: U32,
    val instructionPointer: U64,
    val args: List<U64>,
)

public data class SeccompMetadata(
    val filterOff: U64,
    val flags: U64,
)

public data class PtracePeeksiginfoArgs(
    val off: U64,
    val flags: U32,
    val nr: S32,
)

public data class InputEvent(
    val time: Timeval,
    val type: U16,
    val code: U16,
    val value: S32,
)

public data class InputId(
    val bustype: U16,
    val vendor: U16,
    val product: U16,
    val version: U16,
)

public data class InputAbsinfo(
    val value: S32,
    val minimum: S32,
    val maximum: S32,
    val fuzz: S32,
    val flat: S32,
    val resolution: S32,
)

public data class InputKeymapEntry(
    val flags: U8,
    val len: U8,
    val index: U16,
    val keycode: U32,
    val scancode: List<U8>,
)

public data class InputMask(
    val type: U32,
    val codesSize: U32,
    val codesPtr: U64,
)

public data class FfReplay(
    val length: U16,
    val delay: U16,
)

public data class FfTrigger(
    val button: U16,
    val interval: U16,
)

public data class FfEnvelope(
    val attackLength: U16,
    val attackLevel: U16,
    val fadeLength: U16,
    val fadeLevel: U16,
)

public data class FfConstantEffect(
    val level: S16,
    val envelope: FfEnvelope,
)

public data class FfRampEffect(
    val startLevel: S16,
    val endLevel: S16,
    val envelope: FfEnvelope,
)

public data class FfConditionEffect(
    val rightSaturation: U16,
    val leftSaturation: U16,
    val rightCoeff: S16,
    val leftCoeff: S16,
    val deadband: U16,
    val center: S16,
)

public data class FfPeriodicEffect(
    val waveform: U16,
    val period: U16,
    val magnitude: S16,
    val offset: S16,
    val phase: U16,
    val envelope: FfEnvelope,
    val customLen: U32,
    val customData: S16?,
)

public data class FfRumbleEffect(
    val strongMagnitude: U16,
    val weakMagnitude: U16,
)

public data class FfEffect(
    val type: U16,
    val id: S16,
    val direction: U16,
    val trigger: FfTrigger,
    val replay: FfReplay,
    val u: ULongArray,
    val u: UIntArray,
)

public data class UinputFfUpload(
    val requestId: U32,
    val retval: S32,
    val effect: FfEffect,
    val old: FfEffect,
)

public data class UinputFfErase(
    val requestId: U32,
    val retval: S32,
    val effectId: U32,
)

public data class UinputAbsSetup(
    val code: U16,
    val absinfo: InputAbsinfo,
)

public data class Option(
    val name: String?,
    val hasArg: CInt,
    val flag: CInt?,
    val val: CInt,
)

public data class CAnonymousIfruMap(
    val memStart: CULong,
    val memEnd: CULong,
    val baseAddr: CUShort,
    val irq: CUChar,
    val dma: CUChar,
    val port: CUChar,
)

public data class In6Ifreq(
    val ifr6Addr: In6Addr,
    val ifr6Prefixlen: UInt,
    val ifr6Ifindex: CInt,
)

public data class SockaddrNl(
    val nlFamily: SaFamilyT,
    val nlPid: UInt,
    val nlGroups: UInt,
)

public data class Dirent(
    val dIno: ULong,
    val dOff: Long,
    val dReclen: CUShort,
    val dType: CUChar,
    val dName: ByteArray,
)

public data class Dirent64(
    val dIno: ULong,
    val dOff: Long,
    val dReclen: CUShort,
    val dType: CUChar,
    val dName: ByteArray,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siErrno: CInt,
    val siCode: CInt,
    val pad: IntArray,
    val align: List<ULong>,
)

public data class Lastlog(
    val llTime: TimeT,
    val llLine: ByteArray,
    val llHost: ByteArray,
)

public data class Utmp(
    val utType: CShort,
    val utPid: PidT,
    val utLine: ByteArray,
    val utId: ByteArray,
    val utUser: ByteArray,
    val utHost: ByteArray,
    val utExit: ExitStatus,
    val utSession: CLong,
    val utTv: Timeval,
    val utAddrV6: IntArray,
)

public data class SockaddrAlg(
    val salgFamily: SaFamilyT,
    val salgType: UByteArray,
    val salgFeat: UInt,
    val salgMask: UInt,
    val salgName: UByteArray,
)

public data class UinputSetup(
    val id: InputId,
    val name: ByteArray,
    val ffEffectsMax: U32,
)

public data class UinputUserDev(
    val name: ByteArray,
    val id: InputId,
    val ffEffectsMax: U32,
    val absmax: List<S32>,
    val absmin: List<S32>,
    val absfuzz: List<S32>,
    val absflat: List<S32>,
)

public data class PropInfo(
    val name: ByteArray,
    val serial: CUInt,
    val value: ByteArray,
)

public data class AfAlgIv(
    val ivlen: UInt,
    val iv: UByteArray,
)

public data class Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: CAnonymousIfrIfru,
)

public data class Ifconf(
    val ifcLen: CInt,
    val ifcIfcu: CAnonymousIfcIfcu,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfrIfru(
    val ifruAddr: Sockaddr = null,
    val ifruDstaddr: Sockaddr = null,
    val ifruBroadaddr: Sockaddr = null,
    val ifruNetmask: Sockaddr = null,
    val ifruHwaddr: Sockaddr = null,
    val ifruFlags: CShort = null,
    val ifruIfindex: CInt = null,
    val ifruMetric: CInt = null,
    val ifruMtu: CInt = null,
    val ifruMap: CAnonymousIfruMap = null,
    val ifruSlave: ByteArray = null,
    val ifruNewname: ByteArray = null,
    val ifruData: String? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfcIfcu(
    val ifcuBuf: String? = null,
    val ifcuReq: Ifreq? = null,
)

public const val MADV_SOFT_OFFLINE: CInt = 101
public const val MS_NOUSER: CULong = 0xffffffff80000000uL
public const val MS_RMT_MASK: CULong = 0x02800051uL
public const val O_TRUNC: CInt = 512
public const val O_CLOEXEC: CInt = 0x80000
public const val O_PATH: CInt = 2097152
public const val O_NOATIME: CInt = 262144
public const val EBFONT: CInt = 59
public const val ENOSTR: CInt = 60
public const val ENODATA: CInt = 61
public const val ETIME: CInt = 62
public const val ENOSR: CInt = 63
public const val ENONET: CInt = 64
public const val ENOPKG: CInt = 65
public const val EREMOTE: CInt = 66
public const val ENOLINK: CInt = 67
public const val EADV: CInt = 68
public const val ESRMNT: CInt = 69
public const val ECOMM: CInt = 70
public const val EPROTO: CInt = 71
public const val EDOTDOT: CInt = 73
public const val EPOLL_CLOEXEC: CInt = 0x80000
public const val EFD_SEMAPHORE: CInt = 0x1
public const val EFD_CLOEXEC: CInt = O_CLOEXEC
public const val EFD_NONBLOCK: CInt = O_NONBLOCK
public const val TFD_CLOEXEC: CInt = O_CLOEXEC
public const val TFD_NONBLOCK: CInt = O_NONBLOCK
public const val TFD_TIMER_ABSTIME: CInt = 1
public const val TFD_TIMER_CANCEL_ON_SET: CInt = 2
public const val USER_PROCESS: CShort = 7
public const val _POSIX_VDISABLE: CcT = 0
public const val FALLOC_FL_KEEP_SIZE: CInt = 0x01
public const val FALLOC_FL_PUNCH_HOLE: CInt = 0x02
public const val FALLOC_FL_NO_HIDE_STALE: CInt = 0x04
public const val FALLOC_FL_COLLAPSE_RANGE: CInt = 0x08
public const val FALLOC_FL_ZERO_RANGE: CInt = 0x10
public const val FALLOC_FL_INSERT_RANGE: CInt = 0x20
public const val FALLOC_FL_UNSHARE_RANGE: CInt = 0x40
public const val BUFSIZ: CUInt = 1024u
public const val FILENAME_MAX: CUInt = 4096u
public const val FOPEN_MAX: CUInt = 20u
public const val POSIX_FADV_DONTNEED: CInt = 4
public const val POSIX_FADV_NOREUSE: CInt = 5
public const val L_tmpnam: CUInt = 4096u
public const val TMP_MAX: CUInt = 308915776u
public const val _PC_LINK_MAX: CInt = 1
public const val _PC_MAX_CANON: CInt = 2
public const val _PC_MAX_INPUT: CInt = 3
public const val _PC_NAME_MAX: CInt = 4
public const val _PC_PATH_MAX: CInt = 5
public const val _PC_PIPE_BUF: CInt = 6
public const val _PC_2_SYMLINKS: CInt = 7
public const val _PC_ALLOC_SIZE_MIN: CInt = 8
public const val _PC_REC_INCR_XFER_SIZE: CInt = 9
public const val _PC_REC_MAX_XFER_SIZE: CInt = 10
public const val _PC_REC_MIN_XFER_SIZE: CInt = 11
public const val _PC_REC_XFER_ALIGN: CInt = 12
public const val _PC_SYMLINK_MAX: CInt = 13
public const val _PC_CHOWN_RESTRICTED: CInt = 14
public const val _PC_NO_TRUNC: CInt = 15
public const val _PC_VDISABLE: CInt = 16
public const val _PC_ASYNC_IO: CInt = 17
public const val _PC_PRIO_IO: CInt = 18
public const val _PC_SYNC_IO: CInt = 19
public const val FIONBIO: CInt = 0x5421
public const val _SC_ARG_MAX: CInt = 0x0000
public const val _SC_BC_BASE_MAX: CInt = 0x0001
public const val _SC_BC_DIM_MAX: CInt = 0x0002
public const val _SC_BC_SCALE_MAX: CInt = 0x0003
public const val _SC_BC_STRING_MAX: CInt = 0x0004
public const val _SC_CHILD_MAX: CInt = 0x0005
public const val _SC_CLK_TCK: CInt = 0x0006
public const val _SC_COLL_WEIGHTS_MAX: CInt = 0x0007
public const val _SC_EXPR_NEST_MAX: CInt = 0x0008
public const val _SC_LINE_MAX: CInt = 0x0009
public const val _SC_NGROUPS_MAX: CInt = 0x000a
public const val _SC_OPEN_MAX: CInt = 0x000b
public const val _SC_PASS_MAX: CInt = 0x000c
public const val _SC_2_C_BIND: CInt = 0x000d
public const val _SC_2_C_DEV: CInt = 0x000e
public const val _SC_2_C_VERSION: CInt = 0x000f
public const val _SC_2_CHAR_TERM: CInt = 0x0010
public const val _SC_2_FORT_DEV: CInt = 0x0011
public const val _SC_2_FORT_RUN: CInt = 0x0012
public const val _SC_2_LOCALEDEF: CInt = 0x0013
public const val _SC_2_SW_DEV: CInt = 0x0014
public const val _SC_2_UPE: CInt = 0x0015
public const val _SC_2_VERSION: CInt = 0x0016
public const val _SC_JOB_CONTROL: CInt = 0x0017
public const val _SC_SAVED_IDS: CInt = 0x0018
public const val _SC_VERSION: CInt = 0x0019
public const val _SC_RE_DUP_MAX: CInt = 0x001a
public const val _SC_STREAM_MAX: CInt = 0x001b
public const val _SC_TZNAME_MAX: CInt = 0x001c
public const val _SC_XOPEN_CRYPT: CInt = 0x001d
public const val _SC_XOPEN_ENH_I18N: CInt = 0x001e
public const val _SC_XOPEN_SHM: CInt = 0x001f
public const val _SC_XOPEN_VERSION: CInt = 0x0020
public const val _SC_XOPEN_XCU_VERSION: CInt = 0x0021
public const val _SC_XOPEN_REALTIME: CInt = 0x0022
public const val _SC_XOPEN_REALTIME_THREADS: CInt = 0x0023
public const val _SC_XOPEN_LEGACY: CInt = 0x0024
public const val _SC_ATEXIT_MAX: CInt = 0x0025
public const val _SC_IOV_MAX: CInt = 0x0026
public const val _SC_UIO_MAXIOV: CInt = _SC_IOV_MAX
public const val _SC_PAGESIZE: CInt = 0x0027
public const val _SC_PAGE_SIZE: CInt = 0x0028
public const val _SC_XOPEN_UNIX: CInt = 0x0029
public const val _SC_XBS5_ILP32_OFF32: CInt = 0x002a
public const val _SC_XBS5_ILP32_OFFBIG: CInt = 0x002b
public const val _SC_XBS5_LP64_OFF64: CInt = 0x002c
public const val _SC_XBS5_LPBIG_OFFBIG: CInt = 0x002d
public const val _SC_AIO_LISTIO_MAX: CInt = 0x002e
public const val _SC_AIO_MAX: CInt = 0x002f
public const val _SC_AIO_PRIO_DELTA_MAX: CInt = 0x0030
public const val _SC_DELAYTIMER_MAX: CInt = 0x0031
public const val _SC_MQ_OPEN_MAX: CInt = 0x0032
public const val _SC_MQ_PRIO_MAX: CInt = 0x0033
public const val _SC_RTSIG_MAX: CInt = 0x0034
public const val _SC_SEM_NSEMS_MAX: CInt = 0x0035
public const val _SC_SEM_VALUE_MAX: CInt = 0x0036
public const val _SC_SIGQUEUE_MAX: CInt = 0x0037
public const val _SC_TIMER_MAX: CInt = 0x0038
public const val _SC_ASYNCHRONOUS_IO: CInt = 0x0039
public const val _SC_FSYNC: CInt = 0x003a
public const val _SC_MAPPED_FILES: CInt = 0x003b
public const val _SC_MEMLOCK: CInt = 0x003c
public const val _SC_MEMLOCK_RANGE: CInt = 0x003d
public const val _SC_MEMORY_PROTECTION: CInt = 0x003e
public const val _SC_MESSAGE_PASSING: CInt = 0x003f
public const val _SC_PRIORITIZED_IO: CInt = 0x0040
public const val _SC_PRIORITY_SCHEDULING: CInt = 0x0041
public const val _SC_REALTIME_SIGNALS: CInt = 0x0042
public const val _SC_SEMAPHORES: CInt = 0x0043
public const val _SC_SHARED_MEMORY_OBJECTS: CInt = 0x0044
public const val _SC_SYNCHRONIZED_IO: CInt = 0x0045
public const val _SC_TIMERS: CInt = 0x0046
public const val _SC_GETGR_R_SIZE_MAX: CInt = 0x0047
public const val _SC_GETPW_R_SIZE_MAX: CInt = 0x0048
public const val _SC_LOGIN_NAME_MAX: CInt = 0x0049
public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 0x004a
public const val _SC_THREAD_KEYS_MAX: CInt = 0x004b
public const val _SC_THREAD_STACK_MIN: CInt = 0x004c
public const val _SC_THREAD_THREADS_MAX: CInt = 0x004d
public const val _SC_TTY_NAME_MAX: CInt = 0x004e
public const val _SC_THREADS: CInt = 0x004f
public const val _SC_THREAD_ATTR_STACKADDR: CInt = 0x0050
public const val _SC_THREAD_ATTR_STACKSIZE: CInt = 0x0051
public const val _SC_THREAD_PRIORITY_SCHEDULING: CInt = 0x0052
public const val _SC_THREAD_PRIO_INHERIT: CInt = 0x0053
public const val _SC_THREAD_PRIO_PROTECT: CInt = 0x0054
public const val _SC_THREAD_SAFE_FUNCTIONS: CInt = 0x0055
public const val _SC_NPROCESSORS_CONF: CInt = 0x0060
public const val _SC_NPROCESSORS_ONLN: CInt = 0x0061
public const val _SC_PHYS_PAGES: CInt = 0x0062
public const val _SC_AVPHYS_PAGES: CInt = 0x0063
public const val _SC_MONOTONIC_CLOCK: CInt = 0x0064
public const val _SC_2_PBS: CInt = 0x0065
public const val _SC_2_PBS_ACCOUNTING: CInt = 0x0066
public const val _SC_2_PBS_CHECKPOINT: CInt = 0x0067
public const val _SC_2_PBS_LOCATE: CInt = 0x0068
public const val _SC_2_PBS_MESSAGE: CInt = 0x0069
public const val _SC_2_PBS_TRACK: CInt = 0x006a
public const val _SC_ADVISORY_INFO: CInt = 0x006b
public const val _SC_BARRIERS: CInt = 0x006c
public const val _SC_CLOCK_SELECTION: CInt = 0x006d
public const val _SC_CPUTIME: CInt = 0x006e
public const val _SC_HOST_NAME_MAX: CInt = 0x006f
public const val _SC_IPV6: CInt = 0x0070
public const val _SC_RAW_SOCKETS: CInt = 0x0071
public const val _SC_READER_WRITER_LOCKS: CInt = 0x0072
public const val _SC_REGEXP: CInt = 0x0073
public const val _SC_SHELL: CInt = 0x0074
public const val _SC_SPAWN: CInt = 0x0075
public const val _SC_SPIN_LOCKS: CInt = 0x0076
public const val _SC_SPORADIC_SERVER: CInt = 0x0077
public const val _SC_SS_REPL_MAX: CInt = 0x0078
public const val _SC_SYMLOOP_MAX: CInt = 0x0079
public const val _SC_THREAD_CPUTIME: CInt = 0x007a
public const val _SC_THREAD_PROCESS_SHARED: CInt = 0x007b
public const val _SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 0x007c
public const val _SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 0x007d
public const val _SC_THREAD_SPORADIC_SERVER: CInt = 0x007e
public const val _SC_TIMEOUTS: CInt = 0x007f
public const val _SC_TRACE: CInt = 0x0080
public const val _SC_TRACE_EVENT_FILTER: CInt = 0x0081
public const val _SC_TRACE_EVENT_NAME_MAX: CInt = 0x0082
public const val _SC_TRACE_INHERIT: CInt = 0x0083
public const val _SC_TRACE_LOG: CInt = 0x0084
public const val _SC_TRACE_NAME_MAX: CInt = 0x0085
public const val _SC_TRACE_SYS_MAX: CInt = 0x0086
public const val _SC_TRACE_USER_EVENT_MAX: CInt = 0x0087
public const val _SC_TYPED_MEMORY_OBJECTS: CInt = 0x0088
public const val _SC_V7_ILP32_OFF32: CInt = 0x0089
public const val _SC_V7_ILP32_OFFBIG: CInt = 0x008a
public const val _SC_V7_LP64_OFF64: CInt = 0x008b
public const val _SC_V7_LPBIG_OFFBIG: CInt = 0x008c
public const val _SC_XOPEN_STREAMS: CInt = 0x008d
public const val _SC_XOPEN_UUCP: CInt = 0x008e
public const val _SC_LEVEL1_ICACHE_SIZE: CInt = 0x008f
public const val _SC_LEVEL1_ICACHE_ASSOC: CInt = 0x0090
public const val _SC_LEVEL1_ICACHE_LINESIZE: CInt = 0x0091
public const val _SC_LEVEL1_DCACHE_SIZE: CInt = 0x0092
public const val _SC_LEVEL1_DCACHE_ASSOC: CInt = 0x0093
public const val _SC_LEVEL1_DCACHE_LINESIZE: CInt = 0x0094
public const val _SC_LEVEL2_CACHE_SIZE: CInt = 0x0095
public const val _SC_LEVEL2_CACHE_ASSOC: CInt = 0x0096
public const val _SC_LEVEL2_CACHE_LINESIZE: CInt = 0x0097
public const val _SC_LEVEL3_CACHE_SIZE: CInt = 0x0098
public const val _SC_LEVEL3_CACHE_ASSOC: CInt = 0x0099
public const val _SC_LEVEL3_CACHE_LINESIZE: CInt = 0x009a
public const val _SC_LEVEL4_CACHE_SIZE: CInt = 0x009b
public const val _SC_LEVEL4_CACHE_ASSOC: CInt = 0x009c
public const val _SC_LEVEL4_CACHE_LINESIZE: CInt = 0x009d
public const val F_LOCK: CInt = 1
public const val F_TEST: CInt = 3
public const val F_TLOCK: CInt = 2
public const val F_ULOCK: CInt = 0
public const val F_SEAL_FUTURE_WRITE: CInt = 0x0010
public const val F_SEAL_EXEC: CInt = 0x0020
public const val IFF_LOWER_UP: CInt = 0x10000
public const val IFF_DORMANT: CInt = 0x20000
public const val IFF_ECHO: CInt = 0x40000
public const val PTHREAD_BARRIER_SERIAL_THREAD: CInt = -1
public const val PTHREAD_MUTEX_NORMAL: CInt = 0
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 1
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 2
public const val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL
public const val PTHREAD_EXPLICIT_SCHED: CInt = 0
public const val PTHREAD_INHERIT_SCHED: CInt = 1
public const val RENAME_NOREPLACE: CInt = 1
public const val RENAME_EXCHANGE: CInt = 2
public const val RENAME_WHITEOUT: CInt = 4
public const val FIOCLEX: CInt = 0x5451
public const val FIONCLEX: CInt = 0x5450
public const val SIGCHLD: CInt = 17
public const val SIGBUS: CInt = 7
public const val SIGUSR1: CInt = 10
public const val SIGUSR2: CInt = 12
public const val SIGCONT: CInt = 18
public const val SIGSTOP: CInt = 19
public const val SIGTSTP: CInt = 20
public const val SIGURG: CInt = 23
public const val SIGIO: CInt = 29
public const val SIGSYS: CInt = 31
public const val SIGSTKFLT: CInt = 16
public const val SIGUNUSED: CInt = 31
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGXCPU: CInt = 24
public const val SIGXFSZ: CInt = 25
public const val SIGVTALRM: CInt = 26
public const val SIGPROF: CInt = 27
public const val SIGWINCH: CInt = 28
public const val SIGPOLL: CInt = 29
public const val SIGPWR: CInt = 30
public const val SIG_SETMASK: CInt = 2
public const val SIG_BLOCK: CInt = 0x000000
public const val SIG_UNBLOCK: CInt = 0x01
public const val RUSAGE_CHILDREN: CInt = -1
public const val LC_PAPER: CInt = 7
public const val LC_NAME: CInt = 8
public const val LC_ADDRESS: CInt = 9
public const val LC_TELEPHONE: CInt = 10
public const val LC_MEASUREMENT: CInt = 11
public const val LC_IDENTIFICATION: CInt = 12
public val LC_PAPER_MASK: CInt = 1 shl LC_PAPER
public val LC_NAME_MASK: CInt = 1 shl LC_NAME
public val LC_ADDRESS_MASK: CInt = 1 shl LC_ADDRESS
public val LC_TELEPHONE_MASK: CInt = 1 shl LC_TELEPHONE
public val LC_MEASUREMENT_MASK: CInt = 1 shl LC_MEASUREMENT
public val LC_IDENTIFICATION_MASK: CInt = 1 shl LC_IDENTIFICATION
public val LC_ALL_MASK: CInt = LC_CTYPE_MASK or LC_NUMERIC_MASK or LC_TIME_MASK or LC_COLLATE_MASK or LC_MONETARY_MASK or LC_MESSAGES_MASK or LC_PAPER_MASK or LC_NAME_MASK or LC_ADDRESS_MASK or LC_TELEPHONE_MASK or LC_MEASUREMENT_MASK or LC_IDENTIFICATION_MASK
public const val MAP_ANON: CInt = 0x0020
public const val MAP_ANONYMOUS: CInt = 0x0020
public const val MAP_GROWSDOWN: CInt = 0x0100
public const val MAP_DENYWRITE: CInt = 0x0800
public const val MAP_EXECUTABLE: CInt = 0x01000
public const val MAP_LOCKED: CInt = 0x02000
public const val MAP_NORESERVE: CInt = 0x04000
public const val MAP_POPULATE: CInt = 0x08000
public const val MAP_NONBLOCK: CInt = 0x010000
public const val MAP_STACK: CInt = 0x020000
public const val EDEADLK: CInt = 35
public const val ENAMETOOLONG: CInt = 36
public const val ENOLCK: CInt = 37
public const val ENOSYS: CInt = 38
public const val ENOTEMPTY: CInt = 39
public const val ELOOP: CInt = 40
public const val ENOMSG: CInt = 42
public const val EIDRM: CInt = 43
public const val ECHRNG: CInt = 44
public const val EL2NSYNC: CInt = 45
public const val EL3HLT: CInt = 46
public const val EL3RST: CInt = 47
public const val ELNRNG: CInt = 48
public const val EUNATCH: CInt = 49
public const val ENOCSI: CInt = 50
public const val EL2HLT: CInt = 51
public const val EBADE: CInt = 52
public const val EBADR: CInt = 53
public const val EXFULL: CInt = 54
public const val ENOANO: CInt = 55
public const val EBADRQC: CInt = 56
public const val EBADSLT: CInt = 57
public const val EMULTIHOP: CInt = 72
public const val EBADMSG: CInt = 74
public const val EOVERFLOW: CInt = 75
public const val ENOTUNIQ: CInt = 76
public const val EBADFD: CInt = 77
public const val EREMCHG: CInt = 78
public const val ELIBACC: CInt = 79
public const val ELIBBAD: CInt = 80
public const val ELIBSCN: CInt = 81
public const val ELIBMAX: CInt = 82
public const val ELIBEXEC: CInt = 83
public const val EILSEQ: CInt = 84
public const val ERESTART: CInt = 85
public const val ESTRPIPE: CInt = 86
public const val EUSERS: CInt = 87
public const val ENOTSOCK: CInt = 88
public const val EDESTADDRREQ: CInt = 89
public const val EMSGSIZE: CInt = 90
public const val EPROTOTYPE: CInt = 91
public const val ENOPROTOOPT: CInt = 92
public const val EPROTONOSUPPORT: CInt = 93
public const val ESOCKTNOSUPPORT: CInt = 94
public const val EOPNOTSUPP: CInt = 95
public const val ENOTSUP: CInt = EOPNOTSUPP
public const val EPFNOSUPPORT: CInt = 96
public const val EAFNOSUPPORT: CInt = 97
public const val EADDRINUSE: CInt = 98
public const val EADDRNOTAVAIL: CInt = 99
public const val ENETDOWN: CInt = 100
public const val ENETUNREACH: CInt = 101
public const val ENETRESET: CInt = 102
public const val ECONNABORTED: CInt = 103
public const val ECONNRESET: CInt = 104
public const val ENOBUFS: CInt = 105
public const val EISCONN: CInt = 106
public const val ENOTCONN: CInt = 107
public const val ESHUTDOWN: CInt = 108
public const val ETOOMANYREFS: CInt = 109
public const val ETIMEDOUT: CInt = 110
public const val ECONNREFUSED: CInt = 111
public const val EHOSTDOWN: CInt = 112
public const val EHOSTUNREACH: CInt = 113
public const val EALREADY: CInt = 114
public const val EINPROGRESS: CInt = 115
public const val ESTALE: CInt = 116
public const val EUCLEAN: CInt = 117
public const val ENOTNAM: CInt = 118
public const val ENAVAIL: CInt = 119
public const val EISNAM: CInt = 120
public const val EREMOTEIO: CInt = 121
public const val EDQUOT: CInt = 122
public const val ENOMEDIUM: CInt = 123
public const val EMEDIUMTYPE: CInt = 124
public const val ECANCELED: CInt = 125
public const val ENOKEY: CInt = 126
public const val EKEYEXPIRED: CInt = 127
public const val EKEYREVOKED: CInt = 128
public const val EKEYREJECTED: CInt = 129
public const val EOWNERDEAD: CInt = 130
public const val ENOTRECOVERABLE: CInt = 131
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
public const val SOCK_SEQPACKET: CInt = 5
public const val SOCK_DCCP: CInt = 6
public const val SOCK_PACKET: CInt = 10
public const val IPPROTO_MAX: CInt = 256
public const val SOL_SOCKET: CInt = 1
public const val SOL_SCTP: CInt = 132
public const val SOL_IPX: CInt = 256
public const val SOL_AX25: CInt = 257
public const val SOL_ATALK: CInt = 258
public const val SOL_NETROM: CInt = 259
public const val SOL_ROSE: CInt = 260
public const val UDP_CORK: CInt = 1
public const val UDP_ENCAP: CInt = 100
public const val UDP_NO_CHECK6_TX: CInt = 101
public const val UDP_NO_CHECK6_RX: CInt = 102
public const val UDP_SEGMENT: CInt = 103
public const val UDP_GRO: CInt = 104
public const val DCCP_SOCKOPT_PACKET_SIZE: CInt = 1
public const val DCCP_SOCKOPT_SERVICE: CInt = 2
public const val DCCP_SOCKOPT_CHANGE_L: CInt = 3
public const val DCCP_SOCKOPT_CHANGE_R: CInt = 4
public const val DCCP_SOCKOPT_GET_CUR_MPS: CInt = 5
public const val DCCP_SOCKOPT_SERVER_TIMEWAIT: CInt = 6
public const val DCCP_SOCKOPT_SEND_CSCOV: CInt = 10
public const val DCCP_SOCKOPT_RECV_CSCOV: CInt = 11
public const val DCCP_SOCKOPT_AVAILABLE_CCIDS: CInt = 12
public const val DCCP_SOCKOPT_CCID: CInt = 13
public const val DCCP_SOCKOPT_TX_CCID: CInt = 14
public const val DCCP_SOCKOPT_RX_CCID: CInt = 15
public const val DCCP_SOCKOPT_QPOLICY_ID: CInt = 16
public const val DCCP_SOCKOPT_QPOLICY_TXQLEN: CInt = 17
public const val DCCP_SOCKOPT_CCID_RX_INFO: CInt = 128
public const val DCCP_SOCKOPT_CCID_TX_INFO: CInt = 192
public const val DCCP_SERVICE_LIST_MAX_LEN: CInt = 32
public const val SO_REUSEADDR: CInt = 2
public const val SO_TYPE: CInt = 3
public const val SO_ERROR: CInt = 4
public const val SO_DONTROUTE: CInt = 5
public const val SO_BROADCAST: CInt = 6
public const val SO_SNDBUF: CInt = 7
public const val SO_RCVBUF: CInt = 8
public const val SO_KEEPALIVE: CInt = 9
public const val SO_OOBINLINE: CInt = 10
public const val SO_PRIORITY: CInt = 12
public const val SO_LINGER: CInt = 13
public const val SO_BSDCOMPAT: CInt = 14
public const val SO_REUSEPORT: CInt = 15
public const val SO_PASSCRED: CInt = 16
public const val SO_PEERCRED: CInt = 17
public const val SO_RCVLOWAT: CInt = 18
public const val SO_SNDLOWAT: CInt = 19
public const val SO_RCVTIMEO: CInt = 20
public const val SO_SNDTIMEO: CInt = 21
public const val SO_BINDTODEVICE: CInt = 25
public const val SO_ATTACH_FILTER: CInt = 26
public const val SO_DETACH_FILTER: CInt = 27
public const val SO_GET_FILTER: CInt = SO_ATTACH_FILTER
public const val SO_TIMESTAMP: CInt = 29
public const val SO_ACCEPTCONN: CInt = 30
public const val SO_PEERSEC: CInt = 31
public const val SO_SNDBUFFORCE: CInt = 32
public const val SO_RCVBUFFORCE: CInt = 33
public const val SO_PASSSEC: CInt = 34
public const val SO_TIMESTAMPNS: CInt = 35
public const val SO_TIMESTAMPNS_OLD: CInt = 35
public const val SO_MARK: CInt = 36
public const val SO_TIMESTAMPING: CInt = 37
public const val SO_TIMESTAMPING_OLD: CInt = 37
public const val SO_PROTOCOL: CInt = 38
public const val SO_DOMAIN: CInt = 39
public const val SO_RXQ_OVFL: CInt = 40
public const val SO_PEEK_OFF: CInt = 42
public const val SO_BUSY_POLL: CInt = 46
public const val SCM_TIMESTAMPING_OPT_STATS: CInt = 54
public const val SCM_TIMESTAMPING_PKTINFO: CInt = 58
public const val SO_BINDTOIFINDEX: CInt = 62
public const val SO_TIMESTAMP_NEW: CInt = 63
public const val SO_TIMESTAMPNS_NEW: CInt = 64
public const val SO_TIMESTAMPING_NEW: CInt = 65
public const val SCM_TIMESTAMP: CInt = SO_TIMESTAMP
public const val SCM_TIMESTAMPNS: CInt = SO_TIMESTAMPNS
public const val SCM_TIMESTAMPING: CInt = SO_TIMESTAMPING
public const val IPTOS_ECN_NOTECT: UByte = 0x00u
public const val O_ACCMODE: CInt = 3
public const val O_APPEND: CInt = 1024
public const val O_CREAT: CInt = 64
public const val O_EXCL: CInt = 128
public const val O_NOCTTY: CInt = 256
public const val O_NONBLOCK: CInt = 2048
public const val O_SYNC: CInt = 0x101000
public const val O_ASYNC: CInt = 0x2000
public const val O_NDELAY: CInt = 0x800
public const val O_DSYNC: CInt = 4096
public const val O_RSYNC: CInt = O_SYNC
public const val NI_MAXHOST: ULong = 1025uL
public const val NI_MAXSERV: ULong = 32uL
public const val NI_NOFQDN: CInt = 0x00000001
public const val NI_NUMERICHOST: CInt = 0x00000002
public const val NI_NAMEREQD: CInt = 0x00000004
public const val NI_NUMERICSERV: CInt = 0x00000008
public const val NI_DGRAM: CInt = 0x00000010
public const val NCCS: ULong = 19uL
public const val TCSBRKP: CInt = 0x5425
public const val TCSANOW: CInt = 0
public const val TCSADRAIN: CInt = 0x1
public const val TCSAFLUSH: CInt = 0x2
public const val VEOF: ULong = 4uL
public const val VEOL: ULong = 11uL
public const val VEOL2: ULong = 16uL
public const val VMIN: ULong = 6uL
public const val IEXTEN: TcflagT = 0x00008000
public const val TOSTOP: TcflagT = 0x00000100
public const val FLUSHO: TcflagT = 0x00001000
public const val EXTPROC: TcflagT = 65536
public const val MAP_HUGETLB: CInt = 0x040000
public const val PTRACE_TRACEME: CInt = 0
public const val PTRACE_PEEKTEXT: CInt = 1
public const val PTRACE_PEEKDATA: CInt = 2
public const val PTRACE_PEEKUSER: CInt = 3
public const val PTRACE_POKETEXT: CInt = 4
public const val PTRACE_POKEDATA: CInt = 5
public const val PTRACE_POKEUSER: CInt = 6
public const val PTRACE_CONT: CInt = 7
public const val PTRACE_KILL: CInt = 8
public const val PTRACE_SINGLESTEP: CInt = 9
public const val PTRACE_GETREGS: CInt = 12
public const val PTRACE_SETREGS: CInt = 13
public const val PTRACE_ATTACH: CInt = 16
public const val PTRACE_DETACH: CInt = 17
public const val PTRACE_SYSCALL: CInt = 24
public const val PTRACE_SETOPTIONS: CInt = 0x4200
public const val PTRACE_GETEVENTMSG: CInt = 0x4201
public const val PTRACE_GETSIGINFO: CInt = 0x4202
public const val PTRACE_SETSIGINFO: CInt = 0x4203
public const val PTRACE_GETREGSET: CInt = 0x4204
public const val PTRACE_SETREGSET: CInt = 0x4205
public const val PTRACE_SECCOMP_GET_METADATA: CInt = 0x420d
public const val PTRACE_EVENT_STOP: CInt = 128
public const val F_GETLK: CInt = 5
public const val F_GETOWN: CInt = 9
public const val F_SETOWN: CInt = 8
public const val F_SETLK: CInt = 6
public const val F_SETLKW: CInt = 7
public const val F_RDLCK: CInt = 0
public const val F_WRLCK: CInt = 1
public const val F_UNLCK: CInt = 2
public const val F_OFD_GETLK: CInt = 36
public const val F_OFD_SETLK: CInt = 37
public const val F_OFD_SETLKW: CInt = 38
public const val RLIMIT_CPU: CInt = 0
public const val RLIMIT_FSIZE: CInt = 1
public const val RLIMIT_DATA: CInt = 2
public const val RLIMIT_STACK: CInt = 3
public const val RLIMIT_CORE: CInt = 4
public const val RLIMIT_RSS: CInt = 5
public const val RLIMIT_NPROC: CInt = 6
public const val RLIMIT_NOFILE: CInt = 7
public const val RLIMIT_MEMLOCK: CInt = 8
public const val RLIMIT_AS: CInt = 9
public const val RLIMIT_LOCKS: CInt = 10
public const val RLIMIT_SIGPENDING: CInt = 11
public const val RLIMIT_MSGQUEUE: CInt = 12
public const val RLIMIT_NICE: CInt = 13
public const val RLIMIT_RTPRIO: CInt = 14
public const val RLIM_NLIMITS: CInt = 16
public val RLIM_INFINITY: RlimT = 0.inv()
public const val TCGETS: CInt = 0x5401
public const val TCSETS: CInt = 0x5402
public const val TCSETSW: CInt = 0x5403
public const val TCSETSF: CInt = 0x5404
public const val TCGETS2: CInt = 0x802c542a
public const val TCSETS2: CInt = 0x402c542b
public const val TCSETSW2: CInt = 0x402c542c
public const val TCSETSF2: CInt = 0x402c542d
public const val TCGETA: CInt = 0x5405
public const val TCSETA: CInt = 0x5406
public const val TCSETAW: CInt = 0x5407
public const val TCSETAF: CInt = 0x5408
public const val TCSBRK: CInt = 0x5409
public const val TCXONC: CInt = 0x540A
public const val TCFLSH: CInt = 0x540B
public const val TIOCGSOFTCAR: CInt = 0x5419
public const val TIOCSSOFTCAR: CInt = 0x541A
public const val TIOCINQ: CInt = 0x541B
public const val TIOCLINUX: CInt = 0x541C
public const val TIOCGSERIAL: CInt = 0x541E
public const val TIOCEXCL: CInt = 0x540C
public const val TIOCNXCL: CInt = 0x540D
public const val TIOCSCTTY: CInt = 0x540E
public const val TIOCGPGRP: CInt = 0x540F
public const val TIOCSPGRP: CInt = 0x5410
public const val TIOCOUTQ: CInt = 0x5411
public const val TIOCSTI: CInt = 0x5412
public const val TIOCGWINSZ: CInt = 0x5413
public const val TIOCSWINSZ: CInt = 0x5414
public const val TIOCMGET: CInt = 0x5415
public const val TIOCMBIS: CInt = 0x5416
public const val TIOCMBIC: CInt = 0x5417
public const val TIOCMSET: CInt = 0x5418
public const val FIONREAD: CInt = 0x541B
public const val TIOCCONS: CInt = 0x541D
public const val TIOCSBRK: CInt = 0x5427
public const val TIOCCBRK: CInt = 0x5428
public const val ST_RDONLY: CULong = 1uL
public const val ST_NOSUID: CULong = 2uL
public const val ST_NODEV: CULong = 4uL
public const val ST_NOEXEC: CULong = 8uL
public const val ST_SYNCHRONOUS: CULong = 16uL
public const val ST_MANDLOCK: CULong = 64uL
public const val ST_NOATIME: CULong = 1024uL
public const val ST_NODIRATIME: CULong = 2048uL
public const val ST_RELATIME: CULong = 4096uL
public const val RTLD_NOLOAD: CInt = 0x4
public const val RTLD_NODELETE: CInt = 0x1000
public const val AI_PASSIVE: CInt = 0x00000001
public const val AI_CANONNAME: CInt = 0x00000002
public const val AI_NUMERICHOST: CInt = 0x00000004
public const val AI_NUMERICSERV: CInt = 0x00000008
public const val AI_ALL: CInt = 0x00000100
public const val AI_V4MAPPED_CFG: CInt = 0x00000200
public const val AI_ADDRCONFIG: CInt = 0x00000400
public const val AI_V4MAPPED: CInt = 0x00000800
public val AI_DEFAULT: CInt = AI_V4MAPPED_CFG or AI_ADDRCONFIG
public const val KEXEC_ON_CRASH: CInt = 0x00000001
public const val KEXEC_PRESERVE_CONTEXT: CInt = 0x00000002
public const val KEXEC_ARCH_MASK: CInt = 0xffff0000
public const val KEXEC_FILE_UNLOAD: CInt = 0x00000001
public const val KEXEC_FILE_ON_CRASH: CInt = 0x00000002
public const val KEXEC_FILE_NO_INITRAMFS: CInt = 0x00000004
public const val LINUX_REBOOT_MAGIC1: CInt = 0xfee1dead
public const val LINUX_REBOOT_MAGIC2: CInt = 672274793
public const val LINUX_REBOOT_MAGIC2A: CInt = 85072278
public const val LINUX_REBOOT_MAGIC2B: CInt = 369367448
public const val LINUX_REBOOT_MAGIC2C: CInt = 537993216
public const val LINUX_REBOOT_CMD_RESTART: CInt = 0x01234567
public const val LINUX_REBOOT_CMD_HALT: CInt = 0xCDEF0123
public const val LINUX_REBOOT_CMD_CAD_ON: CInt = 0x89ABCDEF
public const val LINUX_REBOOT_CMD_CAD_OFF: CInt = 0x00000000
public const val LINUX_REBOOT_CMD_POWER_OFF: CInt = 0x4321FEDC
public const val LINUX_REBOOT_CMD_RESTART2: CInt = 0xA1B2C3D4
public const val LINUX_REBOOT_CMD_SW_SUSPEND: CInt = 0xD000FCE2
public const val LINUX_REBOOT_CMD_KEXEC: CInt = 0x45584543
public const val REG_BASIC: CInt = 0
public const val REG_EXTENDED: CInt = 1
public const val REG_ICASE: CInt = 2
public const val REG_NOSUB: CInt = 4
public const val REG_NEWLINE: CInt = 8
public const val REG_NOSPEC: CInt = 16
public const val REG_PEND: CInt = 32
public const val REG_DUMP: CInt = 128
public const val REG_NOMATCH: CInt = 1
public const val REG_BADPAT: CInt = 2
public const val REG_ECOLLATE: CInt = 3
public const val REG_ECTYPE: CInt = 4
public const val REG_EESCAPE: CInt = 5
public const val REG_ESUBREG: CInt = 6
public const val REG_EBRACK: CInt = 7
public const val REG_EPAREN: CInt = 8
public const val REG_EBRACE: CInt = 9
public const val REG_BADBR: CInt = 10
public const val REG_ERANGE: CInt = 11
public const val REG_ESPACE: CInt = 12
public const val REG_BADRPT: CInt = 13
public const val REG_EMPTY: CInt = 14
public const val REG_ASSERT: CInt = 15
public const val REG_INVARG: CInt = 16
public const val REG_ATOI: CInt = 255
public const val REG_ITOA: CInt = 256
public const val REG_NOTBOL: CInt = 1
public const val REG_NOTEOL: CInt = 2
public const val REG_STARTEND: CInt = 4
public const val REG_TRACE: CInt = 256
public const val REG_LARGE: CInt = 512
public const val REG_BACKR: CInt = 1024
public const val MCL_CURRENT: CInt = 0x0001
public const val MCL_FUTURE: CInt = 0x0002
public const val MCL_ONFAULT: CInt = 0x0004
public const val CBAUD: TcflagT = 4111
public const val TAB1: TcflagT = 0x00000800
public const val TAB2: TcflagT = 0x00001000
public const val TAB3: TcflagT = 0x00001800
public const val CR1: TcflagT = 0x00000200
public const val CR2: TcflagT = 0x00000400
public const val CR3: TcflagT = 0x00000600
public const val FF1: TcflagT = 0x00008000
public const val BS1: TcflagT = 0x00002000
public const val VT1: TcflagT = 0x00004000
public const val VWERASE: ULong = 14uL
public const val VREPRINT: ULong = 12uL
public const val VSUSP: ULong = 10uL
public const val VSTART: ULong = 8uL
public const val VSTOP: ULong = 9uL
public const val VDISCARD: ULong = 13uL
public const val VTIME: ULong = 5uL
public const val IUCLC: TcflagT = 0x00000200
public const val IXON: TcflagT = 0x00000400
public const val IXOFF: TcflagT = 0x00001000
public const val ONLCR: TcflagT = 0x4
public const val CSIZE: TcflagT = 0x00000030
public const val CS6: TcflagT = 0x00000010
public const val CS7: TcflagT = 0x00000020
public const val CS8: TcflagT = 0x00000030
public const val CSTOPB: TcflagT = 0x00000040
public const val CREAD: TcflagT = 0x00000080
public const val PARENB: TcflagT = 0x00000100
public const val PARODD: TcflagT = 0x00000200
public const val HUPCL: TcflagT = 0x00000400
public const val CLOCAL: TcflagT = 0x00000800
public const val ECHOKE: TcflagT = 0x00000800
public const val ECHOE: TcflagT = 0x00000010
public const val ECHOK: TcflagT = 0x00000020
public const val ECHONL: TcflagT = 0x00000040
public const val ECHOPRT: TcflagT = 0x00000400
public const val ECHOCTL: TcflagT = 0x00000200
public const val ISIG: TcflagT = 0x00000001
public const val ICANON: TcflagT = 0x00000002
public const val PENDIN: TcflagT = 0x00004000
public const val NOFLSH: TcflagT = 0x00000080
public const val VSWTC: ULong = 7uL
public const val OLCUC: TcflagT = 2
public const val NLDLY: TcflagT = 256
public const val CRDLY: TcflagT = 1536
public const val TABDLY: TcflagT = 6144
public const val BSDLY: TcflagT = 8192
public const val FFDLY: TcflagT = 32768
public const val VTDLY: TcflagT = 16384
public const val XCASE: TcflagT = 4
public const val XTABS: TcflagT = 6144
public const val B0: SpeedT = 0
public const val B50: SpeedT = 1
public const val B75: SpeedT = 2
public const val B110: SpeedT = 3
public const val B134: SpeedT = 4
public const val B150: SpeedT = 5
public const val B200: SpeedT = 6
public const val B300: SpeedT = 7
public const val B600: SpeedT = 8
public const val B1200: SpeedT = 9
public const val B1800: SpeedT = 10
public const val B2400: SpeedT = 11
public const val B4800: SpeedT = 12
public const val B9600: SpeedT = 13
public const val B19200: SpeedT = 14
public const val B38400: SpeedT = 15
public const val EXTA: SpeedT = B19200
public const val EXTB: SpeedT = B38400
public const val BOTHER: SpeedT = 4096
public const val B57600: SpeedT = 4097
public const val B115200: SpeedT = 4098
public const val B230400: SpeedT = 4099
public const val B460800: SpeedT = 4100
public const val B500000: SpeedT = 4101
public const val B576000: SpeedT = 4102
public const val B921600: SpeedT = 4103
public const val B1000000: SpeedT = 4104
public const val B1152000: SpeedT = 4105
public const val B1500000: SpeedT = 4106
public const val B2000000: SpeedT = 4107
public const val B2500000: SpeedT = 4108
public const val B3000000: SpeedT = 4109
public const val B3500000: SpeedT = 4110
public const val B4000000: SpeedT = 4111
public const val IBSHIFT: TcflagT = 16
public const val BLKIOMIN: CInt = 0x1278
public const val BLKIOOPT: CInt = 0x1279
public const val BLKSSZGET: CInt = 0x1268
public const val BLKPBSZGET: CInt = 0x127B
public const val EAI_AGAIN: CInt = 2
public const val EAI_BADFLAGS: CInt = 3
public const val EAI_FAIL: CInt = 4
public const val EAI_FAMILY: CInt = 5
public const val EAI_MEMORY: CInt = 6
public const val EAI_NODATA: CInt = 7
public const val EAI_NONAME: CInt = 8
public const val EAI_SERVICE: CInt = 9
public const val EAI_SOCKTYPE: CInt = 10
public const val EAI_SYSTEM: CInt = 11
public const val EAI_OVERFLOW: CInt = 14
public const val NETLINK_ROUTE: CInt = 0
public const val NETLINK_UNUSED: CInt = 1
public const val NETLINK_USERSOCK: CInt = 2
public const val NETLINK_FIREWALL: CInt = 3
public const val NETLINK_SOCK_DIAG: CInt = 4
public const val NETLINK_NFLOG: CInt = 5
public const val NETLINK_XFRM: CInt = 6
public const val NETLINK_SELINUX: CInt = 7
public const val NETLINK_ISCSI: CInt = 8
public const val NETLINK_AUDIT: CInt = 9
public const val NETLINK_FIB_LOOKUP: CInt = 10
public const val NETLINK_CONNECTOR: CInt = 11
public const val NETLINK_NETFILTER: CInt = 12
public const val NETLINK_IP6_FW: CInt = 13
public const val NETLINK_DNRTMSG: CInt = 14
public const val NETLINK_KOBJECT_UEVENT: CInt = 15
public const val NETLINK_GENERIC: CInt = 16
public const val NETLINK_SCSITRANSPORT: CInt = 18
public const val NETLINK_ECRYPTFS: CInt = 19
public const val NETLINK_RDMA: CInt = 20
public const val NETLINK_CRYPTO: CInt = 21
public const val NETLINK_INET_DIAG: CInt = NETLINK_SOCK_DIAG
public const val MAX_LINKS: CInt = 32
public const val NLM_F_REQUEST: CInt = 1
public const val NLM_F_MULTI: CInt = 2
public const val NLM_F_ACK: CInt = 4
public const val NLM_F_ECHO: CInt = 8
public const val NLM_F_DUMP_INTR: CInt = 16
public const val NLM_F_DUMP_FILTERED: CInt = 32
public const val NLM_F_ROOT: CInt = 0x100
public const val NLM_F_MATCH: CInt = 0x200
public const val NLM_F_ATOMIC: CInt = 0x400
public val NLM_F_DUMP: CInt = NLM_F_ROOT or NLM_F_MATCH
public const val NLM_F_REPLACE: CInt = 0x100
public const val NLM_F_EXCL: CInt = 0x200
public const val NLM_F_CREATE: CInt = 0x400
public const val NLM_F_APPEND: CInt = 0x800
public const val NLM_F_NONREC: CInt = 0x100
public const val NLM_F_BULK: CInt = 0x200
public const val NLM_F_CAPPED: CInt = 0x100
public const val NLM_F_ACK_TLVS: CInt = 0x200
public const val NLMSG_NOOP: CInt = 0x1
public const val NLMSG_ERROR: CInt = 0x2
public const val NLMSG_DONE: CInt = 0x3
public const val NLMSG_OVERRUN: CInt = 0x4
public const val NLMSG_MIN_TYPE: CInt = 0x10
public const val NFNLGRP_NONE: CInt = 0
public const val NFNLGRP_CONNTRACK_NEW: CInt = 1
public const val NFNLGRP_CONNTRACK_UPDATE: CInt = 2
public const val NFNLGRP_CONNTRACK_DESTROY: CInt = 3
public const val NFNLGRP_CONNTRACK_EXP_NEW: CInt = 4
public const val NFNLGRP_CONNTRACK_EXP_UPDATE: CInt = 5
public const val NFNLGRP_CONNTRACK_EXP_DESTROY: CInt = 6
public const val NFNLGRP_NFTABLES: CInt = 7
public const val NFNLGRP_ACCT_QUOTA: CInt = 8
public const val NFNETLINK_V0: CInt = 0
public const val NFNL_SUBSYS_NONE: CInt = 0
public const val NFNL_SUBSYS_CTNETLINK: CInt = 1
public const val NFNL_SUBSYS_CTNETLINK_EXP: CInt = 2
public const val NFNL_SUBSYS_QUEUE: CInt = 3
public const val NFNL_SUBSYS_ULOG: CInt = 4
public const val NFNL_SUBSYS_OSF: CInt = 5
public const val NFNL_SUBSYS_IPSET: CInt = 6
public const val NFNL_SUBSYS_ACCT: CInt = 7
public const val NFNL_SUBSYS_CTNETLINK_TIMEOUT: CInt = 8
public const val NFNL_SUBSYS_CTHELPER: CInt = 9
public const val NFNL_SUBSYS_NFTABLES: CInt = 10
public const val NFNL_SUBSYS_NFT_COMPAT: CInt = 11
public const val NFNL_SUBSYS_COUNT: CInt = 12
public const val NFNL_MSG_BATCH_BEGIN: CInt = NLMSG_MIN_TYPE
public const val NFNL_MSG_BATCH_END: CInt = NLMSG_MIN_TYPE + 1
public const val NFULNL_MSG_PACKET: CInt = 0
public const val NFULNL_MSG_CONFIG: CInt = 1
public const val NFULA_UNSPEC: CInt = 0
public const val NFULA_PACKET_HDR: CInt = 1
public const val NFULA_MARK: CInt = 2
public const val NFULA_TIMESTAMP: CInt = 3
public const val NFULA_IFINDEX_INDEV: CInt = 4
public const val NFULA_IFINDEX_OUTDEV: CInt = 5
public const val NFULA_IFINDEX_PHYSINDEV: CInt = 6
public const val NFULA_IFINDEX_PHYSOUTDEV: CInt = 7
public const val NFULA_HWADDR: CInt = 8
public const val NFULA_PAYLOAD: CInt = 9
public const val NFULA_PREFIX: CInt = 10
public const val NFULA_UID: CInt = 11
public const val NFULA_SEQ: CInt = 12
public const val NFULA_SEQ_GLOBAL: CInt = 13
public const val NFULA_GID: CInt = 14
public const val NFULA_HWTYPE: CInt = 15
public const val NFULA_HWHEADER: CInt = 16
public const val NFULA_HWLEN: CInt = 17
public const val NFULA_CT: CInt = 18
public const val NFULA_CT_INFO: CInt = 19
public const val NFULNL_CFG_CMD_NONE: CInt = 0
public const val NFULNL_CFG_CMD_BIND: CInt = 1
public const val NFULNL_CFG_CMD_UNBIND: CInt = 2
public const val NFULNL_CFG_CMD_PF_BIND: CInt = 3
public const val NFULNL_CFG_CMD_PF_UNBIND: CInt = 4
public const val NFULA_CFG_UNSPEC: CInt = 0
public const val NFULA_CFG_CMD: CInt = 1
public const val NFULA_CFG_MODE: CInt = 2
public const val NFULA_CFG_NLBUFSIZ: CInt = 3
public const val NFULA_CFG_TIMEOUT: CInt = 4
public const val NFULA_CFG_QTHRESH: CInt = 5
public const val NFULA_CFG_FLAGS: CInt = 6
public const val NFULNL_COPY_NONE: CInt = 0x00
public const val NFULNL_COPY_META: CInt = 0x01
public const val NFULNL_COPY_PACKET: CInt = 0x02
public const val NFULNL_CFG_F_SEQ: CInt = 0x0001
public const val NFULNL_CFG_F_SEQ_GLOBAL: CInt = 0x0002
public const val NFULNL_CFG_F_CONNTRACK: CInt = 0x0004
public const val NFQNL_MSG_PACKET: CInt = 0
public const val NFQNL_MSG_VERDICT: CInt = 1
public const val NFQNL_MSG_CONFIG: CInt = 2
public const val NFQNL_MSG_VERDICT_BATCH: CInt = 3
public const val NFQA_UNSPEC: CInt = 0
public const val NFQA_PACKET_HDR: CInt = 1
public const val NFQA_VERDICT_HDR: CInt = 2
public const val NFQA_MARK: CInt = 3
public const val NFQA_TIMESTAMP: CInt = 4
public const val NFQA_IFINDEX_INDEV: CInt = 5
public const val NFQA_IFINDEX_OUTDEV: CInt = 6
public const val NFQA_IFINDEX_PHYSINDEV: CInt = 7
public const val NFQA_IFINDEX_PHYSOUTDEV: CInt = 8
public const val NFQA_HWADDR: CInt = 9
public const val NFQA_PAYLOAD: CInt = 10
public const val NFQA_CT: CInt = 11
public const val NFQA_CT_INFO: CInt = 12
public const val NFQA_CAP_LEN: CInt = 13
public const val NFQA_SKB_INFO: CInt = 14
public const val NFQA_EXP: CInt = 15
public const val NFQA_UID: CInt = 16
public const val NFQA_GID: CInt = 17
public const val NFQA_SECCTX: CInt = 18
public const val NFQA_VLAN: CInt = 19
public const val NFQA_L2HDR: CInt = 20
public const val NFQA_VLAN_UNSPEC: CInt = 0
public const val NFQA_VLAN_PROTO: CInt = 1
public const val NFQA_VLAN_TCI: CInt = 2
public const val NFQNL_CFG_CMD_NONE: CInt = 0
public const val NFQNL_CFG_CMD_BIND: CInt = 1
public const val NFQNL_CFG_CMD_UNBIND: CInt = 2
public const val NFQNL_CFG_CMD_PF_BIND: CInt = 3
public const val NFQNL_CFG_CMD_PF_UNBIND: CInt = 4
public const val NFQNL_COPY_NONE: CInt = 0
public const val NFQNL_COPY_META: CInt = 1
public const val NFQNL_COPY_PACKET: CInt = 2
public const val NFQA_CFG_UNSPEC: CInt = 0
public const val NFQA_CFG_CMD: CInt = 1
public const val NFQA_CFG_PARAMS: CInt = 2
public const val NFQA_CFG_QUEUE_MAXLEN: CInt = 3
public const val NFQA_CFG_MASK: CInt = 4
public const val NFQA_CFG_FLAGS: CInt = 5
public const val NFQA_CFG_F_FAIL_OPEN: CInt = 0x0001
public const val NFQA_CFG_F_CONNTRACK: CInt = 0x0002
public const val NFQA_CFG_F_GSO: CInt = 0x0004
public const val NFQA_CFG_F_UID_GID: CInt = 0x0008
public const val NFQA_CFG_F_SECCTX: CInt = 0x0010
public const val NFQA_CFG_F_MAX: CInt = 0x0020
public const val NFQA_SKB_CSUMNOTREADY: CInt = 0x0001
public const val NFQA_SKB_GSO: CInt = 0x0002
public const val NFQA_SKB_CSUM_NOTVERIFIED: CInt = 0x0004
public const val GENL_NAMSIZ: CInt = 16
public const val GENL_MIN_ID: CInt = NLMSG_MIN_TYPE
public const val GENL_MAX_ID: CInt = 1023
public const val GENL_ADMIN_PERM: CInt = 0x01
public const val GENL_CMD_CAP_DO: CInt = 0x02
public const val GENL_CMD_CAP_DUMP: CInt = 0x04
public const val GENL_CMD_CAP_HASPOL: CInt = 0x08
public const val GENL_UNS_ADMIN_PERM: CInt = 0x10
public const val GENL_ID_CTRL: CInt = NLMSG_MIN_TYPE
public const val GENL_ID_VFS_DQUOT: CInt = NLMSG_MIN_TYPE + 1
public const val GENL_ID_PMCRAID: CInt = NLMSG_MIN_TYPE + 2
public const val CTRL_CMD_UNSPEC: CInt = 0
public const val CTRL_CMD_NEWFAMILY: CInt = 1
public const val CTRL_CMD_DELFAMILY: CInt = 2
public const val CTRL_CMD_GETFAMILY: CInt = 3
public const val CTRL_CMD_NEWOPS: CInt = 4
public const val CTRL_CMD_DELOPS: CInt = 5
public const val CTRL_CMD_GETOPS: CInt = 6
public const val CTRL_CMD_NEWMCAST_GRP: CInt = 7
public const val CTRL_CMD_DELMCAST_GRP: CInt = 8
public const val CTRL_CMD_GETMCAST_GRP: CInt = 9
public const val CTRL_ATTR_UNSPEC: CInt = 0
public const val CTRL_ATTR_FAMILY_ID: CInt = 1
public const val CTRL_ATTR_FAMILY_NAME: CInt = 2
public const val CTRL_ATTR_VERSION: CInt = 3
public const val CTRL_ATTR_HDRSIZE: CInt = 4
public const val CTRL_ATTR_MAXATTR: CInt = 5
public const val CTRL_ATTR_OPS: CInt = 6
public const val CTRL_ATTR_MCAST_GROUPS: CInt = 7
public const val CTRL_ATTR_OP_UNSPEC: CInt = 0
public const val CTRL_ATTR_OP_ID: CInt = 1
public const val CTRL_ATTR_OP_FLAGS: CInt = 2
public const val CTRL_ATTR_MCAST_GRP_UNSPEC: CInt = 0
public const val CTRL_ATTR_MCAST_GRP_NAME: CInt = 1
public const val CTRL_ATTR_MCAST_GRP_ID: CInt = 2
public const val NETLINK_ADD_MEMBERSHIP: CInt = 1
public const val NETLINK_DROP_MEMBERSHIP: CInt = 2
public const val NETLINK_PKTINFO: CInt = 3
public const val NETLINK_BROADCAST_ERROR: CInt = 4
public const val NETLINK_NO_ENOBUFS: CInt = 5
public const val NETLINK_RX_RING: CInt = 6
public const val NETLINK_TX_RING: CInt = 7
public const val NETLINK_LISTEN_ALL_NSID: CInt = 8
public const val NETLINK_LIST_MEMBERSHIPS: CInt = 9
public const val NETLINK_CAP_ACK: CInt = 10
public const val NETLINK_EXT_ACK: CInt = 11
public const val NETLINK_GET_STRICT_CHK: CInt = 12
public const val GRND_NONBLOCK: CUInt = 0x0001u
public const val GRND_RANDOM: CUInt = 0x0002u
public const val GRND_INSECURE: CUInt = 0x0004u
public const val SECCOMP_MODE_DISABLED: CUInt = 0u
public const val SECCOMP_MODE_STRICT: CUInt = 1u
public const val SECCOMP_MODE_FILTER: CUInt = 2u
public const val SECCOMP_SET_MODE_STRICT: CUInt = 0u
public const val SECCOMP_SET_MODE_FILTER: CUInt = 1u
public const val SECCOMP_GET_ACTION_AVAIL: CUInt = 2u
public const val SECCOMP_GET_NOTIF_SIZES: CUInt = 3u
public val SECCOMP_FILTER_FLAG_TSYNC: CULong = 1 shl 0
public val SECCOMP_FILTER_FLAG_LOG: CULong = 1 shl 1
public val SECCOMP_FILTER_FLAG_SPEC_ALLOW: CULong = 1 shl 2
public val SECCOMP_FILTER_FLAG_NEW_LISTENER: CULong = 1 shl 3
public val SECCOMP_FILTER_FLAG_TSYNC_ESRCH: CULong = 1 shl 4
public val SECCOMP_FILTER_FLAG_WAIT_KILLABLE_RECV: CULong = 1 shl 5
public const val SECCOMP_RET_KILL_PROCESS: CUInt = 0x80000000u
public const val SECCOMP_RET_KILL_THREAD: CUInt = 0x00000000u
public const val SECCOMP_RET_KILL: CUInt = SECCOMP_RET_KILL_THREAD
public const val SECCOMP_RET_TRAP: CUInt = 0x00030000u
public const val SECCOMP_RET_ERRNO: CUInt = 0x00050000u
public const val SECCOMP_RET_USER_NOTIF: CUInt = 0x7fc00000u
public const val SECCOMP_RET_TRACE: CUInt = 0x7ff00000u
public const val SECCOMP_RET_LOG: CUInt = 0x7ffc0000u
public const val SECCOMP_RET_ALLOW: CUInt = 0x7fff0000u
public const val SECCOMP_RET_ACTION_FULL: CUInt = 0xffff0000u
public const val SECCOMP_RET_ACTION: CUInt = 0x7fff0000u
public const val SECCOMP_RET_DATA: CUInt = 0x0000ffffu
public const val SECCOMP_USER_NOTIF_FLAG_CONTINUE: CULong = 1uL
public const val SECCOMP_ADDFD_FLAG_SETFD: CULong = 1uL
public const val SECCOMP_ADDFD_FLAG_SEND: CULong = 2uL
public val NLA_F_NESTED: CInt = 1 shl 15
public val NLA_F_NET_BYTEORDER: CInt = 1 shl 14
public val NLA_TYPE_MASK: CInt = (NLA_F_NESTED | NLA_F_NET_BYTEORDER).inv()
public const val NLA_ALIGNTO: CInt = 4
public const val SIGEV_THREAD_ID: CInt = 4
public const val CIBAUD: TcflagT = 269418496
public const val CBAUDEX: TcflagT = 4096
public const val TIOCM_LE: CInt = 0x001
public const val TIOCM_DTR: CInt = 0x002
public const val TIOCM_RTS: CInt = 0x004
public const val TIOCM_ST: CInt = 0x008
public const val TIOCM_SR: CInt = 0x010
public const val TIOCM_CTS: CInt = 0x020
public const val TIOCM_CAR: CInt = 0x040
public const val TIOCM_RNG: CInt = 0x080
public const val TIOCM_DSR: CInt = 0x100
public const val TIOCM_CD: CInt = TIOCM_CAR
public const val TIOCM_RI: CInt = TIOCM_RNG
public const val POLLWRNORM: CShort = 0x100
public const val POLLWRBAND: CShort = 0x200
public const val SFD_CLOEXEC: CInt = O_CLOEXEC
public const val SFD_NONBLOCK: CInt = O_NONBLOCK
public const val SOCK_NONBLOCK: CInt = O_NONBLOCK
public const val SO_ORIGINAL_DST: CInt = 80
public const val IP_RECVFRAGSIZE: CInt = 25
public const val IPV6_FLOWINFO: CInt = 11
public const val IPV6_MULTICAST_ALL: CInt = 29
public const val IPV6_ROUTER_ALERT_ISOLATE: CInt = 30
public const val IPV6_FLOWLABEL_MGR: CInt = 32
public const val IPV6_FLOWINFO_SEND: CInt = 33
public const val IPV6_RECVFRAGSIZE: CInt = 77
public const val IPV6_FREEBIND: CInt = 78
public const val IPV6_FLOWINFO_FLOWLABEL: CInt = 0x000fffff
public const val IPV6_FLOWINFO_PRIORITY: CInt = 0x0ff00000
public const val IUTF8: TcflagT = 0x00004000
public const val CMSPAR: TcflagT = 1073741824
public val O_TMPFILE: CInt = 0o20000000 or O_DIRECTORY
public const val MFD_CLOEXEC: CUInt = 0x0001u
public const val MFD_ALLOW_SEALING: CUInt = 0x0002u
public const val MFD_HUGETLB: CUInt = 0x0004u
public const val MFD_NOEXEC_SEAL: CUInt = 0x0008u
public const val MFD_EXEC: CUInt = 0x0010u
public const val MFD_HUGE_64KB: CUInt = 0x40000000u
public const val MFD_HUGE_512KB: CUInt = 0x4c000000u
public const val MFD_HUGE_1MB: CUInt = 0x50000000u
public const val MFD_HUGE_2MB: CUInt = 0x54000000u
public const val MFD_HUGE_8MB: CUInt = 0x5c000000u
public const val MFD_HUGE_16MB: CUInt = 0x60000000u
public const val MFD_HUGE_32MB: CUInt = 0x64000000u
public const val MFD_HUGE_256MB: CUInt = 0x70000000u
public const val MFD_HUGE_512MB: CUInt = 0x74000000u
public const val MFD_HUGE_1GB: CUInt = 0x78000000u
public const val MFD_HUGE_2GB: CUInt = 0x7c000000u
public const val MFD_HUGE_16GB: CUInt = 0x88000000u
public const val MFD_HUGE_MASK: CUInt = 63u
public const val MFD_HUGE_SHIFT: CUInt = 26u
public const val PT_NULL: UInt = 0u
public const val PT_LOAD: UInt = 1u
public const val PT_DYNAMIC: UInt = 2u
public const val PT_INTERP: UInt = 3u
public const val PT_NOTE: UInt = 4u
public const val PT_SHLIB: UInt = 5u
public const val PT_PHDR: UInt = 6u
public const val PT_TLS: UInt = 7u
public const val PT_LOOS: UInt = 0x60000000u
public const val PT_GNU_EH_FRAME: UInt = 0x6474e550u
public const val PT_GNU_STACK: UInt = 0x6474e551u
public const val PT_GNU_RELRO: UInt = 0x6474e552u
public const val PT_HIOS: UInt = 0x6fffffffu
public const val PT_LOPROC: UInt = 0x70000000u
public const val PT_HIPROC: UInt = 0x7fffffffu
public const val OPEN_TREE_CLONE: CUInt = 0x01u
public val OPEN_TREE_CLOEXEC: CUInt = O_CLOEXEC.toUInt()
public const val NF_DROP: CInt = 0
public const val NF_ACCEPT: CInt = 1
public const val NF_STOLEN: CInt = 2
public const val NF_QUEUE: CInt = 3
public const val NF_REPEAT: CInt = 4
public const val NF_STOP: CInt = 5
public const val NF_MAX_VERDICT: CInt = NF_STOP
public const val NF_VERDICT_MASK: CInt = 0x000000ff
public const val NF_VERDICT_FLAG_QUEUE_BYPASS: CInt = 0x00008000
public const val NF_VERDICT_QMASK: CInt = 0xffff0000
public const val NF_VERDICT_QBITS: CInt = 16
public const val NF_VERDICT_BITS: CInt = 16
public const val NF_INET_PRE_ROUTING: CInt = 0
public const val NF_INET_LOCAL_IN: CInt = 1
public const val NF_INET_FORWARD: CInt = 2
public const val NF_INET_LOCAL_OUT: CInt = 3
public const val NF_INET_POST_ROUTING: CInt = 4
public const val NF_INET_NUMHOOKS: CInt = 5
public const val NF_INET_INGRESS: CInt = NF_INET_NUMHOOKS
public const val NF_NETDEV_INGRESS: CInt = 0
public const val NF_NETDEV_EGRESS: CInt = 1
public const val NF_NETDEV_NUMHOOKS: CInt = 2
public const val NFPROTO_UNSPEC: CInt = 0
public const val NFPROTO_INET: CInt = 1
public const val NFPROTO_IPV4: CInt = 2
public const val NFPROTO_ARP: CInt = 3
public const val NFPROTO_NETDEV: CInt = 5
public const val NFPROTO_BRIDGE: CInt = 7
public const val NFPROTO_IPV6: CInt = 10
public const val NFPROTO_DECNET: CInt = 12
public const val NFPROTO_NUMPROTO: CInt = 13
public const val NF_ARP: CInt = 0
public const val NF_ARP_IN: CInt = 0
public const val NF_ARP_OUT: CInt = 1
public const val NF_ARP_FORWARD: CInt = 2
public const val NF_ARP_NUMHOOKS: CInt = 3
public const val NF_BR_PRE_ROUTING: CInt = 0
public const val NF_BR_LOCAL_IN: CInt = 1
public const val NF_BR_FORWARD: CInt = 2
public const val NF_BR_LOCAL_OUT: CInt = 3
public const val NF_BR_POST_ROUTING: CInt = 4
public const val NF_BR_BROUTING: CInt = 5
public const val NF_BR_NUMHOOKS: CInt = 6
public const val NF_BR_PRI_FIRST: CInt = INT_MIN
public const val NF_BR_PRI_NAT_DST_BRIDGED: CInt = -300
public const val NF_BR_PRI_FILTER_BRIDGED: CInt = -200
public const val NF_BR_PRI_BRNF: CInt = 0
public const val NF_BR_PRI_NAT_DST_OTHER: CInt = 100
public const val NF_BR_PRI_FILTER_OTHER: CInt = 200
public const val NF_BR_PRI_NAT_SRC: CInt = 300
public const val NF_BR_PRI_LAST: CInt = INT_MAX
public const val NF_IP_PRE_ROUTING: CInt = 0
public const val NF_IP_LOCAL_IN: CInt = 1
public const val NF_IP_FORWARD: CInt = 2
public const val NF_IP_LOCAL_OUT: CInt = 3
public const val NF_IP_POST_ROUTING: CInt = 4
public const val NF_IP_NUMHOOKS: CInt = 5
public const val NF_IP_PRI_FIRST: CInt = INT_MIN
public const val NF_IP_PRI_RAW_BEFORE_DEFRAG: CInt = -450
public const val NF_IP_PRI_CONNTRACK_DEFRAG: CInt = -400
public const val NF_IP_PRI_RAW: CInt = -300
public const val NF_IP_PRI_SELINUX_FIRST: CInt = -225
public const val NF_IP_PRI_CONNTRACK: CInt = -200
public const val NF_IP_PRI_MANGLE: CInt = -150
public const val NF_IP_PRI_NAT_DST: CInt = -100
public const val NF_IP_PRI_FILTER: CInt = 0
public const val NF_IP_PRI_SECURITY: CInt = 50
public const val NF_IP_PRI_NAT_SRC: CInt = 100
public const val NF_IP_PRI_SELINUX_LAST: CInt = 225
public const val NF_IP_PRI_CONNTRACK_HELPER: CInt = 300
public const val NF_IP_PRI_CONNTRACK_CONFIRM: CInt = INT_MAX
public const val NF_IP_PRI_LAST: CInt = INT_MAX
public const val NF_IP6_PRE_ROUTING: CInt = 0
public const val NF_IP6_LOCAL_IN: CInt = 1
public const val NF_IP6_FORWARD: CInt = 2
public const val NF_IP6_LOCAL_OUT: CInt = 3
public const val NF_IP6_POST_ROUTING: CInt = 4
public const val NF_IP6_NUMHOOKS: CInt = 5
public const val NF_IP6_PRI_FIRST: CInt = INT_MIN
public const val NF_IP6_PRI_RAW_BEFORE_DEFRAG: CInt = -450
public const val NF_IP6_PRI_CONNTRACK_DEFRAG: CInt = -400
public const val NF_IP6_PRI_RAW: CInt = -300
public const val NF_IP6_PRI_SELINUX_FIRST: CInt = -225
public const val NF_IP6_PRI_CONNTRACK: CInt = -200
public const val NF_IP6_PRI_MANGLE: CInt = -150
public const val NF_IP6_PRI_NAT_DST: CInt = -100
public const val NF_IP6_PRI_FILTER: CInt = 0
public const val NF_IP6_PRI_SECURITY: CInt = 50
public const val NF_IP6_PRI_NAT_SRC: CInt = 100
public const val NF_IP6_PRI_SELINUX_LAST: CInt = 225
public const val NF_IP6_PRI_CONNTRACK_HELPER: CInt = 300
public const val NF_IP6_PRI_LAST: CInt = INT_MAX
public const val IP6T_SO_ORIGINAL_DST: CInt = 80
public const val NFT_TABLE_MAXNAMELEN: CInt = 256
public const val NFT_CHAIN_MAXNAMELEN: CInt = 256
public const val NFT_SET_MAXNAMELEN: CInt = 256
public const val NFT_OBJ_MAXNAMELEN: CInt = 256
public const val NFT_USERDATA_MAXLEN: CInt = 256
public const val NFT_REG_VERDICT: CInt = 0
public const val NFT_REG_1: CInt = 1
public const val NFT_REG_2: CInt = 2
public const val NFT_REG_3: CInt = 3
public const val NFT_REG_4: CInt = 4
public const val __NFT_REG_MAX: CInt = 5
public const val NFT_REG32_00: CInt = 8
public const val NFT_REG32_01: CInt = 9
public const val NFT_REG32_02: CInt = 10
public const val NFT_REG32_03: CInt = 11
public const val NFT_REG32_04: CInt = 12
public const val NFT_REG32_05: CInt = 13
public const val NFT_REG32_06: CInt = 14
public const val NFT_REG32_07: CInt = 15
public const val NFT_REG32_08: CInt = 16
public const val NFT_REG32_09: CInt = 17
public const val NFT_REG32_10: CInt = 18
public const val NFT_REG32_11: CInt = 19
public const val NFT_REG32_12: CInt = 20
public const val NFT_REG32_13: CInt = 21
public const val NFT_REG32_14: CInt = 22
public const val NFT_REG32_15: CInt = 23
public const val NFT_REG_SIZE: CInt = 16
public const val NFT_REG32_SIZE: CInt = 4
public const val NFT_CONTINUE: CInt = -1
public const val NFT_BREAK: CInt = -2
public const val NFT_JUMP: CInt = -3
public const val NFT_GOTO: CInt = -4
public const val NFT_RETURN: CInt = -5
public const val NFT_MSG_NEWTABLE: CInt = 0
public const val NFT_MSG_GETTABLE: CInt = 1
public const val NFT_MSG_DELTABLE: CInt = 2
public const val NFT_MSG_NEWCHAIN: CInt = 3
public const val NFT_MSG_GETCHAIN: CInt = 4
public const val NFT_MSG_DELCHAIN: CInt = 5
public const val NFT_MSG_NEWRULE: CInt = 6
public const val NFT_MSG_GETRULE: CInt = 7
public const val NFT_MSG_DELRULE: CInt = 8
public const val NFT_MSG_NEWSET: CInt = 9
public const val NFT_MSG_GETSET: CInt = 10
public const val NFT_MSG_DELSET: CInt = 11
public const val NFT_MSG_NEWSETELEM: CInt = 12
public const val NFT_MSG_GETSETELEM: CInt = 13
public const val NFT_MSG_DELSETELEM: CInt = 14
public const val NFT_MSG_NEWGEN: CInt = 15
public const val NFT_MSG_GETGEN: CInt = 16
public const val NFT_MSG_TRACE: CInt = 17
public const val NFT_MSG_NEWOBJ: CInt = 18
public const val NFT_MSG_GETOBJ: CInt = 19
public const val NFT_MSG_DELOBJ: CInt = 20
public const val NFT_MSG_GETOBJ_RESET: CInt = 21
public const val NFT_MSG_MAX: CInt = 25
public const val NFT_SET_ANONYMOUS: CInt = 0x1
public const val NFT_SET_CONSTANT: CInt = 0x2
public const val NFT_SET_INTERVAL: CInt = 0x4
public const val NFT_SET_MAP: CInt = 0x8
public const val NFT_SET_TIMEOUT: CInt = 0x10
public const val NFT_SET_EVAL: CInt = 0x20
public const val NFT_SET_POL_PERFORMANCE: CInt = 0
public const val NFT_SET_POL_MEMORY: CInt = 1
public const val NFT_SET_ELEM_INTERVAL_END: CInt = 0x1
public const val NFT_DATA_VALUE: CUInt = 0u
public const val NFT_DATA_VERDICT: CUInt = 0xffffff00u
public const val NFT_DATA_RESERVED_MASK: CUInt = 0xffffff00u
public const val NFT_DATA_VALUE_MAXLEN: CInt = 64
public const val NFT_BYTEORDER_NTOH: CInt = 0
public const val NFT_BYTEORDER_HTON: CInt = 1
public const val NFT_CMP_EQ: CInt = 0
public const val NFT_CMP_NEQ: CInt = 1
public const val NFT_CMP_LT: CInt = 2
public const val NFT_CMP_LTE: CInt = 3
public const val NFT_CMP_GT: CInt = 4
public const val NFT_CMP_GTE: CInt = 5
public const val NFT_RANGE_EQ: CInt = 0
public const val NFT_RANGE_NEQ: CInt = 1
public val NFT_LOOKUP_F_INV: CInt = 1 shl 0
public const val NFT_DYNSET_OP_ADD: CInt = 0
public const val NFT_DYNSET_OP_UPDATE: CInt = 1
public val NFT_DYNSET_F_INV: CInt = 1 shl 0
public const val NFT_PAYLOAD_LL_HEADER: CInt = 0
public const val NFT_PAYLOAD_NETWORK_HEADER: CInt = 1
public const val NFT_PAYLOAD_TRANSPORT_HEADER: CInt = 2
public const val NFT_PAYLOAD_CSUM_NONE: CInt = 0
public const val NFT_PAYLOAD_CSUM_INET: CInt = 1
public const val NFT_META_LEN: CInt = 0
public const val NFT_META_PROTOCOL: CInt = 1
public const val NFT_META_PRIORITY: CInt = 2
public const val NFT_META_MARK: CInt = 3
public const val NFT_META_IIF: CInt = 4
public const val NFT_META_OIF: CInt = 5
public const val NFT_META_IIFNAME: CInt = 6
public const val NFT_META_OIFNAME: CInt = 7
public const val NFT_META_IIFTYPE: CInt = 8
public const val NFT_META_OIFTYPE: CInt = 9
public const val NFT_META_SKUID: CInt = 10
public const val NFT_META_SKGID: CInt = 11
public const val NFT_META_NFTRACE: CInt = 12
public const val NFT_META_RTCLASSID: CInt = 13
public const val NFT_META_SECMARK: CInt = 14
public const val NFT_META_NFPROTO: CInt = 15
public const val NFT_META_L4PROTO: CInt = 16
public const val NFT_META_BRI_IIFNAME: CInt = 17
public const val NFT_META_BRI_OIFNAME: CInt = 18
public const val NFT_META_PKTTYPE: CInt = 19
public const val NFT_META_CPU: CInt = 20
public const val NFT_META_IIFGROUP: CInt = 21
public const val NFT_META_OIFGROUP: CInt = 22
public const val NFT_META_CGROUP: CInt = 23
public const val NFT_META_PRANDOM: CInt = 24
public const val NFT_CT_STATE: CInt = 0
public const val NFT_CT_DIRECTION: CInt = 1
public const val NFT_CT_STATUS: CInt = 2
public const val NFT_CT_MARK: CInt = 3
public const val NFT_CT_SECMARK: CInt = 4
public const val NFT_CT_EXPIRATION: CInt = 5
public const val NFT_CT_HELPER: CInt = 6
public const val NFT_CT_L3PROTOCOL: CInt = 7
public const val NFT_CT_SRC: CInt = 8
public const val NFT_CT_DST: CInt = 9
public const val NFT_CT_PROTOCOL: CInt = 10
public const val NFT_CT_PROTO_SRC: CInt = 11
public const val NFT_CT_PROTO_DST: CInt = 12
public const val NFT_CT_LABELS: CInt = 13
public const val NFT_CT_PKTS: CInt = 14
public const val NFT_CT_BYTES: CInt = 15
public const val NFT_CT_AVGPKT: CInt = 16
public const val NFT_CT_ZONE: CInt = 17
public const val NFT_CT_EVENTMASK: CInt = 18
public const val NFT_CT_SRC_IP: CInt = 19
public const val NFT_CT_DST_IP: CInt = 20
public const val NFT_CT_SRC_IP6: CInt = 21
public const val NFT_CT_DST_IP6: CInt = 22
public const val NFT_CT_ID: CInt = 23
public const val NFT_LIMIT_PKTS: CInt = 0
public const val NFT_LIMIT_PKT_BYTES: CInt = 1
public val NFT_LIMIT_F_INV: CInt = 1 shl 0
public const val NFT_QUEUE_FLAG_BYPASS: CInt = 0x01
public const val NFT_QUEUE_FLAG_CPU_FANOUT: CInt = 0x02
public const val NFT_QUEUE_FLAG_MASK: CInt = 0x03
public val NFT_QUOTA_F_INV: CInt = 1 shl 0
public const val NFT_REJECT_ICMP_UNREACH: CInt = 0
public const val NFT_REJECT_TCP_RST: CInt = 1
public const val NFT_REJECT_ICMPX_UNREACH: CInt = 2
public const val NFT_REJECT_ICMPX_NO_ROUTE: CInt = 0
public const val NFT_REJECT_ICMPX_PORT_UNREACH: CInt = 1
public const val NFT_REJECT_ICMPX_HOST_UNREACH: CInt = 2
public const val NFT_REJECT_ICMPX_ADMIN_PROHIBITED: CInt = 3
public const val NFT_NAT_SNAT: CInt = 0
public const val NFT_NAT_DNAT: CInt = 1
public const val NFT_TRACETYPE_UNSPEC: CInt = 0
public const val NFT_TRACETYPE_POLICY: CInt = 1
public const val NFT_TRACETYPE_RETURN: CInt = 2
public const val NFT_TRACETYPE_RULE: CInt = 3
public const val NFT_NG_INCREMENTAL: CInt = 0
public const val NFT_NG_RANDOM: CInt = 1
public const val FF_MAX: U16 = 0x7f
public val FF_CNT: ULong = FF_MAX.toULong() + 1
public const val INPUT_PROP_MAX: U16 = 0x1f
public val INPUT_PROP_CNT: ULong = INPUT_PROP_MAX.toULong() + 1
public const val EV_MAX: U16 = 0x1f
public val EV_CNT: ULong = EV_MAX.toULong() + 1
public const val SYN_MAX: U16 = 0xf
public val SYN_CNT: ULong = SYN_MAX.toULong() + 1
public const val KEY_MAX: U16 = 0x2ff
public val KEY_CNT: ULong = KEY_MAX.toULong() + 1
public const val REL_MAX: U16 = 0x0f
public val REL_CNT: ULong = REL_MAX.toULong() + 1
public const val ABS_MAX: U16 = 0x3f
public val ABS_CNT: ULong = ABS_MAX.toULong() + 1
public const val SW_MAX: U16 = 0x0f
public val SW_CNT: ULong = SW_MAX.toULong() + 1
public const val MSC_MAX: U16 = 0x07
public val MSC_CNT: ULong = MSC_MAX.toULong() + 1
public const val LED_MAX: U16 = 0x0f
public val LED_CNT: ULong = LED_MAX.toULong() + 1
public const val REP_MAX: U16 = 0x01
public val REP_CNT: ULong = REP_MAX.toULong() + 1
public const val SND_MAX: U16 = 0x07
public val SND_CNT: ULong = SND_MAX.toULong() + 1
public const val UINPUT_VERSION: CUInt = 5u
public const val UINPUT_MAX_NAME_SIZE: ULong = 80uL
public const val ETH_ALEN: CInt = 6
public const val ETH_HLEN: CInt = 14
public const val ETH_ZLEN: CInt = 60
public const val ETH_DATA_LEN: CInt = 1500
public const val ETH_FRAME_LEN: CInt = 1514
public const val ETH_FCS_LEN: CInt = 4
public const val ETH_MIN_MTU: CInt = 68
public const val ETH_MAX_MTU: CInt = 0xFFFF
public const val ETH_P_LOOP: CInt = 0x0060
public const val ETH_P_PUP: CInt = 0x0200
public const val ETH_P_PUPAT: CInt = 0x0201
public const val ETH_P_TSN: CInt = 0x22F0
public const val ETH_P_IP: CInt = 0x0800
public const val ETH_P_X25: CInt = 0x0805
public const val ETH_P_ARP: CInt = 0x0806
public const val ETH_P_BPQ: CInt = 0x08FF
public const val ETH_P_IEEEPUP: CInt = 0x0a00
public const val ETH_P_IEEEPUPAT: CInt = 0x0a01
public const val ETH_P_BATMAN: CInt = 0x4305
public const val ETH_P_DEC: CInt = 0x6000
public const val ETH_P_DNA_DL: CInt = 0x6001
public const val ETH_P_DNA_RC: CInt = 0x6002
public const val ETH_P_DNA_RT: CInt = 0x6003
public const val ETH_P_LAT: CInt = 0x6004
public const val ETH_P_DIAG: CInt = 0x6005
public const val ETH_P_CUST: CInt = 0x6006
public const val ETH_P_SCA: CInt = 0x6007
public const val ETH_P_TEB: CInt = 0x6558
public const val ETH_P_RARP: CInt = 0x8035
public const val ETH_P_ATALK: CInt = 0x809B
public const val ETH_P_AARP: CInt = 0x80F3
public const val ETH_P_8021Q: CInt = 0x8100
public const val ETH_P_ERSPAN: CInt = 0x88BE
public const val ETH_P_IPX: CInt = 0x8137
public const val ETH_P_IPV6: CInt = 0x86DD
public const val ETH_P_PAUSE: CInt = 0x8808
public const val ETH_P_SLOW: CInt = 0x8809
public const val ETH_P_WCCP: CInt = 0x883E
public const val ETH_P_MPLS_UC: CInt = 0x8847
public const val ETH_P_MPLS_MC: CInt = 0x8848
public const val ETH_P_ATMMPOA: CInt = 0x884c
public const val ETH_P_PPP_DISC: CInt = 0x8863
public const val ETH_P_PPP_SES: CInt = 0x8864
public const val ETH_P_LINK_CTL: CInt = 0x886c
public const val ETH_P_ATMFATE: CInt = 0x8884
public const val ETH_P_PAE: CInt = 0x888E
public const val ETH_P_AOE: CInt = 0x88A2
public const val ETH_P_8021AD: CInt = 0x88A8
public const val ETH_P_802_EX1: CInt = 0x88B5
public const val ETH_P_TIPC: CInt = 0x88CA
public const val ETH_P_MACSEC: CInt = 0x88E5
public const val ETH_P_8021AH: CInt = 0x88E7
public const val ETH_P_MVRP: CInt = 0x88F5
public const val ETH_P_1588: CInt = 0x88F7
public const val ETH_P_NCSI: CInt = 0x88F8
public const val ETH_P_PRP: CInt = 0x88FB
public const val ETH_P_FCOE: CInt = 0x8906
public const val ETH_P_IBOE: CInt = 0x8915
public const val ETH_P_TDLS: CInt = 0x890D
public const val ETH_P_FIP: CInt = 0x8914
public const val ETH_P_80221: CInt = 0x8917
public const val ETH_P_HSR: CInt = 0x892F
public const val ETH_P_NSH: CInt = 0x894F
public const val ETH_P_LOOPBACK: CInt = 0x9000
public const val ETH_P_QINQ1: CInt = 0x9100
public const val ETH_P_QINQ2: CInt = 0x9200
public const val ETH_P_QINQ3: CInt = 0x9300
public const val ETH_P_EDSA: CInt = 0xDADA
public const val ETH_P_IFE: CInt = 0xED3E
public const val ETH_P_AF_IUCV: CInt = 0xFBFB
public const val ETH_P_802_3_MIN: CInt = 0x0600
public const val ETH_P_802_3: CInt = 0x0001
public const val ETH_P_AX25: CInt = 0x0002
public const val ETH_P_ALL: CInt = 0x0003
public const val ETH_P_802_2: CInt = 0x0004
public const val ETH_P_SNAP: CInt = 0x0005
public const val ETH_P_DDCMP: CInt = 0x0006
public const val ETH_P_WAN_PPP: CInt = 0x0007
public const val ETH_P_PPP_MP: CInt = 0x0008
public const val ETH_P_LOCALTALK: CInt = 0x0009
public const val ETH_P_CAN: CInt = 0x000C
public const val ETH_P_CANFD: CInt = 0x000D
public const val ETH_P_PPPTALK: CInt = 0x0010
public const val ETH_P_TR_802_2: CInt = 0x0011
public const val ETH_P_MOBITEX: CInt = 0x0015
public const val ETH_P_CONTROL: CInt = 0x0016
public const val ETH_P_IRDA: CInt = 0x0017
public const val ETH_P_ECONET: CInt = 0x0018
public const val ETH_P_HDLC: CInt = 0x0019
public const val ETH_P_ARCNET: CInt = 0x001A
public const val ETH_P_DSA: CInt = 0x001B
public const val ETH_P_TRAILER: CInt = 0x001C
public const val ETH_P_PHONET: CInt = 0x00F5
public const val ETH_P_IEEE802154: CInt = 0x00F6
public const val ETH_P_CAIF: CInt = 0x00F7
public const val ETH_P_XDSA: CInt = 0x00F8
public const val ETH_P_MAP: CInt = 0x00F9
public const val NDA_UNSPEC: CUShort = 0u
public const val NDA_DST: CUShort = 1u
public const val NDA_LLADDR: CUShort = 2u
public const val NDA_CACHEINFO: CUShort = 3u
public const val NDA_PROBES: CUShort = 4u
public const val NDA_VLAN: CUShort = 5u
public const val NDA_PORT: CUShort = 6u
public const val NDA_VNI: CUShort = 7u
public const val NDA_IFINDEX: CUShort = 8u
public const val NDA_MASTER: CUShort = 9u
public const val NDA_LINK_NETNSID: CUShort = 10u
public const val NDA_SRC_VNI: CUShort = 11u
public const val NDA_PROTOCOL: CUShort = 12u
public const val NDA_NH_ID: CUShort = 13u
public const val NDA_FDB_EXT_ATTRS: CUShort = 14u
public const val NDA_FLAGS_EXT: CUShort = 15u
public const val NDA_NDM_STATE_MASK: CUShort = 16u
public const val NDA_NDM_FLAGS_MASK: CUShort = 17u
public const val NTF_USE: UByte = 0x01u
public const val NTF_SELF: UByte = 0x02u
public const val NTF_MASTER: UByte = 0x04u
public const val NTF_PROXY: UByte = 0x08u
public const val NTF_EXT_LEARNED: UByte = 0x10u
public const val NTF_OFFLOADED: UByte = 0x20u
public const val NTF_STICKY: UByte = 0x40u
public const val NTF_ROUTER: UByte = 0x80u
public const val NTF_EXT_MANAGED: UByte = 0x01u
public const val NTF_EXT_LOCKED: UByte = 0x02u
public const val NUD_NONE: UShort = 0x00u
public const val NUD_INCOMPLETE: UShort = 0x01u
public const val NUD_REACHABLE: UShort = 0x02u
public const val NUD_STALE: UShort = 0x04u
public const val NUD_DELAY: UShort = 0x08u
public const val NUD_PROBE: UShort = 0x10u
public const val NUD_FAILED: UShort = 0x20u
public const val NUD_NOARP: UShort = 0x40u
public const val NUD_PERMANENT: UShort = 0x80u
public const val NDTPA_UNSPEC: CUShort = 0u
public const val NDTPA_IFINDEX: CUShort = 1u
public const val NDTPA_REFCNT: CUShort = 2u
public const val NDTPA_REACHABLE_TIME: CUShort = 3u
public const val NDTPA_BASE_REACHABLE_TIME: CUShort = 4u
public const val NDTPA_RETRANS_TIME: CUShort = 5u
public const val NDTPA_GC_STALETIME: CUShort = 6u
public const val NDTPA_DELAY_PROBE_TIME: CUShort = 7u
public const val NDTPA_QUEUE_LEN: CUShort = 8u
public const val NDTPA_APP_PROBES: CUShort = 9u
public const val NDTPA_UCAST_PROBES: CUShort = 10u
public const val NDTPA_MCAST_PROBES: CUShort = 11u
public const val NDTPA_ANYCAST_DELAY: CUShort = 12u
public const val NDTPA_PROXY_DELAY: CUShort = 13u
public const val NDTPA_PROXY_QLEN: CUShort = 14u
public const val NDTPA_LOCKTIME: CUShort = 15u
public const val NDTPA_QUEUE_LENBYTES: CUShort = 16u
public const val NDTPA_MCAST_REPROBES: CUShort = 17u
public const val NDTPA_PAD: CUShort = 18u
public const val NDTPA_INTERVAL_PROBE_TIME_MS: CUShort = 19u
public const val NDTA_UNSPEC: CUShort = 0u
public const val NDTA_NAME: CUShort = 1u
public const val NDTA_THRESH1: CUShort = 2u
public const val NDTA_THRESH2: CUShort = 3u
public const val NDTA_THRESH3: CUShort = 4u
public const val NDTA_CONFIG: CUShort = 5u
public const val NDTA_PARMS: CUShort = 6u
public const val NDTA_STATS: CUShort = 7u
public const val NDTA_GC_INTERVAL: CUShort = 8u
public const val NDTA_PAD: CUShort = 9u
public const val FDB_NOTIFY_BIT: UShort = 0x01u
public const val FDB_NOTIFY_INACTIVE_BIT: UShort = 0x02u
public const val NFEA_UNSPEC: CUShort = 0u
public const val NFEA_ACTIVITY_NOTIFY: CUShort = 1u
public const val NFEA_DONT_REFRESH: CUShort = 2u
public const val SIOCADDRT: CULong = 0x0000890BuL
public const val SIOCDELRT: CULong = 0x0000890CuL
public const val SIOCRTMSG: CULong = 0x0000890DuL
public const val SIOCGIFNAME: CULong = 0x00008910uL
public const val SIOCSIFLINK: CULong = 0x00008911uL
public const val SIOCGIFCONF: CULong = 0x00008912uL
public const val SIOCGIFFLAGS: CULong = 0x00008913uL
public const val SIOCSIFFLAGS: CULong = 0x00008914uL
public const val SIOCGIFADDR: CULong = 0x00008915uL
public const val SIOCSIFADDR: CULong = 0x00008916uL
public const val SIOCGIFDSTADDR: CULong = 0x00008917uL
public const val SIOCSIFDSTADDR: CULong = 0x00008918uL
public const val SIOCGIFBRDADDR: CULong = 0x00008919uL
public const val SIOCSIFBRDADDR: CULong = 0x0000891AuL
public const val SIOCGIFNETMASK: CULong = 0x0000891BuL
public const val SIOCSIFNETMASK: CULong = 0x0000891CuL
public const val SIOCGIFMETRIC: CULong = 0x0000891DuL
public const val SIOCSIFMETRIC: CULong = 0x0000891EuL
public const val SIOCGIFMEM: CULong = 0x0000891FuL
public const val SIOCSIFMEM: CULong = 0x00008920uL
public const val SIOCGIFMTU: CULong = 0x00008921uL
public const val SIOCSIFMTU: CULong = 0x00008922uL
public const val SIOCSIFNAME: CULong = 0x00008923uL
public const val SIOCSIFHWADDR: CULong = 0x00008924uL
public const val SIOCGIFENCAP: CULong = 0x00008925uL
public const val SIOCSIFENCAP: CULong = 0x00008926uL
public const val SIOCGIFHWADDR: CULong = 0x00008927uL
public const val SIOCGIFSLAVE: CULong = 0x00008929uL
public const val SIOCSIFSLAVE: CULong = 0x00008930uL
public const val SIOCADDMULTI: CULong = 0x00008931uL
public const val SIOCDELMULTI: CULong = 0x00008932uL
public const val SIOCGIFINDEX: CULong = 0x00008933uL
public const val SIOGIFINDEX: CULong = SIOCGIFINDEX
public const val SIOCSIFPFLAGS: CULong = 0x00008934uL
public const val SIOCGIFPFLAGS: CULong = 0x00008935uL
public const val SIOCDIFADDR: CULong = 0x00008936uL
public const val SIOCSIFHWBROADCAST: CULong = 0x00008937uL
public const val SIOCGIFCOUNT: CULong = 0x00008938uL
public const val SIOCGIFBR: CULong = 0x00008940uL
public const val SIOCSIFBR: CULong = 0x00008941uL
public const val SIOCGIFTXQLEN: CULong = 0x00008942uL
public const val SIOCSIFTXQLEN: CULong = 0x00008943uL
public const val SIOCETHTOOL: CULong = 0x00008946uL
public const val SIOCGMIIPHY: CULong = 0x00008947uL
public const val SIOCGMIIREG: CULong = 0x00008948uL
public const val SIOCSMIIREG: CULong = 0x00008949uL
public const val SIOCWANDEV: CULong = 0x0000894AuL
public const val SIOCOUTQNSD: CULong = 0x0000894BuL
public const val SIOCGSKNS: CULong = 0x0000894CuL
public const val SIOCDARP: CULong = 0x00008953uL
public const val SIOCGARP: CULong = 0x00008954uL
public const val SIOCSARP: CULong = 0x00008955uL
public const val SIOCDRARP: CULong = 0x00008960uL
public const val SIOCGRARP: CULong = 0x00008961uL
public const val SIOCSRARP: CULong = 0x00008962uL
public const val SIOCGIFMAP: CULong = 0x00008970uL
public const val SIOCSIFMAP: CULong = 0x00008971uL
public const val SIOCADDDLCI: CULong = 0x00008980uL
public const val SIOCDELDLCI: CULong = 0x00008981uL
public const val SIOCGIFVLAN: CULong = 0x00008982uL
public const val SIOCSIFVLAN: CULong = 0x00008983uL
public const val SIOCBONDENSLAVE: CULong = 0x00008990uL
public const val SIOCBONDRELEASE: CULong = 0x00008991uL
public const val SIOCBONDSETHWADDR: CULong = 0x00008992uL
public const val SIOCBONDSLAVEINFOQUERY: CULong = 0x00008993uL
public const val SIOCBONDINFOQUERY: CULong = 0x00008994uL
public const val SIOCBONDCHANGEACTIVE: CULong = 0x00008995uL
public const val SIOCBRADDBR: CULong = 0x000089a0uL
public const val SIOCBRDELBR: CULong = 0x000089a1uL
public const val SIOCBRADDIF: CULong = 0x000089a2uL
public const val SIOCBRDELIF: CULong = 0x000089a3uL
public const val SIOCSHWTSTAMP: CULong = 0x000089b0uL
public const val SIOCGHWTSTAMP: CULong = 0x000089b1uL
public const val SIOCDEVPRIVATE: CULong = 0x000089F0uL
public const val SIOCPROTOPRIVATE: CULong = 0x000089E0uL
public const val MODULE_INIT_IGNORE_MODVERSIONS: CUInt = 0x0001u
public const val MODULE_INIT_IGNORE_VERMAGIC: CUInt = 0x0002u
public val SOF_TIMESTAMPING_TX_HARDWARE: CUInt = 1 shl 0
public val SOF_TIMESTAMPING_TX_SOFTWARE: CUInt = 1 shl 1
public val SOF_TIMESTAMPING_RX_HARDWARE: CUInt = 1 shl 2
public val SOF_TIMESTAMPING_RX_SOFTWARE: CUInt = 1 shl 3
public val SOF_TIMESTAMPING_SOFTWARE: CUInt = 1 shl 4
public val SOF_TIMESTAMPING_SYS_HARDWARE: CUInt = 1 shl 5
public val SOF_TIMESTAMPING_RAW_HARDWARE: CUInt = 1 shl 6
public val SOF_TIMESTAMPING_OPT_ID: CUInt = 1 shl 7
public val SOF_TIMESTAMPING_TX_SCHED: CUInt = 1 shl 8
public val SOF_TIMESTAMPING_TX_ACK: CUInt = 1 shl 9
public val SOF_TIMESTAMPING_OPT_CMSG: CUInt = 1 shl 10
public val SOF_TIMESTAMPING_OPT_TSONLY: CUInt = 1 shl 11
public val SOF_TIMESTAMPING_OPT_STATS: CUInt = 1 shl 12
public val SOF_TIMESTAMPING_OPT_PKTINFO: CUInt = 1 shl 13
public val SOF_TIMESTAMPING_OPT_TX_SWHW: CUInt = 1 shl 14
public val SOF_TIMESTAMPING_BIND_PHC: CUInt = 1 shl 15
public val SOF_TIMESTAMPING_OPT_ID_TCP: CUInt = 1 shl 16
public val SOF_TIMESTAMPING_OPT_RX_FILTER: CUInt = 1 shl 17
public const val ENOATTR: CInt = ENODATA
public const val ALG_SET_KEY: CInt = 1
public const val ALG_SET_IV: CInt = 2
public const val ALG_SET_OP: CInt = 3
public const val ALG_SET_AEAD_ASSOCLEN: CInt = 4
public const val ALG_SET_AEAD_AUTHSIZE: CInt = 5
public const val ALG_SET_DRBG_ENTROPY: CInt = 6
public const val ALG_OP_DECRYPT: CInt = 0
public const val ALG_OP_ENCRYPT: CInt = 1
public const val MLOCK_ONFAULT: CInt = 0x01
public const val VMADDR_CID_ANY: CUInt = 0xFFFFFFFFu
public const val VMADDR_CID_HYPERVISOR: CUInt = 0u
public const val VMADDR_CID_LOCAL: CUInt = 1u
public const val VMADDR_CID_HOST: CUInt = 2u
public const val VMADDR_PORT_ANY: CUInt = 0xFFFFFFFFu
public const val IN_ACCESS: UInt = 0x0000_0001
public const val IN_MODIFY: UInt = 0x0000_0002
public const val IN_ATTRIB: UInt = 0x0000_0004
public const val IN_CLOSE_WRITE: UInt = 0x0000_0008
public const val IN_CLOSE_NOWRITE: UInt = 0x0000_0010
public val IN_CLOSE: UInt = IN_CLOSE_WRITE or IN_CLOSE_NOWRITE
public const val IN_OPEN: UInt = 0x0000_0020
public const val IN_MOVED_FROM: UInt = 0x0000_0040
public const val IN_MOVED_TO: UInt = 0x0000_0080
public val IN_MOVE: UInt = IN_MOVED_FROM or IN_MOVED_TO
public const val IN_CREATE: UInt = 0x0000_0100
public const val IN_DELETE: UInt = 0x0000_0200
public const val IN_DELETE_SELF: UInt = 0x0000_0400
public const val IN_MOVE_SELF: UInt = 0x0000_0800
public const val IN_UNMOUNT: UInt = 0x0000_2000
public const val IN_Q_OVERFLOW: UInt = 0x0000_4000
public const val IN_IGNORED: UInt = 0x0000_8000
public const val IN_ONLYDIR: UInt = 0x0100_0000
public const val IN_DONT_FOLLOW: UInt = 0x0200_0000
public const val IN_EXCL_UNLINK: UInt = 0x0400_0000
public const val IN_MASK_CREATE: UInt = 0x1000_0000
public const val IN_MASK_ADD: UInt = 0x2000_0000
public const val IN_ISDIR: UInt = 0x4000_0000
public const val IN_ONESHOT: UInt = 0x8000_0000
public val IN_ALL_EVENTS: UInt = IN_ACCESS or IN_MODIFY or IN_ATTRIB or IN_CLOSE_WRITE or IN_CLOSE_NOWRITE or IN_OPEN or IN_MOVED_FROM or IN_MOVED_TO or IN_DELETE or IN_CREATE or IN_DELETE_SELF or IN_MOVE_SELF
public const val IN_CLOEXEC: CInt = O_CLOEXEC
public const val IN_NONBLOCK: CInt = O_NONBLOCK
public const val FUTEX_WAIT: CInt = 0
public const val FUTEX_WAKE: CInt = 1
public const val FUTEX_FD: CInt = 2
public const val FUTEX_REQUEUE: CInt = 3
public const val FUTEX_CMP_REQUEUE: CInt = 4
public const val FUTEX_WAKE_OP: CInt = 5
public const val FUTEX_LOCK_PI: CInt = 6
public const val FUTEX_UNLOCK_PI: CInt = 7
public const val FUTEX_TRYLOCK_PI: CInt = 8
public const val FUTEX_WAIT_BITSET: CInt = 9
public const val FUTEX_WAKE_BITSET: CInt = 10
public const val FUTEX_WAIT_REQUEUE_PI: CInt = 11
public const val FUTEX_CMP_REQUEUE_PI: CInt = 12
public const val FUTEX_LOCK_PI2: CInt = 13
public const val FUTEX_PRIVATE_FLAG: CInt = 128
public const val FUTEX_CLOCK_REALTIME: CInt = 256
public val FUTEX_CMD_MASK: CInt = (FUTEX_PRIVATE_FLAG | FUTEX_CLOCK_REALTIME).inv()
public const val SO_EE_ORIGIN_NONE: UByte = 0u
public const val SO_EE_ORIGIN_LOCAL: UByte = 1u
public const val SO_EE_ORIGIN_ICMP: UByte = 2u
public const val SO_EE_ORIGIN_ICMP6: UByte = 3u
public const val SO_EE_ORIGIN_TXSTATUS: UByte = 4u
public const val SO_EE_ORIGIN_TIMESTAMPING: UByte = SO_EE_ORIGIN_TXSTATUS
public const val EPERM: CInt = 1
public const val ENOENT: CInt = 2
public const val ESRCH: CInt = 3
public const val EINTR: CInt = 4
public const val EIO: CInt = 5
public const val ENXIO: CInt = 6
public const val E2BIG: CInt = 7
public const val ENOEXEC: CInt = 8
public const val EBADF: CInt = 9
public const val ECHILD: CInt = 10
public const val EAGAIN: CInt = 11
public const val ENOMEM: CInt = 12
public const val EACCES: CInt = 13
public const val EFAULT: CInt = 14
public const val ENOTBLK: CInt = 15
public const val EBUSY: CInt = 16
public const val EEXIST: CInt = 17
public const val EXDEV: CInt = 18
public const val ENODEV: CInt = 19
public const val ENOTDIR: CInt = 20
public const val EISDIR: CInt = 21
public const val EINVAL: CInt = 22
public const val ENFILE: CInt = 23
public const val EMFILE: CInt = 24
public const val ENOTTY: CInt = 25
public const val ETXTBSY: CInt = 26
public const val EFBIG: CInt = 27
public const val ENOSPC: CInt = 28
public const val ESPIPE: CInt = 29
public const val EROFS: CInt = 30
public const val EMLINK: CInt = 31
public const val EPIPE: CInt = 32
public const val EDOM: CInt = 33
public const val ERANGE: CInt = 34
public const val EWOULDBLOCK: CInt = EAGAIN
public const val PRIO_PROCESS: CInt = 0
public const val PRIO_PGRP: CInt = 1
public const val PRIO_USER: CInt = 2
public const val SCHED_NORMAL: CInt = 0
public const val SCHED_FIFO: CInt = 1
public const val SCHED_RR: CInt = 2
public const val SCHED_BATCH: CInt = 3
public const val SCHED_IDLE: CInt = 5
public const val SCHED_DEADLINE: CInt = 6
public const val SCHED_RESET_ON_FORK: CInt = 0x40000000
public const val CLONE_PIDFD: CInt = 0x1000
public const val CLONE_CLEAR_SIGHAND: CULongLong = 0x100000000uL
public const val CLONE_INTO_CGROUP: CULongLong = 0x200000000uL
public const val MEMBARRIER_CMD_QUERY: CInt = 0
public val MEMBARRIER_CMD_GLOBAL: CInt = 1 shl 0
public val MEMBARRIER_CMD_GLOBAL_EXPEDITED: CInt = 1 shl 1
public val MEMBARRIER_CMD_REGISTER_GLOBAL_EXPEDITED: CInt = 1 shl 2
public val MEMBARRIER_CMD_PRIVATE_EXPEDITED: CInt = 1 shl 3
public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED: CInt = 1 shl 4
public val MEMBARRIER_CMD_PRIVATE_EXPEDITED_SYNC_CORE: CInt = 1 shl 5
public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED_SYNC_CORE: CInt = 1 shl 6
public val MEMBARRIER_CMD_PRIVATE_EXPEDITED_RSEQ: CInt = 1 shl 7
public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED_RSEQ: CInt = 1 shl 8
public const val MPOL_DEFAULT: CInt = 0
public const val MPOL_PREFERRED: CInt = 1
public const val MPOL_BIND: CInt = 2
public const val MPOL_INTERLEAVE: CInt = 3
public const val MPOL_LOCAL: CInt = 4
public val MPOL_F_NUMA_BALANCING: CInt = 1 shl 13
public val MPOL_F_RELATIVE_NODES: CInt = 1 shl 14
public val MPOL_F_STATIC_NODES: CInt = 1 shl 15
public const val SEEK_DATA: CInt = 3
public const val SEEK_HOLE: CInt = 4
public const val AF_NFC: CInt = 39
public const val AF_VSOCK: CInt = 40
public const val PF_NFC: CInt = AF_NFC
public const val PF_VSOCK: CInt = AF_VSOCK
public const val SOMAXCONN: CInt = 128
public const val PROP_VALUE_MAX: CInt = 92
public const val PROP_NAME_MAX: CInt = 32
public const val PR_SET_PDEATHSIG: CInt = 1
public const val PR_GET_PDEATHSIG: CInt = 2
public const val PR_GET_DUMPABLE: CInt = 3
public const val PR_SET_DUMPABLE: CInt = 4
public const val PR_GET_UNALIGN: CInt = 5
public const val PR_SET_UNALIGN: CInt = 6
public const val PR_UNALIGN_NOPRINT: CInt = 1
public const val PR_UNALIGN_SIGBUS: CInt = 2
public const val PR_GET_KEEPCAPS: CInt = 7
public const val PR_SET_KEEPCAPS: CInt = 8
public const val PR_GET_FPEMU: CInt = 9
public const val PR_SET_FPEMU: CInt = 10
public const val PR_FPEMU_NOPRINT: CInt = 1
public const val PR_FPEMU_SIGFPE: CInt = 2
public const val PR_GET_FPEXC: CInt = 11
public const val PR_SET_FPEXC: CInt = 12
public const val PR_FP_EXC_SW_ENABLE: CInt = 0x80
public const val PR_FP_EXC_DIV: CInt = 0x010000
public const val PR_FP_EXC_OVF: CInt = 0x020000
public const val PR_FP_EXC_UND: CInt = 0x040000
public const val PR_FP_EXC_RES: CInt = 0x080000
public const val PR_FP_EXC_INV: CInt = 0x100000
public const val PR_FP_EXC_DISABLED: CInt = 0
public const val PR_FP_EXC_NONRECOV: CInt = 1
public const val PR_FP_EXC_ASYNC: CInt = 2
public const val PR_FP_EXC_PRECISE: CInt = 3
public const val PR_GET_TIMING: CInt = 13
public const val PR_SET_TIMING: CInt = 14
public const val PR_TIMING_STATISTICAL: CInt = 0
public const val PR_TIMING_TIMESTAMP: CInt = 1
public const val PR_SET_NAME: CInt = 15
public const val PR_GET_NAME: CInt = 16
public const val PR_GET_ENDIAN: CInt = 19
public const val PR_SET_ENDIAN: CInt = 20
public const val PR_ENDIAN_BIG: CInt = 0
public const val PR_ENDIAN_LITTLE: CInt = 1
public const val PR_ENDIAN_PPC_LITTLE: CInt = 2
public const val PR_GET_SECCOMP: CInt = 21
public const val PR_SET_SECCOMP: CInt = 22
public const val PR_CAPBSET_READ: CInt = 23
public const val PR_CAPBSET_DROP: CInt = 24
public const val PR_GET_TSC: CInt = 25
public const val PR_SET_TSC: CInt = 26
public const val PR_TSC_ENABLE: CInt = 1
public const val PR_TSC_SIGSEGV: CInt = 2
public const val PR_GET_SECUREBITS: CInt = 27
public const val PR_SET_SECUREBITS: CInt = 28
public const val PR_SET_TIMERSLACK: CInt = 29
public const val PR_GET_TIMERSLACK: CInt = 30
public const val PR_TASK_PERF_EVENTS_DISABLE: CInt = 31
public const val PR_TASK_PERF_EVENTS_ENABLE: CInt = 32
public const val PR_MCE_KILL: CInt = 33
public const val PR_MCE_KILL_CLEAR: CInt = 0
public const val PR_MCE_KILL_SET: CInt = 1
public const val PR_MCE_KILL_LATE: CInt = 0
public const val PR_MCE_KILL_EARLY: CInt = 1
public const val PR_MCE_KILL_DEFAULT: CInt = 2
public const val PR_MCE_KILL_GET: CInt = 34
public const val PR_SET_MM: CInt = 35
public const val PR_SET_MM_START_CODE: CInt = 1
public const val PR_SET_MM_END_CODE: CInt = 2
public const val PR_SET_MM_START_DATA: CInt = 3
public const val PR_SET_MM_END_DATA: CInt = 4
public const val PR_SET_MM_START_STACK: CInt = 5
public const val PR_SET_MM_START_BRK: CInt = 6
public const val PR_SET_MM_BRK: CInt = 7
public const val PR_SET_MM_ARG_START: CInt = 8
public const val PR_SET_MM_ARG_END: CInt = 9
public const val PR_SET_MM_ENV_START: CInt = 10
public const val PR_SET_MM_ENV_END: CInt = 11
public const val PR_SET_MM_AUXV: CInt = 12
public const val PR_SET_MM_EXE_FILE: CInt = 13
public const val PR_SET_MM_MAP: CInt = 14
public const val PR_SET_MM_MAP_SIZE: CInt = 15
public const val PR_SET_PTRACER: CInt = 0x59616d61
public const val PR_SET_PTRACER_ANY: CULong = 0xffffffffffffffffuL
public const val PR_SET_CHILD_SUBREAPER: CInt = 36
public const val PR_GET_CHILD_SUBREAPER: CInt = 37
public const val PR_SET_NO_NEW_PRIVS: CInt = 38
public const val PR_GET_NO_NEW_PRIVS: CInt = 39
public const val PR_GET_TID_ADDRESS: CInt = 40
public const val PR_SET_THP_DISABLE: CInt = 41
public const val PR_GET_THP_DISABLE: CInt = 42
public const val PR_MPX_ENABLE_MANAGEMENT: CInt = 43
public const val PR_MPX_DISABLE_MANAGEMENT: CInt = 44
public const val PR_SET_FP_MODE: CInt = 45
public const val PR_GET_FP_MODE: CInt = 46
public val PR_FP_MODE_FR: CInt = 1 shl 0
public val PR_FP_MODE_FRE: CInt = 1 shl 1
public const val PR_CAP_AMBIENT: CInt = 47
public const val PR_CAP_AMBIENT_IS_SET: CInt = 1
public const val PR_CAP_AMBIENT_RAISE: CInt = 2
public const val PR_CAP_AMBIENT_LOWER: CInt = 3
public const val PR_CAP_AMBIENT_CLEAR_ALL: CInt = 4
public const val PR_SVE_SET_VL: CInt = 50
public val PR_SVE_SET_VL_ONEXEC: CInt = 1 shl 18
public const val PR_SVE_GET_VL: CInt = 51
public const val PR_SVE_VL_LEN_MASK: CInt = 0xffff
public val PR_SVE_VL_INHERIT: CInt = 1 shl 17
public const val PR_GET_SPECULATION_CTRL: CInt = 52
public const val PR_SET_SPECULATION_CTRL: CInt = 53
public const val PR_SPEC_STORE_BYPASS: CInt = 0
public const val PR_SPEC_INDIRECT_BRANCH: CInt = 1
public const val PR_SPEC_L1D_FLUSH: CInt = 2
public const val PR_SPEC_NOT_AFFECTED: CInt = 0
public val PR_SPEC_PRCTL: CULong = 1 shl 0
public val PR_SPEC_ENABLE: CULong = 1 shl 1
public val PR_SPEC_DISABLE: CULong = 1 shl 2
public val PR_SPEC_FORCE_DISABLE: CULong = 1 shl 3
public val PR_SPEC_DISABLE_NOEXEC: CULong = 1 shl 4
public const val PR_PAC_RESET_KEYS: CInt = 54
public val PR_PAC_APIAKEY: CULong = 1 shl 0
public val PR_PAC_APIBKEY: CULong = 1 shl 1
public val PR_PAC_APDAKEY: CULong = 1 shl 2
public val PR_PAC_APDBKEY: CULong = 1 shl 3
public val PR_PAC_APGAKEY: CULong = 1 shl 4
public const val PR_SET_TAGGED_ADDR_CTRL: CInt = 55
public const val PR_GET_TAGGED_ADDR_CTRL: CInt = 56
public val PR_TAGGED_ADDR_ENABLE: CULong = 1 shl 0
public const val PR_MTE_TCF_NONE: CULong = 0uL
public val PR_MTE_TCF_SYNC: CULong = 1 shl 1
public val PR_MTE_TCF_ASYNC: CULong = 1 shl 2
public val PR_MTE_TCF_MASK: CULong = PR_MTE_TCF_SYNC or PR_MTE_TCF_ASYNC
public const val PR_MTE_TAG_SHIFT: CULong = 3uL
public val PR_MTE_TAG_MASK: CULong = 0xffff shl PR_MTE_TAG_SHIFT
public const val PR_MTE_TCF_SHIFT: CULong = 1uL
public const val PR_SET_IO_FLUSHER: CInt = 57
public const val PR_GET_IO_FLUSHER: CInt = 58
public const val PR_SET_SYSCALL_USER_DISPATCH: CInt = 59
public const val PR_SYS_DISPATCH_OFF: CInt = 0
public const val PR_SYS_DISPATCH_ON: CInt = 1
public const val SYSCALL_DISPATCH_FILTER_ALLOW: CInt = 0
public const val SYSCALL_DISPATCH_FILTER_BLOCK: CInt = 1
public const val PR_PAC_SET_ENABLED_KEYS: CInt = 60
public const val PR_PAC_GET_ENABLED_KEYS: CInt = 61
public const val PR_SCHED_CORE: CInt = 62
public const val PR_SCHED_CORE_GET: CInt = 0
public const val PR_SCHED_CORE_CREATE: CInt = 1
public const val PR_SCHED_CORE_SHARE_TO: CInt = 2
public const val PR_SCHED_CORE_SHARE_FROM: CInt = 3
public const val PR_SCHED_CORE_MAX: CInt = 4
public const val PR_SCHED_CORE_SCOPE_THREAD: CInt = 0
public const val PR_SCHED_CORE_SCOPE_THREAD_GROUP: CInt = 1
public const val PR_SCHED_CORE_SCOPE_PROCESS_GROUP: CInt = 2
public const val PR_SME_SET_VL: CInt = 63
public val PR_SME_SET_VL_ONEXEC: CInt = 1 shl 18
public const val PR_SME_GET_VL: CInt = 64
public const val PR_SME_VL_LEN_MASK: CInt = 0xffff
public val PR_SME_VL_INHERIT: CInt = 1 shl 17
public const val PR_SET_MDWE: CInt = 65
public val PR_MDWE_REFUSE_EXEC_GAIN: CULong = 1 shl 0
public val PR_MDWE_NO_INHERIT: CULong = 1 shl 1
public const val PR_GET_MDWE: CInt = 66
public const val PR_SET_VMA: CInt = 0x53564d41
public const val PR_SET_VMA_ANON_NAME: CInt = 0
public const val PR_GET_AUXV: CInt = 0x41555856
public const val PR_SET_MEMORY_MERGE: CInt = 67
public const val PR_GET_MEMORY_MERGE: CInt = 68
public const val PR_RISCV_V_SET_CONTROL: CInt = 69
public const val PR_RISCV_V_GET_CONTROL: CInt = 70
public const val PR_RISCV_V_VSTATE_CTRL_DEFAULT: CInt = 0
public const val PR_RISCV_V_VSTATE_CTRL_OFF: CInt = 1
public const val PR_RISCV_V_VSTATE_CTRL_ON: CInt = 2
public val PR_RISCV_V_VSTATE_CTRL_INHERIT: CInt = 1 shl 4
public const val PR_RISCV_V_VSTATE_CTRL_CUR_MASK: CInt = 0x3
public const val PR_RISCV_V_VSTATE_CTRL_NEXT_MASK: CInt = 0xc
public const val PR_RISCV_V_VSTATE_CTRL_MASK: CInt = 0x1f
public const val IFA_UNSPEC: CUShort = 0u
public const val IFA_ADDRESS: CUShort = 1u
public const val IFA_LOCAL: CUShort = 2u
public const val IFA_LABEL: CUShort = 3u
public const val IFA_BROADCAST: CUShort = 4u
public const val IFA_ANYCAST: CUShort = 5u
public const val IFA_CACHEINFO: CUShort = 6u
public const val IFA_MULTICAST: CUShort = 7u
public const val IFA_F_SECONDARY: UInt = 0x01u
public const val IFA_F_TEMPORARY: UInt = 0x01u
public const val IFA_F_NODAD: UInt = 0x02u
public const val IFA_F_OPTIMISTIC: UInt = 0x04u
public const val IFA_F_DADFAILED: UInt = 0x08u
public const val IFA_F_HOMEADDRESS: UInt = 0x10u
public const val IFA_F_DEPRECATED: UInt = 0x20u
public const val IFA_F_TENTATIVE: UInt = 0x40u
public const val IFA_F_PERMANENT: UInt = 0x80u
public const val IFLA_UNSPEC: CUShort = 0u
public const val IFLA_ADDRESS: CUShort = 1u
public const val IFLA_BROADCAST: CUShort = 2u
public const val IFLA_IFNAME: CUShort = 3u
public const val IFLA_MTU: CUShort = 4u
public const val IFLA_LINK: CUShort = 5u
public const val IFLA_QDISC: CUShort = 6u
public const val IFLA_STATS: CUShort = 7u
public const val IFLA_COST: CUShort = 8u
public const val IFLA_PRIORITY: CUShort = 9u
public const val IFLA_MASTER: CUShort = 10u
public const val IFLA_WIRELESS: CUShort = 11u
public const val IFLA_PROTINFO: CUShort = 12u
public const val IFLA_TXQLEN: CUShort = 13u
public const val IFLA_MAP: CUShort = 14u
public const val IFLA_WEIGHT: CUShort = 15u
public const val IFLA_OPERSTATE: CUShort = 16u
public const val IFLA_LINKMODE: CUShort = 17u
public const val IFLA_LINKINFO: CUShort = 18u
public const val IFLA_NET_NS_PID: CUShort = 19u
public const val IFLA_IFALIAS: CUShort = 20u
public const val IFLA_NUM_VF: CUShort = 21u
public const val IFLA_VFINFO_LIST: CUShort = 22u
public const val IFLA_STATS64: CUShort = 23u
public const val IFLA_VF_PORTS: CUShort = 24u
public const val IFLA_PORT_SELF: CUShort = 25u
public const val IFLA_AF_SPEC: CUShort = 26u
public const val IFLA_GROUP: CUShort = 27u
public const val IFLA_NET_NS_FD: CUShort = 28u
public const val IFLA_EXT_MASK: CUShort = 29u
public const val IFLA_PROMISCUITY: CUShort = 30u
public const val IFLA_NUM_TX_QUEUES: CUShort = 31u
public const val IFLA_NUM_RX_QUEUES: CUShort = 32u
public const val IFLA_CARRIER: CUShort = 33u
public const val IFLA_PHYS_PORT_ID: CUShort = 34u
public const val IFLA_CARRIER_CHANGES: CUShort = 35u
public const val IFLA_PHYS_SWITCH_ID: CUShort = 36u
public const val IFLA_LINK_NETNSID: CUShort = 37u
public const val IFLA_PHYS_PORT_NAME: CUShort = 38u
public const val IFLA_PROTO_DOWN: CUShort = 39u
public const val IFLA_GSO_MAX_SEGS: CUShort = 40u
public const val IFLA_GSO_MAX_SIZE: CUShort = 41u
public const val IFLA_PAD: CUShort = 42u
public const val IFLA_XDP: CUShort = 43u
public const val IFLA_EVENT: CUShort = 44u
public const val IFLA_NEW_NETNSID: CUShort = 45u
public const val IFLA_IF_NETNSID: CUShort = 46u
public const val IFLA_TARGET_NETNSID: CUShort = IFLA_IF_NETNSID
public const val IFLA_CARRIER_UP_COUNT: CUShort = 47u
public const val IFLA_CARRIER_DOWN_COUNT: CUShort = 48u
public const val IFLA_NEW_IFINDEX: CUShort = 49u
public const val IFLA_MIN_MTU: CUShort = 50u
public const val IFLA_MAX_MTU: CUShort = 51u
public const val IFLA_PROP_LIST: CUShort = 52u
public const val IFLA_ALT_IFNAME: CUShort = 53u
public const val IFLA_PERM_ADDRESS: CUShort = 54u
public const val IFLA_PROTO_DOWN_REASON: CUShort = 55u
public const val IFLA_PARENT_DEV_NAME: CUShort = 56u
public const val IFLA_PARENT_DEV_BUS_NAME: CUShort = 57u
public const val IFLA_GRO_MAX_SIZE: CUShort = 58u
public const val IFLA_TSO_MAX_SIZE: CUShort = 59u
public const val IFLA_TSO_MAX_SEGS: CUShort = 60u
public const val IFLA_ALLMULTI: CUShort = 61u
public const val IFLA_DEVLINK_PORT: CUShort = 62u
public const val IFLA_GSO_IPV4_MAX_SIZE: CUShort = 63u
public const val IFLA_GRO_IPV4_MAX_SIZE: CUShort = 64u
public const val IFLA_INFO_UNSPEC: CUShort = 0u
public const val IFLA_INFO_KIND: CUShort = 1u
public const val IFLA_INFO_DATA: CUShort = 2u
public const val IFLA_INFO_XSTATS: CUShort = 3u
public const val IFLA_INFO_SLAVE_KIND: CUShort = 4u
public const val IFLA_INFO_SLAVE_DATA: CUShort = 5u
public const val TCA_UNSPEC: CUShort = 0u
public const val TCA_KIND: CUShort = 1u
public const val TCA_OPTIONS: CUShort = 2u
public const val TCA_STATS: CUShort = 3u
public const val TCA_XSTATS: CUShort = 4u
public const val TCA_RATE: CUShort = 5u
public const val TCA_FCNT: CUShort = 6u
public const val TCA_STATS2: CUShort = 7u
public const val TCA_STAB: CUShort = 8u
public const val RTM_NEWLINK: UShort = 16u
public const val RTM_DELLINK: UShort = 17u
public const val RTM_GETLINK: UShort = 18u
public const val RTM_SETLINK: UShort = 19u
public const val RTM_NEWADDR: UShort = 20u
public const val RTM_DELADDR: UShort = 21u
public const val RTM_GETADDR: UShort = 22u
public const val RTM_NEWROUTE: UShort = 24u
public const val RTM_DELROUTE: UShort = 25u
public const val RTM_GETROUTE: UShort = 26u
public const val RTM_NEWNEIGH: UShort = 28u
public const val RTM_DELNEIGH: UShort = 29u
public const val RTM_GETNEIGH: UShort = 30u
public const val RTM_NEWRULE: UShort = 32u
public const val RTM_DELRULE: UShort = 33u
public const val RTM_GETRULE: UShort = 34u
public const val RTM_NEWQDISC: UShort = 36u
public const val RTM_DELQDISC: UShort = 37u
public const val RTM_GETQDISC: UShort = 38u
public const val RTM_NEWTCLASS: UShort = 40u
public const val RTM_DELTCLASS: UShort = 41u
public const val RTM_GETTCLASS: UShort = 42u
public const val RTM_NEWTFILTER: UShort = 44u
public const val RTM_DELTFILTER: UShort = 45u
public const val RTM_GETTFILTER: UShort = 46u
public const val RTM_NEWACTION: UShort = 48u
public const val RTM_DELACTION: UShort = 49u
public const val RTM_GETACTION: UShort = 50u
public const val RTM_NEWPREFIX: UShort = 52u
public const val RTM_GETMULTICAST: UShort = 58u
public const val RTM_GETANYCAST: UShort = 62u
public const val RTM_NEWNEIGHTBL: UShort = 64u
public const val RTM_GETNEIGHTBL: UShort = 66u
public const val RTM_SETNEIGHTBL: UShort = 67u
public const val RTM_NEWNDUSEROPT: UShort = 68u
public const val RTM_NEWADDRLABEL: UShort = 72u
public const val RTM_DELADDRLABEL: UShort = 73u
public const val RTM_GETADDRLABEL: UShort = 74u
public const val RTM_GETDCB: UShort = 78u
public const val RTM_SETDCB: UShort = 79u
public const val RTM_NEWNETCONF: UShort = 80u
public const val RTM_GETNETCONF: UShort = 82u
public const val RTM_NEWMDB: UShort = 84u
public const val RTM_DELMDB: UShort = 85u
public const val RTM_GETMDB: UShort = 86u
public const val RTM_NEWNSID: UShort = 88u
public const val RTM_DELNSID: UShort = 89u
public const val RTM_GETNSID: UShort = 90u
public const val RTM_F_NOTIFY: CUInt = 0x100u
public const val RTM_F_CLONED: CUInt = 0x200u
public const val RTM_F_EQUALIZE: CUInt = 0x400u
public const val RTM_F_PREFIX: CUInt = 0x800u
public const val RTA_UNSPEC: CUShort = 0u
public const val RTA_DST: CUShort = 1u
public const val RTA_SRC: CUShort = 2u
public const val RTA_IIF: CUShort = 3u
public const val RTA_OIF: CUShort = 4u
public const val RTA_GATEWAY: CUShort = 5u
public const val RTA_PRIORITY: CUShort = 6u
public const val RTA_PREFSRC: CUShort = 7u
public const val RTA_METRICS: CUShort = 8u
public const val RTA_MULTIPATH: CUShort = 9u
public const val RTA_PROTOINFO: CUShort = 10u
public const val RTA_FLOW: CUShort = 11u
public const val RTA_CACHEINFO: CUShort = 12u
public const val RTA_SESSION: CUShort = 13u
public const val RTA_MP_ALGO: CUShort = 14u
public const val RTA_TABLE: CUShort = 15u
public const val RTA_MARK: CUShort = 16u
public const val RTA_MFC_STATS: CUShort = 17u
public const val RTN_UNSPEC: CUChar = 0u
public const val RTN_UNICAST: CUChar = 1u
public const val RTN_LOCAL: CUChar = 2u
public const val RTN_BROADCAST: CUChar = 3u
public const val RTN_ANYCAST: CUChar = 4u
public const val RTN_MULTICAST: CUChar = 5u
public const val RTN_BLACKHOLE: CUChar = 6u
public const val RTN_UNREACHABLE: CUChar = 7u
public const val RTN_PROHIBIT: CUChar = 8u
public const val RTN_THROW: CUChar = 9u
public const val RTN_NAT: CUChar = 10u
public const val RTN_XRESOLVE: CUChar = 11u
public const val RTPROT_UNSPEC: CUChar = 0u
public const val RTPROT_REDIRECT: CUChar = 1u
public const val RTPROT_KERNEL: CUChar = 2u
public const val RTPROT_BOOT: CUChar = 3u
public const val RTPROT_STATIC: CUChar = 4u
public const val RT_SCOPE_UNIVERSE: CUChar = 0u
public const val RT_SCOPE_SITE: CUChar = 200u
public const val RT_SCOPE_LINK: CUChar = 253u
public const val RT_SCOPE_HOST: CUChar = 254u
public const val RT_SCOPE_NOWHERE: CUChar = 255u
public const val RT_TABLE_UNSPEC: CUChar = 0u
public const val RT_TABLE_COMPAT: CUChar = 252u
public const val RT_TABLE_DEFAULT: CUChar = 253u
public const val RT_TABLE_MAIN: CUChar = 254u
public const val RT_TABLE_LOCAL: CUChar = 255u
public const val RTMSG_NEWDEVICE: UInt = 0x11u
public const val RTMSG_DELDEVICE: UInt = 0x12u
public const val RTMSG_NEWROUTE: UInt = 0x21u
public const val RTMSG_DELROUTE: UInt = 0x22u
public const val CTL_KERN: CInt = 1
public const val CTL_VM: CInt = 2
public const val CTL_NET: CInt = 3
public const val CTL_FS: CInt = 5
public const val CTL_DEBUG: CInt = 6
public const val CTL_DEV: CInt = 7
public const val CTL_BUS: CInt = 8
public const val CTL_ABI: CInt = 9
public const val CTL_CPU: CInt = 10
public const val CTL_BUS_ISA: CInt = 1
public const val INOTIFY_MAX_USER_INSTANCES: CInt = 1
public const val INOTIFY_MAX_USER_WATCHES: CInt = 2
public const val INOTIFY_MAX_QUEUED_EVENTS: CInt = 3
public const val KERN_OSTYPE: CInt = 1
public const val KERN_OSRELEASE: CInt = 2
public const val KERN_OSREV: CInt = 3
public const val KERN_VERSION: CInt = 4
public const val KERN_SECUREMASK: CInt = 5
public const val KERN_PROF: CInt = 6
public const val KERN_NODENAME: CInt = 7
public const val KERN_DOMAINNAME: CInt = 8
public const val KERN_PANIC: CInt = 15
public const val KERN_REALROOTDEV: CInt = 16
public const val KERN_SPARC_REBOOT: CInt = 21
public const val KERN_CTLALTDEL: CInt = 22
public const val KERN_PRINTK: CInt = 23
public const val KERN_NAMETRANS: CInt = 24
public const val KERN_PPC_HTABRECLAIM: CInt = 25
public const val KERN_PPC_ZEROPAGED: CInt = 26
public const val KERN_PPC_POWERSAVE_NAP: CInt = 27
public const val KERN_MODPROBE: CInt = 28
public const val KERN_SG_BIG_BUFF: CInt = 29
public const val KERN_ACCT: CInt = 30
public const val KERN_PPC_L2CR: CInt = 31
public const val KERN_RTSIGNR: CInt = 32
public const val KERN_RTSIGMAX: CInt = 33
public const val KERN_SHMMAX: CInt = 34
public const val KERN_MSGMAX: CInt = 35
public const val KERN_MSGMNB: CInt = 36
public const val KERN_MSGPOOL: CInt = 37
public const val KERN_SYSRQ: CInt = 38
public const val KERN_MAX_THREADS: CInt = 39
public const val KERN_RANDOM: CInt = 40
public const val KERN_SHMALL: CInt = 41
public const val KERN_MSGMNI: CInt = 42
public const val KERN_SEM: CInt = 43
public const val KERN_SPARC_STOP_A: CInt = 44
public const val KERN_SHMMNI: CInt = 45
public const val KERN_OVERFLOWUID: CInt = 46
public const val KERN_OVERFLOWGID: CInt = 47
public const val KERN_SHMPATH: CInt = 48
public const val KERN_HOTPLUG: CInt = 49
public const val KERN_IEEE_EMULATION_WARNINGS: CInt = 50
public const val KERN_S390_USER_DEBUG_LOGGING: CInt = 51
public const val KERN_CORE_USES_PID: CInt = 52
public const val KERN_TAINTED: CInt = 53
public const val KERN_CADPID: CInt = 54
public const val KERN_PIDMAX: CInt = 55
public const val KERN_CORE_PATTERN: CInt = 56
public const val KERN_PANIC_ON_OOPS: CInt = 57
public const val KERN_HPPA_PWRSW: CInt = 58
public const val KERN_HPPA_UNALIGNED: CInt = 59
public const val KERN_PRINTK_RATELIMIT: CInt = 60
public const val KERN_PRINTK_RATELIMIT_BURST: CInt = 61
public const val KERN_PTY: CInt = 62
public const val KERN_NGROUPS_MAX: CInt = 63
public const val KERN_SPARC_SCONS_PWROFF: CInt = 64
public const val KERN_HZ_TIMER: CInt = 65
public const val KERN_UNKNOWN_NMI_PANIC: CInt = 66
public const val KERN_BOOTLOADER_TYPE: CInt = 67
public const val KERN_RANDOMIZE: CInt = 68
public const val KERN_SETUID_DUMPABLE: CInt = 69
public const val KERN_SPIN_RETRY: CInt = 70
public const val KERN_ACPI_VIDEO_FLAGS: CInt = 71
public const val KERN_IA64_UNALIGNED: CInt = 72
public const val KERN_COMPAT_LOG: CInt = 73
public const val KERN_MAX_LOCK_DEPTH: CInt = 74
public const val VM_OVERCOMMIT_MEMORY: CInt = 5
public const val VM_PAGE_CLUSTER: CInt = 10
public const val VM_DIRTY_BACKGROUND: CInt = 11
public const val VM_DIRTY_RATIO: CInt = 12
public const val VM_DIRTY_WB_CS: CInt = 13
public const val VM_DIRTY_EXPIRE_CS: CInt = 14
public const val VM_NR_PDFLUSH_THREADS: CInt = 15
public const val VM_OVERCOMMIT_RATIO: CInt = 16
public const val VM_PAGEBUF: CInt = 17
public const val VM_HUGETLB_PAGES: CInt = 18
public const val VM_SWAPPINESS: CInt = 19
public const val VM_LOWMEM_RESERVE_RATIO: CInt = 20
public const val VM_MIN_FREE_KBYTES: CInt = 21
public const val VM_MAX_MAP_COUNT: CInt = 22
public const val VM_LAPTOP_MODE: CInt = 23
public const val VM_BLOCK_DUMP: CInt = 24
public const val VM_HUGETLB_GROUP: CInt = 25
public const val VM_VFS_CACHE_PRESSURE: CInt = 26
public const val VM_LEGACY_VA_LAYOUT: CInt = 27
public const val VM_SWAP_TOKEN_TIMEOUT: CInt = 28
public const val VM_DROP_PAGECACHE: CInt = 29
public const val VM_PERCPU_PAGELIST_FRACTION: CInt = 30
public const val VM_ZONE_RECLAIM_MODE: CInt = 31
public const val VM_MIN_UNMAPPED: CInt = 32
public const val VM_PANIC_ON_OOM: CInt = 33
public const val VM_VDSO_ENABLED: CInt = 34
public const val NET_CORE: CInt = 1
public const val NET_ETHER: CInt = 2
public const val NET_802: CInt = 3
public const val NET_UNIX: CInt = 4
public const val NET_IPV4: CInt = 5
public const val NET_IPX: CInt = 6
public const val NET_ATALK: CInt = 7
public const val NET_NETROM: CInt = 8
public const val NET_AX25: CInt = 9
public const val NET_BRIDGE: CInt = 10
public const val NET_ROSE: CInt = 11
public const val NET_IPV6: CInt = 12
public const val NET_X25: CInt = 13
public const val NET_TR: CInt = 14
public const val NET_DECNET: CInt = 15
public const val NET_ECONET: CInt = 16
public const val NET_SCTP: CInt = 17
public const val NET_LLC: CInt = 18
public const val NET_NETFILTER: CInt = 19
public const val NET_DCCP: CInt = 20
public const val HUGETLB_FLAG_ENCODE_SHIFT: CInt = 26
public const val MAP_HUGE_SHIFT: CInt = HUGETLB_FLAG_ENCODE_SHIFT
public const val PF_VCPU: CInt = 0x00000001
public const val PF_IDLE: CInt = 0x00000002
public const val PF_EXITING: CInt = 0x00000004
public const val PF_POSTCOREDUMP: CInt = 0x00000008
public const val PF_IO_WORKER: CInt = 0x00000010
public const val PF_WQ_WORKER: CInt = 0x00000020
public const val PF_FORKNOEXEC: CInt = 0x00000040
public const val PF_MCE_PROCESS: CInt = 0x00000080
public const val PF_SUPERPRIV: CInt = 0x00000100
public const val PF_DUMPCORE: CInt = 0x00000200
public const val PF_SIGNALED: CInt = 0x00000400
public const val PF_MEMALLOC: CInt = 0x00000800
public const val PF_NPROC_EXCEEDED: CInt = 0x00001000
public const val PF_USED_MATH: CInt = 0x00002000
public const val PF_USER_WORKER: CInt = 0x00004000
public const val PF_NOFREEZE: CInt = 0x00008000
public const val PF_KSWAPD: CInt = 0x00020000
public const val PF_MEMALLOC_NOFS: CInt = 0x00040000
public const val PF_MEMALLOC_NOIO: CInt = 0x00080000
public const val PF_LOCAL_THROTTLE: CInt = 0x00100000
public const val PF_KTHREAD: CInt = 0x00200000
public const val PF_RANDOMIZE: CInt = 0x00400000
public const val PF_NO_SETAFFINITY: CInt = 0x04000000
public const val PF_MCE_EARLY: CInt = 0x08000000
public const val PF_MEMALLOC_PIN: CInt = 0x10000000
public const val PF_SUSPEND_TASK: CInt = 0x80000000
public const val KLOG_CLOSE: CInt = 0
public const val KLOG_OPEN: CInt = 1
public const val KLOG_READ: CInt = 2
public const val KLOG_READ_ALL: CInt = 3
public const val KLOG_READ_CLEAR: CInt = 4
public const val KLOG_CLEAR: CInt = 5
public const val KLOG_CONSOLE_OFF: CInt = 6
public const val KLOG_CONSOLE_ON: CInt = 7
public const val KLOG_CONSOLE_LEVEL: CInt = 8
public const val KLOG_SIZE_UNREAD: CInt = 9
public const val KLOG_SIZE_BUFFER: CInt = 10
public const val AT_NULL: CULong = 0uL
public const val AT_IGNORE: CULong = 1uL
public const val AT_EXECFD: CULong = 2uL
public const val AT_PHDR: CULong = 3uL
public const val AT_PHENT: CULong = 4uL
public const val AT_PHNUM: CULong = 5uL
public const val AT_PAGESZ: CULong = 6uL
public const val AT_BASE: CULong = 7uL
public const val AT_FLAGS: CULong = 8uL
public const val AT_ENTRY: CULong = 9uL
public const val AT_NOTELF: CULong = 10uL
public const val AT_UID: CULong = 11uL
public const val AT_EUID: CULong = 12uL
public const val AT_GID: CULong = 13uL
public const val AT_EGID: CULong = 14uL
public const val AT_PLATFORM: CULong = 15uL
public const val AT_HWCAP: CULong = 16uL
public const val AT_CLKTCK: CULong = 17uL
public const val AT_SECURE: CULong = 23uL
public const val AT_BASE_PLATFORM: CULong = 24uL
public const val AT_RANDOM: CULong = 25uL
public const val AT_HWCAP2: CULong = 26uL
public const val AT_RSEQ_FEATURE_SIZE: CULong = 27uL
public const val AT_RSEQ_ALIGN: CULong = 28uL
public const val AT_HWCAP3: CULong = 29uL
public const val AT_HWCAP4: CULong = 30uL
public const val AT_EXECFN: CULong = 31uL
public const val AT_MINSIGSTKSZ: CULong = 51uL
public const val SI_DETHREAD: CInt = -7
public const val TRAP_PERF: CInt = 6
public const val XFS_SUPER_MAGIC: CLong = 0x58465342
public const val XFS_SUPER_MAGIC: CUInt = 0x58465342u

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?
public expect fun cPUALLOCSIZE(count: CInt): ULong
public expect fun cPUZERO(cpuset: &mut cpuSetT): ()
public expect fun cPUSET(cpu: ULong, cpuset: &mut cpuSetT): ()
public expect fun cPUCLR(cpu: ULong, cpuset: &mut cpuSetT): ()
public expect fun cPUISSET(cpu: ULong, cpuset: &cpuSetT): Boolean
public expect fun cPUCOUNTS(size: ULong, cpuset: &cpuSetT): CInt
public expect fun cPUCOUNT(cpuset: &cpuSetT): CInt
public expect fun cPUEQUAL(set1: &cpuSetT, set2: &cpuSetT): Boolean
public expect fun nLAALIGN(len: CInt): CInt
public expect fun sOEEOFFENDER(ee: SockExtendedErr?): Sockaddr?

public expect fun setgrent()
public expect fun endgrent()
public expect fun getgrent(): Group?
public expect fun getrlimit64(resource: CInt, rlim: Rlimit64?): CInt
public expect fun setrlimit64(resource: CInt, rlim: Rlimit64?): CInt
public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt
public expect fun setrlimit(resource: CInt, rlim: Rlimit?): CInt
public expect fun prlimit(pid: PidT, resource: CInt, newLimit: Rlimit?, oldLimit: Rlimit?): CInt
public expect fun prlimit64(pid: PidT, resource: CInt, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt
public expect fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt
public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt
public expect fun mlock2(addr: COpaquePointer?, len: ULong, flags: CInt): CInt
public expect fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt
public expect fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt
public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt
public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: CInt): CInt
public expect fun preadv(fd: CInt, iov: Iovec?, count: CInt, offset: OffT): SsizeT
public expect fun pwritev(fd: CInt, iov: Iovec?, count: CInt, offset: OffT): SsizeT
public expect fun processVmReadv(pid: PidT, localIov: Iovec?, localIovCount: CULong, remoteIov: Iovec?, remoteIovCount: CULong, flags: CULong): SsizeT
public expect fun processVmWritev(pid: PidT, localIov: Iovec?, localIovCount: CULong, remoteIov: Iovec?, remoteIovCount: CULong, flags: CULong): SsizeT
public expect fun ptrace(request: CInt, ...): CLong
public expect fun getpriority(which: CInt, who: IdT): CInt
public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt
public expect fun schedCpualloc(count: ULong): CpuSetT?
public expect fun schedCpufree(set: CpuSetT?)
public expect fun schedCpucount(setsize: ULong, set: CpuSetT?): CInt
public expect fun schedGetcpu(): CInt
public expect fun mallinfo(): Mallinfo
public expect fun mallocInfo(options: CInt, stream: FILE?): CInt
public expect fun mallocUsableSize(ptr: COpaquePointer?): ULong
public expect fun utmpname(name: String?): CInt
public expect fun setutent()
public expect fun getutent(): Utmp?
public expect fun seekdir(dirp: DIR?, loc: CLong)
public expect fun telldir(dirp: DIR?): CLong
public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt
public expect fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt
public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt
public expect fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt
public expect fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT
public expect fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT
public expect fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong): SsizeT
public expect fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt
public expect fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt
public expect fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt
public expect fun listxattr(path: String?, list: String?, size: ULong): SsizeT
public expect fun llistxattr(path: String?, list: String?, size: ULong): SsizeT
public expect fun flistxattr(filedes: CInt, list: String?, size: ULong): SsizeT
public expect fun removexattr(path: String?, name: String?): CInt
public expect fun lremovexattr(path: String?, name: String?): CInt
public expect fun fremovexattr(filedes: CInt, name: String?): CInt
public expect fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt
public expect fun timerfdCreate(clock: ClockidT, flags: CInt): CInt
public expect fun timerfdGettime(fd: CInt, currentValue: Itimerspec?): CInt
public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt
public expect fun syscall(num: CLong, ...): CLong
public expect fun schedGetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt
public expect fun schedSetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt
public expect fun epollCreate(size: CInt): CInt
public expect fun epollCreate1(flags: CInt): CInt
public expect fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt
public expect fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt
public expect fun unshare(flags: CInt): CInt
public expect fun umount(target: String?): CInt
public expect fun schedGetPriorityMax(policy: CInt): CInt
public expect fun tee(fdIn: CInt, fdOut: CInt, len: ULong, flags: CUInt): SsizeT
public expect fun settimeofday(tv: Timeval?, tz: Timezone?): CInt
public expect fun splice(fdIn: CInt, offIn: LoffT?, fdOut: CInt, offOut: LoffT?, len: ULong, flags: CUInt): SsizeT
public expect fun eventfd(initval: CUInt, flags: CInt): CInt
public expect fun eventfdRead(fd: CInt, value: EventfdT?): CInt
public expect fun eventfdWrite(fd: CInt, value: EventfdT): CInt
public expect fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt
public expect fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt
public expect fun semGetvalue(sem: SemT?, sval: CInt?): CInt
public expect fun schedSetparam(pid: PidT, param: SchedParam?): CInt
public expect fun setns(fd: CInt, nstype: CInt): CInt
public expect fun swapoff(puath: String?): CInt
public expect fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: ULong, flags: CUInt): SsizeT
public expect fun mount(src: String?, target: String?, fstype: String?, flags: CULong, data: COpaquePointer?): CInt
public expect fun personality(persona: CUInt): CInt
public expect fun prctl(option: CInt, ...): CInt
public expect fun schedGetparam(pid: PidT, param: SchedParam?): CInt
public expect fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt
public expect fun clone(cb: ((COpaquePointer?) -> CInt)?, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, ...): CInt
public expect fun schedGetscheduler(pid: PidT): CInt
public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt
public expect fun sethostname(name: String?, len: ULong): CInt
public expect fun schedGetPriorityMin(policy: CInt): CInt
public expect fun sysinfo(info: Sysinfo?): CInt
public expect fun umount2(target: String?, flags: CInt): CInt
public expect fun swapon(path: String?, swapflags: CInt): CInt
public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt
public expect fun sendfile(outFd: CInt, inFd: CInt, offset: OffT?, count: ULong): SsizeT
public expect fun sendfile64(outFd: CInt, inFd: CInt, offset: Off64T?, count: ULong): SsizeT
public expect fun setfsgid(gid: GidT): CInt
public expect fun setfsuid(uid: UidT): CInt
public expect fun sigsuspend(mask: SigsetT?): CInt
public expect fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt
public expect fun semClose(sem: SemT?): CInt
public expect fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun semOpen(name: String?, oflag: CInt, ...): SemT?
public expect fun getgrnam(name: String?): Group?
public expect fun semUnlink(name: String?): CInt
public expect fun daemon(nochdir: CInt, noclose: CInt): CInt
public expect fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt
public expect fun sigwait(set: SigsetT?, sig: CInt?): CInt
public expect fun getgrgid(gid: GidT): Group?
public expect fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt
public expect fun initgroups(user: String?, group: GidT): CInt
public expect fun popen(command: String?, mode: String?): FILE?
public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt
public expect fun errno(): CInt?
public expect fun inotifyRmWatch(fd: CInt, wd: UInt): CInt
public expect fun inotifyInit(): CInt
public expect fun inotifyInit1(flags: CInt): CInt
public expect fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt
public expect fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt
public expect fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt
public expect fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong
public expect fun regfree(preg: RegexT?)
public expect fun androidSetAbortMessage(msg: String?)
public expect fun gettid(): PidT
public expect fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt
public expect fun getauxval(type: CULong): CULong
public expect fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT
public expect fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt
public expect fun systemPropertySet(name: String?, value: String?): CInt
public expect fun systemPropertyGet(name: String?, value: String?): CInt
public expect fun systemPropertyFind(name: String?): PropInfo?
public expect fun systemPropertyFindNth(n: CUInt): PropInfo?
public expect fun systemPropertyForeach(callback: ((PropInfo?, COpaquePointer?) -> Unit)?, cookie: COpaquePointer?): CInt
public expect fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt
public expect fun arc4random(): UInt
public expect fun arc4randomUniform(upperBound: UInt): UInt
public expect fun arc4randomBuf(buf: COpaquePointer?, n: ULong)
public expect fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer?
public expect fun dirname(path: String?): String?
public expect fun basename(path: String?): String?
public expect fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt
public expect fun sync()
public expect fun syncfs(fd: CInt): CInt
public expect fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer?
public expect fun freadUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong
public expect fun fwriteUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong
public expect fun fflushUnlocked(stream: FILE?): CInt
public expect fun fgetsUnlocked(buf: String?, size: CInt, stream: FILE?): String?
public expect fun klogctl(syslogType: CInt, bufp: String?, len: CInt): CInt
public expect fun memfdCreate(name: String?, flags: CUInt): CInt
public expect fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUInt): CInt
