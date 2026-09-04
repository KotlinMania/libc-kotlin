// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR not available on WASI — no C library access")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on WASI — no C library access")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET not available on WASI — no C library access")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO not available on WASI — no C library access")
}

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation not available on WASI — no C library access")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR not available on WASI — no C library access")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd not available on WASI — no C library access")

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 not available on WASI — no C library access")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("getdtablesize not available on WASI — no C library access")

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    throw UnsupportedOperationException("getresgid not available on WASI — no C library access")

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    throw UnsupportedOperationException("getresuid not available on WASI — no C library access")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    throw UnsupportedOperationException("setresgid not available on WASI — no C library access")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    throw UnsupportedOperationException("setresuid not available on WASI — no C library access")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent not available on WASI — no C library access")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent not available on WASI — no C library access")
}

public actual fun endgrent() {
    throw UnsupportedOperationException("endgrent not available on WASI — no C library access")
}

public actual fun getgrgid(gid: GidT): Group? =
    throw UnsupportedOperationException("getgrgid not available on WASI — no C library access")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR not available on WASI — no C library access")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on WASI — no C library access")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR not available on WASI — no C library access")

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist not available on WASI — no C library access")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on WASI — no C library access")

public actual fun getnameinfo(addr: Sockaddr?, addrlen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo not available on WASI — no C library access")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on WASI — no C library access")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty not available on WASI — no C library access")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on WASI — no C library access")

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent not available on WASI — no C library access")
}

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent not available on WASI — no C library access")
}

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR not available on WASI — no C library access")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR not available on WASI — no C library access")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask not available on WASI — no C library access")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadCancel not available on WASI — no C library access")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("pthreadKill not available on WASI — no C library access")

public actual fun sigtimedwait(set: SigsetT?, sig: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait not available on WASI — no C library access")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait not available on WASI — no C library access")

public actual fun getsubopt(optionp: COpaquePointer?, tokens: COpaquePointer?, valuep: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getsubopt not available on WASI — no C library access")

public actual fun mkostemp(template: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemp not available on WASI — no C library access")

public actual fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemps not available on WASI — no C library access")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray not available on WASI — no C library access")

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("renameat2 not available on WASI — no C library access")

public actual fun explicitBzero(p: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero not available on WASI — no C library access")
}

public actual fun strlcat(dst: String?, src: String?, siz: ULong): ULong =
    throw UnsupportedOperationException("strlcat not available on WASI — no C library access")

public actual fun strlcpy(dst: String?, src: String?, siz: ULong): ULong =
    throw UnsupportedOperationException("strlcpy not available on WASI — no C library access")

public actual fun epollCreate(size: CInt): CInt =
    throw UnsupportedOperationException("epollCreate not available on WASI — no C library access")

public actual fun epollCreate1(flags: CInt): CInt =
    throw UnsupportedOperationException("epollCreate1 not available on WASI — no C library access")

public actual fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("epollWait not available on WASI — no C library access")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt =
    throw UnsupportedOperationException("epollCtl not available on WASI — no C library access")

public actual fun ioctl(fd: CInt, request: CULong, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl not available on WASI — no C library access")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise not available on WASI — no C library access")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync not available on WASI — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect not available on WASI — no C library access")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen not available on WASI — no C library access")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink not available on WASI — no C library access")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority not available on WASI — no C library access")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority not available on WASI — no C library access")

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit not available on WASI — no C library access")

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit not available on WASI — no C library access")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on WASI — no C library access")

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR not available on WASI — no C library access")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on WASI — no C library access")

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind not available on WASI — no C library access")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom not available on WASI — no C library access")

public actual fun recvmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg not available on WASI — no C library access")

public actual fun sendmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg not available on WASI — no C library access")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens not available on WASI — no C library access")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv not available on WASI — no C library access")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev not available on WASI — no C library access")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv not available on WASI — no C library access")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev not available on WASI — no C library access")

public actual fun uname(utsname: Utsname?): CInt =
    throw UnsupportedOperationException("uname not available on WASI — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on WASI — no C library access")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime not available on WASI — no C library access")

public actual fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on WASI — no C library access")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty not available on WASI — no C library access")

