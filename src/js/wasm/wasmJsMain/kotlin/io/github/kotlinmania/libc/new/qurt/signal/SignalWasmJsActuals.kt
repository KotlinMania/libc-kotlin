@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.signal

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.SigsetT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initNewQurtSignalNapiAddon(): Boolean

private val newQurtSignalNapiAvailable: Boolean = initNewQurtSignalNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtSignalSignal(p0, p1)")
private external fun wasmLibcNewQurtSignalSignal(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtSignalKill(p0, p1)")
private external fun wasmLibcNewQurtSignalKill(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtSignalRaise(p0)")
private external fun wasmLibcNewQurtSignalRaise(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtSignalAlarm(p0)")
private external fun wasmLibcNewQurtSignalAlarm(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcNewQurtSignalPause()")
private external fun wasmLibcNewQurtSignalPause(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtSignalSigemptyset(p0)")
private external fun wasmLibcNewQurtSignalSigemptyset(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtSignalSigfillset(p0)")
private external fun wasmLibcNewQurtSignalSigfillset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtSignalSigaddset(p0, p1)")
private external fun wasmLibcNewQurtSignalSigaddset(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtSignalSigdelset(p0, p1)")
private external fun wasmLibcNewQurtSignalSigdelset(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtSignalSigismember(p0, p1)")
private external fun wasmLibcNewQurtSignalSigismember(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtSignalSigprocmask(p0, p1, p2)")
private external fun wasmLibcNewQurtSignalSigprocmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtSignalSigpending(p0)")
private external fun wasmLibcNewQurtSignalSigpending(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtSignalSigsuspend(p0)")
private external fun wasmLibcNewQurtSignalSigsuspend(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtSignalSigwait(p0, p1)")
private external fun wasmLibcNewQurtSignalSigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtSignalSigaction(p0, p1, p2)")
private external fun wasmLibcNewQurtSignalSigaction(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtSignalSigtimedwait(p0, p1, p2)")
private external fun wasmLibcNewQurtSignalSigtimedwait(p0: String, p1: String, p2: String): Int

public actual fun signal(sig: CInt, handler: SighandlerT): SighandlerT =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalSignal(sig, handler.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalKill(pid, sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(sig: CInt): CInt =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalRaise(sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alarm(seconds: CUint): CUint =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalAlarm(seconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pause(): CInt =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalPause() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigemptyset(set: MutPtr<SigsetT>): CInt =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalSigemptyset(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigfillset(set: MutPtr<SigsetT>): CInt =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalSigfillset(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalSigaddset(set.rawAddress.toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalSigdelset(set.rawAddress.toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalSigismember(set.rawAddress.toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalSigprocmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigpending(set: MutPtr<SigsetT>): CInt =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalSigpending(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalSigsuspend(mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaction(sig: CInt, act: ConstPtr<Sigaction>, oact: MutPtr<Sigaction>): CInt =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalSigaction(sig, act.rawAddress.toString(), oact.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (newQurtSignalNapiAvailable) wasmLibcNewQurtSignalSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
