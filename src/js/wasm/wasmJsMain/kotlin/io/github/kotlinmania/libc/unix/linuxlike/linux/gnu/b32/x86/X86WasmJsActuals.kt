@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixLinuxlikeLinuxGnuB32X86NapiAddon(): Boolean

private val _unixLinuxlikeLinuxGnuB32X86NapiAvailable: Boolean = _initUnixLinuxlikeLinuxGnuB32X86NapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_b32_x86_getcontext(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_b32_x86_getcontext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_b32_x86_setcontext(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_b32_x86_setcontext(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_b32_x86_makecontext(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_b32_x86_makecontext(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_b32_x86_swapcontext(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_b32_x86_swapcontext(p0: String, p1: String): Int

public actual fun getcontext(ucp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuB32X86NapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_b32_x86_getcontext((ucp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setcontext(ucp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuB32X86NapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_b32_x86_setcontext((ucp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makecontext(ucp: COpaquePointer?, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long) {
    if (_unixLinuxlikeLinuxGnuB32X86NapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_gnu_b32_x86_makecontext((ucp?.value ?: 0L).toString(), 0L.toString(), argc, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuB32X86NapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_b32_x86_swapcontext((uocp?.value ?: 0L).toString(), (ucp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
