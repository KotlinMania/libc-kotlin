@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadAttrT
import io.github.kotlinmania.libc.unix.newlib.PthreadCondattrT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixNewlibHorizonNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    if (unixNewlibHorizonNapiAddon != null) (unixNewlibHorizonNapiAddon.libcUnixNewlibHorizonPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt =
    if (unixNewlibHorizonNapiAddon != null) (unixNewlibHorizonNapiAddon.libcUnixNewlibHorizonPthreadAttrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt =
    if (unixNewlibHorizonNapiAddon != null) (unixNewlibHorizonNapiAddon.libcUnixNewlibHorizonPthreadAttrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetprocessoridNp(attr: ConstPtr<PthreadAttrT>, processorId: MutPtr<CInt>): CInt =
    if (unixNewlibHorizonNapiAddon != null) (unixNewlibHorizonNapiAddon.libcUnixNewlibHorizonPthreadAttrGetprocessoridNp(attr.rawAddress.toString(), processorId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetprocessoridNp(attr: MutPtr<PthreadAttrT>, processorId: CInt): CInt =
    if (unixNewlibHorizonNapiAddon != null) (unixNewlibHorizonNapiAddon.libcUnixNewlibHorizonPthreadAttrSetprocessoridNp(attr.rawAddress.toString(), processorId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    if (unixNewlibHorizonNapiAddon != null) (unixNewlibHorizonNapiAddon.libcUnixNewlibHorizonPthreadGetschedparam(native.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixNewlibHorizonNapiAddon != null) (unixNewlibHorizonNapiAddon.libcUnixNewlibHorizonPthreadSetschedparam(native.toLong().toString(), policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    if (unixNewlibHorizonNapiAddon != null) (unixNewlibHorizonNapiAddon.libcUnixNewlibHorizonPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (unixNewlibHorizonNapiAddon != null) (unixNewlibHorizonNapiAddon.libcUnixNewlibHorizonPthreadCondattrSetclock(attr.rawAddress.toString(), clockId.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetprocessoridNp(): CInt =
    if (unixNewlibHorizonNapiAddon != null) (unixNewlibHorizonNapiAddon.libcUnixNewlibHorizonPthreadGetprocessoridNp() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    if (unixNewlibHorizonNapiAddon != null) (unixNewlibHorizonNapiAddon.libcUnixNewlibHorizonGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixNewlibHorizonNapiAddon != null) (unixNewlibHorizonNapiAddon.libcUnixNewlibHorizonGethostid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
