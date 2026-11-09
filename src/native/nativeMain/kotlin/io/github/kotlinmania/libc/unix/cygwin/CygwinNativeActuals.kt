@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadSigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadKill(thread?.value?.toCPointer<ByteVar>(), sig)

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_strftime(s?.value?.toCPointer<ByteVar>(), max, format, tm?.value?.toCPointer<ByteVar>())

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_asctimeR(tm?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_ctimeR(timep?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_strptime(s, format, tm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_clockSettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_clockGettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_clockGetres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_timerCreate(clockid, sevp?.value?.toCPointer<ByteVar>(), timerid?.value?.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_timerDelete(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_timerSettime(timerid.toLong().toCPointer<ByteVar>(), flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_timerGettime(timerid.toLong().toCPointer<ByteVar>(), currValue?.value?.toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_timerGetoverrun(timerid.toLong().toCPointer<ByteVar>())

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_clockNanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_clockGetcpuclockid(pid, clkId?.value?.toCPointer<ByteVar>())

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_futimes(fd, times?.value?.toCPointer<ByteVar>())

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getitimer(which, currValue?.value?.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_setitimer(which, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun futimesat(fd: CInt, path: String?, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_futimesat(fd, path, times?.value?.toCPointer<ByteVar>())

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getpriority(which: CInt, who: IdT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_setpriority(which, who, prio)

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getpwnamR(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getpwuidR(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setpwent() {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_setpwent()
}

public actual fun endpwent() {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_endpwent()
}

public actual fun ifNameindex(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_ifNameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_ifFreenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_mknodat(dirfd, pathname, mode, dev)

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun dlfork(value: CInt) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_dlfork(value)
}

public actual fun accept4(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_accept4(s, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>(), flags)

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_recvmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_sendmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, sevlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), sevlen, flags)

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_ppoll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_newlocale(mask, locale, base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_freelocale(loc?.value?.toCPointer<ByteVar>())
}

public actual fun duplocale(base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_duplocale(base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uselocale(loc: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_uselocale(loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun semClose(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_semClose(sem?.value?.toCPointer<ByteVar>())

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_semUnlink(name)

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_semTimedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_semGetvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun clearenv(): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_clearenv()

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_ptsnameR(fd, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun getpt(): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getpt()

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getloadavg(loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_abs(i)

public actual fun arc4random(): UInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_arc4random()

public actual fun arc4randomUniform(l: UInt): UInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_arc4randomUniform(l)

public actual fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_arc4randomBuf(buf?.value?.toCPointer<ByteVar>(), size)
}

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_labs(i)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_rand()

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_reallocarray(ptr?.value?.toCPointer<ByteVar>(), nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_reallocf(ptr?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_srand(seed)
}

public actual fun drand48(): CDouble =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_drand48()

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_erand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_jrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun lcong48(p: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_lcong48(p?.value?.toCPointer<ByteVar>())
}

public actual fun lrand48(): CLong =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_lrand48()

public actual fun mrand48(): CLong =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_mrand48()

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_nrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_seed48(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun srand48(seed: CLong) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_srand48(seed)
}

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_qsortR(base?.value?.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixMadvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_shmUnlink(name)

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_explicitBzero(s?.value?.toCPointer<ByteVar>(), len)
}

public actual fun ffs(value: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_ffs(value)

public actual fun ffsl(value: CLong): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_ffsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_ffsll(value)

public actual fun fls(value: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_fls(value)

public actual fun flsl(value: CLong): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_flsl(value)

public actual fun flsll(value: CLonglong): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_flsll(value)

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_strcasecmpL(s1, s2, loc?.value?.toCPointer<ByteVar>())

public actual fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_strncasecmpL(s1, s2, n, loc?.value?.toCPointer<ByteVar>())

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_timingsafeBcmp(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>(), len)

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_timingsafeMemcmp(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>(), len)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_strsep(string?.value?.toCPointer<ByteVar>(), delim)?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_basename(path)?.let { COpaquePointer(it.toLong()) }

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_daemon(nochdir, noclose)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_dup3(src, dst, flags)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_eaccess(pathname, mode)

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_euidaccess(pathname, mode)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_execvpe(file, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_faccessat(dirfd, pathname, mode, flags)

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_fdatasync(fd)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun gethostid(): CLong =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_gethostid()

public actual fun getpagesize(): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getpagesize()

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getpeereid(socket, euid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun sethostname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_sethostname(name, len)

public actual fun vhangup(): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_vhangup()

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getdtablesize()

public actual fun sync() {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_sync()
}

public actual fun errno(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_errno()?.let { COpaquePointer(it.toLong()) }

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_schedSetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_schedGetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_schedSetscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_schedGetscheduler(pid)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_schedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_schedGetPriorityMin(policy)

public actual fun schedRrGetInterval(pid: PidT, t: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_schedRrGetInterval(pid, t?.value?.toCPointer<ByteVar>())

public actual fun schedGetcpu(): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_schedGetcpu()

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_schedGetaffinity(pid, cpusetsize, mask?.value?.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_schedSetaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadAttrGetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadAttrGetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadAttrSetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadAttrGetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadCancel(thread: PthreadT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadCancel(thread?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadCondattrGetclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadCondattrGetpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadCondattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadBarrierattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadBarrierattrSetpshared(attr?.value?.toCPointer<ByteVar>(), shared)

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadBarrierattrGetpshared(attr?.value?.toCPointer<ByteVar>(), shared?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadBarrierattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadBarrierInit(barrier?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadBarrierDestroy(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadBarrierWait(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadGetcpuclockid(thread?.value?.toCPointer<ByteVar>(), clkId?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadGetschedparam(native?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadMutexTimedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadMutexattrGetprotocol(attr?.value?.toCPointer<ByteVar>(), protocol?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadMutexattrGetpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadMutexattrSetprotocol(attr?.value?.toCPointer<ByteVar>(), protocol)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadMutexattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadSpinDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadSpinInit(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadSpinLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadSpinTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadSpinUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadRwlockattrGetpshared(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadRwlockattrSetpshared(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadSetschedparam(native?.value?.toCPointer<ByteVar>(), policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadSetschedprio(native?.value?.toCPointer<ByteVar>(), priority)

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadGetaffinityNp(thread?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadGetattrNp(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadGetnameNp(thread?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadSetaffinityNp(thread?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pthreadSetnameNp(thread?.value?.toCPointer<ByteVar>(), name)

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun mount(src: String?, target: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_mount(src, target, flags)

public actual fun umount(target: String?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_umount(target)

public actual fun cygwinUmount(target: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_cygwinUmount(target, flags)

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun uname(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnattrGetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnattrSetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnattrGetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnattrSetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnattrGetflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnattrSetflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnattrGetpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnattrSetpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnattrGetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnattrSetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnattrGetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnattrSetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnFileActionsInit(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnFileActionsDestroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnFileActionsAddopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnFileActionsAddclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnFileActionsAdddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun posixSpawnFileActionsAddchdir(actions: COpaquePointer?, path: String?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnFileActionsAddchdir(actions?.value?.toCPointer<ByteVar>(), path)

public actual fun posixSpawnFileActionsAddfchdir(actions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnFileActionsAddfchdir(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnFileActionsAddchdirNp(actions?.value?.toCPointer<ByteVar>(), path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixSpawnFileActionsAddfchdirNp(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getgrgidR(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getgrouplist(user, group, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun getgrnam(name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getgrnamR(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun initgroups(user: String?, group: GidT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_initgroups(user, group)

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixFadvise(fd, offset, len, advise)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_posixFallocate(fd, offset, len)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_fallocate(fd, mode, offset, len)

public actual fun endutxent() {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_endutxent()
}

public actual fun getutxent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(id: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getutxid(id?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(line: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_getutxline(line?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(utmpx: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_pututxline(utmpx?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutxent() {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_setutxent()
}

public actual fun utmpxname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_utmpxname(file)

public actual fun updwtmpx(file: String?, utmpx: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.cygwin.cinterop.libc_unix_cygwin_updwtmpx(file, utmpx?.value?.toCPointer<ByteVar>())
}
