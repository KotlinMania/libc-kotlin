package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.COpaquePointer

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, value: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrGetkindNp(attr?.toLong() ?: 0L, value?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrSetkindNp(attr?.toLong() ?: 0L, value)") as CInt

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)") as CInt

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)") as CInt

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    js("require('@kotlinmania/libc-native-bindings').openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as CInt

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    js("require('@kotlinmania/libc-native-bindings').forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as PidT

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun sethostid(hostid: CLong): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostid(hostid)") as CInt

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fanotifyMark(fd, flags, mask, dirfd, path)") as CInt

public actual fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit64(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit64(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun getpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpriority(which, who)") as CInt

public actual fun setpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT, prio: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setpriority(which, who, prio)") as CInt

public actual fun getauxval(type: CUlong): CUlong =
    js("require('@kotlinmania/libc-native-bindings').getauxval(type)") as CUlong

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrGetkindNp(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?, value: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrGetkindNp(attr?.toLong() ?: 0L, value?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrSetkindNp(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?, value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrSetkindNp(attr?.toLong() ?: 0L, value)") as CInt

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    js("require('@kotlinmania/libc-native-bindings').openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as CInt

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit64(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit64(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun getauxval(type: CUlong): CUlong =
    js("require('@kotlinmania/libc-native-bindings').getauxval(type)") as CUlong
