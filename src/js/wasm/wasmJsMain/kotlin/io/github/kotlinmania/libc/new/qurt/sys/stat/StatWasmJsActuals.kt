@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.sys.stat

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initNewQurtSysStatNapiAddon(): Boolean

private val _newQurtSysStatNapiAvailable: Boolean = _initNewQurtSysStatNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_sys_stat_stat(p0, p1)")
private external fun _wasm_libc_new_qurt_sys_stat_stat(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_sys_stat_fstat(p0, p1)")
private external fun _wasm_libc_new_qurt_sys_stat_fstat(p0: Int, p1: String): Int

public actual fun stat(pathname: String?, statbuf: COpaquePointer?): CInt =
    if (_newQurtSysStatNapiAvailable) _wasm_libc_new_qurt_sys_stat_stat(pathname, (statbuf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fd: CInt, statbuf: COpaquePointer?): CInt =
    if (_newQurtSysStatNapiAvailable) _wasm_libc_new_qurt_sys_stat_fstat(fd, (statbuf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
