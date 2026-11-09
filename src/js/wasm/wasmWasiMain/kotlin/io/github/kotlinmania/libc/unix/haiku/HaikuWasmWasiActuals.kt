@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun getpriority(which: CInt, who: IdT): CInt =
    0

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    0

public actual fun endusershell() {
}

public actual fun getpass(prompt: String?): COpaquePointer? =
    null

public actual fun getusershell(): COpaquePointer? =
    null

public actual fun issetugid(): CInt =
    0

public actual fun setusershell() {
}

public actual fun utimensat(fd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun errnop(): COpaquePointer? =
    null

public actual fun abs(i: CInt): CInt =
    0

public actual fun labs(i: CLong): CLong =
    0L

public actual fun rand(): CInt =
    0

public actual fun srand(seed: CUint) {
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    0

public actual fun freeifaddrs(ifa: COpaquePointer?) {
}

public actual fun ppoll(fds: COpaquePointer?, numfds: NfdsT, timeout: COpaquePointer?, sigMask: COpaquePointer?): CInt =
    0

public actual fun getspent(): COpaquePointer? =
    null

public actual fun getspentR(pwd: COpaquePointer?, buf: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    0

public actual fun setspent() {
}

public actual fun endspent() {
}

public actual fun getspnam(name: String?): COpaquePointer? =
    null

public actual fun getspnamR(name: String?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    0

public actual fun sgetspent(line: String?): COpaquePointer? =
    null

public actual fun sgetspentR(line: String?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    0

public actual fun fgetspent(file: FILE?): COpaquePointer? =
    null

public actual fun fgetspentR(file: FILE?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    0

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    0

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    0

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    0

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, f: FnCallback, value: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    0

public actual fun valloc(numBytes: SizeT): COpaquePointer? =
    null

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    0uL

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    0

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    0

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    0

public actual fun dirfd(dirp: DIR?): CInt =
    0

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    0

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
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

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    0

public actual fun glob(pattern: String?, flags: CInt, errfunc: FnCallback1?, pglob: COpaquePointer?): CInt =
    0

public actual fun globfree(pglob: COpaquePointer?) {
}

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    0

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    0

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    0

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    0

public actual fun shmUnlink(name: String?): CInt =
    0

public actual fun seekdir(dirp: DIR?, loc: CLong) {
}

public actual fun telldir(dirp: DIR?): CLong =
    0L

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    0

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    0L

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    null

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    0

public actual fun accept4(socket: CInt, address: COpaquePointer?, addressLength: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun writev(fd: CInt, iov: COpaquePointer?, count: CInt): SsizeT =
    0L

public actual fun readv(fd: CInt, iov: COpaquePointer?, count: CInt): SsizeT =
    0L

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    0L

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    0L

public actual fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): CInt =
    0

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getgrouplist(user: String?, basegroup: GidT, grouplist: COpaquePointer?, groupcount: COpaquePointer?): CInt =
    0

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    0

public actual fun semClose(sem: COpaquePointer?): CInt =
    0

public actual fun getdtablesize(): CInt =
    0

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    0

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    null

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    0

public actual fun semUnlink(name: String?): CInt =
    0

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getpwent(): COpaquePointer? =
    null

public actual fun setpwent() {
}

public actual fun endpwent() {
}

public actual fun endgrent() {
}

public actual fun getgrent(): COpaquePointer? =
    null

public actual fun setgrent() {
}

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    0

public actual fun pthreadAtfork(prepare: FnCallback2?, parent: FnCallback2?, child: FnCallback2?): CInt =
    0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    null

public actual fun popen(command: String?, mode: String?): FILE? =
    null

public actual fun sethostname(name: String?, len: SizeT): CInt =
    0

public actual fun uname(buf: COpaquePointer?): CInt =
    0

public actual fun getutxent(): COpaquePointer? =
    null

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun setutxent() {
}

public actual fun endutxent() {
}

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    0

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    0

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    0

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    0

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    0

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    0

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    0

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    0uL

public actual fun regfree(preg: COpaquePointer?) {
}

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    0

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT =
    0L

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    0

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    0

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    0

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    0

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: FnCallback3?): COpaquePointer? =
    null

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: FnCallback3?): COpaquePointer? =
    null

public actual fun hcreate(nelt: SizeT): CInt =
    0

public actual fun hdestroy() {
}

public actual fun hsearch(entry: Entry, action: Action): COpaquePointer? =
    null

public actual fun drand48(): CDouble =
    0.0

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    0.0

public actual fun lrand48(): CLong =
    0L

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    0L

public actual fun mrand48(): CLong =
    0L

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    0L

public actual fun srand48(seed: CLong) {
}

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    null

public actual fun lcong48(p: COpaquePointer?) {
}

public actual fun clearenv(): CInt =
    0

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    null

public actual fun sync() {
}

public actual fun getpagesize(): CInt =
    0

public actual fun brk(addr: COpaquePointer?): CInt =
    0

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    null

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    0

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    0

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    0

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    0

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    0

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    0

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    0

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    0

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    0

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun memmem(source: COpaquePointer?, sourceLength: SizeT, search: COpaquePointer?, searchLength: SizeT): COpaquePointer? =
    null

public actual fun pthreadGetattrNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    0

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    0
