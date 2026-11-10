@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixLinuxlikeLinuxUclibcMipsMips32NapiAddon(): Boolean

private val _unixLinuxlikeLinuxUclibcMipsMips32NapiAvailable: Boolean = _initUnixLinuxlikeLinuxUclibcMipsMips32NapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_mips_mips32_sysctl(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_mips_mips32_sysctl(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_mips_mips32_glob64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_mips_mips32_glob64(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_mips_mips32_globfree64(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_mips_mips32_globfree64(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrGetaffinityNp(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrGetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrSetaffinityNp(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrSetaffinityNp(p0: String, p1: String, p2: String): Int

public actual fun sysctl(name: COpaquePointer?, namelen: CInt, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixLinuxlikeLinuxUclibcMipsMips32NapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_mips_mips32_sysctl((name?.value ?: 0L).toString(), namelen, (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcMipsMips32NapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_mips_mips32_glob64(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree64(pglob: COpaquePointer?) {
    if (_unixLinuxlikeLinuxUclibcMipsMips32NapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_uclibc_mips_mips32_globfree64((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcMipsMips32NapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrGetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcMipsMips32NapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrSetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
