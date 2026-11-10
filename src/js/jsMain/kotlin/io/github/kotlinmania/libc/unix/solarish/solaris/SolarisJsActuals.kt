@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish.solaris

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.solarish.PthreadT

private val _unixSolarishSolarisNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_fexecve(fd, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_mincore((addr?.value ?: 0L).toString(), len.toString(), (vec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doorCall(d: CInt, params: COpaquePointer?): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_doorCall(d, (params?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doorReturn(dataPtr: COpaquePointer?, dataSize: SizeT, descPtr: COpaquePointer?, numDesc: CUint): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_doorReturn((dataPtr?.value ?: 0L).toString(), dataSize.toString(), (descPtr?.value ?: 0L).toString(), numDesc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: COpaquePointer?, attributes: DoorAttrT): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_doorCreate(0L.toString(), (cookie?.value ?: 0L).toString(), attributes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fattach(fildes: CInt, path: String?): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_fattach(fildes, path) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_pthreadGetattrNp(thread.toLong().toString(), (attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(path: String?, amode: CInt): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_euidaccess(path, amode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amain: COpaquePointer?, asubord: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_openpty((amain?.value ?: 0L).toString(), (asubord?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amain: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_forkpty((amain?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
