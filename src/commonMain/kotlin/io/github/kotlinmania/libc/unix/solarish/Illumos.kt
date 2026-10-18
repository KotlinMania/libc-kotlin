// port-lint: source unix/solarish/illumos.rs
package io.github.kotlinmania.libc.unix.solarish
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Timeval

import io.github.kotlinmania.libc.*

public data class Aiocb(
    val aioFildes: Int,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioOffset: Long,
    val aioReqprio: Int,
    val aioSigevent: Sigevent,
    val aioLioOpcode: Int,
    val aioResultp: AioResultT,
    val aioState: Int,
    val aioPad: IntArray,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAmp: COpaquePointer?,
    val shmLkcnt: UShort,
    val shmLpid: Int,
    val shmCpid: Int,
    val shmNattch: ULong,
    val shmCnattch: ULong,
    val shmAtime: Long,
    val shmDtime: Long,
    val shmCtime: Long,
    val shmPad4: LongArray,
)

public data class FilInfo(
    val fiFlags: Int,
    val fiPos: Int,
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
    val utPid: Int,
    val utType: Short,
    val utExit: ExitStatus,
    val utTv: Timeval,
    val utSession: Int,
    val utPad: IntArray,
    val utSyslen: Short,
    val utHost: ByteArray,
)

public const val _UTX_USERSIZE: ULong = 32uL
public const val _UTX_LINESIZE: ULong = 32uL
public const val _UTX_PADSIZE: ULong = 5uL
public const val _UTX_IDSIZE: ULong = 4uL
public const val _UTX_HOSTSIZE: ULong = 257uL
public const val AF_LOCAL: Int = 1
public const val AF_FILE: Int = 1
public const val EFD_SEMAPHORE: Int = 0x1
public const val EFD_NONBLOCK: Int = 0x800
public const val EFD_CLOEXEC: Int = 0x80000
public const val POLLRDHUP: Short = 0x4000
public const val TCP_KEEPIDLE: Int = 34
public const val TCP_KEEPCNT: Int = 35
public const val TCP_KEEPINTVL: Int = 36
public const val TCP_CONGESTION: Int = 37
public const val F_OFD_GETLK: Int = 47
public const val F_OFD_SETLK: Int = 48
public const val F_OFD_SETLKW: Int = 49
public const val F_FLOCK: Int = 53
public const val F_FLOCKW: Int = 54
public const val F_DUPFD_CLOEXEC: Int = 37
public const val F_DUPFD_CLOFORK: Int = 58
public const val F_DUP2FD_CLOEXEC: Int = 36
public const val F_DUP2FD_CLOFORK: Int = 57
public const val F_DUP3FD: Int = 59
public const val FD_CLOFORK: Int = 2
public const val FIL_ATTACH: Int = 0x1
public const val FIL_DETACH: Int = 0x2
public const val FIL_LIST: Int = 0x3
public const val FILNAME_MAX: Int = 32
public const val FILF_PROG: Int = 0x1
public const val FILF_AUTO: Int = 0x2
public const val FILF_BYPASS: Int = 0x4
public const val SOL_FILTER: Int = 0xfffc
public const val MADV_PURGE: Int = 9
public const val POSIX_FADV_NORMAL: Int = 0
public const val POSIX_FADV_RANDOM: Int = 1
public const val POSIX_FADV_SEQUENTIAL: Int = 2
public const val POSIX_FADV_WILLNEED: Int = 3
public const val POSIX_FADV_DONTNEED: Int = 4
public const val POSIX_FADV_NOREUSE: Int = 5
public const val POSIX_SPAWN_SETSID: Short = 0x40
public const val SIGINFO: Int = 41
public const val O_DIRECT: Int = 0x2000000
public const val O_CLOFORK: Int = 0x4000000
public const val MSG_CMSG_CLOEXEC: Int = 0x1000
public const val MSG_CMSG_CLOFORK: Int = 0x2000
public const val PBIND_HARD: Int = -3
public const val PBIND_SOFT: Int = -4
public const val PS_SYSTEM: Int = 1
public const val MAP_FILE: Int = 0
public const val MAP_32BIT: Int = 0x80
public const val AF_NCA: Int = 28
public const val PF_NCA: Int = AF_NCA
public const val LOCK_SH: Int = 1
public const val LOCK_EX: Int = 2
public const val LOCK_NB: Int = 4
public const val LOCK_UN: Int = 8
public const val _PC_LAST: Int = 101
public const val _CS_PATH: Int = 65
public const val VSTATUS: ULong = 16uL
public const val VERASE2: ULong = 17uL
public const val EPOLLIN: Int = 0x1
public const val EPOLLPRI: Int = 0x2
public const val EPOLLOUT: Int = 0x4
public const val EPOLLRDNORM: Int = 0x40
public const val EPOLLRDBAND: Int = 0x80
public const val EPOLLWRNORM: Int = 0x100
public const val EPOLLWRBAND: Int = 0x200
public const val EPOLLMSG: Int = 0x400
public const val EPOLLERR: Int = 0x8
public const val EPOLLHUP: Int = 0x10
public const val EPOLLET: Int = 0x80000000.toInt()
public const val EPOLLRDHUP: Int = 0x2000
public const val EPOLLONESHOT: Int = 0x40000000
public const val EPOLLWAKEUP: Int = 0x20000000
public const val EPOLLEXCLUSIVE: Int = 0x10000000
public const val EPOLL_CLOEXEC: Int = 0x80000
public const val EPOLL_CTL_ADD: Int = 1
public const val EPOLL_CTL_MOD: Int = 3
public const val EPOLL_CTL_DEL: Int = 2
public val PRIV_USER: UInt = PRIV_DEBUG or NET_MAC_AWARE or NET_MAC_AWARE_INHERIT or PRIV_XPOLICY or PRIV_AWARE_RESET or PRIV_PFEXEC
public const val LGRP_RSRC_COUNT: Int = 2
public const val LGRP_RSRC_CPU: Int = 0
public const val LGRP_RSRC_MEM: Int = 1
public const val LGRP_RSRC_TYPES: Int = 2
public const val P_DISABLED: Int = 0x008
public const val AT_SUN_HWCAP2: UInt = 2023u
public const val AT_SUN_FPTYPE: UInt = 2027u
public const val B1000000: UInt = 24u
public const val B1152000: UInt = 25u
public const val B1500000: UInt = 26u
public const val B2000000: UInt = 27u
public const val B2500000: UInt = 28u
public const val B3000000: UInt = 29u
public const val B3500000: UInt = 30u
public const val B4000000: UInt = 31u
public const val SI_ADDRESS_WIDTH: Int = 520
public const val TFD_CLOEXEC: Int = 524288
public const val TFD_NONBLOCK: Int = 2048
public val TFD_TIMER_ABSTIME: Int = 1 shl 0
public val TFD_TIMER_CANCEL_ON_SET: Int = 1 shl 1

public expect fun eventfd(initval: UInt, flags: Int): Int

public expect fun epollPwait(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Int, sigmask: SigsetT?): Int

public expect fun epollCreate(size: Int): Int

public expect fun epollCreate1(flags: Int): Int

public expect fun epollWait(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Int): Int

public expect fun epollCtl(epfd: Int, op: Int, fd: Int, event: EpollEvent?): Int

public expect fun mincore(addr: String?, len: ULong, vec: String?): Int

public expect fun psetBindLwp(pset: Int, id: Int, pid: Int, opset: Int?): Int

public expect fun psetGetloadavg(pset: Int, load: Double?, num: Int): Int

public expect fun pthreadAttrGetNp(thread: UInt, attr: PthreadAttrT?): Int

public expect fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): Int

public expect fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong): Int

public expect fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): Int

public expect fun posixFadvise(fd: Int, offset: Long, len: Long, advice: Int): Int

public expect fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long

public expect fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long

public expect fun getpagesizes2(pagesize: ULong?, nelem: Int): Int

public expect fun posixSpawnFileActionsAddfchdirNp(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int

public expect fun ptsnameR(fildes: Int, name: String?, namelen: ULong): Int

public expect fun syncfs(fd: Int): Int

public expect fun strcasecmpL(s1: String?, s2: String?, loc: io.github.kotlinmania.libc.COpaquePointer?): Int

public expect fun strncasecmpL(s1: String?, s2: String?, n: ULong, loc: io.github.kotlinmania.libc.COpaquePointer?): Int

public expect fun timerfdCreate(clockid: Int, flags: Int): Int

public expect fun timerfdGettime(fd: Int, currValue: Itimerspec?): Int

public expect fun timerfdSettime(fd: Int, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int
