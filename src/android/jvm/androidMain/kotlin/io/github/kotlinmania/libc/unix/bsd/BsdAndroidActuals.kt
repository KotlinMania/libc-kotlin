@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object UnixBsdJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixBsdGetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixBsdSetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixBsdStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixBsdAbs(i: Int): Int

    @JvmStatic
    external fun libcUnixBsdLabs(i: Long): Long

    @JvmStatic
    external fun libcUnixBsdRand(): Int

    @JvmStatic
    external fun libcUnixBsdSrand(seed: Int)

    @JvmStatic
    external fun libcUnixBsdGetifaddrs(ifap: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreeifaddrs(ifa: Long)

    @JvmStatic
    external fun libcUnixBsdSetgroups(ngroups: Int, ptr: Long): Int

    @JvmStatic
    external fun libcUnixBsdSetlogin(name: Long): Int

    @JvmStatic
    external fun libcUnixBsdIoctl(fd: Int, request: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixBsdKqueue(): Int

    @JvmStatic
    external fun libcUnixBsdUnmount(target: Long, arg: Int): Int

    @JvmStatic
    external fun libcUnixBsdSyscall(num: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixBsdGetpwent(): Long

    @JvmStatic
    external fun libcUnixBsdSetpwent()

    @JvmStatic
    external fun libcUnixBsdEndpwent()

    @JvmStatic
    external fun libcUnixBsdEndgrent()

    @JvmStatic
    external fun libcUnixBsdGetgrent(): Long

    @JvmStatic
    external fun libcUnixBsdGetprogname(): Long

    @JvmStatic
    external fun libcUnixBsdSetprogname(name: Long)

    @JvmStatic
    external fun libcUnixBsdGetloadavg(loadavg: Long, nelem: Int): Int

    @JvmStatic
    external fun libcUnixBsdIfNameindex(): Long

    @JvmStatic
    external fun libcUnixBsdIfFreenameindex(ptr: Long)

    @JvmStatic
    external fun libcUnixBsdGetpeereid(socket: Int, euid: Long, egid: Long): Int

    @JvmStatic
    external fun libcUnixBsdGlob(pattern: Long, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libcUnixBsdGlobfree(pglob: Long)

    @JvmStatic
    external fun libcUnixBsdPosixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixBsdShmUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixBsdSeekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libcUnixBsdTelldir(dirp: Long): Long

    @JvmStatic
    external fun libcUnixBsdMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixBsdMsync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdRecvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libcUnixBsdMkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libcUnixBsdFutimes(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixBsdNlLanginfo(item: Int): Long

    @JvmStatic
    external fun libcUnixBsdBind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libcUnixBsdWritev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixBsdReadv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixBsdSendmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdRecvmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdSync()

    @JvmStatic
    external fun libcUnixBsdGetgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixBsdSigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libcUnixBsdSigsuspend(mask: Long): Int

    @JvmStatic
    external fun libcUnixBsdSemClose(sem: Long): Int

    @JvmStatic
    external fun libcUnixBsdGetdtablesize(): Int

    @JvmStatic
    external fun libcUnixBsdGetgrnamR(name: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixBsdPthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcUnixBsdSemOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixBsdGetgrnam(name: Long): Long

    @JvmStatic
    external fun libcUnixBsdPthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libcUnixBsdPthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libcUnixBsdSchedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libcUnixBsdSchedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libcUnixBsdSemUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixBsdGetpwnamR(name: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixBsdGetpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixBsdSigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libcUnixBsdPthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libcUnixBsdGetgrgid(gid: Short): Long

    @JvmStatic
    external fun libcUnixBsdPopen(command: Long, mode: Long): Long

    @JvmStatic
    external fun libcUnixBsdFaccessat(dirfd: Int, pathname: Long, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixBsdAcct(filename: Long): Int

    @JvmStatic
    external fun libcUnixBsdWait4(pid: Int, status: Long, options: Int, rusage: Long): Int

    @JvmStatic
    external fun libcUnixBsdGetitimer(which: Int, currValue: Long): Int

    @JvmStatic
    external fun libcUnixBsdSetitimer(which: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixBsdRegcomp(preg: Long, pattern: Long, cflags: Int): Int

    @JvmStatic
    external fun libcUnixBsdRegexec(preg: Long, input: Long, nmatch: Long, pmatch: Long, eflags: Int): Int

    @JvmStatic
    external fun libcUnixBsdRegerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long

    @JvmStatic
    external fun libcUnixBsdRegfree(preg: Long)

    @JvmStatic
    external fun libcUnixBsdArc4random(): Int

    @JvmStatic
    external fun libcUnixBsdArc4randomBuf(buf: Long, size: Long)

    @JvmStatic
    external fun libcUnixBsdArc4randomUniform(l: Int): Int

    @JvmStatic
    external fun libcUnixBsdDrand48(): Double

    @JvmStatic
    external fun libcUnixBsdErand48(xseed: Long): Double

    @JvmStatic
    external fun libcUnixBsdLrand48(): Long

    @JvmStatic
    external fun libcUnixBsdNrand48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixBsdMrand48(): Long

    @JvmStatic
    external fun libcUnixBsdJrand48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixBsdSrand48(seed: Long)

    @JvmStatic
    external fun libcUnixBsdSeed48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixBsdLcong48(p: Long)

    @JvmStatic
    external fun libcUnixBsdGetoptLong(argc: Int, argv: Long, optstring: Long, longopts: Long, longindex: Long): Int

    @JvmStatic
    external fun libcUnixBsdStrftime(buf: Long, maxsize: Long, format: Long, timeptr: Long): Long

    @JvmStatic
    external fun libcUnixBsdStrftimeL(buf: Long, maxsize: Long, format: Long, timeptr: Long, locale: Long): Long

    @JvmStatic
    external fun libcUnixBsdDevname(dev: Int, modeT: Short): Long

    @JvmStatic
    external fun libcUnixBsdIssetugid(): Int
}

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    UnixBsdJniBridge.libcUnixBsdGetrlimit(resource, rlim.rawAddress)

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    UnixBsdJniBridge.libcUnixBsdSetrlimit(resource, rlim.rawAddress)

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    UnixBsdJniBridge.libcUnixBsdStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun abs(i: CInt): CInt =
    UnixBsdJniBridge.libcUnixBsdAbs(i)

public actual fun labs(i: CLong): CLong =
    UnixBsdJniBridge.libcUnixBsdLabs(i)

public actual fun rand(): CInt =
    UnixBsdJniBridge.libcUnixBsdRand()

public actual fun srand(seed: CUint) {
    UnixBsdJniBridge.libcUnixBsdSrand(seed.toInt())
}

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    UnixBsdJniBridge.libcUnixBsdGetifaddrs(ifap.rawAddress)

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    UnixBsdJniBridge.libcUnixBsdFreeifaddrs(ifa.rawAddress)
}

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    UnixBsdJniBridge.libcUnixBsdSetgroups(ngroups, ptr.rawAddress)

public actual fun setlogin(name: ConstPtr<CChar>): CInt =
    UnixBsdJniBridge.libcUnixBsdSetlogin(name.rawAddress)

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    UnixBsdJniBridge.libcUnixBsdIoctl(fd, request.toLong(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun kqueue(): CInt =
    UnixBsdJniBridge.libcUnixBsdKqueue()

public actual fun unmount(target: ConstPtr<CChar>, arg: CInt): CInt =
    UnixBsdJniBridge.libcUnixBsdUnmount(target.rawAddress, arg)

public actual fun syscall(num: CInt, vararg variadicArgs: Long): CInt =
    UnixBsdJniBridge.libcUnixBsdSyscall(num, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpwent(): MutPtr<Passwd> =
    MutPtr(UnixBsdJniBridge.libcUnixBsdGetpwent())

public actual fun setpwent() {
    UnixBsdJniBridge.libcUnixBsdSetpwent()
}

public actual fun endpwent() {
    UnixBsdJniBridge.libcUnixBsdEndpwent()
}

public actual fun endgrent() {
    UnixBsdJniBridge.libcUnixBsdEndgrent()
}

public actual fun getgrent(): MutPtr<Group> =
    MutPtr(UnixBsdJniBridge.libcUnixBsdGetgrent())

public actual fun getprogname(): ConstPtr<CChar> =
    ConstPtr(UnixBsdJniBridge.libcUnixBsdGetprogname())

public actual fun setprogname(name: ConstPtr<CChar>) {
    UnixBsdJniBridge.libcUnixBsdSetprogname(name.rawAddress)
}

public actual fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt =
    UnixBsdJniBridge.libcUnixBsdGetloadavg(loadavg.rawAddress, nelem)

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    MutPtr(UnixBsdJniBridge.libcUnixBsdIfNameindex())

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    UnixBsdJniBridge.libcUnixBsdIfFreenameindex(ptr.rawAddress)
}

public actual fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt =
    UnixBsdJniBridge.libcUnixBsdGetpeereid(socket, euid.rawAddress, egid.rawAddress)

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    UnixBsdJniBridge.libcUnixBsdGlob(pattern.rawAddress, flags, 0L, pglob.rawAddress)

public actual fun globfree(pglob: MutPtr<GlobT>) {
    UnixBsdJniBridge.libcUnixBsdGlobfree(pglob.rawAddress)
}

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    UnixBsdJniBridge.libcUnixBsdPosixMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    UnixBsdJniBridge.libcUnixBsdShmUnlink(name.rawAddress)

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    UnixBsdJniBridge.libcUnixBsdSeekdir(dirp.rawAddress, loc)
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    UnixBsdJniBridge.libcUnixBsdTelldir(dirp.rawAddress)

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    UnixBsdJniBridge.libcUnixBsdMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    UnixBsdJniBridge.libcUnixBsdMsync(addr.rawAddress, len.toLong(), flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    UnixBsdJniBridge.libcUnixBsdRecvfrom(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.rawAddress)

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    UnixBsdJniBridge.libcUnixBsdMkstemps(template.rawAddress, suffixlen)

public actual fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt =
    UnixBsdJniBridge.libcUnixBsdFutimes(fd, times.rawAddress)

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    MutPtr(UnixBsdJniBridge.libcUnixBsdNlLanginfo(item))

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    UnixBsdJniBridge.libcUnixBsdBind(socket, address.rawAddress, addressLen.toInt())

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixBsdJniBridge.libcUnixBsdWritev(fd, iov.rawAddress, iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixBsdJniBridge.libcUnixBsdReadv(fd, iov.rawAddress, iovcnt)

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    UnixBsdJniBridge.libcUnixBsdSendmsg(fd, msg.rawAddress, flags)

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    UnixBsdJniBridge.libcUnixBsdRecvmsg(fd, msg.rawAddress, flags)

public actual fun sync() {
    UnixBsdJniBridge.libcUnixBsdSync()
}

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixBsdJniBridge.libcUnixBsdGetgrgidR(gid.toShort(), grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    UnixBsdJniBridge.libcUnixBsdSigaltstack(ss.rawAddress, oss.rawAddress)

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    UnixBsdJniBridge.libcUnixBsdSigsuspend(mask.rawAddress)

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    UnixBsdJniBridge.libcUnixBsdSemClose(sem.rawAddress)

public actual fun getdtablesize(): CInt =
    UnixBsdJniBridge.libcUnixBsdGetdtablesize()

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixBsdJniBridge.libcUnixBsdGetgrnamR(name.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    UnixBsdJniBridge.libcUnixBsdPthreadSigmask(how, set.rawAddress, oldset.rawAddress)

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(UnixBsdJniBridge.libcUnixBsdSemOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(UnixBsdJniBridge.libcUnixBsdGetgrnam(name.rawAddress))

public actual fun pthreadCancel(thread: PthreadT): CInt =
    UnixBsdJniBridge.libcUnixBsdPthreadCancel(thread.toLong())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixBsdJniBridge.libcUnixBsdPthreadKill(thread.toLong(), sig)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    UnixBsdJniBridge.libcUnixBsdSchedGetPriorityMin(policy)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    UnixBsdJniBridge.libcUnixBsdSchedGetPriorityMax(policy)

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    UnixBsdJniBridge.libcUnixBsdSemUnlink(name.rawAddress)

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixBsdJniBridge.libcUnixBsdGetpwnamR(name.rawAddress, pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixBsdJniBridge.libcUnixBsdGetpwuidR(uid.toShort(), pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    UnixBsdJniBridge.libcUnixBsdSigwait(set.rawAddress, sig.rawAddress)

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    UnixBsdJniBridge.libcUnixBsdPthreadAtfork(0L, 0L, 0L)

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(UnixBsdJniBridge.libcUnixBsdGetgrgid(gid.toShort()))

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(UnixBsdJniBridge.libcUnixBsdPopen(command.rawAddress, mode.rawAddress))

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    UnixBsdJniBridge.libcUnixBsdFaccessat(dirfd, pathname.rawAddress, mode, flags)

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    UnixBsdJniBridge.libcUnixBsdPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    UnixBsdJniBridge.libcUnixBsdAcct(filename.rawAddress)

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    UnixBsdJniBridge.libcUnixBsdWait4(pid, status.rawAddress, options, rusage.rawAddress)

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    UnixBsdJniBridge.libcUnixBsdGetitimer(which, currValue.rawAddress)

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    UnixBsdJniBridge.libcUnixBsdSetitimer(which, newValue.rawAddress, oldValue.rawAddress)

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    UnixBsdJniBridge.libcUnixBsdRegcomp(preg.rawAddress, pattern.rawAddress, cflags)

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    UnixBsdJniBridge.libcUnixBsdRegexec(preg.rawAddress, input.rawAddress, nmatch.toLong(), pmatch.rawAddress, eflags)

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    UnixBsdJniBridge.libcUnixBsdRegerror(errcode, preg.rawAddress, errbuf.rawAddress, errbufSize.toLong()).toULong()

public actual fun regfree(preg: MutPtr<RegexT>) {
    UnixBsdJniBridge.libcUnixBsdRegfree(preg.rawAddress)
}

public actual fun arc4random(): UInt =
    UnixBsdJniBridge.libcUnixBsdArc4random().toUInt()

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, size: SizeT) {
    UnixBsdJniBridge.libcUnixBsdArc4randomBuf(buf.rawAddress, size.toLong())
}

public actual fun arc4randomUniform(l: UInt): UInt =
    UnixBsdJniBridge.libcUnixBsdArc4randomUniform(l.toInt()).toUInt()

public actual fun drand48(): CDouble =
    UnixBsdJniBridge.libcUnixBsdDrand48()

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    UnixBsdJniBridge.libcUnixBsdErand48(xseed.rawAddress)

public actual fun lrand48(): CLong =
    UnixBsdJniBridge.libcUnixBsdLrand48()

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    UnixBsdJniBridge.libcUnixBsdNrand48(xseed.rawAddress)

public actual fun mrand48(): CLong =
    UnixBsdJniBridge.libcUnixBsdMrand48()

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    UnixBsdJniBridge.libcUnixBsdJrand48(xseed.rawAddress)

public actual fun srand48(seed: CLong) {
    UnixBsdJniBridge.libcUnixBsdSrand48(seed)
}

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    MutPtr(UnixBsdJniBridge.libcUnixBsdSeed48(xseed.rawAddress))

public actual fun lcong48(p: MutPtr<CUshort>) {
    UnixBsdJniBridge.libcUnixBsdLcong48(p.rawAddress)
}

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    UnixBsdJniBridge.libcUnixBsdGetoptLong(argc, argv.rawAddress, optstring.rawAddress, longopts.rawAddress, longindex.rawAddress)

public actual fun strftime(buf: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>): SizeT =
    UnixBsdJniBridge.libcUnixBsdStrftime(buf.rawAddress, maxsize.toLong(), format.rawAddress, timeptr.rawAddress).toULong()

public actual fun strftimeL(buf: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>, locale: LocaleT): SizeT =
    UnixBsdJniBridge.libcUnixBsdStrftimeL(buf.rawAddress, maxsize.toLong(), format.rawAddress, timeptr.rawAddress, locale.rawAddress).toULong()

public actual fun devname(dev: DevT, modeT: ModeT): MutPtr<CChar> =
    MutPtr(UnixBsdJniBridge.libcUnixBsdDevname(dev, modeT.toShort()))

public actual fun issetugid(): CInt =
    UnixBsdJniBridge.libcUnixBsdIssetugid()
