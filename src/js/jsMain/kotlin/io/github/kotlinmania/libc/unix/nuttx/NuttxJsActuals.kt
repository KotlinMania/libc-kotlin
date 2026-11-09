@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR

private val _unixNuttxNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun errno(): COpaquePointer? =
    if (_unixNuttxNapiAddon != null) (_unixNuttxNapiAddon.libc_unix_nuttx_errno() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun bind(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    if (_unixNuttxNapiAddon != null) (_unixNuttxNapiAddon.libc_unix_nuttx_bind(sockfd, (addr?.value ?: 0L).toString(), addrlen.toInt()) as Int) else 0

public actual fun ioctl(fd: Int, request: Int): Int =
    0

public actual fun dirfd(dirp: DIR?): Int =
    if (_unixNuttxNapiAddon != null) (_unixNuttxNapiAddon.libc_unix_nuttx_dirfd((dirp?.handle ?: 0L).toString()) as Int) else 0

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, srcAddr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    if (_unixNuttxNapiAddon != null) (_unixNuttxNapiAddon.libc_unix_nuttx_recvfrom(sockfd, (buf?.value ?: 0L).toString(), len.toString(), flags, (srcAddr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): Int =
    if (_unixNuttxNapiAddon != null) (_unixNuttxNapiAddon.libc_unix_nuttx_pthreadCreate((thread?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (arg?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGettime(clockid: ClockidT, tp: COpaquePointer?): Int =
    if (_unixNuttxNapiAddon != null) (_unixNuttxNapiAddon.libc_unix_nuttx_clockGettime(clockid, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun futimens(fd: Int, times: COpaquePointer?): Int =
    if (_unixNuttxNapiAddon != null) (_unixNuttxNapiAddon.libc_unix_nuttx_futimens(fd, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): Int =
    if (_unixNuttxNapiAddon != null) (_unixNuttxNapiAddon.libc_unix_nuttx_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) as Int) else 0

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): Int =
    if (_unixNuttxNapiAddon != null) (_unixNuttxNapiAddon.libc_unix_nuttx_pthreadSetnameNp(thread.toLong().toString(), name) as Int) else 0

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: ULong): Int =
    if (_unixNuttxNapiAddon != null) (_unixNuttxNapiAddon.libc_unix_nuttx_pthreadGetnameNp(thread.toLong().toString(), (name?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    if (_unixNuttxNapiAddon != null) (_unixNuttxNapiAddon.libc_unix_nuttx_getrandom((buf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun arc4random(): UInt =
    if (_unixNuttxNapiAddon != null) (_unixNuttxNapiAddon.libc_unix_nuttx_arc4random() as Int).toUInt() else 0u

public actual fun arc4randomBuf(bytes: COpaquePointer?, nbytes: ULong) {
    if (_unixNuttxNapiAddon != null) {
        _unixNuttxNapiAddon.libc_unix_nuttx_arc4randomBuf((bytes?.value ?: 0L).toString(), nbytes.toString())
    }
}
