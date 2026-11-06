package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.COpaquePointer

public actual fun iopl(level: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').iopl(level)") as CInt

public actual fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').ioperm(from, num, turnOn)") as CInt

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioRead(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioWrite(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioFsync(op, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioError(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioError(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').aioReturn(aiocbp?.toLong() ?: 0L)") as SsizeT

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioSuspend(aiocbList?.value ?: 0L, nitems, timeout?.toLong() ?: 0L)") as CInt

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioCancel(fd, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lioListio(mode, aiocbList?.value ?: 0L, nitems, sevp?.toLong() ?: 0L)") as CInt

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getloadavg(loadavg?.toLong() ?: 0L, nelem)") as CInt

public actual fun processVmReadv(pid: PidT, localIov: Iovec?, liovcnt: CUlong, remoteIov: Iovec?, riovcnt: CUlong, flags: CUlong): Long =
    js("require('@kotlinmania/libc-native-bindings').processVmReadv(pid, localIov?.toLong() ?: 0L, liovcnt, remoteIov?.toLong() ?: 0L, riovcnt, flags)") as Long

public actual fun processVmWritev(pid: PidT, localIov: Iovec?, liovcnt: CUlong, remoteIov: Iovec?, riovcnt: CUlong, flags: CUlong): Long =
    js("require('@kotlinmania/libc-native-bindings').processVmWritev(pid, localIov?.toLong() ?: 0L, liovcnt, remoteIov?.toLong() ?: 0L, riovcnt, flags)") as Long

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimes(fd, times?.toLong() ?: 0L)") as CInt

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strerrorR(errnum, buf?.value ?: 0L, buflen)") as CInt

public actual fun abs(i: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').abs(i)") as CInt

public actual fun labs(i: CLong): CLong =
    js("require('@kotlinmania/libc-native-bindings').labs(i)") as CLong

public actual fun rand(): CInt =
    js("require('@kotlinmania/libc-native-bindings').rand()") as CInt

public actual fun srand(seed: CUint) {
    js("require('@kotlinmania/libc-native-bindings').srand(seed)")
}

public actual fun drand48(): CDouble =
    js("require('@kotlinmania/libc-native-bindings').drand48()") as CDouble

public actual fun erand48(xseed: CUshort?): CDouble =
    js("require('@kotlinmania/libc-native-bindings').erand48(xseed?.toLong() ?: 0L)") as CDouble

public actual fun lrand48(): CLong =
    js("require('@kotlinmania/libc-native-bindings').lrand48()") as CLong

public actual fun nrand48(xseed: CUshort?): CLong =
    js("require('@kotlinmania/libc-native-bindings').nrand48(xseed?.toLong() ?: 0L)") as CLong

public actual fun jrand48(xseed: CUshort?): CLong =
    js("require('@kotlinmania/libc-native-bindings').jrand48(xseed?.toLong() ?: 0L)") as CLong

public actual fun srand48(seed: CLong) {
    js("require('@kotlinmania/libc-native-bindings').srand48(seed)")
}

public actual fun setpwent() {
    js("require('@kotlinmania/libc-native-bindings').setpwent()")
}

public actual fun endpwent() {
    js("require('@kotlinmania/libc-native-bindings').endpwent()")
}

public actual fun getpwent(): Passwd? =
    js("require('@kotlinmania/libc-native-bindings').getpwent()") as Passwd?

public actual fun setgrent() {
    js("require('@kotlinmania/libc-native-bindings').setgrent()")
}

public actual fun endgrent() {
    js("require('@kotlinmania/libc-native-bindings').endgrent()")
}

public actual fun getgrent(): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrent()") as Group?

public actual fun setspent() {
    js("require('@kotlinmania/libc-native-bindings').setspent()")
}

public actual fun endspent() {
    js("require('@kotlinmania/libc-native-bindings').endspent()")
}

public actual fun getspent(): Spwd? =
    js("require('@kotlinmania/libc-native-bindings').getspent()") as Spwd?

public actual fun getspnam(name: String?): Spwd? =
    js("require('@kotlinmania/libc-native-bindings').getspnam(name)") as Spwd?

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmget(key, size, shmflg)") as CInt

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').shmat(shmid, shmaddr?.value ?: 0L, shmflg)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmdt(shmaddr?.value ?: 0L)") as CInt

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmctl(shmid, cmd, buf?.toLong() ?: 0L)") as CInt

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun errnoLocation(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').errnoLocation()") as CInt?

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)") as CInt

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    js("require('@kotlinmania/libc-native-bindings').globfree(pglob?.toLong() ?: 0L)")
}

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    js("require('@kotlinmania/libc-native-bindings').seekdir(dirp?.toLong() ?: 0L, loc)")
}

public actual fun telldir(dirp: DIR?): CLong =
    js("require('@kotlinmania/libc-native-bindings').telldir(dirp?.toLong() ?: 0L)") as CLong

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').madvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msync(addr?.value ?: 0L, len, flags)") as CInt

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as SsizeT

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfo(item)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfoL(item, locale)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMax(policy)") as CInt

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').settimeofday(tv?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)") as CInt

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mount(src, target, fstype, flags, data?.value ?: 0L)") as CInt

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ppoll(fds?.toLong() ?: 0L, nfds, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)") as CInt

public actual fun sethostname(name: String?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostname(name, len)") as CInt

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMin(policy)") as CInt

public actual fun sysinfo(info: Sysinfo?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysinfo(info?.toLong() ?: 0L)") as CInt

public actual fun sigsuspend(mask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigsuspend(mask?.toLong() ?: 0L)") as CInt

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun semClose(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semClose(sem?.toLong() ?: 0L)") as CInt

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun initgroups(user: String?, group: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').initgroups(user, group)") as CInt

public actual fun getgrnam(name: String?): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrnam(name)") as Group?

public actual fun semUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semUnlink(name)") as CInt

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').daemon(nochdir, noclose)") as CInt

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)") as CInt

public actual fun getgrgid(gid: GidT): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrgid(gid)") as Group?

public actual fun popen(command: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').popen(command, mode)") as FILE?

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').faccessat(dirfd, pathname, mode, flags)") as CInt

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)") as CInt

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').setmntent(filename, ty)") as FILE?

public actual fun getmntent(stream: FILE?): io.github.kotlinmania.libc.Mntent? =
    js("require('@kotlinmania/libc-native-bindings').getmntent(stream?.toLong() ?: 0L)") as io.github.kotlinmania.libc.Mntent?

public actual fun addmntent(stream: FILE?, mnt: io.github.kotlinmania.libc.Mntent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').addmntent(stream?.toLong() ?: 0L, mnt?.toLong() ?: 0L)") as CInt

public actual fun endmntent(streamp: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').endmntent(streamp?.toLong() ?: 0L)") as CInt

public actual fun hasmntopt(mnt: io.github.kotlinmania.libc.Mntent?, opt: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').hasmntopt(mnt?.toLong() ?: 0L, opt)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').regcomp(preg?.toLong() ?: 0L, pattern, cflags)") as CInt

public actual fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').regexec(preg?.toLong() ?: 0L, input, nmatch, pmatch?.toLong() ?: 0L, eflags)") as CInt

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').regerror(errcode, preg?.toLong() ?: 0L, errbuf?.value ?: 0L, errbufSize)") as SizeT

public actual fun regfree(preg: RegexT?) {
    js("require('@kotlinmania/libc-native-bindings').regfree(preg?.toLong() ?: 0L)")
}

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    js("require('@kotlinmania/libc-native-bindings').iconvOpen(tocode, fromcode)") as IconvT

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').iconv(cd, inbuf?.value ?: 0L, inbytesleft?.toLong() ?: 0L, outbuf?.value ?: 0L, outbytesleft?.toLong() ?: 0L)") as SizeT

public actual fun iconvClose(cd: IconvT): CInt =
    js("require('@kotlinmania/libc-native-bindings').iconvClose(cd)") as CInt

public actual fun gettid(): PidT =
    js("require('@kotlinmania/libc-native-bindings').gettid()") as PidT

public actual fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerCreate(clockid, sevp?.toLong() ?: 0L, timerid?.toLong() ?: 0L)") as CInt

public actual fun timerDelete(timerid: TimerT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerDelete(timerid)") as CInt

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerGetoverrun(timerid)") as CInt

public actual fun timerGettime(timerid: TimerT, currValue: io.github.kotlinmania.libc.Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerGettime(timerid, currValue?.toLong() ?: 0L)") as CInt

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: io.github.kotlinmania.libc.Itimerspec?, oldValue: io.github.kotlinmania.libc.Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerSettime(timerid, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)") as CInt

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun schedGetcpu(): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetcpu()") as CInt

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getoptLong(argc, argv?.value ?: 0L, optstring, longopts?.toLong() ?: 0L, longindex?.toLong() ?: 0L)") as CInt

public actual fun copyFileRange(fdIn: CInt, offIn: Off64T?, fdOut: CInt, offOut: Off64T?, len: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').copyFileRange(fdIn, offIn?.toLong() ?: 0L, fdOut, offOut?.toLong() ?: 0L, len, flags)") as SsizeT

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').freopen64(filename, mode, file?.toLong() ?: 0L)") as FILE?

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fseeko64(stream?.toLong() ?: 0L, offset, whence)") as CInt

public actual fun fsetpos64(stream: FILE?, ptr: io.github.kotlinmania.libc.Fpos64T?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsetpos64(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)") as CInt

public actual fun ftello64(stream: FILE?): Off64T =
    js("require('@kotlinmania/libc-native-bindings').ftello64(stream?.toLong() ?: 0L)") as Off64T
