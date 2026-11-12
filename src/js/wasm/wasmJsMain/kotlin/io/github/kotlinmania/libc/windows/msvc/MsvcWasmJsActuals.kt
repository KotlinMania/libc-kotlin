@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.windows.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initWindowsMsvcNapiAddon(): Boolean

private val windowsMsvcNapiAvailable: Boolean = initWindowsMsvcNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsMsvcStricmp(p0, p1)")
private external fun wasmLibcWindowsMsvcStricmp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsMsvcStrnicmp(p0, p1, p2)")
private external fun wasmLibcWindowsMsvcStrnicmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWindowsMsvcMemccpy(p0, p1, p2, p3)")
private external fun wasmLibcWindowsMsvcMemccpy(p0: String, p1: String, p2: Int, p3: String): String

public actual fun stricmp(s1: ConstPtr, s2: ConstPtr): CInt =
    if (windowsMsvcNapiAvailable) wasmLibcWindowsMsvcStricmp(s1.rawAddress.toString(), s2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnicmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    if (windowsMsvcNapiAvailable) wasmLibcWindowsMsvcStrnicmp(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memccpy(dest: MutPtr, src: ConstPtr, c: CInt, count: SizeT): MutPtr =
    if (windowsMsvcNapiAvailable) MutPtr(wasmLibcWindowsMsvcMemccpy(dest.rawAddress.toString(), src.rawAddress.toString(), c, count.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
