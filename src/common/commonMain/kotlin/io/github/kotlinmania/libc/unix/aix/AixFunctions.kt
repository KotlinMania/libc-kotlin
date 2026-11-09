package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.aix.powerpc64.FdSet

public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? {
    return if ((mhdr!!.msgControllen).toInt() >= 8) {
        null
    } else {
        null
    }
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    return if ((cmsg == null)) {
        cmsgFirsthdr(mhdr)
    } else {
        if ((((cmsg)?.hashCode()?.toLong() ?: 0L).toInt() + (cmsg!!.cmsgLen).toInt() + 8) > (((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + (mhdr!!.msgControllen).toInt())) {
            null
        } else {
            // AIX does not have any alignment/padding for ancillary data, so we don't need _CMSG_ALIGN here.
            null
        }
    }
}

public fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? {
    return (((cmsg)?.let { COpaquePointer(it.hashCode().toLong()) }))?.let { COpaquePointer(it.rawValue + (8.toInt()).toLong()) }
}

public fun cmsgLen(length: CUint): CUint {
    return 8.toUInt() + length
}

public fun cmsgSpace(length: CUint): CUint {
    return 8.toUInt() + length
}

public fun fdZero(set: FdSet?) {
    for (idx in (set!!.fdsBits).indices) {
        (set!!.fdsBits)[idx] = 0L
    }
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val bits = 8 * 8
    val fd1 = fd.toInt()
    set!!.fdsBits[fd1 / bits] = set!!.fdsBits[fd1 / bits] or (1L shl (fd1 % bits))
    return
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

public fun wifstopped(status: CInt): Boolean {
    return (status and W_STOPPED) != 0
}

public fun wstopsig(status: CInt): CInt {
    return if (wifstopped(status)) {
        (((status.toUInt()) shr 8) and 0xffu).toInt()
    } else {
        -1
    }
}

public fun wifexited(status: CInt): Boolean {
    return (status and 0xFF) == 0
}

public fun wexitstatus(status: CInt): CInt {
    return if (wifexited(status)) {
        (((status.toUInt()) shr 8) and 0xffu).toInt()
    } else {
        -1
    }
}

public fun wifsignaled(status: CInt): Boolean {
    return !wifexited(status) && !wifstopped(status)
}

public fun wtermsig(status: CInt): CInt {
    return if (wifsignaled(status)) {
        (((status.toUInt()) shr 16) and 0xffu).toInt()
    } else {
        -1
    }
}

public fun wifcontinued(status: CInt): Boolean {
    return (status and WCONTINUED) != 0
}

public fun wcoredump(status: CInt): Boolean {
    return false
}

public fun major(dev: DevT): CUint {
    val x = dev shr 16
    return x.toUInt()
}

public fun minor(dev: DevT): CUint {
    val y = dev and 0xFFFFuL
    return y.toUInt()
}

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major.toULong()
    val minor1 = minor.toULong()
    var dev = 0uL
    dev = dev or (major1 shl 16)
    dev = dev or minor1
    return dev
}

public expect fun thrKill(id: ThreadT, sig: CInt): CInt

public expect fun thrSelf(): ThreadT

public expect fun pthreadAtfork(prepare: FnCallback?, parent: FnCallback?, child: FnCallback?): CInt

public expect fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt

public expect fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt

public expect fun pthreadAttrGetinheritsched(attr: COpaquePointer?, inheritsched: COpaquePointer?): CInt

public expect fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt

public expect fun pthreadAttrGetschedpolicy(attr: COpaquePointer?, policy: COpaquePointer?): CInt

public expect fun pthreadAttrGetscope(attr: COpaquePointer?, contentionscope: COpaquePointer?): CInt

public expect fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt

public expect fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt

public expect fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt

public expect fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt

public expect fun pthreadAttrSetscope(attr: COpaquePointer?, contentionscope: CInt): CInt

public expect fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt

public expect fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt

public expect fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt

public expect fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt

public expect fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt

public expect fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt

public expect fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt

public expect fun pthreadBarrierWait(barrier: COpaquePointer?): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadCleanupPop(execute: CInt)

public expect fun pthreadCleanupPush(routine: FnCallback1?, arg: COpaquePointer?)

public expect fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt

public expect fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt

public expect fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: FnCallback2, arg: COpaquePointer?): CInt

public expect fun pthreadGetconcurrency(): CInt

public expect fun pthreadGetcpuclockid(threadId: PthreadT, clockId: COpaquePointer?): CInt

public expect fun pthreadGetschedparam(thread: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun pthreadMutexattrGetprioceiling(attr: COpaquePointer?, prioceiling: COpaquePointer?): CInt

public expect fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: COpaquePointer?): CInt

public expect fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt

public expect fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robust: COpaquePointer?): CInt

public expect fun pthreadMutexattrGettype(attr: COpaquePointer?, type: COpaquePointer?): CInt

public expect fun pthreadMutexattrSetprioceiling(attr: COpaquePointer?, prioceiling: CInt): CInt

public expect fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robust: CInt): CInt

public expect fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt

public expect fun pthreadMutexGetprioceiling(mutex: COpaquePointer?, prioceiling: COpaquePointer?): CInt

public expect fun pthreadMutexSetprioceiling(mutex: COpaquePointer?, prioceiling: CInt, oldCeiling: COpaquePointer?): CInt

public expect fun pthreadMutexTimedlock(mutex: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun pthreadOnce(onceControl: COpaquePointer?, initRoutine: FnCallback?): CInt

public expect fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt

public expect fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadRwlockTimedrdlock(rwlock: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun pthreadRwlockTimedwrlock(rwlock: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun pthreadSetcancelstate(state: CInt, oldstate: COpaquePointer?): CInt

public expect fun pthreadSetcanceltype(type: CInt, oldtype: COpaquePointer?): CInt

public expect fun pthreadSetconcurrency(newLevel: CInt): CInt

public expect fun pthreadSetschedparam(thread: PthreadT, policy: CInt, param: COpaquePointer?): CInt

public expect fun pthreadSetschedprio(thread: PthreadT, prio: CInt): CInt

public expect fun pthreadSigmask(how: CInt, set: COpaquePointer?, oset: COpaquePointer?): CInt

public expect fun pthreadSpinDestroy(lock: COpaquePointer?): CInt

public expect fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadSpinLock(lock: COpaquePointer?): CInt

public expect fun pthreadSpinTrylock(lock: COpaquePointer?): CInt

public expect fun pthreadSpinUnlock(lock: COpaquePointer?): CInt

public expect fun pthreadTestcancel()

public expect fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT

public expect fun iconvClose(cd: IconvT): CInt

public expect fun iconvOpen(tocode: String?, fromcode: String?): IconvT

public expect fun acct(filename: COpaquePointer?): CInt

public expect fun aioCancel(fildes: CInt, aiocbp: COpaquePointer?): CInt

public expect fun aioError(aiocbp: COpaquePointer?): CInt

public expect fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt

public expect fun aioRead(aiocbp: COpaquePointer?): CInt

public expect fun aioReturn(aiocbp: COpaquePointer?): SsizeT

public expect fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: COpaquePointer?): CInt

public expect fun aioWrite(aiocbp: COpaquePointer?): CInt

public expect fun basename(path: COpaquePointer?): COpaquePointer?

public expect fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt

public expect fun brk(addr: COpaquePointer?): CInt

public expect fun clearenv(): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt

public expect fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt

public expect fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt

public expect fun creat64(path: String?, mode: ModeT): CInt

public expect fun ctermid(s: COpaquePointer?): COpaquePointer?

public expect fun dirfd(dirp: DIR?): CInt

public expect fun dirname(path: COpaquePointer?): COpaquePointer?

public expect fun drand48(): CDouble

public expect fun duplocale(arg1: LocaleT): LocaleT

public expect fun endgrent()

public expect fun endmntent(streamp: FILE?): CInt

public expect fun endpwent()

public expect fun endutent()

public expect fun endutxent()

public expect fun erand48(xseed: COpaquePointer?): CDouble

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun fattach(fildes: CInt, path: String?): CInt

public expect fun fdatasync(fd: CInt): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun ffs(value: CInt): CInt

public expect fun ffsl(value: CLong): CInt

public expect fun ffsll(value: CLonglong): CInt

public expect fun fgetgrent(file: FILE?): COpaquePointer?

public expect fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt

public expect fun fgetpwent(file: FILE?): COpaquePointer?

public expect fun fopen64(filename: String?, mode: String?): FILE?

public expect fun freelocale(loc: LocaleT)

public expect fun freopen64(filename: String?, mode: String?, file: FILE?): FILE?

public expect fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt

public expect fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt

public expect fun fstat64(fildes: CInt, buf: COpaquePointer?): CInt

public expect fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt

public expect fun fstatfs64(fd: CInt, buf: COpaquePointer?): CInt

public expect fun fstatvfs64(fd: CInt, buf: COpaquePointer?): CInt

public expect fun ftello64(stream: FILE?): Off64T

public expect fun ftok(path: String?, id: CInt): KeyT

public expect fun ftruncate64(fd: CInt, length: Off64T): CInt

public expect fun futimens(fd: CInt, times: COpaquePointer?): CInt

public expect fun getcontext(ucp: COpaquePointer?): CInt

public expect fun getdomainname(name: COpaquePointer?, len: CInt): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrent(): COpaquePointer?

public expect fun getgrgid(gid: GidT): COpaquePointer?

public expect fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrnam(name: String?): COpaquePointer?

public expect fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrset(user: String?): COpaquePointer?

public expect fun gethostid(): CLong

public expect fun getmntent(stream: FILE?): COpaquePointer?

public expect fun getnameinfo(sa: COpaquePointer?, salen: SizeT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt

public expect fun getpagesize(): CInt

public expect fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun getpwent(): COpaquePointer?

public expect fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun getrlimit64(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun getitimer(which: CInt, currValue: COpaquePointer?): CInt

public expect fun getutent(): COpaquePointer?

public expect fun getutid(u: COpaquePointer?): COpaquePointer?

public expect fun getutline(u: COpaquePointer?): COpaquePointer?

public expect fun getutxent(): COpaquePointer?

public expect fun getutxid(ut: COpaquePointer?): COpaquePointer?

public expect fun getutxline(ut: COpaquePointer?): COpaquePointer?

public expect fun glob(pattern: String?, flags: CInt, errfunc: FnCallback3?, pglob: COpaquePointer?): CInt

public expect fun globfree(pglob: COpaquePointer?)

public expect fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer?

public expect fun hcreate(nelt: SizeT): CInt

public expect fun hdestroy()

public expect fun hsearch(entry: Entry, action: Action): COpaquePointer?

public expect fun ifFreenameindex(ptr: COpaquePointer?)

public expect fun ifNameindex(): COpaquePointer?

public expect fun initgroups(name: String?, basegid: GidT): CInt

public expect fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun jrand48(xseed: COpaquePointer?): CLong

public expect fun lcong48(p: COpaquePointer?)

public expect fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: FnCallback4?): COpaquePointer?

public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nent: CInt, sevp: COpaquePointer?): CInt

public expect fun loadquery(flags: CInt, buf: COpaquePointer?, buflen: CUint, vararg variadicArgs: Long): CInt

public expect fun lparGetInfo(command: CInt, buf: COpaquePointer?, bufsize: SizeT): CInt

public expect fun lparSetResources(id: CInt, resource: COpaquePointer?): CInt

public expect fun lrand48(): CLong

public expect fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: FnCallback4?): COpaquePointer?

public expect fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T

public expect fun lstat64(path: String?, buf: COpaquePointer?): CInt

public expect fun madvise(addr: CaddrT, len: SizeT, advice: CInt): CInt

public expect fun makecontext(ucp: COpaquePointer?, func: FnCallback, argc: CInt, vararg variadicArgs: Long)

public expect fun mallinfo(): Mallinfo

public expect fun mallopt(param: CInt, value: CInt): CInt

public expect fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer?

public expect fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt

public expect fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun mount(device: String?, path: String?, flags: CInt): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt

public expect fun mqNotify(mqd: MqdT, notification: COpaquePointer?): CInt

public expect fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT

public expect fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt

public expect fun mqUnlink(name: String?): CInt

public expect fun mrand48(): CLong

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun nlLanginfo(item: NlItem): COpaquePointer?

public expect fun nlLanginfoL(item: NlItem, loc: LocaleT): COpaquePointer?

public expect fun nrand48(xseed: COpaquePointer?): CLong

public expect fun open64(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun pollsetCreate(maxfd: CInt): PollsetT

public expect fun pollsetCtl(ps: PollsetT, pollctlArray: COpaquePointer?, arrayLength: CInt): CInt

public expect fun pollsetDestroy(ps: PollsetT): CInt

public expect fun pollsetPoll(ps: PollsetT, polldataArray: COpaquePointer?, arrayLength: CInt, timeout: CInt): CInt

public expect fun pollsetQuery(ps: PollsetT, pollfdQuery: COpaquePointer?): CInt

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt

public expect fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt

public expect fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrInit(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt

public expect fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt

public expect fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt

public expect fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT

public expect fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffsetT): SsizeT

public expect fun ptrace64(request: CInt, id: CLonglong, addr: CLonglong, data: CInt, buff: COpaquePointer?): CInt

public expect fun pututline(u: COpaquePointer?): COpaquePointer?

public expect fun pututxline(ut: COpaquePointer?): COpaquePointer?

public expect fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT

public expect fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffsetT): SsizeT

public expect fun quotactl(cmd: COpaquePointer?, special: CInt, id: CInt, data: CaddrT): CInt

public expect fun rand(): CInt

public expect fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

// AIX header socket.h maps recvfrom() to nrecvfrom()
public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT

public expect fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt

// AIX header socket.h maps recvmsg() to nrecvmsg().
public expect fun recvmsg(sockfd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT

public expect fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt

public expect fun regfree(preg: COpaquePointer?)

public expect fun sbrk(increment: IntptrT): COpaquePointer?

public expect fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt

public expect fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt

public expect fun sctpOptInfo(sd: CInt, id: SctpAssocT, opt: CInt, argSize: COpaquePointer?, size: COpaquePointer?): CInt

public expect fun sctpPeeloff(s: CInt, id: COpaquePointer?): CInt

public expect fun seed48(xseed: COpaquePointer?): COpaquePointer?

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun semClose(sem: COpaquePointer?): CInt

public expect fun semDestroy(sem: COpaquePointer?): CInt

public expect fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt

public expect fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer?

public expect fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt

public expect fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt

public expect fun sendFile(socket: COpaquePointer?, iobuf: COpaquePointer?, flags: CUint): SsizeT

public expect fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt

// AIX header socket.h maps sendmsg() to nsendmsg().
public expect fun sendmsg(sockfd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun setcontext(ucp: COpaquePointer?): CInt

public expect fun setdomainname(name: String?, len: CInt): CInt

public expect fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt

public expect fun setgrent()

public expect fun sethostid(hostid: CInt): CInt

public expect fun sethostname(name: String?, len: CInt): CInt

public expect fun setmntent(filename: String?, ty: String?): FILE?

public expect fun setpriority(which: CInt, who: IdT, priority: CInt): CInt

public expect fun setpwent()

public expect fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun setrlimit64(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt

public expect fun setutent()

public expect fun setutxent()

public expect fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt

public expect fun sigsuspend(mask: COpaquePointer?): CInt

public expect fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt

public expect fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt

public expect fun srand(seed: CUint)

public expect fun srand48(seed: CLong)

public expect fun stat64(path: String?, buf: COpaquePointer?): CInt

public expect fun stat64at(dirfd: CInt, path: String?, buf: COpaquePointer?, flags: CInt): CInt

public expect fun statfs(path: String?, buf: COpaquePointer?): CInt

public expect fun statfs64(path: String?, buf: COpaquePointer?): CInt

public expect fun statvfs64(path: String?, buf: COpaquePointer?): CInt

public expect fun statx(path: String?, buf: COpaquePointer?, length: CInt, command: CInt): CInt

public expect fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: COpaquePointer?): SizeT

public expect fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt

public expect fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer?

public expect fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer?

public expect fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt

public expect fun swapoff(path: String?): CInt

public expect fun swapon(path: String?): CInt

public expect fun sync()

public expect fun telldir(dirp: DIR?): CLong

public expect fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt

public expect fun truncate64(path: String?, length: Off64T): CInt

public expect fun uname(buf: COpaquePointer?): CInt

public expect fun updwtmp(file: String?, u: COpaquePointer?)

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun utmpname(file: String?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt

public expect fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt

public expect fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

// Use AIX thread-safe version errno.
public expect fun errno(): COpaquePointer?
