@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    libc.cinterop.libc_bsd_mod_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    libc.cinterop.libc_bsd_mod_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    libc.cinterop.libc_bsd_mod_strerror_r(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun abs(i: CInt): CInt =
    libc.cinterop.libc_bsd_mod_abs(i)

public actual fun labs(i: CLong): CLong =
    libc.cinterop.libc_bsd_mod_labs(i)

public actual fun rand(): CInt =
    libc.cinterop.libc_bsd_mod_rand()

public actual fun srand(seed: CUint) {
    libc.cinterop.libc_bsd_mod_srand(seed)
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    libc.cinterop.libc_bsd_mod_getifaddrs(ifap?.value?.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    libc.cinterop.libc_bsd_mod_freeifaddrs(ifa?.value?.toCPointer<ByteVar>())
}

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    libc.cinterop.libc_bsd_mod_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun setlogin(name: String?): CInt =
    libc.cinterop.libc_bsd_mod_setlogin(name)

public actual fun kqueue(): CInt =
    libc.cinterop.libc_bsd_mod_kqueue()

public actual fun unmount(target: String?, arg: CInt): CInt =
    libc.cinterop.libc_bsd_mod_unmount(target, arg)

public actual fun getpwent(): Passwd? =
    libc.cinterop.libc_bsd_mod_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setpwent() {
    libc.cinterop.libc_bsd_mod_setpwent()
}

public actual fun endpwent() {
    libc.cinterop.libc_bsd_mod_endpwent()
}

public actual fun endgrent() {
    libc.cinterop.libc_bsd_mod_endgrent()
}

public actual fun getgrent(): Group? =
    libc.cinterop.libc_bsd_mod_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun getprogname(): COpaquePointer? =
    libc.cinterop.libc_bsd_mod_getprogname()?.let { COpaquePointer(it.toLong()) }

public actual fun setprogname(name: String?) {
    libc.cinterop.libc_bsd_mod_setprogname(name)
}

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    libc.cinterop.libc_bsd_mod_getloadavg(loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun ifNameindex(): IfNameindex? =
    libc.cinterop.libc_bsd_mod_if_nameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    libc.cinterop.libc_bsd_mod_if_freenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    libc.cinterop.libc_bsd_mod_getpeereid(socket, euid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>())

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: GlobT?): CInt =
    libc.cinterop.libc_bsd_mod_glob(pattern, flags, errfunc?.value?.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: GlobT?) {
    libc.cinterop.libc_bsd_mod_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    libc.cinterop.libc_bsd_mod_posix_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun shmUnlink(name: String?): CInt =
    libc.cinterop.libc_bsd_mod_shm_unlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    libc.cinterop.libc_bsd_mod_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    libc.cinterop.libc_bsd_mod_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    libc.cinterop.libc_bsd_mod_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    libc.cinterop.libc_bsd_mod_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT =
    libc.cinterop.libc_bsd_mod_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    libc.cinterop.libc_bsd_mod_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    libc.cinterop.libc_bsd_mod_futimes(fd, times?.value?.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    libc.cinterop.libc_bsd_mod_nl_langinfo(item.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    libc.cinterop.libc_bsd_mod_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    libc.cinterop.libc_bsd_mod_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    libc.cinterop.libc_bsd_mod_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    libc.cinterop.libc_bsd_mod_sendmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    libc.cinterop.libc_bsd_mod_recvmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun sync() {
    libc.cinterop.libc_bsd_mod_sync()
}

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc.cinterop.libc_bsd_mod_getgrgid_r(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    libc.cinterop.libc_bsd_mod_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: SigsetT?): CInt =
    libc.cinterop.libc_bsd_mod_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: SemT?): CInt =
    libc.cinterop.libc_bsd_mod_sem_close(sem?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    libc.cinterop.libc_bsd_mod_getdtablesize()

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc.cinterop.libc_bsd_mod_getgrnam_r(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    libc.cinterop.libc_bsd_mod_pthread_sigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun getgrnam(name: String?): Group? =
    libc.cinterop.libc_bsd_mod_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    libc.cinterop.libc_bsd_mod_pthread_cancel(thread)

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    libc.cinterop.libc_bsd_mod_pthread_kill(thread, sig)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libc.cinterop.libc_bsd_mod_sched_get_priority_min(policy)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libc.cinterop.libc_bsd_mod_sched_get_priority_max(policy)

public actual fun semUnlink(name: String?): CInt =
    libc.cinterop.libc_bsd_mod_sem_unlink(name)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc.cinterop.libc_bsd_mod_getpwnam_r(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc.cinterop.libc_bsd_mod_getpwuid_r(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    libc.cinterop.libc_bsd_mod_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    libc.cinterop.libc_bsd_mod_pthread_atfork(prepare?.value?.toCPointer<ByteVar>(), parent?.value?.toCPointer<ByteVar>(), child?.value?.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): Group? =
    libc.cinterop.libc_bsd_mod_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    libc.cinterop.libc_bsd_mod_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    libc.cinterop.libc_bsd_mod_faccessat(dirfd, pathname, mode, flags)

public actual fun pthreadCreate(native: UintptrT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    libc.cinterop.libc_bsd_mod_pthread_create(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), f.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun acct(filename: String?): CInt =
    libc.cinterop.libc_bsd_mod_acct(filename)

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    libc.cinterop.libc_bsd_mod_wait4(pid, status?.value?.toCPointer<ByteVar>(), options, rusage?.value?.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    libc.cinterop.libc_bsd_mod_getitimer(which, currValue?.value?.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    libc.cinterop.libc_bsd_mod_setitimer(which, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    libc.cinterop.libc_bsd_mod_regcomp(preg?.value?.toCPointer<ByteVar>(), pattern, cflags)

public actual fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    libc.cinterop.libc_bsd_mod_regexec(preg?.value?.toCPointer<ByteVar>(), input, nmatch, pmatch?.value?.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    libc.cinterop.libc_bsd_mod_regerror(errcode, preg?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: RegexT?) {
    libc.cinterop.libc_bsd_mod_regfree(preg?.value?.toCPointer<ByteVar>())
}

public actual fun arc4random(): UInt =
    libc.cinterop.libc_bsd_mod_arc4random()

public actual fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    libc.cinterop.libc_bsd_mod_arc4random_buf(buf?.value?.toCPointer<ByteVar>(), size)
}

public actual fun arc4randomUniform(l: UInt): UInt =
    libc.cinterop.libc_bsd_mod_arc4random_uniform(l)

public actual fun drand48(): CDouble =
    libc.cinterop.libc_bsd_mod_drand48()

public actual fun erand48(xseed: CUshort?): CDouble =
    libc.cinterop.libc_bsd_mod_erand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    libc.cinterop.libc_bsd_mod_lrand48()

public actual fun nrand48(xseed: CUshort?): CLong =
    libc.cinterop.libc_bsd_mod_nrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    libc.cinterop.libc_bsd_mod_mrand48()

public actual fun jrand48(xseed: CUshort?): CLong =
    libc.cinterop.libc_bsd_mod_jrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun srand48(seed: CLong) {
    libc.cinterop.libc_bsd_mod_srand48(seed)
}

public actual fun seed48(xseed: CUshort?): CUshort? =
    libc.cinterop.libc_bsd_mod_seed48(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lcong48(p: CUshort?) {
    libc.cinterop.libc_bsd_mod_lcong48(p?.value?.toCPointer<ByteVar>())
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    libc.cinterop.libc_bsd_mod_getopt_long(argc, argv?.value?.toCPointer<ByteVar>(), optstring, longopts?.value?.toCPointer<ByteVar>(), longindex?.value?.toCPointer<ByteVar>())

public actual fun strftime(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?): SizeT =
    libc.cinterop.libc_bsd_mod_strftime(buf?.value?.toCPointer<ByteVar>(), maxsize, format, timeptr?.value?.toCPointer<ByteVar>())

public actual fun strftimeL(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?, locale: LocaleT): SizeT =
    libc.cinterop.libc_bsd_mod_strftime_l(buf?.value?.toCPointer<ByteVar>(), maxsize, format, timeptr?.value?.toCPointer<ByteVar>(), locale.toInt())

public actual fun devname(dev: DevT, modeT: ModeT): COpaquePointer? =
    libc.cinterop.libc_bsd_mod_devname(dev.toInt(), modeT)?.let { COpaquePointer(it.toLong()) }

public actual fun issetugid(): CInt =
    libc.cinterop.libc_bsd_mod_issetugid()
