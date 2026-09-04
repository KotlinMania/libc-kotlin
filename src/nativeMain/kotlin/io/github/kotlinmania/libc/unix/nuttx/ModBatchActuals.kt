// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun errno(): CInt? =
    throw UnsupportedOperationException("errno requires manual FFI bridge — not yet implemented")

public actual fun bind(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int =
    throw UnsupportedOperationException("bind requires manual FFI bridge — not yet implemented")

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd requires manual FFI bridge — not yet implemented")

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, srcAddr: Sockaddr?, addrlen: SocklenT?): Int =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge — not yet implemented")

public actual fun clockGettime(clockid: ClockidT, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires manual FFI bridge — not yet implemented")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp requires manual FFI bridge — not yet implemented")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom requires manual FFI bridge — not yet implemented")

public actual fun arc4randomBuf(bytes: COpaquePointer?, nbytes: ULong) {
    throw UnsupportedOperationException("arc4randomBuf requires manual FFI bridge — not yet implemented")
}
