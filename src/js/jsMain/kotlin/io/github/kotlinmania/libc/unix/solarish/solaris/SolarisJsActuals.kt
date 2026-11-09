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
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_fexecve(fd, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_mincore((addr?.value ?: 0L).toString(), len.toString(), (vec?.value ?: 0L).toString()) as Int) else 0

public actual fun doorCall(d: CInt, params: COpaquePointer?): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_doorCall(d, (params?.value ?: 0L).toString()) as Int) else 0

public actual fun doorReturn(dataPtr: COpaquePointer?, dataSize: SizeT, descPtr: COpaquePointer?, numDesc: CUint): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_doorReturn((dataPtr?.value ?: 0L).toString(), dataSize.toString(), (descPtr?.value ?: 0L).toString(), numDesc.toInt()) as Int) else 0

public actual fun doorCreate(serverProcedure: FnCallback, cookie: COpaquePointer?, attributes: DoorAttrT): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_doorCreate(0L.toString(), (cookie?.value ?: 0L).toString(), attributes.toInt()) as Int) else 0

public actual fun fattach(fildes: CInt, path: String?): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_fattach(fildes, path) as Int) else 0

public actual fun pthreadGetattrNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_pthreadGetattrNp(thread.toLong().toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun euidaccess(path: String?, amode: CInt): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_euidaccess(path, amode) as Int) else 0

public actual fun openpty(amain: COpaquePointer?, asubord: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_openpty((amain?.value ?: 0L).toString(), (asubord?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun forkpty(amain: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixSolarishSolarisNapiAddon != null) (_unixSolarishSolarisNapiAddon.libc_unix_solarish_solaris_forkpty((amain?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0
