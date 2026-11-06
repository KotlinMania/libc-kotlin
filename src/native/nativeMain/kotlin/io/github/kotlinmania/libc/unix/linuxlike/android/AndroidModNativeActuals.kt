@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_setgrent()
}

public actual fun endgrent() {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_endgrent()
}

public actual fun getgrent(): Group? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun getrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_setrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_prlimit(pid, resource, newLimit?.value?.toCPointer<ByteVar>(), oldLimit?.value?.toCPointer<ByteVar>())

public actual fun prlimit64(pid: PidT, resource: CInt, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_prlimit64(pid, resource, newLimit?.value?.toCPointer<ByteVar>(), oldLimit?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_strerror_r(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_mlock2(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun preadv(fd: CInt, iov: Iovec?, count: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_preadv(fd, iov?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwritev(fd: CInt, iov: Iovec?, count: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun processVmReadv(pid: PidT, localIov: Iovec?, localIovCount: CUlong, remoteIov: Iovec?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_process_vm_readv(pid, localIov?.value?.toCPointer<ByteVar>(), localIovCount, remoteIov?.value?.toCPointer<ByteVar>(), remoteIovCount, flags)

public actual fun processVmWritev(pid: PidT, localIov: Iovec?, localIovCount: CUlong, remoteIov: Iovec?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_process_vm_writev(pid, localIov?.value?.toCPointer<ByteVar>(), localIovCount, remoteIov?.value?.toCPointer<ByteVar>(), remoteIovCount, flags)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_setpriority(which, who, prio)

public actual fun schedCpualloc(count: SizeT): io.github.kotlinmania.libc.CpuSetT? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sched_cpualloc(count)?.let { COpaquePointer(it.toLong()) }

public actual fun schedCpufree(set: io.github.kotlinmania.libc.CpuSetT?) {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sched_cpufree(set?.value?.toCPointer<ByteVar>())
}

public actual fun schedCpucount(setsize: SizeT, set: CpuSetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sched_cpucount(setsize, set?.value?.toCPointer<ByteVar>())

public actual fun schedGetcpu(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sched_getcpu()

public actual fun mallinfo(): io.github.kotlinmania.libc.Mallinfo =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_mallinfo()

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_malloc_info(options, stream?.handle?.toCPointer<ByteVar>())

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_malloc_usable_size(ptr?.value?.toCPointer<ByteVar>())

public actual fun utmpname(name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_utmpname(name)

public actual fun setutent() {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_setutent()
}

public actual fun getutent(): Utmp? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getutent()?.let { COpaquePointer(it.toLong()) }

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_fallocate(fd, mode, offset, len)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_fallocate64(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_posix_fallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_posix_fallocate64(fd, offset, len)

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_lgetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_fgetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_setxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_lsetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_fsetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_listxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_llistxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_flistxattr(filedes, list?.value?.toCPointer<ByteVar>(), size)

public actual fun removexattr(path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_lremovexattr(path, name)

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_fremovexattr(filedes, name)

public actual fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_signalfd(fd, mask?.value?.toCPointer<ByteVar>(), flags)

public actual fun timerfdCreate(clock: ClockidT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_timerfd_create(clock, flags)

public actual fun timerfdGettime(fd: CInt, currentValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_timerfd_gettime(fd, currentValue?.value?.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_timerfd_settime(fd, flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sched_getaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sched_setaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun epollCreate(size: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_epoll_create(size)

public actual fun epollCreate1(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_epoll_create1(flags)

public actual fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_epoll_wait(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_epoll_ctl(epfd, op, fd, event?.value?.toCPointer<ByteVar>())

public actual fun unshare(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_unshare(flags)

public actual fun umount(target: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_umount(target)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sched_get_priority_max(policy)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_tee(fdIn, fdOut, len, flags)

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun splice(fdIn: CInt, offIn: CLonglong?, fdOut: CInt, offOut: CLonglong?, len: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_splice(fdIn, offIn?.value?.toCPointer<ByteVar>(), fdOut, offOut?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_eventfd(initval, flags)

public actual fun eventfdRead(fd: CInt, value: ULong?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_eventfd_read(fd, value?.value?.toCPointer<ByteVar>())

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_eventfd_write(fd, value)

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sched_rr_get_interval(pid, tp?.value?.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sem_timedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sem_getvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sched_setparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_setns(fd, nstype)

public actual fun swapoff(puath: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_swapoff(puath)

public actual fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_vmsplice(fd, iov?.value?.toCPointer<ByteVar>(), nrSegs, flags)

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_mount(src, target, fstype, flags, data?.value?.toCPointer<ByteVar>())

public actual fun personality(persona: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_personality(persona)

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sched_getparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_ppoll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sched_getscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_clock_nanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun sethostname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sethostname(name, len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sched_get_priority_min(policy)

public actual fun sysinfo(info: Sysinfo?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sysinfo(info?.value?.toCPointer<ByteVar>())

public actual fun umount2(target: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_umount2(target, flags)

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_swapon(path, swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sched_setscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: CLong?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sendfile(outFd, inFd, offset?.value?.toCPointer<ByteVar>(), count)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: Off64T?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sendfile64(outFd, inFd, offset?.value?.toCPointer<ByteVar>(), count)

public actual fun setfsgid(gid: GidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_setfsgid(gid)

public actual fun setfsuid(uid: UidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_setfsuid(uid)

public actual fun sigsuspend(mask: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getgrgid_r(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: SemT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sem_close(sem?.value?.toCPointer<ByteVar>())

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getgrnam_r(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrnam(name: String?): Group? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sem_unlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_daemon(nochdir, noclose)

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): Group? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getgrouplist(user, group, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun initgroups(user: String?, group: GidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_initgroups(user, group)

public actual fun popen(command: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_faccessat(dirfd, pathname, mode, flags)

public actual fun errno(): CInt? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_errno()?.let { COpaquePointer(it.toLong()) }

public actual fun inotifyRmWatch(fd: CInt, wd: UInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_inotify_rm_watch(fd, wd)

public actual fun inotifyInit(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_inotify_init()

public actual fun inotifyInit1(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_inotify_init1(flags)

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_inotify_add_watch(fd, path, mask)

public actual fun regcomp(preg: io.github.kotlinmania.libc.RegexT?, pattern: String?, cflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_regcomp(preg?.value?.toCPointer<ByteVar>(), pattern, cflags)

public actual fun regexec(preg: io.github.kotlinmania.libc.RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_regexec(preg?.value?.toCPointer<ByteVar>(), input, nmatch, pmatch?.value?.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: io.github.kotlinmania.libc.RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_regerror(errcode, preg?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: io.github.kotlinmania.libc.RegexT?) {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_regfree(preg?.value?.toCPointer<ByteVar>())
}

public actual fun androidSetAbortMessage(msg: String?) {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_android_set_abort_message(msg)
}

public actual fun gettid(): PidT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_gettid()

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_tgkill(tgid, tid, sig)

public actual fun getauxval(type: CUlong): CUlong =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getauxval(type)

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun systemPropertySet(name: String?, value: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_system_property_set(name, value)

public actual fun systemPropertyGet(name: String?, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_system_property_get(name, value?.value?.toCPointer<ByteVar>())

public actual fun systemPropertyFind(name: String?): PropInfo? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_system_property_find(name)?.let { COpaquePointer(it.toLong()) }

public actual fun systemPropertyFindNth(n: CUint): PropInfo? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_system_property_find_nth(n)?.let { COpaquePointer(it.toLong()) }

public actual fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_system_property_foreach(callback.toInt(), cookie?.value?.toCPointer<ByteVar>())

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_dl_iterate_phdr(callback?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun arc4random(): UInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_arc4random()

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_arc4random_uniform(upperBound)

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_arc4random_buf(buf?.value?.toCPointer<ByteVar>(), n)
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_reallocarray(ptr?.value?.toCPointer<ByteVar>(), nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun dirname(path: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_dirname(path)?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_basename(path)?.let { COpaquePointer(it.toLong()) }

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_getopt_long(argc, argv?.value?.toCPointer<ByteVar>(), optstring, longopts?.value?.toCPointer<ByteVar>(), longindex?.value?.toCPointer<ByteVar>())

public actual fun sync() {
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_sync()
}

public actual fun syncfs(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_syncfs(fd)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_fread_unlocked(buf?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fwriteUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_fwrite_unlocked(buf?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fflushUnlocked(stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_fflush_unlocked(stream?.handle?.toCPointer<ByteVar>())

public actual fun fgetsUnlocked(buf: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_fgets_unlocked(buf?.value?.toCPointer<ByteVar>(), size, stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_klogctl(syslogType, bufp?.value?.toCPointer<ByteVar>(), len)

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_memfd_create(name, flags)

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libc_android_mod_renameat2(olddirfd, oldpath, newdirfd, newpath, flags)
