// port-lint: source L4reShared.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun cPUALLOCSIZE(count: CInt): ULong =
    throw UnsupportedOperationException("cPUALLOCSIZE requires N-API addon")

public actual fun cPUZERO(cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUZERO requires N-API addon")
}

public actual fun cPUSET(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUSET requires N-API addon")
}

public actual fun cPUCLR(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUCLR requires N-API addon")
}

public actual fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires N-API addon")

public actual fun cPUCOUNTS(size: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("cPUCOUNTS requires N-API addon")

public actual fun cPUCOUNT(cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("cPUCOUNT requires N-API addon")

public actual fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL requires N-API addon")

public actual fun rTLOCALADDR(flags: UInt): Boolean =
    throw UnsupportedOperationException("rTLOCALADDR requires N-API addon")

public actual fun iopl(level: CInt): CInt =
    throw UnsupportedOperationException("iopl requires N-API addon")

public actual fun ioperm(from: CULong, num: CULong, turnOn: CInt): CInt =
    throw UnsupportedOperationException("ioperm requires N-API addon")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead requires N-API addon")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite requires N-API addon")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync requires N-API addon")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError requires N-API addon")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn requires N-API addon")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend requires N-API addon")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel requires N-API addon")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio requires N-API addon")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getloadavg requires N-API addon")

public actual fun processVmReadv(pid: PidT, localIov: Iovec?, liovcnt: CULong, remoteIov: Iovec?, riovcnt: CULong, flags: CULong): Long =
    throw UnsupportedOperationException("processVmReadv requires N-API addon")

public actual fun processVmWritev(pid: PidT, localIov: Iovec?, liovcnt: CULong, remoteIov: Iovec?, riovcnt: CULong, flags: CULong): Long =
    throw UnsupportedOperationException("processVmWritev requires N-API addon")

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    throw UnsupportedOperationException("futimes requires N-API addon")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs requires N-API addon")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires N-API addon")
}

public actual fun lrand48(): CLong =
    throw UnsupportedOperationException("lrand48 requires N-API addon")

public actual fun nrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("nrand48 requires N-API addon")

public actual fun jrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("jrand48 requires N-API addon")

public actual fun srand48(seed: CLong) {
    throw UnsupportedOperationException("srand48 requires N-API addon")
}

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent requires N-API addon")
}

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent requires N-API addon")
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires N-API addon")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent requires N-API addon")
}

public actual fun endgrent() {
    throw UnsupportedOperationException("endgrent requires N-API addon")
}

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires N-API addon")

public actual fun setspent() {
    throw UnsupportedOperationException("setspent requires N-API addon")
}

public actual fun endspent() {
    throw UnsupportedOperationException("endspent requires N-API addon")
}

public actual fun getspent(): Spwd? =
    throw UnsupportedOperationException("getspent requires N-API addon")

public actual fun getspnam(name: String?): Spwd? =
    throw UnsupportedOperationException("getspnam requires N-API addon")

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget requires N-API addon")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires N-API addon")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("shmdt requires N-API addon")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation requires N-API addon")

public actual fun mremap(addr: COpaquePointer?, len: ULong, newLen: ULong, flags: CInt, vararg args: Any?): COpaquePointer? =
    throw UnsupportedOperationException("mremap requires N-API addon")

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree requires N-API addon")
}

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir requires N-API addon")
}

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("telldir requires N-API addon")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo requires N-API addon")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL requires N-API addon")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedGetaffinity requires N-API addon")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMax requires N-API addon")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun semTimedwait(sem: SemT, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("semTimedwait requires N-API addon")

public actual fun semGetvalue(sem: SemT, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CULong, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mount requires N-API addon")

public actual fun prctl(option: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("prctl requires N-API addon")

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("ppoll requires N-API addon")

public actual fun sethostname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("sethostname requires N-API addon")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMin requires N-API addon")

public actual fun sysinfo(info: Sysinfo?): CInt =
    throw UnsupportedOperationException("sysinfo requires N-API addon")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend requires N-API addon")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires N-API addon")

public actual fun semClose(sem: SemT): CInt =
    throw UnsupportedOperationException("semClose requires N-API addon")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires N-API addon")

public actual fun initgroups(user: String?, group: GidT): CInt =
    throw UnsupportedOperationException("initgroups requires N-API addon")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT =
    throw UnsupportedOperationException("semOpen requires N-API addon")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires N-API addon")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("semUnlink requires N-API addon")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("daemon requires N-API addon")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait requires N-API addon")

public actual fun getgrgid(gid: GidT): Group? =
    throw UnsupportedOperationException("getgrgid requires N-API addon")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen requires N-API addon")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("faccessat requires N-API addon")

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    throw UnsupportedOperationException("setmntent requires N-API addon")

public actual fun getmntent(stream: FILE?): Mntent? =
    throw UnsupportedOperationException("getmntent requires N-API addon")

public actual fun addmntent(stream: FILE?, mnt: Mntent?): CInt =
    throw UnsupportedOperationException("addmntent requires N-API addon")

public actual fun endmntent(streamp: FILE?): CInt =
    throw UnsupportedOperationException("endmntent requires N-API addon")

public actual fun hasmntopt(mnt: Mntent?, opt: String?): String? =
    throw UnsupportedOperationException("hasmntopt requires N-API addon")

public actual fun regcomp(preg: RegexT, pattern: String?, cflags: CInt): CInt =
    throw UnsupportedOperationException("regcomp requires N-API addon")

public actual fun regexec(preg: RegexT, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt =
    throw UnsupportedOperationException("regexec requires N-API addon")

public actual fun regerror(errcode: CInt, preg: RegexT, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror requires N-API addon")

public actual fun regfree(preg: RegexT) {
    throw UnsupportedOperationException("regfree requires N-API addon")
}

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv requires N-API addon")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("iconvClose requires N-API addon")

public actual fun gettid(): PidT =
    throw UnsupportedOperationException("gettid requires N-API addon")

public actual fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerCreate requires N-API addon")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerDelete requires N-API addon")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerGetoverrun requires N-API addon")

public actual fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerGettime requires N-API addon")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerSettime requires N-API addon")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires N-API addon")

public actual fun schedGetcpu(): CInt =
    throw UnsupportedOperationException("schedGetcpu requires N-API addon")

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    throw UnsupportedOperationException("getoptLong requires N-API addon")

public actual fun copyFileRange(fdIn: CInt, offIn: Off64T?, fdOut: CInt, offOut: Off64T?, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("copyFileRange requires N-API addon")


public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko64 requires N-API addon")

public actual fun fsetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    throw UnsupportedOperationException("fsetpos64 requires N-API addon")

public actual fun ftello64(stream: FILE?): Off64T =
    throw UnsupportedOperationException("ftello64 requires N-API addon")

