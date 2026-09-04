// port-lint: source L4reShared.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on Android host — use androidNative target for FFI")

public actual fun cPUALLOCSIZE(count: CInt): ULong =
    throw UnsupportedOperationException("cPUALLOCSIZE not available on Android host — use androidNative target for FFI")

public actual fun cPUZERO(cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUZERO not available on Android host — use androidNative target for FFI")
}

public actual fun cPUSET(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUSET not available on Android host — use androidNative target for FFI")
}

public actual fun cPUCLR(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUCLR not available on Android host — use androidNative target for FFI")
}

public actual fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET not available on Android host — use androidNative target for FFI")

public actual fun cPUCOUNTS(size: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("cPUCOUNTS not available on Android host — use androidNative target for FFI")

public actual fun cPUCOUNT(cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("cPUCOUNT not available on Android host — use androidNative target for FFI")

public actual fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL not available on Android host — use androidNative target for FFI")

public actual fun rTLOCALADDR(flags: UInt): Boolean =
    throw UnsupportedOperationException("rTLOCALADDR not available on Android host — use androidNative target for FFI")

public actual fun iopl(level: CInt): CInt =
    throw UnsupportedOperationException("iopl not available on Android host — use androidNative target for FFI")

public actual fun ioperm(from: CULong, num: CULong, turnOn: CInt): CInt =
    throw UnsupportedOperationException("ioperm not available on Android host — use androidNative target for FFI")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead not available on Android host — use androidNative target for FFI")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite not available on Android host — use androidNative target for FFI")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync not available on Android host — use androidNative target for FFI")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError not available on Android host — use androidNative target for FFI")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn not available on Android host — use androidNative target for FFI")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend not available on Android host — use androidNative target for FFI")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel not available on Android host — use androidNative target for FFI")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio not available on Android host — use androidNative target for FFI")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev not available on Android host — use androidNative target for FFI")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv not available on Android host — use androidNative target for FFI")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo not available on Android host — use androidNative target for FFI")

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getloadavg not available on Android host — use androidNative target for FFI")

public actual fun processVmReadv(pid: PidT, localIov: Iovec?, liovcnt: CULong, remoteIov: Iovec?, riovcnt: CULong, flags: CULong): Long =
    throw UnsupportedOperationException("processVmReadv not available on Android host — use androidNative target for FFI")

public actual fun processVmWritev(pid: PidT, localIov: Iovec?, liovcnt: CULong, remoteIov: Iovec?, riovcnt: CULong, flags: CULong): Long =
    throw UnsupportedOperationException("processVmWritev not available on Android host — use androidNative target for FFI")

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    throw UnsupportedOperationException("futimes not available on Android host — use androidNative target for FFI")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR not available on Android host — use androidNative target for FFI")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs not available on Android host — use androidNative target for FFI")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs not available on Android host — use androidNative target for FFI")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand not available on Android host — use androidNative target for FFI")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand not available on Android host — use androidNative target for FFI")
}

public actual fun lrand48(): CLong =
    throw UnsupportedOperationException("lrand48 not available on Android host — use androidNative target for FFI")

public actual fun nrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("nrand48 not available on Android host — use androidNative target for FFI")

public actual fun jrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("jrand48 not available on Android host — use androidNative target for FFI")

public actual fun srand48(seed: CLong) {
    throw UnsupportedOperationException("srand48 not available on Android host — use androidNative target for FFI")
}

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent not available on Android host — use androidNative target for FFI")
}

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent not available on Android host — use androidNative target for FFI")
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on Android host — use androidNative target for FFI")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent not available on Android host — use androidNative target for FFI")
}

public actual fun endgrent() {
    throw UnsupportedOperationException("endgrent not available on Android host — use androidNative target for FFI")
}

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent not available on Android host — use androidNative target for FFI")

public actual fun setspent() {
    throw UnsupportedOperationException("setspent not available on Android host — use androidNative target for FFI")
}

public actual fun endspent() {
    throw UnsupportedOperationException("endspent not available on Android host — use androidNative target for FFI")
}

public actual fun getspent(): Spwd? =
    throw UnsupportedOperationException("getspent not available on Android host — use androidNative target for FFI")

public actual fun getspnam(name: String?): Spwd? =
    throw UnsupportedOperationException("getspnam not available on Android host — use androidNative target for FFI")

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget not available on Android host — use androidNative target for FFI")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat not available on Android host — use androidNative target for FFI")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("shmdt not available on Android host — use androidNative target for FFI")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl not available on Android host — use androidNative target for FFI")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect not available on Android host — use androidNative target for FFI")

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation not available on Android host — use androidNative target for FFI")

public actual fun mremap(addr: COpaquePointer?, len: ULong, newLen: ULong, flags: CInt, vararg args: Any?): COpaquePointer? =
    throw UnsupportedOperationException("mremap not available on Android host — use androidNative target for FFI")

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree not available on Android host — use androidNative target for FFI")
}

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir not available on Android host — use androidNative target for FFI")
}

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("telldir not available on Android host — use androidNative target for FFI")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise not available on Android host — use androidNative target for FFI")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync not available on Android host — use androidNative target for FFI")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL not available on Android host — use androidNative target for FFI")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedGetaffinity not available on Android host — use androidNative target for FFI")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMax not available on Android host — use androidNative target for FFI")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("settimeofday not available on Android host — use androidNative target for FFI")

public actual fun semTimedwait(sem: SemT, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("semTimedwait not available on Android host — use androidNative target for FFI")

public actual fun semGetvalue(sem: SemT, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue not available on Android host — use androidNative target for FFI")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CULong, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mount not available on Android host — use androidNative target for FFI")

public actual fun prctl(option: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("prctl not available on Android host — use androidNative target for FFI")

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("ppoll not available on Android host — use androidNative target for FFI")

public actual fun sethostname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("sethostname not available on Android host — use androidNative target for FFI")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMin not available on Android host — use androidNative target for FFI")

public actual fun sysinfo(info: Sysinfo?): CInt =
    throw UnsupportedOperationException("sysinfo not available on Android host — use androidNative target for FFI")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend not available on Android host — use androidNative target for FFI")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR not available on Android host — use androidNative target for FFI")

public actual fun semClose(sem: SemT): CInt =
    throw UnsupportedOperationException("semClose not available on Android host — use androidNative target for FFI")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR not available on Android host — use androidNative target for FFI")

public actual fun initgroups(user: String?, group: GidT): CInt =
    throw UnsupportedOperationException("initgroups not available on Android host — use androidNative target for FFI")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT =
    throw UnsupportedOperationException("semOpen not available on Android host — use androidNative target for FFI")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on Android host — use androidNative target for FFI")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("semUnlink not available on Android host — use androidNative target for FFI")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("daemon not available on Android host — use androidNative target for FFI")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait not available on Android host — use androidNative target for FFI")

public actual fun getgrgid(gid: GidT): Group? =
    throw UnsupportedOperationException("getgrgid not available on Android host — use androidNative target for FFI")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen not available on Android host — use androidNative target for FFI")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("faccessat not available on Android host — use androidNative target for FFI")

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    throw UnsupportedOperationException("setmntent not available on Android host — use androidNative target for FFI")

public actual fun getmntent(stream: FILE?): Mntent? =
    throw UnsupportedOperationException("getmntent not available on Android host — use androidNative target for FFI")

public actual fun addmntent(stream: FILE?, mnt: Mntent?): CInt =
    throw UnsupportedOperationException("addmntent not available on Android host — use androidNative target for FFI")

public actual fun endmntent(streamp: FILE?): CInt =
    throw UnsupportedOperationException("endmntent not available on Android host — use androidNative target for FFI")

public actual fun hasmntopt(mnt: Mntent?, opt: String?): String? =
    throw UnsupportedOperationException("hasmntopt not available on Android host — use androidNative target for FFI")

public actual fun regcomp(preg: RegexT, pattern: String?, cflags: CInt): CInt =
    throw UnsupportedOperationException("regcomp not available on Android host — use androidNative target for FFI")

public actual fun regexec(preg: RegexT, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt =
    throw UnsupportedOperationException("regexec not available on Android host — use androidNative target for FFI")

public actual fun regerror(errcode: CInt, preg: RegexT, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror not available on Android host — use androidNative target for FFI")

public actual fun regfree(preg: RegexT) {
    throw UnsupportedOperationException("regfree not available on Android host — use androidNative target for FFI")
}

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv not available on Android host — use androidNative target for FFI")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("iconvClose not available on Android host — use androidNative target for FFI")

public actual fun gettid(): PidT =
    throw UnsupportedOperationException("gettid not available on Android host — use androidNative target for FFI")

public actual fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerCreate not available on Android host — use androidNative target for FFI")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerDelete not available on Android host — use androidNative target for FFI")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerGetoverrun not available on Android host — use androidNative target for FFI")

public actual fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerGettime not available on Android host — use androidNative target for FFI")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerSettime not available on Android host — use androidNative target for FFI")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on Android host — use androidNative target for FFI")

public actual fun schedGetcpu(): CInt =
    throw UnsupportedOperationException("schedGetcpu not available on Android host — use androidNative target for FFI")

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    throw UnsupportedOperationException("getoptLong not available on Android host — use androidNative target for FFI")

public actual fun copyFileRange(fdIn: CInt, offIn: Off64T?, fdOut: CInt, offOut: Off64T?, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("copyFileRange not available on Android host — use androidNative target for FFI")


public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko64 not available on Android host — use androidNative target for FFI")

public actual fun fsetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    throw UnsupportedOperationException("fsetpos64 not available on Android host — use androidNative target for FFI")

public actual fun ftello64(stream: FILE?): Off64T =
    throw UnsupportedOperationException("ftello64 not available on Android host — use androidNative target for FFI")

