// port-lint: source unix/newlib/espidf/espidf_mod.rs
package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.In6Addr
import io.github.kotlinmania.libc.InAddr
import io.github.kotlinmania.libc.InPortT
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.PthreadAttrT
import io.github.kotlinmania.libc.PthreadT
import io.github.kotlinmania.libc.SaFamilyT
import io.github.kotlinmania.libc.SocklenT

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public typealias ClockT = CUlong

public typealias WcharT = UInt

public open class Cmsghdr(
    public var cmsgLen: SocklenT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
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

public open class SockaddrUn(public var sunFamily: SaFamilyT, public var sunPath: List<CChar>)

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

public open class SockaddrIn(
    public var sinLen: UByte,
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: InAddr,
    public var sinZero: List<CChar>,
)

public open class SockaddrStorage(
    public var s2Len: UByte,
    public var ssFamily: SaFamilyT,
    public var s2Data1: List<CChar>,
    public var s2Data2: List<UInt>,
    public var s2Data3: List<UInt>,
)

public val AF_UNIX: CInt = 1

public val AF_INET6: CInt = 10

public val FIONBIO: CUlong = 2147772030uL

public val POLLIN: CShort = (1 shl 0).toShort()

public val POLLRDNORM: CShort = (1 shl 1).toShort()

public val POLLRDBAND: CShort = (1 shl 2).toShort()

public val POLLPRI: CShort = POLLRDBAND

public val POLLOUT: CShort = (1 shl 3).toShort()

public val POLLWRNORM: CShort = POLLOUT

public val POLLWRBAND: CShort = (1 shl 4).toShort()

public val POLLERR: CShort = (1 shl 5).toShort()

public val POLLHUP: CShort = (1 shl 6).toShort()

public val SOL_SOCKET: CInt = 0xfff

public val MSG_OOB: CInt = 0x04

public val MSG_PEEK: CInt = 0x01

public val MSG_DONTWAIT: CInt = 0x08

public val MSG_DONTROUTE: CInt = 0x4

public val MSG_WAITALL: CInt = 0x02

public val MSG_MORE: CInt = 0x10

public val MSG_NOSIGNAL: CInt = 0x20

public val MSG_TRUNC: CInt = 0x04

public val MSG_CTRUNC: CInt = 0x08

public val MSG_EOR: CInt = 0x08

public val PTHREAD_STACK_MIN: SizeT = 768uL

public val SIGABRT: CInt = 6

public val SIGFPE: CInt = 8

public val SIGILL: CInt = 4

public val SIGINT: CInt = 2

public val SIGSEGV: CInt = 11

public val SIGTERM: CInt = 15

public val SIGHUP: CInt = 1

public val SIGQUIT: CInt = 3

public val NSIG: SizeT = 32uL

public expect fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT

public expect fun gethostname(name: COpaquePointer?, namelen: SsizeT)

public expect fun sendmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT

public expect fun recvmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT

public expect fun eventfd(initval: CUint, flags: CInt): CInt
