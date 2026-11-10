@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT

private val _unixLinuxlikeLinuxMuslNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_getrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_setrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_prlimit(pid, resource, (newLimit?.value ?: 0L).toString(), (oldLimit?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_ptrace(request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_getpriority(which, who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_setpriority(which, who.toInt(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: String?): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_fanotifyMark(fd, flags.toInt(), mask.toString(), dirfd, path) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_preadv2(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_pwritev2(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_getauxval(type.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) {
        _unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_explicitBzero((s?.value ?: 0L).toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_reallocarray((ptr?.value ?: 0L).toString(), nmemb.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjtimex(buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_adjtimex((buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockAdjtime(clkId: ClockidT, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_clockAdjtime(clkId, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_ctermid((s?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_memfdCreate(name, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_mlock2((addr?.value ?: 0L).toString(), len.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_mallocUsableSize((ptr?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_euidaccess(pathname, mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_eaccess(pathname, mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_asctimeR((tm?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_dirname((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_basename((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_getrandom((buf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_posixSpawnFileActionsAddchdirNp((actions?.value ?: 0L).toString(), path) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_posixSpawnFileActionsAddfchdirNp((actions?.value ?: 0L).toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): COpaquePointer? =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_getutxent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_getutxid((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_getutxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_pututxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) {
        _unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_setutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) {
        _unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_endutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpxname(file: String?): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_utmpxname(file) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_pthreadTryjoinNp((thread?.value ?: 0L).toString(), (retval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxMuslNapiAddon != null) (_unixLinuxlikeLinuxMuslNapiAddon.libc_unix_linuxlike_linux_musl_pthreadTimedjoinNp((thread?.value ?: 0L).toString(), (retval?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
