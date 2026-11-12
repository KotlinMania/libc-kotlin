package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.new.netbsd.sys.types.CpuidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.DevT
import io.github.kotlinmania.libc.new.netbsd.sys.types.LwpidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.MqdT
import io.github.kotlinmania.libc.new.netbsd.sys.types.TimerT
import io.github.kotlinmania.libc.unix.FILE
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
import io.github.kotlinmania.libc.unix.bsd.cmsgFirsthdr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ClockidT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.IOCPARM_MASK
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.aarch64.ALIGNBYTES
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr, size: ULong, data: MutPtr): CInt
}

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: ConstPtr, arg1: ConstPtr, arg2: MutPtr): CInt
}

public fun interface EsetfuncCbCallback {
    public operator fun invoke(arg0: CInt, arg1: ConstPtr)
}

public fun iocparmLen(x: UInt): UInt = (x shr IOCPARM_SHIFT.toInt()) and IOCPARM_MASK

public fun iocbasecmd(x: UInt): UInt = x and ((IOCPARM_MASK shl IOCPARM_SHIFT.toInt()).inv())

public fun iocgroup(x: UInt): UInt = (x shr IOCGROUP_SHIFT.toInt()) and 0xffu

public fun ioc(inout: CUlong, group: CUlong, num: CUlong, len: CUlong): CUlong = (inout) or (((len) and IOCPARM_MASK.toULong()) shl IOCPARM_SHIFT.toInt()) or ((group) shl IOCGROUP_SHIFT.toInt()) or (num)

public fun mapAligned(alignment: CInt): CInt = alignment shl MAP_ALIGNMENT_SHIFT

public fun align(p: Int): Int = (p + ALIGNBYTES) and ALIGNBYTES.inv()

public fun cmsgData(cmsg: ConstPtr): MutPtr = MutPtr(((MutPtr(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((align(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toLong() * (PrimitiveLayouts.U8).strideBytes))

public fun cmsgLen(length: CUint): CUint = align(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toUInt() + length

public fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr {
    if (((cmsg).rawAddress == 0L)) {
        return cmsgFirsthdr(mhdr)
    }
    val next = cmsg.rawAddress.toInt() + align(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()) + align(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next > max) {
        MutPtr(0L)
    } else {
        MutPtr((cmsg.rawAddress.toInt() + align(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    }
}

public fun cmsgSpace(length: CUint): CUint = (align(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) + align(length.toInt())).toUInt()

public fun dirfd(dirp: MutPtr): CInt = (PrimitiveLayouts.I32).readNative(((ConstPtr(dirp.rawAddress, dirp.rawMeta))).rawAddress)

public fun sockcredsize(ngrps: Int): Int {
    val ngrps1 =
        if (ngrps > 0) {
            ngrps - 1
        } else {
            0
        }
    return sizeOf<Sockcred>(typeLayoutT = Sockcred.typeLayout()) + sizeOf<GidT>(typeLayoutT = PrimitiveLayouts.U16) * ngrps1
}

public fun protMprotect(x: CInt): CInt = x shl 3

public fun protMprotectExtract(x: CInt): CInt = (x shr 3) and 0x7

public fun wstopsig(status: CInt): CInt = status shr 8

public fun wifsignaled(status: CInt): Boolean = (status and 127) != 127 && (status and 127) != 0

public fun wifstopped(status: CInt): Boolean = (status and 127) == 127

public fun wifcontinued(status: CInt): Boolean = status == 0xffff

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major.toULong()
    val minor1 = minor.toULong()
    var dev = 0uL
    dev = dev or ((major1 shl 8) and 0x000ff00uL)
    dev = dev or ((minor1 shl 12) and 0xfff00000uL)
    dev = dev or (minor1 and 0xffuL)
    return dev
}

public fun major(dev: DevT): CInt = (((dev.toUInt()) and 0x000fff00u) shr 8).toInt()

public fun minor(dev: DevT): CInt {
    var res = 0u
    res = res or (((dev.toUInt()) and 0xfff00000u) shr 12)
    res = res or ((dev.toUInt()) and 0x000000ffu)
    return res.toInt()
}

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt

public expect fun reallocarr(ptr: MutPtr, number: SizeT, size: SizeT): CInt

public expect fun chflags(path: ConstPtr, flags: CUlong): CInt

public expect fun fchflags(fd: CInt, flags: CUlong): CInt

public expect fun lchflags(path: ConstPtr, flags: CUlong): CInt

public expect fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT

public expect fun extattrListFile(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT

public expect fun extattrListLink(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT

public expect fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr): CInt

public expect fun extattrDeleteFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt

public expect fun extattrDeleteLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt

public expect fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT

public expect fun extattrGetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT

public expect fun extattrGetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT

public expect fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr): CInt

public expect fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): CInt

public expect fun extattrSetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): CInt

public expect fun extattrSetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): CInt

public expect fun extattrStringToNamespace(string: ConstPtr, attrnamespace: MutPtr): CInt

public expect fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt

public expect fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT

public expect fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun lutimes(file: ConstPtr, times: ConstPtr): CInt

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun sysctl(name: ConstPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt

public expect fun sysctlbyname(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt

public expect fun sysctlnametomib(sname: ConstPtr, name: MutPtr, namelenp: MutPtr): CInt

public expect fun kevent(kq: CInt, changelist: ConstPtr, nchanges: SizeT, eventlist: MutPtr, nevents: SizeT, timeout: ConstPtr): CInt

public expect fun mount(src: ConstPtr, target: ConstPtr, flags: CInt, data: MutPtr, size: SizeT): CInt

public expect fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt

public expect fun mqNotify(mqd: MqdT, notification: ConstPtr): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT

public expect fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt

public expect fun mqUnlink(name: ConstPtr): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: MutPtr, data: CInt): CInt

public expect fun utrace(label: ConstPtr, addr: MutPtr, len: SizeT): CInt

public expect fun pthreadGetnameNp(t: PthreadT, name: MutPtr, len: SizeT): CInt

public expect fun pthreadSetnameNp(t: PthreadT, name: ConstPtr, arg: ConstPtr): CInt

public expect fun pthreadAttrGetNp(thread: PthreadT, attr: MutPtr): CInt

public expect fun pthreadGetattrNp(native: PthreadT, attr: MutPtr): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt

public expect fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr): CInt

public expect fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr): CInt

public expect fun cpusetCreate(): MutPtr

public expect fun cpusetDestroy(set: MutPtr)

public expect fun cpusetClr(cpu: CpuidT, set: MutPtr): CInt

public expect fun cpusetSet(cpu: CpuidT, set: MutPtr): CInt

public expect fun cpusetIsset(cpu: CpuidT, set: ConstPtr): CInt

public expect fun cpusetSize(set: ConstPtr): SizeT

public expect fun cpusetZero(set: MutPtr)

public expect fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt

public expect fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun localeconvL(loc: LocaleT): MutPtr

public expect fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT

public expect fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun kqueue1(flags: CInt): CInt

public expect fun lwpSelf(): LwpidT

public expect fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr

// link.h
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt

// dlfcn.h
public expect fun dlauxinfo(): MutPtr

public expect fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT

public expect fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT

public expect fun iconvClose(cd: IconvT): CInt

public expect fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, currValue: MutPtr): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt

public expect fun dlvsym(handle: MutPtr, symbol: ConstPtr, version: ConstPtr): MutPtr

// Added in `NetBSD` 7.0
public expect fun explicitMemset(b: MutPtr, c: CInt, len: SizeT)

public expect fun consttimeMemequal(a: ConstPtr, b: ConstPtr, len: SizeT): CInt

public expect fun setproctitle(fmt: ConstPtr, vararg variadicArgs: Long)

public expect fun mremap(oldp: MutPtr, oldsize: SizeT, newp: MutPtr, newsize: SizeT, flags: CInt): MutPtr

public expect fun schedRrGetInterval(pid: PidT, t: MutPtr): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt

public expect fun pollts(fds: MutPtr, nfds: NfdsT, ts: ConstPtr, sigmask: ConstPtr): CInt

public expect fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT

public expect fun reboot(mode: CInt, bootstr: MutPtr): CInt

public expect fun lwpPark(clock: ClockidT, flags: CInt, ts: ConstPtr, unpark: LwpidT, hint: ConstPtr, unparkhint: MutPtr): CInt

public expect fun lwpUnpark(lwp: LwpidT, hint: ConstPtr): CInt

public expect fun lwpUnparkAll(targets: ConstPtr, ntargets: SizeT, hint: ConstPtr): CInt

public expect fun getmntinfo(mntbufp: MutPtr, flags: CInt): CInt

public expect fun getvfsstat(buf: MutPtr, bufsize: SizeT, flags: CInt): CInt

public expect fun eventfd(value: CUint, flags: CInt): CInt

public expect fun eventfdRead(efd: CInt, valp: MutPtr): CInt

public expect fun eventfdWrite(efd: CInt, value: EventfdT): CInt

// Added in `NetBSD` 10.0
public expect fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: MutPtr): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt

public expect fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr)

public expect fun aioRead(aiocbp: MutPtr): CInt

public expect fun aioWrite(aiocbp: MutPtr): CInt

public expect fun aioFsync(op: CInt, aiocbp: MutPtr): CInt

public expect fun aioError(aiocbp: ConstPtr): CInt

public expect fun aioReturn(aiocbp: MutPtr): SsizeT

public expect fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt

public expect fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt

public expect fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt

public expect fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun efopen(p: ConstPtr, m: ConstPtr): FILE

public expect fun emalloc(n: SizeT): MutPtr

public expect fun ecalloc(n: SizeT, c: SizeT): MutPtr

public expect fun erealloc(p: MutPtr, n: SizeT): MutPtr

public expect fun ereallocarr(p: MutPtr, n: SizeT, s: SizeT)

public expect fun estrdup(s: ConstPtr): MutPtr

public expect fun estrndup(s: ConstPtr, len: SizeT): MutPtr

public expect fun estrlcpy(dst: MutPtr, src: ConstPtr, len: SizeT): SizeT

public expect fun estrlcat(dst: MutPtr, src: ConstPtr, len: SizeT): SizeT

public expect fun estrtoi(nptr: ConstPtr, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT

public expect fun estrtou(nptr: ConstPtr, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT

public expect fun easprintf(string: MutPtr, fmt: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun evasprintf(string: MutPtr, fmt: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback?

public expect fun securePath(path: ConstPtr): CInt

public expect fun snprintb(buf: MutPtr, buflen: SizeT, fmt: ConstPtr, value: ULong): CInt

public expect fun snprintbM(buf: MutPtr, buflen: SizeT, fmt: ConstPtr, value: ULong, max: SizeT): CInt

public expect fun getbootfile(): ConstPtr

public expect fun getbyteorder(): CInt

public expect fun getdiskrawname(buf: MutPtr, buflen: SizeT, name: ConstPtr): ConstPtr

public expect fun getdiskcookedname(buf: MutPtr, buflen: SizeT, name: ConstPtr): ConstPtr

public expect fun getfsspecname(buf: MutPtr, buflen: SizeT, spec: ConstPtr): ConstPtr

public expect fun strpct(buf: MutPtr, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): MutPtr

public expect fun strspct(buf: MutPtr, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): MutPtr

public expect fun login(ut: ConstPtr)

public expect fun loginx(ut: ConstPtr)

public expect fun logout(line: ConstPtr)

public expect fun logoutx(line: ConstPtr, status: CInt, tpe: CInt)

public expect fun logwtmp(line: ConstPtr, name: ConstPtr, host: ConstPtr)

public expect fun logwtmpx(line: ConstPtr, name: ConstPtr, host: ConstPtr, status: CInt, tpe: CInt)

public expect fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT

public expect fun lgetxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT

public expect fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT

public expect fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT): CInt

public expect fun lsetxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT): CInt

public expect fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt

public expect fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT

public expect fun llistxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT

public expect fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT): SsizeT

public expect fun removexattr(path: ConstPtr, name: ConstPtr): CInt

public expect fun lremovexattr(path: ConstPtr, name: ConstPtr): CInt

public expect fun fremovexattr(fd: CInt, path: ConstPtr, name: ConstPtr): CInt

public expect fun stringToFlags(stringP: MutPtr, setp: MutPtr, clrp: MutPtr): CInt

public expect fun flagsToString(flags: CUlong, def: ConstPtr): CInt

public expect fun kinfoGetvmmap(pid: PidT, cntp: MutPtr): MutPtr

public expect fun backtrace(addrlist: MutPtr, len: SizeT): SizeT

public expect fun backtraceSymbols(addrlist: ConstPtr, len: SizeT): MutPtr

public expect fun backtraceSymbolsFd(addrlist: ConstPtr, len: SizeT, fd: CInt): CInt

public expect fun backtraceSymbolsFmt(addrlist: ConstPtr, len: SizeT, fmt: ConstPtr): MutPtr

public expect fun backtraceSymbolsFdFmt(addrlist: ConstPtr, len: SizeT, fd: CInt, fmt: ConstPtr): CInt
