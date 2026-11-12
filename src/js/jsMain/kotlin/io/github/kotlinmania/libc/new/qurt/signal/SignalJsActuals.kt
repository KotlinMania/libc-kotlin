@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.signal

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val newQurtSignalNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun signal(sig: CInt, handler: SighandlerT): SighandlerT =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalSignal(sig, handler.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalKill(pid, sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(sig: CInt): CInt =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalRaise(sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alarm(seconds: CUint): CUint =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalAlarm(seconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pause(): CInt =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalPause() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigemptyset(set: MutPtr): CInt =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalSigemptyset(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigfillset(set: MutPtr): CInt =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalSigfillset(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaddset(set: MutPtr, signum: CInt): CInt =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalSigaddset(set.rawAddress.toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigdelset(set: MutPtr, signum: CInt): CInt =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalSigdelset(set.rawAddress.toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigismember(set: ConstPtr, signum: CInt): CInt =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalSigismember(set.rawAddress.toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigprocmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalSigprocmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigpending(set: MutPtr): CInt =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalSigpending(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr): CInt =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalSigsuspend(mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaction(sig: CInt, act: ConstPtr, oact: MutPtr): CInt =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalSigaction(sig, act.rawAddress.toString(), oact.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    if (newQurtSignalNapiAddon != null) (newQurtSignalNapiAddon.libcNewQurtSignalSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
