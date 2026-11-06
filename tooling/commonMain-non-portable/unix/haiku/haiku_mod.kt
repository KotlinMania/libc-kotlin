// port-lint: source unix/haiku/haiku_mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CMSG_FIRSTHDR
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CcT
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.Group
import io.github.kotlinmania.libc.In6Addr
import io.github.kotlinmania.libc.InAddrT
import io.github.kotlinmania.libc.InPortT
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.Itimerval
import io.github.kotlinmania.libc.LocaleT
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.Pollfd
import io.github.kotlinmania.libc.Rlimit
import io.github.kotlinmania.libc.SighandlerT
import io.github.kotlinmania.libc.Sigval
import io.github.kotlinmania.libc.TimeT
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.UidT
import io.github.kotlinmania.libc.UintptrT

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface LsearchComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?): CInt
}

// This module contains bindings to the native Haiku API. The Haiku API
// originates from BeOS, and it was the original way to perform low level
// system and IO operations. The POSIX API was in that era was like a
// compatibility layer. In current Haiku development, both the POSIX API and
// the Haiku API are considered to be co-equal status. However, they are not
// integrated like they are on other UNIX platforms, which means that for many
// low level concepts there are two versions, like processes (POSIX) and
// teams (Haiku), or pthreads and native threads.
//
// Both the POSIX API and the Haiku API live in libroot.so, the library that is
// linked to any binary by default. Additionally, Haiku supports several
// non-POSIX APIs from BSD and GNU, which live in libbsd.so and libgnu.so. These
// modules are also supported.
//
// The module is comprised of the following files:
// - `mod.rs` (this file) implements the C11 and POSIX API found in
// `headers / posix`
// - `b32.rs`, `b64.rs` and `x8664.rs` contain platform-specific definitions
// of the C11 and POSIX APIs
// - `native.rs` defines the native Haiku API that is implemented in
// `libroot.so` and that are found in `headers / os`.
// - `bsd.rs` defines the BSD customizations available on Haiku found in
// `headers / compatibility / bsd`
public typealias RlimT = UintptrT

public typealias SaFamilyT = UByte

public typealias PthreadKeyT = CInt

public typealias NfdsT = CUlong

public typealias TcflagT = CUint

public typealias SpeedT = CUchar

public typealias ClockT = Int

public typealias ClockidT = Int

public typealias SusecondsT = Int

public typealias WcharT = Int

public typealias OffT = Long

public typealias InoT = Long

public typealias BlkcntT = Long

public typealias BlksizeT = Int

public typealias DevT = Int

public typealias ModeT = UInt

public typealias NlinkT = Int

public typealias UsecondsT = UInt

public typealias SocklenT = UInt

public typealias PthreadT = UintptrT

public typealias PthreadCondattrT = UintptrT

public typealias PthreadMutexattrT = UintptrT

public typealias PthreadRwlockattrT = UintptrT

public typealias SigsetT = ULong

public typealias FsblkcntT = Long

public typealias FsfilcntT = Long

public typealias PthreadAttrT = COpaquePointer?

public typealias NlItem = CInt

public typealias IdT = Int

public typealias IdtypeT = CInt

public typealias FdMask = UInt

public typealias RegoffT = CInt

public typealias KeyT = Int

public typealias MsgqnumT = UInt

public typealias MsglenT = UInt

public typealias Elf32Addr = UInt

public typealias Elf32Half = UShort

public typealias Elf32Off = UInt

public typealias Elf32Sword = Int

public typealias Elf32Word = UInt

public typealias Elf64Addr = ULong

public typealias Elf64Half = UShort

public typealias Elf64Off = ULong

public typealias Elf64Sword = Int

public typealias Elf64Sxword = Long

public typealias Elf64Word = UInt

public typealias Elf64Xword = ULong

public typealias Action = CInt

public typealias PosixSpawnattrT = COpaquePointer?

public typealias PosixSpawnFileActionsT = COpaquePointer?

public sealed class Timezone {
}

public open class InAddr(public var sAddr: InAddrT)

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class Sockaddr(
    public var saLen: UByte,
    public var saFamily: SaFamilyT,
    public var saData: List<UByte>,
)

public open class SockaddrIn(
    public var sinLen: UByte,
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: io.github.kotlinmania.libc.InAddr,
    public var sinZero: List<Byte>,
)

public open class SockaddrIn6(
    public var sin6Len: UByte,
    public var sin6Family: UByte,
    public var sin6Port: UShort,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: UInt,
)

public open class Addrinfo(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SocklenT,
    public var aiCanonname: COpaquePointer?,
    public var aiAddr: io.github.kotlinmania.libc.Sockaddr?,
    public var aiNext: Addrinfo?,
)

public open class Ifaddrs(
    public var ifaNext: Ifaddrs?,
    public var ifaName: COpaquePointer?,
    public var ifaFlags: CUint,
    public var ifaAddr: io.github.kotlinmania.libc.Sockaddr?,
    public var ifaNetmask: io.github.kotlinmania.libc.Sockaddr?,
    public var ifaDstaddr: io.github.kotlinmania.libc.Sockaddr?,
    public var ifaData: COpaquePointer?,
)

public open class FdSet(
    // size for 1024 bits, and a fdMask with size u32
    public var fdsBits: List<FdMask>,
)

public open class Tm(
    public var tmSec: CInt,
    public var tmMin: CInt,
    public var tmHour: CInt,
    public var tmMday: CInt,
    public var tmMon: CInt,
    public var tmYear: CInt,
    public var tmWday: CInt,
    public var tmYday: CInt,
    public var tmIsdst: CInt,
    public var tmGmtoff: CInt,
    public var tmZone: COpaquePointer?,
)

public open class Utsname(
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
)

public open class Lconv(
    public var decimalPoint: COpaquePointer?,
    public var thousandsSep: COpaquePointer?,
    public var grouping: COpaquePointer?,
    public var intCurrSymbol: COpaquePointer?,
    public var currencySymbol: COpaquePointer?,
    public var monDecimalPoint: COpaquePointer?,
    public var monThousandsSep: COpaquePointer?,
    public var monGrouping: COpaquePointer?,
    public var positiveSign: COpaquePointer?,
    public var negativeSign: COpaquePointer?,
    public var intFracDigits: CChar,
    public var fracDigits: CChar,
    public var pCsPrecedes: CChar,
    public var pSepBySpace: CChar,
    public var nCsPrecedes: CChar,
    public var nSepBySpace: CChar,
    public var pSignPosn: CChar,
    public var nSignPosn: CChar,
    public var intPCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intNCsPrecedes: CChar,
    public var intNSepBySpace: CChar,
    public var intPSignPosn: CChar,
    public var intNSignPosn: CChar,
)

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: CInt,
    public var msgControl: COpaquePointer?,
    public var msgControllen: SocklenT,
    public var msgFlags: CInt,
)

public open class Cmsghdr(
    public var cmsgLen: io.github.kotlinmania.libc.SocklenT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class DlInfo(
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
)

public open class Termios(
    public var cIflag: io.github.kotlinmania.libc.TcflagT,
    public var cOflag: io.github.kotlinmania.libc.TcflagT,
    public var cCflag: io.github.kotlinmania.libc.TcflagT,
    public var cLflag: io.github.kotlinmania.libc.TcflagT,
    public var cLine: CChar,
    public var cIspeed: io.github.kotlinmania.libc.SpeedT,
    public var cOspeed: io.github.kotlinmania.libc.SpeedT,
    public var cCc: List<CcT>,
)

public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: PidT,
)

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stSize: OffT,
    public var stRdev: DevT,
    public var stBlksize: BlksizeT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var stCrtime: TimeT,
    public var stCrtimeNsec: CLong,
    public var stType: UInt,
    public var stBlocks: BlkcntT,
)

public open class GlobT(
    public var glPathc: SizeT,
    public var unused1: SizeT,
    public var glOffs: SizeT,
    public var unused2: SizeT,
    public var glPathv: COpaquePointer?,
    public var unused3: COpaquePointer?,
    public var unused4: COpaquePointer?,
    public var unused5: COpaquePointer?,
    public var unused6: COpaquePointer?,
    public var unused7: COpaquePointer?,
    public var unused8: COpaquePointer?,
)

public open class PthreadMutexT(
    public var flags: UInt,
    public var lock: Int,
    public var unused: Int,
    public var owner: Int,
    public var ownerCount: Int,
)

public open class PthreadCondT(
    public var flags: UInt,
    public var unused: Int,
    public var mutex: COpaquePointer?,
    public var waiterCount: Int,
    public var lock: Int,
)

public open class PthreadRwlockT(
    public var flags: UInt,
    public var owner: Int,
    public var lockSem: Int,
    // this is actually a union
    public var lockCount: Int,
    public var readerCount: Int,
    public var writerCount: Int,
    public var waiters: List<COpaquePointer?>,
)

public open class PthreadSpinlockT(public var lock: UInt)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
    public var pwGecos: COpaquePointer?,
)

public open class Statvfs(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: io.github.kotlinmania.libc.FsblkcntT,
    public var fBfree: io.github.kotlinmania.libc.FsblkcntT,
    public var fBavail: io.github.kotlinmania.libc.FsblkcntT,
    public var fFiles: io.github.kotlinmania.libc.FsfilcntT,
    public var fFfree: io.github.kotlinmania.libc.FsfilcntT,
    public var fFavail: io.github.kotlinmania.libc.FsfilcntT,
    public var fFsid: CUlong,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siErrno: CInt,
    public var siPid: PidT,
    public var siUid: UidT,
    public var siAddr: COpaquePointer?,
    public var siStatus: CInt,
    public var siBand: CLong,
    public var sigval: COpaquePointer?,
) {
    public open fun siAddr(): COpaquePointer? {
        return this.siAddr
    }

    public open fun siPid(): PidT {
        return this.siPid
    }

    public open fun siUid(): UidT {
        return this.siUid
    }

    public open fun siStatus(): CInt {
        return this.siStatus
    }
}

public open class Sigaction(
    public var saSigaction: SighandlerT,
    // actually a union with saHandler
    public var saMask: io.github.kotlinmania.libc.SigsetT,
    public var saFlags: CInt,
    public var saUserdata: COpaquePointer?,
)

public open class SemT(
    public var type: Int,
    public var namedSemId: Int,
    // actually a union with unnamedSem (i32)
    public var padding: List<Int>,
)

public open class Ucred(
    public var pid: PidT,
    public var uid: UidT,
    public var gid: GidT,
)

public open class SockaddrDl(
    public var sdlLen: UByte,
    public var sdlFamily: UByte,
    public var sdlEType: UShort,
    public var sdlIndex: UInt,
    public var sdlType: UByte,
    public var sdlNlen: UByte,
    public var sdlAlen: UByte,
    public var sdlSlen: UByte,
    public var sdlData: List<UByte>,
)

public open class Spwd(
    public var spNamp: COpaquePointer?,
    public var spPwdp: COpaquePointer?,
    public var spLstchg: CInt,
    public var spMin: CInt,
    public var spMax: CInt,
    public var spWarn: CInt,
    public var spInact: CInt,
    public var spExpire: CInt,
    public var spFlag: CInt,
)

public open class RegexT(
    public var buffer: COpaquePointer?,
    public var allocated: SizeT,
    public var used: SizeT,
    public var syntax: CUlong,
    public var fastmap: COpaquePointer?,
    public var translate: COpaquePointer?,
    public var reNsub: SizeT,
    public var bitfield: UByte,
)

public open class RegmatchT(public var rmSo: RegoffT, public var rmEo: RegoffT)

public open class MsqidDs(
    public var msgPerm: io.github.kotlinmania.libc.IpcPerm,
    public var msgQnum: io.github.kotlinmania.libc.MsgqnumT,
    public var msgQbytes: io.github.kotlinmania.libc.MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var msgStime: TimeT,
    public var msgRtime: TimeT,
    public var msgCtime: TimeT,
)

public open class IpcPerm(
    public var key: io.github.kotlinmania.libc.KeyT,
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: ModeT,
)

public open class Sembuf(
    public var semNum: CUshort,
    public var semOp: CShort,
    public var semFlg: CShort,
)

public open class Entry(public var key: COpaquePointer?, public var data: COpaquePointer?)

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

public open class SockaddrStorage(
    public var ssLen: UByte,
    public var ssFamily: SaFamilyT,
    public var ssPad1: List<UByte>,
    public var ssPad2: ULong,
    public var ssPad3: List<UByte>,
)

public open class Dirent(
    public var dDev: DevT,
    public var dPdev: DevT,
    public var dIno: InoT,
    public var dPino: Long,
    public var dReclen: CUshort,
    public var dName: List<CChar>,
)

public open class Sigevent(
    public var sigevNotify: CInt,
    public var sigevSigno: CInt,
    public var sigevValue: Sigval,
    public var unused1: COpaquePointer?,
    // actually a function pointer
    public var sigevNotifyAttributes: COpaquePointer?,
)

public open class Utmpx(
    public var utType: CShort,
    public var utTv: Timeval,
    public var utId: List<CChar>,
    public var utPid: PidT,
    public var utUser: List<CChar>,
    public var utLine: List<CChar>,
    public var utHost: List<CChar>,
    public var utReserved: List<CChar>,
)

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val RAND_MAX: CInt = 2147483647

public val EOF: CInt = -1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val L_SET: CInt = SEEK_SET

public val L_INCR: CInt = SEEK_CUR

public val L_XTND: CInt = SEEK_END

public val IOFBF: CInt = 0

public val IONBF: CInt = 2

public val IOLBF: CInt = 1

public val F_DUPFD: CInt = 0x0001

public val F_GETFD: CInt = 0x0002

public val F_SETFD: CInt = 0x0004

public val F_GETFL: CInt = 0x0008

public val F_SETFL: CInt = 0x0010

public val F_GETLK: CInt = 0x0020

public val F_SETLK: CInt = 0x0080

public val F_SETLKW: CInt = 0x0100

public val F_DUPFD_CLOEXEC: CInt = 0x0200

public val F_RDLCK: CInt = 0x0040

public val F_UNLCK: CInt = 0x0200

public val F_WRLCK: CInt = 0x0400

public val AT_FDCWD: CInt = -100

public val AT_SYMLINK_NOFOLLOW: CInt = 0x01

public val AT_SYMLINK_FOLLOW: CInt = 0x02

public val AT_REMOVEDIR: CInt = 0x04

public val AT_EACCESS: CInt = 0x08

public val POLLIN: CShort = 0x0001

public val POLLOUT: CShort = 0x0002

public val POLLRDNORM: CShort = POLLIN

public val POLLWRNORM: CShort = POLLOUT

public val POLLRDBAND: CShort = 0x0008

public val POLLWRBAND: CShort = 0x0010

public val POLLPRI: CShort = 0x0020

public val POLLERR: CShort = 0x0004

public val POLLHUP: CShort = 0x0080

public val POLLNVAL: CShort = 0x1000

public val PTHREAD_CREATE_JOINABLE: CInt = 0

public val PTHREAD_CREATE_DETACHED: CInt = 1

public val CLOCK_REALTIME: CInt = -1

public val CLOCK_MONOTONIC: CInt = 0

public val CLOCK_PROCESS_CPUTIME_ID: CInt = -2

public val CLOCK_THREAD_CPUTIME_ID: CInt = -3

public val RLIMIT_CORE: CInt = 0

public val RLIMIT_CPU: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_FSIZE: CInt = 3

public val RLIMIT_NOFILE: CInt = 4

public val RLIMIT_STACK: CInt = 5

public val RLIMIT_AS: CInt = 6

public val RLIM_INFINITY: io.github.kotlinmania.libc.RlimT = 0xffffffffuL

// Haiku specific
public val RLIMIT_NOVMON: CInt = 7

public val RLIM_NLIMITS: CInt = 8

public val RUSAGE_SELF: CInt = 0

public val RTLD_LAZY: CInt = 0

public val NCCS: Int = 11

public val O_RDONLY: CInt = 0x0000

public val O_WRONLY: CInt = 0x0001

public val O_RDWR: CInt = 0x0002

public val O_ACCMODE: CInt = 0x0003

public val O_EXCL: CInt = 0x0100

public val O_CREAT: CInt = 0x0200

public val O_TRUNC: CInt = 0x0400

public val O_NOCTTY: CInt = 0x1000

public val O_NOTRAVERSE: CInt = 0x2000

public val O_CLOEXEC: CInt = 0x00000040

public val O_NONBLOCK: CInt = 0x00000080

public val O_APPEND: CInt = 0x00000800

public val O_SYNC: CInt = 0x00010000

public val O_RSYNC: CInt = 0x00020000

public val O_DSYNC: CInt = 0x00040000

public val O_NOFOLLOW: CInt = 0x00080000

public val O_NOCACHE: CInt = 0x00100000

public val O_DIRECTORY: CInt = 0x00200000

public val S_IFIFO: ModeT = 4096u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFDIR: ModeT = 16384u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFMT: ModeT = 61440u

public val S_IRWXU: ModeT = 448u

public val S_IRUSR: ModeT = 256u

public val S_IWUSR: ModeT = 128u

public val S_IXUSR: ModeT = 64u

public val S_IRWXG: ModeT = 56u

public val S_IRGRP: ModeT = 32u

public val S_IWGRP: ModeT = 16u

public val S_IXGRP: ModeT = 8u

public val S_IRWXO: ModeT = 7u

public val S_IROTH: ModeT = 4u

public val S_IWOTH: ModeT = 2u

public val S_IXOTH: ModeT = 1u

public val F_OK: CInt = 0

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGCHLD: CInt = 5

public val SIGABRT: CInt = 6

public val SIGPIPE: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGSTOP: CInt = 10

public val SIGSEGV: CInt = 11

public val SIGCONT: CInt = 12

public val SIGTSTP: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val SIGTTIN: CInt = 16

public val SIGTTOU: CInt = 17

public val SIGUSR1: CInt = 18

public val SIGUSR2: CInt = 19

public val SIGWINCH: CInt = 20

public val SIGKILLTHR: CInt = 21

public val SIGTRAP: CInt = 22

public val SIGPOLL: CInt = 23

public val SIGPROF: CInt = 24

public val SIGSYS: CInt = 25

public val SIGURG: CInt = 26

public val SIGVTALRM: CInt = 27

public val SIGXCPU: CInt = 28

public val SIGXFSZ: CInt = 29

public val SIGBUS: CInt = 30

public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

public val SIG_SETMASK: CInt = 3

public val SIGEV_NONE: CInt = 0

public val SIGEV_SIGNAL: CInt = 1

public val SIGEV_THREAD: CInt = 2

public val EAI_AGAIN: CInt = 2

public val EAI_BADFLAGS: CInt = 3

public val EAI_FAIL: CInt = 4

public val EAI_FAMILY: CInt = 5

public val EAI_MEMORY: CInt = 6

public val EAI_NODATA: CInt = 7

public val EAI_NONAME: CInt = 8

public val EAI_SERVICE: CInt = 9

public val EAI_SOCKTYPE: CInt = 10

public val EAI_SYSTEM: CInt = 11

public val EAI_OVERFLOW: CInt = 14

public val PROT_NONE: CInt = 0

public val PROT_READ: CInt = 1

public val PROT_WRITE: CInt = 2

public val PROT_EXEC: CInt = 4

public val LC_ALL: CInt = 0

public val LC_COLLATE: CInt = 1

public val LC_CTYPE: CInt = 2

public val LC_MONETARY: CInt = 3

public val LC_NUMERIC: CInt = 4

public val LC_TIME: CInt = 5

public val LC_MESSAGES: CInt = 6

// Note(haiku): Haiku does not have MAP_FILE, but library/std/os.rs requires it
public val MAP_FILE: CInt = 0x00

public val MAP_SHARED: CInt = 0x01

public val MAP_PRIVATE: CInt = 0x02

public val MAP_FIXED: CInt = 0x04

public val MAP_ANONYMOUS: CInt = 0x08

public val MAP_NORESERVE: CInt = 0x10

public val MAP_ANON: CInt = MAP_ANONYMOUS

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

public val MS_ASYNC: CInt = 0x01

public val MS_INVALIDATE: CInt = 0x04

public val MS_SYNC: CInt = 0x02

public val E2BIG: CInt = -2147454975

public val ECHILD: CInt = -2147454974

public val EDEADLK: CInt = -2147454973

public val EFBIG: CInt = -2147454972

public val EMLINK: CInt = -2147454971

public val ENFILE: CInt = -2147454970

public val ENODEV: CInt = -2147454969

public val ENOLCK: CInt = -2147454968

public val ENOSYS: CInt = -2147454967

public val ENOTTY: CInt = -2147454966

public val ENXIO: CInt = -2147454965

public val ESPIPE: CInt = -2147454964

public val ESRCH: CInt = -2147454963

public val EFPOS: CInt = -2147454962

public val ESIGPARM: CInt = -2147454961

public val EDOM: CInt = -2147454960

public val ERANGE: CInt = -2147454959

public val EPROTOTYPE: CInt = -2147454958

public val EPROTONOSUPPORT: CInt = -2147454957

public val EPFNOSUPPORT: CInt = -2147454956

public val EAFNOSUPPORT: CInt = -2147454955

public val EADDRINUSE: CInt = -2147454954

public val EADDRNOTAVAIL: CInt = -2147454953

public val ENETDOWN: CInt = -2147454952

public val ENETUNREACH: CInt = -2147454951

public val ENETRESET: CInt = -2147454950

public val ECONNABORTED: CInt = -2147454949

public val ECONNRESET: CInt = -2147454948

public val EISCONN: CInt = -2147454947

public val ENOTCONN: CInt = -2147454946

public val ESHUTDOWN: CInt = -2147454945

public val ECONNREFUSED: CInt = -2147454944

public val EHOSTUNREACH: CInt = -2147454943

public val ENOPROTOOPT: CInt = -2147454942

public val ENOBUFS: CInt = -2147454941

public val EINPROGRESS: CInt = -2147454940

public val EALREADY: CInt = -2147454939

public val EILSEQ: CInt = -2147454938

public val ENOMSG: CInt = -2147454937

public val ESTALE: CInt = -2147454936

public val EOVERFLOW: CInt = -2147454935

public val EMSGSIZE: CInt = -2147454934

public val EOPNOTSUPP: CInt = -2147454933

public val ENOTSOCK: CInt = -2147454932

public val EHOSTDOWN: CInt = -2147454931

public val EBADMSG: CInt = -2147454930

public val ECANCELED: CInt = -2147454929

public val EDESTADDRREQ: CInt = -2147454928

public val EDQUOT: CInt = -2147454927

public val EIDRM: CInt = -2147454926

public val EMULTIHOP: CInt = -2147454925

public val ENODATA: CInt = -2147454924

public val ENOLINK: CInt = -2147454923

public val ENOSR: CInt = -2147454922

public val ENOSTR: CInt = -2147454921

public val ENOTSUP: CInt = -2147454920

public val EPROTO: CInt = -2147454919

public val ETIME: CInt = -2147454918

public val ETXTBSY: CInt = -2147454917

public val ENOATTR: CInt = -2147454916

// INT_MIN
public val ENOMEM: CInt = -2147483648

// POSIX errors that can be mapped to BeOS error codes
public val EACCES: CInt = -2147483646

public val EINTR: CInt = -2147483638

public val EIO: CInt = -2147483647

public val EBUSY: CInt = -2147483634

public val EFAULT: CInt = -2147478783

public val ETIMEDOUT: CInt = -2147483639

public val EAGAIN: CInt = -2147483637

public val EWOULDBLOCK: CInt = -2147483637

public val EBADF: CInt = -2147459072

public val EEXIST: CInt = -2147459070

public val EINVAL: CInt = -2147483643

public val ENAMETOOLONG: CInt = -2147459068

public val ENOENT: CInt = -2147459069

public val EPERM: CInt = -2147483633

public val ENOTDIR: CInt = -2147459067

public val EISDIR: CInt = -2147459063

public val ENOTEMPTY: CInt = -2147459066

public val ENOSPC: CInt = -2147459065

public val EROFS: CInt = -2147459064

public val EMFILE: CInt = -2147459062

public val EXDEV: CInt = -2147459061

public val ELOOP: CInt = -2147459060

public val ENOEXEC: CInt = -2147478782

public val EPIPE: CInt = -2147459059

public val IPPROTO_RAW: CInt = 255

// These are prefixed with POSIX_ on Haiku
public val MADV_NORMAL: CInt = 1

public val MADV_SEQUENTIAL: CInt = 2

public val MADV_RANDOM: CInt = 3

public val MADV_WILLNEED: CInt = 4

public val MADV_DONTNEED: CInt = 5

public val MADV_FREE: CInt = 6

// https://github.com/haiku/haiku/blob/HEAD/headers/posix/net/if.h#L80
public val IFF_UP: CInt = 0x0001

public val IFF_BROADCAST: CInt = 0x0002

// valid broadcast address
public val IFF_LOOPBACK: CInt = 0x0008

public val IFF_POINTOPOINT: CInt = 0x0010

// point-to-point link
public val IFF_NOARP: CInt = 0x0040

// no address resolution
public val IFF_AUTOUP: CInt = 0x0080

// auto dial
public val IFF_PROMISC: CInt = 0x0100

// receive all packets
public val IFF_ALLMULTI: CInt = 0x0200

// receive all multicast packets
public val IFF_SIMPLEX: CInt = 0x0800

// doesn't receive own transmissions
public val IFF_LINK: CInt = 0x1000

// has link
public val IFF_AUTO_CONFIGURED: CInt = 0x2000

public val IFF_CONFIGURING: CInt = 0x4000

public val IFF_MULTICAST: CInt = 0x8000

// supports multicast
public val AF_UNSPEC: CInt = 0

public val AF_INET: CInt = 1

public val AF_APPLETALK: CInt = 2

public val AF_ROUTE: CInt = 3

public val AF_LINK: CInt = 4

public val AF_INET6: CInt = 5

public val AF_DLI: CInt = 6

public val AF_IPX: CInt = 7

public val AF_NOTIFY: CInt = 8

public val AF_LOCAL: CInt = 9

public val AF_UNIX: CInt = AF_LOCAL

public val AF_BLUETOOTH: CInt = 10

public val PF_UNSPEC: CInt = AF_UNSPEC

public val PF_INET: CInt = AF_INET

public val PF_ROUTE: CInt = AF_ROUTE

public val PF_LINK: CInt = AF_LINK

public val PF_INET6: CInt = AF_INET6

public val PF_LOCAL: CInt = AF_LOCAL

public val PF_UNIX: CInt = AF_UNIX

public val PF_BLUETOOTH: CInt = AF_BLUETOOTH

public val IP_OPTIONS: CInt = 1

public val IP_HDRINCL: CInt = 2

public val IP_TOS: CInt = 3

public val IP_TTL: CInt = 4

public val IP_RECVOPTS: CInt = 5

public val IP_RECVRETOPTS: CInt = 6

public val IP_RECVDSTADDR: CInt = 7

public val IP_RETOPTS: CInt = 8

public val IP_MULTICAST_IF: CInt = 9

public val IP_MULTICAST_TTL: CInt = 10

public val IP_MULTICAST_LOOP: CInt = 11

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

public val IP_BLOCK_SOURCE: CInt = 14

public val IP_UNBLOCK_SOURCE: CInt = 15

public val IP_ADD_SOURCE_MEMBERSHIP: CInt = 16

public val IP_DROP_SOURCE_MEMBERSHIP: CInt = 17

public val TCP_NODELAY: CInt = 0x01

public val TCP_MAXSEG: CInt = 0x02

public val TCP_NOPUSH: CInt = 0x04

public val TCP_NOOPT: CInt = 0x08

public val IF_NAMESIZE: SizeT = 32uL

public val IFNAMSIZ: SizeT = IF_NAMESIZE

public val IPV6_MULTICAST_IF: CInt = 24

public val IPV6_MULTICAST_HOPS: CInt = 25

public val IPV6_MULTICAST_LOOP: CInt = 26

public val IPV6_UNICAST_HOPS: CInt = 27

public val IPV6_JOIN_GROUP: CInt = 28

public val IPV6_LEAVE_GROUP: CInt = 29

public val IPV6_V6ONLY: CInt = 30

public val IPV6_PKTINFO: CInt = 31

public val IPV6_RECVPKTINFO: CInt = 32

public val IPV6_HOPLIMIT: CInt = 33

public val IPV6_RECVHOPLIMIT: CInt = 34

public val IPV6_HOPOPTS: CInt = 35

public val IPV6_DSTOPTS: CInt = 36

public val IPV6_RTHDR: CInt = 37

public val MSG_OOB: CInt = 0x0001

public val MSG_PEEK: CInt = 0x0002

public val MSG_DONTROUTE: CInt = 0x0004

public val MSG_EOR: CInt = 0x0008

public val MSG_TRUNC: CInt = 0x0010

public val MSG_CTRUNC: CInt = 0x0020

public val MSG_WAITALL: CInt = 0x0040

public val MSG_DONTWAIT: CInt = 0x0080

public val MSG_BCAST: CInt = 0x0100

public val MSG_MCAST: CInt = 0x0200

public val MSG_EOF: CInt = 0x0400

public val MSG_NOSIGNAL: CInt = 0x0800

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val LOCK_SH: CInt = 0x01

public val LOCK_EX: CInt = 0x02

public val LOCK_NB: CInt = 0x04

public val LOCK_UN: CInt = 0x08

public val MINSIGSTKSZ: SizeT = 8192uL

public val SIGSTKSZ: SizeT = 16384uL

public val IOV_MAX: CInt = 1024

public val PATH_MAX: CInt = 1024

public val SA_NOCLDSTOP: CInt = 0x01

public val SA_NOCLDWAIT: CInt = 0x02

public val SA_RESETHAND: CInt = 0x04

public val SA_NODEFER: CInt = 0x08

public val SA_RESTART: CInt = 0x10

public val SA_ONSTACK: CInt = 0x20

public val SA_SIGINFO: CInt = 0x40

public val SA_NOMASK: CInt = SA_NODEFER

public val SA_STACK: CInt = SA_ONSTACK

public val SA_ONESHOT: CInt = SA_RESETHAND

public val SS_ONSTACK: CInt = 0x1

public val SS_DISABLE: CInt = 0x2

// DIFF(main): changed to `cInt` in 500365e1
public val FD_SETSIZE: Int = 1024

public val RTLD_LOCAL: CInt = 0x0

public val RTLD_NOW: CInt = 0x1

public val RTLD_GLOBAL: CInt = 0x2

public val RTLD_DEFAULT: COpaquePointer? = null

public val BUFSIZ: CUint = 8192u

public val FILENAME_MAX: CUint = 256u

public val FOPEN_MAX: CUint = 128u

public val L_TMPNAM: CUint = 512u

public val TMP_MAX: CUint = 32768u

public val PC_CHOWN_RESTRICTED: CInt = 1

public val PC_MAX_CANON: CInt = 2

public val PC_MAX_INPUT: CInt = 3

public val PC_NAME_MAX: CInt = 4

public val PC_NO_TRUNC: CInt = 5

public val PC_PATH_MAX: CInt = 6

public val PC_PIPE_BUF: CInt = 7

public val PC_VDISABLE: CInt = 8

public val PC_LINK_MAX: CInt = 25

public val PC_SYNC_IO: CInt = 26

public val PC_ASYNC_IO: CInt = 27

public val PC_PRIO_IO: CInt = 28

public val PC_SOCK_MAXBUF: CInt = 29

public val PC_FILESIZEBITS: CInt = 30

public val PC_REC_INCR_XFER_SIZE: CInt = 31

public val PC_REC_MAX_XFER_SIZE: CInt = 32

public val PC_REC_MIN_XFER_SIZE: CInt = 33

public val PC_REC_XFER_ALIGN: CInt = 34

public val PC_ALLOC_SIZE_MIN: CInt = 35

public val PC_SYMLINK_MAX: CInt = 36

public val PC_2_SYMLINKS: CInt = 37

public val PC_XATTR_EXISTS: CInt = 38

public val PC_XATTR_ENABLED: CInt = 39

public val FIONBIO: CUlong = 0xbe000000uL

public val FIONREAD: CUlong = 0xbe000001uL

public val FIOSEEKDATA: CUlong = 0xbe000002uL

public val FIOSEEKHOLE: CUlong = 0xbe000003uL

public val SC_ARG_MAX: CInt = 15

public val SC_CHILD_MAX: CInt = 16

public val SC_CLK_TCK: CInt = 17

public val SC_JOB_CONTROL: CInt = 18

public val SC_NGROUPS_MAX: CInt = 19

public val SC_OPEN_MAX: CInt = 20

public val SC_SAVED_IDS: CInt = 21

public val SC_STREAM_MAX: CInt = 22

public val SC_TZNAME_MAX: CInt = 23

public val SC_VERSION: CInt = 24

public val SC_GETGR_R_SIZE_MAX: CInt = 25

public val SC_GETPW_R_SIZE_MAX: CInt = 26

public val SC_PAGESIZE: CInt = 27

public val SC_PAGE_SIZE: CInt = 27

public val SC_SEM_NSEMS_MAX: CInt = 28

public val SC_SEM_VALUE_MAX: CInt = 29

public val SC_SEMAPHORES: CInt = 30

public val SC_THREADS: CInt = 31

public val SC_IOV_MAX: CInt = 32

public val SC_UIO_MAXIOV: CInt = 32

public val SC_NPROCESSORS_CONF: CInt = 34

public val SC_NPROCESSORS_ONLN: CInt = 35

public val SC_ATEXIT_MAX: CInt = 37

public val SC_PASS_MAX: CInt = 39

public val SC_PHYS_PAGES: CInt = 40

public val SC_AVPHYS_PAGES: CInt = 41

public val SC_PIPE: CInt = 42

public val SC_SELECT: CInt = 43

public val SC_POLL: CInt = 44

public val SC_MAPPED_FILES: CInt = 45

public val SC_THREAD_PROCESS_SHARED: CInt = 46

public val SC_THREAD_STACK_MIN: CInt = 47

public val SC_THREAD_ATTR_STACKADDR: CInt = 48

public val SC_THREAD_ATTR_STACKSIZE: CInt = 49

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 50

public val SC_REALTIME_SIGNALS: CInt = 51

public val SC_MEMORY_PROTECTION: CInt = 52

public val SC_SIGQUEUE_MAX: CInt = 53

public val SC_RTSIG_MAX: CInt = 54

public val SC_MONOTONIC_CLOCK: CInt = 55

public val SC_DELAYTIMER_MAX: CInt = 56

public val SC_TIMER_MAX: CInt = 57

public val SC_TIMERS: CInt = 58

public val SC_CPUTIME: CInt = 59

public val SC_THREAD_CPUTIME: CInt = 60

public val SC_HOST_NAME_MAX: CInt = 61

public val SC_REGEXP: CInt = 62

public val SC_SYMLOOP_MAX: CInt = 63

public val SC_SHELL: CInt = 64

public val SC_TTY_NAME_MAX: CInt = 65

public val SC_ADVISORY_INFO: CInt = 66

public val SC_BARRIERS: CInt = 67

public val SC_CLOCK_SELECTION: CInt = 68

public val SC_FSYNC: CInt = 69

public val SC_IPV6: CInt = 70

public val SC_MEMLOCK: CInt = 71

public val SC_MEMLOCK_RANGE: CInt = 72

public val SC_MESSAGE_PASSING: CInt = 73

public val SC_PRIORITIZED_IO: CInt = 74

public val SC_PRIORITY_SCHEDULING: CInt = 75

public val SC_READER_WRITER_LOCKS: CInt = 76

public val SC_SHARED_MEMORY_OBJECTS: CInt = 77

public val SC_SPAWN: CInt = 78

public val SC_SPIN_LOCKS: CInt = 79

public val SC_SPORADIC_SERVER: CInt = 80

public val SC_SYNCHRONIZED_IO: CInt = 81

public val SC_THREAD_PRIO_INHERIT: CInt = 82

public val SC_THREAD_PRIO_PROTECT: CInt = 83

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 84

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 85

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 86

public val SC_THREAD_SPORADIC_SERVER: CInt = 87

public val SC_TIMEOUTS: CInt = 88

public val SC_TRACE: CInt = 89

public val SC_TRACE_EVENT_FILTER: CInt = 90

public val SC_TRACE_INHERIT: CInt = 91

public val SC_TRACE_LOG: CInt = 92

public val SC_TYPED_MEMORY_OBJECTS: CInt = 93

public val SC_V6_ILP32_OFF32: CInt = 94

public val SC_V6_ILP32_OFFBIG: CInt = 95

public val SC_V6_LP64_OFF64: CInt = 96

public val SC_V6_LPBIG_OFFBIG: CInt = 97

public val SC_V7_ILP32_OFF32: CInt = 98

public val SC_V7_ILP32_OFFBIG: CInt = 99

public val SC_V7_LP64_OFF64: CInt = 100

public val SC_V7_LPBIG_OFFBIG: CInt = 101

public val SC_2_C_BIND: CInt = 102

public val SC_2_C_DEV: CInt = 103

public val SC_2_CHAR_TERM: CInt = 104

public val SC_2_FORT_DEV: CInt = 105

public val SC_2_FORT_RUN: CInt = 106

public val SC_2_LOCALEDEF: CInt = 107

public val SC_2_PBS: CInt = 108

public val SC_2_PBS_ACCOUNTING: CInt = 109

public val SC_2_PBS_CHECKPOINT: CInt = 110

public val SC_2_PBS_LOCATE: CInt = 111

public val SC_2_PBS_MESSAGE: CInt = 112

public val SC_2_PBS_TRACK: CInt = 113

public val SC_2_SW_DEV: CInt = 114

public val SC_2_UPE: CInt = 115

public val SC_2_VERSION: CInt = 116

public val SC_XOPEN_CRYPT: CInt = 117

public val SC_XOPEN_ENH_I18N: CInt = 118

public val SC_XOPEN_REALTIME: CInt = 119

public val SC_XOPEN_REALTIME_THREADS: CInt = 120

public val SC_XOPEN_SHM: CInt = 121

public val SC_XOPEN_STREAMS: CInt = 122

public val SC_XOPEN_UNIX: CInt = 123

public val SC_XOPEN_UUCP: CInt = 124

public val SC_XOPEN_VERSION: CInt = 125

public val SC_BC_BASE_MAX: CInt = 129

public val SC_BC_DIM_MAX: CInt = 130

public val SC_BC_SCALE_MAX: CInt = 131

public val SC_BC_STRING_MAX: CInt = 132

public val SC_COLL_WEIGHTS_MAX: CInt = 133

public val SC_EXPR_NEST_MAX: CInt = 134

public val SC_LINE_MAX: CInt = 135

public val SC_LOGIN_NAME_MAX: CInt = 136

public val SC_MQ_OPEN_MAX: CInt = 137

public val SC_MQ_PRIO_MAX: CInt = 138

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 139

public val SC_THREAD_KEYS_MAX: CInt = 140

public val SC_THREAD_THREADS_MAX: CInt = 141

public val SC_RE_DUP_MAX: CInt = 142

public val PTHREAD_STACK_MIN: SizeT = 8192uL

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(flags = 0, lock = 0, unused = 0, owner = -1, ownerCount = 0)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(flags = 0, unused = 0, mutex = null, waiterCount = 0, lock = 0)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(flags = 0, owner = -1, lockSem = 0, lockCount = 0, readerCount = 0, writerCount = 0, waiters = List(2) { null })

public val PTHREAD_MUTEX_DEFAULT: CInt = 0

public val PTHREAD_MUTEX_NORMAL: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_RECURSIVE: CInt = 3

public val FIOCLEX: CUlong = 0uL

// Note(haiku): does not exist on Haiku!
public val RUSAGE_CHILDREN: CInt = -1

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_RAW: CInt = 3

public val SOCK_SEQPACKET: CInt = 5

public val SOCK_NONBLOCK: CInt = 0x00040000

public val SOCK_CLOEXEC: CInt = 0x00080000

public val SOL_SOCKET: CInt = -1

public val SO_ACCEPTCONN: CInt = 0x00000001

public val SO_BROADCAST: CInt = 0x00000002

public val SO_DEBUG: CInt = 0x00000004

public val SO_DONTROUTE: CInt = 0x00000008

public val SO_KEEPALIVE: CInt = 0x00000010

public val SO_OOBINLINE: CInt = 0x00000020

public val SO_REUSEADDR: CInt = 0x00000040

public val SO_REUSEPORT: CInt = 0x00000080

public val SO_USELOOPBACK: CInt = 0x00000100

public val SO_LINGER: CInt = 0x00000200

public val SO_SNDBUF: CInt = 0x40000001

public val SO_SNDLOWAT: CInt = 0x40000002

public val SO_SNDTIMEO: CInt = 0x40000003

public val SO_RCVBUF: CInt = 0x40000004

public val SO_RCVLOWAT: CInt = 0x40000005

public val SO_RCVTIMEO: CInt = 0x40000006

public val SO_ERROR: CInt = 0x40000007

public val SO_TYPE: CInt = 0x40000008

public val SO_NONBLOCK: CInt = 0x40000009

public val SO_BINDTODEVICE: CInt = 0x4000000a

public val SO_PEERCRED: CInt = 0x4000000b

public val SCM_RIGHTS: CInt = 0x01

public val SOMAXCONN: CInt = 32

public val NI_MAXHOST: SizeT = 1025uL

public val WNOHANG: CInt = 0x01

public val WUNTRACED: CInt = 0x02

public val WCONTINUED: CInt = 0x04

public val WEXITED: CInt = 0x08

public val WSTOPPED: CInt = 0x10

public val WNOWAIT: CInt = 0x20

// siCode values for SIGBUS signal
public val BUS_ADRALN: CInt = 40

public val BUS_ADRERR: CInt = 41

public val BUS_OBJERR: CInt = 42

// siCode values for SIGCHLD signal
public val CLD_EXITED: CInt = 60

public val CLD_KILLED: CInt = 61

public val CLD_DUMPED: CInt = 62

public val CLD_TRAPPED: CInt = 63

public val CLD_STOPPED: CInt = 64

public val CLD_CONTINUED: CInt = 65

public val P_ALL: IdtypeT = 0

public val P_PID: IdtypeT = 1

public val P_PGID: IdtypeT = 2

public val UTIME_OMIT: CLong = 1000000001L

public val UTIME_NOW: CLong = 1000000000L

public val VINTR: Int = 0

public val VQUIT: Int = 1

public val VERASE: Int = 2

public val VKILL: Int = 3

public val VEOF: Int = 4

public val VEOL: Int = 5

public val VMIN: Int = 4

public val VTIME: Int = 5

public val VEOL2: Int = 6

public val VSWTCH: Int = 7

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VSUSP: Int = 10

public val IGNBRK: io.github.kotlinmania.libc.TcflagT = 0x01u

public val BRKINT: io.github.kotlinmania.libc.TcflagT = 0x02u

public val IGNPAR: io.github.kotlinmania.libc.TcflagT = 0x04u

public val PARMRK: io.github.kotlinmania.libc.TcflagT = 0x08u

public val INPCK: io.github.kotlinmania.libc.TcflagT = 0x10u

public val ISTRIP: io.github.kotlinmania.libc.TcflagT = 0x20u

public val INLCR: io.github.kotlinmania.libc.TcflagT = 0x40u

public val IGNCR: io.github.kotlinmania.libc.TcflagT = 0x80u

public val ICRNL: io.github.kotlinmania.libc.TcflagT = 0x100u

public val IUCLC: io.github.kotlinmania.libc.TcflagT = 0x200u

public val IXON: io.github.kotlinmania.libc.TcflagT = 0x400u

public val IXANY: io.github.kotlinmania.libc.TcflagT = 0x800u

public val IXOFF: io.github.kotlinmania.libc.TcflagT = 0x1000u

public val OPOST: io.github.kotlinmania.libc.TcflagT = 0x00000001u

public val OLCUC: io.github.kotlinmania.libc.TcflagT = 0x00000002u

public val ONLCR: io.github.kotlinmania.libc.TcflagT = 0x00000004u

public val OCRNL: io.github.kotlinmania.libc.TcflagT = 0x00000008u

public val ONOCR: io.github.kotlinmania.libc.TcflagT = 0x00000010u

public val ONLRET: io.github.kotlinmania.libc.TcflagT = 0x00000020u

public val OFILL: io.github.kotlinmania.libc.TcflagT = 0x00000040u

public val OFDEL: io.github.kotlinmania.libc.TcflagT = 0x00000080u

public val NLDLY: io.github.kotlinmania.libc.TcflagT = 0x00000100u

public val NL0: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val NL1: io.github.kotlinmania.libc.TcflagT = 0x00000100u

public val CRDLY: io.github.kotlinmania.libc.TcflagT = 0x00000600u

public val CR0: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val CR1: io.github.kotlinmania.libc.TcflagT = 0x00000200u

public val CR2: io.github.kotlinmania.libc.TcflagT = 0x00000400u

public val CR3: io.github.kotlinmania.libc.TcflagT = 0x00000600u

public val TABDLY: io.github.kotlinmania.libc.TcflagT = 0x00001800u

public val TAB0: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val TAB1: io.github.kotlinmania.libc.TcflagT = 0x00000800u

public val TAB2: io.github.kotlinmania.libc.TcflagT = 0x00001000u

public val TAB3: io.github.kotlinmania.libc.TcflagT = 0x00001800u

public val BSDLY: io.github.kotlinmania.libc.TcflagT = 0x00002000u

public val BS0: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val BS1: io.github.kotlinmania.libc.TcflagT = 0x00002000u

public val VTDLY: io.github.kotlinmania.libc.TcflagT = 0x00004000u

public val VT0: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val VT1: io.github.kotlinmania.libc.TcflagT = 0x00004000u

public val FFDLY: io.github.kotlinmania.libc.TcflagT = 0x00008000u

public val FF0: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val FF1: io.github.kotlinmania.libc.TcflagT = 0x00008000u

public val CSIZE: io.github.kotlinmania.libc.TcflagT = 0x00000020u

public val CS5: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val CS6: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val CS7: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val CS8: io.github.kotlinmania.libc.TcflagT = 0x00000020u

public val CSTOPB: io.github.kotlinmania.libc.TcflagT = 0x00000040u

public val CREAD: io.github.kotlinmania.libc.TcflagT = 0x00000080u

public val PARENB: io.github.kotlinmania.libc.TcflagT = 0x00000100u

public val PARODD: io.github.kotlinmania.libc.TcflagT = 0x00000200u

public val HUPCL: io.github.kotlinmania.libc.TcflagT = 0x00000400u

public val CLOCAL: io.github.kotlinmania.libc.TcflagT = 0x00000800u

public val XLOBLK: io.github.kotlinmania.libc.TcflagT = 0x00001000u

public val CTSFLOW: io.github.kotlinmania.libc.TcflagT = 0x00002000u

public val RTSFLOW: io.github.kotlinmania.libc.TcflagT = 0x00004000u

public val CRTSCTS: io.github.kotlinmania.libc.TcflagT = RTSFLOW or CTSFLOW

public val ISIG: io.github.kotlinmania.libc.TcflagT = 0x00000001u

public val ICANON: io.github.kotlinmania.libc.TcflagT = 0x00000002u

public val XCASE: io.github.kotlinmania.libc.TcflagT = 0x00000004u

public val ECHO: io.github.kotlinmania.libc.TcflagT = 0x00000008u

public val ECHOE: io.github.kotlinmania.libc.TcflagT = 0x00000010u

public val ECHOK: io.github.kotlinmania.libc.TcflagT = 0x00000020u

public val ECHONL: io.github.kotlinmania.libc.TcflagT = 0x00000040u

public val NOFLSH: io.github.kotlinmania.libc.TcflagT = 0x00000080u

public val TOSTOP: io.github.kotlinmania.libc.TcflagT = 0x00000100u

public val IEXTEN: io.github.kotlinmania.libc.TcflagT = 0x00000200u

public val ECHOCTL: io.github.kotlinmania.libc.TcflagT = 0x00000400u

public val ECHOPRT: io.github.kotlinmania.libc.TcflagT = 0x00000800u

public val ECHOKE: io.github.kotlinmania.libc.TcflagT = 0x00001000u

public val FLUSHO: io.github.kotlinmania.libc.TcflagT = 0x00002000u

public val PENDIN: io.github.kotlinmania.libc.TcflagT = 0x00004000u

public val TCGB_CTS: CInt = 0x01

public val TCGB_DSR: CInt = 0x02

public val TCGB_RI: CInt = 0x04

public val TCGB_DCD: CInt = 0x08

public val TIOCM_CTS: CInt = TCGB_CTS

public val TIOCM_CD: CInt = TCGB_DCD

public val TIOCM_CAR: CInt = TCGB_DCD

public val TIOCM_RI: CInt = TCGB_RI

public val TIOCM_RNG: CInt = TCGB_RI

public val TIOCM_DSR: CInt = TCGB_DSR

public val TIOCM_DTR: CInt = 0x10

public val TIOCM_RTS: CInt = 0x20

public val B0: SpeedT = 0x00u

public val B50: SpeedT = 0x01u

public val B75: SpeedT = 0x02u

public val B110: SpeedT = 0x03u

public val B134: SpeedT = 0x04u

public val B150: SpeedT = 0x05u

public val B200: SpeedT = 0x06u

public val B300: SpeedT = 0x07u

public val B600: SpeedT = 0x08u

public val B1200: SpeedT = 0x09u

public val B1800: SpeedT = 0x0Au

public val B2400: SpeedT = 0x0Bu

public val B4800: SpeedT = 0x0Cu

public val B9600: SpeedT = 0x0Du

public val B19200: SpeedT = 0x0Eu

public val B38400: SpeedT = 0x0Fu

public val B57600: SpeedT = 0x10u

public val B115200: SpeedT = 0x11u

public val B230400: SpeedT = 0x12u

public val B31250: SpeedT = 0x13u

public val TCSANOW: CInt = 0x01

public val TCSADRAIN: CInt = 0x02

public val TCSAFLUSH: CInt = 0x04

public val TCOOFF: CInt = 0x01

public val TCOON: CInt = 0x02

public val TCIOFF: CInt = 0x04

public val TCION: CInt = 0x08

public val TCIFLUSH: CInt = 0x01

public val TCOFLUSH: CInt = 0x02

public val TCIOFLUSH: CInt = 0x03

public val TCGETA: CUlong = 0x8000uL

public val TCSETA: CUlong = TCGETA + 1uL

public val TCSETAF: CUlong = TCGETA + 2uL

public val TCSETAW: CUlong = TCGETA + 3uL

public val TCSBRK: CUlong = TCGETA + 5uL

public val TCFLSH: CUlong = TCGETA + 6uL

public val TCXONC: CUlong = TCGETA + 7uL

public val TCGETBITS: CUlong = TCGETA + 9uL

public val TCSETDTR: CUlong = TCGETA + 10uL

public val TCSETRTS: CUlong = TCGETA + 11uL

public val TIOCGWINSZ: CUlong = TCGETA + 12uL

public val TIOCSWINSZ: CUlong = TCGETA + 13uL

public val TIOCGPGRP: CUlong = TCGETA + 15uL

public val TIOCSPGRP: CUlong = TCGETA + 16uL

public val TIOCSCTTY: CUlong = TCGETA + 17uL

public val TIOCMGET: CUlong = TCGETA + 18uL

public val TIOCMSET: CUlong = TCGETA + 19uL

public val TIOCSBRK: CUlong = TCGETA + 20uL

public val TIOCCBRK: CUlong = TCGETA + 21uL

public val TIOCMBIS: CUlong = TCGETA + 22uL

public val TIOCMBIC: CUlong = TCGETA + 23uL

public val TIOCGSID: CUlong = TCGETA + 24uL

public val TIOCOUTQ: CUlong = TCGETA + 25uL

public val TIOCEXCL: CUlong = TCGETA + 26uL

public val TIOCNXCL: CUlong = TCGETA + 27uL

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

// utmpx entry types
public val EMPTY: CShort = 0

public val BOOT_TIME: CShort = 1

public val OLD_TIME: CShort = 2

public val NEW_TIME: CShort = 3

public val USER_PROCESS: CShort = 4

public val INIT_PROCESS: CShort = 5

public val LOGIN_PROCESS: CShort = 6

public val DEAD_PROCESS: CShort = 7

public val LOG_PID: CInt = 1 shl 12

public val LOG_CONS: CInt = 2 shl 12

public val LOG_ODELAY: CInt = 4 shl 12

public val LOG_NDELAY: CInt = 8 shl 12

public val LOG_SERIAL: CInt = 16 shl 12

public val LOG_PERROR: CInt = 32 shl 12

public val LOG_NOWAIT: CInt = 64 shl 12

// spawn.h
// DIFF(main): changed to `cShort` in f62eb023ab
public val POSIX_SPAWN_RESETIDS: CInt = 0x01

public val POSIX_SPAWN_SETPGROUP: CInt = 0x02

public val POSIX_SPAWN_SETSIGDEF: CInt = 0x10

public val POSIX_SPAWN_SETSIGMASK: CInt = 0x20

public val POSIX_SPAWN_SETSID: CInt = 0x40

public fun cmsgAlign(len: Int): Int {
    return len + sizeOf<Int>() - 1 and (sizeOf<Int>() - 1).inv()
}

public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? {
    return if ((mhdr!!.msgControllen).toInt() >= sizeOf<Cmsghdr>()) {
        (mhdr!!.msgControl as Cmsghdr?)
    } else {
        nullMut<Cmsghdr>()
    }
}

public fun cmsgData(cmsg: Cmsghdr?): CUchar? {
    return ((((cmsg)?.hashCode()?.toLong() ?: 0L).toUByte()))?.let { COpaquePointer(it.hashCode().toLong() + (CMSG_ALIGN(sizeOf<Cmsghdr>()).toInt()).toLong()) }
}

public fun cmsgSpace(length: CUint): CUint {
    return (CMSG_ALIGN(length.toInt()) + CMSG_ALIGN(sizeOf<Cmsghdr>())).toUInt()
}

public fun cmsgLen(length: CUint): CUint {
    return CMSG_ALIGN(sizeOf<Cmsghdr>()).toUInt() + length
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if ((cmsg == null)) {
        return CMSG_FIRSTHDR(mhdr)
    }
    val next = ((cmsg)?.hashCode()?.toLong() ?: 0L).toInt() + CMSG_ALIGN((cmsg!!.cmsgLen).toInt()) + CMSG_ALIGN(sizeOf<Cmsghdr>())
    val max = ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + (mhdr!!.msgControllen).toInt()
    return if (next > max) {
        nullMut<Cmsghdr>()
    } else {
        null
    }
}

public fun fdClr(fd: CInt, set: FdSet?) {
    val fd1 = fd.toInt()
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set!!.fdsBits[fd1 / size] and (1 shl (fd1 % size)).inv()
    return
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val fd1 = fd.toInt()
    val size = 8 * 8
    return (set!!.fdsBits[fd1 / size] and (1 shl (fd1 % size))) != 0
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val fd1 = fd.toInt()
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set!!.fdsBits[fd1 / size] or (1 shl (fd1 % size))
    return
}

public fun fdZero(set: FdSet?) {
    for (slot in set!!.fdsBits.iterMut()) {
        slot = 0
    }
}

public fun wifexited(status: CInt): Boolean {
    return (status and 0xff.inv()) == 0
}

public fun wexitstatus(status: CInt): CInt {
    return status and 0xff
}

public fun wifsignaled(status: CInt): Boolean {
    return ((status shr 8) and 0xff) != 0
}

public fun wtermsig(status: CInt): CInt {
    return (status shr 8) and 0xff
}

public fun wifstopped(status: CInt): Boolean {
    return ((status shr 16) and 0xff) != 0
}

public fun wstopsig(status: CInt): CInt {
    return (status shr 16) and 0xff
}

public fun wcoredump(status: CInt): Boolean {
    return (status and 0x10000) != 0
}

public fun wifcontinued(status: CInt): Boolean {
    return (status and 0x20000) != 0
}

public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun setrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, priority: CInt): CInt

public expect fun endusershell()

public expect fun getpass(prompt: String?): COpaquePointer?

public expect fun getusershell(): COpaquePointer?

public expect fun issetugid(): CInt

public expect fun setusershell()

public expect fun utimensat(fd: CInt, path: String?, times: Timespec?, flag: CInt): CInt

public expect fun futimens(fd: CInt, times: Timespec?): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun errnop(): CInt?

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun getifaddrs(ifap: COpaquePointer?): CInt

public expect fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?)

public expect fun ppoll(fds: Pollfd?, numfds: io.github.kotlinmania.libc.NfdsT, timeout: Timespec?, sigMask: ULong?): CInt

public expect fun getspent(): Spwd?

public expect fun getspentR(pwd: Spwd?, buf: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt

public expect fun setspent()

public expect fun endspent()

public expect fun getspnam(name: String?): Spwd?

public expect fun getspnamR(name: String?, spwd: Spwd?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt

public expect fun sgetspent(line: String?): Spwd?

public expect fun sgetspentR(line: String?, spwd: Spwd?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt

public expect fun fgetspent(file: FILE?): Spwd?

public expect fun fgetspentR(file: FILE?, spwd: Spwd?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun semDestroy(sem: SemT?): CInt

public expect fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt

public expect fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt

public expect fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt

public expect fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: Int?): CInt

public expect fun pthreadCreate(thread: UintptrT?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt

public expect fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt

public expect fun pthreadCondattrGetclock(attr: UintptrT?, clockId: Int?): CInt

public expect fun pthreadCondattrSetclock(attr: UintptrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt

public expect fun valloc(numBytes: SizeT): COpaquePointer?

public expect fun mallocUsableSize(ptr: COpaquePointer?): SizeT

public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

public expect fun setgroups(ngroups: CInt, ptr: GidT?): CInt

public expect fun initgroups(name: String?, basegid: GidT): CInt

public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt

public expect fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt

public expect fun pthreadSigqueue(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt, value: Sigval): CInt

public expect fun pthreadSpinInit(lock: io.github.kotlinmania.libc.PthreadSpinlockT?, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt

public expect fun pthreadSpinLock(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt

public expect fun pthreadSpinTrylock(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt

public expect fun pthreadSpinUnlock(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt

public expect fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt

public expect fun globfree(pglob: io.github.kotlinmania.libc.GlobT?)

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT

public expect fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer?

public expect fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt

public expect fun accept4(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLength: UInt?, flags: CInt): CInt

public expect fun writev(fd: CInt, iov: Iovec?, count: CInt): SsizeT

public expect fun readv(fd: CInt, iov: Iovec?, count: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): CInt

public expect fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrouplist(user: String?, basegroup: GidT, grouplist: GidT?, groupcount: CInt?): CInt

public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt

public expect fun sigsuspend(mask: ULong?): CInt

public expect fun semClose(sem: SemT?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun pthreadSigmask(how: CInt, set: ULong?, oldset: ULong?): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): SemT?

public expect fun getgrnam(name: String?): Group?

public expect fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwent(): Passwd?

public expect fun setpwent()

public expect fun endpwent()

public expect fun endgrent()

public expect fun getgrent(): Group?

public expect fun setgrent()

public expect fun sigwait(set: ULong?, sig: CInt?): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): Group?

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun sethostname(name: String?, len: SizeT): CInt

public expect fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt

public expect fun getutxent(): Utmpx?

public expect fun getutxid(ut: Utmpx?): Utmpx?

public expect fun getutxline(ut: Utmpx?): Utmpx?

public expect fun pututxline(ut: Utmpx?): Utmpx?

public expect fun setutxent()

public expect fun endutxent()

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): CInt

public expect fun sigwaitinfo(set: ULong?, info: SiginfoT?): CInt

public expect fun getitimer(which: CInt, currValue: Itimerval?): CInt

public expect fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt

public expect fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt

public expect fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT

public expect fun regfree(preg: RegexT?)

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt

public expect fun msgget(key: io.github.kotlinmania.libc.KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt

public expect fun semget(key: io.github.kotlinmania.libc.KeyT, nsems: CInt, semflg: CInt): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt

public expect fun ftok(pathname: String?, projId: CInt): io.github.kotlinmania.libc.KeyT

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer?

public expect fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer?

public expect fun hcreate(nelt: SizeT): CInt

public expect fun hdestroy()

public expect fun hsearch(entry: io.github.kotlinmania.libc.Entry, action: io.github.kotlinmania.libc.Action): Entry?

public expect fun drand48(): CDouble

public expect fun erand48(xseed: CUshort?): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: CUshort?): CLong

public expect fun mrand48(): CLong

public expect fun jrand48(xseed: CUshort?): CLong

public expect fun srand48(seed: CLong)

public expect fun seed48(xseed: CUshort?): CUshort?

public expect fun lcong48(p: CUshort?)

public expect fun clearenv(): CInt

public expect fun ctermid(s: COpaquePointer?): COpaquePointer?

public expect fun sync()

public expect fun getpagesize(): CInt

public expect fun brk(addr: COpaquePointer?): CInt

public expect fun sbrk(increment: IntptrT): COpaquePointer?

public expect fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt

public expect fun posixSpawnattrInit(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt

public expect fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: PidT?): CInt

public expect fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt

public expect fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: ULong?): CInt

public expect fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: ULong?): CInt

public expect fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: ULong?): CInt

public expect fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: ULong?): CInt

public expect fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt

public expect fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt

public expect fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun memmem(source: COpaquePointer?, sourceLength: SizeT, search: COpaquePointer?, searchLength: SizeT): COpaquePointer?

public expect fun pthreadGetattrNp(thread: io.github.kotlinmania.libc.PthreadT, attr: COpaquePointer?): CInt

public expect fun pthreadGetnameNp(thread: io.github.kotlinmania.libc.PthreadT, buffer: COpaquePointer?, length: SizeT): CInt

public expect fun pthreadSetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: String?): CInt
