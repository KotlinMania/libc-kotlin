package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.COpaquePointer

internal object RedoxModRawLibc {
    external fun errnoLocation(): Long?
    external fun strerrorR(errnum: Int, buf: Long, buflen: Long): Int
    external fun dirfd(dirp: Long): Int
    external fun pipe2(fds: Long, flags: Int): Int
    external fun getdtablesize(): Int
    external fun getresgid(rgid: Long, egid: Long, sgid: Long): Int
    external fun getresuid(ruid: Long, euid: Long, suid: Long): Int
    external fun setresgid(rgid: Long, egid: Long, sgid: Long): Int
    external fun setresuid(ruid: Long, euid: Long, suid: Long): Int
    external fun getgrent(): Long?
    external fun setgrent()
    external fun endgrent()
    external fun getgrgid(gid: Long): Long?
    external fun getgrgidR(gid: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getgrnam(name: String?): Long?
    external fun getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getgrouplist(user: String?, group: Long, groups: Long, ngroups: Long): Int
    external fun memalign(align: Long, size: Long): Long?
    external fun getnameinfo(addr: Long, addrlen: Long, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int
    external fun pthreadAtfork(prepare: Long, parent: Long, child: Long): Int
    external fun pthreadCreate(tid: Long, attr: Long, start: Long, arg: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Long): Int
    external fun openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int
    external fun getpwent(): Long?
    external fun setpwent()
    external fun endpwent()
    external fun getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getpwuidR(uid: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun pthreadSigmask(how: Int, set: Long, oldset: Long): Int
    external fun pthreadCancel(thread: Long): Int
    external fun pthreadKill(thread: Long, sig: Int): Int
    external fun sigtimedwait(set: Long, sig: Long, timeout: Long): Int
    external fun sigwait(set: Long, sig: Long): Int
    external fun getsubopt(optionp: Long, tokens: Long, valuep: Long): Int
    external fun mkostemp(template: Long, flags: Int): Int
    external fun mkostemps(template: Long, suffixlen: Int, flags: Int): Int
    external fun reallocarray(ptr: Long, nmemb: Long, size: Long): Long?
    external fun renameat2(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int
    external fun explicitBzero(p: Long, len: Long)
    external fun strlcat(dst: Long, src: String?, siz: Long): Long
    external fun strlcpy(dst: Long, src: String?, siz: Long): Long
    external fun epollCreate(size: Int): Int
    external fun epollCreate1(flags: Int): Int
    external fun epollWait(epfd: Int, events: Long, maxevents: Int, timeout: Int): Int
    external fun epollCtl(epfd: Int, op: Int, fd: Int, event: Long): Int
    external fun madvise(addr: Long, len: Long, advice: Int): Int
    external fun msync(addr: Long, len: Long, flags: Int): Int
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun shmOpen(name: String?, oflag: Int, mode: Int): Int
    external fun shmUnlink(name: String?): Int
    external fun getpriority(which: Int, who: Long): Int
    external fun setpriority(which: Int, who: Long, prio: Int): Int
    external fun getrlimit(resource: Int, rlim: Long): Int
    external fun setrlimit(resource: Int, rlim: Long): Int
    external fun cmsgData(cmsg: Long): Long?
    external fun cmsgFirsthdr(mhdr: Long): Long?
    external fun cmsgNxthdr(mhdr: Long, cmsg: Long): Long?
    external fun bind(socket: Int, address: Long, addressLen: Long): Int
    external fun recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long
    external fun recvmsg(socket: Int, msg: Long, flags: Int): Long
    external fun sendmsg(socket: Int, msg: Long, flags: Int): Long
    external fun futimens(fd: Int, times: Long): Int
    external fun preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun readv(fd: Int, iov: Long, iovcnt: Int): Long
    external fun writev(fd: Int, iov: Long, iovcnt: Int): Long
    external fun uname(utsname: Long): Int
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun clockGettime(clkId: Long, tp: Long): Int
    external fun strftime(s: Long, max: Long, format: String?, tm: Long): Long
    external fun loginTty(fd: Int): Int
}

public actual fun errnoLocation(): CInt? =
    RedoxModRawLibc.errnoLocation()

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    RedoxModRawLibc.strerrorR(errnum, buf?.value ?: 0L, buflen)

public actual fun dirfd(dirp: DIR?): CInt =
    RedoxModRawLibc.dirfd(dirp?.toLong() ?: 0L)

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    RedoxModRawLibc.pipe2(fds?.toLong() ?: 0L, flags)

public actual fun getdtablesize(): CInt =
    RedoxModRawLibc.getdtablesize()

public actual fun getresgid(rgid: CInt?, egid: CInt?, sgid: CInt?): CInt =
    RedoxModRawLibc.getresgid(rgid?.toLong() ?: 0L, egid?.toLong() ?: 0L, sgid?.toLong() ?: 0L)

public actual fun getresuid(ruid: CInt?, euid: CInt?, suid: CInt?): CInt =
    RedoxModRawLibc.getresuid(ruid?.toLong() ?: 0L, euid?.toLong() ?: 0L, suid?.toLong() ?: 0L)

public actual fun setresgid(rgid: io.github.kotlinmania.libc.GidT, egid: io.github.kotlinmania.libc.GidT, sgid: io.github.kotlinmania.libc.GidT): CInt =
    RedoxModRawLibc.setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: io.github.kotlinmania.libc.UidT, euid: io.github.kotlinmania.libc.UidT, suid: io.github.kotlinmania.libc.UidT): CInt =
    RedoxModRawLibc.setresuid(ruid, euid, suid)

public actual fun getgrent(): Group? =
    RedoxModRawLibc.getgrent()

public actual fun setgrent() {
    RedoxModRawLibc.setgrent()
}

public actual fun endgrent() {
    RedoxModRawLibc.endgrent()
}

public actual fun getgrgid(gid: io.github.kotlinmania.libc.GidT): Group? =
    RedoxModRawLibc.getgrgid(gid)

public actual fun getgrgidR(gid: io.github.kotlinmania.libc.GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    RedoxModRawLibc.getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getgrnam(name: String?): Group? =
    RedoxModRawLibc.getgrnam(name)

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    RedoxModRawLibc.getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getgrouplist(user: String?, group: io.github.kotlinmania.libc.GidT, groups: CInt?, ngroups: CInt?): CInt =
    RedoxModRawLibc.getgrouplist(user, group, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    RedoxModRawLibc.memalign(align, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getnameinfo(addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    RedoxModRawLibc.getnameinfo(addr?.toLong() ?: 0L, addrlen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    RedoxModRawLibc.pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)

public actual fun pthreadCreate(tid: COpaquePointer?, attr: io.github.kotlinmania.libc.PthreadAttrT?, start: PthreadCreateStartCallback, arg: COpaquePointer?): CInt =
    RedoxModRawLibc.pthreadCreate(tid?.value ?: 0L, attr?.toLong() ?: 0L, start, arg?.value ?: 0L)

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    RedoxModRawLibc.pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    RedoxModRawLibc.openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun getpwent(): Passwd? =
    RedoxModRawLibc.getpwent()

public actual fun setpwent() {
    RedoxModRawLibc.setpwent()
}

public actual fun endpwent() {
    RedoxModRawLibc.endpwent()
}

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    RedoxModRawLibc.getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getpwuidR(uid: io.github.kotlinmania.libc.UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    RedoxModRawLibc.getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun pthreadSigmask(how: CInt, set: CUlonglong?, oldset: CUlonglong?): CInt =
    RedoxModRawLibc.pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    RedoxModRawLibc.pthreadCancel(thread)

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    RedoxModRawLibc.pthreadKill(thread, sig)

public actual fun sigtimedwait(set: CUlonglong?, sig: SiginfoT?, timeout: Timespec?): CInt =
    RedoxModRawLibc.sigtimedwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sigwait(set: CUlonglong?, sig: CInt?): CInt =
    RedoxModRawLibc.sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)

public actual fun getsubopt(optionp: COpaquePointer?, tokens: COpaquePointer?, valuep: COpaquePointer?): CInt =
    RedoxModRawLibc.getsubopt(optionp?.value ?: 0L, tokens?.value ?: 0L, valuep?.value ?: 0L)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    RedoxModRawLibc.mkostemp(template?.value ?: 0L, flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    RedoxModRawLibc.mkostemps(template?.value ?: 0L, suffixlen, flags)

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    RedoxModRawLibc.reallocarray(ptr?.value ?: 0L, nmemb, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    RedoxModRawLibc.renameat2(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun explicitBzero(p: COpaquePointer?, len: SizeT) {
    RedoxModRawLibc.explicitBzero(p?.value ?: 0L, len)
}

public actual fun strlcat(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT =
    RedoxModRawLibc.strlcat(dst?.value ?: 0L, src, siz)

public actual fun strlcpy(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT =
    RedoxModRawLibc.strlcpy(dst?.value ?: 0L, src, siz)

public actual fun epollCreate(size: CInt): CInt =
    RedoxModRawLibc.epollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    RedoxModRawLibc.epollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: io.github.kotlinmania.libc.EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    RedoxModRawLibc.epollWait(epfd, events?.toLong() ?: 0L, maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: io.github.kotlinmania.libc.EpollEvent?): CInt =
    RedoxModRawLibc.epollCtl(epfd, op, fd, event?.toLong() ?: 0L)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    RedoxModRawLibc.madvise(addr?.value ?: 0L, len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    RedoxModRawLibc.msync(addr?.value ?: 0L, len, flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    RedoxModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    RedoxModRawLibc.shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    RedoxModRawLibc.shmUnlink(name)

public actual fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt =
    RedoxModRawLibc.getpriority(which, who)

public actual fun setpriority(which: CInt, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt =
    RedoxModRawLibc.setpriority(which, who, prio)

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    RedoxModRawLibc.getrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    RedoxModRawLibc.setrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun cmsgData(cmsg: Cmsghdr?): CUchar? =
    RedoxModRawLibc.cmsgData(cmsg?.toLong() ?: 0L)

public actual fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? =
    RedoxModRawLibc.cmsgFirsthdr(mhdr?.toLong() ?: 0L)

public actual fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    RedoxModRawLibc.cmsgNxthdr(mhdr?.toLong() ?: 0L, cmsg?.toLong() ?: 0L)

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    RedoxModRawLibc.bind(socket, address?.toLong() ?: 0L, addressLen)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT =
    RedoxModRawLibc.recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun recvmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    RedoxModRawLibc.recvmsg(socket, msg?.toLong() ?: 0L, flags)

public actual fun sendmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    RedoxModRawLibc.sendmsg(socket, msg?.toLong() ?: 0L, flags)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    RedoxModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    RedoxModRawLibc.preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    RedoxModRawLibc.pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    RedoxModRawLibc.readv(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    RedoxModRawLibc.writev(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun uname(utsname: Utsname?): CInt =
    RedoxModRawLibc.uname(utsname?.toLong() ?: 0L)

public actual fun gettimeofday(tp: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    RedoxModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    RedoxModRawLibc.clockGettime(clkId, tp?.toLong() ?: 0L)

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: io.github.kotlinmania.libc.Tm?): SizeT =
    RedoxModRawLibc.strftime(s?.value ?: 0L, max, format, tm?.toLong() ?: 0L)

public actual fun loginTty(fd: CInt): CInt =
    RedoxModRawLibc.loginTty(fd)
