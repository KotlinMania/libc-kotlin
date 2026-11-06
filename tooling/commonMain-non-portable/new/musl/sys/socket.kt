// port-lint: source new/musl/sys/socket.rs
package io.github.kotlinmania.libc.new.musl.sys

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.Mmsghdr
import io.github.kotlinmania.libc.SocklenT
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.bits.socket.SOCK_DGRAM
import io.github.kotlinmania.libc.bits.socket.SOCK_STREAM

// Header: `sys / socket.h`
//
// <https://github.com/kraj/musl/blob/kraj/master/include/sys/socket.h>

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: CInt,
    public var pad1: CInt,
    public var msgControl: COpaquePointer?,
    public var msgControllen: SocklenT,
    public var pad2: CInt,
    public var msgFlags: CInt,
)

public open class Cmsghdr(
    public var cmsgLen: SocklenT,
    public var pad1: CInt,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public expect fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CUint): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CUint, timeout: Timespec?): CInt

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2
