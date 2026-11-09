package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
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

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? {
    return if ((mhdr!!.msgControllen).toInt() >= 8) {
        ((mhdr!!.msgControl as Any?) as Cmsghdr?)
    } else {
        null
    }
}

public fun fdClr(fd: CInt, set: FdSet?) {
    val bits = 8 * 8
    val fd1 = fd.toInt()
    set!!.fdsBits[fd1 / bits] = set!!.fdsBits[fd1 / bits] and (1L shl (fd1 % bits)).inv()
    return
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val bits = 8 * 8
    val fd1 = fd.toInt()
    return (set!!.fdsBits[fd1 / bits] and (1L shl (fd1 % bits))) != 0L
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val bits = 8 * 8
    val fd1 = fd.toInt()
    set!!.fdsBits[fd1 / bits] = set!!.fdsBits[fd1 / bits] or (1L shl (fd1 % bits))
    return
}

public fun fdZero(set: FdSet?) {
    for (idx in (set!!.fdsBits).indices) {
        (set!!.fdsBits)[idx] = 0L
    }
}

public fun wtermsig(status: CInt): CInt {
    return status and 127
}

public fun wifexited(status: CInt): Boolean {
    return (status and 127) == 0
}

public fun wexitstatus(status: CInt): CInt {
    return (status shr 8) and 0x00ff
}

public fun wcoredump(status: CInt): Boolean {
    return (status and 128) != 0
}

public fun qcmd(cmd: CInt, type: CInt): CInt {
    return (cmd shl 8) or (type and 0x00ff)
}

public expect fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun getifaddrs(ifap: COpaquePointer?): CInt

public expect fun freeifaddrs(ifa: COpaquePointer?)

public expect fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt

public expect fun setlogin(name: String?): CInt

public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

public expect fun kqueue(): CInt

public expect fun unmount(target: String?, arg: CInt): CInt

public expect fun syscall(num: CInt, vararg variadicArgs: Long): CInt

public expect fun getpwent(): COpaquePointer?

public expect fun setpwent()

public expect fun endpwent()

public expect fun endgrent()

public expect fun getgrent(): COpaquePointer?

public expect fun getprogname(): COpaquePointer?

public expect fun setprogname(name: String?)

public expect fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt

public expect fun ifNameindex(): COpaquePointer?

public expect fun ifFreenameindex(ptr: COpaquePointer?)

public expect fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt

public expect fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt

public expect fun globfree(pglob: COpaquePointer?)

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT

public expect fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt

public expect fun futimes(fd: CInt, times: COpaquePointer?): CInt

public expect fun nlLanginfo(item: NlItem): COpaquePointer?

public expect fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun sync()

public expect fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt

public expect fun sigsuspend(mask: COpaquePointer?): CInt

public expect fun semClose(sem: COpaquePointer?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer?

public expect fun getgrnam(name: String?): COpaquePointer?

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): COpaquePointer?

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun acct(filename: String?): CInt

public expect fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT

public expect fun getitimer(which: CInt, currValue: COpaquePointer?): CInt

public expect fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt

public expect fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt

public expect fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT

public expect fun regfree(preg: COpaquePointer?)

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(buf: COpaquePointer?, size: SizeT)

public expect fun arc4randomUniform(l: UInt): UInt

public expect fun drand48(): CDouble

public expect fun erand48(xseed: COpaquePointer?): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: COpaquePointer?): CLong

public expect fun mrand48(): CLong

public expect fun jrand48(xseed: COpaquePointer?): CLong

public expect fun srand48(seed: CLong)

public expect fun seed48(xseed: COpaquePointer?): COpaquePointer?

public expect fun lcong48(p: COpaquePointer?)

public expect fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt

public expect fun strftime(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT

public expect fun strftimeL(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?, locale: LocaleT): SizeT

public expect fun devname(dev: DevT, modeT: ModeT): COpaquePointer?

public expect fun issetugid(): CInt
