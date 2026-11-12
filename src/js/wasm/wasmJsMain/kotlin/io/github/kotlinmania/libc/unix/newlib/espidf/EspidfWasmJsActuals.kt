@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.PthreadAttrT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixNewlibEspidfNapiAddon(): Boolean

private val unixNewlibEspidfNapiAvailable: Boolean = initUnixNewlibEspidfNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNewlibEspidfPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcUnixNewlibEspidfPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibEspidfGetrandom(p0, p1, p2)")
private external fun wasmLibcUnixNewlibEspidfGetrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibEspidfGethostname(p0, p1)")
private external fun wasmLibcUnixNewlibEspidfGethostname(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibEspidfSendmsg(p0, p1, p2)")
private external fun wasmLibcUnixNewlibEspidfSendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibEspidfRecvmsg(p0, p1, p2)")
private external fun wasmLibcUnixNewlibEspidfRecvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibEspidfEventfd(p0, p1)")
private external fun wasmLibcUnixNewlibEspidfEventfd(p0: Int, p1: Int): Int

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    if (unixNewlibEspidfNapiAvailable) wasmLibcUnixNewlibEspidfPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    if (unixNewlibEspidfNapiAvailable) wasmLibcUnixNewlibEspidfGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: MutPtr<CChar>, namelen: SsizeT) {
    if (unixNewlibEspidfNapiAvailable) {
        wasmLibcUnixNewlibEspidfGethostname(name.rawAddress.toString(), namelen.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sendmsg(s: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixNewlibEspidfNapiAvailable) wasmLibcUnixNewlibEspidfSendmsg(s, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(s: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixNewlibEspidfNapiAvailable) wasmLibcUnixNewlibEspidfRecvmsg(s, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (unixNewlibEspidfNapiAvailable) wasmLibcUnixNewlibEspidfEventfd(initval.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")
