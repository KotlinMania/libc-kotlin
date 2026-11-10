@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.time

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.ClockT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.TimeT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initNewQurtTimeNapiAddon(): Boolean

private val _newQurtTimeNapiAvailable: Boolean = _initNewQurtTimeNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_time_time(p0)")
private external fun _wasm_libc_new_qurt_time_time(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_new_qurt_time_clock()")
private external fun _wasm_libc_new_qurt_time_clock(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_time_difftime(p0, p1)")
private external fun _wasm_libc_new_qurt_time_difftime(p0: String, p1: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_time_mktime(p0)")
private external fun _wasm_libc_new_qurt_time_mktime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_time_gmtime(p0)")
private external fun _wasm_libc_new_qurt_time_gmtime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_time_gmtimeR(p0, p1)")
private external fun _wasm_libc_new_qurt_time_gmtimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_time_localtime(p0)")
private external fun _wasm_libc_new_qurt_time_localtime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_time_localtimeR(p0, p1)")
private external fun _wasm_libc_new_qurt_time_localtimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_time_asctime(p0)")
private external fun _wasm_libc_new_qurt_time_asctime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_time_asctimeR(p0, p1)")
private external fun _wasm_libc_new_qurt_time_asctimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_time_ctime(p0)")
private external fun _wasm_libc_new_qurt_time_ctime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_time_ctimeR(p0, p1)")
private external fun _wasm_libc_new_qurt_time_ctimeR(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_new_qurt_time_strftime(p0, p1, p2, p3)")
private external fun _wasm_libc_new_qurt_time_strftime(p0: String, p1: String, p2: String?, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_time_strptime(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_time_strptime(p0: String?, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_time_clockGettime(p0, p1)")
private external fun _wasm_libc_new_qurt_time_clockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_time_nanosleep(p0, p1)")
private external fun _wasm_libc_new_qurt_time_nanosleep(p0: String, p1: String): Int

public actual fun time(tloc: COpaquePointer?): TimeT =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_time((tloc?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clock(): ClockT =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_clock().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_difftime(time1.toString(), time0.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: COpaquePointer?): TimeT =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_mktime((tm?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timep: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_gmtime((timep?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timep: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_gmtimeR((timep?.value ?: 0L).toString(), (result?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timep: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_localtime((timep?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timep: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_localtimeR((timep?.value ?: 0L).toString(), (result?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctime(tm: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_asctime((tm?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_asctimeR((tm?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctime(timep: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_ctime((timep?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_ctimeR((timep?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_strftime((s?.value ?: 0L).toString(), maxsize.toString(), format, (timeptr?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_strptime(s, format, (tm?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_clockGettime(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(req: COpaquePointer?, rem: COpaquePointer?): CInt =
    if (_newQurtTimeNapiAvailable) _wasm_libc_new_qurt_time_nanosleep((req?.value ?: 0L).toString(), (rem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
