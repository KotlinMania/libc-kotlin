@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_strerror_r(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_abs(i)

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_labs(i)

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_rand()

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_srand(seed)
}

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun setpwent() {
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_setpwent()
}

public actual fun endpwent() {
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_endpwent()
}

public actual fun getpwent(): Passwd? =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_shm_open(name, oflag, mode)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun errnoLocation(): CInt? =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_errno_location()?.let { COpaquePointer(it.toLong()) }

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_posix_fallocate(fd, offset, len)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_dup3(oldfd, newfd, flags)

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_nl_langinfo_l(item, locale.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun accept4(fd: CInt, addr: Sockaddr?, len: UInt?, flg: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_accept4(fd, addr?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), flg)

public actual fun getnameinfo(sa: Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_getloadavg(loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_mkfifoat(dirfd, pathname, mode)

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_glob(pattern, flags, errfunc?.value?.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_posix_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_shm_unlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: UInt?): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_nl_langinfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CUint, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun sync() {
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_sync()
}

public actual fun getpriority(which: CInt, who: IdT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_setpriority(which, who, prio)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun getgrgid(gid: GidT): Group? =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnam(name: String?): Group? =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_getgrnam_r(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libc_emscripten_mod_getgrgid_r(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())
