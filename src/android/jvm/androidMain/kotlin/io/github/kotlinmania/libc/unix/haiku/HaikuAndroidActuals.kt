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

private object UnixHaikuJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_haiku_getrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_setrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_getpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_setpriority(which: Int, who: Int, priority: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_endusershell()

    @JvmStatic
    external fun libc_unix_haiku_getpass(prompt: String?): Long

    @JvmStatic
    external fun libc_unix_haiku_getusershell(): Long

    @JvmStatic
    external fun libc_unix_haiku_issetugid(): Int

    @JvmStatic
    external fun libc_unix_haiku_setusershell()

    @JvmStatic
    external fun libc_unix_haiku_utimensat(fd: Int, path: String?, times: Long, flag: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_strerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_errnop(): Long

    @JvmStatic
    external fun libc_unix_haiku_abs(i: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_labs(i: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_rand(): Int

    @JvmStatic
    external fun libc_unix_haiku_srand(seed: Int)

    @JvmStatic
    external fun libc_unix_haiku_getifaddrs(ifap: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_freeifaddrs(ifa: Long)

    @JvmStatic
    external fun libc_unix_haiku_ppoll(fds: Long, numfds: Long, timeout: Long, sigMask: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_getspent(): Long

    @JvmStatic
    external fun libc_unix_haiku_getspentR(pwd: Long, buf: Long, bufferSize: Long, res: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_setspent()

    @JvmStatic
    external fun libc_unix_haiku_endspent()

    @JvmStatic
    external fun libc_unix_haiku_getspnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_haiku_getspnamR(name: String?, spwd: Long, buffer: Long, bufferSize: Long, res: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_sgetspent(line: String?): Long

    @JvmStatic
    external fun libc_unix_haiku_sgetspentR(line: String?, spwd: Long, buffer: Long, bufferSize: Long, res: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_fgetspent(file: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_fgetspentR(file: Long, spwd: Long, buffer: Long, bufferSize: Long, res: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_semDestroy(sem: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_semInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_clockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_clockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_clockSettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_clockGetcpuclockid(pid: Int, clkId: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadCreate(thread: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_valloc(numBytes: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_mallocUsableSize(ptr: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_memalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_setgroups(ngroups: Int, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_initgroups(name: String?, basegid: Short): Int

    @JvmStatic
    external fun libc_unix_haiku_ioctl(fd: Int, request: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_dirfd(dirp: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_waitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_globfree(pglob: Long)

    @JvmStatic
    external fun libc_unix_haiku_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_posixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_posixFadvise(fd: Int, offset: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_posixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_shmOpen(name: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_shmUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_haiku_seekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libc_unix_haiku_telldir(dirp: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_madvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_msync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_nlLanginfo(item: Int): Long

    @JvmStatic
    external fun libc_unix_haiku_bind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_accept4(socket: Int, address: Long, addressLength: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_writev(fd: Int, iov: Long, count: Int): Long

    @JvmStatic
    external fun libc_unix_haiku_readv(fd: Int, iov: Long, count: Int): Long

    @JvmStatic
    external fun libc_unix_haiku_sendmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_haiku_recvmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_haiku_execvpe(file: String?, argv: Long, environment: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_getgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_getgrouplist(user: String?, basegroup: Short, grouplist: Long, groupcount: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_sigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_sigsuspend(mask: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_semClose(sem: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_getdtablesize(): Int

    @JvmStatic
    external fun libc_unix_haiku_getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_semOpen(name: String?, oflag: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_getgrnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_haiku_pthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_semUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_haiku_getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_getpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_getpwent(): Long

    @JvmStatic
    external fun libc_unix_haiku_setpwent()

    @JvmStatic
    external fun libc_unix_haiku_endpwent()

    @JvmStatic
    external fun libc_unix_haiku_endgrent()

    @JvmStatic
    external fun libc_unix_haiku_getgrent(): Long

    @JvmStatic
    external fun libc_unix_haiku_setgrent()

    @JvmStatic
    external fun libc_unix_haiku_sigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_getgrgid(gid: Short): Long

    @JvmStatic
    external fun libc_unix_haiku_popen(command: String?, mode: String?): Long

    @JvmStatic
    external fun libc_unix_haiku_sethostname(name: String?, len: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_uname(buf: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_getutxent(): Long

    @JvmStatic
    external fun libc_unix_haiku_getutxid(ut: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_getutxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_pututxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_setutxent()

    @JvmStatic
    external fun libc_unix_haiku_endutxent()

    @JvmStatic
    external fun libc_unix_haiku_faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_sigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_sigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_getitimer(which: Int, currValue: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_setitimer(which: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_regcomp(preg: Long, pattern: String?, cflags: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_regexec(preg: Long, input: String?, nmatch: Long, pmatch: Long, eflags: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_regerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_regfree(preg: Long)

    @JvmStatic
    external fun libc_unix_haiku_msgctl(msqid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_msgget(key: Int, msgflg: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtype: Long, msgflg: Int): Long

    @JvmStatic
    external fun libc_unix_haiku_msgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_semget(key: Int, nsems: Int, semflg: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_semctl(semid: Int, semnum: Int, cmd: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_semop(semid: Int, sops: Long, nsops: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_ftok(pathname: String?, projId: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_memrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_lsearch(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_lfind(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_hcreate(nelt: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_hdestroy()

    @JvmStatic
    external fun libc_unix_haiku_drand48(): Double

    @JvmStatic
    external fun libc_unix_haiku_erand48(xseed: Long): Double

    @JvmStatic
    external fun libc_unix_haiku_lrand48(): Long

    @JvmStatic
    external fun libc_unix_haiku_nrand48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_mrand48(): Long

    @JvmStatic
    external fun libc_unix_haiku_jrand48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_srand48(seed: Long)

    @JvmStatic
    external fun libc_unix_haiku_seed48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_lcong48(p: Long)

    @JvmStatic
    external fun libc_unix_haiku_clearenv(): Int

    @JvmStatic
    external fun libc_unix_haiku_ctermid(s: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_sync()

    @JvmStatic
    external fun libc_unix_haiku_getpagesize(): Int

    @JvmStatic
    external fun libc_unix_haiku_brk(addr: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_sbrk(increment: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnFileActionsInit(fileActions: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnFileActionsDestroy(fileActions: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnFileActionsAddopen(fileActions: Long, fildes: Int, path: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnFileActionsAddclose(fileActions: Long, fildes: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnFileActionsAdddup2(fileActions: Long, fildes: Int, newfildes: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnattrGetpgroup(attr: Long, pgroup: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnattrSetpgroup(attr: Long, pgroup: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnattrGetsigdefault(attr: Long, sigdefault: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnattrSetsigdefault(attr: Long, sigdefault: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnattrGetsigmask(attr: Long, sigmask: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_posixSpawnattrSetsigmask(attr: Long, sigmask: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_getoptLong(argc: Int, argv: Long, optstring: String?, longopts: Long, longindex: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_strcasecmpL(string1: String?, string2: String?, locale: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_strncasecmpL(string1: String?, string2: String?, length: Long, locale: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_getentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_memmem(source: Long, sourceLength: Long, search: Long, searchLength: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_pthreadGetattrNp(thread: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadGetnameNp(thread: Long, buffer: Long, length: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_pthreadSetnameNp(thread: Long, name: String?): Int
}

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getrlimit(resource, (rlim?.value ?: 0L))

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_setrlimit(resource, (rlim?.value ?: 0L))

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_setpriority(which, who, priority)

public actual fun endusershell() {
    UnixHaikuJniBridge.libc_unix_haiku_endusershell()
}

public actual fun getpass(prompt: String?): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_getpass(prompt).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getusershell(): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_getusershell().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun issetugid(): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_issetugid()

public actual fun setusershell() {
    UnixHaikuJniBridge.libc_unix_haiku_setusershell()
}

public actual fun utimensat(fd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_utimensat(fd, path, (times?.value ?: 0L), flag)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_futimens(fd, (times?.value ?: 0L))

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_strerrorR(errnum, (buf?.value ?: 0L), buflen.toLong())

public actual fun errnop(): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_errnop().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun abs(i: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_abs(i)

public actual fun labs(i: CLong): CLong =
    UnixHaikuJniBridge.libc_unix_haiku_labs(i)

public actual fun rand(): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_rand()

public actual fun srand(seed: CUint) {
    UnixHaikuJniBridge.libc_unix_haiku_srand(seed.toInt())
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getifaddrs((ifap?.value ?: 0L))

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    UnixHaikuJniBridge.libc_unix_haiku_freeifaddrs((ifa?.value ?: 0L))
}

public actual fun ppoll(fds: COpaquePointer?, numfds: NfdsT, timeout: COpaquePointer?, sigMask: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_ppoll((fds?.value ?: 0L), numfds.toLong(), (timeout?.value ?: 0L), (sigMask?.value ?: 0L))

public actual fun getspent(): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_getspent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getspentR(pwd: COpaquePointer?, buf: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getspentR((pwd?.value ?: 0L), (buf?.value ?: 0L), bufferSize.toLong(), (res?.value ?: 0L))

public actual fun setspent() {
    UnixHaikuJniBridge.libc_unix_haiku_setspent()
}

public actual fun endspent() {
    UnixHaikuJniBridge.libc_unix_haiku_endspent()
}

public actual fun getspnam(name: String?): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_getspnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getspnamR(name: String?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getspnamR(name, (spwd?.value ?: 0L), (buffer?.value ?: 0L), bufferSize.toLong(), (res?.value ?: 0L))

public actual fun sgetspent(line: String?): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_sgetspent(line).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sgetspentR(line: String?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_sgetspentR(line, (spwd?.value ?: 0L), (buffer?.value ?: 0L), bufferSize.toLong(), (res?.value ?: 0L))

public actual fun fgetspent(file: FILE?): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_fgetspent((file?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fgetspentR(file: FILE?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_fgetspentR((file?.handle ?: 0L), (spwd?.value ?: 0L), (buffer?.value ?: 0L), bufferSize.toLong(), (res?.value ?: 0L))

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_mkfifoat(dirfd, pathname, mode.toInt())

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_mknodat(dirfd, pathname, mode.toInt(), dev)

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_semDestroy((sem?.value ?: 0L))

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_semInit((sem?.value ?: 0L), pshared, value.toInt())

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_clockGetres(clkId, (tp?.value ?: 0L))

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_clockGettime(clkId, (tp?.value ?: 0L))

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_clockSettime(clkId, (tp?.value ?: 0L))

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_clockGetcpuclockid(pid, (clkId?.value ?: 0L))

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadCreate((thread?.value ?: 0L), (attr?.value ?: 0L), 0L, (value?.value ?: 0L))

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadAttrGetguardsize((attr?.value ?: 0L), (guardsize?.value ?: 0L))

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadAttrSetguardsize((attr?.value ?: 0L), guardsize.toLong())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadAttrGetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadCondattrGetclock((attr?.value ?: 0L), (clockId?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadCondattrSetclock((attr?.value ?: 0L), clockId)

public actual fun valloc(numBytes: SizeT): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_valloc(numBytes.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    UnixHaikuJniBridge.libc_unix_haiku_mallocUsableSize((ptr?.value ?: 0L)).toULong()

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_memalign(align.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_setgroups(ngroups, (ptr?.value ?: 0L))

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_initgroups(name, basegid.toShort())

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_ioctl(fd, request.toLong(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun dirfd(dirp: DIR?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_dirfd((dirp?.handle ?: 0L))

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getnameinfo((sa?.value ?: 0L), salen.toInt(), (host?.value ?: 0L), hostlen.toInt(), (serv?.value ?: 0L), servlen.toInt(), flags)

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadMutexTimedlock((lock?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadSpinInit((lock?.value ?: 0L), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadSpinDestroy((lock?.value ?: 0L))

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadSpinLock((lock?.value ?: 0L))

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadSpinTrylock((lock?.value ?: 0L))

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadSpinUnlock((lock?.value ?: 0L))

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_waitid(idtype, id, (infop?.value ?: 0L), options)

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_glob(pattern, flags, 0L, (pglob?.value ?: 0L))

public actual fun globfree(pglob: COpaquePointer?) {
    UnixHaikuJniBridge.libc_unix_haiku_globfree((pglob?.value ?: 0L))
}

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixMadvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixFadvise(fd, offset, len, advice)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixFallocate(fd, offset, len)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_shmOpen(name, oflag, mode.toInt())

public actual fun shmUnlink(name: String?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    UnixHaikuJniBridge.libc_unix_haiku_seekdir((dirp?.handle ?: 0L), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    UnixHaikuJniBridge.libc_unix_haiku_telldir((dirp?.handle ?: 0L))

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_madvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_msync((addr?.value ?: 0L), len.toLong(), flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    UnixHaikuJniBridge.libc_unix_haiku_recvfrom(socket, (buf?.value ?: 0L), len.toLong(), flags, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_bind(socket, (address?.value ?: 0L), addressLen.toInt())

public actual fun accept4(socket: CInt, address: COpaquePointer?, addressLength: COpaquePointer?, flags: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_accept4(socket, (address?.value ?: 0L), (addressLength?.value ?: 0L), flags)

public actual fun writev(fd: CInt, iov: COpaquePointer?, count: CInt): SsizeT =
    UnixHaikuJniBridge.libc_unix_haiku_writev(fd, (iov?.value ?: 0L), count)

public actual fun readv(fd: CInt, iov: COpaquePointer?, count: CInt): SsizeT =
    UnixHaikuJniBridge.libc_unix_haiku_readv(fd, (iov?.value ?: 0L), count)

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixHaikuJniBridge.libc_unix_haiku_sendmsg(fd, (msg?.value ?: 0L), flags)

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixHaikuJniBridge.libc_unix_haiku_recvmsg(fd, (msg?.value ?: 0L), flags)

public actual fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_execvpe(file, (argv?.value ?: 0L), (environment?.value ?: 0L))

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getgrgidR(gid.toShort(), (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getgrouplist(user: String?, basegroup: GidT, grouplist: COpaquePointer?, groupcount: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getgrouplist(user, basegroup.toShort(), (grouplist?.value ?: 0L), (groupcount?.value ?: 0L))

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_sigaltstack((ss?.value ?: 0L), (oss?.value ?: 0L))

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_sigsuspend((mask?.value ?: 0L))

public actual fun semClose(sem: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_semClose((sem?.value ?: 0L))

public actual fun getdtablesize(): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getdtablesize()

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getgrnamR(name, (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadSigmask(how, (set?.value ?: 0L), (oldset?.value ?: 0L))

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getgrnam(name: String?): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_getgrnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadKill(thread.toLong(), sig)

public actual fun semUnlink(name: String?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_semUnlink(name)

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getpwnamR(name, (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getpwuidR(uid.toShort(), (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getpwent(): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_getpwent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setpwent() {
    UnixHaikuJniBridge.libc_unix_haiku_setpwent()
}

public actual fun endpwent() {
    UnixHaikuJniBridge.libc_unix_haiku_endpwent()
}

public actual fun endgrent() {
    UnixHaikuJniBridge.libc_unix_haiku_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_getgrent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgrent() {
    UnixHaikuJniBridge.libc_unix_haiku_setgrent()
}

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_sigwait((set?.value ?: 0L), (sig?.value ?: 0L))

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadAtfork(0L, 0L, 0L)

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_getgrgid(gid.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun popen(command: String?, mode: String?): FILE? =
    UnixHaikuJniBridge.libc_unix_haiku_popen(command, mode).let { if (it == 0L) null else FILE(it) }

public actual fun sethostname(name: String?, len: SizeT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_sethostname(name, len.toLong())

public actual fun uname(buf: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_uname((buf?.value ?: 0L))

public actual fun getutxent(): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_getutxent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_getutxid((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_getutxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_pututxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setutxent() {
    UnixHaikuJniBridge.libc_unix_haiku_setutxent()
}

public actual fun endutxent() {
    UnixHaikuJniBridge.libc_unix_haiku_endutxent()
}

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_faccessat(dirfd, pathname, mode, flags)

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_sigtimedwait((set?.value ?: 0L), (info?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_sigwaitinfo((set?.value ?: 0L), (info?.value ?: 0L))

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getitimer(which, (currValue?.value ?: 0L))

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_setitimer(which, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_regcomp((preg?.value ?: 0L), pattern, cflags)

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_regexec((preg?.value ?: 0L), input, nmatch.toLong(), (pmatch?.value ?: 0L), eflags)

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    UnixHaikuJniBridge.libc_unix_haiku_regerror(errcode, (preg?.value ?: 0L), (errbuf?.value ?: 0L), errbufSize.toLong()).toULong()

public actual fun regfree(preg: COpaquePointer?) {
    UnixHaikuJniBridge.libc_unix_haiku_regfree((preg?.value ?: 0L))
}

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_msgctl(msqid, cmd, (buf?.value ?: 0L))

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT =
    UnixHaikuJniBridge.libc_unix_haiku_msgrcv(msqid, (msgp?.value ?: 0L), msgsz.toLong(), msgtype, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_msgsnd(msqid, (msgp?.value ?: 0L), msgsz.toLong(), msgflg)

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_semget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_semctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_semop(semid, (sops?.value ?: 0L), nsops.toLong())

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    UnixHaikuJniBridge.libc_unix_haiku_ftok(pathname, projId)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_memrchr((cx?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_lsearch((key?.value ?: 0L), (base?.value ?: 0L), (nelp?.value ?: 0L), width.toLong(), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_lfind((key?.value ?: 0L), (base?.value ?: 0L), (nelp?.value ?: 0L), width.toLong(), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hcreate(nelt: SizeT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_hcreate(nelt.toLong())

public actual fun hdestroy() {
    UnixHaikuJniBridge.libc_unix_haiku_hdestroy()
}

public actual fun hsearch(entry: Entry, action: Action): COpaquePointer? =
    null

public actual fun drand48(): CDouble =
    UnixHaikuJniBridge.libc_unix_haiku_drand48()

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    UnixHaikuJniBridge.libc_unix_haiku_erand48((xseed?.value ?: 0L))

public actual fun lrand48(): CLong =
    UnixHaikuJniBridge.libc_unix_haiku_lrand48()

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    UnixHaikuJniBridge.libc_unix_haiku_nrand48((xseed?.value ?: 0L))

public actual fun mrand48(): CLong =
    UnixHaikuJniBridge.libc_unix_haiku_mrand48()

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    UnixHaikuJniBridge.libc_unix_haiku_jrand48((xseed?.value ?: 0L))

public actual fun srand48(seed: CLong) {
    UnixHaikuJniBridge.libc_unix_haiku_srand48(seed)
}

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_seed48((xseed?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lcong48(p: COpaquePointer?) {
    UnixHaikuJniBridge.libc_unix_haiku_lcong48((p?.value ?: 0L))
}

public actual fun clearenv(): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_clearenv()

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_ctermid((s?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sync() {
    UnixHaikuJniBridge.libc_unix_haiku_sync()
}

public actual fun getpagesize(): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getpagesize()

public actual fun brk(addr: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_brk((addr?.value ?: 0L))

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_sbrk(increment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawn((pid?.value ?: 0L), path, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnp((pid?.value ?: 0L), file, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnFileActionsInit((fileActions?.value ?: 0L))

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnFileActionsDestroy((fileActions?.value ?: 0L))

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnFileActionsAddopen((fileActions?.value ?: 0L), fildes, path, oflag, mode.toInt())

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnFileActionsAddclose((fileActions?.value ?: 0L), fildes)

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnFileActionsAdddup2((fileActions?.value ?: 0L), fildes, newfildes)

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnattrInit((attr?.value ?: 0L))

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnattrDestroy((attr?.value ?: 0L))

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnattrGetflags((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnattrSetflags((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnattrGetpgroup((attr?.value ?: 0L), (pgroup?.value ?: 0L))

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnattrSetpgroup((attr?.value ?: 0L), pgroup)

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnattrGetsigdefault((attr?.value ?: 0L), (sigdefault?.value ?: 0L))

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnattrSetsigdefault((attr?.value ?: 0L), (sigdefault?.value ?: 0L))

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnattrGetsigmask((attr?.value ?: 0L), (sigmask?.value ?: 0L))

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_posixSpawnattrSetsigmask((attr?.value ?: 0L), (sigmask?.value ?: 0L))

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getoptLong(argc, (argv?.value ?: 0L), optstring, (longopts?.value ?: 0L), (longindex?.value ?: 0L))

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_strcasecmpL(string1, string2, (locale?.value ?: 0L))

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_strncasecmpL(string1, string2, length.toLong(), (locale?.value ?: 0L))

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_getentropy((buf?.value ?: 0L), buflen.toLong())

public actual fun memmem(source: COpaquePointer?, sourceLength: SizeT, search: COpaquePointer?, searchLength: SizeT): COpaquePointer? =
    UnixHaikuJniBridge.libc_unix_haiku_memmem((source?.value ?: 0L), sourceLength.toLong(), (search?.value ?: 0L), searchLength.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadGetattrNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadGetattrNp(thread.toLong(), (attr?.value ?: 0L))

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadGetnameNp(thread.toLong(), (buffer?.value ?: 0L), length.toLong())

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    UnixHaikuJniBridge.libc_unix_haiku_pthreadSetnameNp(thread.toLong(), name)
