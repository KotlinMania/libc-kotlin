package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CMSG_FIRSTHDR
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.solid.CpuidT
import io.github.kotlinmania.libc.solid.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntmaxT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UintmaxT
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.LwpidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.MqdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.TimerT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ClockidT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.IOCPARM_MASK
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.aarch64.ALIGNBYTES
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.DevT

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: COpaquePointer?, size: ULong, data: COpaquePointer?): CInt
}

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

public fun interface EsetfuncCbCallback {
    public operator fun invoke(arg0: CInt, arg1: COpaquePointer?)
}

public fun iocparmLen(x: UInt): UInt {
    return (x shr IOCPARM_SHIFT.toInt()) and IOCPARM_MASK
}

public fun iocbasecmd(x: UInt): UInt {
    return x and ((IOCPARM_MASK shl IOCPARM_SHIFT.toInt()).inv())
}

public fun iocgroup(x: UInt): UInt {
    return (x shr IOCGROUP_SHIFT.toInt()) and 0xffu
}

public fun ioc(inout: CUlong, group: CUlong, num: CUlong, len: CUlong): CUlong {
    return (inout) or (((len) and IOCPARM_MASK.toULong()) shl IOCPARM_SHIFT.toInt()) or ((group) shl IOCGROUP_SHIFT.toInt()) or (num)
}

public fun mapAligned(alignment: CInt): CInt {
    return alignment shl MAP_ALIGNMENT_SHIFT
}

public fun align(p: Int): Int {
    return (p + ALIGNBYTES) and ALIGNBYTES.inv()
}

public fun cmsgData(cmsg: Cmsghdr?): CUchar? {
    return ((((cmsg)?.hashCode()?.toLong() ?: 0L).toUByte()))?.let { COpaquePointer(it.hashCode().toLong() + (ALIGN(sizeOf<Cmsghdr>())).toLong()) }
}

public fun cmsgLen(length: CUint): CUint {
    return ALIGN(sizeOf<Cmsghdr>()).toUInt() + length
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if ((cmsg == null)) {
        return CMSG_FIRSTHDR(mhdr)
    }
    val next = ((cmsg)?.hashCode()?.toLong() ?: 0L).toInt() + ALIGN((cmsg!!.cmsgLen).toInt()) + ALIGN(sizeOf<Cmsghdr>())
    val max = (mhdr!!.msgControl).toInt() + (mhdr!!.msgControllen).toInt()
    return if (next > max) {
        nullMut<Cmsghdr>()
    } else {
        null
    }
}

public fun cmsgSpace(length: CUint): CUint {
    return (ALIGN(sizeOf<Cmsghdr>()) + ALIGN(length.toInt())).toUInt()
}

public fun dirfd(dirp: DIR?): CInt {
    return (((dirp)?.hashCode()?.toLong() ?: 0L).toInt())
}

public fun sockcredsize(ngrps: Int): Int {
    val ngrps1 = if (ngrps > 0) {
        ngrps - 1
    } else {
        0
    }
    return sizeOf<Sockcred>() + sizeOf<GidT>() * ngrps1
}

public fun protMprotect(x: CInt): CInt {
    return x shl 3
}

public fun protMprotectExtract(x: CInt): CInt {
    return (x shr 3) and 0x7
}

public fun wstopsig(status: CInt): CInt {
    return status shr 8
}

public fun wifsignaled(status: CInt): Boolean {
    return (status and 127) != 127 && (status and 127) != 0
}

public fun wifstopped(status: CInt): Boolean {
    return (status and 127) == 127
}

public fun wifcontinued(status: CInt): Boolean {
    return status == 0xffff
}

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major.toInt()
    val minor1 = minor.toInt()
    var dev = 0
    dev = dev or ((major1 shl 8) and 0x000ff00)
    dev = dev or ((minor1 shl 12) and 0xfff00000)
    dev = dev or (minor1 and 0xff)
    return dev
}

public fun major(dev: DevT): CInt {
    return (((dev.toUInt()) and 0x000fff00u) shr 8).toInt()
}

public fun minor(dev: DevT): CInt {
    var res = 0
    res = res or (((dev.toUInt()) and 0xfff00000u) shr 12)
    res = res or ((dev.toUInt()) and 0x000000ffu)
    return res.toInt()
}

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt

public expect fun reallocarr(ptr: COpaquePointer?, number: SizeT, size: SizeT): CInt

public expect fun chflags(path: String?, flags: CUlong): CInt

public expect fun fchflags(fd: CInt, flags: CUlong): CInt

public expect fun lchflags(path: String?, flags: CUlong): CInt

public expect fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt

public expect fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt

public expect fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt

public expect fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt

public expect fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt

public expect fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt

public expect fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt

public expect fun extattrStringToNamespace(string: String?, attrnamespace: COpaquePointer?): CInt

public expect fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt

public expect fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT

public expect fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun lutimes(file: String?, times: COpaquePointer?): CInt

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt

public expect fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt

public expect fun sysctlnametomib(sname: String?, name: COpaquePointer?, namelenp: COpaquePointer?): CInt

public expect fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: SizeT, eventlist: COpaquePointer?, nevents: SizeT, timeout: COpaquePointer?): CInt

public expect fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?, size: SizeT): CInt

public expect fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt

public expect fun mqNotify(mqd: MqdT, notification: COpaquePointer?): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT

public expect fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt

public expect fun mqUnlink(name: String?): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt

public expect fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt

public expect fun pthreadGetnameNp(t: PthreadT, name: COpaquePointer?, len: SizeT): CInt

public expect fun pthreadSetnameNp(t: PthreadT, name: String?, arg: COpaquePointer?): CInt

public expect fun pthreadAttrGetNp(thread: PthreadT, attr: COpaquePointer?): CInt

public expect fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt

public expect fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt

public expect fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt

public expect fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: COpaquePointer?): CInt

public expect fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: COpaquePointer?): CInt

public expect fun cpusetCreate(): COpaquePointer?

public expect fun cpusetDestroy(set: COpaquePointer?)

public expect fun cpusetClr(cpu: CpuidT, set: COpaquePointer?): CInt

public expect fun cpusetSet(cpu: CpuidT, set: COpaquePointer?): CInt

public expect fun cpusetIsset(cpu: CpuidT, set: COpaquePointer?): CInt

public expect fun cpusetSize(set: COpaquePointer?): SizeT

public expect fun cpusetZero(set: COpaquePointer?)

public expect fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun localeconvL(loc: LocaleT): COpaquePointer?

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun kqueue1(flags: CInt): CInt

public expect fun lwpSelf(): LwpidT

public expect fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer?

// link.h
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt

// dlfcn.h
public expect fun dlauxinfo(): COpaquePointer?

public expect fun iconvOpen(tocode: String?, fromcode: String?): IconvT

public expect fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT

public expect fun iconvClose(cd: IconvT): CInt

public expect fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt

public expect fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer?

// Added in `NetBSD` 7.0
public expect fun explicitMemset(b: COpaquePointer?, c: CInt, len: SizeT)

public expect fun consttimeMemequal(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt

public expect fun setproctitle(fmt: String?, vararg variadicArgs: Long)

public expect fun mremap(oldp: COpaquePointer?, oldsize: SizeT, newp: COpaquePointer?, newsize: SizeT, flags: CInt): COpaquePointer?

public expect fun schedRrGetInterval(pid: PidT, t: COpaquePointer?): CInt

public expect fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt

public expect fun pollts(fds: COpaquePointer?, nfds: NfdsT, ts: COpaquePointer?, sigmask: COpaquePointer?): CInt

public expect fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT

public expect fun reboot(mode: CInt, bootstr: COpaquePointer?): CInt

public expect fun lwpPark(clock: ClockidT, flags: CInt, ts: COpaquePointer?, unpark: LwpidT, hint: COpaquePointer?, unparkhint: COpaquePointer?): CInt

public expect fun lwpUnpark(lwp: LwpidT, hint: COpaquePointer?): CInt

public expect fun lwpUnparkAll(targets: COpaquePointer?, ntargets: SizeT, hint: COpaquePointer?): CInt

public expect fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt

public expect fun getvfsstat(buf: COpaquePointer?, bufsize: SizeT, flags: CInt): CInt

public expect fun eventfd(value: CUint, flags: CInt): CInt

public expect fun eventfdRead(efd: CInt, valp: COpaquePointer?): CInt

public expect fun eventfdWrite(efd: CInt, value: EventfdT): CInt

// Added in `NetBSD` 10.0
public expect fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt

public expect fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?)

public expect fun aioRead(aiocbp: COpaquePointer?): CInt

public expect fun aioWrite(aiocbp: COpaquePointer?): CInt

public expect fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt

public expect fun aioError(aiocbp: COpaquePointer?): CInt

public expect fun aioReturn(aiocbp: COpaquePointer?): SsizeT

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt

public expect fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt

public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt

public expect fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun efopen(p: String?, m: String?): FILE

public expect fun emalloc(n: SizeT): COpaquePointer?

public expect fun ecalloc(n: SizeT, c: SizeT): COpaquePointer?

public expect fun erealloc(p: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun ereallocarr(p: COpaquePointer?, n: SizeT, s: SizeT)

public expect fun estrdup(s: String?): COpaquePointer?

public expect fun estrndup(s: String?, len: SizeT): COpaquePointer?

public expect fun estrlcpy(dst: COpaquePointer?, src: String?, len: SizeT): SizeT

public expect fun estrlcat(dst: COpaquePointer?, src: String?, len: SizeT): SizeT

public expect fun estrtoi(nptr: String?, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT

public expect fun estrtou(nptr: String?, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT

public expect fun easprintf(string: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt

public expect fun evasprintf(string: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt

public expect fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback?

public expect fun securePath(path: String?): CInt

public expect fun snprintb(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong): CInt

public expect fun snprintbM(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong, max: SizeT): CInt

public expect fun getbootfile(): COpaquePointer?

public expect fun getbyteorder(): CInt

public expect fun getdiskrawname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer?

public expect fun getdiskcookedname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer?

public expect fun getfsspecname(buf: COpaquePointer?, buflen: SizeT, spec: String?): COpaquePointer?

public expect fun strpct(buf: COpaquePointer?, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): COpaquePointer?

public expect fun strspct(buf: COpaquePointer?, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): COpaquePointer?

public expect fun login(ut: COpaquePointer?)

public expect fun loginx(ut: COpaquePointer?)

public expect fun logout(line: String?)

public expect fun logoutx(line: String?, status: CInt, tpe: CInt)

public expect fun logwtmp(line: String?, name: String?, host: String?)

public expect fun logwtmpx(line: String?, name: String?, host: String?, status: CInt, tpe: CInt)

public expect fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT

public expect fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT

public expect fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT

public expect fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt

public expect fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt

public expect fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt

public expect fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT

public expect fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT

public expect fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT

public expect fun removexattr(path: String?, name: String?): CInt

public expect fun lremovexattr(path: String?, name: String?): CInt

public expect fun fremovexattr(fd: CInt, path: String?, name: String?): CInt

public expect fun stringToFlags(stringP: COpaquePointer?, setp: COpaquePointer?, clrp: COpaquePointer?): CInt

public expect fun flagsToString(flags: CUlong, def: String?): CInt

public expect fun kinfoGetvmmap(pid: PidT, cntp: COpaquePointer?): COpaquePointer?

public expect fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT

public expect fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer?

public expect fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt

public expect fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer?

public expect fun backtraceSymbolsFdFmt(addrlist: COpaquePointer?, len: SizeT, fd: CInt, fmt: String?): CInt
