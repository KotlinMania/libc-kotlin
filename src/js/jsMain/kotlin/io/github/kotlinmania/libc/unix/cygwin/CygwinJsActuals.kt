@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixCygwinNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSigsuspend(mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadKill(thread.rawAddress.toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: MutPtr, max: SizeT, format: ConstPtr, tm: ConstPtr): SizeT =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinStrftime(s.rawAddress.toString(), max.toString(), format.rawAddress.toString(), tm.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinAsctimeR(tm.rawAddress.toString(), buf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinCtimeR(timep.rawAddress.toString(), buf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: ConstPtr, format: ConstPtr, tm: MutPtr): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinStrptime(s.rawAddress.toString(), format.rawAddress.toString(), tm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinClockSettime(clkId.toString(), tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinClockGettime(clkId.toString(), tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinClockGetres(clkId.toString(), tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinTimerCreate(clockid.toString(), sevp.rawAddress.toString(), timerid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinTimerDelete(timerid.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinTimerSettime(timerid.toLong().toString(), flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinTimerGettime(timerid.toLong().toString(), currValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinTimerGetoverrun(timerid.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinClockNanosleep(clkId.toString(), flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinClockGetcpuclockid(pid, clkId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinFutimes(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinLutimes(file.rawAddress.toString(), times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetitimer(which, currValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSetitimer(which, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimesat(fd: CInt, path: ConstPtr, times: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinFutimesat(fd, path.rawAddress.toString(), times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetpriority(which, who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSetpriority(which, who.toInt(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinGetpwent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ifNameindex(): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinIfNameindex() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: MutPtr) {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinIfFreenameindex(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinReadv(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinWritev(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinFutimens(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlfork(value: CInt) {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinDlfork(value)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun accept4(s: CInt, addr: MutPtr, addrlen: MutPtr, flags: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinAccept4(s, addr.rawAddress.toString(), addrlen.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinBind(socket, address.rawAddress.toString(), addressLen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinRecvmsg(fd, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSendmsg(fd, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, sevlen: SocklenT, flags: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetnameinfo(sa.rawAddress.toString(), salen, host.rawAddress.toString(), hostlen, serv.rawAddress.toString(), sevlen, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPpoll(fds.rawAddress.toString(), nfds.toInt(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinDuplocale(base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinUselocale(loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSemInit(sem.rawAddress.toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSemDestroy(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSemClose(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSemUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinClearenv() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPtsnameR(fd, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpt(): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetpt() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinMemalign(align.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetloadavg(loadavg.rawAddress.toString(), nelem) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinAbs(i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4random(): UInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinArc4random() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomUniform(l: UInt): UInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinArc4randomUniform(l.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: MutPtr, size: SizeT) {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinArc4randomBuf(buf.rawAddress.toString(), size.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun labs(i: CLong): CLong =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinLabs(i.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinMkostemp(template.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinMkostemps(template.rawAddress.toString(), suffixlen, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinMkstemps(template.rawAddress.toString(), suffixlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinRand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinReallocarray(ptr.rawAddress.toString(), nmemb.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocf(ptr: MutPtr, size: SizeT): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinReallocf(ptr.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drand48(): CDouble =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinDrand48() as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: MutPtr): CDouble =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinErand48(xseed.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: MutPtr): CLong =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinJrand48(xseed.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: MutPtr) {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinLcong48(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lrand48(): CLong =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinLrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinMrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: MutPtr): CLong =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinNrand48(xseed.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seed48(xseed: MutPtr): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinSeed48(xseed.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinSrand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr) {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinQsortR(base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString(), arg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinMsync(addr.rawAddress.toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinShmUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: MutPtr, len: SizeT) {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinExplicitBzero(s.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ffs(value: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinFfs(value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsl(value: CLong): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinFfsl(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsll(value: CLonglong): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinFfsll(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fls(value: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinFls(value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsl(value: CLong): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinFlsl(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsll(value: CLonglong): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinFlsll(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmpL(s1: ConstPtr, s2: ConstPtr, loc: LocaleT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinStrcasecmpL(s1.rawAddress.toString(), s2.rawAddress.toString(), loc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmpL(s1: ConstPtr, s2: ConstPtr, n: SizeT, loc: LocaleT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinStrncasecmpL(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString(), loc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timingsafeBcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinTimingsafeBcmp(a.rawAddress.toString(), b.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timingsafeMemcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinTimingsafeMemcmp(a.rawAddress.toString(), b.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinMemrchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(string: MutPtr, delim: ConstPtr): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinStrsep(string.rawAddress.toString(), delim.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: ConstPtr): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinBasename(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinDaemon(nochdir, noclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinDup3(src, dst, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(pathname: ConstPtr, mode: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinEaccess(pathname.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(pathname: ConstPtr, mode: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinEuidaccess(pathname.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinFdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr, len: SizeT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetdomainname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetentropy(buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGethostid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesize(): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetpagesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeereid(socket: CInt, euid: MutPtr, egid: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetpeereid(socket, euid.rawAddress.toString(), egid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPipe2(fds.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinSbrk(increment.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSetgroups(ngroups, ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr, len: SizeT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSethostname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhangup(): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinVhangup() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetdtablesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun errno(): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinErrno() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSchedSetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSchedGetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSchedSetscheduler(pid, policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSchedGetscheduler(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSchedGetPriorityMax(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSchedGetPriorityMin(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSchedRrGetInterval(pid, t.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSchedGetcpu() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSchedGetaffinity(pid, cpusetsize.toString(), mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinSchedSetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadAttrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadAttrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadCancel(thread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadCondattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadCondattrSetclock(attr.rawAddress.toString(), clockId.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadCondattrSetpshared(attr.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadBarrierattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadBarrierattrSetpshared(attr.rawAddress.toString(), shared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadBarrierattrGetpshared(attr.rawAddress.toString(), shared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadBarrierattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadBarrierInit(barrier.rawAddress.toString(), attr.rawAddress.toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadBarrierDestroy(barrier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadBarrierWait(barrier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadGetcpuclockid(thread.rawAddress.toString(), clkId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadGetschedparam(native.rawAddress.toString(), policy.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr, protocol: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadMutexattrGetprotocol(attr.rawAddress.toString(), protocol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadMutexattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr, protocol: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadMutexattrSetprotocol(attr.rawAddress.toString(), protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadMutexattrSetpshared(attr.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadSpinDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadSpinInit(lock.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadSpinLock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadSpinTrylock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadSpinUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadRwlockattrGetpshared(attr.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadRwlockattrSetpshared(attr.rawAddress.toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadSetschedparam(native.rawAddress.toString(), policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadSetschedprio(native.rawAddress.toString(), priority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadGetaffinityNp(thread.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadGetattrNp(native.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: SizeT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadGetnameNp(thread.rawAddress.toString(), name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadSetaffinityNp(thread.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPthreadSetnameNp(thread.rawAddress.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinIoctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: ConstPtr, target: ConstPtr, flags: CUint): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinMount(src.rawAddress.toString(), target.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount(target: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinUmount(target.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cygwinUmount(target: ConstPtr, flags: CUint): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinCygwinUmount(target.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinDirfd(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr): CLong =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinTelldir(dirp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinUname(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnFileActionsInit(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnFileActionsDestroy(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdir(actions: MutPtr, path: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnFileActionsAddchdir(actions.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdir(actions: MutPtr, fd: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnFileActionsAddfchdir(actions.rawAddress.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr, path: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnFileActionsAddchdirNp(actions.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr, fd: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixSpawnFileActionsAddfchdirNp(actions.rawAddress.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): PidT =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinGetgrgid(gid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetgrouplist(user.rawAddress.toString(), group.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinGetgrnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: ConstPtr, group: GidT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinInitgroups(user.rawAddress.toString(), group.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinFstatfs(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinPosixFallocate(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinFallocate(fd, mode, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endutxent() {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutxent(): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinGetutxent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(id: ConstPtr): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinGetutxid(id.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(line: ConstPtr): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinGetutxline(line.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(utmpx: ConstPtr): MutPtr =
    if (unixCygwinNapiAddon != null) MutPtr((unixCygwinNapiAddon.libcUnixCygwinPututxline(utmpx.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpxname(file: ConstPtr): CInt =
    if (unixCygwinNapiAddon != null) (unixCygwinNapiAddon.libcUnixCygwinUtmpxname(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updwtmpx(file: ConstPtr, utmpx: ConstPtr) {
    if (unixCygwinNapiAddon != null) {
        unixCygwinNapiAddon.libcUnixCygwinUpdwtmpx(file.rawAddress.toString(), utmpx.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
