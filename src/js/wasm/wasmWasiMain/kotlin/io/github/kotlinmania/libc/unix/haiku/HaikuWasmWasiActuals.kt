@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
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
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endusershell(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpass(prompt: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getusershell(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun issetugid(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setusershell(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun utimensat(fd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun errnop(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun srand(seed: CUint): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freeifaddrs(ifa: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ppoll(fds: COpaquePointer?, numfds: NfdsT, timeout: COpaquePointer?, sigMask: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getspent(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getspentR(pwd: COpaquePointer?, buf: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setspent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endspent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getspnam(name: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getspnamR(name: String?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sgetspent(line: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sgetspentR(line: String?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgetspent(file: FILE?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgetspentR(file: FILE?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun valloc(numBytes: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globfree(pglob: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seekdir(dirp: DIR?, loc: CLong): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun accept4(socket: CInt, address: COpaquePointer?, addressLength: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun writev(fd: CInt, iov: COpaquePointer?, count: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readv(fd: CInt, iov: COpaquePointer?, count: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getgrouplist(user: String?, basegroup: GidT, grouplist: COpaquePointer?, groupcount: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semClose(sem: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getgrnam(name: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpwent(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setpwent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endpwent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endgrent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getgrent(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setgrent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sethostname(name: String?, len: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uname(buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getutxent(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setutxent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endutxent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regfree(preg: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hcreate(nelt: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hdestroy(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hsearch(entry: Entry, action: Action): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drand48(): CDouble =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lrand48(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrand48(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun srand48(seed: CLong): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lcong48(p: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sync(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpagesize(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun brk(addr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memmem(source: COpaquePointer?, sourceLength: SizeT, search: COpaquePointer?, searchLength: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadGetattrNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
