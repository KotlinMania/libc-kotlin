package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.COpaquePointer

public actual fun errno(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').errno()") as CInt?

public actual fun bind(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int =
    js("require('@kotlinmania/libc-native-bindings').bind(sockfd, addr?.toLong() ?: 0L, addrlen)") as Int

public actual fun dirfd(dirp: DIR?): Int =
    js("require('@kotlinmania/libc-native-bindings').dirfd(dirp?.toLong() ?: 0L)") as Int

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, srcAddr: Sockaddr?, addrlen: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(sockfd, buf?.value ?: 0L, len, flags, srcAddr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as Int

public actual fun pthreadCreate(thread: Int?, attr: PthreadAttrT?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(thread?.toLong() ?: 0L, attr?.toLong() ?: 0L, startRoutine, arg?.value ?: 0L)") as Int

public actual fun clockGettime(clockid: ClockidT, tp: Timespec?): Int =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clockid, tp?.toLong() ?: 0L)") as Int

public actual fun futimens(fd: Int, times: Timespec?): Int =
    js("require('@kotlinmania/libc-native-bindings').futimens(fd, times?.toLong() ?: 0L)") as Int

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): Int =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)") as Int

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): Int =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetnameNp(thread, name)") as Int

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetnameNp(thread, name?.value ?: 0L, len)") as Int

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    js("require('@kotlinmania/libc-native-bindings').getrandom(buf?.value ?: 0L, buflen, flags)") as Long

public actual fun arc4random(): UInt =
    js("require('@kotlinmania/libc-native-bindings').arc4random()") as UInt

public actual fun arc4randomBuf(bytes: COpaquePointer?, nbytes: ULong) {
    js("require('@kotlinmania/libc-native-bindings').arc4randomBuf(bytes?.value ?: 0L, nbytes)")
}
