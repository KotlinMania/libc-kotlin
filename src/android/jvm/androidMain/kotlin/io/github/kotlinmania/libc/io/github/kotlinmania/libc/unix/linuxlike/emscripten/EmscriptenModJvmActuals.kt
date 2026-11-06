package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.COpaquePointer

internal object EmscriptenModRawLibc {
    external fun getrlimit(resource: Int, rlim: Long): Int
    external fun setrlimit(resource: Int, rlim: Long): Int
    external fun strerrorR(errnum: Int, buf: Long, buflen: Long): Int
    external fun abs(i: Int): Int
    external fun labs(i: Long): Long
    external fun rand(): Int
    external fun srand(seed: Int)
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun setpwent()
    external fun endpwent()
    external fun getpwent(): Long?
    external fun shmOpen(name: String?, oflag: Int, mode: Int): Int
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun errnoLocation(): Long?
    external fun posixFallocate(fd: Int, offset: Long, len: Long): Int
    external fun pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun dup3(oldfd: Int, newfd: Int, flags: Int): Int
    external fun nlLanginfoL(item: Long, locale: Long): Long?
    external fun accept4(fd: Int, addr: Long, len: Long, flg: Int): Int
    external fun getnameinfo(sa: Long, salen: Long, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int
    external fun getloadavg(loadavg: Long, nelem: Int): Int
    external fun mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int
    external fun glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int
    external fun globfree(pglob: Long)
    external fun posixMadvise(addr: Long, len: Long, advice: Int): Int
    external fun shmUnlink(name: String?): Int
    external fun seekdir(dirp: Long, loc: Long)
    external fun telldir(dirp: Long): Long
    external fun madvise(addr: Long, len: Long, advice: Int): Int
    external fun msync(addr: Long, len: Long, flags: Int): Int
    external fun recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long
    external fun mkstemps(template: Long, suffixlen: Int): Int
    external fun nlLanginfo(item: Long): Long?
    external fun sendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int
    external fun recvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int
    external fun sync()
    external fun getpriority(which: Int, who: Long): Int
    external fun setpriority(which: Int, who: Long, prio: Int): Int
    external fun getentropy(buf: Long, buflen: Long): Int
    external fun getgrgid(gid: Int): Long?
    external fun getgrnam(name: String?): Long?
    external fun getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int
}

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    EmscriptenModRawLibc.getrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    EmscriptenModRawLibc.setrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    EmscriptenModRawLibc.strerrorR(errnum, buf?.value ?: 0L, buflen)

public actual fun abs(i: CInt): CInt =
    EmscriptenModRawLibc.abs(i)

public actual fun labs(i: CLong): CLong =
    EmscriptenModRawLibc.labs(i)

public actual fun rand(): CInt =
    EmscriptenModRawLibc.rand()

public actual fun srand(seed: CUint) {
    EmscriptenModRawLibc.srand(seed)
}

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    EmscriptenModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun setpwent() {
    EmscriptenModRawLibc.setpwent()
}

public actual fun endpwent() {
    EmscriptenModRawLibc.endpwent()
}

public actual fun getpwent(): Passwd? =
    EmscriptenModRawLibc.getpwent()

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    EmscriptenModRawLibc.shmOpen(name, oflag, mode)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    EmscriptenModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun errnoLocation(): CInt? =
    EmscriptenModRawLibc.errnoLocation()

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    EmscriptenModRawLibc.posixFallocate(fd, offset, len)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    EmscriptenModRawLibc.pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    EmscriptenModRawLibc.preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    EmscriptenModRawLibc.dup3(oldfd, newfd, flags)

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: LocaleT): COpaquePointer? =
    EmscriptenModRawLibc.nlLanginfoL(item, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun accept4(fd: CInt, addr: Sockaddr?, len: UInt?, flg: CInt): CInt =
    EmscriptenModRawLibc.accept4(fd, addr?.toLong() ?: 0L, len?.toLong() ?: 0L, flg)

public actual fun getnameinfo(sa: Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    EmscriptenModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    EmscriptenModRawLibc.getloadavg(loadavg?.toLong() ?: 0L, nelem)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    EmscriptenModRawLibc.mkfifoat(dirfd, pathname, mode)

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    EmscriptenModRawLibc.glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    EmscriptenModRawLibc.globfree(pglob?.toLong() ?: 0L)
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    EmscriptenModRawLibc.posixMadvise(addr?.value ?: 0L, len, advice)

public actual fun shmUnlink(name: String?): CInt =
    EmscriptenModRawLibc.shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    EmscriptenModRawLibc.seekdir(dirp?.toLong() ?: 0L, loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    EmscriptenModRawLibc.telldir(dirp?.toLong() ?: 0L)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    EmscriptenModRawLibc.madvise(addr?.value ?: 0L, len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    EmscriptenModRawLibc.msync(addr?.value ?: 0L, len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: UInt?): SsizeT =
    EmscriptenModRawLibc.recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    EmscriptenModRawLibc.mkstemps(template?.value ?: 0L, suffixlen)

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    EmscriptenModRawLibc.nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CUint): CInt =
    EmscriptenModRawLibc.sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CUint, timeout: Timespec?): CInt =
    EmscriptenModRawLibc.recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)

public actual fun sync() {
    EmscriptenModRawLibc.sync()
}

public actual fun getpriority(which: CInt, who: IdT): CInt =
    EmscriptenModRawLibc.getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    EmscriptenModRawLibc.setpriority(which, who, prio)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    EmscriptenModRawLibc.getentropy(buf?.value ?: 0L, buflen)

public actual fun getgrgid(gid: GidT): Group? =
    EmscriptenModRawLibc.getgrgid(gid)

public actual fun getgrnam(name: String?): Group? =
    EmscriptenModRawLibc.getgrnam(name)

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    EmscriptenModRawLibc.getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    EmscriptenModRawLibc.getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)
