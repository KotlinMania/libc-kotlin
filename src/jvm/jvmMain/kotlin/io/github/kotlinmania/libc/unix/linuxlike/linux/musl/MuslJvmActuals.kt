@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.Tm
import io.github.kotlinmania.libc.unix.linuxlike.linux.PosixSpawnFileActionsT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeLinuxMuslJniBridge {
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
        val stream = UnixLinuxlikeLinuxMuslJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixLinuxlikeLinuxMuslGetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslSetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslPrlimit(pid: Int, resource: Int, newLimit: Long, oldLimit: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslPtrace(request: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslSetpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslFanotifyMark(fd: Int, flags: Int, mask: Long, dirfd: Int, path: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslPreadv2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslPwritev2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslGetauxval(type: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslExplicitBzero(s: Long, len: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslReallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslAdjtimex(buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslClockAdjtime(clkId: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslCtermid(s: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslMemfdCreate(name: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslMlock2(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslMallocUsableSize(ptr: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslEuidaccess(pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslEaccess(pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslAsctimeR(tm: Long, buf: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslDirname(path: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslBasename(path: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslGetrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddchdirNp(actions: Long, path: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddfchdirNp(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslGetutxent(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslGetutxid(ut: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslGetutxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslPututxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslSetutxent()

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslEndutxent()

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslUtmpxname(file: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslPthreadTryjoinNp(thread: Long, retval: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMuslPthreadTimedjoinNp(thread: Long, retval: Long, abstime: Long): Int
}

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslGetrlimit(resource, rlim.rawAddress)

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslSetrlimit(resource, rlim.rawAddress)

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: ConstPtr<Rlimit>, oldLimit: MutPtr<Rlimit>): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslPrlimit(pid, resource, newLimit.rawAddress, oldLimit.rawAddress)

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslPtrace(request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslGetpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslSetpriority(which, who.toInt(), prio)

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: ConstPtr<CChar>): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslFanotifyMark(fd, flags.toInt(), mask.toLong(), dirfd, path.rawAddress)

public actual fun preadv2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslPreadv2(fd, iov.rawAddress, iovcnt, offset, flags)

public actual fun pwritev2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslPwritev2(fd, iov.rawAddress, iovcnt, offset, flags)

public actual fun getauxval(type: CUlong): CUlong =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslGetauxval(type.toLong()).toULong()

public actual fun explicitBzero(s: MutPtr<CVoid>, len: SizeT) {
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslExplicitBzero(s.rawAddress, len.toLong())
}

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslReallocarray(ptr.rawAddress, nmemb.toLong(), size.toLong()))

public actual fun adjtimex(buf: MutPtr<Timex>): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslAdjtimex(buf.rawAddress)

public actual fun clockAdjtime(clkId: ClockidT, buf: MutPtr<Timex>): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslClockAdjtime(clkId, buf.rawAddress)

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslCtermid(s.rawAddress))

public actual fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslMemfdCreate(name.rawAddress, flags.toInt())

public actual fun mlock2(addr: ConstPtr<CVoid>, len: SizeT, flags: CUint): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslMlock2(addr.rawAddress, len.toLong(), flags.toInt())

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslMallocUsableSize(ptr.rawAddress).toULong()

public actual fun euidaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslEuidaccess(pathname.rawAddress, mode)

public actual fun eaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslEaccess(pathname.rawAddress, mode)

public actual fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslAsctimeR(tm.rawAddress, buf.rawAddress))

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslDirname(path.rawAddress))

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslBasename(path.rawAddress))

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslGetrandom(buf.rawAddress, buflen.toLong(), flags.toInt())

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddchdirNp(actions.rawAddress, path.rawAddress)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddfchdirNp(actions.rawAddress, fd)

public actual fun getutxent(): MutPtr<Utmpx> =
    MutPtr(UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslGetutxent())

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslGetutxid(ut.rawAddress))

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslGetutxline(ut.rawAddress))

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslPututxline(ut.rawAddress))

public actual fun setutxent() {
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslSetutxent()
}

public actual fun endutxent() {
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslEndutxent()
}

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslUtmpxname(file.rawAddress)

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslPthreadTryjoinNp(thread.rawAddress, retval.rawAddress)

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>, abstime: ConstPtr<Timespec>): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libcUnixLinuxlikeLinuxMuslPthreadTimedjoinNp(thread.rawAddress, retval.rawAddress, abstime.rawAddress)
