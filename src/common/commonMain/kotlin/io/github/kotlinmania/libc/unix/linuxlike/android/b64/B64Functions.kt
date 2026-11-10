package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.aarch64.SYS_ACCEPT4
import io.github.kotlinmania.libc.unix.linuxlike.android.syscall

public fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt {
    return syscall(SYS_ACCEPT4, fd.toLong(), ((addr).hashCode().toLong()), ((len).hashCode().toLong()), flg.toLong()).toInt()
}

public expect fun systemPropertyWait(pi: COpaquePointer?, oldSerial: UInt, newSerialPtr: COpaquePointer?, relativeTimeout: COpaquePointer?): Boolean
