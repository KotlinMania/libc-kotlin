@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.time

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ClockT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.TimeT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.new.qurt.Tm
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val newQurtTimeNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun time(tloc: MutPtr<TimeT>): TimeT =
    if (newQurtTimeNapiAddon != null) (newQurtTimeNapiAddon.libcNewQurtTimeTime(tloc.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clock(): ClockT =
    if (newQurtTimeNapiAddon != null) (newQurtTimeNapiAddon.libcNewQurtTimeClock() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    if (newQurtTimeNapiAddon != null) (newQurtTimeNapiAddon.libcNewQurtTimeDifftime(time1.toString(), time0.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: MutPtr<Tm>): TimeT =
    if (newQurtTimeNapiAddon != null) (newQurtTimeNapiAddon.libcNewQurtTimeMktime(tm.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timep: ConstPtr<TimeT>): MutPtr<Tm> =
    if (newQurtTimeNapiAddon != null) MutPtr((newQurtTimeNapiAddon.libcNewQurtTimeGmtime(timep.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timep: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    if (newQurtTimeNapiAddon != null) MutPtr((newQurtTimeNapiAddon.libcNewQurtTimeGmtimeR(timep.rawAddress.toString(), result.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timep: ConstPtr<TimeT>): MutPtr<Tm> =
    if (newQurtTimeNapiAddon != null) MutPtr((newQurtTimeNapiAddon.libcNewQurtTimeLocaltime(timep.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timep: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    if (newQurtTimeNapiAddon != null) MutPtr((newQurtTimeNapiAddon.libcNewQurtTimeLocaltimeR(timep.rawAddress.toString(), result.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctime(tm: ConstPtr<Tm>): MutPtr<CChar> =
    if (newQurtTimeNapiAddon != null) MutPtr((newQurtTimeNapiAddon.libcNewQurtTimeAsctime(tm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar> =
    if (newQurtTimeNapiAddon != null) MutPtr((newQurtTimeNapiAddon.libcNewQurtTimeAsctimeR(tm.rawAddress.toString(), buf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctime(timep: ConstPtr<TimeT>): MutPtr<CChar> =
    if (newQurtTimeNapiAddon != null) MutPtr((newQurtTimeNapiAddon.libcNewQurtTimeCtime(timep.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar> =
    if (newQurtTimeNapiAddon != null) MutPtr((newQurtTimeNapiAddon.libcNewQurtTimeCtimeR(timep.rawAddress.toString(), buf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>): SizeT =
    if (newQurtTimeNapiAddon != null) (newQurtTimeNapiAddon.libcNewQurtTimeStrftime(s.rawAddress.toString(), maxsize.toString(), format.rawAddress.toString(), timeptr.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    if (newQurtTimeNapiAddon != null) MutPtr((newQurtTimeNapiAddon.libcNewQurtTimeStrptime(s.rawAddress.toString(), format.rawAddress.toString(), tm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (newQurtTimeNapiAddon != null) (newQurtTimeNapiAddon.libcNewQurtTimeClockGettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(req: ConstPtr<Timespec>, rem: MutPtr<Timespec>): CInt =
    if (newQurtTimeNapiAddon != null) (newQurtTimeNapiAddon.libcNewQurtTimeNanosleep(req.rawAddress.toString(), rem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
