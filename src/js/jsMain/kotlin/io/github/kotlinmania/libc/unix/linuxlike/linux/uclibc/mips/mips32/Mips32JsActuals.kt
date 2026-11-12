@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixLinuxlikeLinuxUclibcMipsMips32NapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun sysctl(name: MutPtr, namelen: CInt, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    if (unixLinuxlikeLinuxUclibcMipsMips32NapiAddon != null) (unixLinuxlikeLinuxUclibcMipsMips32NapiAddon.libcUnixLinuxlikeLinuxUclibcMipsMips32Sysctl(name.rawAddress.toString(), namelen, oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob64(pattern: ConstPtr, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr): CInt =
    if (unixLinuxlikeLinuxUclibcMipsMips32NapiAddon != null) (unixLinuxlikeLinuxUclibcMipsMips32NapiAddon.libcUnixLinuxlikeLinuxUclibcMipsMips32Glob64(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree64(pglob: MutPtr) {
    if (unixLinuxlikeLinuxUclibcMipsMips32NapiAddon != null) {
        unixLinuxlikeLinuxUclibcMipsMips32NapiAddon.libcUnixLinuxlikeLinuxUclibcMipsMips32Globfree64(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadAttrGetaffinityNp(attr: ConstPtr, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    if (unixLinuxlikeLinuxUclibcMipsMips32NapiAddon != null) (unixLinuxlikeLinuxUclibcMipsMips32NapiAddon.libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrGetaffinityNp(attr.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    if (unixLinuxlikeLinuxUclibcMipsMips32NapiAddon != null) (unixLinuxlikeLinuxUclibcMipsMips32NapiAddon.libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrSetaffinityNp(attr.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
