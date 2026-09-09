// port-lint: source L4reShared.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import libc.cinterop.libc_memmem
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.useContents
import libc.cinterop.libc_cmsg_data
import libc.cinterop.libc_cmsg_firsthdr
import libc.cinterop.libc_cmsg_nxthdr

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if (mhdr == null) return null
    return memScoped {
        val mhdrPtr = alloc<platform.posix.msghdr>()
        mhdrPtr.msg_name = mhdr.msgName?.value?.toCPointer<ByteVar>()
        mhdrPtr.msg_namelen = mhdr.msgNamelen.toUInt()
        mhdrPtr.msg_iovlen = mhdr.msgIovlen.toULong()
        mhdrPtr.msg_control = mhdr.msgControl?.value?.toCPointer<ByteVar>()
        mhdrPtr.msg_controllen = mhdr.msgControllen.toULong()
        mhdrPtr.msg_flags = mhdr.msgFlags
        if (cmsg == null) {
            val result = libc_cmsg_firsthdr(mhdrPtr.ptr)
            if (result == null) null
            else result.reinterpret<platform.posix.cmsghdr>().useContents { Cmsghdr(cmsg_len.toUInt(), cmsg_level, cmsg_type) }
        } else {
            val cmsgPtr = alloc<platform.posix.cmsghdr>()
            cmsgPtr.cmsg_len = cmsg.cmsgLen.toULong()
            cmsgPtr.cmsg_level = cmsg.cmsgLevel
            cmsgPtr.cmsg_type = cmsg.cmsgType
            val result = libc_cmsg_nxthdr(mhdrPtr.ptr, cmsgPtr.ptr)
            if (result == null) null
            else result.reinterpret<platform.posix.cmsghdr>().useContents { Cmsghdr(cmsg_len.toUInt(), cmsg_level, cmsg_type) }
        }
    }
}

public actual fun cPUALLOCSIZE(count: CInt): ULong =
    throw UnsupportedOperationException("cPUALLOCSIZE requires manual FFI bridge — not yet implemented")

public actual fun cPUZERO(cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUZERO requires manual FFI bridge — not yet implemented")
}

public actual fun cPUSET(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUSET requires manual FFI bridge — not yet implemented")
}

public actual fun cPUCLR(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUCLR requires manual FFI bridge — not yet implemented")
}

public actual fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires manual FFI bridge — not yet implemented")

public actual fun cPUCOUNTS(size: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("cPUCOUNTS requires manual FFI bridge — not yet implemented")

public actual fun cPUCOUNT(cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("cPUCOUNT requires manual FFI bridge — not yet implemented")

public actual fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL requires manual FFI bridge — not yet implemented")

public actual fun rTLOCALADDR(flags: UInt): Boolean =
    throw UnsupportedOperationException("rTLOCALADDR requires manual FFI bridge — not yet implemented")

public actual fun iopl(level: CInt): CInt =
    throw UnsupportedOperationException("iopl requires manual FFI bridge — not yet implemented")

public actual fun ioperm(from: CULong, num: CULong, turnOn: CInt): CInt =
    throw UnsupportedOperationException("ioperm requires manual FFI bridge — not yet implemented")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead requires manual FFI bridge — not yet implemented")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite requires manual FFI bridge — not yet implemented")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync requires manual FFI bridge — not yet implemented")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError requires manual FFI bridge — not yet implemented")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn requires manual FFI bridge — not yet implemented")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend requires manual FFI bridge — not yet implemented")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel requires manual FFI bridge — not yet implemented")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio requires manual FFI bridge — not yet implemented")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    libc.cinterop.libc_pwritev(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    libc.cinterop.libc_preadv(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt, offset)

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getloadavg requires manual FFI bridge — not yet implemented")

public actual fun processVmReadv(pid: PidT, localIov: Iovec?, liovcnt: CULong, remoteIov: Iovec?, riovcnt: CULong, flags: CULong): Long =
    throw UnsupportedOperationException("processVmReadv requires manual FFI bridge — not yet implemented")

public actual fun processVmWritev(pid: PidT, localIov: Iovec?, liovcnt: CULong, remoteIov: Iovec?, riovcnt: CULong, flags: CULong): Long =
    throw UnsupportedOperationException("processVmWritev requires manual FFI bridge — not yet implemented")

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    throw UnsupportedOperationException("futimes requires manual FFI bridge — not yet implemented")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires manual FFI bridge — not yet implemented")

public actual fun abs(i: CInt): CInt =
    libc.cinterop.libc_abs(i)
public actual fun labs(i: CLong): CLong =
    libc.cinterop.libc_labs(i)
public actual fun rand(): CInt =
    libc.cinterop.libc_rand()
public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires manual FFI bridge — not yet implemented")
}

public actual fun lrand48(): CLong =
    libc.cinterop.libc_lrand48()
public actual fun nrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("nrand48 requires manual FFI bridge — not yet implemented")

public actual fun jrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("jrand48 requires manual FFI bridge — not yet implemented")

public actual fun srand48(seed: CLong) {
    throw UnsupportedOperationException("srand48 requires manual FFI bridge — not yet implemented")
}

public actual fun setpwent() {
    libc.cinterop.libc_setpwent()
}

public actual fun endpwent() {
    libc.cinterop.libc_endpwent()
}

public actual fun getpwent(): Passwd? =
    libc.cinterop.libc_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    libc.cinterop.libc_setgrent()
}

public actual fun endgrent() {
    libc.cinterop.libc_endgrent()
}

public actual fun getgrent(): Group? =
    libc.cinterop.libc_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun setspent() {
    throw UnsupportedOperationException("setspent requires manual FFI bridge — not yet implemented")
}

public actual fun endspent() {
    throw UnsupportedOperationException("endspent requires manual FFI bridge — not yet implemented")
}

public actual fun getspent(): Spwd? =
    throw UnsupportedOperationException("getspent requires manual FFI bridge — not yet implemented")

public actual fun getspnam(name: String?): Spwd? =
    throw UnsupportedOperationException("getspnam requires manual FFI bridge — not yet implemented")

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget requires manual FFI bridge — not yet implemented")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires manual FFI bridge — not yet implemented")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    libc.cinterop.libc_shmdt(shmaddr?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl requires manual FFI bridge — not yet implemented")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    libc.cinterop.libc_mprotect(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, prot)
public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation requires manual FFI bridge — not yet implemented")

public actual fun mremap(addr: COpaquePointer?, len: ULong, newLen: ULong, flags: CInt, vararg args: Any?): COpaquePointer? =
    throw UnsupportedOperationException("mremap requires manual FFI bridge — not yet implemented")

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree requires manual FFI bridge — not yet implemented")
}

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir requires manual FFI bridge — not yet implemented")
}

public actual fun telldir(dirp: DIR?): CLong =
    libc.cinterop.libc_telldir(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    libc.cinterop.libc_madvise(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, advice)
public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    libc.cinterop.libc_msync(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, flags)
public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfo(item: NlItem): String? =
    libc.cinterop.libc_nl_langinfo(item)?.toKString()

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL requires manual FFI bridge — not yet implemented")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedGetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libc.cinterop.libc_sched_get_priority_max(policy)

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    libc.cinterop.libc_settimeofday(tv?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), tz?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun semTimedwait(sem: SemT, abstime: Timespec?): CInt =
    libc.cinterop.libc_sem_timedwait(sem.value.toCPointer<kotlinx.cinterop.ByteVar>(), abstime?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun semGetvalue(sem: SemT, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue requires manual FFI bridge — not yet implemented")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CULong, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mount requires manual FFI bridge — not yet implemented")

public actual fun prctl(option: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("prctl requires manual FFI bridge — not yet implemented")

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("ppoll requires manual FFI bridge — not yet implemented")

public actual fun sethostname(name: String?, len: ULong): CInt =
    libc.cinterop.libc_sethostname(name, len)
public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libc.cinterop.libc_sched_get_priority_min(policy)

public actual fun sysinfo(info: Sysinfo?): CInt =
    throw UnsupportedOperationException("sysinfo requires manual FFI bridge — not yet implemented")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend requires manual FFI bridge — not yet implemented")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: SemT): CInt =
    libc.cinterop.libc_sem_close(sem?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires manual FFI bridge — not yet implemented")

public actual fun initgroups(user: String?, group: GidT): CInt =
    libc.cinterop.libc_initgroups(user, group.toInt())
public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun getgrnam(name: String?): Group? =
    libc.cinterop.libc_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun semUnlink(name: String?): CInt =
    libc.cinterop.libc_sem_unlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libc.cinterop.libc_daemon(nochdir, noclose)
public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait requires manual FFI bridge — not yet implemented")

public actual fun getgrgid(gid: GidT): Group? =
    libc.cinterop.libc_getgrgid(gid.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    libc.cinterop.libc_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    libc.cinterop.libc_faccessat(dirfd, pathname, mode, flags)
public actual fun setmntent(filename: String?, ty: String?): FILE? =
    throw UnsupportedOperationException("setmntent requires manual FFI bridge — not yet implemented")

public actual fun getmntent(stream: FILE?): Mntent? =
    throw UnsupportedOperationException("getmntent requires manual FFI bridge — not yet implemented")

public actual fun addmntent(stream: FILE?, mnt: Mntent?): CInt =
    throw UnsupportedOperationException("addmntent requires manual FFI bridge — not yet implemented")

public actual fun endmntent(streamp: FILE?): CInt =
    throw UnsupportedOperationException("endmntent requires manual FFI bridge — not yet implemented")

public actual fun hasmntopt(mnt: Mntent?, opt: String?): String? =
    throw UnsupportedOperationException("hasmntopt requires manual FFI bridge — not yet implemented")

public actual fun regcomp(preg: RegexT, pattern: String?, cflags: CInt): CInt =
    throw UnsupportedOperationException("regcomp requires manual FFI bridge — not yet implemented")

public actual fun regexec(preg: RegexT, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt =
    throw UnsupportedOperationException("regexec requires manual FFI bridge — not yet implemented")

public actual fun regerror(errcode: CInt, preg: RegexT, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror requires manual FFI bridge — not yet implemented")

public actual fun regfree(preg: RegexT) {
    throw UnsupportedOperationException("regfree requires manual FFI bridge — not yet implemented")
}

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv requires manual FFI bridge — not yet implemented")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("iconvClose requires manual FFI bridge — not yet implemented")

public actual fun gettid(): PidT =
    throw UnsupportedOperationException("gettid requires manual FFI bridge — not yet implemented")

public actual fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerCreate requires manual FFI bridge — not yet implemented")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerDelete requires manual FFI bridge — not yet implemented")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerGetoverrun requires manual FFI bridge — not yet implemented")

public actual fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerGettime requires manual FFI bridge — not yet implemented")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerSettime requires manual FFI bridge — not yet implemented")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? {
    val hPtr: CPointer<ByteVar>? = haystack?.value?.toCPointer()
    val nPtr: CPointer<ByteVar>? = needle?.value?.toCPointer()
    if (hPtr == null || nPtr == null) return null
    val result = libc.cinterop.libc_memmem(hPtr, haystacklen, nPtr, needlelen)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun schedGetcpu(): CInt =
    throw UnsupportedOperationException("schedGetcpu requires manual FFI bridge — not yet implemented")

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    throw UnsupportedOperationException("getoptLong requires manual FFI bridge — not yet implemented")

public actual fun copyFileRange(fdIn: CInt, offIn: Off64T?, fdOut: CInt, offOut: Off64T?, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("copyFileRange requires manual FFI bridge — not yet implemented")


public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko64 requires manual FFI bridge — not yet implemented")

public actual fun fsetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    throw UnsupportedOperationException("fsetpos64 requires manual FFI bridge — not yet implemented")

public actual fun ftello64(stream: FILE?): Off64T =
    throw UnsupportedOperationException("ftello64 requires manual FFI bridge — not yet implemented")

public actual fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt =
    throw UnsupportedOperationException("glob requires manual FFI bridge — not yet implemented")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlIteratePhdr requires manual FFI bridge — not yet implemented")

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen64 requires manual FFI bridge — not yet implemented")
