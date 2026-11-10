@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.solarish.solaris

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.solarish.PthreadT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixSolarishSolarisNapiAddon(): Boolean

private val _unixSolarishSolarisNapiAvailable: Boolean = _initUnixSolarishSolarisNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_solaris_fexecve(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_solaris_fexecve(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_solaris_mincore(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_solaris_mincore(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_solaris_doorCall(p0, p1)")
private external fun _wasm_libc_unix_solarish_solaris_doorCall(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_solaris_doorReturn(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_solaris_doorReturn(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_solaris_doorCreate(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_solaris_doorCreate(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_solaris_fattach(p0, p1)")
private external fun _wasm_libc_unix_solarish_solaris_fattach(p0: Int, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_solaris_pthreadGetattrNp(p0, p1)")
private external fun _wasm_libc_unix_solarish_solaris_pthreadGetattrNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_solaris_euidaccess(p0, p1)")
private external fun _wasm_libc_unix_solarish_solaris_euidaccess(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_solaris_openpty(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_solaris_openpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_solaris_forkpty(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_solaris_forkpty(p0: String, p1: String, p2: String, p3: String): Int

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixSolarishSolarisNapiAvailable) _wasm_libc_unix_solarish_solaris_fexecve(fd, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    if (_unixSolarishSolarisNapiAvailable) _wasm_libc_unix_solarish_solaris_mincore((addr?.value ?: 0L).toString(), len.toString(), (vec?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doorCall(d: CInt, params: COpaquePointer?): CInt =
    if (_unixSolarishSolarisNapiAvailable) _wasm_libc_unix_solarish_solaris_doorCall(d, (params?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doorReturn(dataPtr: COpaquePointer?, dataSize: SizeT, descPtr: COpaquePointer?, numDesc: CUint): CInt =
    if (_unixSolarishSolarisNapiAvailable) _wasm_libc_unix_solarish_solaris_doorReturn((dataPtr?.value ?: 0L).toString(), dataSize.toString(), (descPtr?.value ?: 0L).toString(), numDesc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: COpaquePointer?, attributes: DoorAttrT): CInt =
    if (_unixSolarishSolarisNapiAvailable) _wasm_libc_unix_solarish_solaris_doorCreate(0L.toString(), (cookie?.value ?: 0L).toString(), attributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fattach(fildes: CInt, path: String?): CInt =
    if (_unixSolarishSolarisNapiAvailable) _wasm_libc_unix_solarish_solaris_fattach(fildes, path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    if (_unixSolarishSolarisNapiAvailable) _wasm_libc_unix_solarish_solaris_pthreadGetattrNp(thread.toLong().toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(path: String?, amode: CInt): CInt =
    if (_unixSolarishSolarisNapiAvailable) _wasm_libc_unix_solarish_solaris_euidaccess(path, amode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amain: COpaquePointer?, asubord: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixSolarishSolarisNapiAvailable) _wasm_libc_unix_solarish_solaris_openpty((amain?.value ?: 0L).toString(), (asubord?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amain: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixSolarishSolarisNapiAvailable) _wasm_libc_unix_solarish_solaris_forkpty((amain?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
