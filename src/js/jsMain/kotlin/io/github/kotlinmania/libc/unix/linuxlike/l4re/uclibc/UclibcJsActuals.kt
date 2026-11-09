@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.l4re.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.l4re.SocklenT

private val _unixLinuxlikeL4reUclibcNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockattrGetkindNp(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_pthreadRwlockattrGetkindNp((attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockattrSetkindNp(attr: COpaquePointer?, value: CInt): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_pthreadRwlockattrSetkindNp((attr?.value ?: 0L).toString(), value) as Int) else 0

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) as Int) else 0

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_getrlimit64(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_setrlimit64(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_getrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_setrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun getauxval(type: CUlong): CUlong =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_getauxval(type.toString()) as String).toULong() else 0uL
