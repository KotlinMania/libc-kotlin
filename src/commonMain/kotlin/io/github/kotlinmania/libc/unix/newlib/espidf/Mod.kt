// port-lint: source unix/newlib/espidf/mod.rs
package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*

public typealias ClockT = CULong
public typealias WcharT = UInt

public data class Cmsghdr(
    val cmsgLen: SocklenT,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
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

public data class SockaddrUn(
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
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
    val sin6ScopeId: UInt,
)

public data class SockaddrIn(
    val sinLen: UByte,
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
)

public data class SockaddrStorage(
    val s2Len: UByte,
    val ssFamily: SaFamilyT,
    val s2Data1: ByteArray,
    val s2Data2: UIntArray,
    val s2Data3: UIntArray,
)

public const val AF_UNIX: CInt = 1
public const val AF_INET6: CInt = 10
public const val FIONBIO: CULong = 2147772030uL
public val POLLIN: CShort = 1 shl 0
public val POLLRDNORM: CShort = 1 shl 1
public val POLLRDBAND: CShort = 1 shl 2
public val POLLPRI: CShort = POLLRDBAND
public val POLLOUT: CShort = 1 shl 3
public val POLLWRNORM: CShort = POLLOUT
public val POLLWRBAND: CShort = 1 shl 4
public val POLLERR: CShort = 1 shl 5
public val POLLHUP: CShort = 1 shl 6
public const val SOL_SOCKET: CInt = 0xfff
public const val MSG_OOB: CInt = 0x04
public const val MSG_PEEK: CInt = 0x01
public const val MSG_DONTWAIT: CInt = 0x08
public const val MSG_DONTROUTE: CInt = 0x4
public const val MSG_WAITALL: CInt = 0x02
public const val MSG_MORE: CInt = 0x10
public const val MSG_NOSIGNAL: CInt = 0x20
public const val MSG_TRUNC: CInt = 0x04
public const val MSG_CTRUNC: CInt = 0x08
public const val MSG_EOR: CInt = 0x08
public const val PTHREAD_STACK_MIN: ULong = 768uL
public const val SIGABRT: CInt = 6
public const val SIGFPE: CInt = 8
public const val SIGILL: CInt = 4
public const val SIGINT: CInt = 2
public const val SIGSEGV: CInt = 11
public const val SIGTERM: CInt = 15
public const val SIGHUP: CInt = 1
public const val SIGQUIT: CInt = 3
public const val NSIG: ULong = 32uL

public expect fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt

public expect fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT

public expect fun gethostname(name: String?, namelen: SsizeT)

public expect fun sendmsg(s: CInt, msg: Msghdr?, flags: CInt): SsizeT

public expect fun recvmsg(s: CInt, msg: Msghdr?, flags: CInt): SsizeT

public expect fun eventfd(initval: CUInt, flags: CInt): CInt
