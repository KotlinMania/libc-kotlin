@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.ClockidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MqdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun semDestroy(sem: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSemDestroy")

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSemInit")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeDaemon")
private external fun wasiLibcUnixBsdFreebsdlikeDaemon(nochdir: Int, noclose: Int): Int

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeDaemon(nochdir, noclose)

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeGettimeofday")

public actual fun accept4(s: CInt, addr: MutPtr, addrlen: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeAccept4")

public actual fun chflags(path: ConstPtr, flags: CUlong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeChflags")

public actual fun chflagsat(fd: CInt, path: ConstPtr, flags: CUlong, atflag: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeChflagsat")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeClockNanosleep")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeClockGetres")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeClockGettime")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeClockSettime")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeClockGetcpuclockid")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadGetcpuclockid")

public actual fun dirfd(dirp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeDirfd")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeDuplocale")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeEndutxent")
private external fun wasiLibcUnixBsdFreebsdlikeEndutxent(): Unit

public actual fun endutxent(): Unit =
    wasiLibcUnixBsdFreebsdlikeEndutxent()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFchflags")
private external fun wasiLibcUnixBsdFreebsdlikeFchflags(fd: Int, flags: Long): Int

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    wasiLibcUnixBsdFreebsdlikeFchflags(fd, flags.toLong())

public actual fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFexecve")

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFutimens")

public actual fun getdomainname(name: MutPtr, len: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeGetdomainname")

public actual fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeGetgrentR")

public actual fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeGetpwentR")

public actual fun getgrouplist(name: ConstPtr, basegid: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeGetgrouplist")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SizeT, serv: MutPtr, servlen: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeGetnameinfo")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeGetpriority")
private external fun wasiLibcUnixBsdFreebsdlikeGetpriority(which: Int, who: Int): Int

public actual fun getpriority(which: CInt, who: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeGetpriority(which, who)

public actual fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeGetresgid")

public actual fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeGetresuid")

public actual fun getutxent(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeGetutxent")

public actual fun getutxid(ut: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeGetutxid")

public actual fun getutxline(ut: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeGetutxline")

public actual fun initgroups(name: ConstPtr, basegid: GidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeInitgroups")

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeKevent")

public actual fun lchflags(path: ConstPtr, flags: CUlong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeLchflags")

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeLutimes")

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMemrchr")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMkfifoat")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMknodat")

public actual fun mallocUsableSize(ptr: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMallocUsableSize")

public actual fun mincore(addr: ConstPtr, len: SizeT, vec: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMincore")

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeNewlocale")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeNlLanginfoL")

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePipe2")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikePosixFallocate")
private external fun wasiLibcUnixBsdFreebsdlikePosixFallocate(fd: Int, offset: Long, len: Long): Int

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    wasiLibcUnixBsdFreebsdlikePosixFallocate(fd, offset, len)

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikePosixFadvise")
private external fun wasiLibcUnixBsdFreebsdlikePosixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikePosixFadvise(fd, offset, len, advise)

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePpoll")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePreadv")

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadAttrGetNp")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadAttrGetguardsize")

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadAttrSetguardsize")

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadAttrGetstack")

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadCondattrGetclock")

public actual fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadCondattrGetpshared")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadCondattrSetclock")

public actual fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadCondattrSetpshared")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikePthreadMainNp")
private external fun wasiLibcUnixBsdFreebsdlikePthreadMainNp(): Int

public actual fun pthreadMainNp(): CInt =
    wasiLibcUnixBsdFreebsdlikePthreadMainNp()

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadMutexTimedlock")

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadMutexattrGetpshared")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadMutexattrSetpshared")

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadRwlockattrGetpshared")

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadRwlockattrSetpshared")

public actual fun pthreadBarrierattrInit(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadBarrierattrInit")

public actual fun pthreadBarrierattrDestroy(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadBarrierattrDestroy")

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadBarrierattrGetpshared")

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadBarrierattrSetpshared")

public actual fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadBarrierInit")

public actual fun pthreadBarrierDestroy(barrier: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadBarrierDestroy")

public actual fun pthreadBarrierWait(barrier: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadBarrierWait")

public actual fun pthreadGetNameNp(tid: PthreadT, name: MutPtr, len: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadGetNameNp")

public actual fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadSetNameNp")

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: MutPtr, length: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadGetnameNp")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadSetnameNp")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadSetschedparam")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePthreadGetschedparam")

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr, data: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePtrace")

public actual fun utrace(addr: ConstPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeUtrace")

public actual fun pututxline(ut: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePututxline")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePwritev")

public actual fun querylocale(mask: CInt, loc: LocaleT): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeQuerylocale")

public actual fun rtprio(function: CInt, pid: PidT, rtp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeRtprio")

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSchedRrGetInterval")

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSchedGetparam")

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSchedSetparam")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeSchedGetscheduler")
private external fun wasiLibcUnixBsdFreebsdlikeSchedGetscheduler(pid: Int): Int

public actual fun schedGetscheduler(pid: PidT): CInt =
    wasiLibcUnixBsdFreebsdlikeSchedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSchedSetscheduler")

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSemGetvalue")

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSemTimedwait")

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: MutPtr, sbytes: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSendfile")

public actual fun setdomainname(name: ConstPtr, len: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSetdomainname")

public actual fun sethostname(name: ConstPtr, len: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSethostname")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeSetpriority")
private external fun wasiLibcUnixBsdFreebsdlikeSetpriority(which: Int, who: Int, prio: Int): Int

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeSetpriority(which, who, prio)

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeSetresgid")
private external fun wasiLibcUnixBsdFreebsdlikeSetresgid(rgid: Int, egid: Int, sgid: Int): Int

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    wasiLibcUnixBsdFreebsdlikeSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeSetresuid")
private external fun wasiLibcUnixBsdFreebsdlikeSetresuid(ruid: Int, euid: Int, suid: Int): Int

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    wasiLibcUnixBsdFreebsdlikeSetresuid(ruid.toInt(), euid.toInt(), suid.toInt())

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSettimeofday")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeSetutxent")
private external fun wasiLibcUnixBsdFreebsdlikeSetutxent(): Unit

public actual fun setutxent(): Unit =
    wasiLibcUnixBsdFreebsdlikeSetutxent()

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeShmOpen")

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSigtimedwait")

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSigwaitinfo")

public actual fun sysctl(name: ConstPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSysctl")

public actual fun sysctlbyname(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSysctlbyname")

public actual fun sysctlnametomib(name: ConstPtr, mibp: MutPtr, sizep: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeSysctlnametomib")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeUselocale")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeUtimensat")

public actual fun ntpAdjtime(buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeNtpAdjtime")

public actual fun ntpGettime(buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeNtpGettime")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeDlIteratePhdr")

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeIconvOpen")

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeIconv")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeIconvClose")

public actual fun explicitBzero(s: MutPtr, len: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeExplicitBzero")

public actual fun memsetS(s: MutPtr, smax: SizeT, c: CInt, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMemsetS")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeGethostid")
private external fun wasiLibcUnixBsdFreebsdlikeGethostid(): Long

public actual fun gethostid(): CLong =
    wasiLibcUnixBsdFreebsdlikeGethostid()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeSethostid")
private external fun wasiLibcUnixBsdFreebsdlikeSethostid(hostid: Long): Unit

public actual fun sethostid(hostid: CLong): Unit =
    wasiLibcUnixBsdFreebsdlikeSethostid(hostid)

public actual fun eui64Aton(a: ConstPtr, e: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeEui64Aton")

public actual fun eui64Ntoa(id: ConstPtr, a: MutPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeEui64Ntoa")

public actual fun eui64Ntohost(hostname: MutPtr, len: SizeT, id: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeEui64Ntohost")

public actual fun eui64Hostton(hostname: ConstPtr, id: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeEui64Hostton")

public actual fun eaccess(path: ConstPtr, mode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeEaccess")

public actual fun kenv(action: CInt, name: ConstPtr, value: MutPtr, len: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeKenv")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeReboot")
private external fun wasiLibcUnixBsdFreebsdlikeReboot(howto: Int): Int

public actual fun reboot(howto: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeReboot(howto)

public actual fun exect(path: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeExect")

public actual fun execvP(file: ConstPtr, searchPath: ConstPtr, argv: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeExecvP")

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMkostemp")

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMkostemps")

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawn")

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnp")

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnattrInit")

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnattrDestroy")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnattrGetsigdefault")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnattrSetsigdefault")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnattrGetsigmask")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnattrSetsigmask")

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnattrGetflags")

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnattrSetflags")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnattrGetpgroup")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnattrSetpgroup")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnattrGetschedpolicy")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnattrSetschedpolicy")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnattrGetschedparam")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnattrSetschedparam")

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnFileActionsInit")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnFileActionsDestroy")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnFileActionsAddopen")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnFileActionsAddclose")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikePosixSpawnFileActionsAdddup2")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMqClose")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMqGetattr")

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMqNotify")

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMqOpen")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMqReceive")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMqSend")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMqSetattr")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMqTimedreceive")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMqTimedsend")

public actual fun mqUnlink(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeMqUnlink")

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeGetrandom")

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeGetentropy")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeOpenpty")

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeForkpty")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeLoginTty")
private external fun wasiLibcUnixBsdFreebsdlikeLoginTty(fd: Int): Int

public actual fun loginTty(fd: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeLoginTty(fd)

public actual fun fparseln(stream: MutPtr, len: MutPtr, lineno: MutPtr, delim: ConstPtr, flags: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFparseln")

public actual fun backtrace(addrlist: MutPtr, len: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeBacktrace")

public actual fun backtraceSymbols(addrlist: ConstPtr, len: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeBacktraceSymbols")

public actual fun backtraceSymbolsFd(addrlist: ConstPtr, len: SizeT, fd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeBacktraceSymbolsFd")

public actual fun kvmOpen(execfile: ConstPtr, corefile: ConstPtr, swapfile: ConstPtr, flags: CInt, errstr: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeKvmOpen")

public actual fun kvmClose(kd: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeKvmClose")

public actual fun kvmGetprocs(kd: MutPtr, op: CInt, arg: CInt, cnt: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeKvmGetprocs")

public actual fun kvmGetloadavg(kd: MutPtr, loadavg: MutPtr, nelem: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeKvmGetloadavg")

public actual fun kvmOpenfiles(execfile: ConstPtr, corefile: ConstPtr, swapfile: ConstPtr, flags: CInt, errbuf: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeKvmOpenfiles")

public actual fun kvmRead(kd: MutPtr, addr: CUlong, buf: MutPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeKvmRead")

public actual fun kvmWrite(kd: MutPtr, addr: CUlong, buf: ConstPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeKvmWrite")
