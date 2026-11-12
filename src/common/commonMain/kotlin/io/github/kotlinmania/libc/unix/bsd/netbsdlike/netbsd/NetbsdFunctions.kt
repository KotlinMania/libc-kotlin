package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.new.netbsd.sys.statvfs.Statvfs
import io.github.kotlinmania.libc.new.netbsd.sys.time.Itimerspec
import io.github.kotlinmania.libc.new.netbsd.sys.types.CpuidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.DevT
import io.github.kotlinmania.libc.new.netbsd.sys.types.LwpidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.MqdT
import io.github.kotlinmania.libc.new.netbsd.sys.types.TimerT
import io.github.kotlinmania.libc.new.netbsd.utmp.Utmp
import io.github.kotlinmania.libc.new.netbsd.utmpx.Utmpx
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntmaxT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UintmaxT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.Passwd
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.cmsgFirsthdr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ClockidT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.IOCPARM_MASK
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.SchedParam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.Termios
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.aarch64.ALIGNBYTES
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr<DlPhdrInfo>, size: ULong, data: MutPtr<CVoid>): CInt
}

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: ConstPtr<CVoid>, arg1: ConstPtr<CVoid>, arg2: MutPtr<CVoid>): CInt
}

public fun interface EsetfuncCbCallback {
    public operator fun invoke(arg0: CInt, arg1: ConstPtr<CChar>)
}

public fun iocparmLen(x: UInt): UInt = (x shr IOCPARM_SHIFT.toInt()) and IOCPARM_MASK

public fun iocbasecmd(x: UInt): UInt = x and ((IOCPARM_MASK shl IOCPARM_SHIFT.toInt()).inv())

public fun iocgroup(x: UInt): UInt = (x shr IOCGROUP_SHIFT.toInt()) and 0xffu

public fun ioc(inout: CUlong, group: CUlong, num: CUlong, len: CUlong): CUlong = (inout) or (((len) and IOCPARM_MASK.toULong()) shl IOCPARM_SHIFT.toInt()) or ((group) shl IOCGROUP_SHIFT.toInt()) or (num)

public fun mapAligned(alignment: CInt): CInt = alignment shl MAP_ALIGNMENT_SHIFT

public fun align(p: Int): Int = (p + ALIGNBYTES) and ALIGNBYTES.inv()

public fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> = MutPtr(((MutPtr<CUchar>(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((align(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>()))).toLong() * (ObjectSlotLayout<CUchar>()).strideBytes))

public fun cmsgLen(length: CUint): CUint = align(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>())).toUInt() + length

public fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> {
    if (((cmsg).rawAddress == 0L)) {
        return cmsgFirsthdr(mhdr)
    }
    val next = cmsg.rawAddress.toInt() + align(((ObjectSlotLayout<Cmsghdr>()).readNative((cmsg).rawAddress).cmsgLen).toInt()) + align(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>()))
    val max = ((ObjectSlotLayout<Msghdr>()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((ObjectSlotLayout<Msghdr>()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next > max) {
        MutPtr<Cmsghdr>(0L)
    } else {
        MutPtr<Cmsghdr>((cmsg.rawAddress.toInt() + align(((ObjectSlotLayout<Cmsghdr>()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    }
}

public fun cmsgSpace(length: CUint): CUint = (align(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>())) + align(length.toInt())).toUInt()

public fun dirfd(dirp: MutPtr<DIR>): CInt = (ObjectSlotLayout<CInt>()).readNative(((ConstPtr<CInt>(dirp.rawAddress, dirp.rawMeta))).rawAddress)

public fun sockcredsize(ngrps: Int): Int {
    val ngrps1 =
        if (ngrps > 0) {
            ngrps - 1
        } else {
            0
        }
    return sizeOf<Sockcred>(typeLayoutT = Sockcred.typeLayout()) + sizeOf<GidT>(typeLayoutT = ObjectSlotLayout<GidT>()) * ngrps1
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

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt

public expect fun reallocarr(ptr: MutPtr<CVoid>, number: SizeT, size: SizeT): CInt

public expect fun chflags(path: ConstPtr<CChar>, flags: CUlong): CInt

public expect fun fchflags(fd: CInt, flags: CUlong): CInt

public expect fun lchflags(path: ConstPtr<CChar>, flags: CUlong): CInt

public expect fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun extattrListFile(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun extattrListLink(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt

public expect fun extattrDeleteFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt

public expect fun extattrDeleteLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt

public expect fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun extattrGetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun extattrGetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr<MutPtr<CChar>>): CInt

public expect fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): CInt

public expect fun extattrSetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): CInt

public expect fun extattrSetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): CInt

public expect fun extattrStringToNamespace(string: ConstPtr<CChar>, attrnamespace: MutPtr<CInt>): CInt

public expect fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt

public expect fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT

public expect fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt

public expect fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt

public expect fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt

public expect fun sysctl(name: ConstPtr<CInt>, namelen: CUint, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt

public expect fun sysctlbyname(name: ConstPtr<CChar>, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt

public expect fun sysctlnametomib(sname: ConstPtr<CChar>, name: MutPtr<CInt>, namelenp: MutPtr<SizeT>): CInt

public expect fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: SizeT, eventlist: MutPtr<Kevent>, nevents: SizeT, timeout: ConstPtr<Timespec>): CInt

public expect fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, flags: CInt, data: MutPtr<CVoid>, size: SizeT): CInt

public expect fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt

public expect fun mqNotify(mqd: MqdT, notification: ConstPtr<Sigevent>): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT

public expect fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt

public expect fun mqUnlink(name: ConstPtr<CChar>): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: MutPtr<CVoid>, data: CInt): CInt

public expect fun utrace(label: ConstPtr<CChar>, addr: MutPtr<CVoid>, len: SizeT): CInt

public expect fun pthreadGetnameNp(t: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt

public expect fun pthreadSetnameNp(t: PthreadT, name: ConstPtr<CChar>, arg: ConstPtr<CVoid>): CInt

public expect fun pthreadAttrGetNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt

public expect fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr<CpusetT>): CInt

public expect fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr<CpusetT>): CInt

public expect fun cpusetCreate(): MutPtr<CpusetT>

public expect fun cpusetDestroy(set: MutPtr<CpusetT>)

public expect fun cpusetClr(cpu: CpuidT, set: MutPtr<CpusetT>): CInt

public expect fun cpusetSet(cpu: CpuidT, set: MutPtr<CpusetT>): CInt

public expect fun cpusetIsset(cpu: CpuidT, set: ConstPtr<CpusetT>): CInt

public expect fun cpusetSize(set: ConstPtr<CpusetT>): SizeT

public expect fun cpusetZero(set: MutPtr<CpusetT>)

public expect fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt

public expect fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun localeconvL(loc: LocaleT): MutPtr<Lconv>

public expect fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT

public expect fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<CVoid>): CInt

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun kqueue1(flags: CInt): CInt

public expect fun lwpSelf(): LwpidT

public expect fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid>

// link.h
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt

// dlfcn.h
public expect fun dlauxinfo(): MutPtr<CVoid>

public expect fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT

public expect fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT

public expect fun iconvClose(cd: IconvT): CInt

public expect fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, currValue: MutPtr<Itimerspec>): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt

public expect fun dlvsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>, version: ConstPtr<CChar>): MutPtr<CVoid>

// Added in `NetBSD` 7.0
public expect fun explicitMemset(b: MutPtr<CVoid>, c: CInt, len: SizeT)

public expect fun consttimeMemequal(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt

public expect fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long)

public expect fun mremap(oldp: MutPtr<CVoid>, oldsize: SizeT, newp: MutPtr<CVoid>, newsize: SizeT, flags: CInt): MutPtr<CVoid>

public expect fun schedRrGetInterval(pid: PidT, t: MutPtr<Timespec>): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun pollts(fds: MutPtr<Pollfd>, nfds: NfdsT, ts: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt

public expect fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT

public expect fun reboot(mode: CInt, bootstr: MutPtr<CChar>): CInt

public expect fun lwpPark(clock: ClockidT, flags: CInt, ts: ConstPtr<Timespec>, unpark: LwpidT, hint: ConstPtr<CVoid>, unparkhint: MutPtr<CVoid>): CInt

public expect fun lwpUnpark(lwp: LwpidT, hint: ConstPtr<CVoid>): CInt

public expect fun lwpUnparkAll(targets: ConstPtr<LwpidT>, ntargets: SizeT, hint: ConstPtr<CVoid>): CInt

public expect fun getmntinfo(mntbufp: MutPtr<MutPtr<Statvfs>>, flags: CInt): CInt

public expect fun getvfsstat(buf: MutPtr<Statvfs>, bufsize: SizeT, flags: CInt): CInt

public expect fun eventfd(value: CUint, flags: CInt): CInt

public expect fun eventfdRead(efd: CInt, valp: MutPtr<EventfdT>): CInt

public expect fun eventfdWrite(efd: CInt, value: EventfdT): CInt

// Added in `NetBSD` 10.0
public expect fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt

public expect fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>)

public expect fun aioRead(aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioError(aiocbp: ConstPtr<Aiocb>): CInt

public expect fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT

public expect fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt

public expect fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt

public expect fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun efopen(p: ConstPtr<CChar>, m: ConstPtr<CChar>): FILE

public expect fun emalloc(n: SizeT): MutPtr<CVoid>

public expect fun ecalloc(n: SizeT, c: SizeT): MutPtr<CVoid>

public expect fun erealloc(p: MutPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun ereallocarr(p: MutPtr<CVoid>, n: SizeT, s: SizeT)

public expect fun estrdup(s: ConstPtr<CChar>): MutPtr<CChar>

public expect fun estrndup(s: ConstPtr<CChar>, len: SizeT): MutPtr<CChar>

public expect fun estrlcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, len: SizeT): SizeT

public expect fun estrlcat(dst: MutPtr<CChar>, src: ConstPtr<CChar>, len: SizeT): SizeT

public expect fun estrtoi(nptr: ConstPtr<CChar>, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT

public expect fun estrtou(nptr: ConstPtr<CChar>, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT

public expect fun easprintf(string: MutPtr<MutPtr<CChar>>, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun evasprintf(string: MutPtr<MutPtr<CChar>>, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback?

public expect fun securePath(path: ConstPtr<CChar>): CInt

public expect fun snprintb(buf: MutPtr<CChar>, buflen: SizeT, fmt: ConstPtr<CChar>, value: ULong): CInt

public expect fun snprintbM(buf: MutPtr<CChar>, buflen: SizeT, fmt: ConstPtr<CChar>, value: ULong, max: SizeT): CInt

public expect fun getbootfile(): ConstPtr<CChar>

public expect fun getbyteorder(): CInt

public expect fun getdiskrawname(buf: MutPtr<CChar>, buflen: SizeT, name: ConstPtr<CChar>): ConstPtr<CChar>

public expect fun getdiskcookedname(buf: MutPtr<CChar>, buflen: SizeT, name: ConstPtr<CChar>): ConstPtr<CChar>

public expect fun getfsspecname(buf: MutPtr<CChar>, buflen: SizeT, spec: ConstPtr<CChar>): ConstPtr<CChar>

public expect fun strpct(buf: MutPtr<CChar>, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): MutPtr<CChar>

public expect fun strspct(buf: MutPtr<CChar>, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): MutPtr<CChar>

public expect fun login(ut: ConstPtr<Utmp>)

public expect fun loginx(ut: ConstPtr<Utmpx>)

public expect fun logout(line: ConstPtr<CChar>)

public expect fun logoutx(line: ConstPtr<CChar>, status: CInt, tpe: CInt)

public expect fun logwtmp(line: ConstPtr<CChar>, name: ConstPtr<CChar>, host: ConstPtr<CChar>)

public expect fun logwtmpx(line: ConstPtr<CChar>, name: ConstPtr<CChar>, host: ConstPtr<CChar>, status: CInt, tpe: CInt)

public expect fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT

public expect fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT

public expect fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT

public expect fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT): CInt

public expect fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT): CInt

public expect fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt

public expect fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT

public expect fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT

public expect fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT

public expect fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt

public expect fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt

public expect fun fremovexattr(fd: CInt, path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt

public expect fun stringToFlags(stringP: MutPtr<MutPtr<CChar>>, setp: MutPtr<CUlong>, clrp: MutPtr<CUlong>): CInt

public expect fun flagsToString(flags: CUlong, def: ConstPtr<CChar>): CInt

public expect fun kinfoGetvmmap(pid: PidT, cntp: MutPtr<SizeT>): MutPtr<KinfoVmentry>

public expect fun backtrace(addrlist: MutPtr<MutPtr<CVoid>>, len: SizeT): SizeT

public expect fun backtraceSymbols(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT): MutPtr<MutPtr<CChar>>

public expect fun backtraceSymbolsFd(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt): CInt

public expect fun backtraceSymbolsFmt(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fmt: ConstPtr<CChar>): MutPtr<MutPtr<CChar>>

public expect fun backtraceSymbolsFdFmt(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt, fmt: ConstPtr<CChar>): CInt
