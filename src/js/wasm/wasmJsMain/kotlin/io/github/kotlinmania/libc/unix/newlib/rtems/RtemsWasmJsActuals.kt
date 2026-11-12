@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixNewlibRtemsNapiAddon(): Boolean

private val unixNewlibRtemsNapiAvailable: Boolean = initUnixNewlibRtemsNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibRtemsFutimens(p0, p1)")
private external fun wasmLibcUnixNewlibRtemsFutimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibRtemsWritev(p0, p1, p2)")
private external fun wasmLibcUnixNewlibRtemsWritev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibRtemsReadv(p0, p1, p2)")
private external fun wasmLibcUnixNewlibRtemsReadv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNewlibRtemsPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcUnixNewlibRtemsPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibRtemsPthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcUnixNewlibRtemsPthreadCondattrSetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibRtemsGetentropy(p0, p1)")
private external fun wasmLibcUnixNewlibRtemsGetentropy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibRtemsArc4randomBuf(p0, p1)")
private external fun wasmLibcUnixNewlibRtemsArc4randomBuf(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibRtemsSetgroups(p0, p1)")
private external fun wasmLibcUnixNewlibRtemsSetgroups(p0: Int, p1: String): Int

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    if (unixNewlibRtemsNapiAvailable) wasmLibcUnixNewlibRtemsFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (unixNewlibRtemsNapiAvailable) wasmLibcUnixNewlibRtemsWritev(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (unixNewlibRtemsNapiAvailable) wasmLibcUnixNewlibRtemsReadv(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    if (unixNewlibRtemsNapiAvailable) wasmLibcUnixNewlibRtemsPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    if (unixNewlibRtemsNapiAvailable) wasmLibcUnixNewlibRtemsPthreadCondattrSetclock(attr.rawAddress.toString(), clockId.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    if (unixNewlibRtemsNapiAvailable) wasmLibcUnixNewlibRtemsGetentropy(buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: MutPtr, nbytes: SizeT) {
    if (unixNewlibRtemsNapiAvailable) {
        wasmLibcUnixNewlibRtemsArc4randomBuf(buf.rawAddress.toString(), nbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setgroups(ngroups: CInt, grouplist: ConstPtr): CInt =
    if (unixNewlibRtemsNapiAvailable) wasmLibcUnixNewlibRtemsSetgroups(ngroups, grouplist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
