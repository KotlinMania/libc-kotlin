@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd

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
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdAbs
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdAcct
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdArc4random
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdArc4randomBuf
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdArc4randomUniform
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdBind
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdDevname
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdDrand48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdEndgrent
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdEndpwent
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdErand48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdFaccessat
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdFreeifaddrs
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdFutimes
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetdtablesize
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetgrent
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetgrgid
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetgrgidR
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetgrnam
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetgrnamR
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetifaddrs
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetitimer
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetloadavg
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetoptLong
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetpeereid
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetprogname
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetpwent
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetpwnamR
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetpwuidR
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGetrlimit
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGlob
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdGlobfree
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdIfFreenameindex
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdIfNameindex
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdIoctl
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdIssetugid
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdJrand48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdKqueue
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdLabs
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdLcong48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdLrand48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdMadvise
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdMkstemps
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdMrand48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdMsync
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdNlLanginfo
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdNrand48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdPopen
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdPosixMadvise
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdPthreadAtfork
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdPthreadCancel
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdPthreadCreate
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdPthreadKill
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdPthreadSigmask
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdRand
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdReadv
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdRecvfrom
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdRecvmsg
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdRegcomp
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdRegerror
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdRegexec
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdRegfree
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSchedGetPriorityMax
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSchedGetPriorityMin
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSeed48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSeekdir
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSemClose
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSemOpen
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSemUnlink
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSendmsg
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSetgroups
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSetitimer
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSetlogin
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSetprogname
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSetpwent
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSetrlimit
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdShmUnlink
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSigaltstack
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSigsuspend
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSigwait
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSrand
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSrand48
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdStrerrorR
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdStrftime
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdStrftimeL
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSync
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdSyscall
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdTelldir
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdUnmount
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdWait4
import io.github.kotlinmania.libc.unix.bsd.cinterop.libcUnixBsdWritev
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.NlItem
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    libcUnixBsdGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    libcUnixBsdSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    libcUnixBsdStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun abs(i: CInt): CInt =
    libcUnixBsdAbs(i)

public actual fun labs(i: CLong): CLong =
    libcUnixBsdLabs(i)

public actual fun rand(): CInt =
    libcUnixBsdRand()

public actual fun srand(seed: CUint) {
    libcUnixBsdSrand(seed)
}

public actual fun getifaddrs(ifap: MutPtr): CInt =
    libcUnixBsdGetifaddrs(ifap.rawAddress.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: MutPtr) {
    libcUnixBsdFreeifaddrs(ifa.rawAddress.toCPointer<ByteVar>())
}

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr): CInt =
    libcUnixBsdSetgroups(ngroups, ptr.rawAddress.toCPointer<ByteVar>())

public actual fun setlogin(name: ConstPtr): CInt =
    libcUnixBsdSetlogin(name.rawAddress.toCPointer<ByteVar>())

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    libcUnixBsdIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun kqueue(): CInt =
    libcUnixBsdKqueue()

public actual fun unmount(target: ConstPtr, arg: CInt): CInt =
    libcUnixBsdUnmount(target.rawAddress.toCPointer<ByteVar>(), arg)

public actual fun syscall(num: CInt, vararg variadicArgs: Long): CInt =
    libcUnixBsdSyscall(num, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpwent(): MutPtr =
    MutPtr(libcUnixBsdGetpwent()?.toLong() ?: 0L)

public actual fun setpwent() {
    libcUnixBsdSetpwent()
}

public actual fun endpwent() {
    libcUnixBsdEndpwent()
}

public actual fun endgrent() {
    libcUnixBsdEndgrent()
}

public actual fun getgrent(): MutPtr =
    MutPtr(libcUnixBsdGetgrent()?.toLong() ?: 0L)

public actual fun getprogname(): ConstPtr =
    ConstPtr(libcUnixBsdGetprogname()?.toLong() ?: 0L)

public actual fun setprogname(name: ConstPtr) {
    libcUnixBsdSetprogname(name.rawAddress.toCPointer<ByteVar>())
}

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    libcUnixBsdGetloadavg(loadavg.rawAddress.toCPointer<ByteVar>(), nelem)

public actual fun ifNameindex(): MutPtr =
    MutPtr(libcUnixBsdIfNameindex()?.toLong() ?: 0L)

public actual fun ifFreenameindex(ptr: MutPtr) {
    libcUnixBsdIfFreenameindex(ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun getpeereid(socket: CInt, euid: MutPtr, egid: MutPtr): CInt =
    libcUnixBsdGetpeereid(socket, euid.rawAddress.toCPointer<ByteVar>(), egid.rawAddress.toCPointer<ByteVar>())

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    libcUnixBsdGlob(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree(pglob: MutPtr) {
    libcUnixBsdGlobfree(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    libcUnixBsdPosixMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun shmUnlink(name: ConstPtr): CInt =
    libcUnixBsdShmUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    libcUnixBsdSeekdir(dirp.rawAddress.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: MutPtr): CLong =
    libcUnixBsdTelldir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    libcUnixBsdMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    libcUnixBsdMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    libcUnixBsdRecvfrom(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    libcUnixBsdMkstemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen)

public actual fun futimes(fd: CInt, times: ConstPtr): CInt =
    libcUnixBsdFutimes(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: NlItem): MutPtr =
    MutPtr(libcUnixBsdNlLanginfo(item)?.toLong() ?: 0L)

public actual fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt =
    libcUnixBsdBind(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    libcUnixBsdWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    libcUnixBsdReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    libcUnixBsdSendmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT =
    libcUnixBsdRecvmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun sync() {
    libcUnixBsdSync()
}

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixBsdGetgrgidR(gid, grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    libcUnixBsdSigaltstack(ss.rawAddress.toCPointer<ByteVar>(), oss.rawAddress.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: ConstPtr): CInt =
    libcUnixBsdSigsuspend(mask.rawAddress.toCPointer<ByteVar>())

public actual fun semClose(sem: MutPtr): CInt =
    libcUnixBsdSemClose(sem.rawAddress.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    libcUnixBsdGetdtablesize()

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixBsdGetgrnamR(name.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    libcUnixBsdPthreadSigmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(libcUnixBsdSemOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun getgrnam(name: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdGetgrnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libcUnixBsdPthreadCancel(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libcUnixBsdPthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libcUnixBsdSchedGetPriorityMin(policy)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libcUnixBsdSchedGetPriorityMax(policy)

public actual fun semUnlink(name: ConstPtr): CInt =
    libcUnixBsdSemUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixBsdGetpwnamR(name.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixBsdGetpwuidR(uid, pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    libcUnixBsdSigwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    libcUnixBsdPthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): MutPtr =
    MutPtr(libcUnixBsdGetgrgid(gid)?.toLong() ?: 0L)

public actual fun popen(command: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdPopen(command.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    libcUnixBsdFaccessat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    libcUnixBsdPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun acct(filename: ConstPtr): CInt =
    libcUnixBsdAcct(filename.rawAddress.toCPointer<ByteVar>())

public actual fun wait4(pid: PidT, status: MutPtr, options: CInt, rusage: MutPtr): PidT =
    libcUnixBsdWait4(pid, status.rawAddress.toCPointer<ByteVar>(), options, rusage.rawAddress.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: MutPtr): CInt =
    libcUnixBsdGetitimer(which, currValue.rawAddress.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    libcUnixBsdSetitimer(which, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun regcomp(preg: MutPtr, pattern: ConstPtr, cflags: CInt): CInt =
    libcUnixBsdRegcomp(preg.rawAddress.toCPointer<ByteVar>(), pattern.rawAddress.toCPointer<ByteVar>(), cflags)

public actual fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt =
    libcUnixBsdRegexec(preg.rawAddress.toCPointer<ByteVar>(), input.rawAddress.toCPointer<ByteVar>(), nmatch, pmatch.rawAddress.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT =
    libcUnixBsdRegerror(errcode, preg.rawAddress.toCPointer<ByteVar>(), errbuf.rawAddress.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: MutPtr) {
    libcUnixBsdRegfree(preg.rawAddress.toCPointer<ByteVar>())
}

public actual fun arc4random(): UInt =
    libcUnixBsdArc4random()

public actual fun arc4randomBuf(buf: MutPtr, size: SizeT) {
    libcUnixBsdArc4randomBuf(buf.rawAddress.toCPointer<ByteVar>(), size)
}

public actual fun arc4randomUniform(l: UInt): UInt =
    libcUnixBsdArc4randomUniform(l)

public actual fun drand48(): CDouble =
    libcUnixBsdDrand48()

public actual fun erand48(xseed: MutPtr): CDouble =
    libcUnixBsdErand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    libcUnixBsdLrand48()

public actual fun nrand48(xseed: MutPtr): CLong =
    libcUnixBsdNrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    libcUnixBsdMrand48()

public actual fun jrand48(xseed: MutPtr): CLong =
    libcUnixBsdJrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun srand48(seed: CLong) {
    libcUnixBsdSrand48(seed)
}

public actual fun seed48(xseed: MutPtr): MutPtr =
    MutPtr(libcUnixBsdSeed48(xseed.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lcong48(p: MutPtr) {
    libcUnixBsdLcong48(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt =
    libcUnixBsdGetoptLong(argc, argv.rawAddress.toCPointer<ByteVar>(), optstring.rawAddress.toCPointer<ByteVar>(), longopts.rawAddress.toCPointer<ByteVar>(), longindex.rawAddress.toCPointer<ByteVar>())

public actual fun strftime(buf: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr): SizeT =
    libcUnixBsdStrftime(buf.rawAddress.toCPointer<ByteVar>(), maxsize, format.rawAddress.toCPointer<ByteVar>(), timeptr.rawAddress.toCPointer<ByteVar>())

public actual fun strftimeL(buf: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr, locale: LocaleT): SizeT =
    libcUnixBsdStrftimeL(buf.rawAddress.toCPointer<ByteVar>(), maxsize, format.rawAddress.toCPointer<ByteVar>(), timeptr.rawAddress.toCPointer<ByteVar>(), locale.rawAddress.toCPointer<ByteVar>())

public actual fun devname(dev: DevT, modeT: ModeT): MutPtr =
    MutPtr(libcUnixBsdDevname(dev, modeT)?.toLong() ?: 0L)

public actual fun issetugid(): CInt =
    libcUnixBsdIssetugid()
