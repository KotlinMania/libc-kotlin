@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _unixBsdFreebsdlikeNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_semDestroy((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) as Int) else 0

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_daemon(nochdir, noclose) as Int) else 0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun accept4(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_accept4(s, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun chflags(path: String?, flags: CUlong): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_chflags(path, flags.toString()) as Int) else 0

public actual fun chflagsat(fd: CInt, path: String?, flags: CUlong, atflag: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_chflagsat(fd, path, flags.toString(), atflag) as Int) else 0

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_clockNanosleep(clkId.toString(), flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_clockGetres(clkId.toString(), (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_clockGettime(clkId.toString(), (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_clockSettime(clkId.toString(), (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_clockGetcpuclockid(pid, (clkId?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadGetcpuclockid(thread.toLong().toString(), (clkId?.value ?: 0L).toString()) as Int) else 0

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_dirfd((dirp?.handle ?: 0L).toString()) as Int) else 0

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_duplocale(base.toLong().toString()) as String).toLong().toULong()() else null

public actual fun endutxent() {
    if (_unixBsdFreebsdlikeNapiAddon != null) {
        _unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_endutxent()
    }
}

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_fchflags(fd, flags.toString()) as Int) else 0

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_fexecve(fd, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_futimens(fd, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_getdomainname((name?.value ?: 0L).toString(), len) as Int) else 0

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_getgrentR((grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_getpwentR((pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_getgrouplist(name, basegid.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) as Int) else 0

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toString(), (serv?.value ?: 0L).toString(), servlen.toString(), flags) as Int) else 0

public actual fun getpriority(which: CInt, who: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_getpriority(which, who) as Int) else 0

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_getresgid((rgid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString(), (sgid?.value ?: 0L).toString()) as Int) else 0

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_getresuid((ruid?.value ?: 0L).toString(), (euid?.value ?: 0L).toString(), (suid?.value ?: 0L).toString()) as Int) else 0

public actual fun getutxent(): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_getutxent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_getutxid((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_getutxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_initgroups(name, basegid.toInt()) as Int) else 0

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_kevent(kq, (changelist?.value ?: 0L).toString(), nchanges, (eventlist?.value ?: 0L).toString(), nevents, (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun lchflags(path: String?, flags: CUlong): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_lchflags(path, flags.toString()) as Int) else 0

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_lutimes(file, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_memrchr((cx?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_mkfifoat(dirfd, pathname, mode.toInt()) as Int) else 0

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_mknodat(dirfd, pathname, mode.toInt(), dev.toInt()) as Int) else 0

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_mallocUsableSize((ptr?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_mincore((addr?.value ?: 0L).toString(), len.toString(), (vec?.value ?: 0L).toString()) as Int) else 0

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_newlocale(mask, locale, base.toLong().toString()) as String).toLong().toULong()() else null

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_nlLanginfoL(item, locale.toLong().toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pipe2((fds?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixFallocate(fd, offset.toString(), len.toString()) as Int) else 0

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else 0

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_ppoll((fds?.value ?: 0L).toString(), nfds.toInt(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) as Int) else 0

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadAttrGetNp(tid.toLong().toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadAttrSetguardsize((attr?.value ?: 0L).toString(), guardsize.toString()) as Int) else 0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadCondattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId.toString()) as Int) else 0

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadCondattrSetpshared((attr?.value ?: 0L).toString(), pshared) as Int) else 0

public actual fun pthreadMainNp(): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadMainNp() as Int) else 0

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadMutexattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadMutexattrSetpshared((attr?.value ?: 0L).toString(), pshared) as Int) else 0

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadRwlockattrGetpshared((attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadRwlockattrSetpshared((attr?.value ?: 0L).toString(), value) as Int) else 0

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadBarrierattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadBarrierattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadBarrierattrGetpshared((attr?.value ?: 0L).toString(), (shared?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadBarrierattrSetpshared((attr?.value ?: 0L).toString(), shared) as Int) else 0

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadBarrierInit((barrier?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), count.toInt()) as Int) else 0

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadBarrierDestroy((barrier?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadBarrierWait((barrier?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
    if (_unixBsdFreebsdlikeNapiAddon != null) {
        _unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadGetNameNp(tid.toLong().toString(), (name?.value ?: 0L).toString(), len.toString())
    }
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    if (_unixBsdFreebsdlikeNapiAddon != null) {
        _unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadSetNameNp(tid.toLong().toString(), name)
    }
}

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadGetnameNp(thread.toLong().toString(), (buffer?.value ?: 0L).toString(), length.toString()) as Int) else 0

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadSetnameNp(thread.toLong().toString(), name) as Int) else 0

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadSetschedparam(native.toLong().toString(), policy, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pthreadGetschedparam(native.toLong().toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_ptrace(request, pid, (addr?.value ?: 0L).toString(), data) as Int) else 0

public actual fun utrace(addr: COpaquePointer?, len: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_utrace((addr?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pututxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_querylocale(mask, loc.toLong().toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun rtprio(function: CInt, pid: PidT, rtp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_rtprio(function, pid, (rtp?.value ?: 0L).toString()) as Int) else 0

public actual fun schedRrGetInterval(pid: PidT, t: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_schedRrGetInterval(pid, (t?.value ?: 0L).toString()) as Int) else 0

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_schedGetparam(pid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_schedSetparam(pid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_schedGetscheduler(pid) as Int) else 0

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) as Int) else 0

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else 0

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: COpaquePointer?, sbytes: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_sendfile(fd, s, offset.toString(), nbytes.toString(), (hdtr?.value ?: 0L).toString(), (sbytes?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun setdomainname(name: String?, len: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_setdomainname(name, len) as Int) else 0

public actual fun sethostname(name: String?, len: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_sethostname(name, len) as Int) else 0

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_setpriority(which, who, prio) as Int) else 0

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_setresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) as Int) else 0

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_setresuid(ruid.toInt(), euid.toInt(), suid.toInt()) as Int) else 0

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun setutxent() {
    if (_unixBsdFreebsdlikeNapiAddon != null) {
        _unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_setutxent()
    }
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_shmOpen(name, oflag, mode.toInt()) as Int) else 0

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_sysctl((name?.value ?: 0L).toString(), namelen.toInt(), (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) as Int) else 0

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_sysctlbyname(name, (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) as Int) else 0

public actual fun sysctlnametomib(name: String?, mibp: COpaquePointer?, sizep: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_sysctlnametomib(name, (mibp?.value ?: 0L).toString(), (sizep?.value ?: 0L).toString()) as Int) else 0

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_uselocale(loc.toLong().toString()) as String).toLong().toULong()() else null

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) as Int) else 0

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_ntpAdjtime((buf?.value ?: 0L).toString()) as Int) else 0

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_ntpGettime((buf?.value ?: 0L).toString()) as Int) else 0

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) as Int) else 0

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_iconvOpen(tocode, fromcode) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_iconv((cd?.value ?: 0L).toString(), (inbuf?.value ?: 0L).toString(), (inbytesleft?.value ?: 0L).toString(), (outbuf?.value ?: 0L).toString(), (outbytesleft?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun iconvClose(cd: IconvT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_iconvClose((cd?.value ?: 0L).toString()) as Int) else 0

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    if (_unixBsdFreebsdlikeNapiAddon != null) {
        _unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_explicitBzero((s?.value ?: 0L).toString(), len.toString())
    }
}

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_memsetS((s?.value ?: 0L).toString(), smax.toString(), c, n.toString()) as Int) else 0

public actual fun gethostid(): CLong =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_gethostid() as String).toLong() else 0L

public actual fun sethostid(hostid: CLong) {
    if (_unixBsdFreebsdlikeNapiAddon != null) {
        _unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_sethostid(hostid.toString())
    }
}

public actual fun eui64Aton(a: String?, e: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_eui64Aton(a, (e?.value ?: 0L).toString()) as Int) else 0

public actual fun eui64Ntoa(id: COpaquePointer?, a: COpaquePointer?, len: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_eui64Ntoa((id?.value ?: 0L).toString(), (a?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun eui64Ntohost(hostname: COpaquePointer?, len: SizeT, id: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_eui64Ntohost((hostname?.value ?: 0L).toString(), len.toString(), (id?.value ?: 0L).toString()) as Int) else 0

public actual fun eui64Hostton(hostname: String?, id: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_eui64Hostton(hostname, (id?.value ?: 0L).toString()) as Int) else 0

public actual fun eaccess(path: String?, mode: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_eaccess(path, mode) as Int) else 0

public actual fun kenv(action: CInt, name: String?, value: COpaquePointer?, len: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_kenv(action, name, (value?.value ?: 0L).toString(), len) as Int) else 0

public actual fun reboot(howto: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_reboot(howto) as Int) else 0

public actual fun exect(path: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_exect(path, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_execvP(file, searchPath, (argv?.value ?: 0L).toString()) as Int) else 0

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_mkostemp((template?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_mkostemps((template?.value ?: 0L).toString(), suffixlen, flags) as Int) else 0

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) as Int) else 0

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnattrGetschedpolicy((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnattrSetschedpolicy((attr?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnattrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnattrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnFileActionsInit((actions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnFileActionsDestroy((actions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnFileActionsAddopen((actions?.value ?: 0L).toString(), fd, path, oflag, mode.toInt()) as Int) else 0

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnFileActionsAddclose((actions?.value ?: 0L).toString(), fd) as Int) else 0

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_posixSpawnFileActionsAdddup2((actions?.value ?: 0L).toString(), fd, newfd) as Int) else 0

public actual fun mqClose(mqd: MqdT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_mqClose(mqd.toLong().toString()) as Int) else 0

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_mqGetattr(mqd.toLong().toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun mqNotify(mqd: MqdT, notification: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_mqNotify(mqd.toLong().toString(), (notification?.value ?: 0L).toString()) as Int) else 0

public actual fun mqOpen(name: String?, oflag: CInt): MqdT =
    0

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_mqReceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_mqSend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt()) as Int) else 0

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_mqSetattr(mqd.toLong().toString(), (newattr?.value ?: 0L).toString(), (oldattr?.value ?: 0L).toString()) as Int) else 0

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_mqTimedreceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString(), (absTimeout?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_mqTimedsend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt(), (absTimeout?.value ?: 0L).toString()) as Int) else 0

public actual fun mqUnlink(name: String?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_mqUnlink(name) as Int) else 0

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_getrandom((buf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun loginTty(fd: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_loginTty(fd) as Int) else 0

public actual fun fparseln(stream: FILE?, len: COpaquePointer?, lineno: COpaquePointer?, delim: String?, flags: CInt): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_fparseln((stream?.handle ?: 0L).toString(), (len?.value ?: 0L).toString(), (lineno?.value ?: 0L).toString(), delim, flags) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_backtrace((addrlist?.value ?: 0L).toString(), len.toString()) as String).toULong() else 0uL

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_backtraceSymbols((addrlist?.value ?: 0L).toString(), len.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_backtraceSymbolsFd((addrlist?.value ?: 0L).toString(), len.toString(), fd) as Int) else 0

public actual fun kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errstr: String?): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_kvmOpen(execfile, corefile, swapfile, flags, errstr) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun kvmClose(kd: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_kvmClose((kd?.value ?: 0L).toString()) as Int) else 0

public actual fun kvmGetprocs(kd: COpaquePointer?, op: CInt, arg: CInt, cnt: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_kvmGetprocs((kd?.value ?: 0L).toString(), op, arg, (cnt?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun kvmGetloadavg(kd: COpaquePointer?, loadavg: COpaquePointer?, nelem: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_kvmGetloadavg((kd?.value ?: 0L).toString(), (loadavg?.value ?: 0L).toString(), nelem) as Int) else 0

public actual fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errbuf: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_kvmOpenfiles(execfile, corefile, swapfile, flags, (errbuf?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun kvmRead(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_kvmRead((kd?.value ?: 0L).toString(), addr.toString(), (buf?.value ?: 0L).toString(), nbytes.toString()) as String).toLong() else 0L

public actual fun kvmWrite(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdFreebsdlikeNapiAddon != null) (_unixBsdFreebsdlikeNapiAddon.libc_unix_bsd_freebsdlike_kvmWrite((kd?.value ?: 0L).toString(), addr.toString(), (buf?.value ?: 0L).toString(), nbytes.toString()) as String).toLong() else 0L
