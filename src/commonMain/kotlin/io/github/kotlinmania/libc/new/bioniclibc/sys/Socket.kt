// port-lint: source new/bionic_libc/sys/socket.rs
package io.github.kotlinmania.libc.new.bioniclibc.sys

import io.github.kotlinmania.libc.*

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: SocklenT,
    val msgIov: Iovec?,
    val msgIovlen: ULong,
    val msgControl: COpaquePointer?,
    val msgControllen: ULong,
    val msgFlags: CInt,
)

public data class Cmsghdr(
    val cmsgLen: ULong,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class Ucred(
    val pid: PidT,
    val uid: UidT,
    val gid: GidT,
)

public fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt, timeout: Timespec?): CInt = -1

public fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt): CInt = -1

public fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT = -1L
