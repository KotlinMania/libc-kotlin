// port-lint: source unix/newlib/arm/mod.rs
package io.github.kotlinmania.libc.unix.newlib.arm

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias ClockT = CLong
public typealias WcharT = UInt

public data class Sockaddr(
    val saFamily: SaFamilyT,
    val saData: ByteArray,
)

public data class SockaddrIn6(
    val sin6Family: SaFamilyT,
    val sin6Port: InPortT,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)

public data class SockaddrIn(
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: UByteArray,
)

public data class SockaddrStorage(
    val ssFamily: SaFamilyT,
)

public const val AF_INET6: CInt = 23
public const val FIONBIO: CULong = 1uL
public const val POLLIN: CShort = 0x1
public const val POLLPRI: CShort = 0x2
public const val POLLHUP: CShort = 0x4
public const val POLLERR: CShort = 0x8
public const val POLLOUT: CShort = 0x10
public const val POLLNVAL: CShort = 0x20
public const val SOL_SOCKET: CInt = 65535
public const val MSG_OOB: CInt = 1
public const val MSG_PEEK: CInt = 2
public const val MSG_DONTWAIT: CInt = 4
public const val MSG_DONTROUTE: CInt = 0
public const val MSG_WAITALL: CInt = 0
public const val MSG_MORE: CInt = 0
public const val MSG_NOSIGNAL: CInt = 0
