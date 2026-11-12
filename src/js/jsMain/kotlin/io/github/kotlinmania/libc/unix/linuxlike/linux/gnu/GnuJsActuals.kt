@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.CpuSetT
import io.github.kotlinmania.libc.unix.linuxlike.DlInfo
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.Mmsghdr
import io.github.kotlinmania.libc.unix.linuxlike.Mntent
import io.github.kotlinmania.libc.unix.linuxlike.Passwd
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.Sigevent
import io.github.kotlinmania.libc.unix.linuxlike.Spwd
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.linuxlike.Tm
import io.github.kotlinmania.libc.unix.linuxlike.linux.MqdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.PosixSpawnFileActionsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadRwlockattrT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Timex
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.PthreadAttrT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixLinuxlikeLinuxGnuNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun fgetspentR(fp: MutPtr<FILE>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuFgetspentR(fp.rawAddress.toString(), spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sgetspentR(s: ConstPtr<CChar>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuSgetspentR(s.rawAddress.toString(), spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspentR(spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGetspentR(spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>) {
    if (unixLinuxlikeLinuxGnuNapiAddon != null) {
        unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuQsortR(base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString(), arg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuSendmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuRecvmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr<Rlimit64>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGetrlimit64(resource.toInt(), rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr<Rlimit64>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuSetrlimit64(resource.toInt(), rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr<Rlimit>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGetrlimit(resource.toInt(), rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr<Rlimit>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuSetrlimit(resource.toInt(), rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr<Rlimit>, oldLimit: MutPtr<Rlimit>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPrlimit(pid, resource.toInt(), newLimit.rawAddress.toString(), oldLimit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr<Rlimit64>, oldLimit: MutPtr<Rlimit64>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPrlimit64(pid, resource.toInt(), newLimit.rawAddress.toString(), oldLimit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpname(file: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuUtmpname(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuUtmpxname(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr<Utmpx> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGetutxent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGetutxid(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGetutxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPututxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixLinuxlikeLinuxGnuNapiAddon != null) {
        unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (unixLinuxlikeLinuxGnuNapiAddon != null) {
        unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpt(): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGetpt() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuMallopt(param, value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGetentropy(buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGetauxval(type.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjtimex(buf: MutPtr<Timex>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuAdjtimex(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpAdjtime(buf: MutPtr<Timex>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuNtpAdjtime(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpGettime(buf: MutPtr<Ntptimeval>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuNtpGettime(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockAdjtime(clkId: ClockidT, buf: MutPtr<Timex>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuClockAdjtime(clkId, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuFanotifyMark(fd, flags.toInt(), mask.toString(), dirfd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPreadv2(fd, iov.rawAddress.toString(), iovcnt, offset.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPwritev2(fd, iov.rawAddress.toString(), iovcnt, offset.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv64v2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPreadv64v2(fd, iov.rawAddress.toString(), iovcnt, offset.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev64v2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPwritev64v2(fd, iov.rawAddress.toString(), iovcnt, offset.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuRenameat2(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: MutPtr<CVoid>, len: SizeT) {
    if (unixLinuxlikeLinuxGnuNapiAddon != null) {
        unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuExplicitBzero(s.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuReallocarray(ptr.rawAddress.toString(), nmemb.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuCtermid(s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(buf: MutPtr<MutPtr<CVoid>>, sz: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuBacktrace(buf.rawAddress.toString(), sz) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(buffer: ConstPtr<MutPtr<CVoid>>, len: CInt): MutPtr<MutPtr<CChar>> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuBacktraceSymbols(buffer.rawAddress.toString(), len) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(buffer: ConstPtr<MutPtr<CVoid>>, len: CInt, fd: CInt) {
    if (unixLinuxlikeLinuxGnuNapiAddon != null) {
        unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuBacktraceSymbolsFd(buffer.rawAddress.toString(), len, fd)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob64(pattern: ConstPtr<CChar>, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr<Glob64T>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGlob64(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree64(pglob: MutPtr<Glob64T>) {
    if (unixLinuxlikeLinuxGnuNapiAddon != null) {
        unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGlobfree64(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPtrace(request.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetaffinityNp(attr: ConstPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPthreadAttrGetaffinityNp(attr.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPthreadAttrSetaffinityNp(attr.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGetpriority(which.toInt(), who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuSetpriority(which.toInt(), who.toInt(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPthreadRwlockattrGetkindNp(attr.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPthreadRwlockattrSetkindNp(attr.rawAddress.toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPthreadTryjoinNp(thread.toLong().toString(), retval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>, abstime: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPthreadTimedjoinNp(thread.toLong().toString(), retval.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo2(): Mallinfo2 =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocStats() {
    if (unixLinuxlikeLinuxGnuNapiAddon != null) {
        unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuMallocStats()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocInfo(options: CInt, stream: MutPtr<FILE>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuMallocInfo(options, stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuMallocUsableSize(ptr.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGetpwentR(pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGetgrentR(grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpwentR(stream: MutPtr<FILE>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuFgetpwentR(stream.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetgrentR(stream: MutPtr<FILE>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuFgetgrentR(stream.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putpwent(p: ConstPtr<Passwd>, stream: MutPtr<FILE>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPutpwent(p.rawAddress.toString(), stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putgrent(grp: ConstPtr<Group>, stream: MutPtr<FILE>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPutgrent(grp.rawAddress.toString(), stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuSethostid(hostid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuMemfdCreate(name.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock2(addr: ConstPtr<CVoid>, len: SizeT, flags: CUint): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuMlock2(addr.rawAddress.toString(), len.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuEuidaccess(pathname.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuEaccess(pathname.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuAsctimeR(tm.rawAddress.toString(), buf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuCtimeR(timep.rawAddress.toString(), buf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuDirname(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixBasename(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPosixBasename(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuBasename(path: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGnuBasename(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlmopen(lmid: LmidT, filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuDlmopen(lmid.toString(), filename.rawAddress.toString(), flag) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlinfo(handle: MutPtr<CVoid>, request: CInt, info: MutPtr<CVoid>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuDlinfo(handle.rawAddress.toString(), request, info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr1(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>, extraInfo: MutPtr<MutPtr<CVoid>>, flags: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuDladdr1(addr.rawAddress.toString(), info.rawAddress.toString(), extraInfo.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlvsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>, version: ConstPtr<CChar>): MutPtr<CVoid> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuDlvsym(handle.rawAddress.toString(), symbol.rawAddress.toString(), version.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocTrim(pad: SizeT): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuMallocTrim(pad.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuGetLibcRelease(): ConstPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) ConstPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGnuGetLibcRelease() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuGetLibcVersion(): ConstPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) ConstPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGnuGetLibcVersion() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddchdirNp(actions.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddfchdirNp(actions.rawAddress.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr<PosixSpawnFileActionsT>, from: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddclosefromNp(actions.rawAddress.toString(), from) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr<PosixSpawnFileActionsT>, tcfd: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddtcsetpgrpNp(actions.rawAddress.toString(), tcfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntentR(stream: MutPtr<FILE>, mntbuf: MutPtr<Mntent>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Mntent> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuGetmntentR(stream.rawAddress.toString(), mntbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execveat(dirfd: CInt, pathname: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>, flags: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuExecveat(dirfd, pathname.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuCloseRange(first.toInt(), last.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqdes: MqdT, sevp: ConstPtr<Sigevent>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuMqNotify(mqdes.toLong().toString(), sevp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollPwait2(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuEpollPwait2(epfd, events.rawAddress.toString(), maxevents, timeout.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mempcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) MutPtr((unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuMempcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAddon != null) (unixLinuxlikeLinuxGnuNapiAddon.libcUnixLinuxlikeLinuxGnuTgkill(tgid, tid, sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
