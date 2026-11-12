@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
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
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.ClockidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MqdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixBsdFreebsdlikeNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun semDestroy(sem: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSemDestroy(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSemInit(sem.rawAddress.toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeDaemon(nochdir, noclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(s: CInt, addr: MutPtr, addrlen: MutPtr, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeAccept4(s, addr.rawAddress.toString(), addrlen.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflags(path: ConstPtr, flags: CUlong): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeChflags(path.rawAddress.toString(), flags.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflagsat(fd: CInt, path: ConstPtr, flags: CUlong, atflag: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeChflagsat(fd, path.rawAddress.toString(), flags.toString(), atflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeClockGetres(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeClockGettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeClockSettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeClockGetcpuclockid(pid, clkId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadGetcpuclockid(thread.toLong().toString(), clkId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeDirfd(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeDuplocale(base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endutxent() {
    if (unixBsdFreebsdlikeNapiAddon != null) {
        unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeFchflags(fd, flags.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeFutimens(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr, len: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetdomainname(name.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetgrentR(grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetpwentR(pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(name: ConstPtr, basegid: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetgrouplist(name.rawAddress.toString(), basegid.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SizeT, serv: MutPtr, servlen: SizeT, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toString(), serv.rawAddress.toString(), servlen.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetpriority(which, who) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetresgid(rgid.rawAddress.toString(), egid.rawAddress.toString(), sgid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetresuid(ruid.rawAddress.toString(), euid.rawAddress.toString(), suid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetutxent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetutxid(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetutxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: ConstPtr, basegid: GidT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeInitgroups(name.rawAddress.toString(), basegid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKevent(kq, changelist.rawAddress.toString(), nchanges, eventlist.rawAddress.toString(), nevents, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lchflags(path: ConstPtr, flags: CUlong): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeLchflags(path.rawAddress.toString(), flags.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeLutimes(file.rawAddress.toString(), times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMemrchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: ConstPtr): SizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMallocUsableSize(ptr.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: ConstPtr, len: SizeT, vec: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMincore(addr.rawAddress.toString(), len.toString(), vec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeNlLanginfoL(item, locale.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePipe2(fds.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixFallocate(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePpoll(fds.rawAddress.toString(), nfds.toInt(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadAttrGetNp(tid.toLong().toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadCondattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadCondattrSetclock(attr.rawAddress.toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadCondattrSetpshared(attr.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMainNp(): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadMainNp() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadMutexattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadMutexattrSetpshared(attr.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadRwlockattrGetpshared(attr.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadRwlockattrSetpshared(attr.rawAddress.toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadBarrierattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadBarrierattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadBarrierattrGetpshared(attr.rawAddress.toString(), shared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadBarrierattrSetpshared(attr.rawAddress.toString(), shared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadBarrierInit(barrier.rawAddress.toString(), attr.rawAddress.toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadBarrierDestroy(barrier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadBarrierWait(barrier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetNameNp(tid: PthreadT, name: MutPtr, len: SizeT) {
    if (unixBsdFreebsdlikeNapiAddon != null) {
        unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadGetNameNp(tid.toLong().toString(), name.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr) {
    if (unixBsdFreebsdlikeNapiAddon != null) {
        unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadSetNameNp(tid.toLong().toString(), name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: MutPtr, length: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadGetnameNp(thread.toLong().toString(), buffer.rawAddress.toString(), length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadSetnameNp(thread.toLong().toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadSetschedparam(native.toLong().toString(), policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadGetschedparam(native.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr, data: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePtrace(request, pid, addr.rawAddress.toString(), data) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utrace(addr: ConstPtr, len: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeUtrace(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePututxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querylocale(mask: CInt, loc: LocaleT): ConstPtr =
    if (unixBsdFreebsdlikeNapiAddon != null) ConstPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeQuerylocale(mask, loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtprio(function: CInt, pid: PidT, rtp: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeRtprio(function, pid, rtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSchedRrGetInterval(pid, t.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSchedGetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSchedSetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSchedGetscheduler(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSchedSetscheduler(pid, policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: MutPtr, sbytes: MutPtr, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSendfile(fd, s, offset.toString(), nbytes.toString(), hdtr.rawAddress.toString(), sbytes.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr, len: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSetdomainname(name.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr, len: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSethostname(name.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSetpriority(which, who, prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSetresuid(ruid.toInt(), euid.toInt(), suid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixBsdFreebsdlikeNapiAddon != null) {
        unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctl(name: ConstPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSysctl(name.rawAddress.toString(), namelen.toInt(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlbyname(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSysctlbyname(name.rawAddress.toString(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlnametomib(name: ConstPtr, mibp: MutPtr, sizep: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSysctlnametomib(name.rawAddress.toString(), mibp.rawAddress.toString(), sizep.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeUselocale(loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpAdjtime(buf: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeNtpAdjtime(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpGettime(buf: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeNtpGettime(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeDlIteratePhdr(0L.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeIconvOpen(tocode.rawAddress.toString(), fromcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeIconv(cd.rawAddress.toString(), inbuf.rawAddress.toString(), inbytesleft.rawAddress.toString(), outbuf.rawAddress.toString(), outbytesleft.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeIconvClose(cd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: MutPtr, len: SizeT) {
    if (unixBsdFreebsdlikeNapiAddon != null) {
        unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeExplicitBzero(s.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memsetS(s: MutPtr, smax: SizeT, c: CInt, n: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMemsetS(s.rawAddress.toString(), smax.toString(), c, n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGethostid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong) {
    if (unixBsdFreebsdlikeNapiAddon != null) {
        unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSethostid(hostid.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eui64Aton(a: ConstPtr, e: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeEui64Aton(a.rawAddress.toString(), e.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eui64Ntoa(id: ConstPtr, a: MutPtr, len: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeEui64Ntoa(id.rawAddress.toString(), a.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eui64Ntohost(hostname: MutPtr, len: SizeT, id: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeEui64Ntohost(hostname.rawAddress.toString(), len.toString(), id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eui64Hostton(hostname: ConstPtr, id: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeEui64Hostton(hostname.rawAddress.toString(), id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(path: ConstPtr, mode: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeEaccess(path.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kenv(action: CInt, name: ConstPtr, value: MutPtr, len: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKenv(action, name.rawAddress.toString(), value.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(howto: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeReboot(howto) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exect(path: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeExect(path.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvP(file: ConstPtr, searchPath: ConstPtr, argv: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeExecvP(file.rawAddress.toString(), searchPath.rawAddress.toString(), argv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMkostemp(template.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMkostemps(template.rawAddress.toString(), suffixlen, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnFileActionsInit(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnFileActionsDestroy(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqClose(mqd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqGetattr(mqd.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqNotify(mqd.rawAddress.toString(), notification.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqReceive(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqSend(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqSetattr(mqd.rawAddress.toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqTimedreceive(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqTimedsend(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetentropy(buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeLoginTty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fparseln(stream: MutPtr, len: MutPtr, lineno: MutPtr, delim: ConstPtr, flags: CInt): MutPtr =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeFparseln(stream.rawAddress.toString(), len.rawAddress.toString(), lineno.rawAddress.toString(), delim.rawAddress.toString(), flags) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(addrlist: MutPtr, len: SizeT): SizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeBacktrace(addrlist.rawAddress.toString(), len.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(addrlist: ConstPtr, len: SizeT): MutPtr =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeBacktraceSymbols(addrlist.rawAddress.toString(), len.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(addrlist: ConstPtr, len: SizeT, fd: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeBacktraceSymbolsFd(addrlist.rawAddress.toString(), len.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmOpen(execfile: ConstPtr, corefile: ConstPtr, swapfile: ConstPtr, flags: CInt, errstr: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKvmOpen(execfile.rawAddress.toString(), corefile.rawAddress.toString(), swapfile.rawAddress.toString(), flags, errstr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmClose(kd: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKvmClose(kd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetprocs(kd: MutPtr, op: CInt, arg: CInt, cnt: MutPtr): MutPtr =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKvmGetprocs(kd.rawAddress.toString(), op, arg, cnt.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetloadavg(kd: MutPtr, loadavg: MutPtr, nelem: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKvmGetloadavg(kd.rawAddress.toString(), loadavg.rawAddress.toString(), nelem) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmOpenfiles(execfile: ConstPtr, corefile: ConstPtr, swapfile: ConstPtr, flags: CInt, errbuf: MutPtr): MutPtr =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKvmOpenfiles(execfile.rawAddress.toString(), corefile.rawAddress.toString(), swapfile.rawAddress.toString(), flags, errbuf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmRead(kd: MutPtr, addr: CUlong, buf: MutPtr, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKvmRead(kd.rawAddress.toString(), addr.toString(), buf.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmWrite(kd: MutPtr, addr: CUlong, buf: ConstPtr, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKvmWrite(kd.rawAddress.toString(), addr.toString(), buf.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
