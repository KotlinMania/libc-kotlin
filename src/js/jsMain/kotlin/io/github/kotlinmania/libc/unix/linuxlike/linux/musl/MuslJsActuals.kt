@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.Tm
import io.github.kotlinmania.libc.unix.linuxlike.linux.PosixSpawnFileActionsT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixLinuxlikeLinuxMuslNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslGetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslSetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: ConstPtr<Rlimit>, oldLimit: MutPtr<Rlimit>): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslPrlimit(pid, resource, newLimit.rawAddress.toString(), oldLimit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslPtrace(request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslGetpriority(which, who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslSetpriority(which, who.toInt(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslFanotifyMark(fd, flags.toInt(), mask.toString(), dirfd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslPreadv2(fd, iov.rawAddress.toString(), iovcnt, offset.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslPwritev2(fd, iov.rawAddress.toString(), iovcnt, offset.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslGetauxval(type.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: MutPtr<CVoid>, len: SizeT) {
    if (unixLinuxlikeLinuxMuslNapiAddon != null) {
        unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslExplicitBzero(s.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) MutPtr((unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslReallocarray(ptr.rawAddress.toString(), nmemb.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjtimex(buf: MutPtr<Timex>): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslAdjtimex(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockAdjtime(clkId: ClockidT, buf: MutPtr<Timex>): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslClockAdjtime(clkId, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) MutPtr((unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslCtermid(s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslMemfdCreate(name.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock2(addr: ConstPtr<CVoid>, len: SizeT, flags: CUint): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslMlock2(addr.rawAddress.toString(), len.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslMallocUsableSize(ptr.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslEuidaccess(pathname.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslEaccess(pathname.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) MutPtr((unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslAsctimeR(tm.rawAddress.toString(), buf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) MutPtr((unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslDirname(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) MutPtr((unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslBasename(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddchdirNp(actions.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddfchdirNp(actions.rawAddress.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr<Utmpx> =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) MutPtr((unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslGetutxent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) MutPtr((unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslGetutxid(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) MutPtr((unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslGetutxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) MutPtr((unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslPututxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixLinuxlikeLinuxMuslNapiAddon != null) {
        unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (unixLinuxlikeLinuxMuslNapiAddon != null) {
        unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslUtmpxname(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslPthreadTryjoinNp(thread.rawAddress.toString(), retval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>, abstime: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxMuslNapiAddon != null) (unixLinuxlikeLinuxMuslNapiAddon.libcUnixLinuxlikeLinuxMuslPthreadTimedjoinNp(thread.rawAddress.toString(), retval.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
