@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixNewlibHorizonNapiAddon(): Boolean

private val unixNewlibHorizonNapiAvailable: Boolean = initUnixNewlibHorizonNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNewlibHorizonPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcUnixNewlibHorizonPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibHorizonPthreadAttrGetschedparam(p0, p1)")
private external fun wasmLibcUnixNewlibHorizonPthreadAttrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibHorizonPthreadAttrSetschedparam(p0, p1)")
private external fun wasmLibcUnixNewlibHorizonPthreadAttrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibHorizonPthreadAttrGetprocessoridNp(p0, p1)")
private external fun wasmLibcUnixNewlibHorizonPthreadAttrGetprocessoridNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibHorizonPthreadAttrSetprocessoridNp(p0, p1)")
private external fun wasmLibcUnixNewlibHorizonPthreadAttrSetprocessoridNp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibHorizonPthreadGetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixNewlibHorizonPthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibHorizonPthreadSetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixNewlibHorizonPthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibHorizonPthreadCondattrGetclock(p0, p1)")
private external fun wasmLibcUnixNewlibHorizonPthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibHorizonPthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcUnixNewlibHorizonPthreadCondattrSetclock(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixNewlibHorizonPthreadGetprocessoridNp()")
private external fun wasmLibcUnixNewlibHorizonPthreadGetprocessoridNp(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibHorizonGetrandom(p0, p1, p2)")
private external fun wasmLibcUnixNewlibHorizonGetrandom(p0: String, p1: String, p2: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixNewlibHorizonGethostid()")
private external fun wasmLibcUnixNewlibHorizonGethostid(): String

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    if (unixNewlibHorizonNapiAvailable) wasmLibcUnixNewlibHorizonPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    if (unixNewlibHorizonNapiAvailable) wasmLibcUnixNewlibHorizonPthreadAttrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    if (unixNewlibHorizonNapiAvailable) wasmLibcUnixNewlibHorizonPthreadAttrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetprocessoridNp(attr: ConstPtr, processorId: MutPtr): CInt =
    if (unixNewlibHorizonNapiAvailable) wasmLibcUnixNewlibHorizonPthreadAttrGetprocessoridNp(attr.rawAddress.toString(), processorId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetprocessoridNp(attr: MutPtr, processorId: CInt): CInt =
    if (unixNewlibHorizonNapiAvailable) wasmLibcUnixNewlibHorizonPthreadAttrSetprocessoridNp(attr.rawAddress.toString(), processorId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    if (unixNewlibHorizonNapiAvailable) wasmLibcUnixNewlibHorizonPthreadGetschedparam(native.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    if (unixNewlibHorizonNapiAvailable) wasmLibcUnixNewlibHorizonPthreadSetschedparam(native.toLong().toString(), policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    if (unixNewlibHorizonNapiAvailable) wasmLibcUnixNewlibHorizonPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    if (unixNewlibHorizonNapiAvailable) wasmLibcUnixNewlibHorizonPthreadCondattrSetclock(attr.rawAddress.toString(), clockId.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetprocessoridNp(): CInt =
    if (unixNewlibHorizonNapiAvailable) wasmLibcUnixNewlibHorizonPthreadGetprocessoridNp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    if (unixNewlibHorizonNapiAvailable) wasmLibcUnixNewlibHorizonGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixNewlibHorizonNapiAvailable) wasmLibcUnixNewlibHorizonGethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
