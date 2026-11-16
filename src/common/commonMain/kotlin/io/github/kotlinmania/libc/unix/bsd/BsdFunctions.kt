package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.NlItem
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: ConstPtr, errnum: CInt): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

public fun cmsgFirsthdr(mhdr: ConstPtr): MutPtr =
    if (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt() >= sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        MutPtr(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress)
    } else {
        MutPtr(0L)
    }

public fun fdClr(fd: CInt, set: MutPtr) {
    val bits = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.I64) * 8
    val fd1 = fd
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / bits] = cur.fdsBits[fd1 / bits] and (1L shl (fd1 % bits)).inv()
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr): Boolean {
    val bits = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.I64) * 8
    val fd1 = fd
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / bits] and (1L shl (fd1 % bits))) != 0L
}

public fun fdSet(fd: CInt, set: MutPtr) {
    val bits = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.I64) * 8
    val fd1 = fd
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / bits] = cur.fdsBits[fd1 / bits] or (1L shl (fd1 % bits))
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdZero(set: MutPtr) {
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    for (idx in cur.fdsBits.indices) {
        cur.fdsBits[idx] = 0L
    }
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
}

public fun wtermsig(status: CInt): CInt = status and 127

public fun wifexited(status: CInt): Boolean = (status and 127) == 0

public fun wexitstatus(status: CInt): CInt = (status shr 8) and 0x00ff

public fun wcoredump(status: CInt): Boolean = (status and 128) != 0

public fun qcmd(cmd: CInt, type: CInt): CInt = (cmd shl 8) or (type and 0x00ff)

public expect fun getrlimit(resource: CInt, rlim: MutPtr): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun getifaddrs(ifap: MutPtr): CInt

public expect fun freeifaddrs(ifa: MutPtr)

public expect fun setgroups(ngroups: CInt, ptr: ConstPtr): CInt

public expect fun setlogin(name: ConstPtr): CInt

public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

public expect fun kqueue(): CInt

public expect fun unmount(target: ConstPtr, arg: CInt): CInt

public expect fun syscall(num: CInt, vararg variadicArgs: Long): CInt

public expect fun getpwent(): MutPtr

public expect fun setpwent()

public expect fun endpwent()

public expect fun endgrent()

public expect fun getgrent(): MutPtr

public expect fun getprogname(): ConstPtr

public expect fun setprogname(name: ConstPtr)

public expect fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt

public expect fun ifNameindex(): MutPtr

public expect fun ifFreenameindex(ptr: MutPtr)

public expect fun getpeereid(socket: CInt, euid: MutPtr, egid: MutPtr): CInt

public expect fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt

public expect fun globfree(pglob: MutPtr)

public expect fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun shmUnlink(name: ConstPtr): CInt

public expect fun seekdir(dirp: MutPtr, loc: CLong)

public expect fun telldir(dirp: MutPtr): CLong

public expect fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT

public expect fun mkstemps(template: MutPtr, suffixlen: CInt): CInt

public expect fun futimes(fd: CInt, times: ConstPtr): CInt

public expect fun nlLanginfo(item: NlItem): MutPtr

public expect fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT

public expect fun sync()

public expect fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt

public expect fun sigsuspend(mask: ConstPtr): CInt

public expect fun semClose(sem: MutPtr): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt

public expect fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr

public expect fun getgrnam(name: ConstPtr): MutPtr

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun semUnlink(name: ConstPtr): CInt

public expect fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun sigwait(set: ConstPtr, sig: MutPtr): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): MutPtr

public expect fun popen(command: ConstPtr, mode: ConstPtr): MutPtr

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt

public expect fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt

public expect fun acct(filename: ConstPtr): CInt

public expect fun wait4(pid: PidT, status: MutPtr, options: CInt, rusage: MutPtr): PidT

public expect fun getitimer(which: CInt, currValue: MutPtr): CInt

public expect fun setitimer(which: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt

public expect fun regcomp(preg: MutPtr, pattern: ConstPtr, cflags: CInt): CInt

public expect fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT

public expect fun regfree(preg: MutPtr)

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(buf: MutPtr, size: SizeT)

public expect fun arc4randomUniform(l: UInt): UInt

public expect fun drand48(): CDouble

public expect fun erand48(xseed: MutPtr): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: MutPtr): CLong

public expect fun mrand48(): CLong

public expect fun jrand48(xseed: MutPtr): CLong

public expect fun srand48(seed: CLong)

public expect fun seed48(xseed: MutPtr): MutPtr

public expect fun lcong48(p: MutPtr)

public expect fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt

public expect fun strftime(buf: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr): SizeT

public expect fun strftimeL(buf: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr, locale: LocaleT): SizeT

public expect fun devname(dev: DevT, modeT: ModeT): MutPtr

public expect fun issetugid(): CInt
