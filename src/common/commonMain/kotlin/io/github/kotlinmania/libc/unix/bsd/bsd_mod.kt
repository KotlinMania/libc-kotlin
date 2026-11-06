// port-lint: source unix/bsd/bsd_mod.rs
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CcT
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.DevT
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.GlobT
import io.github.kotlinmania.libc.Group
import io.github.kotlinmania.libc.In6Addr
import io.github.kotlinmania.libc.InPortT
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.Itimerval
import io.github.kotlinmania.libc.LocaleT
import io.github.kotlinmania.libc.ModeT
import io.github.kotlinmania.libc.NlItem
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.PthreadAttrT
import io.github.kotlinmania.libc.Rlimit
import io.github.kotlinmania.libc.Rusage
import io.github.kotlinmania.libc.SigsetT
import io.github.kotlinmania.libc.TcflagT
import io.github.kotlinmania.libc.TimeT
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.Tm
import io.github.kotlinmania.libc.UidT
import io.github.kotlinmania.libc.UintptrT

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

public open class Sockaddr(
    public var saLen: UByte,
    public var saFamily: SaFamilyT,
    public var saData: List<CChar>,
)

public open class SockaddrIn6(
    public var sin6Len: UByte,
    public var sin6Family: SaFamilyT,
    public var sin6Port: InPortT,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: UInt,
)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwChange: TimeT,
    public var pwClass: COpaquePointer?,
    public var pwGecos: COpaquePointer?,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
    public var pwExpire: TimeT,
    public var pwFields: CInt,
)

public open class Ifaddrs(
    public var ifaNext: Ifaddrs?,
    public var ifaName: COpaquePointer?,
    public var ifaFlags: CUint,
    public var ifaAddr: io.github.kotlinmania.libc.Sockaddr?,
    public var ifaNetmask: io.github.kotlinmania.libc.Sockaddr?,
    public var ifaDstaddr: io.github.kotlinmania.libc.Sockaddr?,
    public var ifaData: COpaquePointer?,
    public var ifaAddrflags: CUint,
)

public open class FdSet(public var fdsBits: List<Long>)

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: io.github.kotlinmania.libc.SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: CInt,
    public var msgControl: COpaquePointer?,
    public var msgControllen: io.github.kotlinmania.libc.SocklenT,
    public var msgFlags: CInt,
)

public open class Cmsghdr(
    public var cmsgLen: io.github.kotlinmania.libc.SocklenT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class FsidT(public var fsidVal: List<Int>)

public open class IfNameindex(public var ifIndex: CUint, public var ifName: COpaquePointer?)

public open class RegexT(
    public var reMagic: CInt,
    public var reNsub: SizeT,
    public var reEndp: COpaquePointer?,
    public var reG: COpaquePointer?,
)

public open class RegmatchT(public var rmSo: RegoffT, public var rmEo: RegoffT)

public open class Option(
    public var name: COpaquePointer?,
    public var hasArg: CInt,
    public var flag: CInt?,
    public var value: CInt,
)

public open class SockaddrUn(
    public var sunLen: UByte,
    public var sunFamily: SaFamilyT,
    public var sunPath: List<CChar>,
)

public open class Utsname(
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
)

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

public val POSIX_VDISABLE: CcT = 0xff

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

public val BIOCGBLEN: CUlong = 0x40044266uL

public val BIOCSBLEN: CUlong = 0xc0044266uL

public val BIOCFLUSH: CUint = 0x20004268u

public val BIOCPROMISC: CUint = 0x20004269u

public val BIOCGDLT: CUlong = 0x4004426auL

public val BIOCGETIF: CUlong = 0x4020426buL

public val BIOCSETIF: CUlong = 0x8020426cuL

public val BIOCGSTATS: CUlong = 0x4008426fuL

public val BIOCIMMEDIATE: CUlong = 0x80044270uL

public val BIOCVERSION: CUlong = 0x40044271uL

public val BIOCGHDRCMPLT: CUlong = 0x40044274uL

public val BIOCSHDRCMPLT: CUlong = 0x80044275uL

public val SIOCGIFADDR: CUlong = 0xc0206921uL

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

public fun cmsgFirsthdr(mhdr: io.github.kotlinmania.libc.Msghdr?): Cmsghdr? {
    return if ((mhdr!!.msgControllen).toInt() >= sizeOf<Cmsghdr>()) {
        (if (mhdr!!.msgControl == null) null else Cmsghdr())
    } else {
        null
    }
}

public fun fdClr(fd: CInt, set: FdSet?) {
    val bits = 8 * 8
    val fd1 = fd.toInt()
    set!!.fdsBits[fd1 / bits] = set!!.fdsBits[fd1 / bits] and (1L shl (fd1 % bits)).inv()
    return
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val bits = 8 * 8
    val fd1 = fd.toInt()
    return (set!!.fdsBits[fd1 / bits] and (1L shl (fd1 % bits))) != 0L
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val bits = 8 * 8
    val fd1 = fd.toInt()
    set!!.fdsBits[fd1 / bits] = set!!.fdsBits[fd1 / bits] or (1L shl (fd1 % bits))
    return
}

public fun fdZero(set: FdSet?) {
    for (idx in (set!!.fdsBits).indices) {
        (set!!.fdsBits)[idx] = 0L
    }
}

public fun wtermsig(status: CInt): CInt {
    return status and 127
}

public fun wifexited(status: CInt): Boolean {
    return (status and 127) == 0
}

public fun wexitstatus(status: CInt): CInt {
    return (status shr 8) and 0x00ff
}

public fun wcoredump(status: CInt): Boolean {
    return (status and 128) != 0
}

public fun qcmd(cmd: CInt, type: CInt): CInt {
    return (cmd shl 8) or (type and 0x00ff)
}

public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun setrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun getifaddrs(ifap: COpaquePointer?): CInt

public expect fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?)

public expect fun setgroups(ngroups: CInt, ptr: GidT?): CInt

public expect fun setlogin(name: String?): CInt

public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

public expect fun kqueue(): CInt

public expect fun unmount(target: String?, arg: CInt): CInt

public expect fun syscall(num: CInt, vararg variadicArgs: Long): CInt

public expect fun getpwent(): Passwd?

public expect fun setpwent()

public expect fun endpwent()

public expect fun endgrent()

public expect fun getgrent(): Group?

public expect fun getprogname(): COpaquePointer?

public expect fun setprogname(name: String?)

public expect fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt

public expect fun ifNameindex(): IfNameindex?

public expect fun ifFreenameindex(ptr: IfNameindex?)

public expect fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt

public expect fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: GlobT?): CInt

public expect fun globfree(pglob: GlobT?)

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT

public expect fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt

public expect fun futimes(fd: CInt, times: Timeval?): CInt

public expect fun nlLanginfo(item: NlItem): COpaquePointer?

public expect fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt

public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT

public expect fun sync()

public expect fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt

public expect fun sigsuspend(mask: SigsetT?): CInt

public expect fun semClose(sem: SemT?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): SemT?

public expect fun getgrnam(name: String?): Group?

public expect fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt

public expect fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun sigwait(set: SigsetT?, sig: CInt?): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): Group?

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun pthreadCreate(native: UintptrT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun acct(filename: String?): CInt

public expect fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT

public expect fun getitimer(which: CInt, currValue: Itimerval?): CInt

public expect fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt

public expect fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt

public expect fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT

public expect fun regfree(preg: RegexT?)

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(buf: COpaquePointer?, size: SizeT)

public expect fun arc4randomUniform(l: UInt): UInt

public expect fun drand48(): CDouble

public expect fun erand48(xseed: CUshort?): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: CUshort?): CLong

public expect fun mrand48(): CLong

public expect fun jrand48(xseed: CUshort?): CLong

public expect fun srand48(seed: CLong)

public expect fun seed48(xseed: CUshort?): CUshort?

public expect fun lcong48(p: CUshort?)

public expect fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt

public expect fun strftime(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?): SizeT

public expect fun strftimeL(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?, locale: LocaleT): SizeT

public expect fun devname(dev: DevT, modeT: ModeT): COpaquePointer?

public expect fun issetugid(): CInt
