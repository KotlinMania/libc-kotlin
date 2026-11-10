@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT

private val _unixLinuxlikeLinuxUclibcMipsMips32NapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun sysctl(name: COpaquePointer?, namelen: CInt, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon != null) (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon.libc_unix_linuxlike_linux_uclibc_mips_mips32_sysctl((name?.value ?: 0L).toString(), namelen, (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon != null) (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon.libc_unix_linuxlike_linux_uclibc_mips_mips32_glob64(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree64(pglob: COpaquePointer?) {
    if (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon != null) {
        _unixLinuxlikeLinuxUclibcMipsMips32NapiAddon.libc_unix_linuxlike_linux_uclibc_mips_mips32_globfree64((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon != null) (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon.libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrGetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon != null) (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon.libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrSetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
