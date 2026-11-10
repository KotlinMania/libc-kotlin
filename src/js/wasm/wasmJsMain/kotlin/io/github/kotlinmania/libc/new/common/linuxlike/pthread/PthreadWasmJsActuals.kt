@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initNewCommonLinuxlikePthreadNapiAddon(): Boolean

private val _newCommonLinuxlikePthreadNapiAvailable: Boolean = _initNewCommonLinuxlikePthreadNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_common_linuxlike_pthread_pthreadGetaffinityNp(p0, p1, p2)")
private external fun _wasm_libc_new_common_linuxlike_pthread_pthreadGetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_linuxlike_pthread_pthreadGetattrNp(p0, p1)")
private external fun _wasm_libc_new_common_linuxlike_pthread_pthreadGetattrNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_common_linuxlike_pthread_pthreadGetnameNp(p0, p1, p2)")
private external fun _wasm_libc_new_common_linuxlike_pthread_pthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_common_linuxlike_pthread_pthreadSetaffinityNp(p0, p1, p2)")
private external fun _wasm_libc_new_common_linuxlike_pthread_pthreadSetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_common_linuxlike_pthread_pthreadSetnameNp(p0, p1)")
private external fun _wasm_libc_new_common_linuxlike_pthread_pthreadSetnameNp(p0: String, p1: String?): Int

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_newCommonLinuxlikePthreadNapiAvailable) _wasm_libc_new_common_linuxlike_pthread_pthreadGetaffinityNp(thread.toLong().toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    if (_newCommonLinuxlikePthreadNapiAvailable) _wasm_libc_new_common_linuxlike_pthread_pthreadGetattrNp(native.toLong().toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    if (_newCommonLinuxlikePthreadNapiAvailable) _wasm_libc_new_common_linuxlike_pthread_pthreadGetnameNp(thread.toLong().toString(), (name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_newCommonLinuxlikePthreadNapiAvailable) _wasm_libc_new_common_linuxlike_pthread_pthreadSetaffinityNp(thread.toLong().toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    if (_newCommonLinuxlikePthreadNapiAvailable) _wasm_libc_new_common_linuxlike_pthread_pthreadSetnameNp(thread.toLong().toString(), name) else throw UnsupportedOperationException("Native FFI addon is not available")
