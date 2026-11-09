@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
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

private object UnixBsdNetbsdlikeNetbsdJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_clockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_reallocarr(ptr: Long, number: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_chflags(path: String?, flags: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_fchflags(fd: Int, flags: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_lchflags(path: String?, flags: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_extattrListFd(fd: Int, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_extattrListFile(path: String?, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_extattrListLink(path: String?, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_extattrDeleteFd(fd: Int, attrnamespace: Int, attrname: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_extattrDeleteFile(path: String?, attrnamespace: Int, attrname: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_extattrDeleteLink(path: String?, attrnamespace: Int, attrname: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_extattrGetFd(fd: Int, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_extattrGetFile(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_extattrGetLink(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_extattrNamespaceToString(attrnamespace: Int, string: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_extattrSetFd(fd: Int, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_extattrSetFile(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_extattrSetLink(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_extattrStringToNamespace(string: String?, attrnamespace: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_ptsnameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_lutimes(file: String?, times: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_sysctlbyname(name: String?, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_sysctlnametomib(sname: String?, name: Long, namelenp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_kevent(kq: Int, changelist: Long, nchanges: Long, eventlist: Long, nevents: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_mount(src: String?, target: String?, flags: Int, data: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_mqClose(mqd: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_mqGetattr(mqd: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_mqNotify(mqd: Long, notification: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_mqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_mqSend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_mqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_mqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_mqTimedsend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_mqUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_ptrace(request: Int, pid: Int, addr: Long, data: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_utrace(label: String?, addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_pthreadGetnameNp(t: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_pthreadSetnameNp(t: Long, name: String?, arg: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetNp(thread: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_pthreadGetattrNp(native: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_pthreadGetaffinityNp(thread: Long, size: Long, set: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_pthreadSetaffinityNp(thread: Long, size: Long, set: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_cpusetCreate(): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_cpusetDestroy(set: Long)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_cpusetClr(cpu: Long, set: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_cpusetSet(cpu: Long, set: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_cpusetIsset(cpu: Long, set: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_cpusetSize(set: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_cpusetZero(set: Long)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_sigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_sigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_duplocale(base: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_freelocale(loc: Long)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_localeconvL(loc: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_newlocale(mask: Int, locale: String?, base: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_settimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_dup3(src: Int, dst: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_kqueue1(flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_lwpSelf(): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_dlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_dlauxinfo(): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_iconvOpen(tocode: String?, fromcode: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_iconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_iconvClose(cd: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_timerCreate(clockid: Int, sevp: Long, timerid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_timerDelete(timerid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_timerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_timerGettime(timerid: Long, currValue: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_timerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_dlvsym(handle: Long, symbol: String?, version: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_explicitMemset(b: Long, c: Int, len: Long)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_consttimeMemequal(a: Long, b: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_mremap(oldp: Long, oldsize: Long, newp: Long, newsize: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_schedRrGetInterval(pid: Int, t: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_schedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_schedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_schedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_schedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_pollts(fds: Long, nfds: Int, ts: Long, sigmask: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_getrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_reboot(mode: Int, bootstr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_lwpPark(clock: Int, flags: Int, ts: Long, unpark: Int, hint: Long, unparkhint: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_lwpUnpark(lwp: Int, hint: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_lwpUnparkAll(targets: Long, ntargets: Long, hint: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_getmntinfo(mntbufp: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_getvfsstat(buf: Long, bufsize: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_eventfd(value: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_eventfdRead(efd: Int, valp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_eventfdWrite(efd: Int, value: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_timerfdCreate(clockid: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_timerfdGettime(fd: Int, currValue: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_timerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_qsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_aioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_aioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_aioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_aioError(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_aioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_aioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_aioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_lioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_getpwentR(pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_getgrentR(grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_efopen(p: String?, m: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_emalloc(n: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_ecalloc(n: Long, c: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_erealloc(p: Long, n: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_ereallocarr(p: Long, n: Long, s: Long)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_estrdup(s: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_estrndup(s: String?, len: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_estrlcpy(dst: Long, src: String?, len: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_estrlcat(dst: Long, src: String?, len: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_estrtoi(nptr: String?, base: Int, lo: Long, hi: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_estrtou(nptr: String?, base: Int, lo: Long, hi: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_esetfunc(cb: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_securePath(path: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_snprintb(buf: Long, buflen: Long, fmt: String?, value: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_snprintbM(buf: Long, buflen: Long, fmt: String?, value: Long, max: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_getbootfile(): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_getbyteorder(): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_getdiskrawname(buf: Long, buflen: Long, name: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_getdiskcookedname(buf: Long, buflen: Long, name: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_getfsspecname(buf: Long, buflen: Long, spec: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_strpct(buf: Long, bufsiz: Long, numerator: Long, denominator: Long, precision: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_strspct(buf: Long, bufsiz: Long, numerator: Long, denominator: Long, precision: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_login(ut: Long)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_loginx(ut: Long)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_logout(line: String?)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_logoutx(line: String?, status: Int, tpe: Int)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_logwtmp(line: String?, name: String?, host: String?)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_logwtmpx(line: String?, name: String?, host: String?, status: Int, tpe: Int)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_getxattr(path: String?, name: String?, value: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_lgetxattr(path: String?, name: String?, value: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_fgetxattr(filedes: Int, name: String?, value: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_setxattr(path: String?, name: String?, value: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_lsetxattr(path: String?, name: String?, value: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_fsetxattr(filedes: Int, name: String?, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_listxattr(path: String?, list: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_llistxattr(path: String?, list: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_flistxattr(filedes: Int, list: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_removexattr(path: String?, name: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_lremovexattr(path: String?, name: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_fremovexattr(fd: Int, path: String?, name: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_stringToFlags(stringP: Long, setp: Long, clrp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_flagsToString(flags: Long, def: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_kinfoGetvmmap(pid: Int, cntp: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_backtrace(addrlist: Long, len: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_backtraceSymbols(addrlist: Long, len: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFd(addrlist: Long, len: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFmt(addrlist: Long, len: Long, fmt: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFdFmt(addrlist: Long, len: Long, fd: Int, fmt: String?): Int
}

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L), (rmtp?.value ?: 0L))

public actual fun reallocarr(ptr: COpaquePointer?, number: SizeT, size: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_reallocarr((ptr?.value ?: 0L), number.toLong(), size.toLong())

public actual fun chflags(path: String?, flags: CUlong): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_chflags(path, flags.toLong())

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_fchflags(fd, flags.toLong())

public actual fun lchflags(path: String?, flags: CUlong): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_lchflags(path, flags.toLong())

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_extattrListFd(fd, attrnamespace, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_extattrListFile(path, attrnamespace, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_extattrListLink(path, attrnamespace, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_extattrDeleteFd(fd, attrnamespace, attrname)

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_extattrDeleteFile(path, attrnamespace, attrname)

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_extattrDeleteLink(path, attrnamespace, attrname)

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_extattrGetFd(fd, attrnamespace, attrname, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_extattrGetFile(path, attrnamespace, attrname, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_extattrGetLink(path, attrnamespace, attrname, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_extattrNamespaceToString(attrnamespace, (string?.value ?: 0L))

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_extattrSetFd(fd, attrnamespace, attrname, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_extattrSetFile(path, attrnamespace, attrname, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_extattrSetLink(path, attrnamespace, attrname, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrStringToNamespace(string: String?, attrnamespace: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_extattrStringToNamespace(string, (attrnamespace?.value ?: 0L))

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_openpty((amaster?.value ?: 0L), (aslave?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_forkpty((amaster?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_ptsnameR(fd, (buf?.value ?: 0L), buflen.toLong())

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_lutimes(file, (times?.value ?: 0L))

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_getnameinfo((sa?.value ?: 0L), salen.toInt(), (host?.value ?: 0L), hostlen.toInt(), (serv?.value ?: 0L), servlen.toInt(), flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_sysctl((name?.value ?: 0L), namelen.toInt(), (oldp?.value ?: 0L), (oldlenp?.value ?: 0L), (newp?.value ?: 0L), newlen.toLong())

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_sysctlbyname(name, (oldp?.value ?: 0L), (oldlenp?.value ?: 0L), (newp?.value ?: 0L), newlen.toLong())

public actual fun sysctlnametomib(sname: String?, name: COpaquePointer?, namelenp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_sysctlnametomib(sname, (name?.value ?: 0L), (namelenp?.value ?: 0L))

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: SizeT, eventlist: COpaquePointer?, nevents: SizeT, timeout: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_kevent(kq, (changelist?.value ?: 0L), nchanges.toLong(), (eventlist?.value ?: 0L), nevents.toLong(), (timeout?.value ?: 0L))

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?, size: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_mount(src, target, flags, (data?.value ?: 0L), size.toLong())

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    0

public actual fun mqClose(mqd: MqdT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_mqClose(mqd.toLong())

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_mqGetattr(mqd.toLong(), (attr?.value ?: 0L))

public actual fun mqNotify(mqd: MqdT, notification: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_mqNotify(mqd.toLong(), (notification?.value ?: 0L))

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_mqReceive(mqd.toLong(), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L))

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_mqSend(mqd.toLong(), msgPtr, msgLen.toLong(), msgPrio.toInt())

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_mqSetattr(mqd.toLong(), (newattr?.value ?: 0L), (oldattr?.value ?: 0L))

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_mqTimedreceive(mqd.toLong(), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L), (absTimeout?.value ?: 0L))

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_mqTimedsend(mqd.toLong(), msgPtr, msgLen.toLong(), msgPrio.toInt(), (absTimeout?.value ?: 0L))

public actual fun mqUnlink(name: String?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_mqUnlink(name)

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_ptrace(request, pid, (addr?.value ?: 0L), data)

public actual fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_utrace(label, (addr?.value ?: 0L), len.toLong())

public actual fun pthreadGetnameNp(t: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_pthreadGetnameNp(t.toLong(), (name?.value ?: 0L), len.toLong())

public actual fun pthreadSetnameNp(t: PthreadT, name: String?, arg: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_pthreadSetnameNp(t.toLong(), name, (arg?.value ?: 0L))

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetNp(thread.toLong(), (attr?.value ?: 0L))

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_pthreadGetattrNp(native.toLong(), (attr?.value ?: 0L))

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetguardsize((attr?.value ?: 0L), (guardsize?.value ?: 0L))

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_pthreadAttrSetguardsize((attr?.value ?: 0L), guardsize.toLong())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_pthreadGetaffinityNp(thread.toLong(), size.toLong(), (set?.value ?: 0L))

public actual fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_pthreadSetaffinityNp(thread.toLong(), size.toLong(), (set?.value ?: 0L))

public actual fun cpusetCreate(): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_cpusetCreate().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cpusetDestroy(set: COpaquePointer?) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_cpusetDestroy((set?.value ?: 0L))
}

public actual fun cpusetClr(cpu: CpuidT, set: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_cpusetClr(cpu.toLong(), (set?.value ?: 0L))

public actual fun cpusetSet(cpu: CpuidT, set: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_cpusetSet(cpu.toLong(), (set?.value ?: 0L))

public actual fun cpusetIsset(cpu: CpuidT, set: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_cpusetIsset(cpu.toLong(), (set?.value ?: 0L))

public actual fun cpusetSize(set: COpaquePointer?): SizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_cpusetSize((set?.value ?: 0L)).toULong()

public actual fun cpusetZero(set: COpaquePointer?) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_cpusetZero((set?.value ?: 0L))
}

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_sigtimedwait((set?.value ?: 0L), (info?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_sigwaitinfo((set?.value ?: 0L), (info?.value ?: 0L))

public actual fun duplocale(base: LocaleT): LocaleT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_duplocale((base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun freelocale(loc: LocaleT) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_freelocale((loc?.value ?: 0L))
}

public actual fun localeconvL(loc: LocaleT): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_localeconvL((loc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_newlocale(mask, locale, (base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_settimeofday((tv?.value ?: 0L), (tz?.value ?: 0L))

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_dup3(src, dst, flags)

public actual fun kqueue1(flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_kqueue1(flags)

public actual fun lwpSelf(): LwpidT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_lwpSelf()

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_memmem((haystack?.value ?: 0L), haystacklen.toLong(), (needle?.value ?: 0L), needlelen.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_dlIteratePhdr(0L, (data?.value ?: 0L))

public actual fun dlauxinfo(): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_dlauxinfo().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_iconvOpen(tocode, fromcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_iconv((cd?.value ?: 0L), (inbuf?.value ?: 0L), (inbytesleft?.value ?: 0L), (outbuf?.value ?: 0L), (outbytesleft?.value ?: 0L)).toULong()

public actual fun iconvClose(cd: IconvT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_iconvClose((cd?.value ?: 0L))

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_timerCreate(clockid, (sevp?.value ?: 0L), (timerid?.value ?: 0L))

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_timerDelete(timerid.toLong())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_timerGetoverrun(timerid.toLong())

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_timerGettime(timerid.toLong(), (currValue?.value ?: 0L))

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_timerSettime(timerid.toLong(), flags, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_dlvsym((handle?.value ?: 0L), symbol, version).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun explicitMemset(b: COpaquePointer?, c: CInt, len: SizeT) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_explicitMemset((b?.value ?: 0L), c, len.toLong())
}

public actual fun consttimeMemequal(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_consttimeMemequal((a?.value ?: 0L), (b?.value ?: 0L), len.toLong())

public actual fun setproctitle(fmt: String?, vararg variadicArgs: Long) {
}

public actual fun mremap(oldp: COpaquePointer?, oldsize: SizeT, newp: COpaquePointer?, newsize: SizeT, flags: CInt): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_mremap((oldp?.value ?: 0L), oldsize.toLong(), (newp?.value ?: 0L), newsize.toLong(), flags).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun schedRrGetInterval(pid: PidT, t: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_schedRrGetInterval(pid, (t?.value ?: 0L))

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_schedSetparam(pid, (param?.value ?: 0L))

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_schedGetparam(pid, (param?.value ?: 0L))

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_schedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_schedSetscheduler(pid, policy, (param?.value ?: 0L))

public actual fun pollts(fds: COpaquePointer?, nfds: NfdsT, ts: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_pollts((fds?.value ?: 0L), nfds.toInt(), (ts?.value ?: 0L), (sigmask?.value ?: 0L))

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_getrandom((buf?.value ?: 0L), buflen.toLong(), flags.toInt())

public actual fun reboot(mode: CInt, bootstr: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_reboot(mode, (bootstr?.value ?: 0L))

public actual fun lwpPark(clock: ClockidT, flags: CInt, ts: COpaquePointer?, unpark: LwpidT, hint: COpaquePointer?, unparkhint: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_lwpPark(clock, flags, (ts?.value ?: 0L), unpark, (hint?.value ?: 0L), (unparkhint?.value ?: 0L))

public actual fun lwpUnpark(lwp: LwpidT, hint: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_lwpUnpark(lwp, (hint?.value ?: 0L))

public actual fun lwpUnparkAll(targets: COpaquePointer?, ntargets: SizeT, hint: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_lwpUnparkAll((targets?.value ?: 0L), ntargets.toLong(), (hint?.value ?: 0L))

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_getmntinfo((mntbufp?.value ?: 0L), flags)

public actual fun getvfsstat(buf: COpaquePointer?, bufsize: SizeT, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_getvfsstat((buf?.value ?: 0L), bufsize.toLong(), flags)

public actual fun eventfd(value: CUint, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_eventfd(value.toInt(), flags)

public actual fun eventfdRead(efd: CInt, valp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_eventfdRead(efd, (valp?.value ?: 0L))

public actual fun eventfdWrite(efd: CInt, value: EventfdT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_eventfdWrite(efd, value.toLong())

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_timerfdGettime(fd, (currValue?.value ?: 0L))

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_timerfdSettime(fd, flags, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_qsortR((base?.value ?: 0L), num.toLong(), size.toLong(), 0L, (arg?.value ?: 0L))
}

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_aioRead((aiocbp?.value ?: 0L))

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_aioWrite((aiocbp?.value ?: 0L))

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_aioFsync(op, (aiocbp?.value ?: 0L))

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_aioError((aiocbp?.value ?: 0L))

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_aioReturn((aiocbp?.value ?: 0L))

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_aioSuspend((aiocbList?.value ?: 0L), nitems, (timeout?.value ?: 0L))

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_aioCancel(fd, (aiocbp?.value ?: 0L))

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_lioListio(mode, (aiocbList?.value ?: 0L), nitems, (sevp?.value ?: 0L))

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_getpwentR((pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_getgrentR((grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun efopen(p: String?, m: String?): FILE =
    FILE(UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_efopen(p, m))

public actual fun emalloc(n: SizeT): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_emalloc(n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ecalloc(n: SizeT, c: SizeT): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_ecalloc(n.toLong(), c.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun erealloc(p: COpaquePointer?, n: SizeT): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_erealloc((p?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ereallocarr(p: COpaquePointer?, n: SizeT, s: SizeT) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_ereallocarr((p?.value ?: 0L), n.toLong(), s.toLong())
}

public actual fun estrdup(s: String?): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_estrdup(s).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun estrndup(s: String?, len: SizeT): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_estrndup(s, len.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun estrlcpy(dst: COpaquePointer?, src: String?, len: SizeT): SizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_estrlcpy((dst?.value ?: 0L), src, len.toLong()).toULong()

public actual fun estrlcat(dst: COpaquePointer?, src: String?, len: SizeT): SizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_estrlcat((dst?.value ?: 0L), src, len.toLong()).toULong()

public actual fun estrtoi(nptr: String?, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_estrtoi(nptr, base, lo, hi)

public actual fun estrtou(nptr: String?, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_estrtou(nptr, base, lo.toLong(), hi.toLong()).toULong()

public actual fun easprintf(string: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun evasprintf(string: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback? =
    null

public actual fun securePath(path: String?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_securePath(path)

public actual fun snprintb(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_snprintb((buf?.value ?: 0L), buflen.toLong(), fmt, value.toLong())

public actual fun snprintbM(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong, max: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_snprintbM((buf?.value ?: 0L), buflen.toLong(), fmt, value.toLong(), max.toLong())

public actual fun getbootfile(): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_getbootfile().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getbyteorder(): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_getbyteorder()

public actual fun getdiskrawname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_getdiskrawname((buf?.value ?: 0L), buflen.toLong(), name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getdiskcookedname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_getdiskcookedname((buf?.value ?: 0L), buflen.toLong(), name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getfsspecname(buf: COpaquePointer?, buflen: SizeT, spec: String?): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_getfsspecname((buf?.value ?: 0L), buflen.toLong(), spec).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpct(buf: COpaquePointer?, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_strpct((buf?.value ?: 0L), bufsiz.toLong(), numerator.toLong(), denominator.toLong(), precision.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspct(buf: COpaquePointer?, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_strspct((buf?.value ?: 0L), bufsiz.toLong(), numerator, denominator, precision.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun login(ut: COpaquePointer?) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_login((ut?.value ?: 0L))
}

public actual fun loginx(ut: COpaquePointer?) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_loginx((ut?.value ?: 0L))
}

public actual fun logout(line: String?) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_logout(line)
}

public actual fun logoutx(line: String?, status: CInt, tpe: CInt) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_logoutx(line, status, tpe)
}

public actual fun logwtmp(line: String?, name: String?, host: String?) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_logwtmp(line, name, host)
}

public actual fun logwtmpx(line: String?, name: String?, host: String?, status: CInt, tpe: CInt) {
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_logwtmpx(line, name, host, status, tpe)
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_getxattr(path, name, (value?.value ?: 0L), size.toLong())

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_lgetxattr(path, name, (value?.value ?: 0L), size.toLong())

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_fgetxattr(filedes, name, (value?.value ?: 0L), size.toLong())

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_setxattr(path, name, (value?.value ?: 0L), size.toLong())

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_lsetxattr(path, name, (value?.value ?: 0L), size.toLong())

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_fsetxattr(filedes, name, (value?.value ?: 0L), size.toLong(), flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_listxattr(path, (list?.value ?: 0L), size.toLong())

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_llistxattr(path, (list?.value ?: 0L), size.toLong())

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_flistxattr(filedes, (list?.value ?: 0L), size.toLong())

public actual fun removexattr(path: String?, name: String?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_lremovexattr(path, name)

public actual fun fremovexattr(fd: CInt, path: String?, name: String?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_fremovexattr(fd, path, name)

public actual fun stringToFlags(stringP: COpaquePointer?, setp: COpaquePointer?, clrp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_stringToFlags((stringP?.value ?: 0L), (setp?.value ?: 0L), (clrp?.value ?: 0L))

public actual fun flagsToString(flags: CUlong, def: String?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_flagsToString(flags.toLong(), def)

public actual fun kinfoGetvmmap(pid: PidT, cntp: COpaquePointer?): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_kinfoGetvmmap(pid, (cntp?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_backtrace((addrlist?.value ?: 0L), len.toLong()).toULong()

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_backtraceSymbols((addrlist?.value ?: 0L), len.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFd((addrlist?.value ?: 0L), len.toLong(), fd)

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer? =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFmt((addrlist?.value ?: 0L), len.toLong(), fmt).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFdFmt(addrlist: COpaquePointer?, len: SizeT, fd: CInt, fmt: String?): CInt =
    UnixBsdNetbsdlikeNetbsdJniBridge.libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFdFmt((addrlist?.value ?: 0L), len.toLong(), fd, fmt)
