// port-lint: source unix/solarish/illumos.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.NET_MAC_AWARE
import io.github.kotlinmania.libc.NET_MAC_AWARE_INHERIT
import io.github.kotlinmania.libc.PRIV_AWARE_RESET
import io.github.kotlinmania.libc.PRIV_DEBUG
import io.github.kotlinmania.libc.PRIV_PFEXEC
import io.github.kotlinmania.libc.PRIV_XPOLICY
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timeval

public typealias LgrpRsrcT = CInt

public typealias LgrpAffinityT = CInt

public open class Aiocb(
    public var aioFildes: CInt,
    public var aioBuf: COpaquePointer?,
    public var aioNbytes: SizeT,
    public var aioOffset: OffT,
    public var aioReqprio: CInt,
    public var aioSigevent: Sigevent,
    public var aioLioOpcode: CInt,
    public var aioResultp: AioResultT,
    public var aioState: CInt,
    public var aioPad: List<CInt>,
)

public open class ShmidDs(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmAmp: COpaquePointer?,
    public var shmLkcnt: CUshort,
    public var shmLpid: PidT,
    public var shmCpid: PidT,
    public var shmNattch: ShmattT,
    public var shmCnattch: CUlong,
    public var shmAtime: TimeT,
    public var shmDtime: TimeT,
    public var shmCtime: TimeT,
    public var shmPad4: List<Long>,
)

public open class FilInfo(
    public var fiFlags: CInt,
    public var fiPos: CInt,
    public var fiName: List<CChar>,
)

public open class EpollEvent(public var events: UInt, public var u64: ULong)

public open class Utmpx(
    public var utUser: List<CChar>,
    public var utId: List<CChar>,
    public var utLine: List<CChar>,
    public var utPid: PidT,
    public var utType: CShort,
    public var utExit: ExitStatus,
    public var utTv: Timeval,
    public var utSession: CInt,
    public var utPad: List<CInt>,
    public var utSyslen: CShort,
    public var utHost: List<CChar>,
)

public val UTX_USERSIZE: Int = 32

public val UTX_LINESIZE: Int = 32

public val UTX_PADSIZE: Int = 5

public val UTX_IDSIZE: Int = 4

public val UTX_HOSTSIZE: Int = 257

public val AF_LOCAL: CInt = 1

// AF_UNIX
public val AF_FILE: CInt = 1

// AF_UNIX
public val EFD_SEMAPHORE: CInt = 0x1

public val EFD_NONBLOCK: CInt = 0x800

public val EFD_CLOEXEC: CInt = 0x80000

public val POLLRDHUP: CShort = 0x4000

public val TCP_KEEPIDLE: CInt = 34

public val TCP_KEEPCNT: CInt = 35

public val TCP_KEEPINTVL: CInt = 36

public val TCP_CONGESTION: CInt = 37

// These constants are correct for 64-bit programs or 32-bit programs that are
// not using large-file mode.  If Rust ever supports anything other than 64-bit
// compilation on illumos, this may require adjustment:
public val F_OFD_GETLK: CInt = 47

public val F_OFD_SETLK: CInt = 48

public val F_OFD_SETLKW: CInt = 49

public val F_FLOCK: CInt = 53

public val F_FLOCKW: CInt = 54

public val F_DUPFD_CLOEXEC: CInt = 37

public val F_DUPFD_CLOFORK: CInt = 58

public val F_DUP2FD_CLOEXEC: CInt = 36

public val F_DUP2FD_CLOFORK: CInt = 57

public val F_DUP3FD: CInt = 59

public val FD_CLOFORK: CInt = 2

public val FIL_ATTACH: CInt = 0x1

public val FIL_DETACH: CInt = 0x2

public val FIL_LIST: CInt = 0x3

public val FILNAME_MAX: CInt = 32

public val FILF_PROG: CInt = 0x1

public val FILF_AUTO: CInt = 0x2

public val FILF_BYPASS: CInt = 0x4

public val SOL_FILTER: CInt = 0xfffc

public val MADV_PURGE: CInt = 9

public val POSIX_FADV_NORMAL: CInt = 0

public val POSIX_FADV_RANDOM: CInt = 1

public val POSIX_FADV_SEQUENTIAL: CInt = 2

public val POSIX_FADV_WILLNEED: CInt = 3

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val POSIX_SPAWN_SETSID: CShort = 0x40

public val SIGINFO: CInt = 41

public val O_DIRECT: CInt = 0x2000000

public val O_CLOFORK: CInt = 0x4000000

public val MSG_CMSG_CLOEXEC: CInt = 0x1000

public val MSG_CMSG_CLOFORK: CInt = 0x2000

public val PBIND_HARD: ProcessoridT = -3

public val PBIND_SOFT: ProcessoridT = -4

public val PS_SYSTEM: CInt = 1

public val MAP_FILE: CInt = 0

public val MAP_32BIT: CInt = 0x80

public val AF_NCA: CInt = 28

public val PF_NCA: CInt = AF_NCA

public val LOCK_SH: CInt = 1

public val LOCK_EX: CInt = 2

public val LOCK_NB: CInt = 4

public val LOCK_UN: CInt = 8

public val PC_LAST: CInt = 101

public val CS_PATH: CInt = 65

public val VSTATUS: Int = 16

public val VERASE2: Int = 17

public val EPOLLIN: CInt = 0x1

public val EPOLLPRI: CInt = 0x2

public val EPOLLOUT: CInt = 0x4

public val EPOLLRDNORM: CInt = 0x40

public val EPOLLRDBAND: CInt = 0x80

public val EPOLLWRNORM: CInt = 0x100

public val EPOLLWRBAND: CInt = 0x200

public val EPOLLMSG: CInt = 0x400

public val EPOLLERR: CInt = 0x8

public val EPOLLHUP: CInt = 0x10

public val EPOLLET: CInt = 0x80000000

public val EPOLLRDHUP: CInt = 0x2000

public val EPOLLONESHOT: CInt = 0x40000000

public val EPOLLWAKEUP: CInt = 0x20000000

public val EPOLLEXCLUSIVE: CInt = 0x10000000

public val EPOLL_CLOEXEC: CInt = 0x80000

public val EPOLL_CTL_ADD: CInt = 1

public val EPOLL_CTL_MOD: CInt = 3

public val EPOLL_CTL_DEL: CInt = 2

public val PRIV_USER: CUint = PRIV_DEBUG or NET_MAC_AWARE or NET_MAC_AWARE_INHERIT or PRIV_XPOLICY or PRIV_AWARE_RESET or PRIV_PFEXEC

public val LGRP_RSRC_COUNT: LgrpRsrcT = 2

public val LGRP_RSRC_CPU: LgrpRsrcT = 0

public val LGRP_RSRC_MEM: LgrpRsrcT = 1

public val P_DISABLED: CInt = 0x008

public val AT_SUN_HWCAP2: CUint = 2023u

public val AT_SUN_FPTYPE: CUint = 2027u

public val B1000000: SpeedT = 24u

public val B1152000: SpeedT = 25u

public val B1500000: SpeedT = 26u

public val B2000000: SpeedT = 27u

public val B2500000: SpeedT = 28u

public val B3000000: SpeedT = 29u

public val B3500000: SpeedT = 30u

public val B4000000: SpeedT = 31u

// sys/systeminfo.h
public val SI_ADDRESS_WIDTH: CInt = 520

// sys/timerfd.h
public val TFD_CLOEXEC: Int = 524288

public val TFD_NONBLOCK: Int = 2048

public val TFD_TIMER_ABSTIME: Int = 1 shl 0

public val TFD_TIMER_CANCEL_ON_SET: Int = 1 shl 1

public fun eventfd(initval: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("eventfd", -1, longArrayOf(initval.toLong(), flags.toLong())).toInt()
}

public fun epollPwait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt, sigmask: SigsetT?): CInt {
    val __slot_4 = if (sigmask == null) 0L else LibcDynamicFfi.allocScalarSlot(sigmask.toLong())
    try {
        return LibcDynamicFfi.invoke("epoll_pwait", -1, longArrayOf(epfd.toLong(), events?.value ?: 0L, maxevents.toLong(), timeout.toLong(), __slot_4)).toInt()
    } finally {
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun epollCreate(size: CInt): CInt {
    return LibcDynamicFfi.invoke("epoll_create", -1, longArrayOf(size.toLong())).toInt()
}

public fun epollCreate1(flags: CInt): CInt {
    return LibcDynamicFfi.invoke("epoll_create1", -1, longArrayOf(flags.toLong())).toInt()
}

public fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt {
    return LibcDynamicFfi.invoke("epoll_wait", -1, longArrayOf(epfd.toLong(), events?.value ?: 0L, maxevents.toLong(), timeout.toLong())).toInt()
}

public fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt {
    return LibcDynamicFfi.invoke("epoll_ctl", -1, longArrayOf(epfd.toLong(), op.toLong(), fd.toLong(), event?.value ?: 0L)).toInt()
}

public fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("mincore", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), vec?.value ?: 0L)).toInt()
}

public fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: PsetidT?): CInt {
    val __slot_3 = if (opset == null) 0L else LibcDynamicFfi.allocScalarSlot(opset.toLong())
    try {
        return LibcDynamicFfi.invoke("pset_bind_lwp", -1, longArrayOf(pset.toLong(), id.toLong(), pid.toLong(), __slot_3)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun psetGetloadavg(pset: PsetidT, load: CDouble?, num: CInt): CInt {
    val __slot_1 = if (load == null) 0L else LibcDynamicFfi.allocScalarSlot(load.toRawBits())
    try {
        return LibcDynamicFfi.invoke("pset_getloadavg", -1, longArrayOf(pset.toLong(), __slot_1, num.toLong())).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAttrGetNp(thread: PthreadT, attr: PthreadAttrT?): CInt {
    val __slot_1 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_get_np", -1, longArrayOf(thread.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getstackaddr", -1, longArrayOf(__slot_0, stackaddr?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_setstack", -1, longArrayOf(__slot_0, stackaddr?.value ?: 0L, stacksize.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_setstackaddr", -1, longArrayOf(__slot_0, stackaddr?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_fadvise", -1, longArrayOf(fd.toLong(), offset, len, advice.toLong())).toInt()
}

public fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("preadv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("pwritev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun getpagesizes2(pagesize: SizeT?, nelem: CInt): CInt {
    val __slot_0 = if (pagesize == null) 0L else LibcDynamicFfi.allocScalarSlot(pagesize.toLong())
    try {
        return LibcDynamicFfi.invoke("getpagesizes2", -1, longArrayOf(__slot_0, nelem.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun posixSpawnFileActionsAddfchdirNp(fileActions: PosixSpawnFileActionsT?, fd: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addfchdir_np", -1, longArrayOf(fileActions?.value ?: 0L, fd.toLong())).toInt()
}

public fun ptsnameR(fildes: CInt, name: COpaquePointer?, namelen: SizeT): CInt {
    return LibcDynamicFfi.invoke("ptsname_r", -1, longArrayOf(fildes.toLong(), name?.value ?: 0L, namelen.toLong())).toInt()
}

public fun syncfs(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("syncfs", -1, longArrayOf(fd.toLong())).toInt()
}

public fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt {
    val __cstr_0 = if (s1 == null) 0L else LibcDynamicFfi.allocUtf8CString(s1)
    val __cstr_1 = if (s2 == null) 0L else LibcDynamicFfi.allocUtf8CString(s2)
    try {
        return LibcDynamicFfi.invoke("strcasecmp_l", -1, longArrayOf(__cstr_0, __cstr_1, loc.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt {
    val __cstr_0 = if (s1 == null) 0L else LibcDynamicFfi.allocUtf8CString(s1)
    val __cstr_1 = if (s2 == null) 0L else LibcDynamicFfi.allocUtf8CString(s2)
    try {
        return LibcDynamicFfi.invoke("strncasecmp_l", -1, longArrayOf(__cstr_0, __cstr_1, n.toLong(), loc.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun timerfdCreate(clockid: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("timerfd_create", -1, longArrayOf(clockid.toLong(), flags.toLong())).toInt()
}

public fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timerfd_gettime", -1, longArrayOf(fd.toLong(), currValue?.value ?: 0L)).toInt()
}

public fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timerfd_settime", -1, longArrayOf(fd.toLong(), flags.toLong(), newValue?.value ?: 0L, oldValue?.value ?: 0L)).toInt()
}
