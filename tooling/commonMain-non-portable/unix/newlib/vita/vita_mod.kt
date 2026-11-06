// port-lint: source unix/newlib/vita/vita_mod.rs
package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.BlkcntT
import io.github.kotlinmania.libc.BlksizeT
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.ClockidT
import io.github.kotlinmania.libc.DevT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.In6Addr
import io.github.kotlinmania.libc.InAddr
import io.github.kotlinmania.libc.InPortT
import io.github.kotlinmania.libc.InoT
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.ModeT
import io.github.kotlinmania.libc.NlinkT
import io.github.kotlinmania.libc.OffT
import io.github.kotlinmania.libc.PthreadAttrT
import io.github.kotlinmania.libc.PthreadCondattrT
import io.github.kotlinmania.libc.PthreadT
import io.github.kotlinmania.libc.SaFamilyT
import io.github.kotlinmania.libc.SocklenT
import io.github.kotlinmania.libc.TimeT
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.UidT

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public typealias ClockT = CLong

public typealias WcharT = UInt

public typealias SigsetT = CUlong

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: CInt,
    public var msgControl: COpaquePointer?,
    public var msgControllen: SocklenT,
    public var msgFlags: CInt,
)

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
    public var sin6Vport: InPortT,
    public var sin6ScopeId: UInt,
)

public open class SockaddrIn(
    public var sinLen: UByte,
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: InAddr,
    public var sinVport: InPortT,
    public var sinZero: List<UByte>,
)

public open class SockaddrUn(
    public var ssLen: UByte,
    public var sunFamily: SaFamilyT,
    public var sunPath: List<CChar>,
)

public open class SockaddrStorage(
    public var ssLen: UByte,
    public var ssFamily: SaFamilyT,
    public var ssPad1: List<UByte>,
    public var ssAlign: Long,
    public var ssPad2: List<UByte>,
)

public open class SchedParam(public var schedPriority: CInt)

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stAtime: TimeT,
    public var stMtime: TimeT,
    public var stCtime: TimeT,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stSpare4: List<CLong>,
)

public open class Dirent(
    public var offset: List<UByte>,
    public var dName: List<CChar>,
    public var pad: List<UByte>,
)

public val AF_UNIX: CInt = 1

public val AF_INET6: CInt = 24

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val SOCK_SEQPACKET: CInt = 5

public val SOMAXCONN: CInt = 128

public val FIONBIO: CUlong = 1uL

public val POLLIN: CShort = 0x0001

public val POLLPRI: CShort = POLLIN

public val POLLOUT: CShort = 0x0004

public val POLLRDNORM: CShort = POLLIN

public val POLLRDBAND: CShort = POLLIN

public val POLLWRNORM: CShort = POLLOUT

public val POLLWRBAND: CShort = POLLOUT

public val POLLERR: CShort = 0x0008

public val POLLHUP: CShort = 0x0010

public val POLLNVAL: CShort = 0x0020

public val RTLD_DEFAULT: COpaquePointer? = null

public val SOL_SOCKET: CInt = 0xffff

public val SO_NONBLOCK: CInt = 0x1100

public val MSG_OOB: CInt = 0x1

public val MSG_PEEK: CInt = 0x2

public val MSG_DONTROUTE: CInt = 0x4

public val MSG_EOR: CInt = 0x8

public val MSG_TRUNC: CInt = 0x10

public val MSG_CTRUNC: CInt = 0x20

public val MSG_WAITALL: CInt = 0x40

public val MSG_DONTWAIT: CInt = 0x80

public val MSG_BCAST: CInt = 0x100

public val MSG_MCAST: CInt = 0x200

public val UTIME_OMIT: CLong = -1L

public val AT_FDCWD: CInt = -2

public val O_DIRECTORY: CInt = 0x200000

public val O_NOFOLLOW: CInt = 0x100000

public val AT_EACCESS: CInt = 1

public val AT_SYMLINK_NOFOLLOW: CInt = 2

public val AT_SYMLINK_FOLLOW: CInt = 4

public val AT_REMOVEDIR: CInt = 8

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGTRAP: CInt = 5

public val SIGABRT: CInt = 6

public val SIGEMT: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGBUS: CInt = 10

public val SIGSEGV: CInt = 11

public val SIGSYS: CInt = 12

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val EAI_BADFLAGS: CInt = -1

public val EAI_NONAME: CInt = -2

public val EAI_AGAIN: CInt = -3

public val EAI_FAIL: CInt = -4

public val EAI_NODATA: CInt = -5

public val EAI_FAMILY: CInt = -6

public val EAI_SOCKTYPE: CInt = -7

public val EAI_SERVICE: CInt = -8

public val EAI_ADDRFAMILY: CInt = -9

public val EAI_MEMORY: CInt = -10

public val EAI_SYSTEM: CInt = -11

public val EAI_OVERFLOW: CInt = -12

public val PTHREAD_STACK_MIN: SizeT = 32uL * 1024uL

public val IP_HDRINCL: CInt = 2

public expect fun futimens(fd: CInt, times: Timespec?): CInt

public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun sendmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT

public expect fun recvmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT

public expect fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun pthreadAttrGetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt

public expect fun pthreadAttrSetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt

public expect fun pthreadAttrGetprocessoridNp(attr: PthreadAttrT?, processorId: CInt?): CInt

public expect fun pthreadAttrSetprocessoridNp(attr: PthreadAttrT?, processorId: CInt): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt

public expect fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt

public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt

public expect fun pthreadGetprocessoridNp(): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun pipe2(fds: CInt?, flags: CInt): CInt
