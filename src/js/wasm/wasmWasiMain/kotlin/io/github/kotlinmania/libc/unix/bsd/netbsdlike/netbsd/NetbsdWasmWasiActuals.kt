@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.new.netbsd.sys.types.CpuidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.LwpidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.MqdT
import io.github.kotlinmania.libc.new.netbsd.sys.types.TimerT
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.IntmaxT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UintmaxT
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ClockidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdClockNanosleep")

public actual fun reallocarr(ptr: MutPtr, number: SizeT, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdReallocarr")

public actual fun chflags(path: ConstPtr, flags: CUlong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdChflags")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeNetbsdFchflags")
private external fun wasiLibcUnixBsdNetbsdlikeNetbsdFchflags(fd: Int, flags: Long): Int

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    wasiLibcUnixBsdNetbsdlikeNetbsdFchflags(fd, flags.toLong())

public actual fun lchflags(path: ConstPtr, flags: CUlong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLchflags")

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdExtattrListFd")

public actual fun extattrListFile(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdExtattrListFile")

public actual fun extattrListLink(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdExtattrListLink")

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFd")

public actual fun extattrDeleteFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFile")

public actual fun extattrDeleteLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdExtattrDeleteLink")

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdExtattrGetFd")

public actual fun extattrGetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdExtattrGetFile")

public actual fun extattrGetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdExtattrGetLink")

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdExtattrNamespaceToString")

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdExtattrSetFd")

public actual fun extattrSetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdExtattrSetFile")

public actual fun extattrSetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdExtattrSetLink")

public actual fun extattrStringToNamespace(string: ConstPtr, attrnamespace: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdExtattrStringToNamespace")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdOpenpty")

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdForkpty")

public actual fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdPtsnameR")

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLutimes")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdGettimeofday")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdGetnameinfo")

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdMprotect")

public actual fun sysctl(name: ConstPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdSysctl")

public actual fun sysctlbyname(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdSysctlbyname")

public actual fun sysctlnametomib(sname: ConstPtr, name: MutPtr, namelenp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdSysctlnametomib")

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: SizeT, eventlist: MutPtr, nevents: SizeT, timeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdKevent")

public actual fun mount(src: ConstPtr, target: ConstPtr, flags: CInt, data: MutPtr, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdMount")

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdMqOpen")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdMqClose")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdMqGetattr")

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdMqNotify")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdMqReceive")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdMqSend")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdMqSetattr")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdMqTimedreceive")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdMqTimedsend")

public actual fun mqUnlink(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdMqUnlink")

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr, data: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdPtrace")

public actual fun utrace(label: ConstPtr, addr: MutPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdUtrace")

public actual fun pthreadGetnameNp(t: PthreadT, name: MutPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdPthreadGetnameNp")

public actual fun pthreadSetnameNp(t: PthreadT, name: ConstPtr, arg: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdPthreadSetnameNp")

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetNp")

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdPthreadGetattrNp")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetguardsize")

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdPthreadAttrSetguardsize")

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetstack")

public actual fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdPthreadGetaffinityNp")

public actual fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdPthreadSetaffinityNp")

public actual fun cpusetCreate(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdCpusetCreate")

public actual fun cpusetDestroy(set: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdCpusetDestroy")

public actual fun cpusetClr(cpu: CpuidT, set: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdCpusetClr")

public actual fun cpusetSet(cpu: CpuidT, set: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdCpusetSet")

public actual fun cpusetIsset(cpu: CpuidT, set: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdCpusetIsset")

public actual fun cpusetSize(set: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdCpusetSize")

public actual fun cpusetZero(set: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdCpusetZero")

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdSigtimedwait")

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdSigwaitinfo")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdDuplocale")

public actual fun freelocale(loc: LocaleT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdFreelocale")

public actual fun localeconvL(loc: LocaleT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLocaleconvL")

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdNewlocale")

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdSettimeofday")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeNetbsdDup3")
private external fun wasiLibcUnixBsdNetbsdlikeNetbsdDup3(src: Int, dst: Int, flags: Int): Int

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    wasiLibcUnixBsdNetbsdlikeNetbsdDup3(src, dst, flags)

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeNetbsdKqueue1")
private external fun wasiLibcUnixBsdNetbsdlikeNetbsdKqueue1(flags: Int): Int

public actual fun kqueue1(flags: CInt): CInt =
    wasiLibcUnixBsdNetbsdlikeNetbsdKqueue1(flags)

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeNetbsdLwpSelf")
private external fun wasiLibcUnixBsdNetbsdlikeNetbsdLwpSelf(): Int

public actual fun lwpSelf(): LwpidT =
    wasiLibcUnixBsdNetbsdlikeNetbsdLwpSelf()

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdMemmem")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdDlIteratePhdr")

public actual fun dlauxinfo(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdDlauxinfo")

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdIconvOpen")

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdIconv")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdIconvClose")

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdTimerCreate")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdTimerDelete")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdTimerGetoverrun")

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdTimerGettime")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdTimerSettime")

public actual fun dlvsym(handle: MutPtr, symbol: ConstPtr, version: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdDlvsym")

public actual fun explicitMemset(b: MutPtr, c: CInt, len: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdExplicitMemset")

public actual fun consttimeMemequal(a: ConstPtr, b: ConstPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdConsttimeMemequal")

public actual fun setproctitle(fmt: ConstPtr, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdSetproctitle")

public actual fun mremap(oldp: MutPtr, oldsize: SizeT, newp: MutPtr, newsize: SizeT, flags: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdMremap")

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdSchedRrGetInterval")

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdSchedSetparam")

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdSchedGetparam")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeNetbsdSchedGetscheduler")
private external fun wasiLibcUnixBsdNetbsdlikeNetbsdSchedGetscheduler(pid: Int): Int

public actual fun schedGetscheduler(pid: PidT): CInt =
    wasiLibcUnixBsdNetbsdlikeNetbsdSchedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdSchedSetscheduler")

public actual fun pollts(fds: MutPtr, nfds: NfdsT, ts: ConstPtr, sigmask: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdPollts")

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdGetrandom")

public actual fun reboot(mode: CInt, bootstr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdReboot")

public actual fun lwpPark(clock: ClockidT, flags: CInt, ts: ConstPtr, unpark: LwpidT, hint: ConstPtr, unparkhint: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLwpPark")

public actual fun lwpUnpark(lwp: LwpidT, hint: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLwpUnpark")

public actual fun lwpUnparkAll(targets: ConstPtr, ntargets: SizeT, hint: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLwpUnparkAll")

public actual fun getmntinfo(mntbufp: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdGetmntinfo")

public actual fun getvfsstat(buf: MutPtr, bufsize: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdGetvfsstat")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeNetbsdEventfd")
private external fun wasiLibcUnixBsdNetbsdlikeNetbsdEventfd(value: Int, flags: Int): Int

public actual fun eventfd(value: CUint, flags: CInt): CInt =
    wasiLibcUnixBsdNetbsdlikeNetbsdEventfd(value.toInt(), flags)

public actual fun eventfdRead(efd: CInt, valp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdEventfdRead")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeNetbsdEventfdWrite")
private external fun wasiLibcUnixBsdNetbsdlikeNetbsdEventfdWrite(efd: Int, value: Long): Int

public actual fun eventfdWrite(efd: CInt, value: EventfdT): CInt =
    wasiLibcUnixBsdNetbsdlikeNetbsdEventfdWrite(efd, value.toLong())

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeNetbsdTimerfdCreate")
private external fun wasiLibcUnixBsdNetbsdlikeNetbsdTimerfdCreate(clockid: Int, flags: Int): Int

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    wasiLibcUnixBsdNetbsdlikeNetbsdTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdTimerfdGettime")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdTimerfdSettime")

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdQsortR")

public actual fun aioRead(aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdAioRead")

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdAioWrite")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdAioFsync")

public actual fun aioError(aiocbp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdAioError")

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdAioReturn")

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdAioSuspend")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdAioCancel")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLioListio")

public actual fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdGetpwentR")

public actual fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdGetgrentR")

public actual fun efopen(p: ConstPtr, m: ConstPtr): FILE =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdEfopen")

public actual fun emalloc(n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdEmalloc")

public actual fun ecalloc(n: SizeT, c: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdEcalloc")

public actual fun erealloc(p: MutPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdErealloc")

public actual fun ereallocarr(p: MutPtr, n: SizeT, s: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdEreallocarr")

public actual fun estrdup(s: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdEstrdup")

public actual fun estrndup(s: ConstPtr, len: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdEstrndup")

public actual fun estrlcpy(dst: MutPtr, src: ConstPtr, len: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdEstrlcpy")

public actual fun estrlcat(dst: MutPtr, src: ConstPtr, len: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdEstrlcat")

public actual fun estrtoi(nptr: ConstPtr, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdEstrtoi")

public actual fun estrtou(nptr: ConstPtr, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdEstrtou")

public actual fun easprintf(string: MutPtr, fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdEasprintf")

public actual fun evasprintf(string: MutPtr, fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdEvasprintf")

public actual fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback? =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdEsetfunc")

public actual fun securePath(path: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdSecurePath")

public actual fun snprintb(buf: MutPtr, buflen: SizeT, fmt: ConstPtr, value: ULong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdSnprintb")

public actual fun snprintbM(buf: MutPtr, buflen: SizeT, fmt: ConstPtr, value: ULong, max: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdSnprintbM")

public actual fun getbootfile(): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdGetbootfile")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeNetbsdGetbyteorder")
private external fun wasiLibcUnixBsdNetbsdlikeNetbsdGetbyteorder(): Int

public actual fun getbyteorder(): CInt =
    wasiLibcUnixBsdNetbsdlikeNetbsdGetbyteorder()

public actual fun getdiskrawname(buf: MutPtr, buflen: SizeT, name: ConstPtr): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdGetdiskrawname")

public actual fun getdiskcookedname(buf: MutPtr, buflen: SizeT, name: ConstPtr): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdGetdiskcookedname")

public actual fun getfsspecname(buf: MutPtr, buflen: SizeT, spec: ConstPtr): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdGetfsspecname")

public actual fun strpct(buf: MutPtr, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdStrpct")

public actual fun strspct(buf: MutPtr, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdStrspct")

public actual fun login(ut: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLogin")

public actual fun loginx(ut: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLoginx")

public actual fun logout(line: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLogout")

public actual fun logoutx(line: ConstPtr, status: CInt, tpe: CInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLogoutx")

public actual fun logwtmp(line: ConstPtr, name: ConstPtr, host: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLogwtmp")

public actual fun logwtmpx(line: ConstPtr, name: ConstPtr, host: ConstPtr, status: CInt, tpe: CInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLogwtmpx")

public actual fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdGetxattr")

public actual fun lgetxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLgetxattr")

public actual fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdFgetxattr")

public actual fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdSetxattr")

public actual fun lsetxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLsetxattr")

public actual fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdFsetxattr")

public actual fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdListxattr")

public actual fun llistxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLlistxattr")

public actual fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdFlistxattr")

public actual fun removexattr(path: ConstPtr, name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdRemovexattr")

public actual fun lremovexattr(path: ConstPtr, name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdLremovexattr")

public actual fun fremovexattr(fd: CInt, path: ConstPtr, name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdFremovexattr")

public actual fun stringToFlags(stringP: MutPtr, setp: MutPtr, clrp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdStringToFlags")

public actual fun flagsToString(flags: CUlong, def: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdFlagsToString")

public actual fun kinfoGetvmmap(pid: PidT, cntp: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdKinfoGetvmmap")

public actual fun backtrace(addrlist: MutPtr, len: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdBacktrace")

public actual fun backtraceSymbols(addrlist: ConstPtr, len: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdBacktraceSymbols")

public actual fun backtraceSymbolsFd(addrlist: ConstPtr, len: SizeT, fd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFd")

public actual fun backtraceSymbolsFmt(addrlist: ConstPtr, len: SizeT, fmt: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFmt")

public actual fun backtraceSymbolsFdFmt(addrlist: ConstPtr, len: SizeT, fd: CInt, fmt: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFdFmt")
