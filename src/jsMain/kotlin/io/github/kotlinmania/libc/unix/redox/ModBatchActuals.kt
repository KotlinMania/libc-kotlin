// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR requires N-API addon")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires N-API addon")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET requires N-API addon")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO requires N-API addon")
}

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation requires N-API addon")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 requires N-API addon")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("getdtablesize requires N-API addon")

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    throw UnsupportedOperationException("getresgid requires N-API addon")

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    throw UnsupportedOperationException("getresuid requires N-API addon")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    throw UnsupportedOperationException("setresgid requires N-API addon")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    throw UnsupportedOperationException("setresuid requires N-API addon")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires N-API addon")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent requires N-API addon")
}

public actual fun endgrent() {
    throw UnsupportedOperationException("endgrent requires N-API addon")
}

public actual fun getgrgid(gid: GidT): Group? =
    throw UnsupportedOperationException("getgrgid requires N-API addon")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires N-API addon")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires N-API addon")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires N-API addon")

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist requires N-API addon")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign requires N-API addon")

public actual fun getnameinfo(addr: Sockaddr?, addrlen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires N-API addon")

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent requires N-API addon")
}

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent requires N-API addon")
}

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR requires N-API addon")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR requires N-API addon")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask requires N-API addon")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadCancel requires N-API addon")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("pthreadKill requires N-API addon")

public actual fun sigtimedwait(set: SigsetT?, sig: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait requires N-API addon")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait requires N-API addon")

public actual fun getsubopt(optionp: COpaquePointer?, tokens: COpaquePointer?, valuep: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getsubopt requires N-API addon")

public actual fun mkostemp(template: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemp requires N-API addon")

public actual fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemps requires N-API addon")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires N-API addon")

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("renameat2 requires N-API addon")

public actual fun explicitBzero(p: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero requires N-API addon")
}

public actual fun strlcat(dst: String?, src: String?, siz: ULong): ULong =
    throw UnsupportedOperationException("strlcat requires N-API addon")

public actual fun strlcpy(dst: String?, src: String?, siz: ULong): ULong =
    throw UnsupportedOperationException("strlcpy requires N-API addon")

public actual fun epollCreate(size: CInt): CInt =
    throw UnsupportedOperationException("epollCreate requires N-API addon")

public actual fun epollCreate1(flags: CInt): CInt =
    throw UnsupportedOperationException("epollCreate1 requires N-API addon")

public actual fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("epollWait requires N-API addon")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt =
    throw UnsupportedOperationException("epollCtl requires N-API addon")

public actual fun ioctl(fd: CInt, request: CULong, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires N-API addon")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink requires N-API addon")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires N-API addon")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires N-API addon")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun recvmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg requires N-API addon")

public actual fun sendmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg requires N-API addon")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv requires N-API addon")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev requires N-API addon")

public actual fun uname(utsname: Utsname?): CInt =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty requires N-API addon")

