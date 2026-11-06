// port-lint: source unix/newlib/arm/arm_mod.rs
package io.github.kotlinmania.libc.unix.newlib.arm

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.In6Addr
import io.github.kotlinmania.libc.InAddr
import io.github.kotlinmania.libc.InPortT
import io.github.kotlinmania.libc.SaFamilyT

public typealias ClockT = CLong

public typealias WcharT = UInt

public open class Sockaddr(public var saFamily: SaFamilyT, public var saData: List<CChar>)

public open class SockaddrIn6(
    public var sin6Family: SaFamilyT,
    public var sin6Port: InPortT,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: UInt,
)

public open class SockaddrIn(
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: InAddr,
    public var sinZero: List<UByte>,
)

public open class SockaddrStorage(public var ssFamily: SaFamilyT, public var ssPadding: List<UByte>)

public val AF_INET6: CInt = 23

public val FIONBIO: CUlong = 1uL

public val POLLIN: CShort = 0x1

public val POLLPRI: CShort = 0x2

public val POLLHUP: CShort = 0x4

public val POLLERR: CShort = 0x8

public val POLLOUT: CShort = 0x10

public val POLLNVAL: CShort = 0x20

public val SOL_SOCKET: CInt = 65535

public val MSG_OOB: CInt = 1

public val MSG_PEEK: CInt = 2

public val MSG_DONTWAIT: CInt = 4

public val MSG_DONTROUTE: CInt = 0

public val MSG_WAITALL: CInt = 0

public val MSG_MORE: CInt = 0

public val MSG_NOSIGNAL: CInt = 0
