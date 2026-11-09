@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _unixCygwinNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) as Int) else 0

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) as Int) else 0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_sigsuspend((mask?.value ?: 0L).toString()) as Int) else 0

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadKill((thread?.value ?: 0L).toString(), sig) as Int) else 0

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_strftime((s?.value ?: 0L).toString(), max.toString(), format, (tm?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_asctimeR((tm?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_ctimeR((timep?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_strptime(s, format, (tm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_clockSettime(clkId.toString(), (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_clockGettime(clkId.toString(), (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_clockGetres(clkId.toString(), (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_timerCreate(clockid.toString(), (sevp?.value ?: 0L).toString(), (timerid?.value ?: 0L).toString()) as Int) else 0

public actual fun timerDelete(timerid: TimerT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_timerDelete(timerid.toLong().toString()) as Int) else 0

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_timerSettime(timerid.toLong().toString(), flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) as Int) else 0

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_timerGettime(timerid.toLong().toString(), (currValue?.value ?: 0L).toString()) as Int) else 0

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_timerGetoverrun(timerid.toLong().toString()) as Int) else 0

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_clockNanosleep(clkId.toString(), flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_clockGetcpuclockid(pid, (clkId?.value ?: 0L).toString()) as Int) else 0

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_futimes(fd, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_lutimes(file, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getitimer(which, (currValue?.value ?: 0L).toString()) as Int) else 0

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_setitimer(which, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) as Int) else 0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun futimesat(fd: CInt, path: String?, times: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_futimesat(fd, path, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_setrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getpriority(which, who.toInt()) as Int) else 0

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_setpriority(which, who.toInt(), prio) as Int) else 0

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getpwent(): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getpwent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setpwent() {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_setpwent()
    }
}

public actual fun endpwent() {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_endpwent()
    }
}

public actual fun ifNameindex(): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_ifNameindex() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_ifFreenameindex((ptr?.value ?: 0L).toString())
    }
}

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_readv(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else 0L

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_writev(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else 0L

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_mkfifoat(dirfd, pathname, mode.toInt()) as Int) else 0

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_mknodat(dirfd, pathname, mode.toInt(), dev.toInt()) as Int) else 0

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) as Int) else 0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_futimens(fd, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun dlfork(value: CInt) {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_dlfork(value)
    }
}

public actual fun accept4(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_accept4(s, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_bind(socket, (address?.value ?: 0L).toString(), addressLen) as Int) else 0

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_recvmsg(fd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else 0L

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_sendmsg(fd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else 0L

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, sevlen: SocklenT, flags: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getnameinfo((sa?.value ?: 0L).toString(), salen, (host?.value ?: 0L).toString(), hostlen, (serv?.value ?: 0L).toString(), sevlen, flags) as Int) else 0

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_ppoll((fds?.value ?: 0L).toString(), nfds.toInt(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) as Int) else 0

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_newlocale(mask, locale, (base?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun freelocale(loc: LocaleT) {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_freelocale((loc?.value ?: 0L).toString())
    }
}

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_duplocale((base?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_uselocale((loc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) as Int) else 0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_semDestroy((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_semClose((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semUnlink(name: String?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_semUnlink(name) as Int) else 0

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else 0

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) as Int) else 0

public actual fun clearenv(): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_clearenv() as Int) else 0

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_ptsnameR(fd, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun getpt(): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getpt() as Int) else 0

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_memalign(align.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getloadavg((loadavg?.value ?: 0L).toString(), nelem) as Int) else 0

public actual fun abs(i: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_abs(i) as Int) else 0

public actual fun arc4random(): UInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_arc4random() as Int).toUInt() else 0u

public actual fun arc4randomUniform(l: UInt): UInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_arc4randomUniform(l.toInt()) as Int).toUInt() else 0u

public actual fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_arc4randomBuf((buf?.value ?: 0L).toString(), size.toString())
    }
}

public actual fun labs(i: CLong): CLong =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_labs(i.toString()) as String).toLong() else 0L

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_mkostemp((template?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_mkostemps((template?.value ?: 0L).toString(), suffixlen, flags) as Int) else 0

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_mkstemps((template?.value ?: 0L).toString(), suffixlen) as Int) else 0

public actual fun rand(): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_rand() as Int) else 0

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_reallocarray((ptr?.value ?: 0L).toString(), nmemb.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_reallocf((ptr?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun srand(seed: CUint) {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_srand(seed.toInt())
    }
}

public actual fun drand48(): CDouble =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_drand48() as Double) else 0.0

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_erand48((xseed?.value ?: 0L).toString()) as Double) else 0.0

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_jrand48((xseed?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun lcong48(p: COpaquePointer?) {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_lcong48((p?.value ?: 0L).toString())
    }
}

public actual fun lrand48(): CLong =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_lrand48() as String).toLong() else 0L

public actual fun mrand48(): CLong =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_mrand48() as String).toLong() else 0L

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_nrand48((xseed?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_seed48((xseed?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun srand48(seed: CLong) {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_srand48(seed.toString())
    }
}

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_qsortR((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString(), (arg?.value ?: 0L).toString())
    }
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else 0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_msync((addr?.value ?: 0L).toString(), len.toString(), flags) as Int) else 0

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else 0

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else 0

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_shmOpen(name, oflag, mode.toInt()) as Int) else 0

public actual fun shmUnlink(name: String?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_shmUnlink(name) as Int) else 0

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_explicitBzero((s?.value ?: 0L).toString(), len.toString())
    }
}

public actual fun ffs(value: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_ffs(value) as Int) else 0

public actual fun ffsl(value: CLong): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_ffsl(value.toString()) as Int) else 0

public actual fun ffsll(value: CLonglong): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_ffsll(value.toString()) as Int) else 0

public actual fun fls(value: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_fls(value) as Int) else 0

public actual fun flsl(value: CLong): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_flsl(value.toString()) as Int) else 0

public actual fun flsll(value: CLonglong): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_flsll(value.toString()) as Int) else 0

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_strcasecmpL(s1, s2, (loc?.value ?: 0L).toString()) as Int) else 0

public actual fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_strncasecmpL(s1, s2, n.toString(), (loc?.value ?: 0L).toString()) as Int) else 0

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_timingsafeBcmp((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_timingsafeMemcmp((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_memmem((haystack?.value ?: 0L).toString(), haystacklen.toString(), (needle?.value ?: 0L).toString(), needlelen.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_memrchr((cx?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_strsep((string?.value ?: 0L).toString(), delim) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun basename(path: String?): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_basename(path) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_daemon(nochdir, noclose) as Int) else 0

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_dup3(src, dst, flags) as Int) else 0

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_eaccess(pathname, mode) as Int) else 0

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_euidaccess(pathname, mode) as Int) else 0

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_execvpe(file, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_faccessat(dirfd, pathname, mode, flags) as Int) else 0

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_fexecve(fd, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun fdatasync(fd: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_fdatasync(fd) as Int) else 0

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getdomainname((name?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun gethostid(): CLong =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_gethostid() as String).toLong() else 0L

public actual fun getpagesize(): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getpagesize() as Int) else 0

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getpeereid(socket, (euid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else 0

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pipe2((fds?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_sbrk(increment.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_setgroups(ngroups, (ptr?.value ?: 0L).toString()) as Int) else 0

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_sethostname(name, len.toString()) as Int) else 0

public actual fun vhangup(): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_vhangup() as Int) else 0

public actual fun getdtablesize(): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getdtablesize() as Int) else 0

public actual fun sync() {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_sync()
    }
}

public actual fun errno(): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_errno() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_schedSetparam(pid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_schedGetparam(pid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_schedGetscheduler(pid) as Int) else 0

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_schedGetPriorityMax(policy) as Int) else 0

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_schedGetPriorityMin(policy) as Int) else 0

public actual fun schedRrGetInterval(pid: PidT, t: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_schedRrGetInterval(pid, (t?.value ?: 0L).toString()) as Int) else 0

public actual fun schedGetcpu(): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_schedGetcpu() as Int) else 0

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_schedGetaffinity(pid, cpusetsize.toString(), (mask?.value ?: 0L).toString()) as Int) else 0

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_schedSetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadAttrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadAttrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadCancel((thread?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadCondattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId.toString()) as Int) else 0

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadCondattrSetpshared((attr?.value ?: 0L).toString(), pshared) as Int) else 0

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadBarrierattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadBarrierattrSetpshared((attr?.value ?: 0L).toString(), shared) as Int) else 0

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadBarrierattrGetpshared((attr?.value ?: 0L).toString(), (shared?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadBarrierattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadBarrierInit((barrier?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), count.toInt()) as Int) else 0

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadBarrierDestroy((barrier?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadBarrierWait((barrier?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadGetcpuclockid((thread?.value ?: 0L).toString(), (clkId?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadGetschedparam((native?.value ?: 0L).toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadMutexattrGetprotocol((attr?.value ?: 0L).toString(), (protocol?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadMutexattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadMutexattrSetprotocol((attr?.value ?: 0L).toString(), protocol) as Int) else 0

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadMutexattrSetpshared((attr?.value ?: 0L).toString(), pshared) as Int) else 0

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadSpinDestroy((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) as Int) else 0

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadSpinLock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadSpinTrylock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadSpinUnlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadRwlockattrGetpshared((attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadRwlockattrSetpshared((attr?.value ?: 0L).toString(), value) as Int) else 0

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadSetschedparam((native?.value ?: 0L).toString(), policy, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadSetschedprio((native?.value ?: 0L).toString(), priority) as Int) else 0

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadGetaffinityNp((thread?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadGetattrNp((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadGetnameNp((thread?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadSetaffinityNp((thread?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pthreadSetnameNp((thread?.value ?: 0L).toString(), name) as Int) else 0

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getrandom((buf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun mount(src: String?, target: String?, flags: CUint): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_mount(src, target, flags.toInt()) as Int) else 0

public actual fun umount(target: String?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_umount(target) as Int) else 0

public actual fun cygwinUmount(target: String?, flags: CUint): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_cygwinUmount(target, flags.toInt()) as Int) else 0

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_dirfd((dirp?.handle ?: 0L).toString()) as Int) else 0

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_telldir((dirp?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_uname((buf?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) as Int) else 0

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnattrGetschedpolicy((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnattrSetschedpolicy((attr?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnattrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnattrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnFileActionsInit((actions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnFileActionsDestroy((actions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnFileActionsAddopen((actions?.value ?: 0L).toString(), fd, path, oflag, mode.toInt()) as Int) else 0

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnFileActionsAddclose((actions?.value ?: 0L).toString(), fd) as Int) else 0

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnFileActionsAdddup2((actions?.value ?: 0L).toString(), fd, newfd) as Int) else 0

public actual fun posixSpawnFileActionsAddchdir(actions: COpaquePointer?, path: String?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnFileActionsAddchdir((actions?.value ?: 0L).toString(), path) as Int) else 0

public actual fun posixSpawnFileActionsAddfchdir(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnFileActionsAddfchdir((actions?.value ?: 0L).toString(), fd) as Int) else 0

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnFileActionsAddchdirNp((actions?.value ?: 0L).toString(), path) as Int) else 0

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixSpawnFileActionsAddfchdirNp((actions?.value ?: 0L).toString(), fd) as Int) else 0

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getgrgid(gid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getgrouplist(user, group.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getgrnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun initgroups(user: String?, group: GidT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_initgroups(user, group.toInt()) as Int) else 0

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_statfs(path, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_fstatfs(fd, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else 0

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_posixFallocate(fd, offset.toString(), len.toString()) as Int) else 0

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_fallocate(fd, mode, offset.toString(), len.toString()) as Int) else 0

public actual fun endutxent() {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_endutxent()
    }
}

public actual fun getutxent(): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getutxent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutxid(id: COpaquePointer?): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getutxid((id?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutxline(line: COpaquePointer?): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_getutxline((line?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pututxline(utmpx: COpaquePointer?): COpaquePointer? =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_pututxline((utmpx?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setutxent() {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_setutxent()
    }
}

public actual fun utmpxname(file: String?): CInt =
    if (_unixCygwinNapiAddon != null) (_unixCygwinNapiAddon.libc_unix_cygwin_utmpxname(file) as Int) else 0

public actual fun updwtmpx(file: String?, utmpx: COpaquePointer?) {
    if (_unixCygwinNapiAddon != null) {
        _unixCygwinNapiAddon.libc_unix_cygwin_updwtmpx(file, (utmpx?.value ?: 0L).toString())
    }
}
