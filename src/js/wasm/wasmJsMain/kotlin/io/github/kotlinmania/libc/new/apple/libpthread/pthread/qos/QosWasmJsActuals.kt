@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.qos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initNewAppleLibpthreadPthreadQosNapiAddon(): Boolean

private val newAppleLibpthreadPthreadQosNapiAvailable: Boolean = initNewAppleLibpthreadPthreadQosNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewAppleLibpthreadPthreadQosPthreadAttrGetQosClassNp(p0, p1, p2)")
private external fun wasmLibcNewAppleLibpthreadPthreadQosPthreadAttrGetQosClassNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewAppleLibpthreadPthreadQosPthreadGetQosClassNp(p0, p1, p2)")
private external fun wasmLibcNewAppleLibpthreadPthreadQosPthreadGetQosClassNp(p0: String, p1: String, p2: String): Int

public actual fun pthreadAttrSetQosClassNp(attr: MutPtr<PthreadAttrT>, cls: QosClassT, priority: CInt): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetQosClassNp(attr: MutPtr<PthreadAttrT>, cls: MutPtr<QosClassT>, priority: MutPtr<CInt>): CInt =
    if (newAppleLibpthreadPthreadQosNapiAvailable) wasmLibcNewAppleLibpthreadPthreadQosPthreadAttrGetQosClassNp(attr.rawAddress.toString(), cls.rawAddress.toString(), priority.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetQosClassSelfNp(cls: QosClassT, priority: CInt): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetQosClassNp(thread: PthreadT, cls: MutPtr<QosClassT>, priority: MutPtr<CInt>): CInt =
    if (newAppleLibpthreadPthreadQosNapiAvailable) wasmLibcNewAppleLibpthreadPthreadQosPthreadGetQosClassNp(thread.toLong().toString(), cls.rawAddress.toString(), priority.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
