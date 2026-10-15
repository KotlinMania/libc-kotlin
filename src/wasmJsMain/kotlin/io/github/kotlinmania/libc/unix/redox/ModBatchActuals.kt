// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public actual fun fdClear(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDCLR requires N-API addon")

public actual fun fdIsSet(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires N-API addon")

public actual fun fdSet(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET requires N-API addon")

public actual fun fdZero(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO requires N-API addon")

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation requires N-API addon")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun pipe2(fds: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pipe2 requires N-API addon")

public actual fun getdtablesize(): Int =
    throw UnsupportedOperationException("getdtablesize requires N-API addon")

public actual fun getresgid(rgid: Int?, egid: Int?, sgid: Int?): Int =
    throw UnsupportedOperationException("getresgid requires N-API addon")

public actual fun getresuid(ruid: Int?, euid: Int?, suid: Int?): Int =
    throw UnsupportedOperationException("getresuid requires N-API addon")

public actual fun setresgid(rgid: Int, egid: Int, sgid: Int): Int =
    throw UnsupportedOperationException("setresgid requires N-API addon")

public actual fun setresuid(ruid: Int, euid: Int, suid: Int): Int =
    throw UnsupportedOperationException("setresuid requires N-API addon")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires N-API addon")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent requires N-API addon")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent requires N-API addon")

public actual fun getgrgid(gid: Int): Group? =
    throw UnsupportedOperationException("getgrgid requires N-API addon")

public actual fun getgrgidR(gid: Int, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR requires N-API addon")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires N-API addon")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR requires N-API addon")

public actual fun getgrouplist(user: String?, group: Int, groups: Int?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist requires N-API addon")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign requires N-API addon")

public actual fun getnameinfo(addr: Sockaddr?, addrlen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires N-API addon")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent requires N-API addon")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent requires N-API addon")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwnamR requires N-API addon")

public actual fun getpwuidR(uid: Int, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwuidR requires N-API addon")

public actual fun pthreadSigmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("pthreadSigmask requires N-API addon")

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCancel requires N-API addon")

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.COpaquePointer?, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill requires N-API addon")

public actual fun sigtimedwait(set: ULong?, sig: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait requires N-API addon")

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait requires N-API addon")

public actual fun getsubopt(optionp: COpaquePointer?, tokens: COpaquePointer?, valuep: COpaquePointer?): Int =
    throw UnsupportedOperationException("getsubopt requires N-API addon")

public actual fun mkostemp(template: String?, flags: Int): Int =
    throw UnsupportedOperationException("mkostemp requires N-API addon")

public actual fun mkostemps(template: String?, suffixlen: Int, flags: Int): Int =
    throw UnsupportedOperationException("mkostemps requires N-API addon")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires N-API addon")

public actual fun renameat2(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: UInt): Int =
    throw UnsupportedOperationException("renameat2 requires N-API addon")

public actual fun explicitBzero(p: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("explicitBzero requires N-API addon")

public actual fun strlcat(dst: String?, src: String?, siz: ULong): ULong =
    throw UnsupportedOperationException("strlcat requires N-API addon")

public actual fun strlcpy(dst: String?, src: String?, siz: ULong): ULong =
    throw UnsupportedOperationException("strlcpy requires N-API addon")

public actual fun epollCreate(size: Int): Int =
    throw UnsupportedOperationException("epollCreate requires N-API addon")

public actual fun epollCreate1(flags: Int): Int =
    throw UnsupportedOperationException("epollCreate1 requires N-API addon")

public actual fun epollWait(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Int): Int =
    throw UnsupportedOperationException("epollWait requires N-API addon")

public actual fun epollCtl(epfd: Int, op: Int, fd: Int, event: EpollEvent?): Int =
    throw UnsupportedOperationException("epollCtl requires N-API addon")

public actual fun ioctl(fd: Int, request: ULong, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl requires N-API addon")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun shmOpen(name: String?, oflag: Int, mode: Int): Int =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink requires N-API addon")

public actual fun getpriority(which: Int, who: UInt): Int =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun setpriority(which: Int, who: UInt, prio: Int): Int =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun cmsgFirstHdr(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires N-API addon")

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int =
    throw UnsupportedOperationException("bind requires N-API addon")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun recvmsg(socket: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg requires N-API addon")

public actual fun sendmsg(socket: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg requires N-API addon")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires N-API addon")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires N-API addon")

public actual fun uname(utsname: Utsname?): Int =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun clockGettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun loginTty(fd: Int): Int =
    throw UnsupportedOperationException("loginTty requires N-API addon")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork requires N-API addon")

public actual fun pthreadCreate(tid: io.github.kotlinmania.libc.COpaquePointer?, attr: PthreadAttrT?, start: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires N-API addon")
