// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_posix_madvise
import kotlinx.cinterop.toLong

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires manual FFI bridge — not yet implemented")

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR requires manual FFI bridge — not yet implemented")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires manual FFI bridge — not yet implemented")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET requires manual FFI bridge — not yet implemented")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO requires manual FFI bridge — not yet implemented")
}

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    libc.cinterop.libc_getrlimit(resource, rlim?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    libc.cinterop.libc_setrlimit(resource, rlim?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires manual FFI bridge — not yet implemented")

public actual fun abs(i: CInt): CInt =
    libc.cinterop.libc_abs(i)
public actual fun labs(i: CLong): CLong =
    libc.cinterop.libc_labs(i)
public actual fun rand(): CInt =
    libc.cinterop.libc_rand()
public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires manual FFI bridge — not yet implemented")
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getifaddrs requires manual FFI bridge — not yet implemented")

public actual fun freeifaddrs(ifa: Ifaddrs?) {
    throw UnsupportedOperationException("freeifaddrs requires manual FFI bridge — not yet implemented")
}

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups requires manual FFI bridge — not yet implemented")

public actual fun setlogin(name: String?): CInt =
    libc.cinterop.libc_setlogin(name)
public actual fun ioctl(fd: CInt, request: CULong, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun kqueue(): CInt =
    throw UnsupportedOperationException("kqueue requires manual FFI bridge — not yet implemented")

public actual fun unmount(target: String?, arg: CInt): CInt =
    throw UnsupportedOperationException("unmount requires manual FFI bridge — not yet implemented")

public actual fun syscall(num: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("syscall requires manual FFI bridge — not yet implemented")

public actual fun getpwent(): Passwd? =
    libc.cinterop.libc_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setpwent() {
    libc.cinterop.libc_setpwent()
}

public actual fun endpwent() {
    libc.cinterop.libc_endpwent()
}

public actual fun endgrent() {
    libc.cinterop.libc_endgrent()
}

public actual fun getgrent(): Group? =
    libc.cinterop.libc_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname requires manual FFI bridge — not yet implemented")

public actual fun setprogname(name: String?) {
    throw UnsupportedOperationException("setprogname requires manual FFI bridge — not yet implemented")
}

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getloadavg requires manual FFI bridge — not yet implemented")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires manual FFI bridge — not yet implemented")

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    throw UnsupportedOperationException("ifFreenameindex requires manual FFI bridge — not yet implemented")
}

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    throw UnsupportedOperationException("getpeereid requires manual FFI bridge — not yet implemented")

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree requires manual FFI bridge — not yet implemented")
}

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt {
    val cPtr: CPointer<ByteVar>? = addr?.value?.toCPointer()
    return libc.cinterop.libc_posix_madvise(cPtr, len, advice)
}

public actual fun shmUnlink(name: String?): CInt =
    libc.cinterop.libc_shm_unlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir requires manual FFI bridge — not yet implemented")
}

public actual fun telldir(dirp: DIR?): CLong =
    libc.cinterop.libc_telldir(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    libc.cinterop.libc_madvise(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, advice)
public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    libc.cinterop.libc_msync(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, flags)
public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge — not yet implemented")

public actual fun mkstemps(template: String?, suffixlen: CInt): CInt =
    libc.cinterop.libc_mkstemps(template, suffixlen)
public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    throw UnsupportedOperationException("futimes requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfo(item: NlItem): String? =
    libc.cinterop.libc_nl_langinfo(item)?.toKString()

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires manual FFI bridge — not yet implemented")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    libc.cinterop.libc_writev(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    libc.cinterop.libc_readv(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg requires manual FFI bridge — not yet implemented")

public actual fun sync() {
    throw UnsupportedOperationException("sync requires manual FFI bridge — not yet implemented")
}

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires manual FFI bridge — not yet implemented")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack requires manual FFI bridge — not yet implemented")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: SemT): CInt =
    libc.cinterop.libc_sem_close(sem?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun getdtablesize(): CInt =
    libc.cinterop.libc_getdtablesize()
public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires manual FFI bridge — not yet implemented")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask requires manual FFI bridge — not yet implemented")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun getgrnam(name: String?): Group? =
    libc.cinterop.libc_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadCancel requires manual FFI bridge — not yet implemented")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libc.cinterop.libc_pthread_kill(thread.toLong().toCPointer<kotlinx.cinterop.ByteVar>(), sig)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libc.cinterop.libc_sched_get_priority_min(policy)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libc.cinterop.libc_sched_get_priority_max(policy)

public actual fun semUnlink(name: String?): CInt =
    libc.cinterop.libc_sem_unlink(name)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR requires manual FFI bridge — not yet implemented")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR requires manual FFI bridge — not yet implemented")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait requires manual FFI bridge — not yet implemented")

public actual fun getgrgid(gid: GidT): Group? =
    libc.cinterop.libc_getgrgid(gid.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    libc.cinterop.libc_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    libc.cinterop.libc_faccessat(dirfd, pathname, mode, flags)
public actual fun acct(filename: String?): CInt =
    libc.cinterop.libc_acct(filename)
public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    throw UnsupportedOperationException("wait4 requires manual FFI bridge — not yet implemented")

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    throw UnsupportedOperationException("getitimer requires manual FFI bridge — not yet implemented")

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    throw UnsupportedOperationException("setitimer requires manual FFI bridge — not yet implemented")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    throw UnsupportedOperationException("regcomp requires manual FFI bridge — not yet implemented")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt =
    throw UnsupportedOperationException("regexec requires manual FFI bridge — not yet implemented")

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror requires manual FFI bridge — not yet implemented")

public actual fun regfree(preg: RegexT?) {
    throw UnsupportedOperationException("regfree requires manual FFI bridge — not yet implemented")
}

public actual fun arc4randomBuf(buf: COpaquePointer?, size: ULong) {
    throw UnsupportedOperationException("arc4randomBuf requires manual FFI bridge — not yet implemented")
}

public actual fun lrand48(): CLong =
    libc.cinterop.libc_lrand48()
public actual fun nrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("nrand48 requires manual FFI bridge — not yet implemented")

public actual fun mrand48(): CLong =
    libc.cinterop.libc_mrand48()
public actual fun jrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("jrand48 requires manual FFI bridge — not yet implemented")

public actual fun srand48(seed: CLong) {
    throw UnsupportedOperationException("srand48 requires manual FFI bridge — not yet implemented")
}

public actual fun seed48(xseed: CUShort?): CUShort? =
    throw UnsupportedOperationException("seed48 requires manual FFI bridge — not yet implemented")

public actual fun lcong48(p: CUShort?) {
    throw UnsupportedOperationException("lcong48 requires manual FFI bridge — not yet implemented")
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    throw UnsupportedOperationException("getoptLong requires manual FFI bridge — not yet implemented")

public actual fun strftime(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires manual FFI bridge — not yet implemented")

public actual fun strftimeL(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?, locale: LocaleT): ULong =
    throw UnsupportedOperationException("strftimeL requires manual FFI bridge — not yet implemented")

public actual fun devname(dev: DevT, modeT: ModeT): String? =
    throw UnsupportedOperationException("devname requires manual FFI bridge — not yet implemented")

public actual fun issetugid(): CInt =
    libc.cinterop.libc_issetugid()
public actual fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt =
    throw UnsupportedOperationException("glob requires manual FFI bridge — not yet implemented")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadAtfork requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")
