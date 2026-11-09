package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.syscall
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

public fun accept4(fd: CInt, addr: Sockaddr?, len: UInt?, flg: CInt): CInt {
    return syscall(SysAccept4, fd, addr, len, flg).toInt()
}

public expect fun systemPropertyWait(pi: COpaquePointer?, oldSerial: UInt, newSerialPtr: COpaquePointer?, relativeTimeout: COpaquePointer?): Boolean
