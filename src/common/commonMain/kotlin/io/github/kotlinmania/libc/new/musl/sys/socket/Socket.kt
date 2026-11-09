// port-lint: source new/musl/sys/socket.rs
package io.github.kotlinmania.libc.new.musl.sys.socket

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.SocklenT
import io.github.kotlinmania.libc.unix.Iovec

// Header: `sys / socket.h`
//
// <https://github.com/kraj/musl/blob/kraj/master/include/sys/socket.h>

public data class Msghdr(
    public var msgName: COpaquePointer? = null,
    public var msgNamelen: SocklenT = 0u,
    public var msgIov: Iovec? = null,
    public var msgIovlen: CInt = 0,
    public var pad1: CInt = 0,
    public var msgControl: COpaquePointer? = null,
    public var msgControllen: SocklenT = 0u,
    public var pad2: CInt = 0,
    public var msgFlags: CInt = 0,
)

public data class Cmsghdr(
    public var cmsgLen: SocklenT = 0u,
    public var pad1: CInt = 0,
    public var cmsgLevel: CInt = 0,
    public var cmsgType: CInt = 0,
)

public expect fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint, timeout: COpaquePointer?): CInt

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2
