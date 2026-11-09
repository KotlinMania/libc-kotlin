@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.SocklenT

private val _unixLinuxlikeLinuxUclibcNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockattrGetkindNp(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrGetkindNp((attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockattrSetkindNp(attr: COpaquePointer?, value: CInt): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrSetkindNp((attr?.value ?: 0L).toString(), value) as Int) else 0

public actual fun ptrace(request: CUint): CLong =
    0L

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_sendmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags) as Int) else 0

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_recvmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags, (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) as Int) else 0

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun sethostid(hostid: CLong): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_sethostid(hostid.toString()) as Int) else 0

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_fanotifyMark(fd, flags.toInt(), mask.toString(), dirfd, path) as Int) else 0

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_getrlimit64(resource.toString(), (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_setrlimit64(resource.toString(), (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_getrlimit(resource.toString(), (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_setrlimit(resource.toString(), (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_getpriority(which.toInt(), who.toInt()) as Int) else 0

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_setpriority(which.toInt(), who.toInt(), prio) as Int) else 0

public actual fun getauxval(type: CUlong): CUlong =
    if (_unixLinuxlikeLinuxUclibcNapiAddon != null) (_unixLinuxlikeLinuxUclibcNapiAddon.libc_unix_linuxlike_linux_uclibc_getauxval(type.toString()) as String).toULong() else 0uL
