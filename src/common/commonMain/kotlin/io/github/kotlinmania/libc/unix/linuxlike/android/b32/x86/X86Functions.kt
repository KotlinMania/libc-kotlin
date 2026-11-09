package io.github.kotlinmania.libc.unix.linuxlike.android.b32.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.syscall
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.android.b32.SocklenT

public fun accept4(fd: CInt, addr: Sockaddr?, len: SocklenT?, flg: CInt): CInt {
    // Arguments are passed as array of `long int`
    // (which is big enough on x86 for a pointer).
    var args = listOf(fd.toLong(), ((addr)?.hashCode()?.toLong() ?: 0L).toLong(), len.toLong(), flg.toLong())
    return syscall(SYS_SOCKETCALL, SYS_ACCEPT4, args)
}
