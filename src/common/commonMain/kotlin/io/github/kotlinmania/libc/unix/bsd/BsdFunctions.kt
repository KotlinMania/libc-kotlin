package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.GlobT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.NlItem
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadAttrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SigsetT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Tm
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.SemT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.StackT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: ConstPtr<CChar>, errnum: CInt): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

public fun cmsgFirsthdr(mhdr: ConstPtr<Msghdr>): MutPtr<Cmsghdr> =
    if (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt() >= sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        MutPtr<Cmsghdr>(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress)
    } else {
        MutPtr(0L)
    }

public fun fdClr(fd: CInt, set: MutPtr<FdSet>) {
    val bits = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0]) * 8
    val fd1 = fd
    (FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / bits] = (FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / bits] and (1L shl (fd1 % bits)).inv()
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr<FdSet>): Boolean {
    val bits = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0]) * 8
    val fd1 = fd
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / bits] and (1L shl (fd1 % bits))) != 0L
}

public fun fdSet(fd: CInt, set: MutPtr<FdSet>) {
    val bits = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0]) * 8
    val fd1 = fd
    (FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / bits] = (FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / bits] or (1L shl (fd1 % bits))
    return
}

public fun fdZero(set: MutPtr<FdSet>) {
    for (idx in ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits).indices) {
        ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits)[idx] = 0L
    }
}

public fun wtermsig(status: CInt): CInt = status and 127

public fun wifexited(status: CInt): Boolean = (status and 127) == 0

public fun wexitstatus(status: CInt): CInt = (status shr 8) and 0x00ff

public fun wcoredump(status: CInt): Boolean = (status and 128) != 0

public fun qcmd(cmd: CInt, type: CInt): CInt = (cmd shl 8) or (type and 0x00ff)

public expect fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt

public expect fun freeifaddrs(ifa: MutPtr<Ifaddrs>)

public expect fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt

public expect fun setlogin(name: ConstPtr<CChar>): CInt

public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

public expect fun kqueue(): CInt

public expect fun unmount(target: ConstPtr<CChar>, arg: CInt): CInt

public expect fun syscall(num: CInt, vararg variadicArgs: Long): CInt

public expect fun getpwent(): MutPtr<Passwd>

public expect fun setpwent()

public expect fun endpwent()

public expect fun endgrent()

public expect fun getgrent(): MutPtr<Group>

public expect fun getprogname(): ConstPtr<CChar>

public expect fun setprogname(name: ConstPtr<CChar>)

public expect fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt

public expect fun ifNameindex(): MutPtr<IfNameindex>

public expect fun ifFreenameindex(ptr: MutPtr<IfNameindex>)

public expect fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt

public expect fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt

public expect fun globfree(pglob: MutPtr<GlobT>)

public expect fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun shmUnlink(name: ConstPtr<CChar>): CInt

public expect fun seekdir(dirp: MutPtr<DIR>, loc: CLong)

public expect fun telldir(dirp: MutPtr<DIR>): CLong

public expect fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT

public expect fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt

public expect fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt

public expect fun nlLanginfo(item: NlItem): MutPtr<CChar>

public expect fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT

public expect fun sync()

public expect fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt

public expect fun sigsuspend(mask: ConstPtr<SigsetT>): CInt

public expect fun semClose(sem: MutPtr<SemT>): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt

public expect fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT>

public expect fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group>

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun semUnlink(name: ConstPtr<CChar>): CInt

public expect fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): MutPtr<Group>

public expect fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt

public expect fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt

public expect fun acct(filename: ConstPtr<CChar>): CInt

public expect fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT

public expect fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt

public expect fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt

public expect fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt

public expect fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT

public expect fun regfree(preg: MutPtr<RegexT>)

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(buf: MutPtr<CVoid>, size: SizeT)

public expect fun arc4randomUniform(l: UInt): UInt

public expect fun drand48(): CDouble

public expect fun erand48(xseed: MutPtr<CUshort>): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: MutPtr<CUshort>): CLong

public expect fun mrand48(): CLong

public expect fun jrand48(xseed: MutPtr<CUshort>): CLong

public expect fun srand48(seed: CLong)

public expect fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort>

public expect fun lcong48(p: MutPtr<CUshort>)

public expect fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt

public expect fun strftime(buf: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>): SizeT

public expect fun strftimeL(buf: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>, locale: LocaleT): SizeT

public expect fun devname(dev: DevT, modeT: ModeT): MutPtr<CChar>

public expect fun issetugid(): CInt
