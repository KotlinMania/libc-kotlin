@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, value: CInt?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_pthread_rwlockattr_getkind_np(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_pthread_rwlockattr_setkind_np(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun sethostid(hostid: CLong): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_sethostid(hostid)

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_fanotify_mark(fd, flags, mask, dirfd, path)

public actual fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_getrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_setrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_getpriority(which, who)

public actual fun setpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_setpriority(which, who, prio)

public actual fun getauxval(type: CUlong): CUlong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libc_uclibc_mod_getauxval(type)
