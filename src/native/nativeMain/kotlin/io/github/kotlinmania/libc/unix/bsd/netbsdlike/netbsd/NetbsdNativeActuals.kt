@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.solid.CpuidT
import io.github.kotlinmania.libc.unix.IntmaxT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UintmaxT
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.LwpidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.MqdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.TimerT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ClockidT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_clockNanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun reallocarr(ptr: COpaquePointer?, number: SizeT, size: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_reallocarr(ptr?.value?.toCPointer<ByteVar>(), number, size)

public actual fun chflags(path: String?, flags: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_chflags(path, flags)

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_fchflags(fd, flags)

public actual fun lchflags(path: String?, flags: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_lchflags(path, flags)

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_extattrListFd(fd, attrnamespace, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_extattrListFile(path, attrnamespace, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_extattrListLink(path, attrnamespace, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_extattrDeleteFd(fd, attrnamespace, attrname)

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_extattrDeleteFile(path, attrnamespace, attrname)

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_extattrDeleteLink(path, attrnamespace, attrname)

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_extattrGetFd(fd, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_extattrGetFile(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_extattrGetLink(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_extattrNamespaceToString(attrnamespace, string?.value?.toCPointer<ByteVar>())

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_extattrSetFd(fd, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_extattrSetFile(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_extattrSetLink(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrStringToNamespace(string: String?, attrnamespace: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_extattrStringToNamespace(string, attrnamespace?.value?.toCPointer<ByteVar>())

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_ptsnameR(fd, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_sysctl(name?.value?.toCPointer<ByteVar>(), namelen, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_sysctlbyname(name, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun sysctlnametomib(sname: String?, name: COpaquePointer?, namelenp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_sysctlnametomib(sname, name?.value?.toCPointer<ByteVar>(), namelenp?.value?.toCPointer<ByteVar>())

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: SizeT, eventlist: COpaquePointer?, nevents: SizeT, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_kevent(kq, changelist?.value?.toCPointer<ByteVar>(), nchanges, eventlist?.value?.toCPointer<ByteVar>(), nevents, timeout?.value?.toCPointer<ByteVar>())

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?, size: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_mount(src, target, flags, data?.value?.toCPointer<ByteVar>(), size)

public actual fun mqOpen(name: String?, oflag: CInt): MqdT =
    0

public actual fun mqClose(mqd: MqdT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_mqClose(mqd.toLong().toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_mqGetattr(mqd.toLong().toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun mqNotify(mqd: MqdT, notification: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_mqNotify(mqd.toLong().toCPointer<ByteVar>(), notification?.value?.toCPointer<ByteVar>())

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_mqReceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_mqSend(mqd.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio)

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_mqSetattr(mqd.toLong().toCPointer<ByteVar>(), newattr?.value?.toCPointer<ByteVar>(), oldattr?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_mqTimedreceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_mqTimedsend(mqd.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_mqUnlink(name)

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_ptrace(request, pid, addr?.value?.toCPointer<ByteVar>(), data)

public actual fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_utrace(label, addr?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadGetnameNp(t: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_pthreadGetnameNp(t.toLong().toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadSetnameNp(t: PthreadT, name: String?, arg: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_pthreadSetnameNp(t.toLong().toCPointer<ByteVar>(), name, arg?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetNp(thread.toLong().toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_pthreadGetattrNp(native.toLong().toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_pthreadAttrSetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_pthreadGetaffinityNp(thread.toLong().toCPointer<ByteVar>(), size, set?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_pthreadSetaffinityNp(thread.toLong().toCPointer<ByteVar>(), size, set?.value?.toCPointer<ByteVar>())

public actual fun cpusetCreate(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_cpusetCreate()?.let { COpaquePointer(it.toLong()) }

public actual fun cpusetDestroy(set: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_cpusetDestroy(set?.value?.toCPointer<ByteVar>())
}

public actual fun cpusetClr(cpu: CpuidT, set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_cpusetClr(cpu, set?.value?.toCPointer<ByteVar>())

public actual fun cpusetSet(cpu: CpuidT, set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_cpusetSet(cpu, set?.value?.toCPointer<ByteVar>())

public actual fun cpusetIsset(cpu: CpuidT, set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_cpusetIsset(cpu, set?.value?.toCPointer<ByteVar>())

public actual fun cpusetSize(set: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_cpusetSize(set?.value?.toCPointer<ByteVar>())

public actual fun cpusetZero(set: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_cpusetZero(set?.value?.toCPointer<ByteVar>())
}

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun duplocale(base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_duplocale(base.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_freelocale(loc.toLong().toCPointer<ByteVar>())
}

public actual fun localeconvL(loc: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_localeconvL(loc.toLong().toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_newlocale(mask, locale, base.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_dup3(src, dst, flags)

public actual fun kqueue1(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_kqueue1(flags)

public actual fun lwpSelf(): LwpidT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_lwpSelf()

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_dlIteratePhdr(0L.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun dlauxinfo(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_dlauxinfo()?.let { COpaquePointer(it.toLong()) }

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_iconvOpen(tocode, fromcode)?.let { COpaquePointer(it.toLong()) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_iconv(cd?.value?.toCPointer<ByteVar>(), inbuf?.value?.toCPointer<ByteVar>(), inbytesleft?.value?.toCPointer<ByteVar>(), outbuf?.value?.toCPointer<ByteVar>(), outbytesleft?.value?.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_iconvClose(cd?.value?.toCPointer<ByteVar>())

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_timerCreate(clockid, sevp?.value?.toCPointer<ByteVar>(), timerid?.value?.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_timerDelete(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_timerGetoverrun(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_timerGettime(timerid.toLong().toCPointer<ByteVar>(), currValue?.value?.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_timerSettime(timerid.toLong().toCPointer<ByteVar>(), flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_dlvsym(handle?.value?.toCPointer<ByteVar>(), symbol, version)?.let { COpaquePointer(it.toLong()) }

public actual fun explicitMemset(b: COpaquePointer?, c: CInt, len: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_explicitMemset(b?.value?.toCPointer<ByteVar>(), c, len)
}

public actual fun consttimeMemequal(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_consttimeMemequal(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>(), len)

public actual fun setproctitle(fmt: String?) {
}

public actual fun mremap(oldp: COpaquePointer?, oldsize: SizeT, newp: COpaquePointer?, newsize: SizeT, flags: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_mremap(oldp?.value?.toCPointer<ByteVar>(), oldsize, newp?.value?.toCPointer<ByteVar>(), newsize, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun schedRrGetInterval(pid: PidT, t: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_schedRrGetInterval(pid, t?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_schedSetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_schedGetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_schedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_schedSetscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun pollts(fds: COpaquePointer?, nfds: NfdsT, ts: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_pollts(fds?.value?.toCPointer<ByteVar>(), nfds, ts?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun reboot(mode: CInt, bootstr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_reboot(mode, bootstr?.value?.toCPointer<ByteVar>())

public actual fun lwpPark(clock: ClockidT, flags: CInt, ts: COpaquePointer?, unpark: LwpidT, hint: COpaquePointer?, unparkhint: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_lwpPark(clock, flags, ts?.value?.toCPointer<ByteVar>(), unpark, hint?.value?.toCPointer<ByteVar>(), unparkhint?.value?.toCPointer<ByteVar>())

public actual fun lwpUnpark(lwp: LwpidT, hint: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_lwpUnpark(lwp, hint?.value?.toCPointer<ByteVar>())

public actual fun lwpUnparkAll(targets: COpaquePointer?, ntargets: SizeT, hint: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_lwpUnparkAll(targets?.value?.toCPointer<ByteVar>(), ntargets, hint?.value?.toCPointer<ByteVar>())

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_getmntinfo(mntbufp?.value?.toCPointer<ByteVar>(), flags)

public actual fun getvfsstat(buf: COpaquePointer?, bufsize: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_getvfsstat(buf?.value?.toCPointer<ByteVar>(), bufsize, flags)

public actual fun eventfd(value: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_eventfd(value, flags)

public actual fun eventfdRead(efd: CInt, valp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_eventfdRead(efd, valp?.value?.toCPointer<ByteVar>())

public actual fun eventfdWrite(efd: CInt, value: EventfdT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_eventfdWrite(efd, value)

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_timerfdGettime(fd, currValue?.value?.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_timerfdSettime(fd, flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_qsortR(base?.value?.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())
}

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_aioRead(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_aioWrite(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_aioFsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_aioError(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_aioReturn(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_aioSuspend(aiocbList?.value?.toCPointer<ByteVar>(), nitems, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_aioCancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_lioListio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nitems, sevp?.value?.toCPointer<ByteVar>())

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_getpwentR(pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_getgrentR(grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun efopen(p: String?, m: String?): FILE =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_efopen(p, m)?.let { FILE(it.toLong()) }

public actual fun emalloc(n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_emalloc(n)?.let { COpaquePointer(it.toLong()) }

public actual fun ecalloc(n: SizeT, c: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_ecalloc(n, c)?.let { COpaquePointer(it.toLong()) }

public actual fun erealloc(p: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_erealloc(p?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun ereallocarr(p: COpaquePointer?, n: SizeT, s: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_ereallocarr(p?.value?.toCPointer<ByteVar>(), n, s)
}

public actual fun estrdup(s: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_estrdup(s)?.let { COpaquePointer(it.toLong()) }

public actual fun estrndup(s: String?, len: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_estrndup(s, len)?.let { COpaquePointer(it.toLong()) }

public actual fun estrlcpy(dst: COpaquePointer?, src: String?, len: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_estrlcpy(dst?.value?.toCPointer<ByteVar>(), src, len)

public actual fun estrlcat(dst: COpaquePointer?, src: String?, len: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_estrlcat(dst?.value?.toCPointer<ByteVar>(), src, len)

public actual fun estrtoi(nptr: String?, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_estrtoi(nptr, base, lo, hi)

public actual fun estrtou(nptr: String?, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_estrtou(nptr, base, lo, hi)

public actual fun easprintf(string: COpaquePointer?, fmt: String?): CInt =
    0

public actual fun evasprintf(string: COpaquePointer?, fmt: String?): CInt =
    0

public actual fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback? =
    null

public actual fun securePath(path: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_securePath(path)

public actual fun snprintb(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_snprintb(buf?.value?.toCPointer<ByteVar>(), buflen, fmt, value)

public actual fun snprintbM(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong, max: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_snprintbM(buf?.value?.toCPointer<ByteVar>(), buflen, fmt, value, max)

public actual fun getbootfile(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_getbootfile()?.let { COpaquePointer(it.toLong()) }

public actual fun getbyteorder(): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_getbyteorder()

public actual fun getdiskrawname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_getdiskrawname(buf?.value?.toCPointer<ByteVar>(), buflen, name)?.let { COpaquePointer(it.toLong()) }

public actual fun getdiskcookedname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_getdiskcookedname(buf?.value?.toCPointer<ByteVar>(), buflen, name)?.let { COpaquePointer(it.toLong()) }

public actual fun getfsspecname(buf: COpaquePointer?, buflen: SizeT, spec: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_getfsspecname(buf?.value?.toCPointer<ByteVar>(), buflen, spec)?.let { COpaquePointer(it.toLong()) }

public actual fun strpct(buf: COpaquePointer?, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_strpct(buf?.value?.toCPointer<ByteVar>(), bufsiz, numerator, denominator, precision)?.let { COpaquePointer(it.toLong()) }

public actual fun strspct(buf: COpaquePointer?, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_strspct(buf?.value?.toCPointer<ByteVar>(), bufsiz, numerator, denominator, precision)?.let { COpaquePointer(it.toLong()) }

public actual fun login(ut: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_login(ut?.value?.toCPointer<ByteVar>())
}

public actual fun loginx(ut: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_loginx(ut?.value?.toCPointer<ByteVar>())
}

public actual fun logout(line: String?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_logout(line)
}

public actual fun logoutx(line: String?, status: CInt, tpe: CInt) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_logoutx(line, status, tpe)
}

public actual fun logwtmp(line: String?, name: String?, host: String?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_logwtmp(line, name, host)
}

public actual fun logwtmpx(line: String?, name: String?, host: String?, status: CInt, tpe: CInt) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_logwtmpx(line, name, host, status, tpe)
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_getxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_lgetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_fgetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_setxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_lsetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_fsetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_listxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_llistxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_flistxattr(filedes, list?.value?.toCPointer<ByteVar>(), size)

public actual fun removexattr(path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_lremovexattr(path, name)

public actual fun fremovexattr(fd: CInt, path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_fremovexattr(fd, path, name)

public actual fun stringToFlags(stringP: COpaquePointer?, setp: COpaquePointer?, clrp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_stringToFlags(stringP?.value?.toCPointer<ByteVar>(), setp?.value?.toCPointer<ByteVar>(), clrp?.value?.toCPointer<ByteVar>())

public actual fun flagsToString(flags: CUlong, def: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_flagsToString(flags, def)

public actual fun kinfoGetvmmap(pid: PidT, cntp: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_kinfoGetvmmap(pid, cntp?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_backtrace(addrlist?.value?.toCPointer<ByteVar>(), len)

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_backtraceSymbols(addrlist?.value?.toCPointer<ByteVar>(), len)?.let { COpaquePointer(it.toLong()) }

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFd(addrlist?.value?.toCPointer<ByteVar>(), len, fd)

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFmt(addrlist?.value?.toCPointer<ByteVar>(), len, fmt)?.let { COpaquePointer(it.toLong()) }

public actual fun backtraceSymbolsFdFmt(addrlist: COpaquePointer?, len: SizeT, fd: CInt, fmt: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFdFmt(addrlist?.value?.toCPointer<ByteVar>(), len, fd, fmt)
