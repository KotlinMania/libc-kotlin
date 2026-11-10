@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.time

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.ClockT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.TimeT

private val _newQurtTimeNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun time(tloc: COpaquePointer?): TimeT =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_time((tloc?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clock(): ClockT =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_clock() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_difftime(time1.toString(), time0.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: COpaquePointer?): TimeT =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_mktime((tm?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timep: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_gmtime((timep?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timep: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_gmtimeR((timep?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timep: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_localtime((timep?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timep: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_localtimeR((timep?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctime(tm: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_asctime((tm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_asctimeR((tm?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctime(timep: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_ctime((timep?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_ctimeR((timep?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_strftime((s?.value ?: 0L).toString(), maxsize.toString(), format, (timeptr?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_strptime(s, format, (tm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_clockGettime(clkId, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(req: COpaquePointer?, rem: COpaquePointer?): CInt =
    if (_newQurtTimeNapiAddon != null) (_newQurtTimeNapiAddon.libc_new_qurt_time_nanosleep((req?.value ?: 0L).toString(), (rem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
