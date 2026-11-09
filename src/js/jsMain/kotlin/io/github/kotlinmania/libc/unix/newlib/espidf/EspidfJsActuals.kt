@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

private val _unixNewlibEspidfNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixNewlibEspidfNapiAddon != null) (_unixNewlibEspidfNapiAddon.libc_unix_newlib_espidf_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    if (_unixNewlibEspidfNapiAddon != null) (_unixNewlibEspidfNapiAddon.libc_unix_newlib_espidf_getrandom((buf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun gethostname(name: COpaquePointer?, namelen: SsizeT) {
    if (_unixNewlibEspidfNapiAddon != null) {
        _unixNewlibEspidfNapiAddon.libc_unix_newlib_espidf_gethostname((name?.value ?: 0L).toString(), namelen.toString())
    }
}

public actual fun sendmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixNewlibEspidfNapiAddon != null) (_unixNewlibEspidfNapiAddon.libc_unix_newlib_espidf_sendmsg(s, (msg?.value ?: 0L).toString(), flags) as String).toLong() else 0L

public actual fun recvmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixNewlibEspidfNapiAddon != null) (_unixNewlibEspidfNapiAddon.libc_unix_newlib_espidf_recvmsg(s, (msg?.value ?: 0L).toString(), flags) as String).toLong() else 0L

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (_unixNewlibEspidfNapiAddon != null) (_unixNewlibEspidfNapiAddon.libc_unix_newlib_espidf_eventfd(initval.toInt(), flags) as Int) else 0
