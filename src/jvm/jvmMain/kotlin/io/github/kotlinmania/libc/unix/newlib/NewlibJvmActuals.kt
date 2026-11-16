@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixNewlibJniBridge {
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
        val stream = UnixNewlibJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixNewlibGetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixNewlibSetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixNewlibStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixNewlibSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcUnixNewlibSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixNewlibAbs(i: Int): Int

    @JvmStatic
    external fun libcUnixNewlibLabs(i: Long): Long

    @JvmStatic
    external fun libcUnixNewlibRand(): Int

    @JvmStatic
    external fun libcUnixNewlibSrand(seed: Int)

    @JvmStatic
    external fun libcUnixNewlibBind(fd: Int, addr: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixNewlibClockSettime(clockId: Long, tp: Long): Int

    @JvmStatic
    external fun libcUnixNewlibClockGettime(clockId: Long, tp: Long): Int

    @JvmStatic
    external fun libcUnixNewlibClockGetres(clockId: Long, res: Long): Int

    @JvmStatic
    external fun libcUnixNewlibClosesocket(sockfd: Int): Int

    @JvmStatic
    external fun libcUnixNewlibIoctl(fd: Int, request: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixNewlibRecvfrom(fd: Int, buf: Long, n: Long, flags: Int, addr: Long, addrLen: Long): Long

    @JvmStatic
    external fun libcUnixNewlibGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixNewlibMemalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixNewlibFexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixNewlibGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixNewlibGetgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixNewlibSigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libcUnixNewlibSemClose(sem: Long): Int

    @JvmStatic
    external fun libcUnixNewlibGetdtablesize(): Int

    @JvmStatic
    external fun libcUnixNewlibGetgrnamR(name: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixNewlibPthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcUnixNewlibSemOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixNewlibGetgrnam(name: Long): Long

    @JvmStatic
    external fun libcUnixNewlibPthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libcUnixNewlibSemUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixNewlibDaemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libcUnixNewlibGetpwnamR(name: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixNewlibGetpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixNewlibSigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libcUnixNewlibPthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libcUnixNewlibGetgrgid(gid: Short): Long

    @JvmStatic
    external fun libcUnixNewlibPopen(command: Long, mode: Long): Long

    @JvmStatic
    external fun libcUnixNewlibUname(buf: Long): Int
}

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGetrlimit(resource, rlim.rawAddress)

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibSetrlimit(resource, rlim.rawAddress)

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    UnixNewlibJniBridge.libcUnixNewlibStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun semDestroy(sem: MutPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibSemDestroy(sem.rawAddress)

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    UnixNewlibJniBridge.libcUnixNewlibSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun abs(i: CInt): CInt =
    UnixNewlibJniBridge.libcUnixNewlibAbs(i)

public actual fun labs(i: CLong): CLong =
    UnixNewlibJniBridge.libcUnixNewlibLabs(i)

public actual fun rand(): CInt =
    UnixNewlibJniBridge.libcUnixNewlibRand()

public actual fun srand(seed: CUint) {
    UnixNewlibJniBridge.libcUnixNewlibSrand(seed.toInt())
}

public actual fun bind(fd: CInt, addr: ConstPtr, len: SocklenT): CInt =
    UnixNewlibJniBridge.libcUnixNewlibBind(fd, addr.rawAddress, len.toInt())

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibClockSettime(clockId.toLong(), tp.rawAddress)

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibClockGettime(clockId.toLong(), tp.rawAddress)

public actual fun clockGetres(clockId: ClockidT, res: MutPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibClockGetres(clockId.toLong(), res.rawAddress)

public actual fun closesocket(sockfd: CInt): CInt =
    UnixNewlibJniBridge.libcUnixNewlibClosesocket(sockfd)

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    UnixNewlibJniBridge.libcUnixNewlibIoctl(fd, request.toLong(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun recvfrom(fd: CInt, buf: MutPtr, n: ULong, flags: CInt, addr: MutPtr, addrLen: MutPtr): Long =
    UnixNewlibJniBridge.libcUnixNewlibRecvfrom(fd, buf.rawAddress, n.toLong(), flags, addr.rawAddress, addrLen.rawAddress)

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toInt(), serv.rawAddress, servlen.toInt(), flags)

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    MutPtr(UnixNewlibJniBridge.libcUnixNewlibMemalign(align.toLong(), size.toLong()))

public actual fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibFexecve(fd, argv.rawAddress, envp.rawAddress)

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGetgrgidR(gid.toShort(), grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibSigaltstack(ss.rawAddress, oss.rawAddress)

public actual fun semClose(sem: MutPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibSemClose(sem.rawAddress)

public actual fun getdtablesize(): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGetdtablesize()

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGetgrnamR(name.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibPthreadSigmask(how, set.rawAddress, oldset.rawAddress)

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(UnixNewlibJniBridge.libcUnixNewlibSemOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun getgrnam(name: ConstPtr): MutPtr =
    MutPtr(UnixNewlibJniBridge.libcUnixNewlibGetgrnam(name.rawAddress))

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixNewlibJniBridge.libcUnixNewlibPthreadKill(thread.toLong(), sig)

public actual fun semUnlink(name: ConstPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibSemUnlink(name.rawAddress)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixNewlibJniBridge.libcUnixNewlibDaemon(nochdir, noclose)

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGetpwnamR(name.rawAddress, pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGetpwuidR(uid.toShort(), pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibSigwait(set.rawAddress, sig.rawAddress)

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    UnixNewlibJniBridge.libcUnixNewlibPthreadAtfork(0L, 0L, 0L)

public actual fun getgrgid(gid: GidT): MutPtr =
    MutPtr(UnixNewlibJniBridge.libcUnixNewlibGetgrgid(gid.toShort()))

public actual fun popen(command: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(UnixNewlibJniBridge.libcUnixNewlibPopen(command.rawAddress, mode.rawAddress))

public actual fun uname(buf: MutPtr): CInt =
    UnixNewlibJniBridge.libcUnixNewlibUname(buf.rawAddress)
