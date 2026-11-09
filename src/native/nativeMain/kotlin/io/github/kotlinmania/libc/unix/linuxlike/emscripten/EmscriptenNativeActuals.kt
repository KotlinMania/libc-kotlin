@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_abs(i)

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_labs(i)

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_rand()

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_srand(seed)
}

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun setpwent() {
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_setpwent()
}

public actual fun endpwent() {
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_endpwent()
}

public actual fun getpwent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_shmOpen(name, oflag, mode)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun errnoLocation(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_errnoLocation()?.let { COpaquePointer(it.toLong()) }

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_posixFallocate(fd, offset, len)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_dup3(oldfd, newfd, flags)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_nlLanginfoL(item, locale?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_accept4(fd, addr?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), flg)

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getloadavg(loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_mkfifoat(dirfd, pathname, mode)

public actual fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_glob(pattern, flags, 0L.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_posixMadvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_nlLanginfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun sync() {
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_sync()
}

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun getpriority(which: CInt, who: IdT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_setpriority(which, who, prio)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnam(name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getgrnamR(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getgrgidR(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())
