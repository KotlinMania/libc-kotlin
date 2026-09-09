// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_getentropy
import libc.cinterop.libc_getrandom
import libc.cinterop.libc_posix_madvise
import kotlinx.cinterop.toLong
import libc.cinterop.libc_memmem
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.useContents
import libc.cinterop.libc_cmsg_data
import libc.cinterop.libc_cmsg_firsthdr
import libc.cinterop.libc_cmsg_nxthdr
import kotlinx.cinterop.toKString

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

public actual fun cPUALLOCSIZE(count: CInt): ULong =
    throw UnsupportedOperationException("cPUALLOCSIZE requires manual FFI bridge — not yet implemented")

public actual fun cPUCOUNTS(size: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("cPUCOUNTS requires manual FFI bridge — not yet implemented")

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

public actual fun cPUCOUNT(cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("cPUCOUNT requires manual FFI bridge — not yet implemented")

public actual fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL requires manual FFI bridge — not yet implemented")

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? {
    if (mhdr == null) return null
    return memScoped {
        val mhdrPtr = alloc<platform.posix.msghdr>()
        mhdrPtr.msg_name = mhdr.msgName?.value?.toCPointer<ByteVar>()
        mhdrPtr.msg_namelen = mhdr.msgNamelen.toUInt()
        mhdrPtr.msg_iovlen = mhdr.msgIovlen.toULong()
        mhdrPtr.msg_control = mhdr.msgControl?.value?.toCPointer<ByteVar>()
        mhdrPtr.msg_controllen = mhdr.msgControllen.toULong()
        mhdrPtr.msg_flags = mhdr.msgFlags
        val result = libc_cmsg_firsthdr(mhdrPtr.ptr)
        if (result == null) null
        else result.reinterpret<platform.posix.cmsghdr>().useContents { Cmsghdr(cmsg_len.toUInt(), cmsg_level, cmsg_type) }
    }
}

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

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? {
    if (cmsg == null) return null
    return memScoped {
        val cPtr = alloc<platform.posix.cmsghdr>()
        cPtr.cmsg_len = cmsg.cmsgLen.toULong()
        cPtr.cmsg_level = cmsg.cmsgLevel
        cPtr.cmsg_type = cmsg.cmsgType
        val result = libc_cmsg_data(cPtr.ptr)
        if (result == null) null else COpaquePointer(result.toLong())
    }
}

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait requires manual FFI bridge — not yet implemented")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo requires manual FFI bridge — not yet implemented")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask requires manual FFI bridge — not yet implemented")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend requires manual FFI bridge — not yet implemented")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libc.cinterop.libc_pthread_kill(thread?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), sig)

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    libc.cinterop.libc_sigtimedwait(set?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>(), info?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), timeout?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires manual FFI bridge — not yet implemented")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR requires manual FFI bridge — not yet implemented")

public actual fun ctimeR(timep: TimeT?, buf: String?): String? =
    throw UnsupportedOperationException("ctimeR requires manual FFI bridge — not yet implemented")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime requires manual FFI bridge — not yet implemented")

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    libc.cinterop.libc_clock_settime(clkId, tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    libc.cinterop.libc_clock_gettime(clkId, tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    libc.cinterop.libc_clock_getres(clkId, tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT?): CInt =
    throw UnsupportedOperationException("timerCreate requires manual FFI bridge — not yet implemented")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerDelete requires manual FFI bridge — not yet implemented")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerSettime requires manual FFI bridge — not yet implemented")

public actual fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerGettime requires manual FFI bridge — not yet implemented")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerGetoverrun requires manual FFI bridge — not yet implemented")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    libc.cinterop.libc_clock_nanosleep(clkId, flags, rqtp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), rmtp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid requires manual FFI bridge — not yet implemented")

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    throw UnsupportedOperationException("futimes requires manual FFI bridge — not yet implemented")

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("lutimes requires manual FFI bridge — not yet implemented")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    libc.cinterop.libc_settimeofday(tv?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), tz?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    throw UnsupportedOperationException("getitimer requires manual FFI bridge — not yet implemented")

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    throw UnsupportedOperationException("setitimer requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    libc.cinterop.libc_gettimeofday(tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), tz?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun futimesat(fd: CInt, path: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("futimesat requires manual FFI bridge — not yet implemented")

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    libc.cinterop.libc_getrlimit(resource, rlim?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    libc.cinterop.libc_setrlimit(resource, rlim?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libc.cinterop.libc_getpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libc.cinterop.libc_setpriority(which, who.toInt(), prio)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR requires manual FFI bridge — not yet implemented")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR requires manual FFI bridge — not yet implemented")

public actual fun getpwent(): Passwd? =
    libc.cinterop.libc_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setpwent() {
    libc.cinterop.libc_setpwent()
}

public actual fun endpwent() {
    libc.cinterop.libc_endpwent()
}

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires manual FFI bridge — not yet implemented")

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    throw UnsupportedOperationException("ifFreenameindex requires manual FFI bridge — not yet implemented")
}

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    libc.cinterop.libc_readv(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    libc.cinterop.libc_writev(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    libc.cinterop.libc_mkfifoat_int(dirfd, pathname, mode.toInt())
public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    libc.cinterop.libc_mknodat(dirfd, pathname, mode.toInt(), dev.toULong())

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    libc.cinterop.libc_utimensat(dirfd, path, times?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), flag)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    libc.cinterop.libc_futimens(fd, times?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun dlfork(`val`: CInt) {
    throw UnsupportedOperationException("dlfork requires manual FFI bridge — not yet implemented")
}

public actual fun accept4(s: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt =
    throw UnsupportedOperationException("accept4 requires manual FFI bridge — not yet implemented")

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires manual FFI bridge — not yet implemented")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge — not yet implemented")

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg requires manual FFI bridge — not yet implemented")

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg requires manual FFI bridge — not yet implemented")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, sevlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("ppoll requires manual FFI bridge — not yet implemented")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    libc.cinterop.libc_newlocale(mask, locale, base?.value?.toCPointer<kotlinx.cinterop.ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")
}

public actual fun duplocale(base: LocaleT): LocaleT =
    libc.cinterop.libc_duplocale(base?.value?.toCPointer<kotlinx.cinterop.ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale requires manual FFI bridge — not yet implemented")

public actual fun semInit(sem: SemT, pshared: CInt, value: CUInt): CInt =
    libc.cinterop.libc_sem_init(sem?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), pshared, value)

public actual fun semDestroy(sem: SemT): CInt =
    libc.cinterop.libc_sem_destroy(sem?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: SemT): CInt =
    libc.cinterop.libc_sem_close(sem?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun semUnlink(name: String?): CInt =
    libc.cinterop.libc_sem_unlink(name)

public actual fun semTimedwait(sem: SemT, abstime: Timespec?): CInt =
    libc.cinterop.libc_sem_timedwait(sem.value.toCPointer<kotlinx.cinterop.ByteVar>(), abstime?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun semGetvalue(sem: SemT, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue requires manual FFI bridge — not yet implemented")

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("clearenv requires manual FFI bridge — not yet implemented")

public actual fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("ptsnameR requires manual FFI bridge — not yet implemented")

public actual fun getpt(): CInt =
    throw UnsupportedOperationException("getpt requires manual FFI bridge — not yet implemented")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getloadavg requires manual FFI bridge — not yet implemented")

public actual fun abs(i: CInt): CInt =
    libc.cinterop.libc_abs(i)
public actual fun arc4randomBuf(buf: COpaquePointer?, size: ULong) {
    throw UnsupportedOperationException("arc4randomBuf requires manual FFI bridge — not yet implemented")
}

public actual fun labs(i: CLong): CLong =
    libc.cinterop.libc_labs(i)
public actual fun mkostemp(template: String?, flags: CInt): CInt =
    libc.cinterop.libc_mkostemp(template, flags)
public actual fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt =
    libc.cinterop.libc_mkostemps(template, suffixlen, flags)
public actual fun mkstemps(template: String?, suffixlen: CInt): CInt =
    libc.cinterop.libc_mkstemps(template, suffixlen)
public actual fun rand(): CInt =
    libc.cinterop.libc_rand()
public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires manual FFI bridge — not yet implemented")

public actual fun reallocf(ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocf requires manual FFI bridge — not yet implemented")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires manual FFI bridge — not yet implemented")
}

public actual fun jrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("jrand48 requires manual FFI bridge — not yet implemented")

public actual fun lcong48(p: CUShort?) {
    throw UnsupportedOperationException("lcong48 requires manual FFI bridge — not yet implemented")
}

public actual fun lrand48(): CLong =
    libc.cinterop.libc_lrand48()
public actual fun mrand48(): CLong =
    libc.cinterop.libc_mrand48()
public actual fun nrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("nrand48 requires manual FFI bridge — not yet implemented")

public actual fun seed48(xseed: CUShort?): CUShort? =
    throw UnsupportedOperationException("seed48 requires manual FFI bridge — not yet implemented")

public actual fun srand48(seed: CLong) {
    throw UnsupportedOperationException("srand48 requires manual FFI bridge — not yet implemented")
}

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    libc.cinterop.libc_mprotect(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, prot)
public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    libc.cinterop.libc_msync(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, flags)
public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt {
    val cPtr: CPointer<ByteVar>? = addr?.value?.toCPointer()
    return libc.cinterop.libc_posix_madvise(cPtr, len, advice)
}

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    libc.cinterop.libc_madvise(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, advice)
public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    libc.cinterop.libc_shm_open(name, oflag, mode.toInt())

public actual fun shmUnlink(name: String?): CInt =
    libc.cinterop.libc_shm_unlink(name)

public actual fun explicitBzero(s: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero requires manual FFI bridge — not yet implemented")
}

public actual fun ffs(value: CInt): CInt =
    libc.cinterop.libc_ffs(value)
public actual fun ffsl(value: CLong): CInt =
    libc.cinterop.libc_ffsl(value)
public actual fun ffsll(value: CLongLong): CInt =
    libc.cinterop.libc_ffsll(value)
public actual fun fls(value: CInt): CInt =
    libc.cinterop.libc_fls(value)
public actual fun flsl(value: CLong): CInt =
    libc.cinterop.libc_flsl(value)
public actual fun flsll(value: CLongLong): CInt =
    libc.cinterop.libc_flsll(value)
public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    throw UnsupportedOperationException("strcasecmpL requires manual FFI bridge — not yet implemented")

public actual fun strncasecmpL(s1: String?, s2: String?, n: ULong, loc: LocaleT): CInt =
    throw UnsupportedOperationException("strncasecmpL requires manual FFI bridge — not yet implemented")

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("timingsafeBcmp requires manual FFI bridge — not yet implemented")

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("timingsafeMemcmp requires manual FFI bridge — not yet implemented")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? {
    val hPtr: CPointer<ByteVar>? = haystack?.value?.toCPointer()
    val nPtr: CPointer<ByteVar>? = needle?.value?.toCPointer()
    if (hPtr == null || nPtr == null) return null
    val result = libc.cinterop.libc_memmem(hPtr, haystacklen, nPtr, needlelen)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires manual FFI bridge — not yet implemented")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires manual FFI bridge — not yet implemented")

public actual fun strsep(string: COpaquePointer?, delim: String?): String? =
    throw UnsupportedOperationException("strsep requires manual FFI bridge — not yet implemented")

public actual fun basename(path: String?): String? =
    libc.cinterop.libc_basename(path)?.toKString()

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libc.cinterop.libc_daemon(nochdir, noclose)
public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 requires manual FFI bridge — not yet implemented")

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("eaccess requires manual FFI bridge — not yet implemented")

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("euidaccess requires manual FFI bridge — not yet implemented")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe requires manual FFI bridge — not yet implemented")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    libc.cinterop.libc_faccessat(dirfd, pathname, mode, flags)
public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve requires manual FFI bridge — not yet implemented")

public actual fun fdatasync(fd: CInt): CInt =
    libc.cinterop.libc_fdatasync(fd)
public actual fun getdomainname(name: String?, len: ULong): CInt =
    libc.cinterop.libc_getdomainname(name, len)
public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt {
    val cPtr: CPointer<ByteVar>? = buf?.value?.toCPointer()
    return libc.cinterop.libc_getentropy(cPtr, buflen)
}

public actual fun gethostid(): CLong =
    libc.cinterop.libc_gethostid()
public actual fun getpagesize(): CInt =
    libc.cinterop.libc_getpagesize()
public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    throw UnsupportedOperationException("getpeereid requires manual FFI bridge — not yet implemented")

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 requires manual FFI bridge — not yet implemented")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires manual FFI bridge — not yet implemented")

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups requires manual FFI bridge — not yet implemented")

public actual fun sethostname(name: String?, len: ULong): CInt =
    libc.cinterop.libc_sethostname(name, len)
public actual fun vhangup(): CInt =
    throw UnsupportedOperationException("vhangup requires manual FFI bridge — not yet implemented")

public actual fun getdtablesize(): CInt =
    libc.cinterop.libc_getdtablesize()
public actual fun sync() {
    throw UnsupportedOperationException("sync requires manual FFI bridge — not yet implemented")
}

public actual fun errno(): CInt? =
    throw UnsupportedOperationException("errno requires manual FFI bridge — not yet implemented")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam requires manual FFI bridge — not yet implemented")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam requires manual FFI bridge — not yet implemented")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler requires manual FFI bridge — not yet implemented")

public actual fun schedGetscheduler(pid: PidT): CInt =
    libc.cinterop.libc_sched_getscheduler(pid)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libc.cinterop.libc_sched_get_priority_max(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libc.cinterop.libc_sched_get_priority_min(policy)

public actual fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval requires manual FFI bridge — not yet implemented")

public actual fun schedGetcpu(): CInt =
    throw UnsupportedOperationException("schedGetcpu requires manual FFI bridge — not yet implemented")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: ULong, mask: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedGetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedSetaffinity requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadCancel requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, shared: CInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, shared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierWait requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadGetcpuclockid requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT, abstime: Timespec?): CInt =
    libc.cinterop.libc_pthread_mutex_timedlock(lock.value.toCPointer<kotlinx.cinterop.ByteVar>(), abstime?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadMutexattrGetprotocol(attr: PthreadMutexattrT, protocol: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetprotocol requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetprotocol(attr: PthreadMutexattrT, protocol: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetprotocol requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_destroy(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    libc.cinterop.libc_pthread_spin_init(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>(), pshared)

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_lock(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_trylock(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_unlock(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT, `val`: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT, `val`: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    throw UnsupportedOperationException("pthreadSetschedprio requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadGetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT): CInt =
    throw UnsupportedOperationException("pthreadGetattrNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadSetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp requires PthreadT bridge — not yet implemented"), name)


public actual fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT {
    val cPtr: CPointer<ByteVar>? = buf?.value?.toCPointer()
    return libc.cinterop.libc_getrandom(cPtr, buflen, flags)
}

public actual fun mount(src: String?, target: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("mount requires manual FFI bridge — not yet implemented")

public actual fun umount(target: String?): CInt =
    throw UnsupportedOperationException("umount requires manual FFI bridge — not yet implemented")

public actual fun cygwinUmount(target: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("cygwinUmount requires manual FFI bridge — not yet implemented")

public actual fun dirfd(dirp: DIR?): CInt =
    libc.cinterop.libc_dirfd(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir requires manual FFI bridge — not yet implemented")
}

public actual fun telldir(dirp: DIR?): CLong =
    libc.cinterop.libc_telldir(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun uname(buf: Utsname?): CInt =
    libc.cinterop.libc_uname(buf?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT, flags: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT, flags: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT, flags: CInt?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT, flags: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddchdir(actions: PosixSpawnFileActionsT, path: String?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdir requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddfchdir(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdir requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT, path: String?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp requires manual FFI bridge — not yet implemented")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty requires manual FFI bridge — not yet implemented")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun getgrgid(gid: GidT): Group? =
    libc.cinterop.libc_getgrgid(gid.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires manual FFI bridge — not yet implemented")

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist requires GidT? pointer bridge — not yet implemented"), groups?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), ngroups?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun getgrnam(name: String?): Group? =
    libc.cinterop.libc_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires manual FFI bridge — not yet implemented")

public actual fun initgroups(user: String?, group: GidT): CInt =
    libc.cinterop.libc_initgroups(user, group.toInt())
public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs requires manual FFI bridge — not yet implemented")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs requires manual FFI bridge — not yet implemented")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise requires manual FFI bridge — not yet implemented")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libc.cinterop.libc_posix_fallocate(fd, offset, len)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("fallocate requires manual FFI bridge — not yet implemented")

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent requires manual FFI bridge — not yet implemented")
}

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires manual FFI bridge — not yet implemented")

public actual fun getutxid(id: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires manual FFI bridge — not yet implemented")

public actual fun getutxline(line: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires manual FFI bridge — not yet implemented")

public actual fun pututxline(utmpx: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires manual FFI bridge — not yet implemented")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent requires manual FFI bridge — not yet implemented")
}

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname requires manual FFI bridge — not yet implemented")

public actual fun updwtmpx(file: String?, utmpx: Utmpx?) {
    throw UnsupportedOperationException("updwtmpx requires manual FFI bridge — not yet implemented")
}

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?, arg: COpaquePointer?) {
    throw UnsupportedOperationException("qsortR requires manual FFI bridge — not yet implemented")
}

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadAtfork requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(native: PthreadT, attr: PthreadAttrT, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("pthreadSigqueue requires manual FFI bridge for ambiguous type")
