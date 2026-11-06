package io.github.kotlinmania.libc.unix.linux_like.linux.musl

import off64T

public typealias PthreadT = COpaquePointer?

public typealias ClockT = CLong

public typealias TimeT = Long

public typealias SusecondsT = Long

public typealias InoT = ULong

public typealias OffT = Long

public typealias BlkcntT = Long

public typealias ShmattT = CUlong

public typealias MsgqnumT = CUlong

public typealias MsglenT = CUlong

public typealias FsblkcntT = CUlonglong

public typealias Fsblkcnt64T = CUlonglong

public typealias FsfilcntT = CUlonglong

public typealias Fsfilcnt64T = CUlonglong

public typealias RlimT = CUlonglong

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

// include/sys/mman.h
//
// Huge page size encoding when MAP_HUGETLB is specified, and a huge page
// size other than the default is desired.  See hugetlbEncode.h.
// All known huge page size encodings are provided here.  It is the
// responsibility of the application to know which sizes are supported on
// the running system.  See mmap(2) man page for details.
//
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

public val MS_RMT_MASK: CUlong = 0x02800051uL

// include/utmpx.h
public val EMPTY: CShort = 0

public val RUN_LVL: CShort = 1

public val BOOT_TIME: CShort = 2

public val NEW_TIME: CShort = 3

public val OLD_TIME: CShort = 4

public val INIT_PROCESS: CShort = 5

public val LOGIN_PROCESS: CShort = 6

public val USER_PROCESS: CShort = 7

public val DEAD_PROCESS: CShort = 8

public val ACCOUNTING: CShort = 9

public val SFD_CLOEXEC: CInt = 0x080000

public val NCCS: Int = 32

public val NCCS1: Int = 19

public val O_TRUNC: CInt = 512

public val O_NOATIME: CInt = 262144

public val O_CLOEXEC: CInt = 0x80000

public val O_TMPFILE: CInt = 4194304 or O_DIRECTORY

public val EBFONT: CInt = 59

public val ENOSTR: CInt = 60

public val ENODATA: CInt = 61

public val ETIME: CInt = 62

public val ENOSR: CInt = 63

public val ENONET: CInt = 64

public val ENOPKG: CInt = 65

public val EREMOTE: CInt = 66

public val ENOLINK: CInt = 67

public val EADV: CInt = 68

public val ESRMNT: CInt = 69

public val ECOMM: CInt = 70

public val EPROTO: CInt = 71

public val EDOTDOT: CInt = 73

public val F_OFD_GETLK: CInt = 36

public val F_OFD_SETLK: CInt = 37

public val F_OFD_SETLKW: CInt = 38

public val F_RDLCK: CInt = 0

public val F_WRLCK: CInt = 1

public val F_UNLCK: CInt = 2

public val SA_NODEFER: CInt = 0x40000000

public val SA_RESETHAND: CInt = 0x80000000

public val SA_RESTART: CInt = 0x10000000

public val SA_NOCLDSTOP: CInt = 0x00000001

public val EPOLL_CLOEXEC: CInt = 0x80000

public val EFD_CLOEXEC: CInt = 0x80000

public val BUFSIZ: CUint = 1024u

public val TMP_MAX: CUint = 10000u

public val FOPEN_MAX: CUint = 1000u

public val FILENAME_MAX: CUint = 4096u

public val O_PATH: CInt = 2097152

public val O_EXEC: CInt = 2097152

public val O_SEARCH: CInt = 2097152

public val O_ACCMODE: CInt = 2097155

public val O_NDELAY: CInt = O_NONBLOCK

public val NI_MAXHOST: SocklenT = 255u

public val PTHREAD_STACK_MIN: SizeT = 2048uL

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val SOCK_SEQPACKET: CInt = 5

public val SOCK_DCCP: CInt = 6

public val SOCK_NONBLOCK: CInt = O_NONBLOCK

public val SOCK_PACKET: CInt = 10

public val SOMAXCONN: CInt = 128

public val SIGUNUSED: CInt = SIGSYS

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 4

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 8

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

// Value was changed in 1.2.4
public val CPU_SETSIZE: CInt = if (false) {
    1024
} else {
    128
}

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

public val PTRACE_PEEKSIGINFO: CInt = 0x4209

public val PTRACE_GETSIGMASK: CUint = 0x420au

public val PTRACE_SETSIGMASK: CUint = 0x420bu

public val AF_IB: CInt = 27

public val AF_MPLS: CInt = 28

public val AF_NFC: CInt = 39

public val AF_VSOCK: CInt = 40

public val AF_XDP: CInt = 44

public val PF_IB: CInt = AF_IB

public val PF_MPLS: CInt = AF_MPLS

public val PF_NFC: CInt = AF_NFC

public val PF_VSOCK: CInt = AF_VSOCK

public val PF_XDP: CInt = AF_XDP

public val EFD_NONBLOCK: CInt = O_NONBLOCK

public val SFD_NONBLOCK: CInt = O_NONBLOCK

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 1

public val TCSAFLUSH: CInt = 2

public val RTLD_GLOBAL: CInt = 0x100

public val RTLD_NOLOAD: CInt = 0x4

public val CLOCK_SGI_CYCLE: ClockidT = 10

public val B0: SpeedT = 0

public val B50: SpeedT = 1

public val B75: SpeedT = 2

public val B110: SpeedT = 3

public val B134: SpeedT = 4

public val B150: SpeedT = 5

public val B200: SpeedT = 6

public val B300: SpeedT = 7

public val B600: SpeedT = 8

public val B1200: SpeedT = 9

public val B1800: SpeedT = 10

public val B2400: SpeedT = 11

public val B4800: SpeedT = 12

public val B9600: SpeedT = 13

public val B19200: SpeedT = 14

public val B38400: SpeedT = 15

public val EXTA: SpeedT = B19200

public val EXTB: SpeedT = B38400

public val REG_OK: CInt = 0

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val ADJ_OFFSET: CUint = 0x0001u

public val ADJ_FREQUENCY: CUint = 0x0002u

public val ADJ_MAXERROR: CUint = 0x0004u

public val ADJ_ESTERROR: CUint = 0x0008u

public val ADJ_STATUS: CUint = 0x0010u

public val ADJ_TIMECONST: CUint = 0x0020u

public val ADJ_TAI: CUint = 0x0080u

public val ADJ_SETOFFSET: CUint = 0x0100u

public val ADJ_MICRO: CUint = 0x1000u

public val ADJ_NANO: CUint = 0x2000u

public val ADJ_TICK: CUint = 0x4000u

public val ADJ_OFFSET_SINGLESHOT: CUint = 0x8001u

public val ADJ_OFFSET_SS_READ: CUint = 0xa001u

public val MOD_OFFSET: CUint = ADJ_OFFSET

public val MOD_FREQUENCY: CUint = ADJ_FREQUENCY

public val MOD_MAXERROR: CUint = ADJ_MAXERROR

public val MOD_ESTERROR: CUint = ADJ_ESTERROR

public val MOD_STATUS: CUint = ADJ_STATUS

public val MOD_TIMECONST: CUint = ADJ_TIMECONST

public val MOD_CLKB: CUint = ADJ_TICK

public val MOD_CLKA: CUint = ADJ_OFFSET_SINGLESHOT

public val MOD_TAI: CUint = ADJ_TAI

public val MOD_MICRO: CUint = ADJ_MICRO

public val MOD_NANO: CUint = ADJ_NANO

public val STA_PLL: CInt = 0x0001

public val STA_PPSFREQ: CInt = 0x0002

public val STA_PPSTIME: CInt = 0x0004

public val STA_FLL: CInt = 0x0008

public val STA_INS: CInt = 0x0010

public val STA_DEL: CInt = 0x0020

public val STA_UNSYNC: CInt = 0x0040

public val STA_FREQHOLD: CInt = 0x0080

public val STA_PPSSIGNAL: CInt = 0x0100

public val STA_PPSJITTER: CInt = 0x0200

public val STA_PPSWANDER: CInt = 0x0400

public val STA_PPSERROR: CInt = 0x0800

public val STA_CLOCKERR: CInt = 0x1000

public val STA_NANO: CInt = 0x2000

public val STA_MODE: CInt = 0x4000

public val STA_CLK: CInt = 0x8000

public val STA_RONLY: CInt = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR or STA_NANO or STA_MODE or STA_CLK

public val TIME_OK: CInt = 0

public val TIME_INS: CInt = 1

public val TIME_DEL: CInt = 2

public val TIME_OOP: CInt = 3

public val TIME_WAIT: CInt = 4

public val TIME_ERROR: CInt = 5

public val TIME_BAD: CInt = TIME_ERROR

public val MAXTC: CLong = 6L

public val CS_V6_ENV: CInt = 1148

public val CS_V7_ENV: CInt = 1149

public val CLONE_NEWTIME: CInt = 0x80

public val UT_HOSTSIZE: Int = 256

public val UT_LINESIZE: Int = 32

public val UT_NAMESIZE: Int = 32

public fun getrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("getrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("setrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun prlimit(pid: PidT, resource: CInt, newLimit: Rlimit?, oldLimit: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("prlimit", -1, longArrayOf(pid.toLong(), resource.toLong(), newLimit?.value ?: 0L, oldLimit?.value ?: 0L)).toInt()
}

public fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun ptrace(request: CInt, vararg variadicArgs: Long): CLong {
    return LibcDynamicFfi.invoke("ptrace", 1, longArrayOf(request.toLong()) + variadicArgs)
}

public fun getpriority(which: CInt, who: IdT): CInt {
    return LibcDynamicFfi.invoke("getpriority", -1, longArrayOf(which.toLong(), who.toLong())).toInt()
}

public fun setpriority(which: CInt, who: IdT, prio: CInt): CInt {
    return LibcDynamicFfi.invoke("setpriority", -1, longArrayOf(which.toLong(), who.toLong(), prio.toLong())).toInt()
}

// Musl targets need the `mask` argument of `fanotifyMark` be specified
// `cUlonglong` instead of `ULong` or there will be a type mismatch between
// `long long unsigned int` and the expected `uint64T`.
public fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: String?): CInt {
    val __cstr_4 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("fanotify_mark", -1, longArrayOf(fd.toLong(), flags.toLong(), mask.toLong(), dirfd.toLong(), __cstr_4)).toInt()
    } finally {
        if (__cstr_4 != 0L) LibcDynamicFfi.freeMem(__cstr_4)
    }
}

public fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("preadv2", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset, flags.toLong()))
}

public fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("pwritev2", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset, flags.toLong()))
}

public fun getauxval(type: CUlong): CUlong {
    return LibcDynamicFfi.invoke("getauxval", -1, longArrayOf(type.toLong())).toULong()
}

// Added in `musl` 1.1.20
public fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    LibcDynamicFfi.invoke("explicit_bzero", -1, longArrayOf(s?.value ?: 0L, len.toLong()))
}

// Added in `musl` 1.2.2
public fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("reallocarray", -1, longArrayOf(ptr?.value ?: 0L, nmemb.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun adjtimex(buf: Timex?): CInt {
    return LibcDynamicFfi.invoke("adjtimex", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

public fun clockAdjtime(clkId: ClockidT, buf: Timex?): CInt {
    return LibcDynamicFfi.invoke("clock_adjtime", -1, longArrayOf(clkId.toLong(), buf?.value ?: 0L)).toInt()
}

public fun ctermid(s: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("ctermid", -1, longArrayOf(s?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memfdCreate(name: String?, flags: CUint): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("memfd_create", -1, longArrayOf(__cstr_0, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt {
    return LibcDynamicFfi.invoke("mlock2", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), flags.toLong())).toInt()
}

public fun mallocUsableSize(ptr: COpaquePointer?): SizeT {
    return LibcDynamicFfi.invoke("malloc_usable_size", -1, longArrayOf(ptr?.value ?: 0L)).toULong()
}

public fun euidaccess(pathname: String?, mode: CInt): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("euidaccess", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun eaccess(pathname: String?, mode: CInt): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("eaccess", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("asctime_r", -1, longArrayOf(tm?.value ?: 0L, buf?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun dirname(path: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("dirname", -1, longArrayOf(path?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun basename(path: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("basename", -1, longArrayOf(path?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// Added in `musl` 1.1.20
public fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT {
    return LibcDynamicFfi.invoke("getrandom", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong(), flags.toLong()))
}

// Added in `musl` 1.1.24
public fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT?, path: String?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn_file_actions_addchdir_np", -1, longArrayOf(actions?.value ?: 0L, __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// Added in `musl` 1.1.24
public fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT?, fd: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addfchdir_np", -1, longArrayOf(actions?.value ?: 0L, fd.toLong())).toInt()
}

public fun getutxent(): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutxid(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxid", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutxline(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxline", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pututxline(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("pututxline", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setutxent() {
    LibcDynamicFfi.invoke("setutxent", -1, longArrayOf())
}

public fun endutxent() {
    LibcDynamicFfi.invoke("endutxent", -1, longArrayOf())
}

public fun utmpxname(file: String?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("utmpxname", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_tryjoin_np", -1, longArrayOf(thread?.value ?: 0L, retval?.value ?: 0L)).toInt()
}

public fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("pthread_timedjoin_np", -1, longArrayOf(thread?.value ?: 0L, retval?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}
