@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.NlItem

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun abs(i: CInt): CInt =
    0

public actual fun labs(i: CLong): CLong =
    0L

public actual fun rand(): CInt =
    0

public actual fun srand(seed: CUint) {
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    0

public actual fun freeifaddrs(ifa: COpaquePointer?) {
}

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    0

public actual fun setlogin(name: String?): CInt =
    0

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    0

public actual fun kqueue(): CInt =
    0

public actual fun unmount(target: String?, arg: CInt): CInt =
    0

public actual fun syscall(num: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun getpwent(): COpaquePointer? =
    null

public actual fun setpwent() {
}

public actual fun endpwent() {
}

public actual fun endgrent() {
}

public actual fun getgrent(): COpaquePointer? =
    null

public actual fun getprogname(): COpaquePointer? =
    null

public actual fun setprogname(name: String?) {
}

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    0

public actual fun ifNameindex(): COpaquePointer? =
    null

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
}

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    0

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    0

public actual fun globfree(pglob: COpaquePointer?) {
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    0

public actual fun shmUnlink(name: String?): CInt =
    0

public actual fun seekdir(dirp: DIR?, loc: CLong) {
}

public actual fun telldir(dirp: DIR?): CLong =
    0L

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    0

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    0L

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    0

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    0

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    null

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    0

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    0L

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    0L

public actual fun sync() {
}

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    0

public actual fun semClose(sem: COpaquePointer?): CInt =
    0

public actual fun getdtablesize(): CInt =
    0

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    0

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    null

public actual fun pthreadCancel(thread: PthreadT): CInt =
    0

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    0

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    0

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    0

public actual fun semUnlink(name: String?): CInt =
    0

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    0

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    null

public actual fun popen(command: String?, mode: String?): FILE? =
    null

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    0

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    0

public actual fun acct(filename: String?): CInt =
    0

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    0

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    0

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    0

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    0

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    0

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    0uL

public actual fun regfree(preg: COpaquePointer?) {
}

public actual fun arc4random(): UInt =
    0u

public actual fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
}

public actual fun arc4randomUniform(l: UInt): UInt =
    0u

public actual fun drand48(): CDouble =
    0.0

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    0.0

public actual fun lrand48(): CLong =
    0L

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    0L

public actual fun mrand48(): CLong =
    0L

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    0L

public actual fun srand48(seed: CLong) {
}

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    null

public actual fun lcong48(p: COpaquePointer?) {
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    0

public actual fun strftime(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    0uL

public actual fun strftimeL(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?, locale: LocaleT): SizeT =
    0uL

public actual fun devname(dev: DevT, modeT: ModeT): COpaquePointer? =
    null

public actual fun issetugid(): CInt =
    0
