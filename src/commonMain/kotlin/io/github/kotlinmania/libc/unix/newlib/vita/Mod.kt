// port-lint: source unix/newlib/vita/mod.rs
package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*

public typealias ClockT = CLong
public typealias WcharT = UInt
public typealias SigsetT = CULong

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: SocklenT,
    val msgIov: Iovec?,
    val msgIovlen: CInt,
    val msgControl: COpaquePointer?,
    val msgControllen: SocklenT,
    val msgFlags: CInt,
)

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
    val sin6Vport: InPortT,
    val sin6ScopeId: UInt,
)

public data class SockaddrIn(
    val sinLen: UByte,
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinVport: InPortT,
    val sinZero: UByteArray,
)

public data class SockaddrUn(
    val ssLen: UByte,
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public data class SockaddrStorage(
    val ssLen: UByte,
    val ssFamily: SaFamilyT,
    val ssAlign: Long,
)

public data class SchedParam(
    val schedPriority: CInt,
)

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: OffT,
    val stAtime: TimeT,
    val stMtime: TimeT,
    val stCtime: TimeT,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stSpare4: LongArray,
)

public data class Dirent(
    val offset: UByteArray,
    val dName: ByteArray,
)

public const val AF_UNIX: CInt = 1
public const val AF_INET6: CInt = 24
public const val SOCK_RAW: CInt = 3
public const val SOCK_RDM: CInt = 4
public const val SOCK_SEQPACKET: CInt = 5
public const val SOMAXCONN: CInt = 128
public const val FIONBIO: CULong = 1uL
public const val POLLIN: CShort = 0x0001
public const val POLLPRI: CShort = POLLIN
public const val POLLOUT: CShort = 0x0004
public const val POLLRDNORM: CShort = POLLIN
public const val POLLRDBAND: CShort = POLLIN
public const val POLLWRNORM: CShort = POLLOUT
public const val POLLWRBAND: CShort = POLLOUT
public const val POLLERR: CShort = 0x0008
public const val POLLHUP: CShort = 0x0010
public const val POLLNVAL: CShort = 0x0020
public const val SOL_SOCKET: CInt = 0xffff
public const val SO_NONBLOCK: CInt = 0x1100
public const val MSG_OOB: CInt = 0x1
public const val MSG_PEEK: CInt = 0x2
public const val MSG_DONTROUTE: CInt = 0x4
public const val MSG_EOR: CInt = 0x8
public const val MSG_TRUNC: CInt = 0x10
public const val MSG_CTRUNC: CInt = 0x20
public const val MSG_WAITALL: CInt = 0x40
public const val MSG_DONTWAIT: CInt = 0x80
public const val MSG_BCAST: CInt = 0x100
public const val MSG_MCAST: CInt = 0x200
public const val UTIME_OMIT: CLong = -1
public const val AT_FDCWD: CInt = -2
public const val O_DIRECTORY: CInt = 0x200000
public const val O_NOFOLLOW: CInt = 0x100000
public const val AT_EACCESS: CInt = 1
public const val AT_SYMLINK_NOFOLLOW: CInt = 2
public const val AT_SYMLINK_FOLLOW: CInt = 4
public const val AT_REMOVEDIR: CInt = 8
public const val SIGHUP: CInt = 1
public const val SIGINT: CInt = 2
public const val SIGQUIT: CInt = 3
public const val SIGILL: CInt = 4
public const val SIGTRAP: CInt = 5
public const val SIGABRT: CInt = 6
public const val SIGEMT: CInt = 7
public const val SIGFPE: CInt = 8
public const val SIGKILL: CInt = 9
public const val SIGBUS: CInt = 10
public const val SIGSEGV: CInt = 11
public const val SIGSYS: CInt = 12
public const val SIGPIPE: CInt = 13
public const val SIGALRM: CInt = 14
public const val SIGTERM: CInt = 15
public const val EAI_BADFLAGS: CInt = -1
public const val EAI_NONAME: CInt = -2
public const val EAI_AGAIN: CInt = -3
public const val EAI_FAIL: CInt = -4
public const val EAI_NODATA: CInt = -5
public const val EAI_FAMILY: CInt = -6
public const val EAI_SOCKTYPE: CInt = -7
public const val EAI_SERVICE: CInt = -8
public const val EAI_ADDRFAMILY: CInt = -9
public const val EAI_MEMORY: CInt = -10
public const val EAI_SYSTEM: CInt = -11
public const val EAI_OVERFLOW: CInt = -12
public val PTHREAD_STACK_MIN: ULong = 32uL * 1024
public const val IP_HDRINCL: CInt = 2

public expect fun futimens(fd: CInt, times: Timespec?): CInt

public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun sendmsg(s: CInt, msg: Msghdr?, flags: CInt): SsizeT

public expect fun recvmsg(s: CInt, msg: Msghdr?, flags: CInt): SsizeT

public expect fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt

public expect fun pthreadAttrGetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt

public expect fun pthreadAttrSetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt

public expect fun pthreadAttrGetprocessoridNp(attr: PthreadAttrT, processorId: CInt?): CInt

public expect fun pthreadAttrSetprocessoridNp(attr: PthreadAttrT, processorId: CInt): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt

public expect fun pthreadCondattrGetclock(attr: PthreadCondattrT, clockId: ClockidT?): CInt

public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT, clockId: ClockidT): CInt

public expect fun pthreadGetprocessoridNp(): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt

public expect fun pipe2(fds: CInt?, flags: CInt): CInt
