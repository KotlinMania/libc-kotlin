@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_clock_nanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun reallocarr(ptr: COpaquePointer?, number: SizeT, size: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_reallocarr(ptr?.value?.toCPointer<ByteVar>(), number, size)

public actual fun chflags(path: String?, flags: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_chflags(path, flags)

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_fchflags(fd, flags)

public actual fun lchflags(path: String?, flags: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_lchflags(path, flags)

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_extattr_list_fd(fd, attrnamespace, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_extattr_list_file(path, attrnamespace, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_extattr_list_link(path, attrnamespace, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_extattr_delete_fd(fd, attrnamespace, attrname)

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_extattr_delete_file(path, attrnamespace, attrname)

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_extattr_delete_link(path, attrnamespace, attrname)

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_extattr_get_fd(fd, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_extattr_get_file(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_extattr_get_link(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_extattr_namespace_to_string(attrnamespace, string?.value?.toCPointer<ByteVar>())

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_extattr_set_fd(fd, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_extattr_set_file(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_extattr_set_link(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrStringToNamespace(string: String?, attrnamespace: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_extattr_string_to_namespace(string, attrnamespace?.value?.toCPointer<ByteVar>())

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_ptsname_r(fd, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_sysctl(name?.value?.toCPointer<ByteVar>(), namelen, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_sysctlbyname(name, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun sysctlnametomib(sname: String?, name: CInt?, namelenp: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_sysctlnametomib(sname, name?.value?.toCPointer<ByteVar>(), namelenp?.value?.toCPointer<ByteVar>())

public actual fun kevent(kq: CInt, changelist: io.github.kotlinmania.libc.Kevent?, nchanges: SizeT, eventlist: io.github.kotlinmania.libc.Kevent?, nevents: SizeT, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_kevent(kq, changelist?.value?.toCPointer<ByteVar>(), nchanges, eventlist?.value?.toCPointer<ByteVar>(), nevents, timeout?.value?.toCPointer<ByteVar>())

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?, size: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_mount(src, target, flags, data?.value?.toCPointer<ByteVar>(), size)

public actual fun mqClose(mqd: MqdT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_mq_close(mqd.toInt())

public actual fun mqGetattr(mqd: MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_mq_getattr(mqd.toInt(), attr?.value?.toCPointer<ByteVar>())

public actual fun mqNotify(mqd: MqdT, notification: io.github.kotlinmania.libc.Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_mq_notify(mqd.toInt(), notification?.value?.toCPointer<ByteVar>())

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_mq_receive(mqd.toInt(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_mq_send(mqd.toInt(), msgPtr, msgLen, msgPrio)

public actual fun mqSetattr(mqd: MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_mq_setattr(mqd.toInt(), newattr?.value?.toCPointer<ByteVar>(), oldattr?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_mq_timedreceive(mqd.toInt(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_mq_timedsend(mqd.toInt(), msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_mq_unlink(name)

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_ptrace(request, pid, addr?.value?.toCPointer<ByteVar>(), data)

public actual fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_utrace(label, addr?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadGetnameNp(t: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_pthread_getname_np(t.toInt(), name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadSetnameNp(t: PthreadT, name: String?, arg: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_pthread_setname_np(t.toInt(), name, arg?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_pthread_attr_get_np(thread.toInt(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(native: PthreadT, attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_pthread_getattr_np(native.toInt(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_pthread_attr_getguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_pthread_attr_setguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_pthread_attr_getstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: Cpuset?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_pthread_getaffinity_np(thread.toInt(), size, set?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: Cpuset?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_pthread_setaffinity_np(thread.toInt(), size, set?.value?.toCPointer<ByteVar>())

public actual fun cpusetCreate(): Cpuset? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_cpuset_create()?.let { COpaquePointer(it.toLong()) }

public actual fun cpusetDestroy(set: Cpuset?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_cpuset_destroy(set?.value?.toCPointer<ByteVar>())
}

public actual fun cpusetClr(cpu: CpuidT, set: Cpuset?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_cpuset_clr(cpu.toInt(), set?.value?.toCPointer<ByteVar>())

public actual fun cpusetSet(cpu: CpuidT, set: Cpuset?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_cpuset_set(cpu.toInt(), set?.value?.toCPointer<ByteVar>())

public actual fun cpusetIsset(cpu: CpuidT, set: Cpuset?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_cpuset_isset(cpu.toInt(), set?.value?.toCPointer<ByteVar>())

public actual fun cpusetSize(set: Cpuset?): SizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_cpuset_size(set?.value?.toCPointer<ByteVar>())

public actual fun cpusetZero(set: Cpuset?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_cpuset_zero(set?.value?.toCPointer<ByteVar>())
}

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun duplocale(base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_duplocale(base.toInt())

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_freelocale(loc.toInt())
}

public actual fun localeconvL(loc: LocaleT): Lconv? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_localeconv_l(loc.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_newlocale(mask, locale, base.toInt())

public actual fun settimeofday(tv: Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_dup3(src, dst, flags)

public actual fun kqueue1(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_kqueue1(flags)

public actual fun lwpSelf(): LwpidT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_lwp_self()

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_dl_iterate_phdr(callback?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun dlauxinfo(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_dlauxinfo()?.let { COpaquePointer(it.toLong()) }

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_iconv_open(tocode, fromcode)?.let { COpaquePointer(it.toLong()) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_iconv(cd?.value?.toCPointer<ByteVar>(), inbuf?.value?.toCPointer<ByteVar>(), inbytesleft?.value?.toCPointer<ByteVar>(), outbuf?.value?.toCPointer<ByteVar>(), outbytesleft?.value?.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_iconv_close(cd?.value?.toCPointer<ByteVar>())

public actual fun timerCreate(clockid: ClockidT, sevp: io.github.kotlinmania.libc.Sigevent?, timerid: TimerT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_timer_create(clockid, sevp?.value?.toCPointer<ByteVar>(), timerid?.value?.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_timer_delete(timerid.toInt())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_timer_getoverrun(timerid.toInt())

public actual fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_timer_gettime(timerid.toInt(), currValue?.value?.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_timer_settime(timerid.toInt(), flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_dlvsym(handle?.value?.toCPointer<ByteVar>(), symbol, version)?.let { COpaquePointer(it.toLong()) }

public actual fun explicitMemset(b: COpaquePointer?, c: CInt, len: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_explicit_memset(b?.value?.toCPointer<ByteVar>(), c, len)
}

public actual fun consttimeMemequal(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_consttime_memequal(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>(), len)

public actual fun mremap(oldp: COpaquePointer?, oldsize: SizeT, newp: COpaquePointer?, newsize: SizeT, flags: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_mremap(oldp?.value?.toCPointer<ByteVar>(), oldsize, newp?.value?.toCPointer<ByteVar>(), newsize, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_sched_rr_get_interval(pid, t?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_sched_setparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_sched_getparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_sched_getscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_sched_setscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun pollts(fds: Pollfd?, nfds: NfdsT, ts: Timespec?, sigmask: io.github.kotlinmania.libc.SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_pollts(fds?.value?.toCPointer<ByteVar>(), nfds.toInt(), ts?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun reboot(mode: CInt, bootstr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_reboot(mode, bootstr?.value?.toCPointer<ByteVar>())

public actual fun lwpPark(clock: ClockidT, flags: CInt, ts: Timespec?, unpark: LwpidT, hint: COpaquePointer?, unparkhint: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_lwp_park(clock, flags, ts?.value?.toCPointer<ByteVar>(), unpark.toInt(), hint?.value?.toCPointer<ByteVar>(), unparkhint?.value?.toCPointer<ByteVar>())

public actual fun lwpUnpark(lwp: LwpidT, hint: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_lwp_unpark(lwp.toInt(), hint?.value?.toCPointer<ByteVar>())

public actual fun lwpUnparkAll(targets: LwpidT?, ntargets: SizeT, hint: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_lwp_unpark_all(targets?.value?.toCPointer<ByteVar>(), ntargets, hint?.value?.toCPointer<ByteVar>())

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_getmntinfo(mntbufp?.value?.toCPointer<ByteVar>(), flags)

public actual fun getvfsstat(buf: Statvfs?, bufsize: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_getvfsstat(buf?.value?.toCPointer<ByteVar>(), bufsize, flags)

public actual fun eventfd(value: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_eventfd(value, flags)

public actual fun eventfdRead(efd: CInt, valp: ULong?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_eventfd_read(efd, valp?.value?.toCPointer<ByteVar>())

public actual fun eventfdWrite(efd: CInt, value: EventfdT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_eventfd_write(efd, value)

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_timerfd_create(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_timerfd_gettime(fd, currValue?.value?.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_timerfd_settime(fd, flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_qsort_r(base?.value?.toCPointer<ByteVar>(), num, size, compar?.value?.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())
}

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_aio_read(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_aio_write(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_aio_fsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_aio_error(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_aio_return(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_aio_suspend(aiocbList?.value?.toCPointer<ByteVar>(), nitems, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_aio_cancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_lio_listio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nitems, sevp?.value?.toCPointer<ByteVar>())

public actual fun getpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_getpwent_r(pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_getgrent_r(grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun efopen(p: String?, m: String?): FILE =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_efopen(p, m)?.let { FILE(it.toLong()) }

public actual fun emalloc(n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_emalloc(n)?.let { COpaquePointer(it.toLong()) }

public actual fun ecalloc(n: SizeT, c: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_ecalloc(n, c)?.let { COpaquePointer(it.toLong()) }

public actual fun erealloc(p: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_erealloc(p?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun ereallocarr(p: COpaquePointer?, n: SizeT, s: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_ereallocarr(p?.value?.toCPointer<ByteVar>(), n, s)
}

public actual fun estrdup(s: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_estrdup(s)?.let { COpaquePointer(it.toLong()) }

public actual fun estrndup(s: String?, len: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_estrndup(s, len)?.let { COpaquePointer(it.toLong()) }

public actual fun estrlcpy(dst: COpaquePointer?, src: String?, len: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_estrlcpy(dst?.value?.toCPointer<ByteVar>(), src, len)

public actual fun estrlcat(dst: COpaquePointer?, src: String?, len: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_estrlcat(dst?.value?.toCPointer<ByteVar>(), src, len)

public actual fun estrtoi(nptr: String?, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_estrtoi(nptr, base, lo.toInt(), hi.toInt())

public actual fun estrtou(nptr: String?, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_estrtou(nptr, base, lo.toInt(), hi.toInt())

public actual fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_esetfunc(cb?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun securePath(path: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_secure_path(path)

public actual fun snprintb(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_snprintb(buf?.value?.toCPointer<ByteVar>(), buflen, fmt, value)

public actual fun snprintbM(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong, max: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_snprintb_m(buf?.value?.toCPointer<ByteVar>(), buflen, fmt, value, max)

public actual fun getbootfile(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_getbootfile()?.let { COpaquePointer(it.toLong()) }

public actual fun getbyteorder(): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_getbyteorder()

public actual fun getdiskrawname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_getdiskrawname(buf?.value?.toCPointer<ByteVar>(), buflen, name)?.let { COpaquePointer(it.toLong()) }

public actual fun getdiskcookedname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_getdiskcookedname(buf?.value?.toCPointer<ByteVar>(), buflen, name)?.let { COpaquePointer(it.toLong()) }

public actual fun getfsspecname(buf: COpaquePointer?, buflen: SizeT, spec: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_getfsspecname(buf?.value?.toCPointer<ByteVar>(), buflen, spec)?.let { COpaquePointer(it.toLong()) }

public actual fun strpct(buf: COpaquePointer?, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_strpct(buf?.value?.toCPointer<ByteVar>(), bufsiz, numerator.toInt(), denominator.toInt(), precision)?.let { COpaquePointer(it.toLong()) }

public actual fun strspct(buf: COpaquePointer?, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_strspct(buf?.value?.toCPointer<ByteVar>(), bufsiz, numerator.toInt(), denominator.toInt(), precision)?.let { COpaquePointer(it.toLong()) }

public actual fun login(ut: Utmp?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_login(ut?.value?.toCPointer<ByteVar>())
}

public actual fun loginx(ut: Utmpx?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_loginx(ut?.value?.toCPointer<ByteVar>())
}

public actual fun logout(line: String?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_logout(line)
}

public actual fun logoutx(line: String?, status: CInt, tpe: CInt) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_logoutx(line, status, tpe)
}

public actual fun logwtmp(line: String?, name: String?, host: String?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_logwtmp(line, name, host)
}

public actual fun logwtmpx(line: String?, name: String?, host: String?, status: CInt, tpe: CInt) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_logwtmpx(line, name, host, status, tpe)
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_getxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_lgetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_fgetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_setxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_lsetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_fsetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_listxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_llistxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_flistxattr(filedes, list?.value?.toCPointer<ByteVar>(), size)

public actual fun removexattr(path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_lremovexattr(path, name)

public actual fun fremovexattr(fd: CInt, path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_fremovexattr(fd, path, name)

public actual fun stringToFlags(stringP: COpaquePointer?, setp: CUlong?, clrp: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_string_to_flags(stringP?.value?.toCPointer<ByteVar>(), setp?.value?.toCPointer<ByteVar>(), clrp?.value?.toCPointer<ByteVar>())

public actual fun flagsToString(flags: CUlong, def: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_flags_to_string(flags, def)

public actual fun kinfoGetvmmap(pid: PidT, cntp: SizeT?): KinfoVmentry? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_kinfo_getvmmap(pid, cntp?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_backtrace(addrlist?.value?.toCPointer<ByteVar>(), len)

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_backtrace_symbols(addrlist?.value?.toCPointer<ByteVar>(), len)?.let { COpaquePointer(it.toLong()) }

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_backtrace_symbols_fd(addrlist?.value?.toCPointer<ByteVar>(), len, fd)

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_backtrace_symbols_fmt(addrlist?.value?.toCPointer<ByteVar>(), len, fmt)?.let { COpaquePointer(it.toLong()) }

public actual fun backtraceSymbolsFdFmt(addrlist: COpaquePointer?, len: SizeT, fd: CInt, fmt: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_netbsd_mod_backtrace_symbols_fd_fmt(addrlist?.value?.toCPointer<ByteVar>(), len, fd, fmt)
