package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.COpaquePointer

internal object UclibcModRawLibc {
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun pthreadRwlockattrGetkindNp(attr: Long, value: Long): Int
    external fun pthreadRwlockattrSetkindNp(attr: Long, value: Int): Int
    external fun sendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int
    external fun recvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int
    external fun openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int
    external fun forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int
    external fun getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int
    external fun pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun sethostid(hostid: Long): Int
    external fun fanotifyMark(fd: Int, flags: Int, mask: Long, dirfd: Int, path: String?): Int
    external fun getrlimit64(resource: Long, rlim: Long): Int
    external fun setrlimit64(resource: Long, rlim: Long): Int
    external fun getrlimit(resource: Long, rlim: Long): Int
    external fun setrlimit(resource: Long, rlim: Long): Int
    external fun getpriority(which: Long, who: Long): Int
    external fun setpriority(which: Long, who: Long, prio: Int): Int
    external fun getauxval(type: Long): Long
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun pthreadRwlockattrGetkindNp(attr: Long, value: Long): Int
    external fun pthreadRwlockattrSetkindNp(attr: Long, value: Int): Int
    external fun openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int
    external fun getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int
    external fun pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun getrlimit64(resource: Long, rlim: Long): Int
    external fun setrlimit64(resource: Long, rlim: Long): Int
    external fun getrlimit(resource: Long, rlim: Long): Int
    external fun setrlimit(resource: Long, rlim: Long): Int
    external fun getauxval(type: Long): Long
}

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    UclibcModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, value: CInt?): CInt =
    UclibcModRawLibc.pthreadRwlockattrGetkindNp(attr?.toLong() ?: 0L, value?.toLong() ?: 0L)

public actual fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, value: CInt): CInt =
    UclibcModRawLibc.pthreadRwlockattrSetkindNp(attr?.toLong() ?: 0L, value)

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    UclibcModRawLibc.sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt =
    UclibcModRawLibc.recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    UclibcModRawLibc.openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    UclibcModRawLibc.forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    UclibcModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    UclibcModRawLibc.pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    UclibcModRawLibc.preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun sethostid(hostid: CLong): CInt =
    UclibcModRawLibc.sethostid(hostid)

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt =
    UclibcModRawLibc.fanotifyMark(fd, flags, mask, dirfd, path)

public actual fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    UclibcModRawLibc.getrlimit64(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    UclibcModRawLibc.setrlimit64(resource, rlim?.toLong() ?: 0L)

public actual fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    UclibcModRawLibc.getrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    UclibcModRawLibc.setrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun getpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT): CInt =
    UclibcModRawLibc.getpriority(which, who)

public actual fun setpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT, prio: CInt): CInt =
    UclibcModRawLibc.setpriority(which, who, prio)

public actual fun getauxval(type: CUlong): CUlong =
    UclibcModRawLibc.getauxval(type)

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    UclibcModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun pthreadRwlockattrGetkindNp(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?, value: CInt?): CInt =
    UclibcModRawLibc.pthreadRwlockattrGetkindNp(attr?.toLong() ?: 0L, value?.toLong() ?: 0L)

public actual fun pthreadRwlockattrSetkindNp(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?, value: CInt): CInt =
    UclibcModRawLibc.pthreadRwlockattrSetkindNp(attr?.toLong() ?: 0L, value)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    UclibcModRawLibc.openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    UclibcModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    UclibcModRawLibc.pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    UclibcModRawLibc.preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    UclibcModRawLibc.getrlimit64(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    UclibcModRawLibc.setrlimit64(resource, rlim?.toLong() ?: 0L)

public actual fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    UclibcModRawLibc.getrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    UclibcModRawLibc.setrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun getauxval(type: CUlong): CUlong =
    UclibcModRawLibc.getauxval(type)
