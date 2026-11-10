@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.MqdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT

private val _unixLinuxlikeLinuxGnuNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun fgetspentR(fp: FILE?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_fgetspentR((fp?.handle ?: 0L).toString(), (spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sgetspentR(s: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_sgetspentR(s, (spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspentR(spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_getspentR((spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) {
        _unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_qsortR((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString(), (arg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_sendmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_recvmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags, (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_getrlimit64(resource.toInt(), (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_setrlimit64(resource.toInt(), (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_getrlimit(resource.toInt(), (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_setrlimit(resource.toInt(), (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_prlimit(pid, resource.toInt(), (newLimit?.value ?: 0L).toString(), (oldLimit?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_prlimit64(pid, resource.toInt(), (newLimit?.value ?: 0L).toString(), (oldLimit?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpname(file: String?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_utmpname(file) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpxname(file: String?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_utmpxname(file) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_getutxent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_getutxid((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_getutxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_pututxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) {
        _unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_setutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) {
        _unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_endutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpt(): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_getpt() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_mallopt(param, value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_getrandom((buf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_getauxval(type.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjtimex(buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_adjtimex((buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_ntpAdjtime((buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_ntpGettime((buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockAdjtime(clkId: ClockidT, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_clockAdjtime(clkId, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_fanotifyMark(fd, flags.toInt(), mask.toString(), dirfd, path) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_preadv2(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_pwritev2(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv64v2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_preadv64v2(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev64v2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_pwritev64v2(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_renameat2(olddirfd, oldpath, newdirfd, newpath, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) {
        _unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_explicitBzero((s?.value ?: 0L).toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_reallocarray((ptr?.value ?: 0L).toString(), nmemb.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_ctermid((s?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_backtrace((buf?.value ?: 0L).toString(), sz) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(buffer: COpaquePointer?, len: CInt): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_backtraceSymbols((buffer?.value ?: 0L).toString(), len) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, len: CInt, fd: CInt) {
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) {
        _unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_backtraceSymbolsFd((buffer?.value ?: 0L).toString(), len, fd)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_glob64(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree64(pglob: COpaquePointer?) {
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) {
        _unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_globfree64((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_ptrace(request.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_pthreadAttrGetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_pthreadAttrSetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_getpriority(which.toInt(), who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_setpriority(which.toInt(), who.toInt(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetkindNp(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_pthreadRwlockattrGetkindNp((attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetkindNp(attr: COpaquePointer?, value: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_pthreadRwlockattrSetkindNp((attr?.value ?: 0L).toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_pthreadTryjoinNp(thread.toLong().toString(), (retval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_pthreadTimedjoinNp(thread.toLong().toString(), (retval?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo2(): Mallinfo2 =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocStats() {
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) {
        _unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_mallocStats()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_mallocInfo(options, (stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_mallocUsableSize((ptr?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_getpwentR((pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_getgrentR((grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpwentR(stream: FILE?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_fgetpwentR((stream?.handle ?: 0L).toString(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetgrentR(stream: FILE?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_fgetgrentR((stream?.handle ?: 0L).toString(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putpwent(p: COpaquePointer?, stream: FILE?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_putpwent((p?.value ?: 0L).toString(), (stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putgrent(grp: COpaquePointer?, stream: FILE?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_putgrent((grp?.value ?: 0L).toString(), (stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_sethostid(hostid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_memfdCreate(name, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_mlock2((addr?.value ?: 0L).toString(), len.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_euidaccess(pathname, mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_eaccess(pathname, mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_asctimeR((tm?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_ctimeR((timep?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_dirname((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixBasename(path: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_posixBasename((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuBasename(path: String?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_gnuBasename(path) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_dlmopen(lmid.toString(), filename, flag) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_dlinfo((handle?.value ?: 0L).toString(), request, (info?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr1(addr: COpaquePointer?, info: COpaquePointer?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_dladdr1((addr?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (extraInfo?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_dlvsym((handle?.value ?: 0L).toString(), symbol, version) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocTrim(pad: SizeT): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_mallocTrim(pad.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuGetLibcRelease(): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_gnuGetLibcRelease() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuGetLibcVersion(): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_gnuGetLibcVersion() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddchdirNp((actions?.value ?: 0L).toString(), path) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddfchdirNp((actions?.value ?: 0L).toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: COpaquePointer?, from: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddclosefromNp((actions?.value ?: 0L).toString(), from) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: COpaquePointer?, tcfd: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddtcsetpgrpNp((actions?.value ?: 0L).toString(), tcfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntentR(stream: FILE?, mntbuf: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_getmntentR((stream?.handle ?: 0L).toString(), (mntbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_execveat(dirfd, pathname, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_closeRange(first.toInt(), last.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqdes: MqdT, sevp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_mqNotify(mqdes.toLong().toString(), (sevp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollPwait2(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_epollPwait2(epfd, (events?.value ?: 0L).toString(), maxevents, (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_mempcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAddon != null) (_unixLinuxlikeLinuxGnuNapiAddon.libc_unix_linuxlike_linux_gnu_tgkill(tgid, tid, sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
