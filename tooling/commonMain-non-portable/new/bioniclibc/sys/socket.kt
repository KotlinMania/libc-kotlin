// port-lint: source new/bionic_libc/sys/socket.rs
package io.github.kotlinmania.libc.new.bioniclibc.sys

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.Mmsghdr
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.Sockaddr
import io.github.kotlinmania.libc.SocklenT
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.UidT

// Header: `sys / socket.h`

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: SizeT,
    public var msgControl: COpaquePointer?,
    public var msgControllen: SizeT,
    public var msgFlags: CInt,
)

public open class Cmsghdr(
    public var cmsgLen: SizeT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class Ucred(
    public var pid: PidT,
    public var uid: UidT,
    public var gid: GidT,
)

public expect fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt

public expect fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT
