@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.l4re.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.l4re.SocklenT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_unix_linuxlike_l4re_uclibc_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetkindNp(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_unix_linuxlike_l4re_uclibc_pthreadRwlockattrGetkindNp(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetkindNp(attr: COpaquePointer?, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_unix_linuxlike_l4re_uclibc_pthreadRwlockattrSetkindNp(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_unix_linuxlike_l4re_uclibc_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_unix_linuxlike_l4re_uclibc_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_unix_linuxlike_l4re_uclibc_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_unix_linuxlike_l4re_uclibc_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_unix_linuxlike_l4re_uclibc_getrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_unix_linuxlike_l4re_uclibc_setrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_unix_linuxlike_l4re_uclibc_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_unix_linuxlike_l4re_uclibc_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getauxval(type: CUlong): CUlong =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_unix_linuxlike_l4re_uclibc_getauxval(type)
