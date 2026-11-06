@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_uclibc_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetkindNp(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?, value: CInt?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_uclibc_mod_pthread_rwlockattr_getkind_np(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetkindNp(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_uclibc_mod_pthread_rwlockattr_setkind_np(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_uclibc_mod_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_uclibc_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_uclibc_mod_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_uclibc_mod_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_uclibc_mod_getrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_uclibc_mod_setrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_uclibc_mod_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_uclibc_mod_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getauxval(type: CUlong): CUlong =
    io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libc_uclibc_mod_getauxval(type)
