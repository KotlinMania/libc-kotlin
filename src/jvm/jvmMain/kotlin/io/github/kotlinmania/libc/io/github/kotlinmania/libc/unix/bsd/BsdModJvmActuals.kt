package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.COpaquePointer

internal object BsdModRawLibc {
    external fun getrlimit(resource: Int, rlim: Long): Int
    external fun setrlimit(resource: Int, rlim: Long): Int
    external fun strerrorR(errnum: Int, buf: Long, buflen: Long): Int
    external fun abs(i: Int): Int
    external fun labs(i: Long): Long
    external fun rand(): Int
    external fun srand(seed: Int)
    external fun getifaddrs(ifap: Long): Int
    external fun freeifaddrs(ifa: Long)
    external fun setgroups(ngroups: Int, ptr: Long): Int
    external fun setlogin(name: String?): Int
    external fun kqueue(): Int
    external fun unmount(target: String?, arg: Int): Int
    external fun getpwent(): Long?
    external fun setpwent()
    external fun endpwent()
    external fun endgrent()
    external fun getgrent(): Long?
    external fun getprogname(): Long?
    external fun setprogname(name: String?)
    external fun getloadavg(loadavg: Long, nelem: Int): Int
    external fun ifNameindex(): Long?
    external fun ifFreenameindex(ptr: Long)
    external fun getpeereid(socket: Int, euid: Long, egid: Long): Int
    external fun glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int
    external fun globfree(pglob: Long)
    external fun posixMadvise(addr: Long, len: Long, advice: Int): Int
    external fun shmUnlink(name: String?): Int
    external fun seekdir(dirp: Long, loc: Long)
    external fun telldir(dirp: Long): Long
    external fun madvise(addr: Long, len: Long, advice: Int): Int
    external fun msync(addr: Long, len: Long, flags: Int): Int
    external fun recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long
    external fun mkstemps(template: Long, suffixlen: Int): Int
    external fun futimes(fd: Int, times: Long): Int
    external fun nlLanginfo(item: Long): Long?
    external fun bind(socket: Int, address: Long, addressLen: Long): Int
    external fun writev(fd: Int, iov: Long, iovcnt: Int): Long
    external fun readv(fd: Int, iov: Long, iovcnt: Int): Long
    external fun sendmsg(fd: Int, msg: Long, flags: Int): Long
    external fun recvmsg(fd: Int, msg: Long, flags: Int): Long
    external fun sync()
    external fun getgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun sigaltstack(ss: Long, oss: Long): Int
    external fun sigsuspend(mask: Long): Int
    external fun semClose(sem: Long): Int
    external fun getdtablesize(): Int
    external fun getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun pthreadSigmask(how: Int, set: Long, oldset: Long): Int
    external fun getgrnam(name: String?): Long?
    external fun pthreadCancel(thread: Long): Int
    external fun pthreadKill(thread: Long, sig: Int): Int
    external fun schedGetPriorityMin(policy: Int): Int
    external fun schedGetPriorityMax(policy: Int): Int
    external fun semUnlink(name: String?): Int
    external fun getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getpwuidR(uid: Int, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun sigwait(set: Long, sig: Long): Int
    external fun pthreadAtfork(prepare: Long, parent: Long, child: Long): Int
    external fun getgrgid(gid: Int): Long?
    external fun popen(command: String?, mode: String?): Long?
    external fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
    external fun pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int
    external fun acct(filename: String?): Int
    external fun wait4(pid: Int, status: Long, options: Int, rusage: Long): Int
    external fun getitimer(which: Int, currValue: Long): Int
    external fun setitimer(which: Int, newValue: Long, oldValue: Long): Int
    external fun regcomp(preg: Long, pattern: String?, cflags: Int): Int
    external fun regexec(preg: Long, input: String?, nmatch: Long, pmatch: Long, eflags: Int): Int
    external fun regerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long
    external fun regfree(preg: Long)
    external fun arc4random(): Int
    external fun arc4randomBuf(buf: Long, size: Long)
    external fun arc4randomUniform(l: Int): Int
    external fun drand48(): Double
    external fun erand48(xseed: Long): Double
    external fun lrand48(): Long
    external fun nrand48(xseed: Long): Long
    external fun mrand48(): Long
    external fun jrand48(xseed: Long): Long
    external fun srand48(seed: Long)
    external fun seed48(xseed: Long): Long?
    external fun lcong48(p: Long)
    external fun getoptLong(argc: Int, argv: Long, optstring: String?, longopts: Long, longindex: Long): Int
    external fun strftime(buf: Long, maxsize: Long, format: String?, timeptr: Long): Long
    external fun strftimeL(buf: Long, maxsize: Long, format: String?, timeptr: Long, locale: Long): Long
    external fun devname(dev: Long, modeT: Int): Long?
    external fun issetugid(): Int
}

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    BsdModRawLibc.getrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    BsdModRawLibc.setrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    BsdModRawLibc.strerrorR(errnum, buf?.value ?: 0L, buflen)

public actual fun abs(i: CInt): CInt =
    BsdModRawLibc.abs(i)

public actual fun labs(i: CLong): CLong =
    BsdModRawLibc.labs(i)

public actual fun rand(): CInt =
    BsdModRawLibc.rand()

public actual fun srand(seed: CUint) {
    BsdModRawLibc.srand(seed)
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    BsdModRawLibc.getifaddrs(ifap?.value ?: 0L)

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    BsdModRawLibc.freeifaddrs(ifa?.toLong() ?: 0L)
}

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    BsdModRawLibc.setgroups(ngroups, ptr?.toLong() ?: 0L)

public actual fun setlogin(name: String?): CInt =
    BsdModRawLibc.setlogin(name)

public actual fun kqueue(): CInt =
    BsdModRawLibc.kqueue()

public actual fun unmount(target: String?, arg: CInt): CInt =
    BsdModRawLibc.unmount(target, arg)

public actual fun getpwent(): Passwd? =
    BsdModRawLibc.getpwent()

public actual fun setpwent() {
    BsdModRawLibc.setpwent()
}

public actual fun endpwent() {
    BsdModRawLibc.endpwent()
}

public actual fun endgrent() {
    BsdModRawLibc.endgrent()
}

public actual fun getgrent(): Group? =
    BsdModRawLibc.getgrent()

public actual fun getprogname(): COpaquePointer? =
    BsdModRawLibc.getprogname().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setprogname(name: String?) {
    BsdModRawLibc.setprogname(name)
}

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    BsdModRawLibc.getloadavg(loadavg?.toLong() ?: 0L, nelem)

public actual fun ifNameindex(): IfNameindex? =
    BsdModRawLibc.ifNameindex()

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    BsdModRawLibc.ifFreenameindex(ptr?.toLong() ?: 0L)
}

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    BsdModRawLibc.getpeereid(socket, euid?.toLong() ?: 0L, egid?.toLong() ?: 0L)

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: GlobT?): CInt =
    BsdModRawLibc.glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)

public actual fun globfree(pglob: GlobT?) {
    BsdModRawLibc.globfree(pglob?.toLong() ?: 0L)
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    BsdModRawLibc.posixMadvise(addr?.value ?: 0L, len, advice)

public actual fun shmUnlink(name: String?): CInt =
    BsdModRawLibc.shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    BsdModRawLibc.seekdir(dirp?.toLong() ?: 0L, loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    BsdModRawLibc.telldir(dirp?.toLong() ?: 0L)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    BsdModRawLibc.madvise(addr?.value ?: 0L, len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    BsdModRawLibc.msync(addr?.value ?: 0L, len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT =
    BsdModRawLibc.recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    BsdModRawLibc.mkstemps(template?.value ?: 0L, suffixlen)

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    BsdModRawLibc.futimes(fd, times?.toLong() ?: 0L)

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    BsdModRawLibc.nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    BsdModRawLibc.bind(socket, address?.toLong() ?: 0L, addressLen)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    BsdModRawLibc.writev(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    BsdModRawLibc.readv(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    BsdModRawLibc.sendmsg(fd, msg?.toLong() ?: 0L, flags)

public actual fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    BsdModRawLibc.recvmsg(fd, msg?.toLong() ?: 0L, flags)

public actual fun sync() {
    BsdModRawLibc.sync()
}

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    BsdModRawLibc.getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    BsdModRawLibc.sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)

public actual fun sigsuspend(mask: SigsetT?): CInt =
    BsdModRawLibc.sigsuspend(mask?.toLong() ?: 0L)

public actual fun semClose(sem: SemT?): CInt =
    BsdModRawLibc.semClose(sem?.toLong() ?: 0L)

public actual fun getdtablesize(): CInt =
    BsdModRawLibc.getdtablesize()

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    BsdModRawLibc.getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    BsdModRawLibc.pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)

public actual fun getgrnam(name: String?): Group? =
    BsdModRawLibc.getgrnam(name)

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    BsdModRawLibc.pthreadCancel(thread)

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    BsdModRawLibc.pthreadKill(thread, sig)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    BsdModRawLibc.schedGetPriorityMin(policy)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    BsdModRawLibc.schedGetPriorityMax(policy)

public actual fun semUnlink(name: String?): CInt =
    BsdModRawLibc.semUnlink(name)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    BsdModRawLibc.getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    BsdModRawLibc.getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    BsdModRawLibc.sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    BsdModRawLibc.pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)

public actual fun getgrgid(gid: GidT): Group? =
    BsdModRawLibc.getgrgid(gid)

public actual fun popen(command: String?, mode: String?): FILE? =
    BsdModRawLibc.popen(command, mode)

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    BsdModRawLibc.faccessat(dirfd, pathname, mode, flags)

public actual fun pthreadCreate(native: UintptrT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    BsdModRawLibc.pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)

public actual fun acct(filename: String?): CInt =
    BsdModRawLibc.acct(filename)

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    BsdModRawLibc.wait4(pid, status?.toLong() ?: 0L, options, rusage?.toLong() ?: 0L)

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    BsdModRawLibc.getitimer(which, currValue?.toLong() ?: 0L)

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    BsdModRawLibc.setitimer(which, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    BsdModRawLibc.regcomp(preg?.toLong() ?: 0L, pattern, cflags)

public actual fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    BsdModRawLibc.regexec(preg?.toLong() ?: 0L, input, nmatch, pmatch?.toLong() ?: 0L, eflags)

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    BsdModRawLibc.regerror(errcode, preg?.toLong() ?: 0L, errbuf?.value ?: 0L, errbufSize)

public actual fun regfree(preg: RegexT?) {
    BsdModRawLibc.regfree(preg?.toLong() ?: 0L)
}

public actual fun arc4random(): UInt =
    BsdModRawLibc.arc4random()

public actual fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    BsdModRawLibc.arc4randomBuf(buf?.value ?: 0L, size)
}

public actual fun arc4randomUniform(l: UInt): UInt =
    BsdModRawLibc.arc4randomUniform(l)

public actual fun drand48(): CDouble =
    BsdModRawLibc.drand48()

public actual fun erand48(xseed: CUshort?): CDouble =
    BsdModRawLibc.erand48(xseed?.toLong() ?: 0L)

public actual fun lrand48(): CLong =
    BsdModRawLibc.lrand48()

public actual fun nrand48(xseed: CUshort?): CLong =
    BsdModRawLibc.nrand48(xseed?.toLong() ?: 0L)

public actual fun mrand48(): CLong =
    BsdModRawLibc.mrand48()

public actual fun jrand48(xseed: CUshort?): CLong =
    BsdModRawLibc.jrand48(xseed?.toLong() ?: 0L)

public actual fun srand48(seed: CLong) {
    BsdModRawLibc.srand48(seed)
}

public actual fun seed48(xseed: CUshort?): CUshort? =
    BsdModRawLibc.seed48(xseed?.toLong() ?: 0L)

public actual fun lcong48(p: CUshort?) {
    BsdModRawLibc.lcong48(p?.toLong() ?: 0L)
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    BsdModRawLibc.getoptLong(argc, argv?.value ?: 0L, optstring, longopts?.toLong() ?: 0L, longindex?.toLong() ?: 0L)

public actual fun strftime(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?): SizeT =
    BsdModRawLibc.strftime(buf?.value ?: 0L, maxsize, format, timeptr?.toLong() ?: 0L)

public actual fun strftimeL(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?, locale: LocaleT): SizeT =
    BsdModRawLibc.strftimeL(buf?.value ?: 0L, maxsize, format, timeptr?.toLong() ?: 0L, locale)

public actual fun devname(dev: DevT, modeT: ModeT): COpaquePointer? =
    BsdModRawLibc.devname(dev, modeT).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun issetugid(): CInt =
    BsdModRawLibc.issetugid()
