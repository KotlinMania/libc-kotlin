// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_getentropy
import libc.cinterop.libc_getrandom
import kotlinx.cinterop.toLong
import libc.cinterop.libc_memmem
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.useContents
import libc.cinterop.libc_cmsg_data
import libc.cinterop.libc_cmsg_firsthdr
import libc.cinterop.libc_cmsg_nxthdr
import kotlinx.cinterop.toKString

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

public actual fun nLAALIGN(len: CInt): CInt =
    throw UnsupportedOperationException("nLAALIGN requires manual FFI bridge — not yet implemented")

public actual fun sOEEOFFENDER(ee: SockExtendedErr?): Sockaddr? =
    throw UnsupportedOperationException("sOEEOFFENDER requires manual FFI bridge — not yet implemented")

public actual fun setgrent() {
    libc.cinterop.libc_setgrent()
}

public actual fun endgrent() {
    libc.cinterop.libc_endgrent()
}

public actual fun getgrent(): Group? =
    libc.cinterop.libc_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun getrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("getrlimit64 requires manual FFI bridge — not yet implemented")

public actual fun setrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("setrlimit64 requires manual FFI bridge — not yet implemented")

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    libc.cinterop.libc_getrlimit(resource, rlim?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    libc.cinterop.libc_setrlimit(resource, rlim?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    throw UnsupportedOperationException("prlimit requires manual FFI bridge — not yet implemented")

public actual fun prlimit64(pid: PidT, resource: CInt, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt =
    throw UnsupportedOperationException("prlimit64 requires manual FFI bridge — not yet implemented")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    libc.cinterop.libc_gettimeofday(tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), tz?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun mlock2(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("mlock2 requires manual FFI bridge — not yet implemented")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    libc.cinterop.libc_madvise(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, advice)
public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    libc.cinterop.libc_msync(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, flags)
public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    libc.cinterop.libc_mprotect(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, prot)
public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun preadv(fd: CInt, iov: Iovec?, count: CInt, offset: OffT): SsizeT =
    libc.cinterop.libc_preadv(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), count, offset)

public actual fun pwritev(fd: CInt, iov: Iovec?, count: CInt, offset: OffT): SsizeT =
    libc.cinterop.libc_pwritev(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), count, offset)

public actual fun processVmReadv(pid: PidT, localIov: Iovec?, localIovCount: CULong, remoteIov: Iovec?, remoteIovCount: CULong, flags: CULong): SsizeT =
    throw UnsupportedOperationException("processVmReadv requires manual FFI bridge — not yet implemented")

public actual fun processVmWritev(pid: PidT, localIov: Iovec?, localIovCount: CULong, remoteIov: Iovec?, remoteIovCount: CULong, flags: CULong): SsizeT =
    throw UnsupportedOperationException("processVmWritev requires manual FFI bridge — not yet implemented")

public actual fun ptrace(request: CInt, vararg args: Any?): CLong =
    throw UnsupportedOperationException("ptrace requires manual FFI bridge — not yet implemented")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libc.cinterop.libc_getpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libc.cinterop.libc_setpriority(which, who.toInt(), prio)

public actual fun schedCpualloc(count: ULong): CpuSetT? =
    throw UnsupportedOperationException("schedCpualloc requires manual FFI bridge — not yet implemented")

public actual fun schedCpufree(set: CpuSetT?) {
    throw UnsupportedOperationException("schedCpufree requires manual FFI bridge — not yet implemented")
}

public actual fun schedCpucount(setsize: ULong, set: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedCpucount requires manual FFI bridge — not yet implemented")

public actual fun schedGetcpu(): CInt =
    throw UnsupportedOperationException("schedGetcpu requires manual FFI bridge — not yet implemented")

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("mallocInfo requires manual FFI bridge — not yet implemented")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires manual FFI bridge — not yet implemented")

public actual fun utmpname(name: String?): CInt =
    throw UnsupportedOperationException("utmpname requires manual FFI bridge — not yet implemented")

public actual fun setutent() {
    throw UnsupportedOperationException("setutent requires manual FFI bridge — not yet implemented")
}

public actual fun getutent(): Utmp? =
    throw UnsupportedOperationException("getutent requires manual FFI bridge — not yet implemented")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir requires manual FFI bridge — not yet implemented")
}

public actual fun telldir(dirp: DIR?): CLong =
    libc.cinterop.libc_telldir(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("fallocate requires manual FFI bridge — not yet implemented")

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    throw UnsupportedOperationException("fallocate64 requires manual FFI bridge — not yet implemented")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libc.cinterop.libc_posix_fallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    throw UnsupportedOperationException("posixFallocate64 requires manual FFI bridge — not yet implemented")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("getxattr requires manual FFI bridge — not yet implemented")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("lgetxattr requires manual FFI bridge — not yet implemented")

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("fgetxattr requires manual FFI bridge — not yet implemented")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("setxattr requires manual FFI bridge — not yet implemented")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("lsetxattr requires manual FFI bridge — not yet implemented")

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("fsetxattr requires manual FFI bridge — not yet implemented")

public actual fun listxattr(path: String?, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("listxattr requires manual FFI bridge — not yet implemented")

public actual fun llistxattr(path: String?, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("llistxattr requires manual FFI bridge — not yet implemented")

public actual fun flistxattr(filedes: CInt, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("flistxattr requires manual FFI bridge — not yet implemented")

public actual fun removexattr(path: String?, name: String?): CInt =
    throw UnsupportedOperationException("removexattr requires manual FFI bridge — not yet implemented")

public actual fun lremovexattr(path: String?, name: String?): CInt =
    throw UnsupportedOperationException("lremovexattr requires manual FFI bridge — not yet implemented")

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    throw UnsupportedOperationException("fremovexattr requires manual FFI bridge — not yet implemented")

public actual fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt =
    throw UnsupportedOperationException("signalfd requires manual FFI bridge — not yet implemented")

public actual fun timerfdCreate(clock: ClockidT, flags: CInt): CInt =
    throw UnsupportedOperationException("timerfdCreate requires manual FFI bridge — not yet implemented")

public actual fun timerfdGettime(fd: CInt, currentValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdGettime requires manual FFI bridge — not yet implemented")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdSettime requires manual FFI bridge — not yet implemented")

public actual fun syscall(num: CLong, vararg args: Any?): CLong =
    throw UnsupportedOperationException("syscall requires manual FFI bridge — not yet implemented")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedGetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedSetaffinity requires manual FFI bridge — not yet implemented")

public actual fun epollCreate(size: CInt): CInt =
    throw UnsupportedOperationException("epollCreate requires manual FFI bridge — not yet implemented")

public actual fun epollCreate1(flags: CInt): CInt =
    throw UnsupportedOperationException("epollCreate1 requires manual FFI bridge — not yet implemented")

public actual fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("epollWait requires manual FFI bridge — not yet implemented")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt =
    throw UnsupportedOperationException("epollCtl requires manual FFI bridge — not yet implemented")

public actual fun unshare(flags: CInt): CInt =
    throw UnsupportedOperationException("unshare requires manual FFI bridge — not yet implemented")

public actual fun umount(target: String?): CInt =
    throw UnsupportedOperationException("umount requires manual FFI bridge — not yet implemented")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libc.cinterop.libc_sched_get_priority_max(policy)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("tee requires manual FFI bridge — not yet implemented")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    libc.cinterop.libc_settimeofday(tv?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), tz?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun splice(fdIn: CInt, offIn: LoffT?, fdOut: CInt, offOut: LoffT?, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("splice requires manual FFI bridge — not yet implemented")

public actual fun eventfd(initval: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("eventfd requires manual FFI bridge — not yet implemented")

public actual fun eventfdRead(fd: CInt, value: EventfdT?): CInt =
    throw UnsupportedOperationException("eventfdRead requires manual FFI bridge — not yet implemented")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    throw UnsupportedOperationException("eventfdWrite requires manual FFI bridge — not yet implemented")

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval requires manual FFI bridge — not yet implemented")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    libc.cinterop.libc_sem_timedwait(sem?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), abstime?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue requires manual FFI bridge — not yet implemented")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam requires manual FFI bridge — not yet implemented")

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    throw UnsupportedOperationException("setns requires manual FFI bridge — not yet implemented")

public actual fun swapoff(puath: String?): CInt =
    throw UnsupportedOperationException("swapoff requires manual FFI bridge — not yet implemented")

public actual fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("vmsplice requires manual FFI bridge — not yet implemented")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CULong, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mount requires manual FFI bridge — not yet implemented")

public actual fun personality(persona: CUInt): CInt =
    throw UnsupportedOperationException("personality requires manual FFI bridge — not yet implemented")

public actual fun prctl(option: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("prctl requires manual FFI bridge — not yet implemented")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam requires manual FFI bridge — not yet implemented")

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("ppoll requires manual FFI bridge — not yet implemented")

public actual fun schedGetscheduler(pid: PidT): CInt =
    libc.cinterop.libc_sched_getscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    libc.cinterop.libc_clock_nanosleep(clkId, flags, rqtp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), rmtp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun sethostname(name: String?, len: ULong): CInt =
    libc.cinterop.libc_sethostname(name, len)
public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libc.cinterop.libc_sched_get_priority_min(policy)

public actual fun sysinfo(info: Sysinfo?): CInt =
    throw UnsupportedOperationException("sysinfo requires manual FFI bridge — not yet implemented")

public actual fun umount2(target: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("umount2 requires manual FFI bridge — not yet implemented")

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    throw UnsupportedOperationException("swapon requires manual FFI bridge — not yet implemented")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler requires manual FFI bridge — not yet implemented")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: OffT?, count: ULong): SsizeT =
    throw UnsupportedOperationException("sendfile requires manual FFI bridge — not yet implemented")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: Off64T?, count: ULong): SsizeT =
    throw UnsupportedOperationException("sendfile64 requires manual FFI bridge — not yet implemented")

public actual fun setfsgid(gid: GidT): CInt =
    throw UnsupportedOperationException("setfsgid requires manual FFI bridge — not yet implemented")

public actual fun setfsuid(uid: UidT): CInt =
    throw UnsupportedOperationException("setfsuid requires manual FFI bridge — not yet implemented")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend requires manual FFI bridge — not yet implemented")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires manual FFI bridge — not yet implemented")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: SemT?): CInt =
    libc.cinterop.libc_sem_close(sem?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires manual FFI bridge — not yet implemented")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun getgrnam(name: String?): Group? =
    libc.cinterop.libc_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun semUnlink(name: String?): CInt =
    libc.cinterop.libc_sem_unlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libc.cinterop.libc_daemon(nochdir, noclose)
public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    libc.cinterop.libc_sigtimedwait(set?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>(), info?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), timeout?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait requires manual FFI bridge — not yet implemented")

public actual fun getgrgid(gid: GidT): Group? =
    libc.cinterop.libc_getgrgid(gid.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist requires GidT? pointer bridge — not yet implemented"), groups?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), ngroups?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun initgroups(user: String?, group: GidT): CInt =
    libc.cinterop.libc_initgroups(user, group.toInt())
public actual fun popen(command: String?, mode: String?): FILE? =
    libc.cinterop.libc_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    libc.cinterop.libc_faccessat(dirfd, pathname, mode, flags)
public actual fun errno(): CInt? =
    throw UnsupportedOperationException("errno requires manual FFI bridge — not yet implemented")

public actual fun inotifyRmWatch(fd: CInt, wd: UInt): CInt =
    throw UnsupportedOperationException("inotifyRmWatch requires manual FFI bridge — not yet implemented")

public actual fun inotifyInit(): CInt =
    throw UnsupportedOperationException("inotifyInit requires manual FFI bridge — not yet implemented")

public actual fun inotifyInit1(flags: CInt): CInt =
    throw UnsupportedOperationException("inotifyInit1 requires manual FFI bridge — not yet implemented")

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    throw UnsupportedOperationException("inotifyAddWatch requires manual FFI bridge — not yet implemented")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    throw UnsupportedOperationException("regcomp requires manual FFI bridge — not yet implemented")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt =
    throw UnsupportedOperationException("regexec requires manual FFI bridge — not yet implemented")

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror requires manual FFI bridge — not yet implemented")

public actual fun regfree(preg: RegexT?) {
    throw UnsupportedOperationException("regfree requires manual FFI bridge — not yet implemented")
}

public actual fun androidSetAbortMessage(msg: String?) {
    throw UnsupportedOperationException("androidSetAbortMessage requires manual FFI bridge — not yet implemented")
}

public actual fun gettid(): PidT =
    throw UnsupportedOperationException("gettid requires manual FFI bridge — not yet implemented")

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    throw UnsupportedOperationException("tgkill requires manual FFI bridge — not yet implemented")

public actual fun getauxval(type: CULong): CULong =
    throw UnsupportedOperationException("getauxval requires manual FFI bridge — not yet implemented")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT {
    val cPtr: CPointer<ByteVar>? = buf?.value?.toCPointer()
    return libc.cinterop.libc_getrandom(cPtr, buflen, flags)
}

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt {
    val cPtr: CPointer<ByteVar>? = buf?.value?.toCPointer()
    return libc.cinterop.libc_getentropy(cPtr, buflen)
}

public actual fun systemPropertySet(name: String?, value: String?): CInt =
    throw UnsupportedOperationException("systemPropertySet requires manual FFI bridge — not yet implemented")

public actual fun systemPropertyGet(name: String?, value: String?): CInt =
    throw UnsupportedOperationException("systemPropertyGet requires manual FFI bridge — not yet implemented")

public actual fun systemPropertyFind(name: String?): PropInfo? =
    throw UnsupportedOperationException("systemPropertyFind requires manual FFI bridge — not yet implemented")

public actual fun systemPropertyFindNth(n: CUInt): PropInfo? =
    throw UnsupportedOperationException("systemPropertyFindNth requires manual FFI bridge — not yet implemented")

public actual fun arc4randomBuf(buf: COpaquePointer?, n: ULong) {
    throw UnsupportedOperationException("arc4randomBuf requires manual FFI bridge — not yet implemented")
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires manual FFI bridge — not yet implemented")

public actual fun dirname(path: String?): String? =
    libc.cinterop.libc_dirname(path)?.toKString()

public actual fun basename(path: String?): String? =
    libc.cinterop.libc_basename(path)?.toKString()

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    throw UnsupportedOperationException("getoptLong requires manual FFI bridge — not yet implemented")

public actual fun sync() {
    throw UnsupportedOperationException("sync requires manual FFI bridge — not yet implemented")
}

public actual fun syncfs(fd: CInt): CInt =
    throw UnsupportedOperationException("syncfs requires manual FFI bridge — not yet implemented")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? {
    val hPtr: CPointer<ByteVar>? = haystack?.value?.toCPointer()
    val nPtr: CPointer<ByteVar>? = needle?.value?.toCPointer()
    if (hPtr == null || nPtr == null) return null
    val result = libc.cinterop.libc_memmem(hPtr, haystacklen, nPtr, needlelen)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun freadUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("freadUnlocked requires manual FFI bridge — not yet implemented")

public actual fun fwriteUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwriteUnlocked requires manual FFI bridge — not yet implemented")

public actual fun fflushUnlocked(stream: FILE?): CInt =
    throw UnsupportedOperationException("fflushUnlocked requires manual FFI bridge — not yet implemented")

public actual fun fgetsUnlocked(buf: String?, size: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgetsUnlocked requires manual FFI bridge — not yet implemented")

public actual fun klogctl(syslogType: CInt, bufp: String?, len: CInt): CInt =
    throw UnsupportedOperationException("klogctl requires manual FFI bridge — not yet implemented")

public actual fun memfdCreate(name: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("memfdCreate requires manual FFI bridge — not yet implemented")

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("renameat2 requires manual FFI bridge — not yet implemented")

public actual fun clone(cb: ((COpaquePointer?) -> CInt)?, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("clone requires manual FFI bridge — not yet implemented")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlIteratePhdr requires manual FFI bridge — not yet implemented")

public actual fun systemPropertyForeach(callback: ((PropInfo?, COpaquePointer?) -> Unit)?, cookie: COpaquePointer?): CInt =
    throw UnsupportedOperationException("systemPropertyForeach requires manual FFI bridge for ambiguous type")
