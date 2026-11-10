@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*
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

private object UnixLinuxlikeEmscriptenJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_getrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_setrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_strerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_abs(i: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_labs(i: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_rand(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_srand(seed: Int)

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_setpwent()

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_endpwent()

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_getpwent(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_shmOpen(name: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_errnoLocation(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_posixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_dup3(oldfd: Int, newfd: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_nlLanginfoL(item: Int, locale: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_accept4(fd: Int, addr: Long, len: Long, flg: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_getloadavg(loadavg: Long, nelem: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_mremap(addr: Long, len: Long, newLen: Long, flags: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_globfree(pglob: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_posixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_shmUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_seekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_telldir(dirp: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_madvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_msync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_mkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_nlLanginfo(item: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_sendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_recvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_sync()

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_ioctl(fd: Int, request: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_getpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_setpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_getentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_getgrgid(gid: Short): Long

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_getgrnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_emscripten_getgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int
}

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_getrlimit(resource, (rlim?.value ?: 0L))

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_setrlimit(resource, (rlim?.value ?: 0L))

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_strerrorR(errnum, (buf?.value ?: 0L), buflen.toLong())

public actual fun abs(i: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_abs(i)

public actual fun labs(i: CLong): CLong =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_labs(i)

public actual fun rand(): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_rand()

public actual fun srand(seed: CUint) {
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_srand(seed.toInt())
}

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun setpwent() {
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_setpwent()
}

public actual fun endpwent() {
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_endpwent()
}

public actual fun getpwent(): COpaquePointer? =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_getpwent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_shmOpen(name, oflag, mode.toInt())

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun errnoLocation(): COpaquePointer? =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_errnoLocation().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_posixFallocate(fd, offset, len)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_pwritev(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_preadv(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_dup3(oldfd, newfd, flags)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_nlLanginfoL(item, (locale?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_accept4(fd, (addr?.value ?: 0L), (len?.value ?: 0L), flg)

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_getnameinfo((sa?.value ?: 0L), salen.toInt(), (host?.value ?: 0L), hostlen.toInt(), (serv?.value ?: 0L), servlen.toInt(), flags)

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_getloadavg((loadavg?.value ?: 0L), nelem)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_mkfifoat(dirfd, pathname, mode.toInt())

public actual fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_mremap((addr?.value ?: 0L), len.toLong(), newLen.toLong(), flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_glob(pattern, flags, 0L, (pglob?.value ?: 0L))

public actual fun globfree(pglob: COpaquePointer?) {
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_globfree((pglob?.value ?: 0L))
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_posixMadvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun shmUnlink(name: String?): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_seekdir((dirp?.handle ?: 0L), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_telldir((dirp?.handle ?: 0L))

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_madvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_msync((addr?.value ?: 0L), len.toLong(), flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_recvfrom(socket, (buf?.value ?: 0L), len.toLong(), flags, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_mkstemps((template?.value ?: 0L), suffixlen)

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_sendmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toInt(), flags.toInt())

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint, timeout: COpaquePointer?): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_recvmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toInt(), flags.toInt(), (timeout?.value ?: 0L))

public actual fun sync() {
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_sync()
}

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_getpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_setpriority(which, who.toInt(), prio)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_getentropy((buf?.value ?: 0L), buflen.toLong())

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_getgrgid(gid.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getgrnam(name: String?): COpaquePointer? =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_getgrnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_getgrnamR(name, (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libc_unix_linuxlike_emscripten_getgrgidR(gid.toShort(), (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))
