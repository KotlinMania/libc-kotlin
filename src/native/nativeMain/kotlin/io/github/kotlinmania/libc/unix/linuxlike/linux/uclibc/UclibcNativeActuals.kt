@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.SocklenT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetkindNp(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrGetkindNp(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetkindNp(attr: COpaquePointer?, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrSetkindNp(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun ptrace(request: CUint): CLong =
    0L

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun sethostid(hostid: CLong): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_sethostid(hostid)

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_fanotifyMark(fd, flags, mask, dirfd, path)

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_getrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_setrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_getpriority(which, who)

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_setpriority(which, who, prio)

public actual fun getauxval(type: CUlong): CUlong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_unix_linuxlike_linux_uclibc_getauxval(type)
