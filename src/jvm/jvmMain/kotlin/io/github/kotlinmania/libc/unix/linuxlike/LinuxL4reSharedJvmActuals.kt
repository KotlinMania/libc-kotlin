@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NlItem
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeLinuxL4reSharedJniBridge {
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
        val stream = UnixLinuxlikeLinuxL4reSharedJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixLinuxlikeLinuxL4reSharedIopl(level: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedIoperm(from: Long, num: Long, turnOn: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedAioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedAioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedAioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedAioError(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedAioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedAioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedAioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedLioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedPwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedPreadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedGetloadavg(loadavg: Long, nelem: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedProcessVmReadv(pid: Int, localIov: Long, liovcnt: Long, remoteIov: Long, riovcnt: Long, flags: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedProcessVmWritev(pid: Int, localIov: Long, liovcnt: Long, remoteIov: Long, riovcnt: Long, flags: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedFutimes(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedAbs(i: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedLabs(i: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedRand(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSrand(seed: Int)

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedDrand48(): Double

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedErand48(xseed: Long): Double

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedLrand48(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedNrand48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedJrand48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSrand48(seed: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSetpwent()

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedEndpwent()

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedGetpwent(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSetgrent()

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedEndgrent()

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedGetgrent(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSetspent()

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedEndspent()

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedGetspent(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedGetspnam(name: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedShmget(key: Int, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedShmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedShmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedShmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedErrnoLocation(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedMremap(addr: Long, len: Long, newLen: Long, flags: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedGlob(pattern: Long, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedGlobfree(pglob: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSeekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedTelldir(dirp: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedMsync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedRecvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedNlLanginfo(item: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedNlLanginfoL(item: Int, locale: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSchedGetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSettimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSemTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSemGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedMount(src: Long, target: Long, fstype: Long, flags: Long, data: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedPrctl(option: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedPpoll(fds: Long, nfds: Long, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSethostname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSysinfo(info: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSigsuspend(mask: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedGetgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSemClose(sem: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedGetgrnamR(name: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedInitgroups(user: Long, group: Short): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSemOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedGetgrnam(name: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSemUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedDaemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedGetgrgid(gid: Short): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedPopen(command: Long, mode: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedFaccessat(dirfd: Int, pathname: Long, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedDlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSetmntent(filename: Long, ty: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedGetmntent(stream: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedAddmntent(stream: Long, mnt: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedEndmntent(streamp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedHasmntopt(mnt: Long, opt: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedRegcomp(preg: Long, pattern: Long, cflags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedRegexec(preg: Long, input: Long, nmatch: Long, pmatch: Long, eflags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedRegerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedRegfree(preg: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedIconvOpen(tocode: Long, fromcode: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedIconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedIconvClose(cd: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedGettid(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedTimerCreate(clockid: Int, sevp: Long, timerid: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedTimerDelete(timerid: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedTimerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedTimerGettime(timerid: Long, currValue: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedTimerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedMemmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedSchedGetcpu(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedGetoptLong(argc: Int, argv: Long, optstring: Long, longopts: Long, longindex: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedCopyFileRange(fdIn: Int, offIn: Long, fdOut: Int, offOut: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedFreopen64(filename: Long, mode: Long, file: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedFseeko64(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedFsetpos64(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxL4reSharedFtello64(stream: Long): Long
}

public actual fun iopl(level: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedIopl(level)

public actual fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedIoperm(from.toLong(), num.toLong(), turnOn)

public actual fun aioRead(aiocbp: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedAioRead(aiocbp.rawAddress)

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedAioWrite(aiocbp.rawAddress)

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedAioFsync(op, aiocbp.rawAddress)

public actual fun aioError(aiocbp: ConstPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedAioError(aiocbp.rawAddress)

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedAioReturn(aiocbp.rawAddress)

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedAioSuspend(aiocbList.rawAddress, nitems, timeout.rawAddress)

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedAioCancel(fd, aiocbp.rawAddress)

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedLioListio(mode, aiocbList.rawAddress, nitems, sevp.rawAddress)

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedPwritev(fd, iov.rawAddress, iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedPreadv(fd, iov.rawAddress, iovcnt, offset)

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toInt(), serv.rawAddress, servlen.toInt(), flags)

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedGetloadavg(loadavg.rawAddress, nelem)

public actual fun processVmReadv(pid: PidT, localIov: ConstPtr, liovcnt: CUlong, remoteIov: ConstPtr, riovcnt: CUlong, flags: CUlong): Long =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedProcessVmReadv(pid, localIov.rawAddress, liovcnt.toLong(), remoteIov.rawAddress, riovcnt.toLong(), flags.toLong())

public actual fun processVmWritev(pid: PidT, localIov: ConstPtr, liovcnt: CUlong, remoteIov: ConstPtr, riovcnt: CUlong, flags: CUlong): Long =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedProcessVmWritev(pid, localIov.rawAddress, liovcnt.toLong(), remoteIov.rawAddress, riovcnt.toLong(), flags.toLong())

public actual fun futimes(fd: CInt, times: ConstPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedFutimes(fd, times.rawAddress)

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun abs(i: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedAbs(i)

public actual fun labs(i: CLong): CLong =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedLabs(i)

public actual fun rand(): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedRand()

public actual fun srand(seed: CUint) {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSrand(seed.toInt())
}

public actual fun drand48(): CDouble =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedDrand48()

public actual fun erand48(xseed: MutPtr): CDouble =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedErand48(xseed.rawAddress)

public actual fun lrand48(): CLong =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedLrand48()

public actual fun nrand48(xseed: MutPtr): CLong =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedNrand48(xseed.rawAddress)

public actual fun jrand48(xseed: MutPtr): CLong =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedJrand48(xseed.rawAddress)

public actual fun srand48(seed: CLong) {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSrand48(seed)
}

public actual fun setpwent() {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSetpwent()
}

public actual fun endpwent() {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedEndpwent()
}

public actual fun getpwent(): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedGetpwent())

public actual fun setgrent() {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSetgrent()
}

public actual fun endgrent() {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedEndgrent()
}

public actual fun getgrent(): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedGetgrent())

public actual fun setspent() {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSetspent()
}

public actual fun endspent() {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedEndspent()
}

public actual fun getspent(): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedGetspent())

public actual fun getspnam(name: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedGetspnam(name.rawAddress))

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedShmget(key, size.toLong(), shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedShmat(shmid, shmaddr.rawAddress, shmflg))

public actual fun shmdt(shmaddr: ConstPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedShmdt(shmaddr.rawAddress)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedShmctl(shmid, cmd, buf.rawAddress)

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun errnoLocation(): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedErrnoLocation())

public actual fun mremap(addr: MutPtr, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedMremap(addr.rawAddress, len.toLong(), newLen.toLong(), flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedGlob(pattern.rawAddress, flags, 0L, pglob.rawAddress)

public actual fun globfree(pglob: MutPtr) {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedGlobfree(pglob.rawAddress)
}

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSeekdir(dirp.rawAddress, loc)
}

public actual fun telldir(dirp: MutPtr): CLong =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedTelldir(dirp.rawAddress)

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedMsync(addr.rawAddress, len.toLong(), flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedRecvfrom(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.rawAddress)

public actual fun nlLanginfo(item: NlItem): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedNlLanginfo(item))

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedNlLanginfoL(item, locale.rawAddress))

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSchedGetaffinity(pid, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMax(policy)

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSettimeofday(tv.rawAddress, tz.rawAddress)

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSemTimedwait(sem.rawAddress, abstime.rawAddress)

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSemGetvalue(sem.rawAddress, sval.rawAddress)

public actual fun mount(src: ConstPtr, target: ConstPtr, fstype: ConstPtr, flags: CUlong, data: ConstPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedMount(src.rawAddress, target.rawAddress, fstype.rawAddress, flags.toLong(), data.rawAddress)

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedPrctl(option, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedPpoll(fds.rawAddress, nfds.toLong(), timeout.rawAddress, sigmask.rawAddress)

public actual fun sethostname(name: ConstPtr, len: SizeT): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSethostname(name.rawAddress, len.toLong())

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMin(policy)

public actual fun sysinfo(info: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSysinfo(info.rawAddress)

public actual fun sigsuspend(mask: ConstPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSigsuspend(mask.rawAddress)

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedGetgrgidR(gid.toShort(), grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun semClose(sem: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSemClose(sem.rawAddress)

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedGetgrnamR(name.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun initgroups(user: ConstPtr, group: GidT): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedInitgroups(user.rawAddress, group.toShort())

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSemOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun getgrnam(name: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedGetgrnam(name.rawAddress))

public actual fun semUnlink(name: ConstPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSemUnlink(name.rawAddress)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedDaemon(nochdir, noclose)

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSigwait(set.rawAddress, sig.rawAddress)

public actual fun getgrgid(gid: GidT): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedGetgrgid(gid.toShort()))

public actual fun popen(command: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedPopen(command.rawAddress, mode.rawAddress))

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedFaccessat(dirfd, pathname.rawAddress, mode, flags)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedDlIteratePhdr(0L, data.rawAddress)

public actual fun setmntent(filename: ConstPtr, ty: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSetmntent(filename.rawAddress, ty.rawAddress))

public actual fun getmntent(stream: MutPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedGetmntent(stream.rawAddress))

public actual fun addmntent(stream: MutPtr, mnt: ConstPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedAddmntent(stream.rawAddress, mnt.rawAddress)

public actual fun endmntent(streamp: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedEndmntent(streamp.rawAddress)

public actual fun hasmntopt(mnt: ConstPtr, opt: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedHasmntopt(mnt.rawAddress, opt.rawAddress))

public actual fun regcomp(preg: MutPtr, pattern: ConstPtr, cflags: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedRegcomp(preg.rawAddress, pattern.rawAddress, cflags)

public actual fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedRegexec(preg.rawAddress, input.rawAddress, nmatch.toLong(), pmatch.rawAddress, eflags)

public actual fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedRegerror(errcode, preg.rawAddress, errbuf.rawAddress, errbufSize.toLong()).toULong()

public actual fun regfree(preg: MutPtr) {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedRegfree(preg.rawAddress)
}

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedIconvOpen(tocode.rawAddress, fromcode.rawAddress))

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedIconv(cd.rawAddress, inbuf.rawAddress, inbytesleft.rawAddress, outbuf.rawAddress, outbytesleft.rawAddress).toULong()

public actual fun iconvClose(cd: IconvT): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedIconvClose(cd.rawAddress)

public actual fun gettid(): PidT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedGettid()

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedTimerCreate(clockid, sevp.rawAddress, timerid.rawAddress)

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedTimerDelete(timerid.rawAddress)

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedTimerGetoverrun(timerid.rawAddress)

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedTimerGettime(timerid.rawAddress, currValue.rawAddress)

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedTimerSettime(timerid.rawAddress, flags, newValue.rawAddress, oldValue.rawAddress)

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedMemmem(haystack.rawAddress, haystacklen.toLong(), needle.rawAddress, needlelen.toLong()))

public actual fun schedGetcpu(): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedSchedGetcpu()

public actual fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedGetoptLong(argc, argv.rawAddress, optstring.rawAddress, longopts.rawAddress, longindex.rawAddress)

public actual fun copyFileRange(fdIn: CInt, offIn: MutPtr, fdOut: CInt, offOut: MutPtr, len: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedCopyFileRange(fdIn, offIn.rawAddress, fdOut, offOut.rawAddress, len.toLong(), flags.toInt())

public actual fun freopen64(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedFreopen64(filename.rawAddress, mode.rawAddress, file.rawAddress))

public actual fun fseeko64(stream: MutPtr, offset: Off64T, whence: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedFseeko64(stream.rawAddress, offset, whence)

public actual fun fsetpos64(stream: MutPtr, ptr: ConstPtr): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedFsetpos64(stream.rawAddress, ptr.rawAddress)

public actual fun ftello64(stream: MutPtr): Off64T =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libcUnixLinuxlikeLinuxL4reSharedFtello64(stream.rawAddress)
