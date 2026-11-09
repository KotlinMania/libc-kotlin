@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT

private val _unixNewlibRtemsNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixNewlibRtemsNapiAddon != null) (_unixNewlibRtemsNapiAddon.libc_unix_newlib_rtems_futimens(fd, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixNewlibRtemsNapiAddon != null) (_unixNewlibRtemsNapiAddon.libc_unix_newlib_rtems_writev(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else 0L

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixNewlibRtemsNapiAddon != null) (_unixNewlibRtemsNapiAddon.libc_unix_newlib_rtems_readv(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else 0L

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: FnCallback, value: COpaquePointer?): CInt =
    if (_unixNewlibRtemsNapiAddon != null) (_unixNewlibRtemsNapiAddon.libc_unix_newlib_rtems_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixNewlibRtemsNapiAddon != null) (_unixNewlibRtemsNapiAddon.libc_unix_newlib_rtems_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId.toString()) as Int) else 0

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixNewlibRtemsNapiAddon != null) (_unixNewlibRtemsNapiAddon.libc_unix_newlib_rtems_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
    if (_unixNewlibRtemsNapiAddon != null) {
        _unixNewlibRtemsNapiAddon.libc_unix_newlib_rtems_arc4randomBuf((buf?.value ?: 0L).toString(), nbytes.toString())
    }
}

public actual fun setgroups(ngroups: CInt, grouplist: COpaquePointer?): CInt =
    if (_unixNewlibRtemsNapiAddon != null) (_unixNewlibRtemsNapiAddon.libc_unix_newlib_rtems_setgroups(ngroups, (grouplist?.value ?: 0L).toString()) as Int) else 0
