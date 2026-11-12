@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val unixSolarishSolarisNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixSolarishSolarisNapiAddon != null) (unixSolarishSolarisNapiAddon.libcUnixSolarishSolarisFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: MutPtr<CVoid>, len: SizeT, vec: MutPtr<CChar>): CInt =
    if (unixSolarishSolarisNapiAddon != null) (unixSolarishSolarisNapiAddon.libcUnixSolarishSolarisMincore(addr.rawAddress.toString(), len.toString(), vec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doorCall(d: CInt, params: MutPtr<DoorArgT>): CInt =
    if (unixSolarishSolarisNapiAddon != null) (unixSolarishSolarisNapiAddon.libcUnixSolarishSolarisDoorCall(d, params.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doorReturn(dataPtr: MutPtr<CChar>, dataSize: SizeT, descPtr: MutPtr<DoorDescT>, numDesc: CUint): CInt =
    if (unixSolarishSolarisNapiAddon != null) (unixSolarishSolarisNapiAddon.libcUnixSolarishSolarisDoorReturn(dataPtr.rawAddress.toString(), dataSize.toString(), descPtr.rawAddress.toString(), numDesc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: MutPtr<CVoid>, attributes: DoorAttrT): CInt =
    if (unixSolarishSolarisNapiAddon != null) (unixSolarishSolarisNapiAddon.libcUnixSolarishSolarisDoorCreate(0L.toString(), cookie.rawAddress.toString(), attributes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fattach(fildes: CInt, path: ConstPtr<CChar>): CInt =
    if (unixSolarishSolarisNapiAddon != null) (unixSolarishSolarisNapiAddon.libcUnixSolarishSolarisFattach(fildes, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    if (unixSolarishSolarisNapiAddon != null) (unixSolarishSolarisNapiAddon.libcUnixSolarishSolarisPthreadGetattrNp(thread.toLong().toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(path: ConstPtr<CChar>, amode: CInt): CInt =
    if (unixSolarishSolarisNapiAddon != null) (unixSolarishSolarisNapiAddon.libcUnixSolarishSolarisEuidaccess(path.rawAddress.toString(), amode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amain: MutPtr<CInt>, asubord: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    if (unixSolarishSolarisNapiAddon != null) (unixSolarishSolarisNapiAddon.libcUnixSolarishSolarisOpenpty(amain.rawAddress.toString(), asubord.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amain: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    if (unixSolarishSolarisNapiAddon != null) (unixSolarishSolarisNapiAddon.libcUnixSolarishSolarisForkpty(amain.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
