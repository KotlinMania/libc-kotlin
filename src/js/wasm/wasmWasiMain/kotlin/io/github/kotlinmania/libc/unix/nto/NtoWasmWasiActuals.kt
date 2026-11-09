@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

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

private var _ffi_static_SYSPAGE_PTR: COpaquePointer? = null
public actual var SYSPAGE_PTR: COpaquePointer?
    get() = _ffi_static_SYSPAGE_PTR
    set(value) {
        _ffi_static_SYSPAGE_PTR = value
    }

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint): CInt =
    0

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint, timeout: COpaquePointer?): CInt =
    0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    0

public actual fun fdatasync(fd: CInt): CInt =
    0

public actual fun getpriority(which: CInt, who: IdT): CInt =
    0

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    0

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    0

public actual fun mknodat(fd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    0

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    0

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    0

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    0

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    null

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    0

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    0

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    0

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    0

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    0

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): COpaquePointer? =
    null

public actual fun clearenv(): CInt =
    0

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    0

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    0

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    0

public actual fun freeifaddrs(ifa: COpaquePointer?) {
}

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

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    0

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    0

public actual fun loginTty(fd: CInt): CInt =
    0

public actual fun uname(buf: COpaquePointer?): CInt =
    0

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
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

public actual fun setpwent() {
}

public actual fun endpwent() {
}

public actual fun getpwent(): COpaquePointer? =
    null

public actual fun setgrent() {
}

public actual fun endgrent() {
}

public actual fun getgrent(): COpaquePointer? =
    null

public actual fun setspent() {
}

public actual fun endspent() {
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    0

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    0u

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    0

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    0

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    0

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    0

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    0

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    0

public actual fun ifNameindex(): COpaquePointer? =
    null

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobTGlErrfuncCallback?, pglob: COpaquePointer?): CInt =
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

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    0

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    0L

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    0

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    0

public actual fun sync() {
}

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    0

public actual fun umount(target: String?, flags: CInt): CInt =
    0

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    0

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    0

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    0

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    0

public actual fun mount(specialDevice: String?, mountDirectory: String?, flags: CInt, mountType: String?, mountData: COpaquePointer?, mountDatalen: CInt): CInt =
    0

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    0

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    0

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    0

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    0

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    0

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    0

public actual fun schedGetscheduler(pid: PidT): CInt =
    0

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    0

public actual fun sethostname(name: String?, len: SizeT): CInt =
    0

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    0

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    0

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    0

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    0

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun semClose(sem: COpaquePointer?): CInt =
    0

public actual fun getdtablesize(): CInt =
    0

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun initgroups(user: String?, group: GidT): CInt =
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

public actual fun semUnlink(name: String?): CInt =
    0

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    0

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    0

public actual fun pthreadAtfork(prepare: FnCallback?, parent: FnCallback?, child: FnCallback?): CInt =
    0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    null

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robustness: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt =
    0

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    0

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    0

public actual fun setitimer(which: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt =
    0

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    0

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    0

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    0

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    0

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    0

public actual fun popen(command: String?, mode: String?): FILE? =
    null

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    0

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    0

public actual fun inotifyInit(): CInt =
    0

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    0

public actual fun gettid(): PidT =
    0

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    0

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    0

public actual fun mallopt(param: CInt, value: Long): CInt =
    0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    null

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, bufsize: CInt, result: COpaquePointer?): CInt =
    0

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: CInt): CInt =
    0

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    0

public actual fun sysctl(arg0: COpaquePointer?, arg1: CUint, arg2: COpaquePointer?, arg3: COpaquePointer?, arg4: COpaquePointer?, arg5: SizeT): CInt =
    0

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun setrlimit(resource: CInt, rlp: COpaquePointer?): CInt =
    0

public actual fun lioListio(mode: CInt, list: COpaquePointer?, nent: CInt, sig: COpaquePointer?): CInt =
    0

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    0

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    0

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    0

public actual fun regexec(preg: COpaquePointer?, str: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    0

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    0uL

public actual fun regfree(preg: COpaquePointer?) {
}

public actual fun dirfd(dirp: DIR?): CInt =
    0

public actual fun dircntl(dir: DIR?, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioFsync(operation: CInt, aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioReturn(aiocpb: COpaquePointer?): SsizeT =
    0L

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun aioWrite(aiocpb: COpaquePointer?): CInt =
    0

public actual fun mqClose(mqdes: MqdT): CInt =
    0

public actual fun mqGetattr(mqdes: MqdT, mqstat: COpaquePointer?): CInt =
    0

public actual fun mqNotify(mqdes: MqdT, notification: COpaquePointer?): CInt =
    0

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    0

public actual fun mqReceive(mqdes: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    0L

public actual fun mqSend(mqdes: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    0

public actual fun mqSetattr(mqdes: MqdT, mqstat: COpaquePointer?, omqstat: COpaquePointer?): CInt =
    0

public actual fun mqTimedreceive(mqdes: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    0L

public actual fun mqTimedsend(mqdes: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    0

public actual fun mqUnlink(name: String?): CInt =
    0

public actual fun getErrnoPtr(): COpaquePointer? =
    null

public actual fun myThreadExit(valuePtr: COpaquePointer?) {
}
