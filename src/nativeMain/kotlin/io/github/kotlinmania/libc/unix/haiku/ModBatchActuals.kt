// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires manual FFI bridge — not yet implemented")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires manual FFI bridge — not yet implemented")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires manual FFI bridge — not yet implemented")

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR requires manual FFI bridge — not yet implemented")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires manual FFI bridge — not yet implemented")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET requires manual FFI bridge — not yet implemented")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO requires manual FFI bridge — not yet implemented")
}

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt {
    if (rlim == null) return -1
    val rlimPtr: CPointer<ByteVar>? = rlim.handle.toCPointer()
    val result = libc_getrlimit(resource, rlimPtr)
    return result
}

public actual fun setrlimit(resource: CInt, rlp: Rlimit?): CInt {
    if (rlp == null) return -1
    val rlpPtr: CPointer<ByteVar>? = rlp.handle.toCPointer()
    val result = libc_setrlimit(resource, rlpPtr)
    return result
}

public actual fun getpriority(which: CInt, who: IdT): CInt {
    val result = libc_getpriority(which, who.toInt())
    return result
}

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt {
    val result = libc_setpriority(which, who.toInt(), prio)
    return result
}

public actual fun endusershell() {
    throw UnsupportedOperationException("endusershell requires manual FFI bridge — not yet implemented")
}

public actual fun getpass(prompt: String?): String? =
    throw UnsupportedOperationException("getpass requires manual FFI bridge — not yet implemented")

public actual fun getusershell(): String? =
    throw UnsupportedOperationException("getusershell requires manual FFI bridge — not yet implemented")

public actual fun issetugid(): CInt =
    libc.cinterop.libc_issetugid()
public actual fun setusershell() {
    throw UnsupportedOperationException("setusershell requires manual FFI bridge — not yet implemented")
}

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc_utimensat(dirfd, path, timesPtr, flag)
    return result
}

public actual fun futimens(fd: CInt, times: Timespec?): CInt {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc_futimens(fd, timesPtr)
    return result
}

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt {
    val result = libc_strerror_r(errnum, buf, buflen)
    return result
}

public actual fun errnop(): CInt? =
    throw UnsupportedOperationException("errnop requires manual FFI bridge — not yet implemented")

public actual fun abs(i: CInt): CInt =
    libc.cinterop.libc_abs(i)
public actual fun labs(i: CLong): CLong =
    libc.cinterop.libc_labs(i)
public actual fun rand(): CInt =
    libc.cinterop.libc_rand()
public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires manual FFI bridge — not yet implemented")
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getifaddrs requires manual FFI bridge — not yet implemented")

public actual fun freeifaddrs(ifa: Ifaddrs?) {
    throw UnsupportedOperationException("freeifaddrs requires manual FFI bridge — not yet implemented")
}

public actual fun ppoll(fds: Pollfd?, numfds: NfdsT, timeout: Timespec?, sigMask: SigsetT?): CInt =
    throw UnsupportedOperationException("ppoll requires manual FFI bridge — not yet implemented")

public actual fun getspent(): Spwd? =
    throw UnsupportedOperationException("getspent requires manual FFI bridge — not yet implemented")

public actual fun getspentR(pwd: Spwd?, buf: String?, bufferSize: ULong, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getspentR requires manual FFI bridge — not yet implemented")

public actual fun setspent() {
    throw UnsupportedOperationException("setspent requires manual FFI bridge — not yet implemented")
}

public actual fun endspent() {
    throw UnsupportedOperationException("endspent requires manual FFI bridge — not yet implemented")
}

public actual fun getspnam(name: String?): Spwd? =
    throw UnsupportedOperationException("getspnam requires manual FFI bridge — not yet implemented")

public actual fun getspnamR(name: String?, spwd: Spwd?, buffer: String?, bufferSize: ULong, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getspnamR requires manual FFI bridge — not yet implemented")

public actual fun sgetspent(line: String?): Spwd? =
    throw UnsupportedOperationException("sgetspent requires manual FFI bridge — not yet implemented")

public actual fun sgetspentR(line: String?, spwd: Spwd?, buffer: String?, bufferSize: ULong, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("sgetspentR requires manual FFI bridge — not yet implemented")

public actual fun fgetspent(file: FILE?): Spwd? =
    throw UnsupportedOperationException("fgetspent requires manual FFI bridge — not yet implemented")

public actual fun fgetspentR(file: FILE?, spwd: Spwd?, buffer: String?, bufferSize: ULong, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fgetspentR requires manual FFI bridge — not yet implemented")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt {
    val result = libc_mkfifoat(dirfd, pathname, mode.toInt())
    return result
}
public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt {
    val result = libc_mknodat(dirfd, pathname, mode.toInt(), dev.toInt())
    return result
}

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy requires manual FFI bridge — not yet implemented")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit requires manual FFI bridge — not yet implemented")

public actual fun clockGetres(clockId: ClockidT, res: Timespec?): CInt {
    if (res == null) return -1
    val resPtr: CPointer<ByteVar>? = res.handle.toCPointer()
    val result = libc_clock_getres(clockId, resPtr)
    return result
}

public actual fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    val result = libc_clock_gettime(clockId, tpPtr)
    return result
}

public actual fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    val result = libc_clock_settime(clockId, tpPtr)
    return result
}

public actual fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun valloc(numBytes: ULong): COpaquePointer? =
    throw UnsupportedOperationException("valloc requires manual FFI bridge — not yet implemented")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires manual FFI bridge — not yet implemented")

public actual fun memalign(blockSize: ULong, sizeArg: ULong): COpaquePointer? {
    val result = libc_memalign(blockSize, sizeArg)
    return if (result != null) COpaquePointer(result.toLong()) else null
}

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups requires manual FFI bridge — not yet implemented")

public actual fun initgroups(user: String?, group: GidT): CInt {
    val result = libc_initgroups(user, group.toInt())
    return result
}
public actual fun ioctl(fd: CInt, request: CULong, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    libc.cinterop.libc_mprotect(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, prot)
public actual fun dirfd(dirp: DIR?): CInt =
    libc.cinterop.libc_dirfd(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires manual FFI bridge — not yet implemented")


public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadSpinInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinUnlock requires manual FFI bridge — not yet implemented")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid requires manual FFI bridge — not yet implemented")

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree requires manual FFI bridge — not yet implemented")
}

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.value.toCPointer()
    val result = libc_gettimeofday(tpPtr, tzPtr)
    return result
}

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt {
    if (addr == null) return -1
    val addrPtr: CPointer<ByteVar>? = addr.value.toCPointer()
    val result = libc_posix_madvise(addrPtr, len, advice)
    return result
}

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise requires manual FFI bridge — not yet implemented")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt {
    val result = libc_posix_fallocate(fd, offset, len)
    return result
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt {
    val result = libc_shm_open(name, oflag, mode.toInt())
    return result
}

public actual fun shmUnlink(name: String?): CInt {
    val result = libc_shm_unlink(name)
    return result
}

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir requires manual FFI bridge — not yet implemented")
}

public actual fun telldir(dirp: DIR?): CLong {
    if (dirp == null) return -1L
    val dirpPtr: CPointer<ByteVar>? = dirp.handle.toCPointer()
    val result = libc_telldir(dirpPtr)
    return result
}

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    libc.cinterop.libc_madvise(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, advice)
public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    libc.cinterop.libc_msync(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, flags)
public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo requires manual FFI bridge — not yet implemented")

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires manual FFI bridge — not yet implemented")

public actual fun accept4(socket: CInt, address: Sockaddr?, addressLength: SocklenT?, flags: CInt): CInt =
    throw UnsupportedOperationException("accept4 requires manual FFI bridge — not yet implemented")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    if (iov == null) return -1
    val iovPtr: CPointer<ByteVar>? = iov.handle.toCPointer()
    val result = libc_writev(fd, iovPtr, iovcnt)
    return result
}

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    if (iov == null) return -1
    val iovPtr: CPointer<ByteVar>? = iov.handle.toCPointer()
    val result = libc_readv(fd, iovPtr, iovcnt)
    return result
}

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg requires manual FFI bridge — not yet implemented")

public actual fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe requires manual FFI bridge — not yet implemented")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires manual FFI bridge — not yet implemented")

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt {
    val result = libc_getgrouplist(user, group.toInt(), groups.toInt(), ngroups)
    return result
}

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack requires manual FFI bridge — not yet implemented")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose requires manual FFI bridge — not yet implemented")

public actual fun getdtablesize(): CInt =
    libc.cinterop.libc_getdtablesize()
public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires manual FFI bridge — not yet implemented")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask requires manual FFI bridge — not yet implemented")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun getgrnam(name: String?): Group? {
    val result = libc_getgrnam(name)
    return result
}

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("pthreadKill requires manual FFI bridge — not yet implemented")

public actual fun semUnlink(name: String?): CInt {
    val result = libc_sem_unlink(name)
    return result
}

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR requires manual FFI bridge — not yet implemented")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR requires manual FFI bridge — not yet implemented")

public actual fun getpwent(): Passwd? {
    val result = libc_getpwent()
    return result
}

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent requires manual FFI bridge — not yet implemented")
}

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent requires manual FFI bridge — not yet implemented")
}

public actual fun endgrent() {
    throw UnsupportedOperationException("endgrent requires manual FFI bridge — not yet implemented")
}

public actual fun getgrent(): Group? {
    val result = libc_getgrent()
    return result
}

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent requires manual FFI bridge — not yet implemented")
}

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait requires manual FFI bridge — not yet implemented")

public actual fun getgrgid(gid: GidT): Group? {
    val result = libc_getgrgid(gid.toInt())
    return result
}

public actual fun popen(command: String?, mode: String?): FILE? {
    val result = libc_popen(command, mode)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun sethostname(name: String?, len: ULong): CInt =
    libc.cinterop.libc_sethostname(name, len)
public actual fun uname(buf: Utsname?): CInt {
    if (buf == null) return -1
    val bufPtr: CPointer<ByteVar>? = buf.handle.toCPointer()
    val result = libc_uname(bufPtr)
    return result
}

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires manual FFI bridge — not yet implemented")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires manual FFI bridge — not yet implemented")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires manual FFI bridge — not yet implemented")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires manual FFI bridge — not yet implemented")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent requires manual FFI bridge — not yet implemented")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent requires manual FFI bridge — not yet implemented")
}

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    libc.cinterop.libc_faccessat(dirfd, pathname, mode, flags)
public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait requires manual FFI bridge — not yet implemented")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo requires manual FFI bridge — not yet implemented")

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    throw UnsupportedOperationException("getitimer requires manual FFI bridge — not yet implemented")

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    throw UnsupportedOperationException("setitimer requires manual FFI bridge — not yet implemented")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    throw UnsupportedOperationException("regcomp requires manual FFI bridge — not yet implemented")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt =
    throw UnsupportedOperationException("regexec requires manual FFI bridge — not yet implemented")

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror requires manual FFI bridge — not yet implemented")

public actual fun regfree(preg: RegexT?) {
    throw UnsupportedOperationException("regfree requires manual FFI bridge — not yet implemented")
}

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    throw UnsupportedOperationException("msgctl requires manual FFI bridge — not yet implemented")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgget requires manual FFI bridge — not yet implemented")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtype: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("msgrcv requires manual FFI bridge — not yet implemented")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgsnd requires manual FFI bridge — not yet implemented")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    throw UnsupportedOperationException("semget requires manual FFI bridge — not yet implemented")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("semctl requires manual FFI bridge — not yet implemented")

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt =
    throw UnsupportedOperationException("semop requires manual FFI bridge — not yet implemented")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires manual FFI bridge — not yet implemented")

public actual fun hcreate(nelt: ULong): CInt =
    throw UnsupportedOperationException("hcreate requires manual FFI bridge — not yet implemented")

public actual fun hdestroy() {
    throw UnsupportedOperationException("hdestroy requires manual FFI bridge — not yet implemented")
}

public actual fun hsearch(entry: ENTRY, action: ACTION): ENTRY? =
    throw UnsupportedOperationException("hsearch requires manual FFI bridge — not yet implemented")

public actual fun lrand48(): CLong =
    libc.cinterop.libc_lrand48()
public actual fun nrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("nrand48 requires manual FFI bridge — not yet implemented")

public actual fun mrand48(): CLong =
    libc.cinterop.libc_mrand48()
public actual fun jrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("jrand48 requires manual FFI bridge — not yet implemented")

public actual fun srand48(seed: CLong) {
    throw UnsupportedOperationException("srand48 requires manual FFI bridge — not yet implemented")
}

public actual fun seed48(xseed: CUShort?): CUShort? =
    throw UnsupportedOperationException("seed48 requires manual FFI bridge — not yet implemented")

public actual fun lcong48(p: CUShort?) {
    throw UnsupportedOperationException("lcong48 requires manual FFI bridge — not yet implemented")
}

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("clearenv requires manual FFI bridge — not yet implemented")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid requires manual FFI bridge — not yet implemented")

public actual fun sync() {
    throw UnsupportedOperationException("sync requires manual FFI bridge — not yet implemented")
}

public actual fun getpagesize(): CInt =
    libc.cinterop.libc_getpagesize()
public actual fun brk(addr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("brk requires manual FFI bridge — not yet implemented")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires manual FFI bridge — not yet implemented")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsInit(fileActions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsDestroy(fileActions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddopen(fileActions: PosixSpawnFileActionsT, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddclose(fileActions: PosixSpawnFileActionsT, fildes: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAdddup2(fileActions: PosixSpawnFileActionsT, fildes: CInt, newfildes: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT, pgroup: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT, pgroup: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT, sigdefault: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT, sigdefault: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires manual FFI bridge — not yet implemented")

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    throw UnsupportedOperationException("getoptLong requires manual FFI bridge — not yet implemented")

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    throw UnsupportedOperationException("strcasecmpL requires manual FFI bridge — not yet implemented")

public actual fun strncasecmpL(string1: String?, string2: String?, length: ULong, locale: LocaleT): CInt =
    throw UnsupportedOperationException("strncasecmpL requires manual FFI bridge — not yet implemented")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt {
    if (buf == null) return -1
    val bufPtr: CPointer<ByteVar>? = buf.value.toCPointer()
    val result = libc_getentropy(bufPtr, buflen)
    return result
}

public actual fun memmem(arg1: COpaquePointer?, arg2: ULong, arg3: COpaquePointer?, arg4: ULong): COpaquePointer? {
    if (arg1 == null) return null
    val arg1Ptr: CPointer<ByteVar>? = arg1.value.toCPointer()
    if (arg3 == null) return null
    val arg3Ptr: CPointer<ByteVar>? = arg3.value.toCPointer()
    val result = libc_memmem(arg1Ptr, arg2, arg3Ptr, arg4)
    return if (result != null) COpaquePointer(result.toLong()) else null
}

public actual fun pthreadGetattrNp(thread: PthreadT, attr: PthreadAttrT): CInt =
    throw UnsupportedOperationException("pthreadGetattrNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: String?, length: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(thread: PthreadT?, attr: PthreadAttrT, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")

public actual fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt =
    throw UnsupportedOperationException("glob requires manual FFI bridge — not yet implemented")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadAtfork requires manual FFI bridge — not yet implemented")

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("lsearch requires manual FFI bridge — not yet implemented")

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("lfind requires manual FFI bridge — not yet implemented")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("pthreadSigqueue requires manual FFI bridge for ambiguous type")
