// port-lint: source new/bionic_libc/sys/socket.rs
package io.github.kotlinmania.libc.new.bioniclibc.sys
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.linuxlike.Mmsghdr
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: UInt,
    val msgIov: Iovec?,
    val msgIovlen: ULong,
    val msgControl: COpaquePointer?,
    val msgControllen: ULong,
    val msgFlags: Int,
)

public data class Cmsghdr(
    val cmsgLen: ULong,
    val cmsgLevel: Int,
    val cmsgType: Int,
)

public data class Ucred(
    val pid: Int,
    val uid: UInt,
    val gid: UInt,
)

public expect fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int, timeout: Timespec?): Int

public expect fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int): Int

public expect fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long
