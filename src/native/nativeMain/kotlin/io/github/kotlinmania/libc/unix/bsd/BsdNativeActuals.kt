@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_abs
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_acct
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_arc4random
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_arc4randomBuf
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_arc4randomUniform
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_bind
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_devname
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_drand48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_endgrent
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_endpwent
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_erand48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_faccessat
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_freeifaddrs
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_futimes
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getdtablesize
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getgrent
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getgrgid
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getgrgidR
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getgrnam
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getgrnamR
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getifaddrs
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getitimer
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getloadavg
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getoptLong
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getpeereid
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getprogname
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getpwent
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getpwnamR
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getpwuidR
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_getrlimit
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_glob
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_globfree
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_ifFreenameindex
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_ifNameindex
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_ioctl
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_issetugid
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_jrand48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_kqueue
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_labs
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_lcong48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_lrand48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_madvise
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_mkstemps
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_mrand48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_msync
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_nlLanginfo
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_nrand48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_popen
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_posixMadvise
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_pthreadAtfork
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_pthreadCancel
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_pthreadCreate
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_pthreadKill
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_pthreadSigmask
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_rand
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_readv
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_recvfrom
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_recvmsg
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_regcomp
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_regerror
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_regexec
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_regfree
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_schedGetPriorityMax
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_schedGetPriorityMin
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_seed48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_seekdir
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_semClose
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_semOpen
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_semUnlink
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_sendmsg
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_setgroups
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_setitimer
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_setlogin
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_setprogname
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_setpwent
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_setrlimit
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_shmUnlink
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_sigaltstack
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_sigsuspend
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_sigwait
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_srand
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_srand48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_strerrorR
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_strftime
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_strftimeL
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_sync
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_syscall
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_telldir
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_unmount
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_wait4
import io.github.kotlinmania.libc.unix.bsd.cinterop.libc_unix_bsd_writev
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.NlItem
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    libc_unix_bsd_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    libc_unix_bsd_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_unix_bsd_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun abs(i: CInt): CInt =
    libc_unix_bsd_abs(i)

public actual fun labs(i: CLong): CLong =
    libc_unix_bsd_labs(i)

public actual fun rand(): CInt =
    libc_unix_bsd_rand()

public actual fun srand(seed: CUint) {
    libc_unix_bsd_srand(seed)
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    libc_unix_bsd_getifaddrs(ifap?.value?.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    libc_unix_bsd_freeifaddrs(ifa?.value?.toCPointer<ByteVar>())
}

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    libc_unix_bsd_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun setlogin(name: String?): CInt =
    libc_unix_bsd_setlogin(name)

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    libc_unix_bsd_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun kqueue(): CInt =
    libc_unix_bsd_kqueue()

public actual fun unmount(target: String?, arg: CInt): CInt =
    libc_unix_bsd_unmount(target, arg)

public actual fun syscall(num: CInt, vararg variadicArgs: Long): CInt =
    libc_unix_bsd_syscall(num, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpwent(): COpaquePointer? =
    libc_unix_bsd_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setpwent() {
    libc_unix_bsd_setpwent()
}

public actual fun endpwent() {
    libc_unix_bsd_endpwent()
}

public actual fun endgrent() {
    libc_unix_bsd_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    libc_unix_bsd_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun getprogname(): COpaquePointer? =
    libc_unix_bsd_getprogname()?.let { COpaquePointer(it.toLong()) }

public actual fun setprogname(name: String?) {
    libc_unix_bsd_setprogname(name)
}

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    libc_unix_bsd_getloadavg(loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun ifNameindex(): COpaquePointer? =
    libc_unix_bsd_ifNameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    libc_unix_bsd_ifFreenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    libc_unix_bsd_getpeereid(socket, euid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>())

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    libc_unix_bsd_glob(pattern, flags, 0L.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: COpaquePointer?) {
    libc_unix_bsd_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    libc_unix_bsd_posixMadvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun shmUnlink(name: String?): CInt =
    libc_unix_bsd_shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    libc_unix_bsd_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    libc_unix_bsd_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    libc_unix_bsd_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    libc_unix_bsd_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    libc_unix_bsd_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    libc_unix_bsd_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    libc_unix_bsd_futimes(fd, times?.value?.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    libc_unix_bsd_nlLanginfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    libc_unix_bsd_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    libc_unix_bsd_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    libc_unix_bsd_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    libc_unix_bsd_sendmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    libc_unix_bsd_recvmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun sync() {
    libc_unix_bsd_sync()
}

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_bsd_getgrgidR(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    libc_unix_bsd_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    libc_unix_bsd_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: COpaquePointer?): CInt =
    libc_unix_bsd_semClose(sem?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    libc_unix_bsd_getdtablesize()

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_bsd_getgrnamR(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    libc_unix_bsd_pthreadSigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    libc_unix_bsd_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnam(name: String?): COpaquePointer? =
    libc_unix_bsd_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libc_unix_bsd_pthreadCancel(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libc_unix_bsd_pthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libc_unix_bsd_schedGetPriorityMin(policy)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libc_unix_bsd_schedGetPriorityMax(policy)

public actual fun semUnlink(name: String?): CInt =
    libc_unix_bsd_semUnlink(name)

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_bsd_getpwnamR(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_bsd_getpwuidR(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    libc_unix_bsd_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    libc_unix_bsd_pthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    libc_unix_bsd_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    libc_unix_bsd_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    libc_unix_bsd_faccessat(dirfd, pathname, mode, flags)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    libc_unix_bsd_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun acct(filename: String?): CInt =
    libc_unix_bsd_acct(filename)

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    libc_unix_bsd_wait4(pid, status?.value?.toCPointer<ByteVar>(), options, rusage?.value?.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    libc_unix_bsd_getitimer(which, currValue?.value?.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    libc_unix_bsd_setitimer(which, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    libc_unix_bsd_regcomp(preg?.value?.toCPointer<ByteVar>(), pattern, cflags)

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    libc_unix_bsd_regexec(preg?.value?.toCPointer<ByteVar>(), input, nmatch, pmatch?.value?.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    libc_unix_bsd_regerror(errcode, preg?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: COpaquePointer?) {
    libc_unix_bsd_regfree(preg?.value?.toCPointer<ByteVar>())
}

public actual fun arc4random(): UInt =
    libc_unix_bsd_arc4random()

public actual fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    libc_unix_bsd_arc4randomBuf(buf?.value?.toCPointer<ByteVar>(), size)
}

public actual fun arc4randomUniform(l: UInt): UInt =
    libc_unix_bsd_arc4randomUniform(l)

public actual fun drand48(): CDouble =
    libc_unix_bsd_drand48()

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    libc_unix_bsd_erand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    libc_unix_bsd_lrand48()

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    libc_unix_bsd_nrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    libc_unix_bsd_mrand48()

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    libc_unix_bsd_jrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun srand48(seed: CLong) {
    libc_unix_bsd_srand48(seed)
}

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_seed48(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lcong48(p: COpaquePointer?) {
    libc_unix_bsd_lcong48(p?.value?.toCPointer<ByteVar>())
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    libc_unix_bsd_getoptLong(argc, argv?.value?.toCPointer<ByteVar>(), optstring, longopts?.value?.toCPointer<ByteVar>(), longindex?.value?.toCPointer<ByteVar>())

public actual fun strftime(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    libc_unix_bsd_strftime(buf?.value?.toCPointer<ByteVar>(), maxsize, format, timeptr?.value?.toCPointer<ByteVar>())

public actual fun strftimeL(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?, locale: LocaleT): SizeT =
    libc_unix_bsd_strftimeL(buf?.value?.toCPointer<ByteVar>(), maxsize, format, timeptr?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>())

public actual fun devname(dev: DevT, modeT: ModeT): COpaquePointer? =
    libc_unix_bsd_devname(dev, modeT)?.let { COpaquePointer(it.toLong()) }

public actual fun issetugid(): CInt =
    libc_unix_bsd_issetugid()
