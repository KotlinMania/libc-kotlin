@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixHaikuBsdNapiAddon(): Boolean

private val unixHaikuBsdNapiAvailable: Boolean = initUnixHaikuBsdNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuBsdDaemon(p0, p1)")
private external fun wasmLibcUnixHaikuBsdDaemon(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuBsdGetprogname()")
private external fun wasmLibcUnixHaikuBsdGetprogname(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuBsdSetprogname(p0)")
private external fun wasmLibcUnixHaikuBsdSetprogname(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuBsdArc4random()")
private external fun wasmLibcUnixHaikuBsdArc4random(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuBsdArc4randomUniform(p0)")
private external fun wasmLibcUnixHaikuBsdArc4randomUniform(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuBsdArc4randomBuf(p0, p1)")
private external fun wasmLibcUnixHaikuBsdArc4randomBuf(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuBsdMkstemps(p0, p1)")
private external fun wasmLibcUnixHaikuBsdMkstemps(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuBsdStrtonum(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuBsdStrtonum(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuBsdOpenpty(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuBsdOpenpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuBsdLoginTty(p0)")
private external fun wasmLibcUnixHaikuBsdLoginTty(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuBsdForkpty(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuBsdForkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuBsdStrsep(p0, p1)")
private external fun wasmLibcUnixHaikuBsdStrsep(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuBsdExplicitBzero(p0, p1)")
private external fun wasmLibcUnixHaikuBsdExplicitBzero(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuBsdSlInit()")
private external fun wasmLibcUnixHaikuBsdSlInit(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuBsdSlAdd(p0, p1)")
private external fun wasmLibcUnixHaikuBsdSlAdd(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuBsdSlFree(p0, p1)")
private external fun wasmLibcUnixHaikuBsdSlFree(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuBsdSlFind(p0, p1)")
private external fun wasmLibcUnixHaikuBsdSlFind(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuBsdKqueue()")
private external fun wasmLibcUnixHaikuBsdKqueue(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixHaikuBsdKevent(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixHaikuBsdKevent(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuBsdDlIteratePhdr(p0, p1)")
private external fun wasmLibcUnixHaikuBsdDlIteratePhdr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuBsdLutimes(p0, p1)")
private external fun wasmLibcUnixHaikuBsdLutimes(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuBsdPreadv(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuBsdPreadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuBsdPwritev(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuBsdPwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuBsdWait4(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuBsdWait4(p0: Int, p1: String, p2: Int, p3: String): Int

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdDaemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprogname(): ConstPtr =
    if (unixHaikuBsdNapiAvailable) ConstPtr(wasmLibcUnixHaikuBsdGetprogname().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setprogname(progname: ConstPtr) {
    if (unixHaikuBsdNapiAvailable) {
        wasmLibcUnixHaikuBsdSetprogname(progname.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4random(): UInt =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdArc4random().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdArc4randomUniform(upperBound.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: MutPtr, n: SizeT) {
    if (unixHaikuBsdNapiAvailable) {
        wasmLibcUnixHaikuBsdArc4randomBuf(buf.rawAddress.toString(), n.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdMkstemps(template.rawAddress.toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtonum(nptr: ConstPtr, minval: CLonglong, maxval: CLonglong, errstr: MutPtr): CLonglong =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdStrtonum(nptr.rawAddress.toString(), minval.toString(), maxval.toString(), errstr.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdLoginTty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(string: MutPtr, delimiters: ConstPtr): MutPtr =
    if (unixHaikuBsdNapiAvailable) MutPtr(wasmLibcUnixHaikuBsdStrsep(string.rawAddress.toString(), delimiters.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(buf: MutPtr, len: SizeT) {
    if (unixHaikuBsdNapiAvailable) {
        wasmLibcUnixHaikuBsdExplicitBzero(buf.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun slInit(): MutPtr =
    if (unixHaikuBsdNapiAvailable) MutPtr(wasmLibcUnixHaikuBsdSlInit().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun slAdd(sl: MutPtr, n: MutPtr): CInt =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdSlAdd(sl.rawAddress.toString(), n.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun slFree(sl: MutPtr, i: CInt) {
    if (unixHaikuBsdNapiAvailable) {
        wasmLibcUnixHaikuBsdSlFree(sl.rawAddress.toString(), i)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun slFind(sl: MutPtr, n: MutPtr): MutPtr =
    if (unixHaikuBsdNapiAvailable) MutPtr(wasmLibcUnixHaikuBsdSlFind(sl.rawAddress.toString(), n.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kqueue(): CInt =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdKqueue() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdKevent(kq, changelist.rawAddress.toString(), nchanges, eventlist.rawAddress.toString(), nevents, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdDlIteratePhdr(0L.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdLutimes(file.rawAddress.toString(), times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: MutPtr, options: CInt, rusage: MutPtr): PidT =
    if (unixHaikuBsdNapiAvailable) wasmLibcUnixHaikuBsdWait4(pid, status.rawAddress.toString(), options, rusage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
