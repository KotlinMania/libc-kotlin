@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeEmscriptenJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "libc_jni.dll"
                "macos" -> "liblibc_jni.dylib"
                else -> "liblibc_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/libc/native/$hostPlatform-$hostArch/$libFileName"
        val stream = UnixLinuxlikeEmscriptenJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("libc_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenGetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenSetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenAbs(i: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenLabs(i: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenRand(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenSrand(seed: Int)

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenSetpwent()

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenEndpwent()

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenGetpwent(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenShmOpen(name: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenErrnoLocation(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenPosixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenPwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenPreadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenDup3(oldfd: Int, newfd: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenNlLanginfoL(item: Int, locale: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenAccept4(fd: Int, addr: Long, len: Long, flg: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenGetloadavg(loadavg: Long, nelem: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenMkfifoat(dirfd: Int, pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenMremap(addr: Long, len: Long, newLen: Long, flags: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenGlob(pattern: Long, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenGlobfree(pglob: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenPosixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenShmUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenSeekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenTelldir(dirp: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenMsync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenRecvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenMkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenNlLanginfo(item: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenSendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenRecvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenSync()

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenIoctl(fd: Int, request: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenSetpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenGetentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenGetgrgid(gid: Short): Long

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenGetgrnam(name: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenGetgrnamR(name: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeEmscriptenGetgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int
}

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenGetrlimit(resource, rlim.rawAddress)

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenSetrlimit(resource, rlim.rawAddress)

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun abs(i: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenAbs(i)

public actual fun labs(i: CLong): CLong =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenLabs(i)

public actual fun rand(): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenRand()

public actual fun srand(seed: CUint) {
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenSrand(seed.toInt())
}

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun setpwent() {
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenSetpwent()
}

public actual fun endpwent() {
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenEndpwent()
}

public actual fun getpwent(): MutPtr =
    MutPtr(UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenGetpwent())

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenShmOpen(name.rawAddress, oflag, mode.toInt())

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun errnoLocation(): MutPtr =
    MutPtr(UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenErrnoLocation())

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenPosixFallocate(fd, offset, len)

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenPwritev(fd, iov.rawAddress, iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenPreadv(fd, iov.rawAddress, iovcnt, offset)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenDup3(oldfd, newfd, flags)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    MutPtr(UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenNlLanginfoL(item, locale.rawAddress))

public actual fun accept4(fd: CInt, addr: MutPtr, len: MutPtr, flg: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenAccept4(fd, addr.rawAddress, len.rawAddress, flg)

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toInt(), serv.rawAddress, servlen.toInt(), flags)

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenGetloadavg(loadavg.rawAddress, nelem)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenMkfifoat(dirfd, pathname.rawAddress, mode.toInt())

public actual fun mremap(addr: MutPtr, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenMremap(addr.rawAddress, len.toLong(), newLen.toLong(), flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenGlob(pattern.rawAddress, flags, 0L, pglob.rawAddress)

public actual fun globfree(pglob: MutPtr) {
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenGlobfree(pglob.rawAddress)
}

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenPosixMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun shmUnlink(name: ConstPtr): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenShmUnlink(name.rawAddress)

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenSeekdir(dirp.rawAddress, loc)
}

public actual fun telldir(dirp: MutPtr): CLong =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenTelldir(dirp.rawAddress)

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenMsync(addr.rawAddress, len.toLong(), flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenRecvfrom(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.rawAddress)

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenMkstemps(template.rawAddress, suffixlen)

public actual fun nlLanginfo(item: NlItem): MutPtr =
    MutPtr(UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenNlLanginfo(item))

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenSendmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags.toInt())

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint, timeout: MutPtr): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenRecvmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags.toInt(), timeout.rawAddress)

public actual fun sync() {
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenSync()
}

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenGetpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenSetpriority(which, who.toInt(), prio)

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenGetentropy(buf.rawAddress, buflen.toLong())

public actual fun getgrgid(gid: GidT): MutPtr =
    MutPtr(UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenGetgrgid(gid.toShort()))

public actual fun getgrnam(name: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenGetgrnam(name.rawAddress))

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenGetgrnamR(name.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixLinuxlikeEmscriptenJniBridge.libcUnixLinuxlikeEmscriptenGetgrgidR(gid.toShort(), grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)
