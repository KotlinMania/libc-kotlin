// port-lint: source L4reShared.rs
package io.github.kotlinmania.libc.unix.linuxlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Aiocb
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Cmsghdr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Msghdr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.ShmidDs
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Sysinfo

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun cpuAllocSize(count: Int): ULong =
    throw UnsupportedOperationException("cPUALLOCSIZE requires N-API addon")

public actual fun cpuZero(cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUZERO requires N-API addon")

public actual fun cpuSet(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUSET requires N-API addon")

public actual fun cpuClear(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUCLR requires N-API addon")

public actual fun cpuIsSet(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires N-API addon")

public actual fun cpuCountS(size: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("cPUCOUNTS requires N-API addon")

public actual fun cpuCount(cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("cPUCOUNT requires N-API addon")

public actual fun cpuEqual(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL requires N-API addon")

public actual fun rtLocalAddr(flags: UInt): Boolean =
    throw UnsupportedOperationException("rTLOCALADDR requires N-API addon")

public actual fun iopl(level: Int): Int =
    throw UnsupportedOperationException("iopl requires N-API addon")

public actual fun ioperm(from: ULong, num: ULong, turnOn: Int): Int =
    throw UnsupportedOperationException("ioperm requires N-API addon")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead requires N-API addon")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite requires N-API addon")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync requires N-API addon")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError requires N-API addon")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn requires N-API addon")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend requires N-API addon")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel requires N-API addon")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio requires N-API addon")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    getnameinfoNapi(
        sa,
        salen,
        if (host != null && hostlen > 0u) ByteArray(hostlen.toInt()) else null,
        hostlen,
        if (serv != null && servlen > 0u) ByteArray(servlen.toInt()) else null,
        servlen,
        flags,
    )

public actual fun getloadavg(loadavg: Double?, nelem: Int): Int =
    throw UnsupportedOperationException("getloadavg requires N-API addon")

public actual fun processVmReadv(pid: Int, localIov: Iovec?, liovcnt: ULong, remoteIov: Iovec?, riovcnt: ULong, flags: ULong): Long =
    throw UnsupportedOperationException("processVmReadv requires N-API addon")

public actual fun processVmWritev(pid: Int, localIov: Iovec?, liovcnt: ULong, remoteIov: Iovec?, riovcnt: ULong, flags: ULong): Long =
    throw UnsupportedOperationException("processVmWritev requires N-API addon")

public actual fun futimes(fd: Int, times: Timeval?): Int =
    throw UnsupportedOperationException("futimes requires N-API addon")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun abs(i: Int): Int =
    LibcNative.abs(i)

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand requires N-API addon")

public actual fun lrand48(): Long =
    throw UnsupportedOperationException("lrand48 requires N-API addon")

public actual fun nrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("nrand48 requires N-API addon")

public actual fun jrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("jrand48 requires N-API addon")

public actual fun srand48(seed: Long): Unit = throw UnsupportedOperationException("srand48 requires N-API addon")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent requires N-API addon")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent requires N-API addon")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires N-API addon")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent requires N-API addon")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent requires N-API addon")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires N-API addon")

public actual fun setspent(): Unit = throw UnsupportedOperationException("setspent requires N-API addon")

public actual fun endspent(): Unit = throw UnsupportedOperationException("endspent requires N-API addon")

public actual fun getspent(): Spwd? =
    throw UnsupportedOperationException("getspent requires N-API addon")

public actual fun getspnam(name: String?): Spwd? =
    throw UnsupportedOperationException("getspnam requires N-API addon")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget requires N-API addon")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires N-API addon")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("shmdt requires N-API addon")

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun errnoLocation(): Int? =
    getErrnoNapi()

public actual fun mremap(addr: COpaquePointer?, len: ULong, newLen: ULong, flags: Int, vararg args: Any?): COpaquePointer? =
    throw UnsupportedOperationException("mremap requires N-API addon")

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree requires N-API addon")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir requires N-API addon")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir requires N-API addon")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo requires N-API addon")

public actual fun nlLanginfoL(item: Int, locale: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("nlLanginfoL requires N-API addon")

public actual fun schedGetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedGetaffinity requires N-API addon")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax requires N-API addon")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun semTimedwait(sem: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait requires N-API addon")

public actual fun semGetvalue(sem: io.github.kotlinmania.libc.COpaquePointer?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: ULong, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("mount requires N-API addon")

public actual fun prctl(option: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("prctl requires N-API addon")

public actual fun ppoll(fds: Pollfd?, nfds: UInt, timeout: Timespec?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("ppoll requires N-API addon")

public actual fun sethostname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("sethostname requires N-API addon")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin requires N-API addon")

public actual fun sysinfo(info: Sysinfo?): Int =
    throw UnsupportedOperationException("sysinfo requires N-API addon")

public actual fun sigsuspend(mask: ULong?): Int =
    throw UnsupportedOperationException("sigsuspend requires N-API addon")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR requires N-API addon")

public actual fun semClose(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semClose requires N-API addon")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR requires N-API addon")

public actual fun initgroups(user: String?, group: UInt): Int =
    throw UnsupportedOperationException("initgroups requires N-API addon")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("semOpen requires N-API addon")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires N-API addon")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink requires N-API addon")

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    throw UnsupportedOperationException("daemon requires N-API addon")

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait requires N-API addon")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid requires N-API addon")

public actual fun popen(command: String?, mode: String?): FILE? =
    popenNapi(command, mode)

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat requires N-API addon")

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    throw UnsupportedOperationException("setmntent requires N-API addon")

public actual fun getmntent(stream: FILE?): Mntent? =
    throw UnsupportedOperationException("getmntent requires N-API addon")

public actual fun addmntent(stream: FILE?, mnt: Mntent?): Int =
    throw UnsupportedOperationException("addmntent requires N-API addon")

public actual fun endmntent(streamp: FILE?): Int =
    throw UnsupportedOperationException("endmntent requires N-API addon")

public actual fun hasmntopt(mnt: Mntent?, opt: String?): String? =
    throw UnsupportedOperationException("hasmntopt requires N-API addon")

public actual fun regcomp(preg: io.github.kotlinmania.libc.COpaquePointer?, pattern: String?, cflags: Int): Int =
    throw UnsupportedOperationException("regcomp requires N-API addon")

public actual fun regexec(preg: io.github.kotlinmania.libc.COpaquePointer?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int =
    throw UnsupportedOperationException("regexec requires N-API addon")

public actual fun regerror(errcode: Int, preg: io.github.kotlinmania.libc.COpaquePointer?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror requires N-API addon")

public actual fun regfree(preg: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("regfree requires N-API addon")

public actual fun iconv(cd: io.github.kotlinmania.libc.COpaquePointer?, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv requires N-API addon")

public actual fun iconvClose(cd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("iconvClose requires N-API addon")

public actual fun gettid(): Int =
    throw UnsupportedOperationException("gettid requires N-API addon")

public actual fun timerCreate(clockid: Int, sevp: Sigevent?, timerid: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("timerCreate requires N-API addon")

public actual fun timerDelete(timerid: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("timerDelete requires N-API addon")

public actual fun timerGetoverrun(timerid: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("timerGetoverrun requires N-API addon")

public actual fun timerGettime(timerid: io.github.kotlinmania.libc.COpaquePointer?, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerGettime requires N-API addon")

public actual fun timerSettime(timerid: io.github.kotlinmania.libc.COpaquePointer?, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerSettime requires N-API addon")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires N-API addon")

public actual fun schedGetcpu(): Int =
    throw UnsupportedOperationException("schedGetcpu requires N-API addon")

public actual fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int =
    throw UnsupportedOperationException("getoptLong requires N-API addon")

public actual fun copyFileRange(fdIn: Int, offIn: Long?, fdOut: Int, offOut: Long?, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("copyFileRange requires N-API addon")

public actual fun fseeko64(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseeko64 requires N-API addon")

public actual fun fsetpos64(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fsetpos64 requires N-API addon")

public actual fun ftello64(stream: FILE?): Long =
    throw UnsupportedOperationException("ftello64 requires N-API addon")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob requires N-API addon")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr requires N-API addon")

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen64 requires N-API addon")
