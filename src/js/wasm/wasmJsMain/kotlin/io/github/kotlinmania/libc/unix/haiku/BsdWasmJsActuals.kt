@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixHaikuBsdNapiAddon(): Boolean

private val _unixHaikuBsdNapiAvailable: Boolean = _initUnixHaikuBsdNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_daemon(p0, p1)")
private external fun _wasm_libc_unix_haiku_bsd_daemon(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_bsd_getprogname()")
private external fun _wasm_libc_unix_haiku_bsd_getprogname(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_setprogname(p0)")
private external fun _wasm_libc_unix_haiku_bsd_setprogname(p0: String?)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_bsd_arc4random()")
private external fun _wasm_libc_unix_haiku_bsd_arc4random(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_arc4randomUniform(p0)")
private external fun _wasm_libc_unix_haiku_bsd_arc4randomUniform(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_arc4randomBuf(p0, p1)")
private external fun _wasm_libc_unix_haiku_bsd_arc4randomBuf(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_mkstemps(p0, p1)")
private external fun _wasm_libc_unix_haiku_bsd_mkstemps(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_strtonum(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_bsd_strtonum(p0: String?, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_openpty(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_bsd_openpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_loginTty(p0)")
private external fun _wasm_libc_unix_haiku_bsd_loginTty(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_forkpty(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_bsd_forkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_strsep(p0, p1)")
private external fun _wasm_libc_unix_haiku_bsd_strsep(p0: String, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_explicitBzero(p0, p1)")
private external fun _wasm_libc_unix_haiku_bsd_explicitBzero(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_bsd_slInit()")
private external fun _wasm_libc_unix_haiku_bsd_slInit(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_slAdd(p0, p1)")
private external fun _wasm_libc_unix_haiku_bsd_slAdd(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_slFree(p0, p1)")
private external fun _wasm_libc_unix_haiku_bsd_slFree(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_slFind(p0, p1)")
private external fun _wasm_libc_unix_haiku_bsd_slFind(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_bsd_kqueue()")
private external fun _wasm_libc_unix_haiku_bsd_kqueue(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_kevent(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_haiku_bsd_kevent(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_dlIteratePhdr(p0, p1)")
private external fun _wasm_libc_unix_haiku_bsd_dlIteratePhdr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_lutimes(p0, p1)")
private external fun _wasm_libc_unix_haiku_bsd_lutimes(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_preadv(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_bsd_preadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_pwritev(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_bsd_pwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_bsd_wait4(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_bsd_wait4(p0: Int, p1: String, p2: Int, p3: String): Int

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_daemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprogname(): COpaquePointer? =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_getprogname().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setprogname(progname: String?) {
    if (_unixHaikuBsdNapiAvailable) {
        _wasm_libc_unix_haiku_bsd_setprogname(progname)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4random(): UInt =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_arc4random().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_arc4randomUniform(upperBound.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    if (_unixHaikuBsdNapiAvailable) {
        _wasm_libc_unix_haiku_bsd_arc4randomBuf((buf?.value ?: 0L).toString(), n.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_mkstemps((template?.value ?: 0L).toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_strtonum(nptr, minval.toString(), maxval.toString(), (errstr?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_loginTty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(string: COpaquePointer?, delimiters: String?): COpaquePointer? =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_strsep((string?.value ?: 0L).toString(), delimiters).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(buf: COpaquePointer?, len: SizeT) {
    if (_unixHaikuBsdNapiAvailable) {
        _wasm_libc_unix_haiku_bsd_explicitBzero((buf?.value ?: 0L).toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun slInit(): COpaquePointer? =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_slInit().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun slAdd(sl: COpaquePointer?, n: COpaquePointer?): CInt =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_slAdd((sl?.value ?: 0L).toString(), (n?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun slFree(sl: COpaquePointer?, i: CInt) {
    if (_unixHaikuBsdNapiAvailable) {
        _wasm_libc_unix_haiku_bsd_slFree((sl?.value ?: 0L).toString(), i)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun slFind(sl: COpaquePointer?, n: COpaquePointer?): COpaquePointer? =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_slFind((sl?.value ?: 0L).toString(), (n?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kqueue(): CInt =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_kqueue() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_kevent(kq, (changelist?.value ?: 0L).toString(), nchanges, (eventlist?.value ?: 0L).toString(), nevents, (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_lutimes(file, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    if (_unixHaikuBsdNapiAvailable) _wasm_libc_unix_haiku_bsd_wait4(pid, (status?.value ?: 0L).toString(), options, (rusage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
