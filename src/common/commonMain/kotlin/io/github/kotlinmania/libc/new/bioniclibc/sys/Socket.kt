// port-lint: source new/bionic_libc/sys/socket.rs
package io.github.kotlinmania.libc.new.bioniclibc.sys

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.SizeT
import io.github.kotlinmania.libc.Sockaddr
import io.github.kotlinmania.libc.SocklenT
import io.github.kotlinmania.libc.SsizeT
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.new.qurt.GidT
import io.github.kotlinmania.libc.new.qurt.UidT
import io.github.kotlinmania.libc.unix.linuxlike.Mmsghdr

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

public fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("recvmmsg", -1, longArrayOf(sockfd.toLong(), msgvec?.value ?: 0L, vlen.toLong(), flags.toLong(), timeout?.value ?: 0L)).toInt()
}

public fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("sendmmsg", -1, longArrayOf(sockfd.toLong(), msgvec?.value ?: 0L, vlen.toLong(), flags.toLong())).toInt()
}

public fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT {
    val __slot_5 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("recvfrom", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong(), addr?.value ?: 0L, __slot_5))
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}
