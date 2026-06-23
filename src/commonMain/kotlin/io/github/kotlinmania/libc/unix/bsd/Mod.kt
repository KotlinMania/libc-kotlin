// port-lint: source unix/bsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias OffT = Long
public typealias UsecondsT = UInt
public typealias BlkcntT = Long
public typealias SocklenT = UInt
public typealias SaFamilyT = UByte
public typealias PthreadT = UintptrT
public typealias NfdsT = CUInt
public typealias RegoffT = OffT

public data class Sockaddr(
    val saLen: UByte,
    val saFamily: SaFamilyT,
    val saData: ByteArray,
)

public data class SockaddrIn6(
    val sin6Len: UByte,
    val sin6Family: SaFamilyT,
    val sin6Port: InPortT,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)

public data class Passwd(
    val pwName: String?,
    val pwPasswd: String?,
    val pwUid: UidT,
    val pwGid: GidT,
    val pwChange: TimeT,
    val pwClass: String?,
    val pwGecos: String?,
    val pwDir: String?,
    val pwShell: String?,
    val pwExpire: TimeT,
    val pwFields: CInt,
)

public data class Ifaddrs(
    val ifaNext: Ifaddrs?,
    val ifaName: String?,
    val ifaFlags: CUInt,
    val ifaAddr: Sockaddr?,
    val ifaNetmask: Sockaddr?,
    val ifaDstaddr: Sockaddr?,
    val ifaData: COpaquePointer?,
    val ifaAddrflags: CUInt,
)

public data class FdSet(
    val fdsBits: LongArray,
    val fdsBits: IntArray,
)

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: SocklenT,
    val msgIov: Iovec?,
    val msgIovlen: CInt,
    val msgControl: COpaquePointer?,
    val msgControllen: SocklenT,
    val msgFlags: CInt,
)

public data class Cmsghdr(
    val cmsgLen: SocklenT,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class FsidT(
    val fsidVal: IntArray,
)

public data class IfNameindex(
    val ifIndex: CUInt,
    val ifName: String?,
)

public data class RegexT(
    val reMagic: CInt,
    val reNsub: ULong,
    val reEndp: String?,
    val reG: COpaquePointer?,
)

public data class RegmatchT(
    val rmSo: RegoffT,
    val rmEo: RegoffT,
)

public data class Option(
    val name: String?,
    val hasArg: CInt,
    val flag: CInt?,
    val `val`: CInt,
)

public data class SockaddrUn(
    val sunLen: UByte,
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public data class Utsname(
    val sysname: ByteArray,
    val sysname: ByteArray,
    val nodename: ByteArray,
    val nodename: ByteArray,
    val release: ByteArray,
    val release: ByteArray,
    val version: ByteArray,
    val version: ByteArray,
    val machine: ByteArray,
    val machine: ByteArray,
)

public const val LC_ALL: CInt = 0
public const val LC_COLLATE: CInt = 1
public const val LC_CTYPE: CInt = 2
public const val LC_MONETARY: CInt = 3
public const val LC_NUMERIC: CInt = 4
public const val LC_TIME: CInt = 5
public const val LC_MESSAGES: CInt = 6
public const val FIOCLEX: CULong = 0x20006601uL
public const val FIONCLEX: CULong = 0x20006602uL
public const val FIONREAD: CULong = 0x4004667fuL
public const val FIONBIO: CULong = 0x8004667euL
public const val FIOASYNC: CULong = 0x8004667duL
public const val FIOSETOWN: CULong = 0x8004667cuL
public const val FIOGETOWN: CULong = 0x4004667buL
public const val PATH_MAX: CInt = 1024
public const val MAXPATHLEN: CInt = PATH_MAX
public const val IOV_MAX: CInt = 1024
public const val SA_ONSTACK: CInt = 0x0001
public const val SA_SIGINFO: CInt = 0x0040
public const val SA_RESTART: CInt = 0x0002
public const val SA_RESETHAND: CInt = 0x0004
public const val SA_NOCLDSTOP: CInt = 0x0008
public const val SA_NODEFER: CInt = 0x0010
public const val SA_NOCLDWAIT: CInt = 0x0020
public const val SS_ONSTACK: CInt = 1
public const val SS_DISABLE: CInt = 4
public const val SIGCHLD: CInt = 20
public const val SIGBUS: CInt = 10
public const val SIGUSR1: CInt = 30
public const val SIGUSR2: CInt = 31
public const val SIGCONT: CInt = 19
public const val SIGSTOP: CInt = 17
public const val SIGTSTP: CInt = 18
public const val SIGURG: CInt = 16
public const val SIGIO: CInt = 23
public const val SIGSYS: CInt = 12
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGXCPU: CInt = 24
public const val SIGXFSZ: CInt = 25
public const val SIGVTALRM: CInt = 26
public const val SIGPROF: CInt = 27
public const val SIGWINCH: CInt = 28
public const val SIGINFO: CInt = 29
public const val SIG_SETMASK: CInt = 3
public const val SIG_BLOCK: CInt = 0x1
public const val SIG_UNBLOCK: CInt = 0x2
public const val IP_TOS: CInt = 3
public const val IP_MULTICAST_IF: CInt = 9
public const val IP_MULTICAST_TTL: CInt = 10
public const val IP_MULTICAST_LOOP: CInt = 11
public const val IPV6_UNICAST_HOPS: CInt = 4
public const val IPV6_MULTICAST_IF: CInt = 9
public const val IPV6_MULTICAST_HOPS: CInt = 10
public const val IPV6_MULTICAST_LOOP: CInt = 11
public const val IPV6_V6ONLY: CInt = 27
public const val IPV6_DONTFRAG: CInt = 62
public val IPTOS_ECN_NOTECT: UByte = (0x00).toUByte()
public val IPTOS_ECN_MASK: UByte = (0x03).toUByte()
public val IPTOS_ECN_ECT1: UByte = (0x01).toUByte()
public val IPTOS_ECN_ECT0: UByte = (0x02).toUByte()
public val IPTOS_ECN_CE: UByte = (0x03).toUByte()
public const val ST_RDONLY: CULong = 1uL
public const val SCM_RIGHTS: CInt = 0x01
public const val NCCS: ULong = 20uL
public const val O_ACCMODE: CInt = 0x3
public const val O_RDONLY: CInt = 0
public const val O_WRONLY: CInt = 1
public const val O_RDWR: CInt = 2
public const val O_APPEND: CInt = 8
public const val O_CREAT: CInt = 512
public const val O_TRUNC: CInt = 1024
public const val O_EXCL: CInt = 2048
public const val O_ASYNC: CInt = 0x40
public const val O_SYNC: CInt = 0x80
public const val O_NONBLOCK: CInt = 0x4
public const val O_NOFOLLOW: CInt = 0x100
public const val O_SHLOCK: CInt = 0x10
public const val O_EXLOCK: CInt = 0x20
public const val O_FSYNC: CInt = O_SYNC
public const val O_NDELAY: CInt = O_NONBLOCK
public const val F_GETOWN: CInt = 5
public const val F_SETOWN: CInt = 6
public const val F_RDLCK: CShort = 1
public const val F_UNLCK: CShort = 2
public const val F_WRLCK: CShort = 3
public const val MNT_RDONLY: CInt = 0x00000001
public const val MNT_SYNCHRONOUS: CInt = 0x00000002
public const val MNT_NOEXEC: CInt = 0x00000004
public const val MNT_NOSUID: CInt = 0x00000008
public const val MNT_ASYNC: CInt = 0x00000040
public const val MNT_EXPORTED: CInt = 0x00000100
public const val MNT_UPDATE: CInt = 0x00010000
public const val MNT_RELOAD: CInt = 0x00040000
public const val MNT_FORCE: CInt = 0x00080000
public const val Q_SYNC: CInt = 0x600
public const val Q_QUOTAON: CInt = 0x100
public const val Q_QUOTAOFF: CInt = 0x200
public const val TCIOFF: CInt = 3
public const val TCION: CInt = 4
public const val TCOOFF: CInt = 1
public const val TCOON: CInt = 2
public const val TCIFLUSH: CInt = 1
public const val TCOFLUSH: CInt = 2
public const val TCIOFLUSH: CInt = 3
public const val TCSANOW: CInt = 0
public const val TCSADRAIN: CInt = 1
public const val TCSAFLUSH: CInt = 2
public const val VEOF: ULong = 0uL
public const val VEOL: ULong = 1uL
public const val VEOL2: ULong = 2uL
public const val VERASE: ULong = 3uL
public const val VWERASE: ULong = 4uL
public const val VKILL: ULong = 5uL
public const val VREPRINT: ULong = 6uL
public const val VINTR: ULong = 8uL
public const val VQUIT: ULong = 9uL
public const val VSUSP: ULong = 10uL
public const val VDSUSP: ULong = 11uL
public const val VSTART: ULong = 12uL
public const val VSTOP: ULong = 13uL
public const val VLNEXT: ULong = 14uL
public const val VDISCARD: ULong = 15uL
public const val VMIN: ULong = 16uL
public const val VTIME: ULong = 17uL
public const val VSTATUS: ULong = 18uL
public const val _POSIX_VDISABLE: CcT = 0xff
public const val IGNBRK: TcflagT = 0x00000001
public const val BRKINT: TcflagT = 0x00000002
public const val IGNPAR: TcflagT = 0x00000004
public const val PARMRK: TcflagT = 0x00000008
public const val INPCK: TcflagT = 0x00000010
public const val ISTRIP: TcflagT = 0x00000020
public const val INLCR: TcflagT = 0x00000040
public const val IGNCR: TcflagT = 0x00000080
public const val ICRNL: TcflagT = 0x00000100
public const val IXON: TcflagT = 0x00000200
public const val IXOFF: TcflagT = 0x00000400
public const val IXANY: TcflagT = 0x00000800
public const val IMAXBEL: TcflagT = 0x00002000
public const val OPOST: TcflagT = 0x1
public const val ONLCR: TcflagT = 0x2
public const val OXTABS: TcflagT = 0x4
public const val ONOEOT: TcflagT = 0x8
public const val CIGNORE: TcflagT = 0x00000001
public const val CSIZE: TcflagT = 0x00000300
public const val CS5: TcflagT = 0x00000000
public const val CS6: TcflagT = 0x00000100
public const val CS7: TcflagT = 0x00000200
public const val CS8: TcflagT = 0x00000300
public const val CSTOPB: TcflagT = 0x00000400
public const val CREAD: TcflagT = 0x00000800
public const val PARENB: TcflagT = 0x00001000
public const val PARODD: TcflagT = 0x00002000
public const val HUPCL: TcflagT = 0x00004000
public const val CLOCAL: TcflagT = 0x00008000
public const val ECHOKE: TcflagT = 0x00000001
public const val ECHOE: TcflagT = 0x00000002
public const val ECHOK: TcflagT = 0x00000004
public const val ECHO: TcflagT = 0x00000008
public const val ECHONL: TcflagT = 0x00000010
public const val ECHOPRT: TcflagT = 0x00000020
public const val ECHOCTL: TcflagT = 0x00000040
public const val ISIG: TcflagT = 0x00000080
public const val ICANON: TcflagT = 0x00000100
public const val ALTWERASE: TcflagT = 0x00000200
public const val IEXTEN: TcflagT = 0x00000400
public const val EXTPROC: TcflagT = 0x00000800
public const val TOSTOP: TcflagT = 0x00400000
public const val FLUSHO: TcflagT = 0x00800000
public const val NOKERNINFO: TcflagT = 0x02000000
public const val PENDIN: TcflagT = 0x20000000
public const val NOFLSH: TcflagT = 0x80000000
public const val MDMBUF: TcflagT = 0x00100000
public const val WNOHANG: CInt = 0x00000001
public const val WUNTRACED: CInt = 0x00000002
public const val RTLD_LAZY: CInt = 0x1
public const val RTLD_NOW: CInt = 0x2
public val LOG_CRON: CInt = 9 shl 3
public val LOG_AUTHPRIV: CInt = 10 shl 3
public val LOG_FTP: CInt = 11 shl 3
public const val LOG_PERROR: CInt = 0x20
public const val TCP_NODELAY: CInt = 1
public const val TCP_MAXSEG: CInt = 2
public const val PIPE_BUF: ULong = 512uL
public const val BUS_ADRALN: CInt = 1
public const val BUS_ADRERR: CInt = 2
public const val BUS_OBJERR: CInt = 3
public const val CLD_EXITED: CInt = 1
public const val CLD_KILLED: CInt = 2
public const val CLD_DUMPED: CInt = 3
public const val CLD_TRAPPED: CInt = 4
public const val CLD_STOPPED: CInt = 5
public const val CLD_CONTINUED: CInt = 6
public const val POLLIN: CShort = 0x1
public const val POLLPRI: CShort = 0x2
public const val POLLOUT: CShort = 0x4
public const val POLLERR: CShort = 0x8
public const val POLLHUP: CShort = 0x10
public const val POLLNVAL: CShort = 0x20
public const val POLLRDNORM: CShort = 0x040
public const val POLLWRNORM: CShort = 0x004
public const val POLLRDBAND: CShort = 0x080
public const val POLLWRBAND: CShort = 0x100
public const val BIOCGBLEN: CULong = 0x40044266uL
public const val BIOCSBLEN: CULong = 0xc0044266uL
public const val BIOCFLUSH: CUInt = 0x20004268u
public const val BIOCPROMISC: CUInt = 0x20004269u
public const val BIOCGDLT: CULong = 0x4004426auL
public const val BIOCGETIF: CULong = 0x4020426buL
public const val BIOCSETIF: CULong = 0x8020426cuL
public const val BIOCGSTATS: CULong = 0x4008426fuL
public const val BIOCIMMEDIATE: CULong = 0x80044270uL
public const val BIOCVERSION: CULong = 0x40044271uL
public const val BIOCGHDRCMPLT: CULong = 0x40044274uL
public const val BIOCSHDRCMPLT: CULong = 0x80044275uL
public const val SIOCGIFADDR: CULong = 0xc0206921uL
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
public const val TIOCCBRK: CUInt = 0x2000747au
public const val TIOCSBRK: CUInt = 0x2000747bu
public const val PRIO_PROCESS: CInt = 0
public const val PRIO_PGRP: CInt = 1
public const val PRIO_USER: CInt = 2
public const val ITIMER_REAL: CInt = 0
public const val ITIMER_VIRTUAL: CInt = 1
public const val ITIMER_PROF: CInt = 2
public const val RTF_UP: CInt = 0x1
public const val RTF_GATEWAY: CInt = 0x2
public const val RTF_HOST: CInt = 0x4
public const val RTF_REJECT: CInt = 0x8
public const val RTF_DYNAMIC: CInt = 0x10
public const val RTF_MODIFIED: CInt = 0x20
public const val RTF_DONE: CInt = 0x40
public const val RTF_STATIC: CInt = 0x800
public const val RTF_BLACKHOLE: CInt = 0x1000
public const val RTF_PROTO2: CInt = 0x4000
public const val RTF_PROTO1: CInt = 0x8000
public const val RTM_ADD: CInt = 0x1
public const val RTM_DELETE: CInt = 0x2
public const val RTM_CHANGE: CInt = 0x3
public const val RTM_GET: CInt = 0x4
public const val RTM_LOSING: CInt = 0x5
public const val RTM_REDIRECT: CInt = 0x6
public const val RTM_MISS: CInt = 0x7
public const val RTA_DST: CInt = 0x1
public const val RTA_GATEWAY: CInt = 0x2
public const val RTA_NETMASK: CInt = 0x4
public const val RTA_GENMASK: CInt = 0x8
public const val RTA_IFP: CInt = 0x10
public const val RTA_IFA: CInt = 0x20
public const val RTA_AUTHOR: CInt = 0x40
public const val RTA_BRD: CInt = 0x80
public const val RTAX_DST: CInt = 0
public const val RTAX_GATEWAY: CInt = 1
public const val RTAX_NETMASK: CInt = 2
public const val RTAX_GENMASK: CInt = 3
public const val RTAX_IFP: CInt = 4
public const val RTAX_IFA: CInt = 5
public const val RTAX_AUTHOR: CInt = 6
public const val RTAX_BRD: CInt = 7

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr?
public expect fun fDCLR(fd: CInt, set: FdSet?)
public expect fun fDISSET(fd: CInt, set: FdSet?): Boolean
public expect fun fDSET(fd: CInt, set: FdSet?)
public expect fun fDZERO(set: FdSet?)

public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt
public expect fun setrlimit(resource: CInt, rlim: Rlimit?): CInt
public expect fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt
public expect fun abs(i: CInt): CInt
public expect fun labs(i: CLong): CLong
public expect fun rand(): CInt
public expect fun srand(seed: CUInt)
public expect fun getifaddrs(ifap: COpaquePointer?): CInt
public expect fun freeifaddrs(ifa: Ifaddrs?)
public expect fun setgroups(ngroups: CInt, ptr: GidT?): CInt
public expect fun setlogin(name: String?): CInt
public expect fun ioctl(fd: CInt, request: CULong, vararg args: Any?): CInt
public expect fun kqueue(): CInt
public expect fun unmount(target: String?, arg: CInt): CInt
public expect fun syscall(num: CInt, vararg args: Any?): CInt
public expect fun getpwent(): Passwd?
public expect fun setpwent()
public expect fun endpwent()
public expect fun endgrent()
public expect fun getgrent(): Group?
public expect fun getprogname(): String?
public expect fun setprogname(name: String?)
public expect fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt
public expect fun ifNameindex(): IfNameindex?
public expect fun ifFreenameindex(ptr: IfNameindex?)
public expect fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt
public expect fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt
public expect fun globfree(pglob: GlobT?)
public expect fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt
public expect fun shmUnlink(name: String?): CInt
public expect fun seekdir(dirp: DIR?, loc: CLong)
public expect fun telldir(dirp: DIR?): CLong
public expect fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt
public expect fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt
public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT
public expect fun mkstemps(template: String?, suffixlen: CInt): CInt
public expect fun futimes(fd: CInt, times: Timeval?): CInt
public expect fun nlLanginfo(item: NlItem): String?
public expect fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt
public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT
public expect fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT
public expect fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT
public expect fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT
public expect fun sync()
public expect fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt
public expect fun sigsuspend(mask: SigsetT?): CInt
public expect fun semClose(sem: SemT?): CInt
public expect fun getdtablesize(): CInt
public expect fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt
public expect fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT?
public expect fun getgrnam(name: String?): Group?
public expect fun pthreadCancel(thread: PthreadT): CInt
public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt
public expect fun schedGetPriorityMin(policy: CInt): CInt
public expect fun schedGetPriorityMax(policy: CInt): CInt
public expect fun semUnlink(name: String?): CInt
public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun sigwait(set: SigsetT?, sig: CInt?): CInt
public expect fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt
public expect fun getgrgid(gid: GidT): Group?
public expect fun popen(command: String?, mode: String?): FILE?
public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt
public expect fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt
public expect fun acct(filename: String?): CInt
public expect fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT
public expect fun getitimer(which: CInt, currValue: Itimerval?): CInt
public expect fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt
public expect fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt
public expect fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt
public expect fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong
public expect fun regfree(preg: RegexT?)
public expect fun arc4random(): UInt
public expect fun arc4randomBuf(buf: COpaquePointer?, size: ULong)
public expect fun arc4randomUniform(l: UInt): UInt
public expect fun drand48(): CDouble
public expect fun erand48(xseed: CUShort?): CDouble
public expect fun lrand48(): CLong
public expect fun nrand48(xseed: CUShort?): CLong
public expect fun mrand48(): CLong
public expect fun jrand48(xseed: CUShort?): CLong
public expect fun srand48(seed: CLong)
public expect fun seed48(xseed: CUShort?): CUShort?
public expect fun lcong48(p: CUShort?)
public expect fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt
public expect fun strftime(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong
public expect fun strftimeL(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?, locale: LocaleT): ULong
public expect fun devname(dev: DevT, modeT: ModeT): String?
public expect fun issetugid(): CInt
