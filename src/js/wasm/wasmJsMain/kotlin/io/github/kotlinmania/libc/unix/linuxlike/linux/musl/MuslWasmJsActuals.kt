@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixLinuxlikeLinuxMuslNapiAddon(): Boolean

private val unixLinuxlikeLinuxMuslNapiAvailable: Boolean = initUnixLinuxlikeLinuxMuslNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslGetrlimit(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslGetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslSetrlimit(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslSetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslPrlimit(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslPrlimit(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslGettimeofday(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslPtrace(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslPtrace(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslGetpriority(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslGetpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslSetpriority(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslSetpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslFanotifyMark(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslFanotifyMark(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslPreadv2(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslPreadv2(p0: Int, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslPwritev2(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslPwritev2(p0: Int, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslGetauxval(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslGetauxval(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslExplicitBzero(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslExplicitBzero(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslReallocarray(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslReallocarray(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslAdjtimex(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslAdjtimex(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslClockAdjtime(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslClockAdjtime(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslCtermid(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslCtermid(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslMemfdCreate(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslMemfdCreate(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslMlock2(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslMlock2(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslMallocUsableSize(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslMallocUsableSize(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslEuidaccess(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslEuidaccess(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslEaccess(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslEaccess(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslAsctimeR(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslAsctimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslDirname(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslDirname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslBasename(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslBasename(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslGetrandom(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslGetrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddchdirNp(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddchdirNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddfchdirNp(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddfchdirNp(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslGetutxent()")
private external fun wasmLibcUnixLinuxlikeLinuxMuslGetutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslGetutxid(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslGetutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslGetutxline(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslGetutxline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslPututxline(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslPututxline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslSetutxent()")
private external fun wasmLibcUnixLinuxlikeLinuxMuslSetutxent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslEndutxent()")
private external fun wasmLibcUnixLinuxlikeLinuxMuslEndutxent()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslUtmpxname(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslUtmpxname(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslPthreadTryjoinNp(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslPthreadTryjoinNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslPthreadTimedjoinNp(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslPthreadTimedjoinNp(p0: String, p1: String, p2: String): Int

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslGetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslSetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: ConstPtr, oldLimit: MutPtr): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslPrlimit(pid, resource, newLimit.rawAddress.toString(), oldLimit.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslPtrace(request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslGetpriority(which, who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslSetpriority(which, who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: ConstPtr): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslFanotifyMark(fd, flags.toInt(), mask.toString(), dirfd, path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslPreadv2(fd, iov.rawAddress.toString(), iovcnt, offset.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslPwritev2(fd, iov.rawAddress.toString(), iovcnt, offset.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslGetauxval(type.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: MutPtr, len: SizeT) {
    if (unixLinuxlikeLinuxMuslNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxMuslExplicitBzero(s.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    if (unixLinuxlikeLinuxMuslNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxMuslReallocarray(ptr.rawAddress.toString(), nmemb.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjtimex(buf: MutPtr): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslAdjtimex(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockAdjtime(clkId: ClockidT, buf: MutPtr): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslClockAdjtime(clkId, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: MutPtr): MutPtr =
    if (unixLinuxlikeLinuxMuslNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxMuslCtermid(s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memfdCreate(name: ConstPtr, flags: CUint): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslMemfdCreate(name.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock2(addr: ConstPtr, len: SizeT, flags: CUint): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslMlock2(addr.rawAddress.toString(), len.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: MutPtr): SizeT =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslMallocUsableSize(ptr.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(pathname: ConstPtr, mode: CInt): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslEuidaccess(pathname.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(pathname: ConstPtr, mode: CInt): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslEaccess(pathname.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr =
    if (unixLinuxlikeLinuxMuslNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxMuslAsctimeR(tm.rawAddress.toString(), buf.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr): MutPtr =
    if (unixLinuxlikeLinuxMuslNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxMuslDirname(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: MutPtr): MutPtr =
    if (unixLinuxlikeLinuxMuslNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxMuslBasename(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr, path: ConstPtr): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddchdirNp(actions.rawAddress.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr, fd: CInt): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddfchdirNp(actions.rawAddress.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr =
    if (unixLinuxlikeLinuxMuslNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxMuslGetutxent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr): MutPtr =
    if (unixLinuxlikeLinuxMuslNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxMuslGetutxid(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr): MutPtr =
    if (unixLinuxlikeLinuxMuslNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxMuslGetutxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr): MutPtr =
    if (unixLinuxlikeLinuxMuslNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxMuslPututxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixLinuxlikeLinuxMuslNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxMuslSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (unixLinuxlikeLinuxMuslNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxMuslEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpxname(file: ConstPtr): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslUtmpxname(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslPthreadTryjoinNp(thread.rawAddress.toString(), retval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr, abstime: ConstPtr): CInt =
    if (unixLinuxlikeLinuxMuslNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslPthreadTimedjoinNp(thread.rawAddress.toString(), retval.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
