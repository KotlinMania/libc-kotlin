@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixLinuxlikeAndroidB64NapiAddon(): Boolean

private val _unixLinuxlikeAndroidB64NapiAvailable: Boolean = _initUnixLinuxlikeAndroidB64NapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_b64_systemPropertyWait(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_b64_systemPropertyWait(p0: String, p1: Int, p2: String, p3: String): Boolean

public actual fun systemPropertyWait(pi: COpaquePointer?, oldSerial: UInt, newSerialPtr: COpaquePointer?, relativeTimeout: COpaquePointer?): Boolean =
    if (_unixLinuxlikeAndroidB64NapiAvailable) _wasm_libc_unix_linuxlike_android_b64_systemPropertyWait((pi?.value ?: 0L).toString(), oldSerial.toInt(), (newSerialPtr?.value ?: 0L).toString(), (relativeTimeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
