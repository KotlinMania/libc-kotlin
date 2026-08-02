// port-lint: source unix/solarish/illumos.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public typealias LgrpRsrcT = CInt
public typealias LgrpAffinityT = CInt

public data class Aiocb(
    val aioFildes: CInt,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioOffset: OffT,
    val aioReqprio: CInt,
    val aioSigevent: Sigevent,
    val aioLioOpcode: CInt,
    val aioResultp: AioResultT,
    val aioState: CInt,
    val aioPad: IntArray,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAmp: COpaquePointer?,
    val shmLkcnt: CUShort,
    val shmLpid: PidT,
    val shmCpid: PidT,
    val shmNattch: ShmattT,
    val shmCnattch: CULong,
    val shmAtime: TimeT,
    val shmDtime: TimeT,
    val shmCtime: TimeT,
    val shmPad4: LongArray,
)

public data class FilInfo(
    val fiFlags: CInt,
    val fiPos: CInt,
    val fiName: ByteArray,
)

public data class EpollEvent(
    val events: UInt,
    val u64: ULong,
)

public data class Utmpx(
    val utUser: ByteArray,
    val utId: ByteArray,
    val utLine: ByteArray,
    val utPid: PidT,
    val utType: CShort,
    val utExit: ExitStatus,
    val utTv: Timeval,
    val utSession: CInt,
    val utPad: IntArray,
    val utSyslen: CShort,
    val utHost: ByteArray,
)

public const val _UTX_USERSIZE: ULong = 32uL
public const val _UTX_LINESIZE: ULong = 32uL
public const val _UTX_PADSIZE: ULong = 5uL
public const val _UTX_IDSIZE: ULong = 4uL
public const val _UTX_HOSTSIZE: ULong = 257uL
public const val AF_LOCAL: CInt = 1
public const val AF_FILE: CInt = 1
public const val EFD_SEMAPHORE: CInt = 0x1
public const val EFD_NONBLOCK: CInt = 0x800
public const val EFD_CLOEXEC: CInt = 0x80000
public const val POLLRDHUP: CShort = 0x4000
public const val TCP_KEEPIDLE: CInt = 34
public const val TCP_KEEPCNT: CInt = 35
public const val TCP_KEEPINTVL: CInt = 36
public const val TCP_CONGESTION: CInt = 37
public const val F_OFD_GETLK: CInt = 47
public const val F_OFD_SETLK: CInt = 48
public const val F_OFD_SETLKW: CInt = 49
public const val F_FLOCK: CInt = 53
public const val F_FLOCKW: CInt = 54
public const val F_DUPFD_CLOEXEC: CInt = 37
public const val F_DUPFD_CLOFORK: CInt = 58
public const val F_DUP2FD_CLOEXEC: CInt = 36
public const val F_DUP2FD_CLOFORK: CInt = 57
public const val F_DUP3FD: CInt = 59
public const val FD_CLOFORK: CInt = 2
public const val FIL_ATTACH: CInt = 0x1
public const val FIL_DETACH: CInt = 0x2
public const val FIL_LIST: CInt = 0x3
public const val FILNAME_MAX: CInt = 32
public const val FILF_PROG: CInt = 0x1
public const val FILF_AUTO: CInt = 0x2
public const val FILF_BYPASS: CInt = 0x4
public const val SOL_FILTER: CInt = 0xfffc
public const val MADV_PURGE: CInt = 9
public const val POSIX_FADV_NORMAL: CInt = 0
public const val POSIX_FADV_RANDOM: CInt = 1
public const val POSIX_FADV_SEQUENTIAL: CInt = 2
public const val POSIX_FADV_WILLNEED: CInt = 3
public const val POSIX_FADV_DONTNEED: CInt = 4
public const val POSIX_FADV_NOREUSE: CInt = 5
public const val POSIX_SPAWN_SETSID: CShort = 0x40
public const val SIGINFO: CInt = 41
public const val O_DIRECT: CInt = 0x2000000
public const val O_CLOFORK: CInt = 0x4000000
public const val MSG_CMSG_CLOEXEC: CInt = 0x1000
public const val MSG_CMSG_CLOFORK: CInt = 0x2000
public const val PBIND_HARD: ProcessoridT = -3
public const val PBIND_SOFT: ProcessoridT = -4
public const val PS_SYSTEM: CInt = 1
public const val MAP_FILE: CInt = 0
public const val MAP_32BIT: CInt = 0x80
public const val AF_NCA: CInt = 28
public const val PF_NCA: CInt = AF_NCA
public const val LOCK_SH: CInt = 1
public const val LOCK_EX: CInt = 2
public const val LOCK_NB: CInt = 4
public const val LOCK_UN: CInt = 8
public const val _PC_LAST: CInt = 101
public const val _CS_PATH: CInt = 65
public const val VSTATUS: ULong = 16uL
public const val VERASE2: ULong = 17uL
public const val EPOLLIN: CInt = 0x1
public const val EPOLLPRI: CInt = 0x2
public const val EPOLLOUT: CInt = 0x4
public const val EPOLLRDNORM: CInt = 0x40
public const val EPOLLRDBAND: CInt = 0x80
public const val EPOLLWRNORM: CInt = 0x100
public const val EPOLLWRBAND: CInt = 0x200
public const val EPOLLMSG: CInt = 0x400
public const val EPOLLERR: CInt = 0x8
public const val EPOLLHUP: CInt = 0x10
public const val EPOLLET: CInt = -2147483648
public const val EPOLLRDHUP: CInt = 0x2000
public const val EPOLLONESHOT: CInt = 0x40000000
public const val EPOLLWAKEUP: CInt = 0x20000000
public const val EPOLLEXCLUSIVE: CInt = 0x10000000
public const val EPOLL_CLOEXEC: CInt = 0x80000
public const val EPOLL_CTL_ADD: CInt = 1
public const val EPOLL_CTL_MOD: CInt = 3
public const val EPOLL_CTL_DEL: CInt = 2
public val PRIV_USER: CUInt = PRIV_DEBUG or NET_MAC_AWARE or NET_MAC_AWARE_INHERIT or PRIV_XPOLICY or PRIV_AWARE_RESET or PRIV_PFEXEC
public const val LGRP_RSRC_COUNT: LgrpRsrcT = 2
public const val LGRP_RSRC_CPU: LgrpRsrcT = 0
public const val LGRP_RSRC_MEM: LgrpRsrcT = 1
public const val LGRP_RSRC_TYPES: LgrpRsrcT = 2
public const val P_DISABLED: CInt = 0x008
public const val AT_SUN_HWCAP2: CUInt = 2023u
public const val AT_SUN_FPTYPE: CUInt = 2027u
public const val B1000000: SpeedT = 24u
public const val B1152000: SpeedT = 25u
public const val B1500000: SpeedT = 26u
public const val B2000000: SpeedT = 27u
public const val B2500000: SpeedT = 28u
public const val B3000000: SpeedT = 29u
public const val B3500000: SpeedT = 30u
public const val B4000000: SpeedT = 31u
public const val SI_ADDRESS_WIDTH: CInt = 520
public const val TFD_CLOEXEC: Int = 524288
public const val TFD_NONBLOCK: Int = 2048
public val TFD_TIMER_ABSTIME: Int = 1 shl 0
public val TFD_TIMER_CANCEL_ON_SET: Int = 1 shl 1

public expect fun eventfd(initval: CUInt, flags: CInt): CInt

public expect fun epollPwait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt, sigmask: SigsetT?): CInt

public expect fun epollCreate(size: CInt): CInt

public expect fun epollCreate1(flags: CInt): CInt

public expect fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt

public expect fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt

public expect fun mincore(addr: CaddrT, len: ULong, vec: String?): CInt

public expect fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: PsetidT?): CInt

public expect fun psetGetloadavg(pset: PsetidT, load: CDouble?, num: CInt): CInt

public expect fun pthreadAttrGetNp(thread: PthreadT, attr: PthreadAttrT?): CInt

public expect fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt

public expect fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong): CInt

public expect fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt

public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun getpagesizes2(pagesize: ULong?, nelem: CInt): CInt

public expect fun posixSpawnFileActionsAddfchdirNp(fileActions: PosixSpawnFileActionsT, fd: CInt): CInt

public expect fun ptsnameR(fildes: CInt, name: String?, namelen: ULong): CInt

public expect fun syncfs(fd: CInt): CInt

public expect fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt

public expect fun strncasecmpL(s1: String?, s2: String?, n: ULong, loc: LocaleT): CInt

public expect fun timerfdCreate(clockid: CInt, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt
