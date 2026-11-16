@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenAbs
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenAccept4
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenDup3
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenEndpwent
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenErrnoLocation
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenGetentropy
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenGetgrgid
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenGetgrgidR
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenGetgrnam
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenGetgrnamR
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenGetloadavg
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenGetnameinfo
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenGetpriority
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenGetpwent
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenGetrlimit
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenGettimeofday
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenGlob
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenGlobfree
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenIoctl
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenLabs
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenMadvise
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenMkfifoat
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenMkstemps
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenMprotect
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenMremap
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenMsync
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenNlLanginfo
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenNlLanginfoL
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenPosixFallocate
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenPosixMadvise
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenPreadv
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenPwritev
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenRand
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenRecvfrom
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenRecvmmsg
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenSeekdir
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenSendmmsg
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenSetpriority
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenSetpwent
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenSetrlimit
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenShmOpen
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenShmUnlink
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenSrand
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenStrerrorR
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenSync
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.cinterop.libcUnixLinuxlikeEmscriptenTelldir
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    libcUnixLinuxlikeEmscriptenGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    libcUnixLinuxlikeEmscriptenSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    libcUnixLinuxlikeEmscriptenStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun abs(i: CInt): CInt =
    libcUnixLinuxlikeEmscriptenAbs(i)

public actual fun labs(i: CLong): CLong =
    libcUnixLinuxlikeEmscriptenLabs(i)

public actual fun rand(): CInt =
    libcUnixLinuxlikeEmscriptenRand()

public actual fun srand(seed: CUint) {
    libcUnixLinuxlikeEmscriptenSrand(seed)
}

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    libcUnixLinuxlikeEmscriptenGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun setpwent() {
    libcUnixLinuxlikeEmscriptenSetpwent()
}

public actual fun endpwent() {
    libcUnixLinuxlikeEmscriptenEndpwent()
}

public actual fun getpwent(): MutPtr =
    MutPtr(libcUnixLinuxlikeEmscriptenGetpwent()?.toLong() ?: 0L)

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    libcUnixLinuxlikeEmscriptenShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    libcUnixLinuxlikeEmscriptenMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun errnoLocation(): MutPtr =
    MutPtr(libcUnixLinuxlikeEmscriptenErrnoLocation()?.toLong() ?: 0L)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libcUnixLinuxlikeEmscriptenPosixFallocate(fd, offset, len)

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixLinuxlikeEmscriptenPwritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixLinuxlikeEmscriptenPreadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    libcUnixLinuxlikeEmscriptenDup3(oldfd, newfd, flags)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    MutPtr(libcUnixLinuxlikeEmscriptenNlLanginfoL(item, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun accept4(fd: CInt, addr: MutPtr, len: MutPtr, flg: CInt): CInt =
    libcUnixLinuxlikeEmscriptenAccept4(fd, addr.rawAddress.toCPointer<ByteVar>(), len.rawAddress.toCPointer<ByteVar>(), flg)

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    libcUnixLinuxlikeEmscriptenGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    libcUnixLinuxlikeEmscriptenGetloadavg(loadavg.rawAddress.toCPointer<ByteVar>(), nelem)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    libcUnixLinuxlikeEmscriptenMkfifoat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun mremap(addr: MutPtr, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(libcUnixLinuxlikeEmscriptenMremap(addr.rawAddress.toCPointer<ByteVar>(), len, newLen, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    libcUnixLinuxlikeEmscriptenGlob(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree(pglob: MutPtr) {
    libcUnixLinuxlikeEmscriptenGlobfree(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    libcUnixLinuxlikeEmscriptenPosixMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun shmUnlink(name: ConstPtr): CInt =
    libcUnixLinuxlikeEmscriptenShmUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    libcUnixLinuxlikeEmscriptenSeekdir(dirp.rawAddress.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: MutPtr): CLong =
    libcUnixLinuxlikeEmscriptenTelldir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    libcUnixLinuxlikeEmscriptenMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    libcUnixLinuxlikeEmscriptenMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    libcUnixLinuxlikeEmscriptenRecvfrom(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    libcUnixLinuxlikeEmscriptenMkstemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen)

public actual fun nlLanginfo(item: NlItem): MutPtr =
    MutPtr(libcUnixLinuxlikeEmscriptenNlLanginfo(item)?.toLong() ?: 0L)

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint): CInt =
    libcUnixLinuxlikeEmscriptenSendmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint, timeout: MutPtr): CInt =
    libcUnixLinuxlikeEmscriptenRecvmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun sync() {
    libcUnixLinuxlikeEmscriptenSync()
}

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libcUnixLinuxlikeEmscriptenIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libcUnixLinuxlikeEmscriptenGetpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libcUnixLinuxlikeEmscriptenSetpriority(which, who, prio)

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    libcUnixLinuxlikeEmscriptenGetentropy(buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun getgrgid(gid: GidT): MutPtr =
    MutPtr(libcUnixLinuxlikeEmscriptenGetgrgid(gid)?.toLong() ?: 0L)

public actual fun getgrnam(name: ConstPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeEmscriptenGetgrnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixLinuxlikeEmscriptenGetgrnamR(name.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixLinuxlikeEmscriptenGetgrgidR(gid, grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())
