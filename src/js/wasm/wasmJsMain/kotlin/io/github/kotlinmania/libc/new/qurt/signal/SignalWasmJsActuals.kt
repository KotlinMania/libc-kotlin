@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.signal

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.PidT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initNewQurtSignalNapiAddon(): Boolean

private val _newQurtSignalNapiAvailable: Boolean = _initNewQurtSignalNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_signal_signal(p0, p1)")
private external fun _wasm_libc_new_qurt_signal_signal(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_signal_kill(p0, p1)")
private external fun _wasm_libc_new_qurt_signal_kill(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_signal_raise(p0)")
private external fun _wasm_libc_new_qurt_signal_raise(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_signal_alarm(p0)")
private external fun _wasm_libc_new_qurt_signal_alarm(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_new_qurt_signal_pause()")
private external fun _wasm_libc_new_qurt_signal_pause(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_signal_sigemptyset(p0)")
private external fun _wasm_libc_new_qurt_signal_sigemptyset(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_signal_sigfillset(p0)")
private external fun _wasm_libc_new_qurt_signal_sigfillset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_signal_sigaddset(p0, p1)")
private external fun _wasm_libc_new_qurt_signal_sigaddset(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_signal_sigdelset(p0, p1)")
private external fun _wasm_libc_new_qurt_signal_sigdelset(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_signal_sigismember(p0, p1)")
private external fun _wasm_libc_new_qurt_signal_sigismember(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_signal_sigprocmask(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_signal_sigprocmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_signal_sigpending(p0)")
private external fun _wasm_libc_new_qurt_signal_sigpending(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_signal_sigsuspend(p0)")
private external fun _wasm_libc_new_qurt_signal_sigsuspend(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_signal_sigwait(p0, p1)")
private external fun _wasm_libc_new_qurt_signal_sigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_signal_sigaction(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_signal_sigaction(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_signal_sigtimedwait(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_signal_sigtimedwait(p0: String, p1: String, p2: String): Int

public actual fun signal(sig: CInt, handler: SighandlerT): SighandlerT =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_signal(sig, handler.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_kill(pid, sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(sig: CInt): CInt =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_raise(sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alarm(seconds: CUint): CUint =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_alarm(seconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pause(): CInt =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_pause() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_sigemptyset((set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigfillset(set: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_sigfillset((set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_sigaddset((set?.value ?: 0L).toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_sigdelset((set?.value ?: 0L).toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_sigismember((set?.value ?: 0L).toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_sigprocmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigpending(set: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_sigpending((set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_sigsuspend((mask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaction(sig: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_sigaction(sig, (act?.value ?: 0L).toString(), (oact?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_newQurtSignalNapiAvailable) _wasm_libc_new_qurt_signal_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
