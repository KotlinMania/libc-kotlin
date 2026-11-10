@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.aix

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

public actual fun thrKill(id: ThreadT, sig: CInt): CInt =
    0

public actual fun thrSelf(): ThreadT =
    0u

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    0

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetinheritsched(attr: COpaquePointer?, inheritsched: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetschedpolicy(attr: COpaquePointer?, policy: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetscope(attr: COpaquePointer?, contentionscope: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    0

public actual fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt =
    0

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    0

public actual fun pthreadAttrSetscope(attr: COpaquePointer?, contentionscope: CInt): CInt =
    0

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    0

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    0

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    0

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    0

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    0

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    0

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    0

public actual fun pthreadCancel(thread: PthreadT): CInt =
    0

public actual fun pthreadCleanupPop(execute: CInt) {
}

public actual fun pthreadCleanupPush(routine: PthreadCleanupPushRoutineCallback?, arg: COpaquePointer?) {
}

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    0

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    0

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt =
    0

public actual fun pthreadGetconcurrency(): CInt =
    0

public actual fun pthreadGetcpuclockid(threadId: PthreadT, clockId: COpaquePointer?): CInt =
    0

public actual fun pthreadGetschedparam(thread: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    0

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    0

public actual fun pthreadMutexattrGetprioceiling(attr: COpaquePointer?, prioceiling: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robust: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrGettype(attr: COpaquePointer?, type: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrSetprioceiling(attr: COpaquePointer?, prioceiling: CInt): CInt =
    0

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    0

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    0

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robust: CInt): CInt =
    0

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexGetprioceiling(mutex: COpaquePointer?, prioceiling: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexSetprioceiling(mutex: COpaquePointer?, prioceiling: CInt, oldCeiling: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexTimedlock(mutex: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun pthreadOnce(onceControl: COpaquePointer?, initRoutine: PthreadAtforkPrepareCallback?): CInt =
    0

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    0

public actual fun pthreadRwlockTimedrdlock(rwlock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockTimedwrlock(rwlock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun pthreadSetcancelstate(state: CInt, oldstate: COpaquePointer?): CInt =
    0

public actual fun pthreadSetcanceltype(type: CInt, oldtype: COpaquePointer?): CInt =
    0

public actual fun pthreadSetconcurrency(newLevel: CInt): CInt =
    0

public actual fun pthreadSetschedparam(thread: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    0

public actual fun pthreadSetschedprio(thread: PthreadT, prio: CInt): CInt =
    0

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oset: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    0

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadTestcancel() {
}

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    0uL

public actual fun iconvClose(cd: IconvT): CInt =
    0

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    null

public actual fun acct(filename: COpaquePointer?): CInt =
    0

public actual fun aioCancel(fildes: CInt, aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    0L

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    0

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    null

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    0

public actual fun brk(addr: COpaquePointer?): CInt =
    0

public actual fun clearenv(): CInt =
    0

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    0

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    0

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun creat64(path: String?, mode: ModeT): CInt =
    0

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    null

public actual fun dirfd(dirp: DIR?): CInt =
    0

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    null

public actual fun drand48(): CDouble =
    0.0

public actual fun duplocale(arg1: LocaleT): LocaleT =
    null

public actual fun endgrent() {
}

public actual fun endmntent(streamp: FILE?): CInt =
    0

public actual fun endpwent() {
}

public actual fun endutent() {
}

public actual fun endutxent() {
}

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    0.0

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    0

public actual fun fattach(fildes: CInt, path: String?): CInt =
    0

public actual fun fdatasync(fd: CInt): CInt =
    0

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun ffs(value: CInt): CInt =
    0

public actual fun ffsl(value: CLong): CInt =
    0

public actual fun ffsll(value: CLonglong): CInt =
    0

public actual fun fgetgrent(file: FILE?): COpaquePointer? =
    null

public actual fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    0

public actual fun fgetpwent(file: FILE?): COpaquePointer? =
    null

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    null

public actual fun freelocale(loc: LocaleT) {
}

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    null

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    0

public actual fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    0

public actual fun fstat64(fildes: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun fstatfs64(fd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun fstatvfs64(fd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun ftello64(stream: FILE?): Off64T =
    0L

public actual fun ftok(path: String?, id: CInt): KeyT =
    0

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    0

public actual fun getcontext(ucp: COpaquePointer?): CInt =
    0

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    0

public actual fun getdtablesize(): CInt =
    0

public actual fun getgrent(): COpaquePointer? =
    null

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    null

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getgrnam(name: String?): COpaquePointer? =
    null

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getgrset(user: String?): COpaquePointer? =
    null

public actual fun gethostid(): CLong =
    0L

public actual fun getmntent(stream: FILE?): COpaquePointer? =
    null

public actual fun getnameinfo(sa: COpaquePointer?, salen: SizeT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    0

public actual fun getpagesize(): CInt =
    0

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    0

public actual fun getpriority(which: CInt, who: IdT): CInt =
    0

public actual fun getpwent(): COpaquePointer? =
    null

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun getrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    0

public actual fun getutent(): COpaquePointer? =
    null

public actual fun getutid(u: COpaquePointer?): COpaquePointer? =
    null

public actual fun getutline(u: COpaquePointer?): COpaquePointer? =
    null

public actual fun getutxent(): COpaquePointer? =
    null

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    0

public actual fun globfree(pglob: COpaquePointer?) {
}

public actual fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer? =
    null

public actual fun hcreate(nelt: SizeT): CInt =
    0

public actual fun hdestroy() {
}

public actual fun hsearch(entry: Entry, action: Action): COpaquePointer? =
    null

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
}

public actual fun ifNameindex(): COpaquePointer? =
    null

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    0

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    0L

public actual fun lcong48(p: COpaquePointer?) {
}

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LfindComparCallback?): COpaquePointer? =
    null

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nent: CInt, sevp: COpaquePointer?): CInt =
    0

public actual fun loadquery(flags: CInt, buf: COpaquePointer?, buflen: CUint, vararg variadicArgs: Long): CInt =
    0

public actual fun lparGetInfo(command: CInt, buf: COpaquePointer?, bufsize: SizeT): CInt =
    0

public actual fun lparSetResources(id: CInt, resource: COpaquePointer?): CInt =
    0

public actual fun lrand48(): CLong =
    0L

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LfindComparCallback?): COpaquePointer? =
    null

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    0L

public actual fun lstat64(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun madvise(addr: CaddrT, len: SizeT, advice: CInt): CInt =
    0

public actual fun makecontext(ucp: COpaquePointer?, func: PthreadAtforkPrepareCallback, argc: CInt, vararg variadicArgs: Long) {
}

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallopt(param: CInt, value: CInt): CInt =
    0

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    null

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    0

public actual fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt =
    0

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    0

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    0

public actual fun mount(device: String?, path: String?, flags: CInt): CInt =
    0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    0

public actual fun mqClose(mqd: MqdT): CInt =
    0

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    0

public actual fun mqNotify(mqd: MqdT, notification: COpaquePointer?): CInt =
    0

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    0

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    0L

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    0

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    0

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    0L

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    0

public actual fun mqUnlink(name: String?): CInt =
    0

public actual fun mrand48(): CLong =
    0L

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    0

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    0L

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    0

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    null

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    null

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): COpaquePointer? =
    null

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    0L

public actual fun open64(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun pollsetCreate(maxfd: CInt): PollsetT =
    0

public actual fun pollsetCtl(ps: PollsetT, pollctlArray: COpaquePointer?, arrayLength: CInt): CInt =
    0

public actual fun pollsetDestroy(ps: PollsetT): CInt =
    0

public actual fun pollsetPoll(ps: PollsetT, polldataArray: COpaquePointer?, arrayLength: CInt, timeout: CInt): CInt =
    0

public actual fun pollsetQuery(ps: PollsetT, pollfdQuery: COpaquePointer?): CInt =
    0

public actual fun popen(command: String?, mode: String?): FILE? =
    null

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    0

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    0

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    0

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    0

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    0

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    0

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    0

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    0

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    0

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    0

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    0L

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffsetT): SsizeT =
    0L

public actual fun ptrace64(request: CInt, id: CLonglong, addr: CLonglong, data: CInt, buff: COpaquePointer?): CInt =
    0

public actual fun pututline(u: COpaquePointer?): COpaquePointer? =
    null

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    0L

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffsetT): SsizeT =
    0L

public actual fun quotactl(cmd: COpaquePointer?, special: CInt, id: CInt, data: CaddrT): CInt =
    0

public actual fun rand(): CInt =
    0

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    0L

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun recvmsg(sockfd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    0L

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    0

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    0uL

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    0

public actual fun regfree(preg: COpaquePointer?) {
}

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    null

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    0

public actual fun schedGetscheduler(pid: PidT): CInt =
    0

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    0

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    0

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    0

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    0

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    0

public actual fun sctpOptInfo(sd: CInt, id: SctpAssocT, opt: CInt, argSize: COpaquePointer?, size: COpaquePointer?): CInt =
    0

public actual fun sctpPeeloff(s: CInt, id: COpaquePointer?): CInt =
    0

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    null

public actual fun seekdir(dirp: DIR?, loc: CLong) {
}

public actual fun semClose(sem: COpaquePointer?): CInt =
    0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    0

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    0

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun semUnlink(name: String?): CInt =
    0

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    0

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    0

public actual fun sendFile(socket: COpaquePointer?, iobuf: COpaquePointer?, flags: CUint): SsizeT =
    0L

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    0

public actual fun sendmsg(sockfd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    0L

public actual fun setcontext(ucp: COpaquePointer?): CInt =
    0

public actual fun setdomainname(name: String?, len: CInt): CInt =
    0

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    0

public actual fun setgrent() {
}

public actual fun sethostid(hostid: CInt): CInt =
    0

public actual fun sethostname(name: String?, len: CInt): CInt =
    0

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    null

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    0

public actual fun setpwent() {
}

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun setrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    0

public actual fun setutent() {
}

public actual fun setutxent() {
}

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    0

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    0

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    0

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    0

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    null

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    0

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    0

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    0

public actual fun shmUnlink(name: String?): CInt =
    0

public actual fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt =
    0

public actual fun srand(seed: CUint) {
}

public actual fun srand48(seed: CLong) {
}

public actual fun stat64(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun stat64at(dirfd: CInt, path: String?, buf: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun statfs64(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun statvfs64(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun statx(path: String?, buf: COpaquePointer?, length: CInt, command: CInt): CInt =
    0

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: COpaquePointer?): SizeT =
    0uL

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    0

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    null

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    null

public actual fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt =
    0

public actual fun swapoff(path: String?): CInt =
    0

public actual fun swapon(path: String?): CInt =
    0

public actual fun sync() {
}

public actual fun telldir(dirp: DIR?): CLong =
    0L

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    0

public actual fun timerDelete(timerid: TimerT): CInt =
    0

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    0

public actual fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt =
    0

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    0

public actual fun truncate64(path: String?, length: Off64T): CInt =
    0

public actual fun uname(buf: COpaquePointer?): CInt =
    0

public actual fun updwtmp(file: String?, u: COpaquePointer?) {
}

public actual fun uselocale(loc: LocaleT): LocaleT =
    null

public actual fun utmpname(file: String?): CInt =
    0

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    0

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    0

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    0

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun errno(): COpaquePointer? =
    null
