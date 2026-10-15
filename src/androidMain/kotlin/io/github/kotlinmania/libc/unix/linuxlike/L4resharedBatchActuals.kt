// port-lint: source L4reShared.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.getnameinfo

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on Android host — use androidNative target for FFI")

public actual fun cPUALLOCSIZE(count: Int): ULong =
    throw UnsupportedOperationException("cPUALLOCSIZE not available on Android host — use androidNative target for FFI")

public actual fun cPUZERO(cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUZERO not available on Android host — use androidNative target for FFI")

public actual fun cPUSET(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUSET not available on Android host — use androidNative target for FFI")

public actual fun cPUCLR(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUCLR not available on Android host — use androidNative target for FFI")

public actual fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET not available on Android host — use androidNative target for FFI")

public actual fun cPUCOUNTS(size: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("cPUCOUNTS not available on Android host — use androidNative target for FFI")

public actual fun cPUCOUNT(cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("cPUCOUNT not available on Android host — use androidNative target for FFI")

public actual fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL not available on Android host — use androidNative target for FFI")

public actual fun rTLOCALADDR(flags: UInt): Boolean =
    throw UnsupportedOperationException("rTLOCALADDR not available on Android host — use androidNative target for FFI")

public actual fun iopl(level: Int): Int =
    throw UnsupportedOperationException("iopl not available on Android host — use androidNative target for FFI")

public actual fun ioperm(from: ULong, num: ULong, turnOn: Int): Int =
    throw UnsupportedOperationException("ioperm not available on Android host — use androidNative target for FFI")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead not available on Android host — use androidNative target for FFI")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite not available on Android host — use androidNative target for FFI")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync not available on Android host — use androidNative target for FFI")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError not available on Android host — use androidNative target for FFI")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn not available on Android host — use androidNative target for FFI")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend not available on Android host — use androidNative target for FFI")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel not available on Android host — use androidNative target for FFI")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio not available on Android host — use androidNative target for FFI")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev not available on Android host — use androidNative target for FFI")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv not available on Android host — use androidNative target for FFI")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int {
    val hBuf = if (hostlen > 0u) ByteArray(hostlen.toInt().coerceAtMost(4096)) else null
    val sBuf = if (servlen > 0u) ByteArray(servlen.toInt().coerceAtMost(256)) else null
    return getnameinfo(sa, salen, hBuf, hostlen, sBuf, servlen, flags)
}

public actual fun getloadavg(loadavg: Double?, nelem: Int): Int =
    throw UnsupportedOperationException("getloadavg not available on Android host — use androidNative target for FFI")

public actual fun processVmReadv(pid: Int, localIov: Iovec?, liovcnt: ULong, remoteIov: Iovec?, riovcnt: ULong, flags: ULong): Long =
    throw UnsupportedOperationException("processVmReadv not available on Android host — use androidNative target for FFI")

public actual fun processVmWritev(pid: Int, localIov: Iovec?, liovcnt: ULong, remoteIov: Iovec?, riovcnt: ULong, flags: ULong): Long =
    throw UnsupportedOperationException("processVmWritev not available on Android host — use androidNative target for FFI")

public actual fun futimes(fd: Int, times: Timeval?): Int =
    throw UnsupportedOperationException("futimes not available on Android host — use androidNative target for FFI")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR not available on Android host — use androidNative target for FFI")

public actual fun abs(i: Int): Int =
    throw UnsupportedOperationException("abs not available on Android host — use androidNative target for FFI")

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs not available on Android host — use androidNative target for FFI")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand not available on Android host — use androidNative target for FFI")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand not available on Android host — use androidNative target for FFI")

public actual fun lrand48(): Long =
    throw UnsupportedOperationException("lrand48 not available on Android host — use androidNative target for FFI")

public actual fun nrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("nrand48 not available on Android host — use androidNative target for FFI")

public actual fun jrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("jrand48 not available on Android host — use androidNative target for FFI")

public actual fun srand48(seed: Long): Unit = throw UnsupportedOperationException("srand48 not available on Android host — use androidNative target for FFI")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent not available on Android host — use androidNative target for FFI")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent not available on Android host — use androidNative target for FFI")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on Android host — use androidNative target for FFI")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent not available on Android host — use androidNative target for FFI")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent not available on Android host — use androidNative target for FFI")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent not available on Android host — use androidNative target for FFI")

public actual fun setspent(): Unit = throw UnsupportedOperationException("setspent not available on Android host — use androidNative target for FFI")

public actual fun endspent(): Unit = throw UnsupportedOperationException("endspent not available on Android host — use androidNative target for FFI")

public actual fun getspent(): Spwd? =
    throw UnsupportedOperationException("getspent not available on Android host — use androidNative target for FFI")

public actual fun getspnam(name: String?): Spwd? =
    throw UnsupportedOperationException("getspnam not available on Android host — use androidNative target for FFI")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget not available on Android host — use androidNative target for FFI")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat not available on Android host — use androidNative target for FFI")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("shmdt not available on Android host — use androidNative target for FFI")

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl not available on Android host — use androidNative target for FFI")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on Android host — use androidNative target for FFI")

public actual fun errnoLocation(): Int? =
    io.github.kotlinmania.libc.internal.LibcJni
        .getErrno()

public actual fun mremap(addr: COpaquePointer?, len: ULong, newLen: ULong, flags: Int, vararg args: Any?): COpaquePointer? =
    throw UnsupportedOperationException("mremap not available on Android host — use androidNative target for FFI")

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree not available on Android host — use androidNative target for FFI")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir not available on Android host — use androidNative target for FFI")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir not available on Android host — use androidNative target for FFI")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise not available on Android host — use androidNative target for FFI")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync not available on Android host — use androidNative target for FFI")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfoL(item: Int, locale: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("nlLanginfoL not available on Android host — use androidNative target for FFI")

public actual fun schedGetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedGetaffinity not available on Android host — use androidNative target for FFI")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax not available on Android host — use androidNative target for FFI")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("settimeofday not available on Android host — use androidNative target for FFI")

public actual fun semTimedwait(sem: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait not available on Android host — use androidNative target for FFI")

public actual fun semGetvalue(sem: io.github.kotlinmania.libc.COpaquePointer?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue not available on Android host — use androidNative target for FFI")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: ULong, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("mount not available on Android host — use androidNative target for FFI")

public actual fun prctl(option: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("prctl not available on Android host — use androidNative target for FFI")

public actual fun ppoll(fds: Pollfd?, nfds: UInt, timeout: Timespec?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("ppoll not available on Android host — use androidNative target for FFI")

public actual fun sethostname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("sethostname not available on Android host — use androidNative target for FFI")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin not available on Android host — use androidNative target for FFI")

public actual fun sysinfo(info: Sysinfo?): Int =
    throw UnsupportedOperationException("sysinfo not available on Android host — use androidNative target for FFI")

public actual fun sigsuspend(mask: ULong?): Int =
    throw UnsupportedOperationException("sigsuspend not available on Android host — use androidNative target for FFI")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR not available on Android host — use androidNative target for FFI")

public actual fun semClose(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semClose not available on Android host — use androidNative target for FFI")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR not available on Android host — use androidNative target for FFI")

public actual fun initgroups(user: String?, group: UInt): Int =
    throw UnsupportedOperationException("initgroups not available on Android host — use androidNative target for FFI")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("semOpen not available on Android host — use androidNative target for FFI")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on Android host — use androidNative target for FFI")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink not available on Android host — use androidNative target for FFI")

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    throw UnsupportedOperationException("daemon not available on Android host — use androidNative target for FFI")

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait not available on Android host — use androidNative target for FFI")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid not available on Android host — use androidNative target for FFI")

public actual fun popen(command: String?, mode: String?): FILE? {
    if (command == null || mode == null) return null
    val ptr =
        io.github.kotlinmania.libc.internal.LibcJni
            .popen(command, mode)
    return if (ptr == 0L) null else FILE(ptr)
}

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat not available on Android host — use androidNative target for FFI")

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    throw UnsupportedOperationException("setmntent not available on Android host — use androidNative target for FFI")

public actual fun getmntent(stream: FILE?): Mntent? =
    throw UnsupportedOperationException("getmntent not available on Android host — use androidNative target for FFI")

public actual fun addmntent(stream: FILE?, mnt: Mntent?): Int =
    throw UnsupportedOperationException("addmntent not available on Android host — use androidNative target for FFI")

public actual fun endmntent(streamp: FILE?): Int =
    throw UnsupportedOperationException("endmntent not available on Android host — use androidNative target for FFI")

public actual fun hasmntopt(mnt: Mntent?, opt: String?): String? =
    throw UnsupportedOperationException("hasmntopt not available on Android host — use androidNative target for FFI")

public actual fun regcomp(preg: io.github.kotlinmania.libc.COpaquePointer?, pattern: String?, cflags: Int): Int =
    throw UnsupportedOperationException("regcomp not available on Android host — use androidNative target for FFI")

public actual fun regexec(preg: io.github.kotlinmania.libc.COpaquePointer?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int =
    throw UnsupportedOperationException("regexec not available on Android host — use androidNative target for FFI")

public actual fun regerror(errcode: Int, preg: io.github.kotlinmania.libc.COpaquePointer?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror not available on Android host — use androidNative target for FFI")

public actual fun regfree(preg: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("regfree not available on Android host — use androidNative target for FFI")

public actual fun iconv(cd: io.github.kotlinmania.libc.COpaquePointer?, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv not available on Android host — use androidNative target for FFI")

public actual fun iconvClose(cd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("iconvClose not available on Android host — use androidNative target for FFI")

public actual fun gettid(): Int =
    throw UnsupportedOperationException("gettid not available on Android host — use androidNative target for FFI")

public actual fun timerCreate(clockid: Int, sevp: Sigevent?, timerid: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("timerCreate not available on Android host — use androidNative target for FFI")

public actual fun timerDelete(timerid: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("timerDelete not available on Android host — use androidNative target for FFI")

public actual fun timerGetoverrun(timerid: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("timerGetoverrun not available on Android host — use androidNative target for FFI")

public actual fun timerGettime(timerid: io.github.kotlinmania.libc.COpaquePointer?, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerGettime not available on Android host — use androidNative target for FFI")

public actual fun timerSettime(timerid: io.github.kotlinmania.libc.COpaquePointer?, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerSettime not available on Android host — use androidNative target for FFI")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on Android host — use androidNative target for FFI")

public actual fun schedGetcpu(): Int =
    throw UnsupportedOperationException("schedGetcpu not available on Android host — use androidNative target for FFI")

public actual fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int =
    throw UnsupportedOperationException("getoptLong not available on Android host — use androidNative target for FFI")

public actual fun copyFileRange(fdIn: Int, offIn: Long?, fdOut: Int, offOut: Long?, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("copyFileRange not available on Android host — use androidNative target for FFI")

public actual fun fseeko64(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseeko64 not available on Android host — use androidNative target for FFI")

public actual fun fsetpos64(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fsetpos64 not available on Android host — use androidNative target for FFI")

public actual fun ftello64(stream: FILE?): Long =
    throw UnsupportedOperationException("ftello64 not available on Android host — use androidNative target for FFI")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob not available on Android host — use androidNative target for FFI")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr not available on Android host — use androidNative target for FFI")

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen64 not available on Android host — use androidNative target for FFI")
