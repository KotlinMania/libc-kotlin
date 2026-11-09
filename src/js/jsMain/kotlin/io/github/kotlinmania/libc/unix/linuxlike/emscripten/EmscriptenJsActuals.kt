@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.IdT

private val _unixLinuxlikeEmscriptenNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_getrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_setrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun abs(i: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_abs(i) as Int) else 0

public actual fun labs(i: CLong): CLong =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_labs(i.toString()) as String).toLong() else 0L

public actual fun rand(): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_rand() as Int) else 0

public actual fun srand(seed: CUint) {
    if (_unixLinuxlikeEmscriptenNapiAddon != null) {
        _unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_srand(seed.toInt())
    }
}

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun setpwent() {
    if (_unixLinuxlikeEmscriptenNapiAddon != null) {
        _unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_setpwent()
    }
}

public actual fun endpwent() {
    if (_unixLinuxlikeEmscriptenNapiAddon != null) {
        _unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_endpwent()
    }
}

public actual fun getpwent(): COpaquePointer? =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_getpwent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_shmOpen(name, oflag, mode.toInt()) as Int) else 0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else 0

public actual fun errnoLocation(): COpaquePointer? =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_errnoLocation() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_posixFallocate(fd, offset.toString(), len.toString()) as Int) else 0

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_dup3(oldfd, newfd, flags) as Int) else 0

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_nlLanginfoL(item, (locale?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_accept4(fd, (addr?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), flg) as Int) else 0

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) as Int) else 0

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_getloadavg((loadavg?.value ?: 0L).toString(), nelem) as Int) else 0

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_mkfifoat(dirfd, pathname, mode.toInt()) as Int) else 0

public actual fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) as Int) else 0

public actual fun globfree(pglob: COpaquePointer?) {
    if (_unixLinuxlikeEmscriptenNapiAddon != null) {
        _unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_globfree((pglob?.value ?: 0L).toString())
    }
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else 0

public actual fun shmUnlink(name: String?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_shmUnlink(name) as Int) else 0

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixLinuxlikeEmscriptenNapiAddon != null) {
        _unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_telldir((dirp?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else 0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_msync((addr?.value ?: 0L).toString(), len.toString(), flags) as Int) else 0

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_mkstemps((template?.value ?: 0L).toString(), suffixlen) as Int) else 0

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_nlLanginfo(item) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_sendmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags.toInt()) as Int) else 0

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint, timeout: COpaquePointer?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_recvmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags.toInt(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun sync() {
    if (_unixLinuxlikeEmscriptenNapiAddon != null) {
        _unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_sync()
    }
}

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_getpriority(which, who.toInt()) as Int) else 0

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_setpriority(which, who.toInt(), prio) as Int) else 0

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_getgrgid(gid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_getgrnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAddon != null) (_unixLinuxlikeEmscriptenNapiAddon.libc_unix_linuxlike_emscripten_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0
