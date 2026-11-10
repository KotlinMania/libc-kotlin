package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: COpaquePointer?, size: SizeT, data: COpaquePointer?): CInt
}

public fun cmsgAlign(len: Int): Int = len + 8 - 1 and (8 - 1).inv()

public fun align(p: Int, b: Int): Int = (p + b - 1) and (b - 1).inv()

// intentionally not public, only used for fdSet
// QNX Network Stack Versioning:
//
// The `if` block targets the legacy `io - pkt` stack.
// - targetEnv = "nto70": QNX 7.0
// - targetEnv = "nto71": Standard QNX 7.1 (default legacy stack)
//
// The `else` block targets the modern `io - sock` stack.
// - targetEnv = "nto71Iosock": QNX 7.1 with the optional new stack
// - targetEnv = "nto80": QNX 8.0
public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? =
    if ((mhdr!!.msgControllen).toInt() >= 8) {
        null
    } else {
        null
    }

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    val msg = cmsgAlign((cmsg!!.cmsgLen).toInt())
    val next = ((cmsg).hashCode().toLong()).toInt() + msg + cmsgAlign(8)
    return if (next > ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + mhdr.msgControllen.toInt()) {
        null
    } else {
        null
    }
}

public fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? = COpaquePointer(((COpaquePointer((cmsg).hashCode().toLong()))).rawValue + (cmsgAlign(8)).toLong())

public fun cmsgLen(length: CUint): CUint = cmsgAlign(8).toUInt() + length

public fun cmsgSpace(length: CUint): CUint = (cmsgAlign(8) + cmsgAlign(length.toInt())).toUInt()

public fun fdClr(fd: CInt, set: FdSet?) {
    val fd1 = fd
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set.fdsBits[fd1 / size] and (1u shl (fd1 % size)).inv()
    return
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val fd1 = fd
    val size = 8 * 8
    return (set!!.fdsBits[fd1 / size] and (1u shl (fd1 % size))) != 0u
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val fd1 = fd
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set.fdsBits[fd1 / size] or (1u shl (fd1 % size))
    return
}

public fun fdZero(set: FdSet?) {
    for (idx in (set!!.fdsBits).indices) {
        (set.fdsBits)[idx] = 0u
    }
}

public fun dextraFirst(d: Dirent?): DirentExtra? = null

public fun dextraValid(x: DirentExtra?, d: Dirent?): Boolean {
    val sz = ((x).hashCode().toLong()).toInt() - ((d).hashCode().toLong()).toInt() + 8
    val rsz = (d!!.dReclen).toInt()
    return if (sz > rsz || sz + (x!!.dDatalen).toInt() > rsz) {
        false
    } else {
        true
    }
}

public fun dextraNext(x: DirentExtra?): DirentExtra? = null

public fun sockcredsize(ngrps: Int): Int {
    val ngrps1 =
        if (ngrps > 0) {
            ngrps - 1
        } else {
            0
        }
    return 8 + 8 * ngrps1
}

public fun wifstopped(status: CInt): Boolean = (status and 0xff) == 0x7f

public fun wstopsig(status: CInt): CInt = (status shr 8) and 0xff

public fun wifcontinued(status: CInt): Boolean = status == 0xffff

public fun wifsignaled(status: CInt): Boolean = ((status and 0x7f) + 1).toByte() >= 2.toByte()

public fun wtermsig(status: CInt): CInt = status and 0x7f

public fun wifexited(status: CInt): Boolean = (status and 0x7f) == 0

public fun wexitstatus(status: CInt): CInt = (status shr 8) and 0xff

public fun wcoredump(status: CInt): Boolean = (status and 0x80) != 0

public fun iptosEcn(x: UByte): UByte = x and IPTOS_ECN_MASK

public fun makedev(major: CUint, minor: CUint): DevT = ((major shl 10) or (minor))

public fun major(dev: DevT): CUint = ((dev) shr 10) and 0x3fu

public fun minor(dev: DevT): CUint = (dev) and 0x3ffu

public expect fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint, timeout: COpaquePointer?): CInt

// Network related functions are provided by libsocket and regex
// functions are provided by libregex.
// In QNX <=7.0, libregex functions were included in libc itself.
public expect fun semDestroy(sem: COpaquePointer?): CInt

public expect fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun mknodat(fd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt

public expect fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt

public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

public expect fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: COpaquePointer?): CInt

public expect fun nlLanginfo(item: NlItem): COpaquePointer?

public expect fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt

public expect fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt

public expect fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt

public expect fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt

public expect fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): COpaquePointer?

public expect fun clearenv(): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt

public expect fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun getifaddrs(ifap: COpaquePointer?): CInt

public expect fun freeifaddrs(ifa: COpaquePointer?)

public expect fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt

public expect fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT

public expect fun loginTty(fd: CInt): CInt

public expect fun uname(buf: COpaquePointer?): CInt

public expect fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): COpaquePointer?

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): COpaquePointer?

public expect fun setspent()

public expect fun endspent()

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun ftok(pathname: String?, projId: CInt): KeyT

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun mkostemp(template: COpaquePointer?, flags: CInt): CInt

public expect fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt

public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

public expect fun ifNameindex(): COpaquePointer?

public expect fun ifFreenameindex(ptr: COpaquePointer?)

public expect fun glob(pattern: String?, flags: CInt, errfunc: GlobTGlErrfuncCallback?, pglob: COpaquePointer?): CInt

public expect fun globfree(pglob: COpaquePointer?)

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT

public expect fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt

public expect fun getdomainname(name: COpaquePointer?, len: SizeT): CInt

public expect fun setdomainname(name: String?, len: SizeT): CInt

public expect fun sync()

public expect fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun umount(target: String?, flags: CInt): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt

public expect fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt

public expect fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun mount(specialDevice: String?, mountDirectory: String?, flags: CInt, mountType: String?, mountData: COpaquePointer?, mountDatalen: CInt): CInt

public expect fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt

public expect fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: COpaquePointer?): CInt

public expect fun pthreadSpinLock(lock: COpaquePointer?): CInt

public expect fun pthreadSpinTrylock(lock: COpaquePointer?): CInt

public expect fun pthreadSpinUnlock(lock: COpaquePointer?): CInt

public expect fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt

public expect fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt

public expect fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt

public expect fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt

public expect fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt

public expect fun pthreadBarrierWait(barrier: COpaquePointer?): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt

public expect fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt

public expect fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt

public expect fun sethostname(name: String?, len: SizeT): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt

public expect fun sigsuspend(mask: COpaquePointer?): CInt

public expect fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun semClose(sem: COpaquePointer?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun initgroups(user: String?, group: GidT): CInt

public expect fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer?

public expect fun getgrnam(name: String?): COpaquePointer?

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): COpaquePointer?

public expect fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt

public expect fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt

public expect fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robustness: COpaquePointer?): CInt

public expect fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt

public expect fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun getitimer(which: CInt, currValue: COpaquePointer?): CInt

public expect fun setitimer(which: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt

public expect fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnattrInit(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt

public expect fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun inotifyRmWatch(fd: CInt, wd: CInt): CInt

public expect fun inotifyInit(): CInt

public expect fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt

public expect fun gettid(): PidT

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt

public expect fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt

public expect fun mallopt(param: CInt, value: Long): CInt

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun ctermid(s: COpaquePointer?): COpaquePointer?

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun mallinfo(): Mallinfo

public expect fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, bufsize: CInt, result: COpaquePointer?): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: CInt): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt

public expect fun sysctl(arg0: COpaquePointer?, arg1: CUint, arg2: COpaquePointer?, arg3: COpaquePointer?, arg4: COpaquePointer?, arg5: SizeT): CInt

public expect fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun setrlimit(resource: CInt, rlp: COpaquePointer?): CInt

public expect fun lioListio(mode: CInt, list: COpaquePointer?, nent: CInt, sig: COpaquePointer?): CInt

public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt

public expect fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt

public expect fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt

public expect fun regexec(preg: COpaquePointer?, str: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT

public expect fun regfree(preg: COpaquePointer?)

public expect fun dirfd(dirp: DIR?): CInt

public expect fun dircntl(dir: DIR?, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt

public expect fun aioError(aiocbp: COpaquePointer?): CInt

public expect fun aioFsync(operation: CInt, aiocbp: COpaquePointer?): CInt

public expect fun aioRead(aiocbp: COpaquePointer?): CInt

public expect fun aioReturn(aiocpb: COpaquePointer?): SsizeT

public expect fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: COpaquePointer?): CInt

public expect fun aioWrite(aiocpb: COpaquePointer?): CInt

public expect fun mqClose(mqdes: MqdT): CInt

public expect fun mqGetattr(mqdes: MqdT, mqstat: COpaquePointer?): CInt

public expect fun mqNotify(mqdes: MqdT, notification: COpaquePointer?): CInt

public expect fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqReceive(mqdes: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT

public expect fun mqSend(mqdes: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqSetattr(mqdes: MqdT, mqstat: COpaquePointer?, omqstat: COpaquePointer?): CInt

public expect fun mqTimedreceive(mqdes: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT

public expect fun mqTimedsend(mqdes: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt

public expect fun mqUnlink(name: String?): CInt

public expect fun getErrnoPtr(): COpaquePointer?

// System page, see https://www.qnx.com/developers/docs/7.1#com.qnx.doc.neutrino.building/topic/syspage/syspageAbout.html
public expect var SYSPAGE_PTR: COpaquePointer?

// Function on the stack after a call to pthreadCreate().  This is used
// as a sentinel to work around an infitnite loop in the unwinding code.
public expect fun myThreadExit(valuePtr: COpaquePointer?)

// Models the implementation in stdlib.h.  Ctest will fail if trying to use the
// default symbol from libc
public fun atexit(cb: PthreadAtforkPrepareCallback): CInt {
    val DSO_HANDLE: COpaquePointer? = null

    fun cxaAtexit(cb1: PthreadAtforkPrepareCallback, arg: COpaquePointer?, dso: COpaquePointer?): CInt = 0
    return cxaAtexit(cb, null, DSO_HANDLE)
}
