package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.COpaquePointer

internal object LinuxL4reSharedRawLibc {
    external fun iopl(level: Int): Int
    external fun ioperm(from: Long, num: Long, turnOn: Int): Int
    external fun aioRead(aiocbp: Long): Int
    external fun aioWrite(aiocbp: Long): Int
    external fun aioFsync(op: Int, aiocbp: Long): Int
    external fun aioError(aiocbp: Long): Int
    external fun aioReturn(aiocbp: Long): Long
    external fun aioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int
    external fun aioCancel(fd: Int, aiocbp: Long): Int
    external fun lioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int
    external fun pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int
    external fun getloadavg(loadavg: Long, nelem: Int): Int
    external fun processVmReadv(pid: Int, localIov: Long, liovcnt: Long, remoteIov: Long, riovcnt: Long, flags: Long): Long
    external fun processVmWritev(pid: Int, localIov: Long, liovcnt: Long, remoteIov: Long, riovcnt: Long, flags: Long): Long
    external fun futimes(fd: Int, times: Long): Int
    external fun strerrorR(errnum: Int, buf: Long, buflen: Long): Int
    external fun abs(i: Int): Int
    external fun labs(i: Long): Long
    external fun rand(): Int
    external fun srand(seed: Int)
    external fun drand48(): Double
    external fun erand48(xseed: Long): Double
    external fun lrand48(): Long
    external fun nrand48(xseed: Long): Long
    external fun jrand48(xseed: Long): Long
    external fun srand48(seed: Long)
    external fun setpwent()
    external fun endpwent()
    external fun getpwent(): Long?
    external fun setgrent()
    external fun endgrent()
    external fun getgrent(): Long?
    external fun setspent()
    external fun endspent()
    external fun getspent(): Long?
    external fun getspnam(name: String?): Long?
    external fun shmget(key: Long, size: Long, shmflg: Int): Int
    external fun shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long?
    external fun shmdt(shmaddr: Long): Int
    external fun shmctl(shmid: Int, cmd: Int, buf: Long): Int
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun errnoLocation(): Long?
    external fun glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int
    external fun globfree(pglob: Long)
    external fun seekdir(dirp: Long, loc: Long)
    external fun telldir(dirp: Long): Long
    external fun madvise(addr: Long, len: Long, advice: Int): Int
    external fun msync(addr: Long, len: Long, flags: Int): Int
    external fun recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long
    external fun nlLanginfo(item: Long): Long?
    external fun nlLanginfoL(item: Long, locale: Long): Long?
    external fun schedGetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int
    external fun schedGetPriorityMax(policy: Int): Int
    external fun settimeofday(tv: Long, tz: Long): Int
    external fun semTimedwait(sem: Long, abstime: Long): Int
    external fun semGetvalue(sem: Long, sval: Long): Int
    external fun mount(src: String?, target: String?, fstype: String?, flags: Long, data: Long): Int
    external fun ppoll(fds: Long, nfds: Long, timeout: Long, sigmask: Long): Int
    external fun sethostname(name: String?, len: Long): Int
    external fun schedGetPriorityMin(policy: Int): Int
    external fun sysinfo(info: Long): Int
    external fun sigsuspend(mask: Long): Int
    external fun getgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun semClose(sem: Long): Int
    external fun getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun initgroups(user: String?, group: Int): Int
    external fun getgrnam(name: String?): Long?
    external fun semUnlink(name: String?): Int
    external fun daemon(nochdir: Int, noclose: Int): Int
    external fun sigwait(set: Long, sig: Long): Int
    external fun getgrgid(gid: Int): Long?
    external fun popen(command: String?, mode: String?): Long?
    external fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
    external fun dlIteratePhdr(callback: Long, data: Long): Int
    external fun setmntent(filename: String?, ty: String?): Long?
    external fun getmntent(stream: Long): Long?
    external fun addmntent(stream: Long, mnt: Long): Int
    external fun endmntent(streamp: Long): Int
    external fun hasmntopt(mnt: Long, opt: String?): Long?
    external fun regcomp(preg: Long, pattern: String?, cflags: Int): Int
    external fun regexec(preg: Long, input: String?, nmatch: Long, pmatch: Long, eflags: Int): Int
    external fun regerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long
    external fun regfree(preg: Long)
    external fun iconvOpen(tocode: String?, fromcode: String?): Long
    external fun iconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long
    external fun iconvClose(cd: Long): Int
    external fun gettid(): Int
    external fun timerCreate(clockid: Int, sevp: Long, timerid: Long): Int
    external fun timerDelete(timerid: Long): Int
    external fun timerGetoverrun(timerid: Long): Int
    external fun timerGettime(timerid: Long, currValue: Long): Int
    external fun timerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int
    external fun memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long?
    external fun schedGetcpu(): Int
    external fun getoptLong(argc: Int, argv: Long, optstring: String?, longopts: Long, longindex: Long): Int
    external fun copyFileRange(fdIn: Int, offIn: Long, fdOut: Int, offOut: Long, len: Long, flags: Int): Long
    external fun freopen64(filename: String?, mode: String?, file: Long): Long?
    external fun fseeko64(stream: Long, offset: Long, whence: Int): Int
    external fun fsetpos64(stream: Long, ptr: Long): Int
    external fun ftello64(stream: Long): Long
}

public actual fun iopl(level: CInt): CInt =
    LinuxL4reSharedRawLibc.iopl(level)

public actual fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt =
    LinuxL4reSharedRawLibc.ioperm(from, num, turnOn)

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    LinuxL4reSharedRawLibc.aioRead(aiocbp?.toLong() ?: 0L)

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    LinuxL4reSharedRawLibc.aioWrite(aiocbp?.toLong() ?: 0L)

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    LinuxL4reSharedRawLibc.aioFsync(op, aiocbp?.toLong() ?: 0L)

public actual fun aioError(aiocbp: Aiocb?): CInt =
    LinuxL4reSharedRawLibc.aioError(aiocbp?.toLong() ?: 0L)

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    LinuxL4reSharedRawLibc.aioReturn(aiocbp?.toLong() ?: 0L)

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    LinuxL4reSharedRawLibc.aioSuspend(aiocbList?.value ?: 0L, nitems, timeout?.toLong() ?: 0L)

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    LinuxL4reSharedRawLibc.aioCancel(fd, aiocbp?.toLong() ?: 0L)

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    LinuxL4reSharedRawLibc.lioListio(mode, aiocbList?.value ?: 0L, nitems, sevp?.toLong() ?: 0L)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    LinuxL4reSharedRawLibc.pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    LinuxL4reSharedRawLibc.preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    LinuxL4reSharedRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    LinuxL4reSharedRawLibc.getloadavg(loadavg?.toLong() ?: 0L, nelem)

public actual fun processVmReadv(pid: PidT, localIov: Iovec?, liovcnt: CUlong, remoteIov: Iovec?, riovcnt: CUlong, flags: CUlong): Long =
    LinuxL4reSharedRawLibc.processVmReadv(pid, localIov?.toLong() ?: 0L, liovcnt, remoteIov?.toLong() ?: 0L, riovcnt, flags)

public actual fun processVmWritev(pid: PidT, localIov: Iovec?, liovcnt: CUlong, remoteIov: Iovec?, riovcnt: CUlong, flags: CUlong): Long =
    LinuxL4reSharedRawLibc.processVmWritev(pid, localIov?.toLong() ?: 0L, liovcnt, remoteIov?.toLong() ?: 0L, riovcnt, flags)

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    LinuxL4reSharedRawLibc.futimes(fd, times?.toLong() ?: 0L)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    LinuxL4reSharedRawLibc.strerrorR(errnum, buf?.value ?: 0L, buflen)

public actual fun abs(i: CInt): CInt =
    LinuxL4reSharedRawLibc.abs(i)

public actual fun labs(i: CLong): CLong =
    LinuxL4reSharedRawLibc.labs(i)

public actual fun rand(): CInt =
    LinuxL4reSharedRawLibc.rand()

public actual fun srand(seed: CUint) {
    LinuxL4reSharedRawLibc.srand(seed)
}

public actual fun drand48(): CDouble =
    LinuxL4reSharedRawLibc.drand48()

public actual fun erand48(xseed: CUshort?): CDouble =
    LinuxL4reSharedRawLibc.erand48(xseed?.toLong() ?: 0L)

public actual fun lrand48(): CLong =
    LinuxL4reSharedRawLibc.lrand48()

public actual fun nrand48(xseed: CUshort?): CLong =
    LinuxL4reSharedRawLibc.nrand48(xseed?.toLong() ?: 0L)

public actual fun jrand48(xseed: CUshort?): CLong =
    LinuxL4reSharedRawLibc.jrand48(xseed?.toLong() ?: 0L)

public actual fun srand48(seed: CLong) {
    LinuxL4reSharedRawLibc.srand48(seed)
}

public actual fun setpwent() {
    LinuxL4reSharedRawLibc.setpwent()
}

public actual fun endpwent() {
    LinuxL4reSharedRawLibc.endpwent()
}

public actual fun getpwent(): Passwd? =
    LinuxL4reSharedRawLibc.getpwent()

public actual fun setgrent() {
    LinuxL4reSharedRawLibc.setgrent()
}

public actual fun endgrent() {
    LinuxL4reSharedRawLibc.endgrent()
}

public actual fun getgrent(): Group? =
    LinuxL4reSharedRawLibc.getgrent()

public actual fun setspent() {
    LinuxL4reSharedRawLibc.setspent()
}

public actual fun endspent() {
    LinuxL4reSharedRawLibc.endspent()
}

public actual fun getspent(): Spwd? =
    LinuxL4reSharedRawLibc.getspent()

public actual fun getspnam(name: String?): Spwd? =
    LinuxL4reSharedRawLibc.getspnam(name)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    LinuxL4reSharedRawLibc.shmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    LinuxL4reSharedRawLibc.shmat(shmid, shmaddr?.value ?: 0L, shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    LinuxL4reSharedRawLibc.shmdt(shmaddr?.value ?: 0L)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    LinuxL4reSharedRawLibc.shmctl(shmid, cmd, buf?.toLong() ?: 0L)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    LinuxL4reSharedRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun errnoLocation(): CInt? =
    LinuxL4reSharedRawLibc.errnoLocation()

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    LinuxL4reSharedRawLibc.glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    LinuxL4reSharedRawLibc.globfree(pglob?.toLong() ?: 0L)
}

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    LinuxL4reSharedRawLibc.seekdir(dirp?.toLong() ?: 0L, loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    LinuxL4reSharedRawLibc.telldir(dirp?.toLong() ?: 0L)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    LinuxL4reSharedRawLibc.madvise(addr?.value ?: 0L, len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    LinuxL4reSharedRawLibc.msync(addr?.value ?: 0L, len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    LinuxL4reSharedRawLibc.recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    LinuxL4reSharedRawLibc.nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    LinuxL4reSharedRawLibc.nlLanginfoL(item, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    LinuxL4reSharedRawLibc.schedGetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    LinuxL4reSharedRawLibc.schedGetPriorityMax(policy)

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    LinuxL4reSharedRawLibc.settimeofday(tv?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    LinuxL4reSharedRawLibc.semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    LinuxL4reSharedRawLibc.semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    LinuxL4reSharedRawLibc.mount(src, target, fstype, flags, data?.value ?: 0L)

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    LinuxL4reSharedRawLibc.ppoll(fds?.toLong() ?: 0L, nfds, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    LinuxL4reSharedRawLibc.sethostname(name, len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    LinuxL4reSharedRawLibc.schedGetPriorityMin(policy)

public actual fun sysinfo(info: Sysinfo?): CInt =
    LinuxL4reSharedRawLibc.sysinfo(info?.toLong() ?: 0L)

public actual fun sigsuspend(mask: SigsetT?): CInt =
    LinuxL4reSharedRawLibc.sigsuspend(mask?.toLong() ?: 0L)

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    LinuxL4reSharedRawLibc.getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun semClose(sem: SemT?): CInt =
    LinuxL4reSharedRawLibc.semClose(sem?.toLong() ?: 0L)

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    LinuxL4reSharedRawLibc.getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun initgroups(user: String?, group: GidT): CInt =
    LinuxL4reSharedRawLibc.initgroups(user, group)

public actual fun getgrnam(name: String?): Group? =
    LinuxL4reSharedRawLibc.getgrnam(name)

public actual fun semUnlink(name: String?): CInt =
    LinuxL4reSharedRawLibc.semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    LinuxL4reSharedRawLibc.daemon(nochdir, noclose)

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    LinuxL4reSharedRawLibc.sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)

public actual fun getgrgid(gid: GidT): Group? =
    LinuxL4reSharedRawLibc.getgrgid(gid)

public actual fun popen(command: String?, mode: String?): FILE? =
    LinuxL4reSharedRawLibc.popen(command, mode)

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    LinuxL4reSharedRawLibc.faccessat(dirfd, pathname, mode, flags)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    LinuxL4reSharedRawLibc.dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    LinuxL4reSharedRawLibc.setmntent(filename, ty)

public actual fun getmntent(stream: FILE?): io.github.kotlinmania.libc.Mntent? =
    LinuxL4reSharedRawLibc.getmntent(stream?.toLong() ?: 0L)

public actual fun addmntent(stream: FILE?, mnt: io.github.kotlinmania.libc.Mntent?): CInt =
    LinuxL4reSharedRawLibc.addmntent(stream?.toLong() ?: 0L, mnt?.toLong() ?: 0L)

public actual fun endmntent(streamp: FILE?): CInt =
    LinuxL4reSharedRawLibc.endmntent(streamp?.toLong() ?: 0L)

public actual fun hasmntopt(mnt: io.github.kotlinmania.libc.Mntent?, opt: String?): COpaquePointer? =
    LinuxL4reSharedRawLibc.hasmntopt(mnt?.toLong() ?: 0L, opt).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    LinuxL4reSharedRawLibc.regcomp(preg?.toLong() ?: 0L, pattern, cflags)

public actual fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    LinuxL4reSharedRawLibc.regexec(preg?.toLong() ?: 0L, input, nmatch, pmatch?.toLong() ?: 0L, eflags)

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    LinuxL4reSharedRawLibc.regerror(errcode, preg?.toLong() ?: 0L, errbuf?.value ?: 0L, errbufSize)

public actual fun regfree(preg: RegexT?) {
    LinuxL4reSharedRawLibc.regfree(preg?.toLong() ?: 0L)
}

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    LinuxL4reSharedRawLibc.iconvOpen(tocode, fromcode)

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    LinuxL4reSharedRawLibc.iconv(cd, inbuf?.value ?: 0L, inbytesleft?.toLong() ?: 0L, outbuf?.value ?: 0L, outbytesleft?.toLong() ?: 0L)

public actual fun iconvClose(cd: IconvT): CInt =
    LinuxL4reSharedRawLibc.iconvClose(cd)

public actual fun gettid(): PidT =
    LinuxL4reSharedRawLibc.gettid()

public actual fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT?): CInt =
    LinuxL4reSharedRawLibc.timerCreate(clockid, sevp?.toLong() ?: 0L, timerid?.toLong() ?: 0L)

public actual fun timerDelete(timerid: TimerT): CInt =
    LinuxL4reSharedRawLibc.timerDelete(timerid)

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    LinuxL4reSharedRawLibc.timerGetoverrun(timerid)

public actual fun timerGettime(timerid: TimerT, currValue: io.github.kotlinmania.libc.Itimerspec?): CInt =
    LinuxL4reSharedRawLibc.timerGettime(timerid, currValue?.toLong() ?: 0L)

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: io.github.kotlinmania.libc.Itimerspec?, oldValue: io.github.kotlinmania.libc.Itimerspec?): CInt =
    LinuxL4reSharedRawLibc.timerSettime(timerid, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    LinuxL4reSharedRawLibc.memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun schedGetcpu(): CInt =
    LinuxL4reSharedRawLibc.schedGetcpu()

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    LinuxL4reSharedRawLibc.getoptLong(argc, argv?.value ?: 0L, optstring, longopts?.toLong() ?: 0L, longindex?.toLong() ?: 0L)

public actual fun copyFileRange(fdIn: CInt, offIn: Off64T?, fdOut: CInt, offOut: Off64T?, len: SizeT, flags: CUint): SsizeT =
    LinuxL4reSharedRawLibc.copyFileRange(fdIn, offIn?.toLong() ?: 0L, fdOut, offOut?.toLong() ?: 0L, len, flags)

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    LinuxL4reSharedRawLibc.freopen64(filename, mode, file?.toLong() ?: 0L)

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    LinuxL4reSharedRawLibc.fseeko64(stream?.toLong() ?: 0L, offset, whence)

public actual fun fsetpos64(stream: FILE?, ptr: io.github.kotlinmania.libc.Fpos64T?): CInt =
    LinuxL4reSharedRawLibc.fsetpos64(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)

public actual fun ftello64(stream: FILE?): Off64T =
    LinuxL4reSharedRawLibc.ftello64(stream?.toLong() ?: 0L)
