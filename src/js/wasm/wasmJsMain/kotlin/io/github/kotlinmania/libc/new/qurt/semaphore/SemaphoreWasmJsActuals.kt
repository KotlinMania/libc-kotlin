@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.semaphore

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initNewQurtSemaphoreNapiAddon(): Boolean

private val _newQurtSemaphoreNapiAvailable: Boolean = _initNewQurtSemaphoreNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_semaphore_semInit(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_semaphore_semInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_semaphore_semDestroy(p0)")
private external fun _wasm_libc_new_qurt_semaphore_semDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_semaphore_semWait(p0)")
private external fun _wasm_libc_new_qurt_semaphore_semWait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_semaphore_semTrywait(p0)")
private external fun _wasm_libc_new_qurt_semaphore_semTrywait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_semaphore_semPost(p0)")
private external fun _wasm_libc_new_qurt_semaphore_semPost(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_semaphore_semGetvalue(p0, p1)")
private external fun _wasm_libc_new_qurt_semaphore_semGetvalue(p0: String, p1: String): Int

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_newQurtSemaphoreNapiAvailable) _wasm_libc_new_qurt_semaphore_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_newQurtSemaphoreNapiAvailable) _wasm_libc_new_qurt_semaphore_semDestroy((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semWait(sem: COpaquePointer?): CInt =
    if (_newQurtSemaphoreNapiAvailable) _wasm_libc_new_qurt_semaphore_semWait((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTrywait(sem: COpaquePointer?): CInt =
    if (_newQurtSemaphoreNapiAvailable) _wasm_libc_new_qurt_semaphore_semTrywait((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semPost(sem: COpaquePointer?): CInt =
    if (_newQurtSemaphoreNapiAvailable) _wasm_libc_new_qurt_semaphore_semPost((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_newQurtSemaphoreNapiAvailable) _wasm_libc_new_qurt_semaphore_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
