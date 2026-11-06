package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.COpaquePointer

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

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

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getifaddrs(ifap?.value ?: 0L)") as CInt

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    js("require('@kotlinmania/libc-native-bindings').freeifaddrs(ifa?.toLong() ?: 0L)")
}

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setgroups(ngroups, ptr?.toLong() ?: 0L)") as CInt

public actual fun setlogin(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setlogin(name)") as CInt

public actual fun kqueue(): CInt =
    js("require('@kotlinmania/libc-native-bindings').kqueue()") as CInt

public actual fun unmount(target: String?, arg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').unmount(target, arg)") as CInt

public actual fun getpwent(): Passwd? =
    js("require('@kotlinmania/libc-native-bindings').getpwent()") as Passwd?

public actual fun setpwent() {
    js("require('@kotlinmania/libc-native-bindings').setpwent()")
}

public actual fun endpwent() {
    js("require('@kotlinmania/libc-native-bindings').endpwent()")
}

public actual fun endgrent() {
    js("require('@kotlinmania/libc-native-bindings').endgrent()")
}

public actual fun getgrent(): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrent()") as Group?

public actual fun getprogname(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getprogname()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setprogname(name: String?) {
    js("require('@kotlinmania/libc-native-bindings').setprogname(name)")
}

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getloadavg(loadavg?.toLong() ?: 0L, nelem)") as CInt

public actual fun ifNameindex(): IfNameindex? =
    js("require('@kotlinmania/libc-native-bindings').ifNameindex()") as IfNameindex?

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    js("require('@kotlinmania/libc-native-bindings').ifFreenameindex(ptr?.toLong() ?: 0L)")
}

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpeereid(socket, euid?.toLong() ?: 0L, egid?.toLong() ?: 0L)") as CInt

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: GlobT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)") as CInt

public actual fun globfree(pglob: GlobT?) {
    js("require('@kotlinmania/libc-native-bindings').globfree(pglob?.toLong() ?: 0L)")
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixMadvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun shmUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmUnlink(name)") as CInt

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    js("require('@kotlinmania/libc-native-bindings').seekdir(dirp?.toLong() ?: 0L, loc)")
}

public actual fun telldir(dirp: DIR?): CLong =
    js("require('@kotlinmania/libc-native-bindings').telldir(dirp?.toLong() ?: 0L)") as CLong

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').madvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msync(addr?.value ?: 0L, len, flags)") as CInt

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as SsizeT

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkstemps(template?.value ?: 0L, suffixlen)") as CInt

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimes(fd, times?.toLong() ?: 0L)") as CInt

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfo(item)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').bind(socket, address?.toLong() ?: 0L, addressLen)") as CInt

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').writev(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readv(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendmsg(fd, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvmsg(fd, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun sync() {
    js("require('@kotlinmania/libc-native-bindings').sync()")
}

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)") as CInt

public actual fun sigsuspend(mask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigsuspend(mask?.toLong() ?: 0L)") as CInt

public actual fun semClose(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semClose(sem?.toLong() ?: 0L)") as CInt

public actual fun getdtablesize(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdtablesize()") as CInt

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)") as CInt

public actual fun getgrnam(name: String?): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrnam(name)") as Group?

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCancel(thread)") as CInt

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKill(thread, sig)") as CInt

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMin(policy)") as CInt

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMax(policy)") as CInt

public actual fun semUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semUnlink(name)") as CInt

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)") as CInt

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)") as CInt

public actual fun getgrgid(gid: GidT): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrgid(gid)") as Group?

public actual fun popen(command: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').popen(command, mode)") as FILE?

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').faccessat(dirfd, pathname, mode, flags)") as CInt

public actual fun pthreadCreate(native: UintptrT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)") as CInt

public actual fun acct(filename: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').acct(filename)") as CInt

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    js("require('@kotlinmania/libc-native-bindings').wait4(pid, status?.toLong() ?: 0L, options, rusage?.toLong() ?: 0L)") as PidT

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getitimer(which, currValue?.toLong() ?: 0L)") as CInt

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setitimer(which, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)") as CInt

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').regcomp(preg?.toLong() ?: 0L, pattern, cflags)") as CInt

public actual fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').regexec(preg?.toLong() ?: 0L, input, nmatch, pmatch?.toLong() ?: 0L, eflags)") as CInt

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').regerror(errcode, preg?.toLong() ?: 0L, errbuf?.value ?: 0L, errbufSize)") as SizeT

public actual fun regfree(preg: RegexT?) {
    js("require('@kotlinmania/libc-native-bindings').regfree(preg?.toLong() ?: 0L)")
}

public actual fun arc4random(): UInt =
    js("require('@kotlinmania/libc-native-bindings').arc4random()") as UInt

public actual fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').arc4randomBuf(buf?.value ?: 0L, size)")
}

public actual fun arc4randomUniform(l: UInt): UInt =
    js("require('@kotlinmania/libc-native-bindings').arc4randomUniform(l)") as UInt

public actual fun drand48(): CDouble =
    js("require('@kotlinmania/libc-native-bindings').drand48()") as CDouble

public actual fun erand48(xseed: CUshort?): CDouble =
    js("require('@kotlinmania/libc-native-bindings').erand48(xseed?.toLong() ?: 0L)") as CDouble

public actual fun lrand48(): CLong =
    js("require('@kotlinmania/libc-native-bindings').lrand48()") as CLong

public actual fun nrand48(xseed: CUshort?): CLong =
    js("require('@kotlinmania/libc-native-bindings').nrand48(xseed?.toLong() ?: 0L)") as CLong

public actual fun mrand48(): CLong =
    js("require('@kotlinmania/libc-native-bindings').mrand48()") as CLong

public actual fun jrand48(xseed: CUshort?): CLong =
    js("require('@kotlinmania/libc-native-bindings').jrand48(xseed?.toLong() ?: 0L)") as CLong

public actual fun srand48(seed: CLong) {
    js("require('@kotlinmania/libc-native-bindings').srand48(seed)")
}

public actual fun seed48(xseed: CUshort?): CUshort? =
    js("require('@kotlinmania/libc-native-bindings').seed48(xseed?.toLong() ?: 0L)") as CUshort?

public actual fun lcong48(p: CUshort?) {
    js("require('@kotlinmania/libc-native-bindings').lcong48(p?.toLong() ?: 0L)")
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getoptLong(argc, argv?.value ?: 0L, optstring, longopts?.toLong() ?: 0L, longindex?.toLong() ?: 0L)") as CInt

public actual fun strftime(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strftime(buf?.value ?: 0L, maxsize, format, timeptr?.toLong() ?: 0L)") as SizeT

public actual fun strftimeL(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?, locale: LocaleT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strftimeL(buf?.value ?: 0L, maxsize, format, timeptr?.toLong() ?: 0L, locale)") as SizeT

public actual fun devname(dev: DevT, modeT: ModeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').devname(dev, modeT)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun issetugid(): CInt =
    js("require('@kotlinmania/libc-native-bindings').issetugid()") as CInt
