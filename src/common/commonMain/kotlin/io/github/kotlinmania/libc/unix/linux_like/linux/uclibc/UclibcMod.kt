package io.github.kotlinmania.libc.unix.linux_like.linux.uclibc

import Off64T

public typealias ShmattT = CUlong

public typealias MsgqnumT = CUlong

public typealias MsglenT = CUlong

public typealias RegoffT = CInt

public typealias RlimT = CUlong

public typealias RlimitResourceT = CUlong

public typealias PriorityWhichT = CUint

public fun SiginfoT.siAddr(): COpaquePointer? {
    open class SiginfoSigfault(
        public var siSigno: CInt,
        public var siErrno: CInt,
        public var siCode: CInt,
        public var siAddr: COpaquePointer?,
    )
    return (((this as SiginfoT?) as SiginfoSigfault?)).siAddr
}

public fun SiginfoT.siValue(): Sigval {
    open class SiginfoSiValue(
        public var siSigno: CInt,
        public var siErrno: CInt,
        public var siCode: CInt,
        public var siTimerid: CInt,
        public var siOverrun: CInt,
        public var siValue: Sigval,
    )
    return (((this as SiginfoT?) as SiginfoSiValue?)).siValue
}

public fun SiginfoT.sifields(): Sifields {
    return (((this as SiginfoT?) as SiginfoF?)).sifields
}

public fun SiginfoT.siPid(): PidT {
    return this.sifields().sigchld.siPid
}

public fun SiginfoT.siUid(): UidT {
    return this.sifields().sigchld.siUid
}

public fun SiginfoT.siStatus(): CInt {
    return this.sifields().sigchld.siStatus
}

public fun SiginfoT.siUtime(): CLong {
    return this.sifields().sigchld.siUtime
}

public fun SiginfoT.siStime(): CLong {
    return this.sifields().sigchld.siStime
}

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val MCL_ONFAULT: CInt = 0x0004

public val SIGEV_THREAD_ID: CInt = 4

public val AF_VSOCK: CInt = 40

// Most `* _SUPER_MAGIC` constants are defined at the `linuxLike` level; the
// following are only available on newer Linux versions than the versions
// currently used in CI in some configurations, so we define them here.
public val BINDERFS_SUPER_MAGIC: CLong = 0x6c6f6f70L

public val XFS_SUPER_MAGIC: CLong = 0x58465342L

public val PTRACE_TRACEME: CInt = 0

public val PTRACE_PEEKTEXT: CInt = 1

public val PTRACE_PEEKDATA: CInt = 2

public val PTRACE_PEEKUSER: CInt = 3

public val PTRACE_POKETEXT: CInt = 4

public val PTRACE_POKEDATA: CInt = 5

public val PTRACE_POKEUSER: CInt = 6

public val PTRACE_CONT: CInt = 7

public val PTRACE_KILL: CInt = 8

public val PTRACE_SINGLESTEP: CInt = 9

public val PTRACE_GETREGS: CInt = 12

public val PTRACE_SETREGS: CInt = 13

public val PTRACE_GETFPREGS: CInt = 14

public val PTRACE_SETFPREGS: CInt = 15

public val PTRACE_ATTACH: CInt = 16

public val PTRACE_DETACH: CInt = 17

public val PTRACE_GETFPXREGS: CInt = 18

public val PTRACE_SETFPXREGS: CInt = 19

public val PTRACE_SYSCALL: CInt = 24

public val PTRACE_SETOPTIONS: CInt = 0x4200

public val PTRACE_GETEVENTMSG: CInt = 0x4201

public val PTRACE_GETSIGINFO: CInt = 0x4202

public val PTRACE_SETSIGINFO: CInt = 0x4203

public val PTRACE_GETREGSET: CInt = 0x4204

public val PTRACE_SETREGSET: CInt = 0x4205

public val PTRACE_SEIZE: CInt = 0x4206

public val PTRACE_INTERRUPT: CInt = 0x4207

public val PTRACE_LISTEN: CInt = 0x4208

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

// These are different than GNU!
public val LC_CTYPE: CInt = 0

public val LC_NUMERIC: CInt = 1

public val LC_TIME: CInt = 3

public val LC_COLLATE: CInt = 4

public val LC_MONETARY: CInt = 2

public val LC_MESSAGES: CInt = 5

public val LC_ALL: CInt = 6

// end different section
// MS_ flags for mount(2)
public val MS_RMT_MASK: CUlong = MS_RDONLY or MS_SYNCHRONOUS or MS_MANDLOCK or MS_I_VERSION

public val ENOTSUP: CInt = EOPNOTSUPP

public val IPV6_JOIN_GROUP: CInt = 20

public val IPV6_LEAVE_GROUP: CInt = 21

// These are different from GNU
public val ABDAY_1: NlItem = 0x300

public val ABDAY_2: NlItem = 0x301

public val ABDAY_3: NlItem = 0x302

public val ABDAY_4: NlItem = 0x303

public val ABDAY_5: NlItem = 0x304

public val ABDAY_6: NlItem = 0x305

public val ABDAY_7: NlItem = 0x306

public val DAY_1: NlItem = 0x307

public val DAY_2: NlItem = 0x308

public val DAY_3: NlItem = 0x309

public val DAY_4: NlItem = 0x30A

public val DAY_5: NlItem = 0x30B

public val DAY_6: NlItem = 0x30C

public val DAY_7: NlItem = 0x30D

public val ABMON_1: NlItem = 0x30E

public val ABMON_2: NlItem = 0x30F

public val ABMON_3: NlItem = 0x310

public val ABMON_4: NlItem = 0x311

public val ABMON_5: NlItem = 0x312

public val ABMON_6: NlItem = 0x313

public val ABMON_7: NlItem = 0x314

public val ABMON_8: NlItem = 0x315

public val ABMON_9: NlItem = 0x316

public val ABMON_10: NlItem = 0x317

public val ABMON_11: NlItem = 0x318

public val ABMON_12: NlItem = 0x319

public val MON_1: NlItem = 0x31A

public val MON_2: NlItem = 0x31B

public val MON_3: NlItem = 0x31C

public val MON_4: NlItem = 0x31D

public val MON_5: NlItem = 0x31E

public val MON_6: NlItem = 0x31F

public val MON_7: NlItem = 0x320

public val MON_8: NlItem = 0x321

public val MON_9: NlItem = 0x322

public val MON_10: NlItem = 0x323

public val MON_11: NlItem = 0x324

public val MON_12: NlItem = 0x325

public val AM_STR: NlItem = 0x326

public val PM_STR: NlItem = 0x327

public val D_T_FMT: NlItem = 0x328

public val D_FMT: NlItem = 0x329

public val T_FMT: NlItem = 0x32A

public val T_FMT_AMPM: NlItem = 0x32B

public val ERA: NlItem = 0x32C

public val ERA_D_FMT: NlItem = 0x32E

public val ALT_DIGITS: NlItem = 0x32F

public val ERA_D_T_FMT: NlItem = 0x330

public val ERA_T_FMT: NlItem = 0x331

public val CODESET: NlItem = 10

public val CRNCYSTR: NlItem = 0x215

public val RADIXCHAR: NlItem = 0x100

public val THOUSEP: NlItem = 0x101

public val NOEXPR: NlItem = 0x501

public val YESSTR: NlItem = 0x502

public val NOSTR: NlItem = 0x503

// Different than Gnu.
public val FILENAME_MAX: CUint = 4095u

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val SOMAXCONN: CInt = 128

public val ST_RELATIME: CUlong = 4096uL

public val AF_NFC: CInt = PF_NFC

public val BUFSIZ: CInt = 4096

public val EDEADLOCK: CInt = EDEADLK

public val EXTA: CUint = B19200

public val EXTB: CUint = B38400

public val EXTPROC: TcflagT = 65536

public val FOPEN_MAX: CInt = 16

public val F_GETOWN: CInt = 9

public val F_OFD_GETLK: CInt = 36

public val F_OFD_SETLK: CInt = 37

public val F_OFD_SETLKW: CInt = 38

public val F_RDLCK: CInt = 0

public val F_SETOWN: CInt = 8

public val F_UNLCK: CInt = 2

public val F_WRLCK: CInt = 1

public val IPV6_MULTICAST_ALL: CInt = 29

public val IPV6_ROUTER_ALERT_ISOLATE: CInt = 30

public val MAP_HUGE_SHIFT: CInt = 26

public val MAP_HUGE_MASK: CInt = 0x3f

public val MAP_HUGE_64KB: CInt = 16 shl MAP_HUGE_SHIFT

public val MAP_HUGE_512KB: CInt = 19 shl MAP_HUGE_SHIFT

public val MAP_HUGE_1MB: CInt = 20 shl MAP_HUGE_SHIFT

public val MAP_HUGE_2MB: CInt = 21 shl MAP_HUGE_SHIFT

public val MAP_HUGE_8MB: CInt = 23 shl MAP_HUGE_SHIFT

public val MAP_HUGE_16MB: CInt = 24 shl MAP_HUGE_SHIFT

public val MAP_HUGE_32MB: CInt = 25 shl MAP_HUGE_SHIFT

public val MAP_HUGE_256MB: CInt = 28 shl MAP_HUGE_SHIFT

public val MAP_HUGE_512MB: CInt = 29 shl MAP_HUGE_SHIFT

public val MAP_HUGE_1GB: CInt = 30 shl MAP_HUGE_SHIFT

public val MAP_HUGE_2GB: CInt = 31 shl MAP_HUGE_SHIFT

public val MAP_HUGE_16GB: CInt = 34 shl MAP_HUGE_SHIFT

public val MINSIGSTKSZ: CInt = 2048

public val MSG_COPY: CInt = 16384

public val NI_MAXHOST: SocklenT = 1025u

public val O_TMPFILE: CInt = 4194304 or O_DIRECTORY

public val PACKET_MR_UNICAST: CInt = 3

public val PF_NFC: CInt = 39

public val PF_VSOCK: CInt = 40

public val PTRACE_EVENT_STOP: CInt = 128

public val PTRACE_GETSIGMASK: CUint = 0x420au

public val PTRACE_PEEKSIGINFO: CInt = 0x4209

public val PTRACE_SETSIGMASK: CUint = 0x420bu

public val RTLD_NOLOAD: CInt = 0x00004

public val RUSAGE_THREAD: CInt = 1

public val SHM_EXEC: CInt = 32768

public val SIGPOLL: CInt = SIGIO

public val SOCK_DCCP: CInt = 6

public val SOCK_PACKET: CInt = 10

public val TCP_COOKIE_TRANSACTIONS: CInt = 15

public val UDP_GRO: CInt = 104

public val UDP_SEGMENT: CInt = 103

public val YESEXPR: CInt = ((5) shl 8) or (0)

public fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, value: CInt?): CInt {
    val __slot_1 = if (value == null) 0L else LibcDynamicFfi.allocScalarSlot(value.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_rwlockattr_getkind_np", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, value: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlockattr_setkind_np", -1, longArrayOf(attr?.value ?: 0L, value.toLong())).toInt()
}

public fun ptrace(request: CUint, vararg variadicArgs: Long): CLong {
    return LibcDynamicFfi.invoke("ptrace", 1, longArrayOf(request.toLong()) + variadicArgs)
}

public fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("sendmmsg", -1, longArrayOf(sockfd.toLong(), msgvec?.value ?: 0L, vlen.toLong(), flags.toLong())).toInt()
}

public fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("recvmmsg", -1, longArrayOf(sockfd.toLong(), msgvec?.value ?: 0L, vlen.toLong(), flags.toLong(), timeout?.value ?: 0L)).toInt()
}

public fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt {
    val __slot_0 = if (amaster == null) 0L else LibcDynamicFfi.allocScalarSlot(amaster.toLong())
    val __slot_1 = if (aslave == null) 0L else LibcDynamicFfi.allocScalarSlot(aslave.toLong())
    try {
        return LibcDynamicFfi.invoke("openpty", -1, longArrayOf(__slot_0, __slot_1, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT {
    val __slot_0 = if (amaster == null) 0L else LibcDynamicFfi.allocScalarSlot(amaster.toLong())
    try {
        return LibcDynamicFfi.invoke("forkpty", -1, longArrayOf(__slot_0, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getnameinfo", -1, longArrayOf(sa?.value ?: 0L, salen.toLong(), host?.value ?: 0L, hostlen.toLong(), serv?.value ?: 0L, servlen.toLong(), flags.toLong())).toInt()
}

public fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT {
    return LibcDynamicFfi.invoke("pwritev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT {
    return LibcDynamicFfi.invoke("preadv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun sethostid(hostid: CLong): CInt {
    return LibcDynamicFfi.invoke("sethostid", -1, longArrayOf(hostid)).toInt()
}

public fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt {
    val __cstr_4 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("fanotify_mark", -1, longArrayOf(fd.toLong(), flags.toLong(), mask.toLong(), dirfd.toLong(), __cstr_4)).toInt()
    } finally {
        if (__cstr_4 != 0L) LibcDynamicFfi.freeMem(__cstr_4)
    }
}

public fun getrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt {
    return LibcDynamicFfi.invoke("getrlimit64", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt {
    return LibcDynamicFfi.invoke("setrlimit64", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun getrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("getrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("setrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun getpriority(which: PriorityWhichT, who: IdT): CInt {
    return LibcDynamicFfi.invoke("getpriority", -1, longArrayOf(which.toLong(), who.toLong())).toInt()
}

public fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt {
    return LibcDynamicFfi.invoke("setpriority", -1, longArrayOf(which.toLong(), who.toLong(), prio.toLong())).toInt()
}

public fun getauxval(type: CUlong): CUlong {
    return LibcDynamicFfi.invoke("getauxval", -1, longArrayOf(type.toLong())).toULong()
}
