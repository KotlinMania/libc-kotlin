@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
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
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.ClockidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.MqdT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_daemon(nochdir, noclose)

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun accept4(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_accept4(s, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>(), flags)

public actual fun chflags(path: String?, flags: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_chflags(path, flags)

public actual fun chflagsat(fd: CInt, path: String?, flags: CUlong, atflag: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_chflagsat(fd, path, flags, atflag)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_clockNanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_clockGetres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_clockGettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_clockSettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_clockGetcpuclockid(pid, clkId?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadGetcpuclockid(thread.toLong().toCPointer<ByteVar>(), clkId?.value?.toCPointer<ByteVar>())

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun duplocale(base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_duplocale(base.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun endutxent() {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_endutxent()
}

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_fchflags(fd, flags)

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_getgrentR(grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_getpwentR(pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_getgrouplist(name, basegid, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun getpriority(which: CInt, who: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_getpriority(which, who)

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_getresgid(rgid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>(), sgid?.value?.toCPointer<ByteVar>())

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_getresuid(ruid?.value?.toCPointer<ByteVar>(), euid?.value?.toCPointer<ByteVar>(), suid?.value?.toCPointer<ByteVar>())

public actual fun getutxent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_initgroups(name, basegid)

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_kevent(kq, changelist?.value?.toCPointer<ByteVar>(), nchanges, eventlist?.value?.toCPointer<ByteVar>(), nevents, timeout?.value?.toCPointer<ByteVar>())

public actual fun lchflags(path: String?, flags: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_lchflags(path, flags)

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_mknodat(dirfd, pathname, mode, dev)

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_mallocUsableSize(ptr?.value?.toCPointer<ByteVar>())

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_mincore(addr?.value?.toCPointer<ByteVar>(), len, vec?.value?.toCPointer<ByteVar>())

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_newlocale(mask, locale, base.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_nlLanginfoL(item, locale.toLong().toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixFallocate(fd, offset, len)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixFadvise(fd, offset, len, advise)

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_ppoll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadAttrGetNp(tid.toLong().toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadAttrGetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadAttrSetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadAttrGetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadCondattrGetclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadCondattrGetpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadCondattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMainNp(): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadMainNp()

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadMutexTimedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadMutexattrGetpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadMutexattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadRwlockattrGetpshared(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadRwlockattrSetpshared(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadBarrierattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadBarrierattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadBarrierattrGetpshared(attr?.value?.toCPointer<ByteVar>(), shared?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadBarrierattrSetpshared(attr?.value?.toCPointer<ByteVar>(), shared)

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadBarrierInit(barrier?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadBarrierDestroy(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadBarrierWait(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadGetNameNp(tid.toLong().toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), len)
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadSetNameNp(tid.toLong().toCPointer<ByteVar>(), name)
}

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), length)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadSetnameNp(thread.toLong().toCPointer<ByteVar>(), name)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadSetschedparam(native.toLong().toCPointer<ByteVar>(), policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pthreadGetschedparam(native.toLong().toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_ptrace(request, pid, addr?.value?.toCPointer<ByteVar>(), data)

public actual fun utrace(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_utrace(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_querylocale(mask, loc.toLong().toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtprio(function: CInt, pid: PidT, rtp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_rtprio(function, pid, rtp?.value?.toCPointer<ByteVar>())

public actual fun schedRrGetInterval(pid: PidT, t: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_schedRrGetInterval(pid, t?.value?.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_schedGetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_schedSetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_schedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_schedSetscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_semGetvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_semTimedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: COpaquePointer?, sbytes: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_sendfile(fd, s, offset, nbytes, hdtr?.value?.toCPointer<ByteVar>(), sbytes?.value?.toCPointer<ByteVar>(), flags)

public actual fun setdomainname(name: String?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_setdomainname(name, len)

public actual fun sethostname(name: String?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_sethostname(name, len)

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_setpriority(which, who, prio)

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_setresuid(ruid, euid, suid)

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun setutxent() {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_setutxent()
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_shmOpen(name, oflag, mode)

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_sysctl(name?.value?.toCPointer<ByteVar>(), namelen, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_sysctlbyname(name, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun sysctlnametomib(name: String?, mibp: COpaquePointer?, sizep: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_sysctlnametomib(name, mibp?.value?.toCPointer<ByteVar>(), sizep?.value?.toCPointer<ByteVar>())

public actual fun uselocale(loc: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_uselocale(loc.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_ntpAdjtime(buf?.value?.toCPointer<ByteVar>())

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_ntpGettime(buf?.value?.toCPointer<ByteVar>())

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_dlIteratePhdr(0L.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_iconvOpen(tocode, fromcode)?.let { COpaquePointer(it.toLong()) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_iconv(cd?.value?.toCPointer<ByteVar>(), inbuf?.value?.toCPointer<ByteVar>(), inbytesleft?.value?.toCPointer<ByteVar>(), outbuf?.value?.toCPointer<ByteVar>(), outbytesleft?.value?.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_iconvClose(cd?.value?.toCPointer<ByteVar>())

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_explicitBzero(s?.value?.toCPointer<ByteVar>(), len)
}

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_memsetS(s?.value?.toCPointer<ByteVar>(), smax, c, n)

public actual fun gethostid(): CLong =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_gethostid()

public actual fun sethostid(hostid: CLong) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_sethostid(hostid)
}

public actual fun eui64Aton(a: String?, e: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_eui64Aton(a, e?.value?.toCPointer<ByteVar>())

public actual fun eui64Ntoa(id: COpaquePointer?, a: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_eui64Ntoa(id?.value?.toCPointer<ByteVar>(), a?.value?.toCPointer<ByteVar>(), len)

public actual fun eui64Ntohost(hostname: COpaquePointer?, len: SizeT, id: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_eui64Ntohost(hostname?.value?.toCPointer<ByteVar>(), len, id?.value?.toCPointer<ByteVar>())

public actual fun eui64Hostton(hostname: String?, id: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_eui64Hostton(hostname, id?.value?.toCPointer<ByteVar>())

public actual fun eaccess(path: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_eaccess(path, mode)

public actual fun kenv(action: CInt, name: String?, value: COpaquePointer?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_kenv(action, name, value?.value?.toCPointer<ByteVar>(), len)

public actual fun reboot(howto: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_reboot(howto)

public actual fun exect(path: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_exect(path, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_execvP(file, searchPath, argv?.value?.toCPointer<ByteVar>())

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnattrGetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnattrSetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnattrGetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnattrSetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnattrGetflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnattrSetflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnattrGetpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnattrSetpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnattrGetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnattrSetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnattrGetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnattrSetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnFileActionsInit(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnFileActionsDestroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnFileActionsAddopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnFileActionsAddclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_posixSpawnFileActionsAdddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun mqClose(mqd: MqdT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_mqClose(mqd.toLong().toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_mqGetattr(mqd.toLong().toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun mqNotify(mqd: MqdT, notification: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_mqNotify(mqd.toLong().toCPointer<ByteVar>(), notification?.value?.toCPointer<ByteVar>())

public actual fun mqOpen(name: String?, oflag: CInt): MqdT =
    0

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_mqReceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_mqSend(mqd.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio)

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_mqSetattr(mqd.toLong().toCPointer<ByteVar>(), newattr?.value?.toCPointer<ByteVar>(), oldattr?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_mqTimedreceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_mqTimedsend(mqd.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_mqUnlink(name)

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_loginTty(fd)

public actual fun fparseln(stream: FILE?, len: COpaquePointer?, lineno: COpaquePointer?, delim: String?, flags: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_fparseln(stream?.handle?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), lineno?.value?.toCPointer<ByteVar>(), delim, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_backtrace(addrlist?.value?.toCPointer<ByteVar>(), len)

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_backtraceSymbols(addrlist?.value?.toCPointer<ByteVar>(), len)?.let { COpaquePointer(it.toLong()) }

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_backtraceSymbolsFd(addrlist?.value?.toCPointer<ByteVar>(), len, fd)

public actual fun kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errstr: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_kvmOpen(execfile, corefile, swapfile, flags, errstr)?.let { COpaquePointer(it.toLong()) }

public actual fun kvmClose(kd: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_kvmClose(kd?.value?.toCPointer<ByteVar>())

public actual fun kvmGetprocs(kd: COpaquePointer?, op: CInt, arg: CInt, cnt: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_kvmGetprocs(kd?.value?.toCPointer<ByteVar>(), op, arg, cnt?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun kvmGetloadavg(kd: COpaquePointer?, loadavg: COpaquePointer?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_kvmGetloadavg(kd?.value?.toCPointer<ByteVar>(), loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errbuf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_kvmOpenfiles(execfile, corefile, swapfile, flags, errbuf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun kvmRead(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_kvmRead(kd?.value?.toCPointer<ByteVar>(), addr, buf?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun kvmWrite(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libc_unix_bsd_freebsdlike_kvmWrite(kd?.value?.toCPointer<ByteVar>(), addr, buf?.value?.toCPointer<ByteVar>(), nbytes)
