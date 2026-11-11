@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_abs
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_accept4
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_dup3
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_endpwent
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_errnoLocation
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getentropy
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getgrgid
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getgrgidR
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getgrnam
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getgrnamR
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getloadavg
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getnameinfo
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getpriority
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getpwent
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_getrlimit
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_gettimeofday
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_glob
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_globfree
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_ioctl
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_labs
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_madvise
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_mkfifoat
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_mkstemps
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_mprotect
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_mremap
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_msync
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_nlLanginfo
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_nlLanginfoL
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_posixFallocate
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_posixMadvise
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_preadv
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_pwritev
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_rand
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_recvfrom
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_recvmmsg
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_seekdir
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_sendmmsg
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_setpriority
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_setpwent
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_setrlimit
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_shmOpen
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_shmUnlink
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_srand
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_strerrorR
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_sync
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_unix_linuxlike_emscripten_telldir
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    libc_unix_linuxlike_emscripten_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    libc_unix_linuxlike_emscripten_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_unix_linuxlike_emscripten_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun abs(i: CInt): CInt =
    libc_unix_linuxlike_emscripten_abs(i)

public actual fun labs(i: CLong): CLong =
    libc_unix_linuxlike_emscripten_labs(i)

public actual fun rand(): CInt =
    libc_unix_linuxlike_emscripten_rand()

public actual fun srand(seed: CUint) {
    libc_unix_linuxlike_emscripten_srand(seed)
}

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    libc_unix_linuxlike_emscripten_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun setpwent() {
    libc_unix_linuxlike_emscripten_setpwent()
}

public actual fun endpwent() {
    libc_unix_linuxlike_emscripten_endpwent()
}

public actual fun getpwent(): COpaquePointer? =
    libc_unix_linuxlike_emscripten_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    libc_unix_linuxlike_emscripten_shmOpen(name, oflag, mode)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    libc_unix_linuxlike_emscripten_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun errnoLocation(): COpaquePointer? =
    libc_unix_linuxlike_emscripten_errnoLocation()?.let { COpaquePointer(it.toLong()) }

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libc_unix_linuxlike_emscripten_posixFallocate(fd, offset, len)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    libc_unix_linuxlike_emscripten_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    libc_unix_linuxlike_emscripten_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    libc_unix_linuxlike_emscripten_dup3(oldfd, newfd, flags)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    libc_unix_linuxlike_emscripten_nlLanginfoL(item, locale?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    libc_unix_linuxlike_emscripten_accept4(fd, addr?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), flg)

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    libc_unix_linuxlike_emscripten_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    libc_unix_linuxlike_emscripten_getloadavg(loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    libc_unix_linuxlike_emscripten_mkfifoat(dirfd, pathname, mode)

public actual fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    libc_unix_linuxlike_emscripten_mremap(addr?.value?.toCPointer<ByteVar>(), len, newLen, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.let { COpaquePointer(it.toLong()) }

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    libc_unix_linuxlike_emscripten_glob(pattern, flags, 0L.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: COpaquePointer?) {
    libc_unix_linuxlike_emscripten_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    libc_unix_linuxlike_emscripten_posixMadvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun shmUnlink(name: String?): CInt =
    libc_unix_linuxlike_emscripten_shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    libc_unix_linuxlike_emscripten_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    libc_unix_linuxlike_emscripten_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    libc_unix_linuxlike_emscripten_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    libc_unix_linuxlike_emscripten_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    libc_unix_linuxlike_emscripten_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    libc_unix_linuxlike_emscripten_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    libc_unix_linuxlike_emscripten_nlLanginfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint): CInt =
    libc_unix_linuxlike_emscripten_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint, timeout: COpaquePointer?): CInt =
    libc_unix_linuxlike_emscripten_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun sync() {
    libc_unix_linuxlike_emscripten_sync()
}

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libc_unix_linuxlike_emscripten_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libc_unix_linuxlike_emscripten_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libc_unix_linuxlike_emscripten_setpriority(which, who, prio)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_unix_linuxlike_emscripten_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    libc_unix_linuxlike_emscripten_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnam(name: String?): COpaquePointer? =
    libc_unix_linuxlike_emscripten_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_linuxlike_emscripten_getgrnamR(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_linuxlike_emscripten_getgrgidR(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())
