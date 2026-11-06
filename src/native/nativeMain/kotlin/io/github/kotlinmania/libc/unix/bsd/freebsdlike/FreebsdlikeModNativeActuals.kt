@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun semDestroy(sem: SemT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sem_destroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sem_init(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_daemon(nochdir, noclose)

public actual fun gettimeofday(tp: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun accept4(s: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_accept4(s, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>(), flags)

public actual fun chflags(path: String?, flags: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_chflags(path, flags)

public actual fun chflagsat(fd: CInt, path: String?, flags: CUlong, atflag: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_chflagsat(fd, path, flags, atflag)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_clock_nanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_clock_getres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_clock_gettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_clock_settime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_clock_getcpuclockid(pid, clkId?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_getcpuclockid(thread.toInt(), clkId?.value?.toCPointer<ByteVar>())

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun duplocale(base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_duplocale(base.toInt())

public actual fun endutxent() {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_endutxent()
}

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_fchflags(fd, flags)

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_getgrent_r(grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_getpwent_r(pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_getgrouplist(name, basegid, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun getpriority(which: CInt, who: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_getpriority(which, who)

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_getresgid(rgid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>(), sgid?.value?.toCPointer<ByteVar>())

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_getresuid(ruid?.value?.toCPointer<ByteVar>(), euid?.value?.toCPointer<ByteVar>(), suid?.value?.toCPointer<ByteVar>())

public actual fun getutxent(): Utmpx? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_initgroups(name, basegid)

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_kevent(kq, changelist?.value?.toCPointer<ByteVar>(), nchanges, eventlist?.value?.toCPointer<ByteVar>(), nevents, timeout?.value?.toCPointer<ByteVar>())

public actual fun lchflags(path: String?, flags: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_lchflags(path, flags)

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_mknodat(dirfd, pathname, mode, dev.toInt())

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_malloc_usable_size(ptr?.value?.toCPointer<ByteVar>())

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_mincore(addr?.value?.toCPointer<ByteVar>(), len, vec?.value?.toCPointer<ByteVar>())

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_newlocale(mask, locale, base.toInt())

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_nl_langinfo_l(item, locale.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_fallocate(fd, offset, len)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_fadvise(fd, offset, len, advise)

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_ppoll(fds?.value?.toCPointer<ByteVar>(), nfds.toInt(), timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_attr_get_np(tid.toInt(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_attr_getguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_attr_setguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_attr_getstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: ClockidT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_condattr_getclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_condattr_getpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_condattr_setclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_condattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMainNp(): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_main_np()

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_mutex_timedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_mutexattr_getpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_mutexattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_rwlockattr_getpshared(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_rwlockattr_setpshared(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_barrierattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_barrierattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, shared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_barrierattr_getpshared(attr?.value?.toCPointer<ByteVar>(), shared?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, shared: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_barrierattr_setpshared(attr?.value?.toCPointer<ByteVar>(), shared)

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_barrier_init(barrier?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_barrier_destroy(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_barrier_wait(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_get_name_np(tid.toInt(), name?.value?.toCPointer<ByteVar>(), len)
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_set_name_np(tid.toInt(), name)
}

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_getname_np(thread.toInt(), buffer?.value?.toCPointer<ByteVar>(), length)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_setname_np(thread.toInt(), name)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_setschedparam(native.toInt(), policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pthread_getschedparam(native.toInt(), policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_ptrace(request, pid, addr?.value?.toCPointer<ByteVar>(), data)

public actual fun utrace(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_utrace(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_querylocale(mask, loc.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun rtprio(function: CInt, pid: PidT, rtp: Rtprio?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_rtprio(function, pid, rtp?.value?.toCPointer<ByteVar>())

public actual fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sched_rr_get_interval(pid, t?.value?.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sched_getparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sched_setparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sched_getscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sched_setscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sem_getvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sem_timedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: io.github.kotlinmania.libc.SfHdtr?, sbytes: OffT?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sendfile(fd, s, offset, nbytes, hdtr?.value?.toCPointer<ByteVar>(), sbytes?.value?.toCPointer<ByteVar>(), flags)

public actual fun setdomainname(name: String?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_setdomainname(name, len)

public actual fun sethostname(name: String?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sethostname(name, len)

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_setpriority(which, who, prio)

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_setresuid(ruid, euid, suid)

public actual fun settimeofday(tv: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun setutxent() {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_setutxent()
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_shm_open(name, oflag, mode)

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sysctl(name?.value?.toCPointer<ByteVar>(), namelen, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sysctlbyname(name, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun sysctlnametomib(name: String?, mibp: CInt?, sizep: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sysctlnametomib(name, mibp?.value?.toCPointer<ByteVar>(), sizep?.value?.toCPointer<ByteVar>())

public actual fun uselocale(loc: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_uselocale(loc.toInt())

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun ntpAdjtime(buf: Timex?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_ntp_adjtime(buf?.value?.toCPointer<ByteVar>())

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_ntp_gettime(buf?.value?.toCPointer<ByteVar>())

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_dl_iterate_phdr(callback?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_iconv_open(tocode, fromcode)?.let { COpaquePointer(it.toLong()) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_iconv(cd?.value?.toCPointer<ByteVar>(), inbuf?.value?.toCPointer<ByteVar>(), inbytesleft?.value?.toCPointer<ByteVar>(), outbuf?.value?.toCPointer<ByteVar>(), outbytesleft?.value?.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_iconv_close(cd?.value?.toCPointer<ByteVar>())

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_explicit_bzero(s?.value?.toCPointer<ByteVar>(), len)
}

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_memset_s(s?.value?.toCPointer<ByteVar>(), smax, c, n)

public actual fun gethostid(): CLong =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_gethostid()

public actual fun sethostid(hostid: CLong) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_sethostid(hostid)
}

public actual fun eui64Aton(a: String?, e: Eui64?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_eui64aton(a, e?.value?.toCPointer<ByteVar>())

public actual fun eui64Ntoa(id: Eui64?, a: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_eui64ntoa(id?.value?.toCPointer<ByteVar>(), a?.value?.toCPointer<ByteVar>(), len)

public actual fun eui64Ntohost(hostname: COpaquePointer?, len: SizeT, id: Eui64?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_eui64ntohost(hostname?.value?.toCPointer<ByteVar>(), len, id?.value?.toCPointer<ByteVar>())

public actual fun eui64Hostton(hostname: String?, id: Eui64?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_eui64hostton(hostname, id?.value?.toCPointer<ByteVar>())

public actual fun eaccess(path: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_eaccess(path, mode)

public actual fun kenv(action: CInt, name: String?, value: COpaquePointer?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_kenv(action, name, value?.value?.toCPointer<ByteVar>(), len)

public actual fun reboot(howto: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_reboot(howto)

public actual fun exect(path: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_exect(path, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_execv_p(file, searchPath, argv?.value?.toCPointer<ByteVar>())

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawnattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawnattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawnattr_getsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawnattr_setsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawnattr_getsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawnattr_setsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawnattr_getflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawnattr_setflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: PidT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawnattr_getpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawnattr_setpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawnattr_getschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawnattr_setschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawnattr_getschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawnattr_setschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawn_file_actions_init(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawn_file_actions_destroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawn_file_actions_addopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawn_file_actions_addclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_posix_spawn_file_actions_adddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun mqClose(mqd: MqdT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_mq_close(mqd.toInt())

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_mq_getattr(mqd.toInt(), attr?.value?.toCPointer<ByteVar>())

public actual fun mqNotify(mqd: MqdT, notification: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_mq_notify(mqd.toInt(), notification?.value?.toCPointer<ByteVar>())

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_mq_receive(mqd.toInt(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_mq_send(mqd.toInt(), msgPtr, msgLen, msgPrio)

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_mq_setattr(mqd.toInt(), newattr?.value?.toCPointer<ByteVar>(), oldattr?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_mq_timedreceive(mqd.toInt(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_mq_timedsend(mqd.toInt(), msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_mq_unlink(name)

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_login_tty(fd)

public actual fun fparseln(stream: FILE?, len: SizeT?, lineno: SizeT?, delim: String?, flags: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_fparseln(stream?.handle?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), lineno?.value?.toCPointer<ByteVar>(), delim, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_backtrace(addrlist?.value?.toCPointer<ByteVar>(), len)

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_backtrace_symbols(addrlist?.value?.toCPointer<ByteVar>(), len)?.let { COpaquePointer(it.toLong()) }

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_backtrace_symbols_fd(addrlist?.value?.toCPointer<ByteVar>(), len, fd)

public actual fun kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errstr: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_kvm_open(execfile, corefile, swapfile, flags, errstr)?.let { COpaquePointer(it.toLong()) }

public actual fun kvmClose(kd: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_kvm_close(kd?.value?.toCPointer<ByteVar>())

public actual fun kvmGetprocs(kd: COpaquePointer?, op: CInt, arg: CInt, cnt: CInt?): KinfoProc? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_kvm_getprocs(kd?.value?.toCPointer<ByteVar>(), op, arg, cnt?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun kvmGetloadavg(kd: COpaquePointer?, loadavg: CDouble?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_kvm_getloadavg(kd?.value?.toCPointer<ByteVar>(), loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errbuf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_kvm_openfiles(execfile, corefile, swapfile, flags, errbuf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun kvmRead(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_kvm_read(kd?.value?.toCPointer<ByteVar>(), addr, buf?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun kvmWrite(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_freebsdlike_mod_kvm_write(kd?.value?.toCPointer<ByteVar>(), addr, buf?.value?.toCPointer<ByteVar>(), nbytes)
