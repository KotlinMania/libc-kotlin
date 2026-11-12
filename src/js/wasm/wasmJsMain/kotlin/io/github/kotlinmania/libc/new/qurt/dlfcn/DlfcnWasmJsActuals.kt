@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.dlfcn

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initNewQurtDlfcnNapiAddon(): Boolean

private val newQurtDlfcnNapiAvailable: Boolean = initNewQurtDlfcnNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtDlfcnDlopen(p0, p1)")
private external fun wasmLibcNewQurtDlfcnDlopen(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtDlfcnDlclose(p0)")
private external fun wasmLibcNewQurtDlfcnDlclose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtDlfcnDlsym(p0, p1)")
private external fun wasmLibcNewQurtDlfcnDlsym(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libcNewQurtDlfcnDlerror()")
private external fun wasmLibcNewQurtDlfcnDlerror(): String

public actual fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    if (newQurtDlfcnNapiAvailable) MutPtr(wasmLibcNewQurtDlfcnDlopen(filename.rawAddress.toString(), flag).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlclose(handle: MutPtr<CVoid>): CInt =
    if (newQurtDlfcnNapiAvailable) wasmLibcNewQurtDlfcnDlclose(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid> =
    if (newQurtDlfcnNapiAvailable) MutPtr(wasmLibcNewQurtDlfcnDlsym(handle.rawAddress.toString(), symbol.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlerror(): MutPtr<CChar> =
    if (newQurtDlfcnNapiAvailable) MutPtr(wasmLibcNewQurtDlfcnDlerror().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
