@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.windows.SizeT
import io.github.kotlinmania.libc.windows.WcharT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initWindowsGnuNapiAddon(): Boolean

private val _windowsGnuNapiAvailable: Boolean = _initWindowsGnuNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_gnu_strcasecmp(p0, p1)")
private external fun _wasm_libc_windows_gnu_strcasecmp(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_gnu_strncasecmp(p0, p1, p2)")
private external fun _wasm_libc_windows_gnu_strncasecmp(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_gnu_wmemchr(p0, p1, p2)")
private external fun _wasm_libc_windows_gnu_wmemchr(p0: String, p1: Int, p2: String): String

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    if (_windowsGnuNapiAvailable) _wasm_libc_windows_gnu_strcasecmp(s1, s2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    if (_windowsGnuNapiAvailable) _wasm_libc_windows_gnu_strncasecmp(s1, s2, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    if (_windowsGnuNapiAvailable) _wasm_libc_windows_gnu_wmemchr((cx?.value ?: 0L).toString(), c.toInt(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
