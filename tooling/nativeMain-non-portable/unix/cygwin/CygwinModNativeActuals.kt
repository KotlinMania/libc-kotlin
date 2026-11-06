@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun sigwait(set: CUlong?, sig: CInt?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: CUlong?, info: SiginfoT?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: CUlong?, oldset: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_sigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_kill(thread?.value?.toCPointer<ByteVar>(), sig)

public actual fun sigtimedwait(set: CUlong?, info: SiginfoT?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: Tm?): SizeT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_strftime(s?.value?.toCPointer<ByteVar>(), max, format, tm?.value?.toCPointer<ByteVar>())

public actual fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_asctime_r(tm?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(timep: CLong?, buf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_ctime_r(timep?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun strptime(s: String?, format: String?, tm: Tm?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_strptime(s, format, tm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_clock_settime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_clock_gettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_clock_getres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_timer_create(clockid, sevp?.value?.toCPointer<ByteVar>(), timerid?.value?.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_timer_delete(timerid)

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_timer_settime(timerid, flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_timer_gettime(timerid, currValue?.value?.toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_timer_getoverrun(timerid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_clock_nanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_clock_getcpuclockid(pid, clkId?.value?.toCPointer<ByteVar>())

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_futimes(fd, times?.value?.toCPointer<ByteVar>())

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getitimer(which, currValue?.value?.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_setitimer(which, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun futimesat(fd: CInt, path: String?, times: Timeval?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_futimesat(fd, path, times?.value?.toCPointer<ByteVar>())

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getpriority(which: CInt, who: IdT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_setpriority(which, who, prio)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getpwnam_r(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getpwuid_r(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwent(): Passwd? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setpwent() {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_setpwent()
}

public actual fun endpwent() {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_endpwent()
}

public actual fun ifNameindex(): IfNameindex? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_if_nameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_if_freenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_mknodat(dirfd, pathname, mode, dev)

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun dlfork(value: CInt) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_dlfork(value)
}

public actual fun accept4(s: CInt, addr: Sockaddr?, addrlen: CInt?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_accept4(s, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>(), flags)

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: CInt?): SsizeT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_recvmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sendmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, sevlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), sevlen, flags)

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_ppoll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_newlocale(mask, locale, base.toInt())

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_freelocale(loc.toInt())
}

public actual fun duplocale(base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_duplocale(base.toInt())

public actual fun uselocale(loc: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_uselocale(loc.toInt())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sem_init(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sem_destroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sem_close(sem?.value?.toCPointer<ByteVar>())

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sem_unlink(name)

public actual fun semTimedwait(sem: COpaquePointer?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sem_timedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: COpaquePointer?, sval: CInt?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sem_getvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun clearenv(): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_clearenv()

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_ptsname_r(fd, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun getpt(): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getpt()

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getloadavg(loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_abs(i)

public actual fun arc4random(): UInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_arc4random()

public actual fun arc4randomUniform(l: UInt): UInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_arc4random_uniform(l)

public actual fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_arc4random_buf(buf?.value?.toCPointer<ByteVar>(), size)
}

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_labs(i)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_rand()

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_reallocarray(ptr?.value?.toCPointer<ByteVar>(), nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_reallocf(ptr?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_srand(seed)
}

public actual fun drand48(): CDouble =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_drand48()

public actual fun erand48(xseed: CUshort?): CDouble =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_erand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun jrand48(xseed: CUshort?): CLong =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_jrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun lcong48(p: CUshort?) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_lcong48(p?.value?.toCPointer<ByteVar>())
}

public actual fun lrand48(): CLong =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_lrand48()

public actual fun mrand48(): CLong =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_mrand48()

public actual fun nrand48(xseed: CUshort?): CLong =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_nrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun seed48(xseed: CUshort?): CUshort? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_seed48(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun srand48(seed: CLong) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_srand48(seed)
}

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_qsort_r(base?.value?.toCPointer<ByteVar>(), num, size, compar?.value?.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_shm_open(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_shm_unlink(name)

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_explicit_bzero(s?.value?.toCPointer<ByteVar>(), len)
}

public actual fun ffs(value: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_ffs(value)

public actual fun ffsl(value: CLong): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_ffsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_ffsll(value)

public actual fun fls(value: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_fls(value)

public actual fun flsl(value: CLong): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_flsl(value)

public actual fun flsll(value: CLonglong): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_flsll(value)

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_strcasecmp_l(s1, s2, loc.toInt())

public actual fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_strncasecmp_l(s1, s2, n, loc.toInt())

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_timingsafe_bcmp(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>(), len)

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_timingsafe_memcmp(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>(), len)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_strerror_r(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_strsep(string?.value?.toCPointer<ByteVar>(), delim)?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_basename(path)?.let { COpaquePointer(it.toLong()) }

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_daemon(nochdir, noclose)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_dup3(src, dst, flags)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_eaccess(pathname, mode)

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_euidaccess(pathname, mode)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_execvpe(file, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_faccessat(dirfd, pathname, mode, flags)

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_fdatasync(fd)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun gethostid(): CLong =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_gethostid()

public actual fun getpagesize(): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getpagesize()

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getpeereid(socket, euid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_atfork(prepare?.value?.toCPointer<ByteVar>(), parent?.value?.toCPointer<ByteVar>(), child?.value?.toCPointer<ByteVar>())

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun sethostname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sethostname(name, len)

public actual fun vhangup(): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_vhangup()

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getdtablesize()

public actual fun sync() {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sync()
}

public actual fun errno(): CInt? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_errno()?.let { COpaquePointer(it.toLong()) }

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sched_setparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sched_getparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sched_setscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sched_getscheduler(pid)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sched_get_priority_max(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sched_get_priority_min(policy)

public actual fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sched_rr_get_interval(pid, t?.value?.toCPointer<ByteVar>())

public actual fun schedGetcpu(): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sched_getcpu()

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: CpuSetT?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sched_getaffinity(pid, cpusetsize, mask?.value?.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_sched_setaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_attr_getguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_attr_getschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_attr_setschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_attr_getstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadCancel(thread: PthreadT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_cancel(thread?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_condattr_getclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_condattr_getpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_condattr_setclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_condattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadBarrierattrInit(attr: ULong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_barrierattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: ULong?, shared: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_barrierattr_setpshared(attr?.value?.toCPointer<ByteVar>(), shared)

public actual fun pthreadBarrierattrGetpshared(attr: ULong?, shared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_barrierattr_getpshared(attr?.value?.toCPointer<ByteVar>(), shared?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: ULong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_barrierattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierInit(barrier: ULong?, attr: ULong?, count: CUint): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_barrier_init(barrier?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierDestroy(barrier: ULong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_barrier_destroy(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierWait(barrier: ULong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_barrier_wait(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_create(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), f.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_getcpuclockid(thread?.value?.toCPointer<ByteVar>(), clkId?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_getschedparam(native?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_mutex_timedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: CInt?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_mutexattr_getprotocol(attr?.value?.toCPointer<ByteVar>(), protocol?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_mutexattr_getpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_mutexattr_setprotocol(attr?.value?.toCPointer<ByteVar>(), protocol)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_mutexattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: ULong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_spin_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: ULong?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_spin_init(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinLock(lock: ULong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_spin_lock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: ULong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_spin_trylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: ULong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_spin_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: CInt?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_rwlockattr_getpshared(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_rwlockattr_setpshared(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_setschedparam(native?.value?.toCPointer<ByteVar>(), policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_setschedprio(native?.value?.toCPointer<ByteVar>(), priority)

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_getaffinity_np(thread?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_getattr_np(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_getname_np(thread?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_setaffinity_np(thread?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_setname_np(thread?.value?.toCPointer<ByteVar>(), name)

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pthread_sigqueue(thread?.value?.toCPointer<ByteVar>(), sig, value.toInt())

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun mount(src: String?, target: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_mount(src, target, flags)

public actual fun umount(target: String?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_umount(target)

public actual fun cygwinUmount(target: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_cygwin_umount(target, flags)

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun uname(buf: Utsname?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawnattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawnattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawnattr_getsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawnattr_setsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawnattr_getsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawnattr_setsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawnattr_getflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawnattr_setflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: PidT?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawnattr_getpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawnattr_setpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: CInt?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawnattr_getschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawnattr_setschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawnattr_getschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawnattr_setschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawn_file_actions_init(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawn_file_actions_destroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawn_file_actions_addopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawn_file_actions_addclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawn_file_actions_adddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun posixSpawnFileActionsAddchdir(actions: COpaquePointer?, path: String?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawn_file_actions_addchdir(actions?.value?.toCPointer<ByteVar>(), path)

public actual fun posixSpawnFileActionsAddfchdir(actions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawn_file_actions_addfchdir(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawn_file_actions_addchdir_np(actions?.value?.toCPointer<ByteVar>(), path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_spawn_file_actions_addfchdir_np(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): Group? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getgrgid_r(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getgrouplist(user, group, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun getgrnam(name: String?): Group? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getgrnam_r(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun initgroups(user: String?, group: GidT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_initgroups(user, group)

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_fadvise(fd, offset, len, advise)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_posix_fallocate(fd, offset, len)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_fallocate(fd, mode, offset, len)

public actual fun endutxent() {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_endutxent()
}

public actual fun getutxent(): Utmpx? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(id: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getutxid(id?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(line: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_getutxline(line?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(utmpx: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_pututxline(utmpx?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutxent() {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_setutxent()
}

public actual fun utmpxname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_utmpxname(file)

public actual fun updwtmpx(file: String?, utmpx: Utmpx?) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_cygwin_mod_updwtmpx(file, utmpx?.value?.toCPointer<ByteVar>())
}
