@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.Passwd
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.ClockidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MqAttr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MqdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.PthreadBarrierT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.PthreadBarrierattrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.SemT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Sigevent
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Utmpx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.Kevent
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.KinfoProc
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixBsdFreebsdlikeNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSemDestroy(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSemInit(sem.rawAddress.toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeDaemon(nochdir, noclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(s: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeAccept4(s, addr.rawAddress.toString(), addrlen.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflags(path: ConstPtr<CChar>, flags: CUlong): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeChflags(path.rawAddress.toString(), flags.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflagsat(fd: CInt, path: ConstPtr<CChar>, flags: CUlong, atflag: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeChflagsat(fd, path.rawAddress.toString(), flags.toString(), atflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeClockGetres(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeClockGettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeClockSettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeClockGetcpuclockid(pid, clkId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadGetcpuclockid(thread.toLong().toString(), clkId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
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

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeFutimens(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr<CChar>, len: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetdomainname(name.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetgrentR(grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetpwentR(pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(name: ConstPtr<CChar>, basegid: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetgrouplist(name.rawAddress.toString(), basegid.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toString(), serv.rawAddress.toString(), servlen.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetpriority(which, who) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetresgid(rgid.rawAddress.toString(), egid.rawAddress.toString(), sgid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetresuid(ruid.rawAddress.toString(), euid.rawAddress.toString(), suid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr<Utmpx> =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetutxent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetutxid(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetutxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeInitgroups(name.rawAddress.toString(), basegid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: CInt, eventlist: MutPtr<Kevent>, nevents: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKevent(kq, changelist.rawAddress.toString(), nchanges, eventlist.rawAddress.toString(), nevents, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lchflags(path: ConstPtr<CChar>, flags: CUlong): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeLchflags(path.rawAddress.toString(), flags.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeLutimes(file.rawAddress.toString(), times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMemrchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: ConstPtr<CVoid>): SizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMallocUsableSize(ptr.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: ConstPtr<CVoid>, len: SizeT, vec: MutPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMincore(addr.rawAddress.toString(), len.toString(), vec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeNlLanginfoL(item, locale.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePipe2(fds.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixFallocate(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePpoll(fds.rawAddress.toString(), nfds.toInt(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadAttrGetNp(tid.toLong().toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadCondattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadCondattrSetclock(attr.rawAddress.toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadCondattrSetpshared(attr.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMainNp(): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadMainNp() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadMutexattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadMutexattrSetpshared(attr.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadRwlockattrGetpshared(attr.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadRwlockattrSetpshared(attr.rawAddress.toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadBarrierattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadBarrierattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, shared: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadBarrierattrGetpshared(attr.rawAddress.toString(), shared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, shared: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadBarrierattrSetpshared(attr.rawAddress.toString(), shared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadBarrierInit(barrier.rawAddress.toString(), attr.rawAddress.toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadBarrierDestroy(barrier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadBarrierWait(barrier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetNameNp(tid: PthreadT, name: MutPtr<CChar>, len: SizeT) {
    if (unixBsdFreebsdlikeNapiAddon != null) {
        unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadGetNameNp(tid.toLong().toString(), name.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr<CChar>) {
    if (unixBsdFreebsdlikeNapiAddon != null) {
        unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadSetNameNp(tid.toLong().toString(), name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: MutPtr<CChar>, length: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadGetnameNp(thread.toLong().toString(), buffer.rawAddress.toString(), length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadSetnameNp(thread.toLong().toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadSetschedparam(native.toLong().toString(), policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePthreadGetschedparam(native.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr<CChar>, data: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePtrace(request, pid, addr.rawAddress.toString(), data) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utrace(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeUtrace(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePututxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querylocale(mask: CInt, loc: LocaleT): ConstPtr<CChar> =
    if (unixBsdFreebsdlikeNapiAddon != null) ConstPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeQuerylocale(mask, loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtprio(function: CInt, pid: PidT, rtp: MutPtr<Rtprio>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeRtprio(function, pid, rtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSchedRrGetInterval(pid, t.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSchedGetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSchedSetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSchedGetscheduler(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSchedSetscheduler(pid, policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: MutPtr<SfHdtr>, sbytes: MutPtr<OffT>, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSendfile(fd, s, offset.toString(), nbytes.toString(), hdtr.rawAddress.toString(), sbytes.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr<CChar>, len: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSetdomainname(name.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr<CChar>, len: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSethostname(name.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSetpriority(which, who, prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSetresuid(ruid.toInt(), euid.toInt(), suid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixBsdFreebsdlikeNapiAddon != null) {
        unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctl(name: ConstPtr<CInt>, namelen: CUint, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSysctl(name.rawAddress.toString(), namelen.toInt(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlbyname(name: ConstPtr<CChar>, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSysctlbyname(name.rawAddress.toString(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlnametomib(name: ConstPtr<CChar>, mibp: MutPtr<CInt>, sizep: MutPtr<SizeT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeSysctlnametomib(name.rawAddress.toString(), mibp.rawAddress.toString(), sizep.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeUselocale(loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpAdjtime(buf: MutPtr<Timex>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeNtpAdjtime(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpGettime(buf: MutPtr<Ntptimeval>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeNtpGettime(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeDlIteratePhdr(0L.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeIconvOpen(tocode.rawAddress.toString(), fromcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeIconv(cd.rawAddress.toString(), inbuf.rawAddress.toString(), inbytesleft.rawAddress.toString(), outbuf.rawAddress.toString(), outbytesleft.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeIconvClose(cd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: MutPtr<CVoid>, len: SizeT) {
    if (unixBsdFreebsdlikeNapiAddon != null) {
        unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeExplicitBzero(s.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memsetS(s: MutPtr<CVoid>, smax: SizeT, c: CInt, n: SizeT): CInt =
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

public actual fun eui64Aton(a: ConstPtr<CChar>, e: MutPtr<Eui64>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeEui64Aton(a.rawAddress.toString(), e.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eui64Ntoa(id: ConstPtr<Eui64>, a: MutPtr<CChar>, len: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeEui64Ntoa(id.rawAddress.toString(), a.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eui64Ntohost(hostname: MutPtr<CChar>, len: SizeT, id: ConstPtr<Eui64>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeEui64Ntohost(hostname.rawAddress.toString(), len.toString(), id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eui64Hostton(hostname: ConstPtr<CChar>, id: MutPtr<Eui64>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeEui64Hostton(hostname.rawAddress.toString(), id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(path: ConstPtr<CChar>, mode: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeEaccess(path.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kenv(action: CInt, name: ConstPtr<CChar>, value: MutPtr<CChar>, len: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKenv(action, name.rawAddress.toString(), value.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(howto: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeReboot(howto) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exect(path: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeExect(path.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvP(file: ConstPtr<CChar>, searchPath: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeExecvP(file.rawAddress.toString(), searchPath.rawAddress.toString(), argv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMkostemp(template.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMkostemps(template.rawAddress.toString(), suffixlen, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnFileActionsInit(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnFileActionsDestroy(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikePosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqClose(mqd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqGetattr(mqd.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr<Sigevent>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqNotify(mqd.rawAddress.toString(), notification.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqReceive(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqSend(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqSetattr(mqd.rawAddress.toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqTimedreceive(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqTimedsend(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeMqUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeGetentropy(buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeLoginTty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fparseln(stream: MutPtr<FILE>, len: MutPtr<SizeT>, lineno: MutPtr<SizeT>, delim: ConstPtr<CChar>, flags: CInt): MutPtr<CChar> =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeFparseln(stream.rawAddress.toString(), len.rawAddress.toString(), lineno.rawAddress.toString(), delim.rawAddress.toString(), flags) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(addrlist: MutPtr<MutPtr<CVoid>>, len: SizeT): SizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeBacktrace(addrlist.rawAddress.toString(), len.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT): MutPtr<MutPtr<CChar>> =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeBacktraceSymbols(addrlist.rawAddress.toString(), len.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeBacktraceSymbolsFd(addrlist.rawAddress.toString(), len.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmOpen(execfile: ConstPtr<CChar>, corefile: ConstPtr<CChar>, swapfile: ConstPtr<CChar>, flags: CInt, errstr: ConstPtr<CChar>): MutPtr<KvmT> =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKvmOpen(execfile.rawAddress.toString(), corefile.rawAddress.toString(), swapfile.rawAddress.toString(), flags, errstr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmClose(kd: MutPtr<KvmT>): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKvmClose(kd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetprocs(kd: MutPtr<KvmT>, op: CInt, arg: CInt, cnt: MutPtr<CInt>): MutPtr<KinfoProc> =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKvmGetprocs(kd.rawAddress.toString(), op, arg, cnt.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetloadavg(kd: MutPtr<KvmT>, loadavg: MutPtr<CDouble>, nelem: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKvmGetloadavg(kd.rawAddress.toString(), loadavg.rawAddress.toString(), nelem) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmOpenfiles(execfile: ConstPtr<CChar>, corefile: ConstPtr<CChar>, swapfile: ConstPtr<CChar>, flags: CInt, errbuf: MutPtr<CChar>): MutPtr<KvmT> =
    if (unixBsdFreebsdlikeNapiAddon != null) MutPtr((unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKvmOpenfiles(execfile.rawAddress.toString(), corefile.rawAddress.toString(), swapfile.rawAddress.toString(), flags, errbuf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmRead(kd: MutPtr<KvmT>, addr: CUlong, buf: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKvmRead(kd.rawAddress.toString(), addr.toString(), buf.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmWrite(kd: MutPtr<KvmT>, addr: CUlong, buf: ConstPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeNapiAddon != null) (unixBsdFreebsdlikeNapiAddon.libcUnixBsdFreebsdlikeKvmWrite(kd.rawAddress.toString(), addr.toString(), buf.rawAddress.toString(), nbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
