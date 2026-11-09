@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.apple.ModeT
import io.github.kotlinmania.libc.unix.bsd.apple.NlItem
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_abs(i)

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_labs(i)

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_rand()

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_srand(seed)
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getifaddrs(ifap?.value?.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_freeifaddrs(ifa?.value?.toCPointer<ByteVar>())
}

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun setlogin(name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_setlogin(name)

public actual fun ioctl(fd: CInt, request: CUlong): CInt =
    0

public actual fun kqueue(): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_kqueue()

public actual fun unmount(target: String?, arg: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_unmount(target, arg)

public actual fun syscall(num: CInt): CInt =
    0

public actual fun getpwent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setpwent() {
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_setpwent()
}

public actual fun endpwent() {
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_endpwent()
}

public actual fun endgrent() {
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun getprogname(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getprogname()?.let { COpaquePointer(it.toLong()) }

public actual fun setprogname(name: String?) {
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_setprogname(name)
}

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getloadavg(loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun ifNameindex(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_ifNameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_ifFreenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getpeereid(socket, euid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>())

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_glob(pattern, flags, 0L.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_posixMadvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_futimes(fd, times?.value?.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_nlLanginfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_sendmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_recvmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun sync() {
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_sync()
}

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getgrgidR(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_semClose(sem?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getdtablesize()

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getgrnamR(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_pthreadSigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun semOpen(name: String?, oflag: CInt): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadCancel(thread: PthreadT): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_pthreadCancel(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_pthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_schedGetPriorityMin(policy)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_schedGetPriorityMax(policy)

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_semUnlink(name)

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getpwnamR(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getpwuidR(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_pthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_faccessat(dirfd, pathname, mode, flags)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun acct(filename: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_acct(filename)

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_wait4(pid, status?.value?.toCPointer<ByteVar>(), options, rusage?.value?.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getitimer(which, currValue?.value?.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_setitimer(which, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_regcomp(preg?.value?.toCPointer<ByteVar>(), pattern, cflags)

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_regexec(preg?.value?.toCPointer<ByteVar>(), input, nmatch, pmatch?.value?.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_regerror(errcode, preg?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_regfree(preg?.value?.toCPointer<ByteVar>())
}

public actual fun arc4random(): UInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_arc4random()

public actual fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_arc4randomBuf(buf?.value?.toCPointer<ByteVar>(), size)
}

public actual fun arc4randomUniform(l: UInt): UInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_arc4randomUniform(l)

public actual fun drand48(): CDouble =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_drand48()

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_erand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_lrand48()

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_nrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_mrand48()

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_jrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun srand48(seed: CLong) {
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_srand48(seed)
}

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_seed48(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lcong48(p: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_lcong48(p?.value?.toCPointer<ByteVar>())
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getoptLong(argc, argv?.value?.toCPointer<ByteVar>(), optstring, longopts?.value?.toCPointer<ByteVar>(), longindex?.value?.toCPointer<ByteVar>())

public actual fun strftime(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_strftime(buf?.value?.toCPointer<ByteVar>(), maxsize, format, timeptr?.value?.toCPointer<ByteVar>())

public actual fun strftimeL(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?, locale: LocaleT): SizeT =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_strftimeL(buf?.value?.toCPointer<ByteVar>(), maxsize, format, timeptr?.value?.toCPointer<ByteVar>(), locale.toLong().toCPointer<ByteVar>())

public actual fun devname(dev: DevT, modeT: ModeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_devname(dev, modeT)?.let { COpaquePointer(it.toLong()) }

public actual fun issetugid(): CInt =
    io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_issetugid()
