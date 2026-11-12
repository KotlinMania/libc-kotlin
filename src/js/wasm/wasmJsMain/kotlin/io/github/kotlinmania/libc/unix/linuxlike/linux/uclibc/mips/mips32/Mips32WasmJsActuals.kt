@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.linuxlike.CpuSetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixLinuxlikeLinuxUclibcMipsMips32NapiAddon(): Boolean

private val unixLinuxlikeLinuxUclibcMipsMips32NapiAvailable: Boolean = initUnixLinuxlikeLinuxUclibcMipsMips32NapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcMipsMips32Sysctl(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcMipsMips32Sysctl(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcMipsMips32Glob64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcMipsMips32Glob64(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcMipsMips32Globfree64(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcMipsMips32Globfree64(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrGetaffinityNp(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrGetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrSetaffinityNp(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrSetaffinityNp(p0: String, p1: String, p2: String): Int

public actual fun sysctl(name: MutPtr<CInt>, namelen: CInt, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    if (unixLinuxlikeLinuxUclibcMipsMips32NapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcMipsMips32Sysctl(name.rawAddress.toString(), namelen, oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob64(pattern: ConstPtr<CChar>, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr<Glob64T>): CInt =
    if (unixLinuxlikeLinuxUclibcMipsMips32NapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcMipsMips32Glob64(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree64(pglob: MutPtr<Glob64T>) {
    if (unixLinuxlikeLinuxUclibcMipsMips32NapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxUclibcMipsMips32Globfree64(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadAttrGetaffinityNp(attr: ConstPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    if (unixLinuxlikeLinuxUclibcMipsMips32NapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrGetaffinityNp(attr.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    if (unixLinuxlikeLinuxUclibcMipsMips32NapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrSetaffinityNp(attr.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
