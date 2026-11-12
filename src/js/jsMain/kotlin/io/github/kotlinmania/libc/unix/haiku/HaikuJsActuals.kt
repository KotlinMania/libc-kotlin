@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixHaikuNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetpriority(which, who) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSetpriority(which, who, priority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endusershell() {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuEndusershell()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpass(prompt: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuGetpass(prompt.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getusershell(): MutPtr<CChar> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuGetusershell() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun issetugid(): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuIssetugid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setusershell() {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuSetusershell()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utimensat(fd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuUtimensat(fd, path.rawAddress.toString(), times.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuFutimens(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnop(): MutPtr<CInt> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuErrnop() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuAbs(i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuLabs(i.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuRand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetifaddrs(ifap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuFreeifaddrs(ifa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ppoll(fds: MutPtr<Pollfd>, numfds: NfdsT, timeout: ConstPtr<Timespec>, sigMask: ConstPtr<SigsetT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPpoll(fds.rawAddress.toString(), numfds.toString(), timeout.rawAddress.toString(), sigMask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspent(): MutPtr<Spwd> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuGetspent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspentR(pwd: MutPtr<Spwd>, buf: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetspentR(pwd.rawAddress.toString(), buf.rawAddress.toString(), bufferSize.toString(), res.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setspent() {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuSetspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endspent() {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuEndspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getspnam(name: ConstPtr<CChar>): MutPtr<Spwd> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuGetspnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspnamR(name: ConstPtr<CChar>, spwd: MutPtr<Spwd>, buffer: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetspnamR(name.rawAddress.toString(), spwd.rawAddress.toString(), buffer.rawAddress.toString(), bufferSize.toString(), res.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sgetspent(line: ConstPtr<CChar>): MutPtr<Spwd> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuSgetspent(line.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sgetspentR(line: ConstPtr<CChar>, spwd: MutPtr<Spwd>, buffer: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSgetspentR(line.rawAddress.toString(), spwd.rawAddress.toString(), buffer.rawAddress.toString(), bufferSize.toString(), res.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetspent(file: MutPtr<FILE>): MutPtr<Spwd> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuFgetspent(file.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetspentR(file: MutPtr<FILE>, spwd: MutPtr<Spwd>, buffer: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuFgetspentR(file.rawAddress.toString(), spwd.rawAddress.toString(), buffer.rawAddress.toString(), bufferSize.toString(), res.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSemDestroy(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSemInit(sem.rawAddress.toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuClockGetres(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuClockGettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuClockSettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuClockGetcpuclockid(pid, clkId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadCreate(thread.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun valloc(numBytes: SizeT): MutPtr<CVoid> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuValloc(numBytes.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuMallocUsableSize(ptr.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuMemalign(align.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSetgroups(ngroups, ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuInitgroups(name.rawAddress.toString(), basegid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuIoctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuDirfd(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadSpinInit(lock.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadSpinDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadSpinLock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadSpinTrylock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadSpinUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuWaitid(idtype, id, infop.rawAddress.toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr<GlobT>) {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixFadvise(fd, offset.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixFallocate(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuShmUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuTelldir(dirp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuMsync(addr.rawAddress.toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuNlLanginfo(item) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuBind(socket, address.rawAddress.toString(), addressLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(socket: CInt, address: MutPtr<Sockaddr>, addressLength: MutPtr<SocklenT>, flags: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuAccept4(socket, address.rawAddress.toString(), addressLength.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, count: CInt): SsizeT =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuWritev(fd, iov.rawAddress.toString(), count) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, count: CInt): SsizeT =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuReadv(fd, iov.rawAddress.toString(), count) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSendmsg(fd, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuRecvmsg(fd, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, environment: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), environment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: ConstPtr<CChar>, basegroup: GidT, grouplist: MutPtr<GidT>, groupcount: MutPtr<CInt>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetgrouplist(user.rawAddress.toString(), basegroup.toInt(), grouplist.rawAddress.toString(), groupcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSigsuspend(mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSemClose(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetdtablesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuGetgrnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadKill(thread.toLong().toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSemUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): MutPtr<Passwd> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuGetpwent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): MutPtr<Group> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuGetgrent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuGetgrgid(gid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuPopen(command.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSethostname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuUname(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr<Utmpx> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuGetutxent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuGetutxid(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuGetutxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuPututxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetitimer(which, currValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSetitimer(which, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuRegcomp(preg.rawAddress.toString(), pattern.rawAddress.toString(), cflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuRegexec(preg.rawAddress.toString(), input.rawAddress.toString(), nmatch.toString(), pmatch.rawAddress.toString(), eflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuRegerror(errcode, preg.rawAddress.toString(), errbuf.rawAddress.toString(), errbufSize.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: MutPtr<RegexT>) {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuRegfree(preg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuMsgctl(msqid, cmd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuMsgget(key, msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuMsgrcv(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgtype.toString(), msgflg) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuMsgsnd(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSemget(key, nsems, semflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuSemop(semid, sops.rawAddress.toString(), nsops.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuFtok(pathname.rawAddress.toString(), projId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuMemrchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsearch(key: ConstPtr<CVoid>, base: MutPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuLsearch(key.rawAddress.toString(), base.rawAddress.toString(), nelp.rawAddress.toString(), width.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lfind(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuLfind(key.rawAddress.toString(), base.rawAddress.toString(), nelp.rawAddress.toString(), width.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcreate(nelt: SizeT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuHcreate(nelt.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdestroy() {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuHdestroy()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hsearch(entry: Entry, action: Action): MutPtr<Entry> =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drand48(): CDouble =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuDrand48() as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuErand48(xseed.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuLrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuNrand48(xseed.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuMrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuJrand48(xseed.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuSrand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuSeed48(xseed.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: MutPtr<CUshort>) {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuLcong48(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clearenv(): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuClearenv() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuCtermid(s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixHaikuNapiAddon != null) {
        unixHaikuNapiAddon.libcUnixHaikuSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpagesize(): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetpagesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuBrk(addr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuSbrk(increment.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnFileActionsInit(fileActions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnFileActionsDestroy(fileActions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnFileActionsAddopen(fileActions.rawAddress.toString(), fildes, path.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnFileActionsAddclose(fileActions.rawAddress.toString(), fildes) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, newfildes: CInt): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnFileActionsAdddup2(fileActions.rawAddress.toString(), fildes, newfildes) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, pgroup: MutPtr<PidT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnattrGetpgroup(attr.rawAddress.toString(), pgroup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, pgroup: PidT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnattrSetpgroup(attr.rawAddress.toString(), pgroup) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, sigdefault: MutPtr<SigsetT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnattrGetsigdefault(attr.rawAddress.toString(), sigdefault.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, sigdefault: ConstPtr<SigsetT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnattrSetsigdefault(attr.rawAddress.toString(), sigdefault.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, sigmask: MutPtr<SigsetT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnattrGetsigmask(attr.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPosixSpawnattrSetsigmask(attr.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetoptLong(argc, argv.rawAddress.toString(), optstring.rawAddress.toString(), longopts.rawAddress.toString(), longindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, locale: LocaleT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuStrcasecmpL(string1.rawAddress.toString(), string2.rawAddress.toString(), locale.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, length: SizeT, locale: LocaleT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuStrncasecmpL(string1.rawAddress.toString(), string2.rawAddress.toString(), length.toString(), locale.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuGetentropy(buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(source: ConstPtr<CVoid>, sourceLength: SizeT, search: ConstPtr<CVoid>, searchLength: SizeT): MutPtr<CVoid> =
    if (unixHaikuNapiAddon != null) MutPtr((unixHaikuNapiAddon.libcUnixHaikuMemmem(source.rawAddress.toString(), sourceLength.toString(), search.rawAddress.toString(), searchLength.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadGetattrNp(thread.toLong().toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: MutPtr<CChar>, length: SizeT): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadGetnameNp(thread.toLong().toString(), buffer.rawAddress.toString(), length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    if (unixHaikuNapiAddon != null) (unixHaikuNapiAddon.libcUnixHaikuPthreadSetnameNp(thread.toLong().toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
