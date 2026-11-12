@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.solarish.solaris

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.solarish.PthreadAttrT
import io.github.kotlinmania.libc.unix.solarish.PthreadT
import io.github.kotlinmania.libc.unix.solarish.Termios
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixSolarishSolarisNapiAddon(): Boolean

private val unixSolarishSolarisNapiAvailable: Boolean = initUnixSolarishSolarisNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishSolarisFexecve(p0, p1, p2)")
private external fun wasmLibcUnixSolarishSolarisFexecve(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishSolarisMincore(p0, p1, p2)")
private external fun wasmLibcUnixSolarishSolarisMincore(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSolarisDoorCall(p0, p1)")
private external fun wasmLibcUnixSolarishSolarisDoorCall(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishSolarisDoorReturn(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishSolarisDoorReturn(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishSolarisDoorCreate(p0, p1, p2)")
private external fun wasmLibcUnixSolarishSolarisDoorCreate(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSolarisFattach(p0, p1)")
private external fun wasmLibcUnixSolarishSolarisFattach(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSolarisPthreadGetattrNp(p0, p1)")
private external fun wasmLibcUnixSolarishSolarisPthreadGetattrNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishSolarisEuidaccess(p0, p1)")
private external fun wasmLibcUnixSolarishSolarisEuidaccess(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishSolarisOpenpty(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishSolarisOpenpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishSolarisForkpty(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishSolarisForkpty(p0: String, p1: String, p2: String, p3: String): Int

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixSolarishSolarisNapiAvailable) wasmLibcUnixSolarishSolarisFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: MutPtr<CVoid>, len: SizeT, vec: MutPtr<CChar>): CInt =
    if (unixSolarishSolarisNapiAvailable) wasmLibcUnixSolarishSolarisMincore(addr.rawAddress.toString(), len.toString(), vec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doorCall(d: CInt, params: MutPtr<DoorArgT>): CInt =
    if (unixSolarishSolarisNapiAvailable) wasmLibcUnixSolarishSolarisDoorCall(d, params.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doorReturn(dataPtr: MutPtr<CChar>, dataSize: SizeT, descPtr: MutPtr<DoorDescT>, numDesc: CUint): CInt =
    if (unixSolarishSolarisNapiAvailable) wasmLibcUnixSolarishSolarisDoorReturn(dataPtr.rawAddress.toString(), dataSize.toString(), descPtr.rawAddress.toString(), numDesc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: MutPtr<CVoid>, attributes: DoorAttrT): CInt =
    if (unixSolarishSolarisNapiAvailable) wasmLibcUnixSolarishSolarisDoorCreate(0L.toString(), cookie.rawAddress.toString(), attributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fattach(fildes: CInt, path: ConstPtr<CChar>): CInt =
    if (unixSolarishSolarisNapiAvailable) wasmLibcUnixSolarishSolarisFattach(fildes, path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    if (unixSolarishSolarisNapiAvailable) wasmLibcUnixSolarishSolarisPthreadGetattrNp(thread.toLong().toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(path: ConstPtr<CChar>, amode: CInt): CInt =
    if (unixSolarishSolarisNapiAvailable) wasmLibcUnixSolarishSolarisEuidaccess(path.rawAddress.toString(), amode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amain: MutPtr<CInt>, asubord: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    if (unixSolarishSolarisNapiAvailable) wasmLibcUnixSolarishSolarisOpenpty(amain.rawAddress.toString(), asubord.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amain: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    if (unixSolarishSolarisNapiAvailable) wasmLibcUnixSolarishSolarisForkpty(amain.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
