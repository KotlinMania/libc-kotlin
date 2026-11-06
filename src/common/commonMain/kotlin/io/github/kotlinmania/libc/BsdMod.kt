package io.github.kotlinmania.libc

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public typealias OffT = Long

public typealias UsecondsT = UInt

public typealias BlkcntT = Long

public typealias SocklenT = UInt

public typealias SaFamilyT = UByte

public typealias PthreadT = UintptrT

public typealias NfdsT = CUint

public typealias RegoffT = OffT

public val LC_ALL: CInt = 0

public val LC_COLLATE: CInt = 1

public val LC_CTYPE: CInt = 2

public val LC_MONETARY: CInt = 3

public val LC_NUMERIC: CInt = 4

public val LC_TIME: CInt = 5

public val LC_MESSAGES: CInt = 6

public val FIOCLEX: CUlong = 0x20006601uL

public val FIONCLEX: CUlong = 0x20006602uL

public val FIONREAD: CUlong = 0x4004667fuL

public val FIONBIO: CUlong = 0x8004667euL

public val FIOASYNC: CUlong = 0x8004667duL

public val FIOSETOWN: CUlong = 0x8004667cuL

public val FIOGETOWN: CUlong = 0x4004667buL

public val PATH_MAX: CInt = 1024

public val MAXPATHLEN: CInt = PATH_MAX

public val IOV_MAX: CInt = 1024

public val SA_ONSTACK: CInt = 0x0001

public val SA_SIGINFO: CInt = 0x0040

public val SA_RESTART: CInt = 0x0002

public val SA_RESETHAND: CInt = 0x0004

public val SA_NOCLDSTOP: CInt = 0x0008

public val SA_NODEFER: CInt = 0x0010

public val SA_NOCLDWAIT: CInt = 0x0020

public val SS_ONSTACK: CInt = 1

public val SS_DISABLE: CInt = 4

public val SIGCHLD: CInt = 20

public val SIGBUS: CInt = 10

public val SIGUSR1: CInt = 30

public val SIGUSR2: CInt = 31

public val SIGCONT: CInt = 19

public val SIGSTOP: CInt = 17

public val SIGTSTP: CInt = 18

public val SIGURG: CInt = 16

public val SIGIO: CInt = 23

public val SIGSYS: CInt = 12

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGINFO: CInt = 29

public val SIG_SETMASK: CInt = 3

public val SIG_BLOCK: CInt = 0x1

public val SIG_UNBLOCK: CInt = 0x2

public val IP_TOS: CInt = 3

public val IP_MULTICAST_IF: CInt = 9

public val IP_MULTICAST_TTL: CInt = 10

public val IP_MULTICAST_LOOP: CInt = 11

public val IPV6_UNICAST_HOPS: CInt = 4

public val IPV6_MULTICAST_IF: CInt = 9

public val IPV6_MULTICAST_HOPS: CInt = 10

public val IPV6_MULTICAST_LOOP: CInt = 11

public val IPV6_V6ONLY: CInt = 27

public val IPV6_DONTFRAG: CInt = 62

public val IPTOS_ECN_NOTECT: UByte = 0x00u

public val IPTOS_ECN_MASK: UByte = 0x03u

public val IPTOS_ECN_ECT1: UByte = 0x01u

public val IPTOS_ECN_ECT0: UByte = 0x02u

public val IPTOS_ECN_CE: UByte = 0x03u

public val ST_RDONLY: CUlong = 1uL

public val SCM_RIGHTS: CInt = 0x01

public val NCCS: Int = 20

public val O_ACCMODE: CInt = 0x3

public val O_RDONLY: CInt = 0

public val O_WRONLY: CInt = 1

public val O_RDWR: CInt = 2

public val O_APPEND: CInt = 8

public val O_CREAT: CInt = 512

public val O_TRUNC: CInt = 1024

public val O_EXCL: CInt = 2048

public val O_ASYNC: CInt = 0x40

public val O_SYNC: CInt = 0x80

public val O_NONBLOCK: CInt = 0x4

public val O_NOFOLLOW: CInt = 0x100

public val O_SHLOCK: CInt = 0x10

public val O_EXLOCK: CInt = 0x20

public val O_FSYNC: CInt = O_SYNC

public val O_NDELAY: CInt = O_NONBLOCK

public val F_GETOWN: CInt = 5

public val F_SETOWN: CInt = 6

public val F_RDLCK: CShort = 1

public val F_UNLCK: CShort = 2

public val F_WRLCK: CShort = 3

public val MNT_RDONLY: CInt = 0x00000001

public val MNT_SYNCHRONOUS: CInt = 0x00000002

public val MNT_NOEXEC: CInt = 0x00000004

public val MNT_NOSUID: CInt = 0x00000008

public val MNT_ASYNC: CInt = 0x00000040

public val MNT_EXPORTED: CInt = 0x00000100

public val MNT_UPDATE: CInt = 0x00010000

public val MNT_RELOAD: CInt = 0x00040000

public val MNT_FORCE: CInt = 0x00080000

public val Q_SYNC: CInt = 0x600

public val Q_QUOTAON: CInt = 0x100

public val Q_QUOTAOFF: CInt = 0x200

public val TCIOFF: CInt = 3

public val TCION: CInt = 4

public val TCOOFF: CInt = 1

public val TCOON: CInt = 2

public val TCIFLUSH: CInt = 1

public val TCOFLUSH: CInt = 2

public val TCIOFLUSH: CInt = 3

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 1

public val TCSAFLUSH: CInt = 2

public val VEOF: Int = 0

public val VEOL: Int = 1

public val VEOL2: Int = 2

public val VERASE: Int = 3

public val VWERASE: Int = 4

public val VKILL: Int = 5

public val VREPRINT: Int = 6

public val VINTR: Int = 8

public val VQUIT: Int = 9

public val VSUSP: Int = 10

public val VDSUSP: Int = 11

public val VSTART: Int = 12

public val VSTOP: Int = 13

public val VLNEXT: Int = 14

public val VDISCARD: Int = 15

public val VMIN: Int = 16

public val VTIME: Int = 17

public val VSTATUS: Int = 18

public val POSIX_VDISABLE: CcT = 0xffu

public val IGNBRK: TcflagT = 0x00000001

public val BRKINT: TcflagT = 0x00000002

public val IGNPAR: TcflagT = 0x00000004

public val PARMRK: TcflagT = 0x00000008

public val INPCK: TcflagT = 0x00000010

public val ISTRIP: TcflagT = 0x00000020

public val INLCR: TcflagT = 0x00000040

public val IGNCR: TcflagT = 0x00000080

public val ICRNL: TcflagT = 0x00000100

public val IXON: TcflagT = 0x00000200

public val IXOFF: TcflagT = 0x00000400

public val IXANY: TcflagT = 0x00000800

public val IMAXBEL: TcflagT = 0x00002000

public val OPOST: TcflagT = 0x1

public val ONLCR: TcflagT = 0x2

public val OXTABS: TcflagT = 0x4

public val ONOEOT: TcflagT = 0x8

public val CIGNORE: TcflagT = 0x00000001

public val CSIZE: TcflagT = 0x00000300

public val CS5: TcflagT = 0x00000000

public val CS6: TcflagT = 0x00000100

public val CS7: TcflagT = 0x00000200

public val CS8: TcflagT = 0x00000300

public val CSTOPB: TcflagT = 0x00000400

public val CREAD: TcflagT = 0x00000800

public val PARENB: TcflagT = 0x00001000

public val PARODD: TcflagT = 0x00002000

public val HUPCL: TcflagT = 0x00004000

public val CLOCAL: TcflagT = 0x00008000

public val ECHOKE: TcflagT = 0x00000001

public val ECHOE: TcflagT = 0x00000002

public val ECHOK: TcflagT = 0x00000004

public val ECHO: TcflagT = 0x00000008

public val ECHONL: TcflagT = 0x00000010

public val ECHOPRT: TcflagT = 0x00000020

public val ECHOCTL: TcflagT = 0x00000040

public val ISIG: TcflagT = 0x00000080

public val ICANON: TcflagT = 0x00000100

public val ALTWERASE: TcflagT = 0x00000200

public val IEXTEN: TcflagT = 0x00000400

public val EXTPROC: TcflagT = 0x00000800

public val TOSTOP: TcflagT = 0x00400000

public val FLUSHO: TcflagT = 0x00800000

public val NOKERNINFO: TcflagT = 0x02000000

public val PENDIN: TcflagT = 0x20000000

public val NOFLSH: TcflagT = 0x80000000

public val MDMBUF: TcflagT = 0x00100000

public val WNOHANG: CInt = 0x00000001

public val WUNTRACED: CInt = 0x00000002

public val RTLD_LAZY: CInt = 0x1

public val RTLD_NOW: CInt = 0x2

public val RTLD_NEXT: COpaquePointer? = COpaquePointer((-1).toLong())

public val RTLD_DEFAULT: COpaquePointer? = COpaquePointer((-2).toLong())

public val RTLD_SELF: COpaquePointer? = COpaquePointer((-3).toLong())

public val LOG_CRON: CInt = 9 shl 3

public val LOG_AUTHPRIV: CInt = 10 shl 3

public val LOG_FTP: CInt = 11 shl 3

public val LOG_PERROR: CInt = 0x20

public val TCP_NODELAY: CInt = 1

public val TCP_MAXSEG: CInt = 2

public val PIPE_BUF: Int = 512

// siCode values for SIGBUS signal
public val BUS_ADRALN: CInt = 1

public val BUS_ADRERR: CInt = 2

public val BUS_OBJERR: CInt = 3

// siCode values for SIGCHLD signal
public val CLD_EXITED: CInt = 1

public val CLD_KILLED: CInt = 2

public val CLD_DUMPED: CInt = 3

public val CLD_TRAPPED: CInt = 4

public val CLD_STOPPED: CInt = 5

public val CLD_CONTINUED: CInt = 6

public val POLLIN: CShort = 0x1

public val POLLPRI: CShort = 0x2

public val POLLOUT: CShort = 0x4

public val POLLERR: CShort = 0x8

public val POLLHUP: CShort = 0x10

public val POLLNVAL: CShort = 0x20

public val POLLRDNORM: CShort = 0x040

public val POLLWRNORM: CShort = 0x004

public val POLLRDBAND: CShort = 0x080

public val POLLWRBAND: CShort = 0x100

public val REG_BASIC: CInt = 0

public val REG_EXTENDED: CInt = 1

public val REG_ICASE: CInt = 2

public val REG_NOSUB: CInt = 4

public val REG_NEWLINE: CInt = 8

public val REG_NOSPEC: CInt = 16

public val REG_PEND: CInt = 32

public val REG_DUMP: CInt = 128

public val REG_NOMATCH: CInt = 1

public val REG_BADPAT: CInt = 2

public val REG_ECOLLATE: CInt = 3

public val REG_ECTYPE: CInt = 4

public val REG_EESCAPE: CInt = 5

public val REG_ESUBREG: CInt = 6

public val REG_EBRACK: CInt = 7

public val REG_EPAREN: CInt = 8

public val REG_EBRACE: CInt = 9

public val REG_BADBR: CInt = 10

public val REG_ERANGE: CInt = 11

public val REG_ESPACE: CInt = 12

public val REG_BADRPT: CInt = 13

public val REG_EMPTY: CInt = 14

public val REG_ASSERT: CInt = 15

public val REG_INVARG: CInt = 16

public val REG_ATOI: CInt = 255

public val REG_ITOA: CInt = 256

public val REG_NOTBOL: CInt = 1

public val REG_NOTEOL: CInt = 2

public val REG_STARTEND: CInt = 4

public val REG_TRACE: CInt = 256

public val REG_LARGE: CInt = 512

public val REG_BACKR: CInt = 1024

public val TIOCCBRK: CUint = 0x2000747au

public val TIOCSBRK: CUint = 0x2000747bu

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val ITIMER_REAL: CInt = 0

public val ITIMER_VIRTUAL: CInt = 1

public val ITIMER_PROF: CInt = 2

// net/route.h
public val RTF_UP: CInt = 0x1

public val RTF_GATEWAY: CInt = 0x2

public val RTF_HOST: CInt = 0x4

public val RTF_REJECT: CInt = 0x8

public val RTF_DYNAMIC: CInt = 0x10

public val RTF_MODIFIED: CInt = 0x20

public val RTF_DONE: CInt = 0x40

public val RTF_STATIC: CInt = 0x800

public val RTF_BLACKHOLE: CInt = 0x1000

public val RTF_PROTO2: CInt = 0x4000

public val RTF_PROTO1: CInt = 0x8000

// Message types
public val RTM_ADD: CInt = 0x1

public val RTM_DELETE: CInt = 0x2

public val RTM_CHANGE: CInt = 0x3

public val RTM_GET: CInt = 0x4

public val RTM_LOSING: CInt = 0x5

public val RTM_REDIRECT: CInt = 0x6

public val RTM_MISS: CInt = 0x7

// Bitmask values for rtmAddrs.
public val RTA_DST: CInt = 0x1

public val RTA_GATEWAY: CInt = 0x2

public val RTA_NETMASK: CInt = 0x4

public val RTA_GENMASK: CInt = 0x8

public val RTA_IFP: CInt = 0x10

public val RTA_IFA: CInt = 0x20

public val RTA_AUTHOR: CInt = 0x40

public val RTA_BRD: CInt = 0x80

// Index offsets for sockaddr array for alternate internal encoding.
public val RTAX_DST: CInt = 0

public val RTAX_GATEWAY: CInt = 1

public val RTAX_NETMASK: CInt = 2

public val RTAX_GENMASK: CInt = 3

public val RTAX_IFP: CInt = 4

public val RTAX_IFA: CInt = 5

public val RTAX_AUTHOR: CInt = 6

public val RTAX_BRD: CInt = 7

public fun getrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("getrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("setrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("strerror_r", -1, longArrayOf(errnum.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun abs(i: CInt): CInt {
    return LibcDynamicFfi.invoke("abs", -1, longArrayOf(i.toLong())).toInt()
}

public fun labs(i: CLong): CLong {
    return LibcDynamicFfi.invoke("labs", -1, longArrayOf(i))
}

public fun rand(): CInt {
    return LibcDynamicFfi.invoke("rand", -1, longArrayOf()).toInt()
}

public fun srand(seed: CUint) {
    LibcDynamicFfi.invoke("srand", -1, longArrayOf(seed.toLong()))
}

public fun getifaddrs(ifap: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getifaddrs", -1, longArrayOf(ifap?.value ?: 0L)).toInt()
}

public fun freeifaddrs(ifa: Ifaddrs?) {
    LibcDynamicFfi.invoke("freeifaddrs", -1, longArrayOf(ifa?.value ?: 0L))
}

public fun setgroups(ngroups: CInt, ptr: GidT?): CInt {
    val __slot_1 = if (ptr == null) 0L else LibcDynamicFfi.allocScalarSlot(ptr.toLong())
    try {
        return LibcDynamicFfi.invoke("setgroups", -1, longArrayOf(ngroups.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun setlogin(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("setlogin", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("ioctl", 2, longArrayOf(fd.toLong(), request.toLong()) + variadicArgs).toInt()
}

public fun kqueue(): CInt {
    return LibcDynamicFfi.invoke("kqueue", -1, longArrayOf()).toInt()
}

public fun unmount(target: String?, arg: CInt): CInt {
    val __cstr_0 = if (target == null) 0L else LibcDynamicFfi.allocUtf8CString(target)
    try {
        return LibcDynamicFfi.invoke("unmount", -1, longArrayOf(__cstr_0, arg.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun syscall(num: CInt, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("syscall", 1, longArrayOf(num.toLong()) + variadicArgs).toInt()
}

public fun getpwent(): Passwd? {
    val rawRet = LibcDynamicFfi.invoke("getpwent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setpwent() {
    LibcDynamicFfi.invoke("setpwent", -1, longArrayOf())
}

public fun endpwent() {
    LibcDynamicFfi.invoke("endpwent", -1, longArrayOf())
}

public fun endgrent() {
    LibcDynamicFfi.invoke("endgrent", -1, longArrayOf())
}

public fun getgrent(): Group? {
    val rawRet = LibcDynamicFfi.invoke("getgrent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getprogname(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getprogname", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setprogname(name: String?) {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        LibcDynamicFfi.invoke("setprogname", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt {
    val __slot_0 = if (loadavg == null) 0L else LibcDynamicFfi.allocScalarSlot(loadavg.toRawBits())
    try {
        return LibcDynamicFfi.invoke("getloadavg", -1, longArrayOf(__slot_0, nelem.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun ifNameindex(): IfNameindex? {
    val rawRet = LibcDynamicFfi.invoke("if_nameindex", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ifFreenameindex(ptr: IfNameindex?) {
    LibcDynamicFfi.invoke("if_freenameindex", -1, longArrayOf(ptr?.value ?: 0L))
}

public fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt {
    val __slot_1 = if (euid == null) 0L else LibcDynamicFfi.allocScalarSlot(euid.toLong())
    val __slot_2 = if (egid == null) 0L else LibcDynamicFfi.allocScalarSlot(egid.toLong())
    try {
        return LibcDynamicFfi.invoke("getpeereid", -1, longArrayOf(socket.toLong(), __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: GlobT?): CInt {
    val __cstr_0 = if (pattern == null) 0L else LibcDynamicFfi.allocUtf8CString(pattern)
    try {
        return LibcDynamicFfi.invoke("glob", -1, longArrayOf(__cstr_0, flags.toLong(), errfunc?.value ?: 0L, pglob?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun globfree(pglob: GlobT?) {
    LibcDynamicFfi.invoke("globfree", -1, longArrayOf(pglob?.value ?: 0L))
}

public fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_madvise", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), advice.toLong())).toInt()
}

public fun shmUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("shm_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun seekdir(dirp: DIR?, loc: CLong) {
    LibcDynamicFfi.invoke("seekdir", -1, longArrayOf(dirp?.handle ?: 0L, loc))
}

public fun telldir(dirp: DIR?): CLong {
    return LibcDynamicFfi.invoke("telldir", -1, longArrayOf(dirp?.handle ?: 0L))
}

public fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("madvise", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), advice.toLong())).toInt()
}

public fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("msync", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), flags.toLong())).toInt()
}

public fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: UInt?): SsizeT {
    val __slot_5 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("recvfrom", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong(), addr?.value ?: 0L, __slot_5))
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt {
    return LibcDynamicFfi.invoke("mkstemps", -1, longArrayOf(template?.value ?: 0L, suffixlen.toLong())).toInt()
}

public fun futimes(fd: CInt, times: Timeval?): CInt {
    return LibcDynamicFfi.invoke("futimes", -1, longArrayOf(fd.toLong(), times?.value ?: 0L)).toInt()
}

public fun nlLanginfo(item: NlItem): COpaquePointer? {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        val rawRet = LibcDynamicFfi.invoke("nl_langinfo", -1, longArrayOf(__scratch_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt {
    return LibcDynamicFfi.invoke("bind", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, addressLen.toLong())).toInt()
}

public fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("writev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("readv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("sendmsg", -1, longArrayOf(fd.toLong(), msg?.value ?: 0L, flags.toLong()))
}

public fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("recvmsg", -1, longArrayOf(fd.toLong(), msg?.value ?: 0L, flags.toLong()))
}

public fun sync() {
    LibcDynamicFfi.invoke("sync", -1, longArrayOf())
}

public fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getgrgid_r", -1, longArrayOf(gid.toLong(), grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun sigaltstack(ss: StackT?, oss: StackT?): CInt {
    return LibcDynamicFfi.invoke("sigaltstack", -1, longArrayOf(ss?.value ?: 0L, oss?.value ?: 0L)).toInt()
}

public fun sigsuspend(mask: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("sigsuspend", -1, longArrayOf(mask?.value ?: 0L)).toInt()
}

public fun semClose(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_close", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun getdtablesize(): CInt {
    return LibcDynamicFfi.invoke("getdtablesize", -1, longArrayOf()).toInt()
}

public fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getgrnam_r", -1, longArrayOf(__cstr_0, grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("pthread_sigmask", -1, longArrayOf(how.toLong(), set?.value ?: 0L, oldset?.value ?: 0L)).toInt()
}

public fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): SemT? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("sem_open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs)
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getgrnam(name: String?): Group? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getgrnam", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun pthreadCancel(thread: PthreadT): CInt {
    return LibcDynamicFfi.invoke("pthread_cancel", -1, longArrayOf(thread.toLong())).toInt()
}

public fun pthreadKill(thread: PthreadT, sig: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_kill", -1, longArrayOf(thread.toLong(), sig.toLong())).toInt()
}

public fun schedGetPriorityMin(policy: CInt): CInt {
    return LibcDynamicFfi.invoke("sched_get_priority_min", -1, longArrayOf(policy.toLong())).toInt()
}

public fun schedGetPriorityMax(policy: CInt): CInt {
    return LibcDynamicFfi.invoke("sched_get_priority_max", -1, longArrayOf(policy.toLong())).toInt()
}

public fun semUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("sem_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getpwnam_r", -1, longArrayOf(__cstr_0, pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getpwuid_r", -1, longArrayOf(uid.toLong(), pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun sigwait(set: SigsetT?, sig: CInt?): CInt {
    val __slot_1 = if (sig == null) 0L else LibcDynamicFfi.allocScalarSlot(sig.toLong())
    try {
        return LibcDynamicFfi.invoke("sigwait", -1, longArrayOf(set?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt {
    return LibcDynamicFfi.invoke("pthread_atfork", -1, longArrayOf(prepare?.value ?: 0L, parent?.value ?: 0L, child?.value ?: 0L)).toInt()
}

public fun getgrgid(gid: GidT): Group? {
    val rawRet = LibcDynamicFfi.invoke("getgrgid", -1, longArrayOf(gid.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun popen(command: String?, mode: String?): FILE? {
    val __cstr_0 = if (command == null) 0L else LibcDynamicFfi.allocUtf8CString(command)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("popen", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("faccessat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun pthreadCreate(native: UintptrT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt {
    val __slot_0 = if (native == null) 0L else LibcDynamicFfi.allocScalarSlot(native.toLong())
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_create", -1, longArrayOf(__slot_0, attr?.value ?: 0L, __scratch_2, value?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun acct(filename: String?): CInt {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        return LibcDynamicFfi.invoke("acct", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT {
    val __slot_1 = if (status == null) 0L else LibcDynamicFfi.allocScalarSlot(status.toLong())
    try {
        return LibcDynamicFfi.invoke("wait4", -1, longArrayOf(pid.toLong(), __slot_1, options.toLong(), rusage?.value ?: 0L)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun getitimer(which: CInt, currValue: Itimerval?): CInt {
    return LibcDynamicFfi.invoke("getitimer", -1, longArrayOf(which.toLong(), currValue?.value ?: 0L)).toInt()
}

public fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt {
    return LibcDynamicFfi.invoke("setitimer", -1, longArrayOf(which.toLong(), newValue?.value ?: 0L, oldValue?.value ?: 0L)).toInt()
}

public fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt {
    val __cstr_1 = if (pattern == null) 0L else LibcDynamicFfi.allocUtf8CString(pattern)
    try {
        return LibcDynamicFfi.invoke("regcomp", -1, longArrayOf(preg?.value ?: 0L, __cstr_1, cflags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt {
    val __cstr_1 = if (input == null) 0L else LibcDynamicFfi.allocUtf8CString(input)
    try {
        return LibcDynamicFfi.invoke("regexec", -1, longArrayOf(preg?.value ?: 0L, __cstr_1, nmatch.toLong(), pmatch?.value ?: 0L, eflags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun regerror(errcode: CInt, preg: RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT {
    return LibcDynamicFfi.invoke("regerror", -1, longArrayOf(errcode.toLong(), preg?.value ?: 0L, errbuf?.value ?: 0L, errbufSize.toLong())).toULong()
}

public fun regfree(preg: RegexT?) {
    LibcDynamicFfi.invoke("regfree", -1, longArrayOf(preg?.value ?: 0L))
}

public fun arc4random(): UInt {
    return LibcDynamicFfi.invoke("arc4random", -1, longArrayOf()).toUInt()
}

public fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    LibcDynamicFfi.invoke("arc4random_buf", -1, longArrayOf(buf?.value ?: 0L, size.toLong()))
}

public fun arc4randomUniform(l: UInt): UInt {
    return LibcDynamicFfi.invoke("arc4random_uniform", -1, longArrayOf(l.toLong())).toUInt()
}

public fun drand48(): CDouble {
    return LibcDynamicFfi.invokeFp("drand48", 0, false, longArrayOf())
}

public fun erand48(xseed: CUshort?): CDouble {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        return LibcDynamicFfi.invokeFp("erand48", 0, false, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun lrand48(): CLong {
    return LibcDynamicFfi.invoke("lrand48", -1, longArrayOf())
}

public fun nrand48(xseed: CUshort?): CLong {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        return LibcDynamicFfi.invoke("nrand48", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun mrand48(): CLong {
    return LibcDynamicFfi.invoke("mrand48", -1, longArrayOf())
}

public fun jrand48(xseed: CUshort?): CLong {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        return LibcDynamicFfi.invoke("jrand48", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun srand48(seed: CLong) {
    LibcDynamicFfi.invoke("srand48", -1, longArrayOf(seed))
}

public fun seed48(xseed: CUshort?): CUshort? {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("seed48", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 2).toUShort()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun lcong48(p: CUshort?) {
    val __slot_0 = if (p == null) 0L else LibcDynamicFfi.allocScalarSlot(p.toLong())
    try {
        LibcDynamicFfi.invoke("lcong48", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt {
    val __cstr_2 = if (optstring == null) 0L else LibcDynamicFfi.allocUtf8CString(optstring)
    val __slot_4 = if (longindex == null) 0L else LibcDynamicFfi.allocScalarSlot(longindex.toLong())
    try {
        return LibcDynamicFfi.invoke("getopt_long", -1, longArrayOf(argc.toLong(), argv?.value ?: 0L, __cstr_2, longopts?.value ?: 0L, __slot_4)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun strftime(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?): SizeT {
    val __cstr_2 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("strftime", -1, longArrayOf(buf?.value ?: 0L, maxsize.toLong(), __cstr_2, timeptr?.value ?: 0L)).toULong()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun strftimeL(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?, locale: LocaleT): SizeT {
    val __cstr_2 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("strftime_l", -1, longArrayOf(buf?.value ?: 0L, maxsize.toLong(), __cstr_2, timeptr?.value ?: 0L, locale?.value ?: 0L)).toULong()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun devname(dev: DevT, modeT: ModeT): COpaquePointer? {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        val rawRet = LibcDynamicFfi.invoke("devname", -1, longArrayOf(__scratch_0, modeT.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun issetugid(): CInt {
    return LibcDynamicFfi.invoke("issetugid", -1, longArrayOf()).toInt()
}
