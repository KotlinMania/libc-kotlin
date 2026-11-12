package io.github.kotlinmania.libc.unix.linuxlike.android.b32.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.android.b32.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.android.syscall
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun accept4(fd: CInt, addr: MutPtr<Sockaddr>, len: MutPtr<SocklenT>, flg: CInt): CInt {
    // Arguments are passed as array of `long int`
    // (which is big enough on x86 for a pointer).
    val args = listOf(fd.toLong(), addr.rawAddress, len.rawAddress, flg.toLong())
    return syscall(SYS_SOCKETCALL, SYS_ACCEPT41.toLong(), args.asMutPtr().toLong()).toInt()
}
