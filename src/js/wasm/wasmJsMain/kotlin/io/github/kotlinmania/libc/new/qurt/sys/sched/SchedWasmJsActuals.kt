@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.sys.sched

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initNewQurtSysSchedNapiAddon(): Boolean

private val _newQurtSysSchedNapiAvailable: Boolean = _initNewQurtSysSchedNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libc_new_qurt_sys_sched_schedYield()")
private external fun _wasm_libc_new_qurt_sys_sched_schedYield(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_sys_sched_schedGetPriorityMax(p0)")
private external fun _wasm_libc_new_qurt_sys_sched_schedGetPriorityMax(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_sys_sched_schedGetPriorityMin(p0)")
private external fun _wasm_libc_new_qurt_sys_sched_schedGetPriorityMin(p0: Int): Int

public actual fun schedYield(): CInt =
    if (_newQurtSysSchedNapiAvailable) _wasm_libc_new_qurt_sys_sched_schedYield() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_newQurtSysSchedNapiAvailable) _wasm_libc_new_qurt_sys_sched_schedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_newQurtSysSchedNapiAvailable) _wasm_libc_new_qurt_sys_sched_schedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")
