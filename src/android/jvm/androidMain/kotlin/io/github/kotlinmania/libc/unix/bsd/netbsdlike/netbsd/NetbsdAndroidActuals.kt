@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.new.netbsd.sys.statvfs.Statvfs
import io.github.kotlinmania.libc.new.netbsd.sys.time.Itimerspec
import io.github.kotlinmania.libc.new.netbsd.sys.types.CpuidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.LwpidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.MqdT
import io.github.kotlinmania.libc.new.netbsd.sys.types.TimerT
import io.github.kotlinmania.libc.new.netbsd.utmp.Utmp
import io.github.kotlinmania.libc.new.netbsd.utmpx.Utmpx
import io.github.kotlinmania.libc.unix.FILE
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
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.Passwd
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ClockidT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.SchedParam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.Termios
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixBsdNetbsdlikeNetbsdJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdClockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdReallocarr(ptr: Long, number: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdChflags(path: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdFchflags(fd: Int, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLchflags(path: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrListFd(fd: Int, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrListFile(path: Long, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrListLink(path: Long, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFd(fd: Int, attrnamespace: Int, attrname: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFile(path: Long, attrnamespace: Int, attrname: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrDeleteLink(path: Long, attrnamespace: Int, attrname: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrGetFd(fd: Int, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrGetFile(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrGetLink(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrNamespaceToString(attrnamespace: Int, string: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrSetFd(fd: Int, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrSetFile(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrSetLink(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExtattrStringToNamespace(string: Long, attrnamespace: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdOpenpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdForkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPtsnameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLutimes(file: Long, times: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSysctlbyname(name: Long, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSysctlnametomib(sname: Long, name: Long, namelenp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdKevent(kq: Int, changelist: Long, nchanges: Long, eventlist: Long, nevents: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMount(src: Long, target: Long, flags: Int, data: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqClose(mqd: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqGetattr(mqd: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqNotify(mqd: Long, notification: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqSend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqTimedsend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMqUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPtrace(request: Int, pid: Int, addr: Long, data: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdUtrace(label: Long, addr: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadGetnameNp(t: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadSetnameNp(t: Long, name: Long, arg: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetNp(thread: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadGetattrNp(native: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadGetaffinityNp(thread: Long, size: Long, set: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPthreadSetaffinityNp(thread: Long, size: Long, set: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdCpusetCreate(): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdCpusetDestroy(set: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdCpusetClr(cpu: Long, set: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdCpusetSet(cpu: Long, set: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdCpusetIsset(cpu: Long, set: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdCpusetSize(set: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdCpusetZero(set: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdDuplocale(base: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdFreelocale(loc: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLocaleconvL(loc: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdNewlocale(mask: Int, locale: Long, base: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSettimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdDup3(src: Int, dst: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdKqueue1(flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLwpSelf(): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMemmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdDlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdDlauxinfo(): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdIconvOpen(tocode: Long, fromcode: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdIconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdIconvClose(cd: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerCreate(clockid: Int, sevp: Long, timerid: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerDelete(timerid: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerGettime(timerid: Long, currValue: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdDlvsym(handle: Long, symbol: Long, version: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdExplicitMemset(b: Long, c: Int, len: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdConsttimeMemequal(a: Long, b: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSetproctitle(fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdMremap(oldp: Long, oldsize: Long, newp: Long, newsize: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSchedRrGetInterval(pid: Int, t: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSchedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSchedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSchedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSchedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdPollts(fds: Long, nfds: Int, ts: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdReboot(mode: Int, bootstr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLwpPark(clock: Int, flags: Int, ts: Long, unpark: Int, hint: Long, unparkhint: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLwpUnpark(lwp: Int, hint: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLwpUnparkAll(targets: Long, ntargets: Long, hint: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetmntinfo(mntbufp: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetvfsstat(buf: Long, bufsize: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEventfd(value: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEventfdRead(efd: Int, valp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEventfdWrite(efd: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerfdCreate(clockid: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerfdGettime(fd: Int, currValue: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdTimerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdQsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdAioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdAioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdAioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdAioError(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdAioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdAioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdAioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetpwentR(pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetgrentR(grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEmalloc(n: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEcalloc(n: Long, c: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdErealloc(p: Long, n: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEreallocarr(p: Long, n: Long, s: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEstrdup(s: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEstrndup(s: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEstrlcpy(dst: Long, src: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEstrlcat(dst: Long, src: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEstrtoi(nptr: Long, base: Int, lo: Long, hi: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEstrtou(nptr: Long, base: Int, lo: Long, hi: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEasprintf(string: Long, fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEvasprintf(string: Long, fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdEsetfunc(cb: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSecurePath(path: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSnprintb(buf: Long, buflen: Long, fmt: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSnprintbM(buf: Long, buflen: Long, fmt: Long, value: Long, max: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetbootfile(): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetbyteorder(): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetdiskrawname(buf: Long, buflen: Long, name: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetdiskcookedname(buf: Long, buflen: Long, name: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetfsspecname(buf: Long, buflen: Long, spec: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdStrpct(buf: Long, bufsiz: Long, numerator: Long, denominator: Long, precision: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdStrspct(buf: Long, bufsiz: Long, numerator: Long, denominator: Long, precision: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLogin(ut: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLoginx(ut: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLogout(line: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLogoutx(line: Long, status: Int, tpe: Int)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLogwtmp(line: Long, name: Long, host: Long)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLogwtmpx(line: Long, name: Long, host: Long, status: Int, tpe: Int)

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdGetxattr(path: Long, name: Long, value: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLgetxattr(path: Long, name: Long, value: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdFgetxattr(filedes: Int, name: Long, value: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdSetxattr(path: Long, name: Long, value: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLsetxattr(path: Long, name: Long, value: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdFsetxattr(filedes: Int, name: Long, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdListxattr(path: Long, list: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLlistxattr(path: Long, list: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdFlistxattr(filedes: Int, list: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdRemovexattr(path: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdLremovexattr(path: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdFremovexattr(fd: Int, path: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdStringToFlags(stringP: Long, setp: Long, clrp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdFlagsToString(flags: Long, def: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdKinfoGetvmmap(pid: Int, cntp: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdBacktrace(addrlist: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdBacktraceSymbols(addrlist: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFd(addrlist: Long, len: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFmt(addrlist: Long, len: Long, fmt: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFdFmt(addrlist: Long, len: Long, fd: Int, fmt: Long): Int
}

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdClockNanosleep(clkId, flags, rqtp.rawAddress, rmtp.rawAddress)

public actual fun reallocarr(ptr: MutPtr<CVoid>, number: SizeT, size: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdReallocarr(ptr.rawAddress, number.toLong(), size.toLong())

public actual fun chflags(path: ConstPtr<CChar>, flags: CUlong): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdChflags(path.rawAddress, flags.toLong())

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdFchflags(fd, flags.toLong())

public actual fun lchflags(path: ConstPtr<CChar>, flags: CUlong): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLchflags(path.rawAddress, flags.toLong())

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrListFd(fd, attrnamespace, data.rawAddress, nbytes.toLong())

public actual fun extattrListFile(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrListFile(path.rawAddress, attrnamespace, data.rawAddress, nbytes.toLong())

public actual fun extattrListLink(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrListLink(path.rawAddress, attrnamespace, data.rawAddress, nbytes.toLong())

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFd(fd, attrnamespace, attrname.rawAddress)

public actual fun extattrDeleteFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFile(path.rawAddress, attrnamespace, attrname.rawAddress)

public actual fun extattrDeleteLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrDeleteLink(path.rawAddress, attrnamespace, attrname.rawAddress)

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrGetFd(fd, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrGetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrGetFile(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrGetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrGetLink(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr<MutPtr<CChar>>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrNamespaceToString(attrnamespace, string.rawAddress)

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrSetFd(fd, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrSetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrSetFile(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrSetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrSetLink(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrStringToNamespace(string: ConstPtr<CChar>, attrnamespace: MutPtr<CInt>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExtattrStringToNamespace(string.rawAddress, attrnamespace.rawAddress)

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdOpenpty(amaster.rawAddress, aslave.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdForkpty(amaster.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPtsnameR(fd, buf.rawAddress, buflen.toLong())

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLutimes(file.rawAddress, times.rawAddress)

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toInt(), serv.rawAddress, servlen.toInt(), flags)

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun sysctl(name: ConstPtr<CInt>, namelen: CUint, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSysctl(name.rawAddress, namelen.toInt(), oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun sysctlbyname(name: ConstPtr<CChar>, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSysctlbyname(name.rawAddress, oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun sysctlnametomib(sname: ConstPtr<CChar>, name: MutPtr<CInt>, namelenp: MutPtr<SizeT>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSysctlnametomib(sname.rawAddress, name.rawAddress, namelenp.rawAddress)

public actual fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: SizeT, eventlist: MutPtr<Kevent>, nevents: SizeT, timeout: ConstPtr<Timespec>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdKevent(kq, changelist.rawAddress, nchanges.toLong(), eventlist.rawAddress, nevents.toLong(), timeout.rawAddress)

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, flags: CInt, data: MutPtr<CVoid>, size: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMount(src.rawAddress, target.rawAddress, flags, data.rawAddress, size.toLong())

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqClose(mqd.toLong())

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqGetattr(mqd.toLong(), attr.rawAddress)

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr<Sigevent>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqNotify(mqd.toLong(), notification.rawAddress)

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqReceive(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress)

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqSend(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt())

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqSetattr(mqd.toLong(), newattr.rawAddress, oldattr.rawAddress)

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqTimedreceive(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress, absTimeout.rawAddress)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqTimedsend(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt(), absTimeout.rawAddress)

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMqUnlink(name.rawAddress)

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr<CVoid>, data: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPtrace(request, pid, addr.rawAddress, data)

public actual fun utrace(label: ConstPtr<CChar>, addr: MutPtr<CVoid>, len: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdUtrace(label.rawAddress, addr.rawAddress, len.toLong())

public actual fun pthreadGetnameNp(t: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadGetnameNp(t.toLong(), name.rawAddress, len.toLong())

public actual fun pthreadSetnameNp(t: PthreadT, name: ConstPtr<CChar>, arg: ConstPtr<CVoid>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadSetnameNp(t.toLong(), name.rawAddress, arg.rawAddress)

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetNp(thread.toLong(), attr.rawAddress)

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadGetattrNp(native.toLong(), attr.rawAddress)

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetguardsize(attr.rawAddress, guardsize.rawAddress)

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadAttrSetguardsize(attr.rawAddress, guardsize.toLong())

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.rawAddress)

public actual fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr<CpusetT>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadGetaffinityNp(thread.toLong(), size.toLong(), set.rawAddress)

public actual fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr<CpusetT>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPthreadSetaffinityNp(thread.toLong(), size.toLong(), set.rawAddress)

public actual fun cpusetCreate(): MutPtr<CpusetT> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdCpusetCreate())

public actual fun cpusetDestroy(set: MutPtr<CpusetT>) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdCpusetDestroy(set.rawAddress)
}

public actual fun cpusetClr(cpu: CpuidT, set: MutPtr<CpusetT>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdCpusetClr(cpu.toLong(), set.rawAddress)

public actual fun cpusetSet(cpu: CpuidT, set: MutPtr<CpusetT>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdCpusetSet(cpu.toLong(), set.rawAddress)

public actual fun cpusetIsset(cpu: CpuidT, set: ConstPtr<CpusetT>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdCpusetIsset(cpu.toLong(), set.rawAddress)

public actual fun cpusetSize(set: ConstPtr<CpusetT>): SizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdCpusetSize(set.rawAddress).toULong()

public actual fun cpusetZero(set: MutPtr<CpusetT>) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdCpusetZero(set.rawAddress)
}

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSigtimedwait(set.rawAddress, info.rawAddress, timeout.rawAddress)

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSigwaitinfo(set.rawAddress, info.rawAddress)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdDuplocale(base.rawAddress))

public actual fun freelocale(loc: LocaleT) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdFreelocale(loc.rawAddress)
}

public actual fun localeconvL(loc: LocaleT): MutPtr<Lconv> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLocaleconvL(loc.rawAddress))

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdNewlocale(mask, locale.rawAddress, base.rawAddress))

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<CVoid>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSettimeofday(tv.rawAddress, tz.rawAddress)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdDup3(src, dst, flags)

public actual fun kqueue1(flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdKqueue1(flags)

public actual fun lwpSelf(): LwpidT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLwpSelf()

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMemmem(haystack.rawAddress, haystacklen.toLong(), needle.rawAddress, needlelen.toLong()))

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdDlIteratePhdr(0L, data.rawAddress)

public actual fun dlauxinfo(): MutPtr<CVoid> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdDlauxinfo())

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdIconvOpen(tocode.rawAddress, fromcode.rawAddress))

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdIconv(cd.rawAddress, inbuf.rawAddress, inbytesleft.rawAddress, outbuf.rawAddress, outbytesleft.rawAddress).toULong()

public actual fun iconvClose(cd: IconvT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdIconvClose(cd.rawAddress)

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerCreate(clockid, sevp.rawAddress, timerid.rawAddress)

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerDelete(timerid.toLong())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerGetoverrun(timerid.toLong())

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr<Itimerspec>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerGettime(timerid.toLong(), currValue.rawAddress)

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerSettime(timerid.toLong(), flags, newValue.rawAddress, oldValue.rawAddress)

public actual fun dlvsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>, version: ConstPtr<CChar>): MutPtr<CVoid> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdDlvsym(handle.rawAddress, symbol.rawAddress, version.rawAddress))

public actual fun explicitMemset(b: MutPtr<CVoid>, c: CInt, len: SizeT) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdExplicitMemset(b.rawAddress, c, len.toLong())
}

public actual fun consttimeMemequal(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdConsttimeMemequal(a.rawAddress, b.rawAddress, len.toLong())

public actual fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSetproctitle(fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun mremap(oldp: MutPtr<CVoid>, oldsize: SizeT, newp: MutPtr<CVoid>, newsize: SizeT, flags: CInt): MutPtr<CVoid> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdMremap(oldp.rawAddress, oldsize.toLong(), newp.rawAddress, newsize.toLong(), flags))

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr<Timespec>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSchedRrGetInterval(pid, t.rawAddress)

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSchedSetparam(pid, param.rawAddress)

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSchedGetparam(pid, param.rawAddress)

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSchedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSchedSetscheduler(pid, policy, param.rawAddress)

public actual fun pollts(fds: MutPtr<Pollfd>, nfds: NfdsT, ts: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdPollts(fds.rawAddress, nfds.toInt(), ts.rawAddress, sigmask.rawAddress)

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetrandom(buf.rawAddress, buflen.toLong(), flags.toInt())

public actual fun reboot(mode: CInt, bootstr: MutPtr<CChar>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdReboot(mode, bootstr.rawAddress)

public actual fun lwpPark(clock: ClockidT, flags: CInt, ts: ConstPtr<Timespec>, unpark: LwpidT, hint: ConstPtr<CVoid>, unparkhint: MutPtr<CVoid>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLwpPark(clock, flags, ts.rawAddress, unpark, hint.rawAddress, unparkhint.rawAddress)

public actual fun lwpUnpark(lwp: LwpidT, hint: ConstPtr<CVoid>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLwpUnpark(lwp, hint.rawAddress)

public actual fun lwpUnparkAll(targets: ConstPtr<LwpidT>, ntargets: SizeT, hint: ConstPtr<CVoid>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLwpUnparkAll(targets.rawAddress, ntargets.toLong(), hint.rawAddress)

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statvfs>>, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetmntinfo(mntbufp.rawAddress, flags)

public actual fun getvfsstat(buf: MutPtr<Statvfs>, bufsize: SizeT, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetvfsstat(buf.rawAddress, bufsize.toLong(), flags)

public actual fun eventfd(value: CUint, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEventfd(value.toInt(), flags)

public actual fun eventfdRead(efd: CInt, valp: MutPtr<EventfdT>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEventfdRead(efd, valp.rawAddress)

public actual fun eventfdWrite(efd: CInt, value: EventfdT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEventfdWrite(efd, value.toLong())

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerfdGettime(fd, currValue.rawAddress)

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdTimerfdSettime(fd, flags, newValue.rawAddress, oldValue.rawAddress)

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdQsortR(base.rawAddress, num.toLong(), size.toLong(), 0L, arg.rawAddress)
}

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdAioRead(aiocbp.rawAddress)

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdAioWrite(aiocbp.rawAddress)

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdAioFsync(op, aiocbp.rawAddress)

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdAioError(aiocbp.rawAddress)

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdAioReturn(aiocbp.rawAddress)

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdAioSuspend(aiocbList.rawAddress, nitems, timeout.rawAddress)

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdAioCancel(fd, aiocbp.rawAddress)

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLioListio(mode, aiocbList.rawAddress, nitems, sevp.rawAddress)

public actual fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetpwentR(pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetgrentR(grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun efopen(p: ConstPtr<CChar>, m: ConstPtr<CChar>): FILE =
    FILE()

public actual fun emalloc(n: SizeT): MutPtr<CVoid> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEmalloc(n.toLong()))

public actual fun ecalloc(n: SizeT, c: SizeT): MutPtr<CVoid> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEcalloc(n.toLong(), c.toLong()))

public actual fun erealloc(p: MutPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdErealloc(p.rawAddress, n.toLong()))

public actual fun ereallocarr(p: MutPtr<CVoid>, n: SizeT, s: SizeT) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEreallocarr(p.rawAddress, n.toLong(), s.toLong())
}

public actual fun estrdup(s: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEstrdup(s.rawAddress))

public actual fun estrndup(s: ConstPtr<CChar>, len: SizeT): MutPtr<CChar> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEstrndup(s.rawAddress, len.toLong()))

public actual fun estrlcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, len: SizeT): SizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEstrlcpy(dst.rawAddress, src.rawAddress, len.toLong()).toULong()

public actual fun estrlcat(dst: MutPtr<CChar>, src: ConstPtr<CChar>, len: SizeT): SizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEstrlcat(dst.rawAddress, src.rawAddress, len.toLong()).toULong()

public actual fun estrtoi(nptr: ConstPtr<CChar>, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEstrtoi(nptr.rawAddress, base, lo, hi)

public actual fun estrtou(nptr: ConstPtr<CChar>, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEstrtou(nptr.rawAddress, base, lo.toLong(), hi.toLong()).toULong()

public actual fun easprintf(string: MutPtr<MutPtr<CChar>>, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEasprintf(string.rawAddress, fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun evasprintf(string: MutPtr<MutPtr<CChar>>, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdEvasprintf(string.rawAddress, fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback? =
    null

public actual fun securePath(path: ConstPtr<CChar>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSecurePath(path.rawAddress)

public actual fun snprintb(buf: MutPtr<CChar>, buflen: SizeT, fmt: ConstPtr<CChar>, value: ULong): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSnprintb(buf.rawAddress, buflen.toLong(), fmt.rawAddress, value.toLong())

public actual fun snprintbM(buf: MutPtr<CChar>, buflen: SizeT, fmt: ConstPtr<CChar>, value: ULong, max: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSnprintbM(buf.rawAddress, buflen.toLong(), fmt.rawAddress, value.toLong(), max.toLong())

public actual fun getbootfile(): ConstPtr<CChar> =
    ConstPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetbootfile())

public actual fun getbyteorder(): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetbyteorder()

public actual fun getdiskrawname(buf: MutPtr<CChar>, buflen: SizeT, name: ConstPtr<CChar>): ConstPtr<CChar> =
    ConstPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetdiskrawname(buf.rawAddress, buflen.toLong(), name.rawAddress))

public actual fun getdiskcookedname(buf: MutPtr<CChar>, buflen: SizeT, name: ConstPtr<CChar>): ConstPtr<CChar> =
    ConstPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetdiskcookedname(buf.rawAddress, buflen.toLong(), name.rawAddress))

public actual fun getfsspecname(buf: MutPtr<CChar>, buflen: SizeT, spec: ConstPtr<CChar>): ConstPtr<CChar> =
    ConstPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetfsspecname(buf.rawAddress, buflen.toLong(), spec.rawAddress))

public actual fun strpct(buf: MutPtr<CChar>, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): MutPtr<CChar> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdStrpct(buf.rawAddress, bufsiz.toLong(), numerator.toLong(), denominator.toLong(), precision.toLong()))

public actual fun strspct(buf: MutPtr<CChar>, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): MutPtr<CChar> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdStrspct(buf.rawAddress, bufsiz.toLong(), numerator, denominator, precision.toLong()))

public actual fun login(ut: ConstPtr<Utmp>) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLogin(ut.rawAddress)
}

public actual fun loginx(ut: ConstPtr<Utmpx>) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLoginx(ut.rawAddress)
}

public actual fun logout(line: ConstPtr<CChar>) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLogout(line.rawAddress)
}

public actual fun logoutx(line: ConstPtr<CChar>, status: CInt, tpe: CInt) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLogoutx(line.rawAddress, status, tpe)
}

public actual fun logwtmp(line: ConstPtr<CChar>, name: ConstPtr<CChar>, host: ConstPtr<CChar>) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLogwtmp(line.rawAddress, name.rawAddress, host.rawAddress)
}

public actual fun logwtmpx(line: ConstPtr<CChar>, name: ConstPtr<CChar>, host: ConstPtr<CChar>, status: CInt, tpe: CInt) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLogwtmpx(line.rawAddress, name.rawAddress, host.rawAddress, status, tpe)
}

public actual fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdGetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong())

public actual fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLgetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong())

public actual fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdFgetxattr(filedes, name.rawAddress, value.rawAddress, size.toLong())

public actual fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdSetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong())

public actual fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLsetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong())

public actual fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdFsetxattr(filedes, name.rawAddress, value.rawAddress, size.toLong(), flags)

public actual fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdListxattr(path.rawAddress, list.rawAddress, size.toLong())

public actual fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLlistxattr(path.rawAddress, list.rawAddress, size.toLong())

public actual fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdFlistxattr(filedes, list.rawAddress, size.toLong())

public actual fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdRemovexattr(path.rawAddress, name.rawAddress)

public actual fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdLremovexattr(path.rawAddress, name.rawAddress)

public actual fun fremovexattr(fd: CInt, path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdFremovexattr(fd, path.rawAddress, name.rawAddress)

public actual fun stringToFlags(stringP: MutPtr<MutPtr<CChar>>, setp: MutPtr<CUlong>, clrp: MutPtr<CUlong>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdStringToFlags(stringP.rawAddress, setp.rawAddress, clrp.rawAddress)

public actual fun flagsToString(flags: CUlong, def: ConstPtr<CChar>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdFlagsToString(flags.toLong(), def.rawAddress)

public actual fun kinfoGetvmmap(pid: PidT, cntp: MutPtr<SizeT>): MutPtr<KinfoVmentry> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdKinfoGetvmmap(pid, cntp.rawAddress))

public actual fun backtrace(addrlist: MutPtr<MutPtr<CVoid>>, len: SizeT): SizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdBacktrace(addrlist.rawAddress, len.toLong()).toULong()

public actual fun backtraceSymbols(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT): MutPtr<MutPtr<CChar>> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbols(addrlist.rawAddress, len.toLong()))

public actual fun backtraceSymbolsFd(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFd(addrlist.rawAddress, len.toLong(), fd)

public actual fun backtraceSymbolsFmt(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fmt: ConstPtr<CChar>): MutPtr<MutPtr<CChar>> =
    MutPtr(UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFmt(addrlist.rawAddress, len.toLong(), fmt.rawAddress))

public actual fun backtraceSymbolsFdFmt(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt, fmt: ConstPtr<CChar>): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFdFmt(addrlist.rawAddress, len.toLong(), fd, fmt.rawAddress)
