// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public actual fun errno(): CInt? =
    throw UnsupportedOperationException("errno not available on Android host — use androidNative target for FFI")

public actual fun bind(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int =
    throw UnsupportedOperationException("bind not available on Android host — use androidNative target for FFI")

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl not available on Android host — use androidNative target for FFI")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd not available on Android host — use androidNative target for FFI")

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, srcAddr: Sockaddr?, addrlen: SocklenT?): Int =
    throw UnsupportedOperationException("recvfrom not available on Android host — use androidNative target for FFI")

public actual fun clockGettime(clockid: ClockidT, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime not available on Android host — use androidNative target for FFI")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp not available on Android host — use androidNative target for FFI")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom not available on Android host — use androidNative target for FFI")

public actual fun arc4randomBuf(bytes: COpaquePointer?, nbytes: ULong) {
    throw UnsupportedOperationException("arc4randomBuf not available on Android host — use androidNative target for FFI")
}


public actual fun pthreadCreate(thread: PthreadT?, attr: PthreadAttrT?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on Android host — use androidNative target for FFI")
