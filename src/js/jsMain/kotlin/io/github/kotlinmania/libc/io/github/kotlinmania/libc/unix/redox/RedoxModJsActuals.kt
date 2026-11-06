package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.COpaquePointer

public actual fun errnoLocation(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').errnoLocation()") as CInt?

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strerrorR(errnum, buf?.value ?: 0L, buflen)") as CInt

public actual fun dirfd(dirp: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dirfd(dirp?.toLong() ?: 0L)") as CInt

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pipe2(fds?.toLong() ?: 0L, flags)") as CInt

public actual fun getdtablesize(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdtablesize()") as CInt

public actual fun getresgid(rgid: CInt?, egid: CInt?, sgid: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getresgid(rgid?.toLong() ?: 0L, egid?.toLong() ?: 0L, sgid?.toLong() ?: 0L)") as CInt

public actual fun getresuid(ruid: CInt?, euid: CInt?, suid: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getresuid(ruid?.toLong() ?: 0L, euid?.toLong() ?: 0L, suid?.toLong() ?: 0L)") as CInt

public actual fun setresgid(rgid: io.github.kotlinmania.libc.GidT, egid: io.github.kotlinmania.libc.GidT, sgid: io.github.kotlinmania.libc.GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setresgid(rgid, egid, sgid)") as CInt

public actual fun setresuid(ruid: io.github.kotlinmania.libc.UidT, euid: io.github.kotlinmania.libc.UidT, suid: io.github.kotlinmania.libc.UidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setresuid(ruid, euid, suid)") as CInt

public actual fun getgrent(): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrent()") as Group?

public actual fun setgrent() {
    js("require('@kotlinmania/libc-native-bindings').setgrent()")
}

public actual fun endgrent() {
    js("require('@kotlinmania/libc-native-bindings').endgrent()")
}

public actual fun getgrgid(gid: io.github.kotlinmania.libc.GidT): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrgid(gid)") as Group?

public actual fun getgrgidR(gid: io.github.kotlinmania.libc.GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getgrnam(name: String?): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrnam(name)") as Group?

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getgrouplist(user: String?, group: io.github.kotlinmania.libc.GidT, groups: CInt?, ngroups: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrouplist(user, group, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)") as CInt

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memalign(align, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getnameinfo(addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(addr?.toLong() ?: 0L, addrlen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)") as CInt

public actual fun pthreadCreate(tid: COpaquePointer?, attr: io.github.kotlinmania.libc.PthreadAttrT?, start: PthreadCreateStartCallback, arg: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(tid?.value ?: 0L, attr?.toLong() ?: 0L, start, arg?.value ?: 0L)") as CInt

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)") as CInt

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    js("require('@kotlinmania/libc-native-bindings').openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as CInt

public actual fun getpwent(): Passwd? =
    js("require('@kotlinmania/libc-native-bindings').getpwent()") as Passwd?

public actual fun setpwent() {
    js("require('@kotlinmania/libc-native-bindings').setpwent()")
}

public actual fun endpwent() {
    js("require('@kotlinmania/libc-native-bindings').endpwent()")
}

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getpwuidR(uid: io.github.kotlinmania.libc.UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun pthreadSigmask(how: CInt, set: CUlonglong?, oldset: CUlonglong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)") as CInt

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCancel(thread)") as CInt

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKill(thread, sig)") as CInt

public actual fun sigtimedwait(set: CUlonglong?, sig: SiginfoT?, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigtimedwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun sigwait(set: CUlonglong?, sig: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)") as CInt

public actual fun getsubopt(optionp: COpaquePointer?, tokens: COpaquePointer?, valuep: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getsubopt(optionp?.value ?: 0L, tokens?.value ?: 0L, valuep?.value ?: 0L)") as CInt

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemp(template?.value ?: 0L, flags)") as CInt

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemps(template?.value ?: 0L, suffixlen, flags)") as CInt

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').reallocarray(ptr?.value ?: 0L, nmemb, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').renameat2(olddirfd, oldpath, newdirfd, newpath, flags)") as CInt

public actual fun explicitBzero(p: COpaquePointer?, len: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').explicitBzero(p?.value ?: 0L, len)")
}

public actual fun strlcat(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strlcat(dst?.value ?: 0L, src, siz)") as SizeT

public actual fun strlcpy(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strlcpy(dst?.value ?: 0L, src, siz)") as SizeT

public actual fun epollCreate(size: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollCreate(size)") as CInt

public actual fun epollCreate1(flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollCreate1(flags)") as CInt

public actual fun epollWait(epfd: CInt, events: io.github.kotlinmania.libc.EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollWait(epfd, events?.toLong() ?: 0L, maxevents, timeout)") as CInt

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: io.github.kotlinmania.libc.EpollEvent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollCtl(epfd, op, fd, event?.toLong() ?: 0L)") as CInt

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').madvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msync(addr?.value ?: 0L, len, flags)") as CInt

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmOpen(name, oflag, mode)") as CInt

public actual fun shmUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmUnlink(name)") as CInt

public actual fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpriority(which, who)") as CInt

public actual fun setpriority(which: CInt, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setpriority(which, who, prio)") as CInt

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun cmsgData(cmsg: Cmsghdr?): CUchar? =
    js("require('@kotlinmania/libc-native-bindings').cmsgData(cmsg?.toLong() ?: 0L)") as CUchar?

public actual fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? =
    js("require('@kotlinmania/libc-native-bindings').cmsgFirsthdr(mhdr?.toLong() ?: 0L)") as Cmsghdr?

public actual fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    js("require('@kotlinmania/libc-native-bindings').cmsgNxthdr(mhdr?.toLong() ?: 0L, cmsg?.toLong() ?: 0L)") as Cmsghdr?

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').bind(socket, address?.toLong() ?: 0L, addressLen)") as CInt

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as SsizeT

public actual fun recvmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvmsg(socket, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun sendmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendmsg(socket, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimens(fd, times?.toLong() ?: 0L)") as CInt

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readv(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').writev(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun uname(utsname: Utsname?): CInt =
    js("require('@kotlinmania/libc-native-bindings').uname(utsname?.toLong() ?: 0L)") as CInt

public actual fun gettimeofday(tp: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: io.github.kotlinmania.libc.Tm?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strftime(s?.value ?: 0L, max, format, tm?.toLong() ?: 0L)") as SizeT

public actual fun loginTty(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').loginTty(fd)") as CInt
