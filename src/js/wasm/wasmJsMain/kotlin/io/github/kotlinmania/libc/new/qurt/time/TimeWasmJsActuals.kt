@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initNewQurtTimeNapiAddon(): Boolean

private val newQurtTimeNapiAvailable: Boolean = initNewQurtTimeNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtTimeTime(p0)")
private external fun wasmLibcNewQurtTimeTime(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcNewQurtTimeClock()")
private external fun wasmLibcNewQurtTimeClock(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtTimeDifftime(p0, p1)")
private external fun wasmLibcNewQurtTimeDifftime(p0: String, p1: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtTimeMktime(p0)")
private external fun wasmLibcNewQurtTimeMktime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtTimeGmtime(p0)")
private external fun wasmLibcNewQurtTimeGmtime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtTimeGmtimeR(p0, p1)")
private external fun wasmLibcNewQurtTimeGmtimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtTimeLocaltime(p0)")
private external fun wasmLibcNewQurtTimeLocaltime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtTimeLocaltimeR(p0, p1)")
private external fun wasmLibcNewQurtTimeLocaltimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtTimeAsctime(p0)")
private external fun wasmLibcNewQurtTimeAsctime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtTimeAsctimeR(p0, p1)")
private external fun wasmLibcNewQurtTimeAsctimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtTimeCtime(p0)")
private external fun wasmLibcNewQurtTimeCtime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtTimeCtimeR(p0, p1)")
private external fun wasmLibcNewQurtTimeCtimeR(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcNewQurtTimeStrftime(p0, p1, p2, p3)")
private external fun wasmLibcNewQurtTimeStrftime(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtTimeStrptime(p0, p1, p2)")
private external fun wasmLibcNewQurtTimeStrptime(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtTimeClockGettime(p0, p1)")
private external fun wasmLibcNewQurtTimeClockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtTimeNanosleep(p0, p1)")
private external fun wasmLibcNewQurtTimeNanosleep(p0: String, p1: String): Int

public actual fun time(tloc: MutPtr<TimeT>): TimeT =
    if (newQurtTimeNapiAvailable) wasmLibcNewQurtTimeTime(tloc.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clock(): ClockT =
    if (newQurtTimeNapiAvailable) wasmLibcNewQurtTimeClock().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    if (newQurtTimeNapiAvailable) wasmLibcNewQurtTimeDifftime(time1.toString(), time0.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: MutPtr<Tm>): TimeT =
    if (newQurtTimeNapiAvailable) wasmLibcNewQurtTimeMktime(tm.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timep: ConstPtr<TimeT>): MutPtr<Tm> =
    if (newQurtTimeNapiAvailable) MutPtr(wasmLibcNewQurtTimeGmtime(timep.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timep: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    if (newQurtTimeNapiAvailable) MutPtr(wasmLibcNewQurtTimeGmtimeR(timep.rawAddress.toString(), result.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timep: ConstPtr<TimeT>): MutPtr<Tm> =
    if (newQurtTimeNapiAvailable) MutPtr(wasmLibcNewQurtTimeLocaltime(timep.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timep: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    if (newQurtTimeNapiAvailable) MutPtr(wasmLibcNewQurtTimeLocaltimeR(timep.rawAddress.toString(), result.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctime(tm: ConstPtr<Tm>): MutPtr<CChar> =
    if (newQurtTimeNapiAvailable) MutPtr(wasmLibcNewQurtTimeAsctime(tm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar> =
    if (newQurtTimeNapiAvailable) MutPtr(wasmLibcNewQurtTimeAsctimeR(tm.rawAddress.toString(), buf.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctime(timep: ConstPtr<TimeT>): MutPtr<CChar> =
    if (newQurtTimeNapiAvailable) MutPtr(wasmLibcNewQurtTimeCtime(timep.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar> =
    if (newQurtTimeNapiAvailable) MutPtr(wasmLibcNewQurtTimeCtimeR(timep.rawAddress.toString(), buf.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>): SizeT =
    if (newQurtTimeNapiAvailable) wasmLibcNewQurtTimeStrftime(s.rawAddress.toString(), maxsize.toString(), format.rawAddress.toString(), timeptr.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    if (newQurtTimeNapiAvailable) MutPtr(wasmLibcNewQurtTimeStrptime(s.rawAddress.toString(), format.rawAddress.toString(), tm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (newQurtTimeNapiAvailable) wasmLibcNewQurtTimeClockGettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(req: ConstPtr<Timespec>, rem: MutPtr<Timespec>): CInt =
    if (newQurtTimeNapiAvailable) wasmLibcNewQurtTimeNanosleep(req.rawAddress.toString(), rem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
