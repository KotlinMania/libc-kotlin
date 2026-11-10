@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpulevelT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpuwhichT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixBsdFreebsdlikeFreebsdFreebsd15NapiAddon(): Boolean

private val _unixBsdFreebsdlikeFreebsdFreebsd15NapiAvailable: Boolean = _initUnixBsdFreebsdlikeFreebsdFreebsd15NapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_freebsd_freebsd15_setgrent()")
private external fun _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_setgrent()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_freebsd_freebsd15_mprotect(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_freebsd_freebsd15_freelocale(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_freelocale(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_freebsd_freebsd15_msgrcv(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_msgrcv(p0: Int, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_freebsd_freebsd15_cpusetGetdomain(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_cpusetGetdomain(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_freebsd_freebsd15_cpusetSetdomain(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_cpusetSetdomain(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_freebsd_freebsd15_dirname(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_dirname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_freebsd_freebsd15_basename(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_basename(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_freebsd_freebsd15_qsortR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_qsortR(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_freebsd_freebsd15_kvmKerndisp(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_kvmKerndisp(p0: String): String

public actual fun setgrent() {
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAvailable) {
        _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAvailable) _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAvailable) {
        _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_freelocale((loc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAvailable) _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_msgrcv(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgtyp.toString(), msgflg).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?, policy: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAvailable) _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_cpusetGetdomain(level, which, id.toString(), setsize.toString(), (mask?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?, policy: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAvailable) _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_cpusetSetdomain(level, which, id.toString(), setsize.toString(), (mask?.value ?: 0L).toString(), policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAvailable) _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_dirname((path?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAvailable) _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_basename((path?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAvailable) {
        _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_qsortR((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString(), (arg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun kvmKerndisp(kd: COpaquePointer?): KssizeT =
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAvailable) _wasm_libc_unix_bsd_freebsdlike_freebsd_freebsd15_kvmKerndisp((kd?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
