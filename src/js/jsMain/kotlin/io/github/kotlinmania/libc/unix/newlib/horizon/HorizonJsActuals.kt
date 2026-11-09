@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT

private val _unixNewlibHorizonNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: FnCallback, value: COpaquePointer?): CInt =
    if (_unixNewlibHorizonNapiAddon != null) (_unixNewlibHorizonNapiAddon.libc_unix_newlib_horizon_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixNewlibHorizonNapiAddon != null) (_unixNewlibHorizonNapiAddon.libc_unix_newlib_horizon_pthreadAttrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixNewlibHorizonNapiAddon != null) (_unixNewlibHorizonNapiAddon.libc_unix_newlib_horizon_pthreadAttrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetprocessoridNp(attr: COpaquePointer?, processorId: COpaquePointer?): CInt =
    if (_unixNewlibHorizonNapiAddon != null) (_unixNewlibHorizonNapiAddon.libc_unix_newlib_horizon_pthreadAttrGetprocessoridNp((attr?.value ?: 0L).toString(), (processorId?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetprocessoridNp(attr: COpaquePointer?, processorId: CInt): CInt =
    if (_unixNewlibHorizonNapiAddon != null) (_unixNewlibHorizonNapiAddon.libc_unix_newlib_horizon_pthreadAttrSetprocessoridNp((attr?.value ?: 0L).toString(), processorId) as Int) else 0

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixNewlibHorizonNapiAddon != null) (_unixNewlibHorizonNapiAddon.libc_unix_newlib_horizon_pthreadGetschedparam(native.toLong().toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixNewlibHorizonNapiAddon != null) (_unixNewlibHorizonNapiAddon.libc_unix_newlib_horizon_pthreadSetschedparam(native.toLong().toString(), policy, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixNewlibHorizonNapiAddon != null) (_unixNewlibHorizonNapiAddon.libc_unix_newlib_horizon_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixNewlibHorizonNapiAddon != null) (_unixNewlibHorizonNapiAddon.libc_unix_newlib_horizon_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId.toString()) as Int) else 0

public actual fun pthreadGetprocessoridNp(): CInt =
    if (_unixNewlibHorizonNapiAddon != null) (_unixNewlibHorizonNapiAddon.libc_unix_newlib_horizon_pthreadGetprocessoridNp() as Int) else 0

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    if (_unixNewlibHorizonNapiAddon != null) (_unixNewlibHorizonNapiAddon.libc_unix_newlib_horizon_getrandom((buf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun gethostid(): CLong =
    if (_unixNewlibHorizonNapiAddon != null) (_unixNewlibHorizonNapiAddon.libc_unix_newlib_horizon_gethostid() as String).toLong() else 0L
