@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.common.posix.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initNewCommonPosixPthreadNapiAddon(): Boolean

private val _newCommonPosixPthreadNapiAvailable: Boolean = _initNewCommonPosixPthreadNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadAtfork(p0, p1, p2)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadAttrGetguardsize(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadAttrGetinheritsched(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadAttrGetinheritsched(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadAttrGetschedparam(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadAttrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadAttrGetschedpolicy(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadAttrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadAttrGetstack(p0, p1, p2)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadAttrSetguardsize(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadAttrSetinheritsched(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadAttrSetinheritsched(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadAttrSetschedparam(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadAttrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadAttrSetschedpolicy(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadAttrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadAttrSetstack(p0, p1, p2)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadAttrSetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadBarrierDestroy(p0)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadBarrierDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadBarrierInit(p0, p1, p2)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadBarrierInit(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadBarrierWait(p0)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadBarrierWait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadBarrierattrDestroy(p0)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadBarrierattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadBarrierattrGetpshared(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadBarrierattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadBarrierattrInit(p0)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadBarrierattrInit(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadBarrierattrSetpshared(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadBarrierattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadCancel(p0)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadCondattrGetclock(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadCondattrGetpshared(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadCondattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadCondattrSetclock(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadCondattrSetpshared(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadCondattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadGetcpuclockid(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadGetcpuclockid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadGetschedparam(p0, p1, p2)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadKill(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadMutexConsistent(p0)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadMutexConsistent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadMutexTimedlock(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadMutexattrGetprotocol(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadMutexattrGetprotocol(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadMutexattrGetpshared(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadMutexattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadMutexattrGetrobust(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadMutexattrGetrobust(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadMutexattrSetprotocol(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadMutexattrSetprotocol(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadMutexattrSetpshared(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadMutexattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadMutexattrSetrobust(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadMutexattrSetrobust(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadRwlockattrGetpshared(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadRwlockattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadRwlockattrSetpshared(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadRwlockattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadOnce(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadOnce(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadSetschedparam(p0, p1, p2)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadSetschedprio(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadSetschedprio(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadSigmask(p0, p1, p2)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadSpinDestroy(p0)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadSpinDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadSpinInit(p0, p1)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadSpinLock(p0)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadSpinTrylock(p0)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_common_posix_pthread_pthreadSpinUnlock(p0)")
private external fun _wasm_libc_new_common_posix_pthread_pthreadSpinUnlock(p0: String): Int

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetinheritsched(attr: COpaquePointer?, inheritsched: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadAttrGetinheritsched((attr?.value ?: 0L).toString(), (inheritsched?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadAttrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedpolicy(attr: COpaquePointer?, policy: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadAttrGetschedpolicy((attr?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadAttrSetguardsize((attr?.value ?: 0L).toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadAttrSetinheritsched((attr?.value ?: 0L).toString(), inheritsched) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadAttrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadAttrSetschedpolicy((attr?.value ?: 0L).toString(), policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadAttrSetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), stacksize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadBarrierDestroy((barrier?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadBarrierInit((barrier?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadBarrierWait((barrier?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadBarrierattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadBarrierattrGetpshared((attr?.value ?: 0L).toString(), (shared?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadBarrierattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadBarrierattrSetpshared((attr?.value ?: 0L).toString(), shared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadCancel(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadCondattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadCondattrSetpshared((attr?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadGetcpuclockid(thread.toLong().toString(), (clkId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadGetschedparam(native.toLong().toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadKill(thread.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadMutexConsistent((mutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadMutexattrGetprotocol((attr?.value ?: 0L).toString(), (protocol?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadMutexattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robustness: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadMutexattrGetrobust((attr?.value ?: 0L).toString(), (robustness?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadMutexattrSetprotocol((attr?.value ?: 0L).toString(), protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadMutexattrSetpshared((attr?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadMutexattrSetrobust((attr?.value ?: 0L).toString(), robustness) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadRwlockattrGetpshared((attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadRwlockattrSetpshared((attr?.value ?: 0L).toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(control: COpaquePointer?, routine: PthreadAtforkPrepareCallback): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadOnce((control?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadSetschedparam(native.toLong().toString(), policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadSetschedprio(native.toLong().toString(), priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadSpinDestroy((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadSpinLock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadSpinTrylock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_newCommonPosixPthreadNapiAvailable) _wasm_libc_new_common_posix_pthread_pthreadSpinUnlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
