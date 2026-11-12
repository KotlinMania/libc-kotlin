@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixHaikuJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixHaikuGetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixHaikuSetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixHaikuGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixHaikuSetpriority(which: Int, who: Int, priority: Int): Int

    @JvmStatic
    external fun libcUnixHaikuEndusershell()

    @JvmStatic
    external fun libcUnixHaikuGetpass(prompt: Long): Long

    @JvmStatic
    external fun libcUnixHaikuGetusershell(): Long

    @JvmStatic
    external fun libcUnixHaikuIssetugid(): Int

    @JvmStatic
    external fun libcUnixHaikuSetusershell()

    @JvmStatic
    external fun libcUnixHaikuUtimensat(fd: Int, path: Long, times: Long, flag: Int): Int

    @JvmStatic
    external fun libcUnixHaikuFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixHaikuStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixHaikuErrnop(): Long

    @JvmStatic
    external fun libcUnixHaikuAbs(i: Int): Int

    @JvmStatic
    external fun libcUnixHaikuLabs(i: Long): Long

    @JvmStatic
    external fun libcUnixHaikuRand(): Int

    @JvmStatic
    external fun libcUnixHaikuSrand(seed: Int)

    @JvmStatic
    external fun libcUnixHaikuGetifaddrs(ifap: Long): Int

    @JvmStatic
    external fun libcUnixHaikuFreeifaddrs(ifa: Long)

    @JvmStatic
    external fun libcUnixHaikuPpoll(fds: Long, numfds: Long, timeout: Long, sigMask: Long): Int

    @JvmStatic
    external fun libcUnixHaikuGetspent(): Long

    @JvmStatic
    external fun libcUnixHaikuGetspentR(pwd: Long, buf: Long, bufferSize: Long, res: Long): Int

    @JvmStatic
    external fun libcUnixHaikuSetspent()

    @JvmStatic
    external fun libcUnixHaikuEndspent()

    @JvmStatic
    external fun libcUnixHaikuGetspnam(name: Long): Long

    @JvmStatic
    external fun libcUnixHaikuGetspnamR(name: Long, spwd: Long, buffer: Long, bufferSize: Long, res: Long): Int

    @JvmStatic
    external fun libcUnixHaikuSgetspent(line: Long): Long

    @JvmStatic
    external fun libcUnixHaikuSgetspentR(line: Long, spwd: Long, buffer: Long, bufferSize: Long, res: Long): Int

    @JvmStatic
    external fun libcUnixHaikuFgetspent(file: Long): Long

    @JvmStatic
    external fun libcUnixHaikuFgetspentR(file: Long, spwd: Long, buffer: Long, bufferSize: Long, res: Long): Int

    @JvmStatic
    external fun libcUnixHaikuMkfifoat(dirfd: Int, pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixHaikuMknodat(dirfd: Int, pathname: Long, mode: Int, dev: Int): Int

    @JvmStatic
    external fun libcUnixHaikuSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcUnixHaikuSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixHaikuClockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixHaikuClockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixHaikuClockSettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixHaikuClockGetcpuclockid(pid: Int, clkId: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadCreate(thread: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libcUnixHaikuValloc(numBytes: Long): Long

    @JvmStatic
    external fun libcUnixHaikuMallocUsableSize(ptr: Long): Long

    @JvmStatic
    external fun libcUnixHaikuMemalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixHaikuSetgroups(ngroups: Int, ptr: Long): Int

    @JvmStatic
    external fun libcUnixHaikuInitgroups(name: Long, basegid: Short): Int

    @JvmStatic
    external fun libcUnixHaikuIoctl(fd: Int, request: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixHaikuMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixHaikuDirfd(dirp: Long): Int

    @JvmStatic
    external fun libcUnixHaikuGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixHaikuWaitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixHaikuGlob(pattern: Long, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libcUnixHaikuGlobfree(pglob: Long)

    @JvmStatic
    external fun libcUnixHaikuGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPosixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixHaikuPosixFadvise(fd: Int, offset: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixHaikuPosixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixHaikuShmOpen(name: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixHaikuShmUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixHaikuSeekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libcUnixHaikuTelldir(dirp: Long): Long

    @JvmStatic
    external fun libcUnixHaikuMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixHaikuMsync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixHaikuRecvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libcUnixHaikuNlLanginfo(item: Int): Long

    @JvmStatic
    external fun libcUnixHaikuBind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libcUnixHaikuAccept4(socket: Int, address: Long, addressLength: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixHaikuWritev(fd: Int, iov: Long, count: Int): Long

    @JvmStatic
    external fun libcUnixHaikuReadv(fd: Int, iov: Long, count: Int): Long

    @JvmStatic
    external fun libcUnixHaikuSendmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixHaikuRecvmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixHaikuExecvpe(file: Long, argv: Long, environment: Long): Int

    @JvmStatic
    external fun libcUnixHaikuGetgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixHaikuGetgrouplist(user: Long, basegroup: Short, grouplist: Long, groupcount: Long): Int

    @JvmStatic
    external fun libcUnixHaikuSigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libcUnixHaikuSigsuspend(mask: Long): Int

    @JvmStatic
    external fun libcUnixHaikuSemClose(sem: Long): Int

    @JvmStatic
    external fun libcUnixHaikuGetdtablesize(): Int

    @JvmStatic
    external fun libcUnixHaikuGetgrnamR(name: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcUnixHaikuSemOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixHaikuGetgrnam(name: Long): Long

    @JvmStatic
    external fun libcUnixHaikuPthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libcUnixHaikuSemUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixHaikuGetpwnamR(name: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixHaikuGetpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixHaikuGetpwent(): Long

    @JvmStatic
    external fun libcUnixHaikuSetpwent()

    @JvmStatic
    external fun libcUnixHaikuEndpwent()

    @JvmStatic
    external fun libcUnixHaikuEndgrent()

    @JvmStatic
    external fun libcUnixHaikuGetgrent(): Long

    @JvmStatic
    external fun libcUnixHaikuSetgrent()

    @JvmStatic
    external fun libcUnixHaikuSigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libcUnixHaikuGetgrgid(gid: Short): Long

    @JvmStatic
    external fun libcUnixHaikuPopen(command: Long, mode: Long): Long

    @JvmStatic
    external fun libcUnixHaikuSethostname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixHaikuUname(buf: Long): Int

    @JvmStatic
    external fun libcUnixHaikuGetutxent(): Long

    @JvmStatic
    external fun libcUnixHaikuGetutxid(ut: Long): Long

    @JvmStatic
    external fun libcUnixHaikuGetutxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixHaikuPututxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixHaikuSetutxent()

    @JvmStatic
    external fun libcUnixHaikuEndutxent()

    @JvmStatic
    external fun libcUnixHaikuFaccessat(dirfd: Int, pathname: Long, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixHaikuSigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixHaikuSigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixHaikuGetitimer(which: Int, currValue: Long): Int

    @JvmStatic
    external fun libcUnixHaikuSetitimer(which: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixHaikuRegcomp(preg: Long, pattern: Long, cflags: Int): Int

    @JvmStatic
    external fun libcUnixHaikuRegexec(preg: Long, input: Long, nmatch: Long, pmatch: Long, eflags: Int): Int

    @JvmStatic
    external fun libcUnixHaikuRegerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long

    @JvmStatic
    external fun libcUnixHaikuRegfree(preg: Long)

    @JvmStatic
    external fun libcUnixHaikuMsgctl(msqid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixHaikuMsgget(key: Int, msgflg: Int): Int

    @JvmStatic
    external fun libcUnixHaikuMsgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtype: Long, msgflg: Int): Long

    @JvmStatic
    external fun libcUnixHaikuMsgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int

    @JvmStatic
    external fun libcUnixHaikuSemget(key: Int, nsems: Int, semflg: Int): Int

    @JvmStatic
    external fun libcUnixHaikuSemctl(semid: Int, semnum: Int, cmd: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixHaikuSemop(semid: Int, sops: Long, nsops: Long): Int

    @JvmStatic
    external fun libcUnixHaikuFtok(pathname: Long, projId: Int): Int

    @JvmStatic
    external fun libcUnixHaikuMemrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcUnixHaikuLsearch(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long

    @JvmStatic
    external fun libcUnixHaikuLfind(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long

    @JvmStatic
    external fun libcUnixHaikuHcreate(nelt: Long): Int

    @JvmStatic
    external fun libcUnixHaikuHdestroy()

    @JvmStatic
    external fun libcUnixHaikuDrand48(): Double

    @JvmStatic
    external fun libcUnixHaikuErand48(xseed: Long): Double

    @JvmStatic
    external fun libcUnixHaikuLrand48(): Long

    @JvmStatic
    external fun libcUnixHaikuNrand48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixHaikuMrand48(): Long

    @JvmStatic
    external fun libcUnixHaikuJrand48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixHaikuSrand48(seed: Long)

    @JvmStatic
    external fun libcUnixHaikuSeed48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixHaikuLcong48(p: Long)

    @JvmStatic
    external fun libcUnixHaikuClearenv(): Int

    @JvmStatic
    external fun libcUnixHaikuCtermid(s: Long): Long

    @JvmStatic
    external fun libcUnixHaikuSync()

    @JvmStatic
    external fun libcUnixHaikuGetpagesize(): Int

    @JvmStatic
    external fun libcUnixHaikuBrk(addr: Long): Int

    @JvmStatic
    external fun libcUnixHaikuSbrk(increment: Long): Long

    @JvmStatic
    external fun libcUnixHaikuPosixSpawn(pid: Long, path: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnp(pid: Long, file: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnFileActionsInit(fileActions: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnFileActionsDestroy(fileActions: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnFileActionsAddopen(fileActions: Long, fildes: Int, path: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnFileActionsAddclose(fileActions: Long, fildes: Int): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnFileActionsAdddup2(fileActions: Long, fildes: Int, newfildes: Int): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnattrGetpgroup(attr: Long, pgroup: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnattrSetpgroup(attr: Long, pgroup: Int): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnattrGetsigdefault(attr: Long, sigdefault: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnattrSetsigdefault(attr: Long, sigdefault: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnattrGetsigmask(attr: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPosixSpawnattrSetsigmask(attr: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixHaikuGetoptLong(argc: Int, argv: Long, optstring: Long, longopts: Long, longindex: Long): Int

    @JvmStatic
    external fun libcUnixHaikuStrcasecmpL(string1: Long, string2: Long, locale: Long): Int

    @JvmStatic
    external fun libcUnixHaikuStrncasecmpL(string1: Long, string2: Long, length: Long, locale: Long): Int

    @JvmStatic
    external fun libcUnixHaikuGetentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixHaikuMemmem(source: Long, sourceLength: Long, search: Long, searchLength: Long): Long

    @JvmStatic
    external fun libcUnixHaikuPthreadGetattrNp(thread: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadGetnameNp(thread: Long, buffer: Long, length: Long): Int

    @JvmStatic
    external fun libcUnixHaikuPthreadSetnameNp(thread: Long, name: Long): Int
}

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetrlimit(resource, rlim.rawAddress)

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSetrlimit(resource, rlim.rawAddress)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSetpriority(which, who, priority)

public actual fun endusershell() {
    UnixHaikuJniBridge.libcUnixHaikuEndusershell()
}

public actual fun getpass(prompt: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuGetpass(prompt.rawAddress))

public actual fun getusershell(): MutPtr<CChar> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuGetusershell())

public actual fun issetugid(): CInt =
    UnixHaikuJniBridge.libcUnixHaikuIssetugid()

public actual fun setusershell() {
    UnixHaikuJniBridge.libcUnixHaikuSetusershell()
}

public actual fun utimensat(fd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuUtimensat(fd, path.rawAddress, times.rawAddress, flag)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuFutimens(fd, times.rawAddress)

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun errnop(): MutPtr<CInt> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuErrnop())

public actual fun abs(i: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuAbs(i)

public actual fun labs(i: CLong): CLong =
    UnixHaikuJniBridge.libcUnixHaikuLabs(i)

public actual fun rand(): CInt =
    UnixHaikuJniBridge.libcUnixHaikuRand()

public actual fun srand(seed: CUint) {
    UnixHaikuJniBridge.libcUnixHaikuSrand(seed.toInt())
}

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetifaddrs(ifap.rawAddress)

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    UnixHaikuJniBridge.libcUnixHaikuFreeifaddrs(ifa.rawAddress)
}

public actual fun ppoll(fds: MutPtr<Pollfd>, numfds: NfdsT, timeout: ConstPtr<Timespec>, sigMask: ConstPtr<SigsetT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPpoll(fds.rawAddress, numfds.toLong(), timeout.rawAddress, sigMask.rawAddress)

public actual fun getspent(): MutPtr<Spwd> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuGetspent())

public actual fun getspentR(pwd: MutPtr<Spwd>, buf: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetspentR(pwd.rawAddress, buf.rawAddress, bufferSize.toLong(), res.rawAddress)

public actual fun setspent() {
    UnixHaikuJniBridge.libcUnixHaikuSetspent()
}

public actual fun endspent() {
    UnixHaikuJniBridge.libcUnixHaikuEndspent()
}

public actual fun getspnam(name: ConstPtr<CChar>): MutPtr<Spwd> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuGetspnam(name.rawAddress))

public actual fun getspnamR(name: ConstPtr<CChar>, spwd: MutPtr<Spwd>, buffer: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetspnamR(name.rawAddress, spwd.rawAddress, buffer.rawAddress, bufferSize.toLong(), res.rawAddress)

public actual fun sgetspent(line: ConstPtr<CChar>): MutPtr<Spwd> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuSgetspent(line.rawAddress))

public actual fun sgetspentR(line: ConstPtr<CChar>, spwd: MutPtr<Spwd>, buffer: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSgetspentR(line.rawAddress, spwd.rawAddress, buffer.rawAddress, bufferSize.toLong(), res.rawAddress)

public actual fun fgetspent(file: MutPtr<FILE>): MutPtr<Spwd> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuFgetspent(file.rawAddress))

public actual fun fgetspentR(file: MutPtr<FILE>, spwd: MutPtr<Spwd>, buffer: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuFgetspentR(file.rawAddress, spwd.rawAddress, buffer.rawAddress, bufferSize.toLong(), res.rawAddress)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuMkfifoat(dirfd, pathname.rawAddress, mode.toInt())

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuMknodat(dirfd, pathname.rawAddress, mode.toInt(), dev)

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSemDestroy(sem.rawAddress)

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuClockGetres(clkId, tp.rawAddress)

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuClockGettime(clkId, tp.rawAddress)

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuClockSettime(clkId, tp.rawAddress)

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuClockGetcpuclockid(pid, clkId.rawAddress)

public actual fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadCreate(thread.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadAttrGetguardsize(attr.rawAddress, guardsize.rawAddress)

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadAttrSetguardsize(attr.rawAddress, guardsize.toLong())

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadAttrGetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.rawAddress)

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadCondattrGetclock(attr.rawAddress, clockId.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadCondattrSetclock(attr.rawAddress, clockId)

public actual fun valloc(numBytes: SizeT): MutPtr<CVoid> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuValloc(numBytes.toLong()))

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    UnixHaikuJniBridge.libcUnixHaikuMallocUsableSize(ptr.rawAddress).toULong()

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuMemalign(align.toLong(), size.toLong()))

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSetgroups(ngroups, ptr.rawAddress)

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuInitgroups(name.rawAddress, basegid.toShort())

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    UnixHaikuJniBridge.libcUnixHaikuIoctl(fd, request.toLong(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuDirfd(dirp.rawAddress)

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toInt(), serv.rawAddress, servlen.toInt(), flags)

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadMutexTimedlock(lock.rawAddress, abstime.rawAddress)

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadSpinInit(lock.rawAddress, pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadSpinDestroy(lock.rawAddress)

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadSpinLock(lock.rawAddress)

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadSpinTrylock(lock.rawAddress)

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadSpinUnlock(lock.rawAddress)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuWaitid(idtype, id, infop.rawAddress, options)

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGlob(pattern.rawAddress, flags, 0L, pglob.rawAddress)

public actual fun globfree(pglob: MutPtr<GlobT>) {
    UnixHaikuJniBridge.libcUnixHaikuGlobfree(pglob.rawAddress)
}

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixFadvise(fd, offset, len, advice)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixFallocate(fd, offset, len)

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuShmOpen(name.rawAddress, oflag, mode.toInt())

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuShmUnlink(name.rawAddress)

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    UnixHaikuJniBridge.libcUnixHaikuSeekdir(dirp.rawAddress, loc)
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    UnixHaikuJniBridge.libcUnixHaikuTelldir(dirp.rawAddress)

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuMsync(addr.rawAddress, len.toLong(), flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    UnixHaikuJniBridge.libcUnixHaikuRecvfrom(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.rawAddress)

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuNlLanginfo(item))

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuBind(socket, address.rawAddress, addressLen.toInt())

public actual fun accept4(socket: CInt, address: MutPtr<Sockaddr>, addressLength: MutPtr<SocklenT>, flags: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuAccept4(socket, address.rawAddress, addressLength.rawAddress, flags)

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, count: CInt): SsizeT =
    UnixHaikuJniBridge.libcUnixHaikuWritev(fd, iov.rawAddress, count)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, count: CInt): SsizeT =
    UnixHaikuJniBridge.libcUnixHaikuReadv(fd, iov.rawAddress, count)

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    UnixHaikuJniBridge.libcUnixHaikuSendmsg(fd, msg.rawAddress, flags)

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    UnixHaikuJniBridge.libcUnixHaikuRecvmsg(fd, msg.rawAddress, flags)

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, environment: ConstPtr<ConstPtr<CChar>>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuExecvpe(file.rawAddress, argv.rawAddress, environment.rawAddress)

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetgrgidR(gid.toShort(), grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getgrouplist(user: ConstPtr<CChar>, basegroup: GidT, grouplist: MutPtr<GidT>, groupcount: MutPtr<CInt>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetgrouplist(user.rawAddress, basegroup.toShort(), grouplist.rawAddress, groupcount.rawAddress)

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSigaltstack(ss.rawAddress, oss.rawAddress)

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSigsuspend(mask.rawAddress)

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSemClose(sem.rawAddress)

public actual fun getdtablesize(): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetdtablesize()

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetgrnamR(name.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadSigmask(how, set.rawAddress, oldset.rawAddress)

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuSemOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuGetgrnam(name.rawAddress))

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadKill(thread.toLong(), sig)

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSemUnlink(name.rawAddress)

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetpwnamR(name.rawAddress, pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetpwuidR(uid.toShort(), pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getpwent(): MutPtr<Passwd> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuGetpwent())

public actual fun setpwent() {
    UnixHaikuJniBridge.libcUnixHaikuSetpwent()
}

public actual fun endpwent() {
    UnixHaikuJniBridge.libcUnixHaikuEndpwent()
}

public actual fun endgrent() {
    UnixHaikuJniBridge.libcUnixHaikuEndgrent()
}

public actual fun getgrent(): MutPtr<Group> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuGetgrent())

public actual fun setgrent() {
    UnixHaikuJniBridge.libcUnixHaikuSetgrent()
}

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSigwait(set.rawAddress, sig.rawAddress)

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadAtfork(0L, 0L, 0L)

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuGetgrgid(gid.toShort()))

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuPopen(command.rawAddress, mode.rawAddress))

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSethostname(name.rawAddress, len.toLong())

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuUname(buf.rawAddress)

public actual fun getutxent(): MutPtr<Utmpx> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuGetutxent())

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuGetutxid(ut.rawAddress))

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuGetutxline(ut.rawAddress))

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuPututxline(ut.rawAddress))

public actual fun setutxent() {
    UnixHaikuJniBridge.libcUnixHaikuSetutxent()
}

public actual fun endutxent() {
    UnixHaikuJniBridge.libcUnixHaikuEndutxent()
}

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuFaccessat(dirfd, pathname.rawAddress, mode, flags)

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSigtimedwait(set.rawAddress, info.rawAddress, timeout.rawAddress)

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSigwaitinfo(set.rawAddress, info.rawAddress)

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetitimer(which, currValue.rawAddress)

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSetitimer(which, newValue.rawAddress, oldValue.rawAddress)

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuRegcomp(preg.rawAddress, pattern.rawAddress, cflags)

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuRegexec(preg.rawAddress, input.rawAddress, nmatch.toLong(), pmatch.rawAddress, eflags)

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    UnixHaikuJniBridge.libcUnixHaikuRegerror(errcode, preg.rawAddress, errbuf.rawAddress, errbufSize.toLong()).toULong()

public actual fun regfree(preg: MutPtr<RegexT>) {
    UnixHaikuJniBridge.libcUnixHaikuRegfree(preg.rawAddress)
}

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuMsgctl(msqid, cmd, buf.rawAddress)

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuMsgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT =
    UnixHaikuJniBridge.libcUnixHaikuMsgrcv(msqid, msgp.rawAddress, msgsz.toLong(), msgtype, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuMsgsnd(msqid, msgp.rawAddress, msgsz.toLong(), msgflg)

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSemget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuSemop(semid, sops.rawAddress, nsops.toLong())

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    UnixHaikuJniBridge.libcUnixHaikuFtok(pathname.rawAddress, projId)

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuMemrchr(cx.rawAddress, c, n.toLong()))

public actual fun lsearch(key: ConstPtr<CVoid>, base: MutPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuLsearch(key.rawAddress, base.rawAddress, nelp.rawAddress, width.toLong(), 0L))

public actual fun lfind(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuLfind(key.rawAddress, base.rawAddress, nelp.rawAddress, width.toLong(), 0L))

public actual fun hcreate(nelt: SizeT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuHcreate(nelt.toLong())

public actual fun hdestroy() {
    UnixHaikuJniBridge.libcUnixHaikuHdestroy()
}

public actual fun hsearch(entry: Entry, action: Action): MutPtr<Entry> =
    MutPtr(0L)

public actual fun drand48(): CDouble =
    UnixHaikuJniBridge.libcUnixHaikuDrand48()

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    UnixHaikuJniBridge.libcUnixHaikuErand48(xseed.rawAddress)

public actual fun lrand48(): CLong =
    UnixHaikuJniBridge.libcUnixHaikuLrand48()

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    UnixHaikuJniBridge.libcUnixHaikuNrand48(xseed.rawAddress)

public actual fun mrand48(): CLong =
    UnixHaikuJniBridge.libcUnixHaikuMrand48()

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    UnixHaikuJniBridge.libcUnixHaikuJrand48(xseed.rawAddress)

public actual fun srand48(seed: CLong) {
    UnixHaikuJniBridge.libcUnixHaikuSrand48(seed)
}

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuSeed48(xseed.rawAddress))

public actual fun lcong48(p: MutPtr<CUshort>) {
    UnixHaikuJniBridge.libcUnixHaikuLcong48(p.rawAddress)
}

public actual fun clearenv(): CInt =
    UnixHaikuJniBridge.libcUnixHaikuClearenv()

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuCtermid(s.rawAddress))

public actual fun sync() {
    UnixHaikuJniBridge.libcUnixHaikuSync()
}

public actual fun getpagesize(): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetpagesize()

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuBrk(addr.rawAddress)

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuSbrk(increment))

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawn(pid.rawAddress, path.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnp(pid.rawAddress, file.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnFileActionsInit(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnFileActionsInit(fileActions.rawAddress)

public actual fun posixSpawnFileActionsDestroy(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnFileActionsDestroy(fileActions.rawAddress)

public actual fun posixSpawnFileActionsAddopen(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnFileActionsAddopen(fileActions.rawAddress, fildes, path.rawAddress, oflag, mode.toInt())

public actual fun posixSpawnFileActionsAddclose(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnFileActionsAddclose(fileActions.rawAddress, fildes)

public actual fun posixSpawnFileActionsAdddup2(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, newfildes: CInt): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnFileActionsAdddup2(fileActions.rawAddress, fildes, newfildes)

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnattrInit(attr.rawAddress)

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnattrDestroy(attr.rawAddress)

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnattrGetflags(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnattrSetflags(attr.rawAddress, flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, pgroup: MutPtr<PidT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnattrGetpgroup(attr.rawAddress, pgroup.rawAddress)

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, pgroup: PidT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnattrSetpgroup(attr.rawAddress, pgroup)

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, sigdefault: MutPtr<SigsetT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnattrGetsigdefault(attr.rawAddress, sigdefault.rawAddress)

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, sigdefault: ConstPtr<SigsetT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnattrSetsigdefault(attr.rawAddress, sigdefault.rawAddress)

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, sigmask: MutPtr<SigsetT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnattrGetsigmask(attr.rawAddress, sigmask.rawAddress)

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, sigmask: ConstPtr<SigsetT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPosixSpawnattrSetsigmask(attr.rawAddress, sigmask.rawAddress)

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetoptLong(argc, argv.rawAddress, optstring.rawAddress, longopts.rawAddress, longindex.rawAddress)

public actual fun strcasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, locale: LocaleT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuStrcasecmpL(string1.rawAddress, string2.rawAddress, locale.rawAddress)

public actual fun strncasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, length: SizeT, locale: LocaleT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuStrncasecmpL(string1.rawAddress, string2.rawAddress, length.toLong(), locale.rawAddress)

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuGetentropy(buf.rawAddress, buflen.toLong())

public actual fun memmem(source: ConstPtr<CVoid>, sourceLength: SizeT, search: ConstPtr<CVoid>, searchLength: SizeT): MutPtr<CVoid> =
    MutPtr(UnixHaikuJniBridge.libcUnixHaikuMemmem(source.rawAddress, sourceLength.toLong(), search.rawAddress, searchLength.toLong()))

public actual fun pthreadGetattrNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadGetattrNp(thread.toLong(), attr.rawAddress)

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: MutPtr<CChar>, length: SizeT): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadGetnameNp(thread.toLong(), buffer.rawAddress, length.toLong())

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    UnixHaikuJniBridge.libcUnixHaikuPthreadSetnameNp(thread.toLong(), name.rawAddress)
