@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.IdtypeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Ioctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Msghdr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.SiginfoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Stat64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Statfs
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Statfs64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Statvfs64
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.SemT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.powerpc64.Termios
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeJniBridge {
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
        val stream = UnixLinuxlikeJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixLinuxlikeIoctl(fd: Int, request: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLibcCurrentSigrtmax(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLibcCurrentSigrtmin(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeFdatasync(fd: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeMincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeClockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeClockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeClockSettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeClockGetcpuclockid(pid: Int, clkId: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeGetitimer(which: Int, currValue: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeSetitimer(which: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeDirfd(dirp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeMemalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeSetgroups(ngroups: Long, ptr: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikePipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeStatfs(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeFstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeMemrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikePosixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeUtimensat(dirfd: Int, path: Long, times: Long, flag: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeDuplocale(base: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeFreelocale(loc: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeNewlocale(mask: Int, locale: Long, base: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeUselocale(loc: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeMknodat(dirfd: Int, pathname: Long, mode: Int, dev: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikePtsnameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeClearenv(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeWaitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeGetresuid(ruid: Long, euid: Long, suid: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeGetresgid(rgid: Long, egid: Long, sgid: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAcct(filename: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeBrk(addr: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeSbrk(increment: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeVfork(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeSetresgid(rgid: Short, egid: Short, sgid: Short): Int

    @JvmStatic
    external fun libcUnixLinuxlikeSetresuid(ruid: Short, euid: Short, suid: Short): Int

    @JvmStatic
    external fun libcUnixLinuxlikeWait4(pid: Int, status: Long, options: Int, rusage: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLoginTty(fd: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeExecvpe(file: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeFexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeGetifaddrs(ifap: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeFreeifaddrs(ifa: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeBind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeWritev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeReadv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeSendmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeRecvmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeUname(buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeStrchrnul(s: Long, c: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeStrftime(s: Long, max: Long, format: Long, tm: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeStrftimeL(s: Long, max: Long, format: Long, tm: Long, locale: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeStrptime(s: Long, format: Long, tm: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeMkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeMkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeGetdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeSetdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeIfNameindex(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeIfFreenameindex(ptr: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeGetpwnamR(name: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeGetpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeFstatfs64(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeStatvfs64(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeFstatvfs64(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeStatfs64(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeCreat64(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeFstat64(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeFstatat64(dirfd: Int, pathname: Long, buf: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeFtruncate64(fd: Int, length: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLseek64(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLstat64(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeMmap64(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeOpen64(path: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeOpenat64(fd: Int, path: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikePosixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikePread64(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikePwrite64(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeReaddir64(dirp: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeReaddir64R(dirp: Long, entry: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeStat64(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeTruncate64(path: Long, length: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikePreadv64(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikePwritev64(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeForkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeOpenpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeStatx(dirfd: Int, pathname: Long, flags: Int, mask: Int, statxbuf: Long): Int
}

public actual fun ioctl(fd: CInt, request: Ioctl, vararg variadicArgs: Long): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeIoctl(fd, request.toLong(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun libcCurrentSigrtmax(): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeLibcCurrentSigrtmax()

public actual fun libcCurrentSigrtmin(): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeLibcCurrentSigrtmin()

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeSemDestroy(sem.rawAddress)

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun fdatasync(fd: CInt): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeFdatasync(fd)

public actual fun mincore(addr: MutPtr<CVoid>, len: SizeT, vec: MutPtr<CUchar>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeMincore(addr.rawAddress, len.toLong(), vec.rawAddress)

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeClockGetres(clkId, tp.rawAddress)

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeClockGettime(clkId, tp.rawAddress)

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeClockSettime(clkId, tp.rawAddress)

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeClockGetcpuclockid(pid, clkId.rawAddress)

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeGetitimer(which, currValue.rawAddress)

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeSetitimer(which, newValue.rawAddress, oldValue.rawAddress)

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeDirfd(dirp.rawAddress)

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixLinuxlikeJniBridge.libcUnixLinuxlikeMemalign(align.toLong(), size.toLong()))

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr<GidT>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeSetgroups(ngroups.toLong(), ptr.rawAddress)

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikePipe2(fds.rawAddress, flags)

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeStatfs(path.rawAddress, buf.rawAddress)

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeFstatfs(fd, buf.rawAddress)

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(UnixLinuxlikeJniBridge.libcUnixLinuxlikeMemrchr(cx.rawAddress, c, n.toLong()))

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikePosixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeFutimens(fd, times.rawAddress)

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeUtimensat(dirfd, path.rawAddress, times.rawAddress, flag)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(UnixLinuxlikeJniBridge.libcUnixLinuxlikeDuplocale(base.rawAddress))

public actual fun freelocale(loc: LocaleT) {
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeFreelocale(loc.rawAddress)
}

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(UnixLinuxlikeJniBridge.libcUnixLinuxlikeNewlocale(mask, locale.rawAddress, base.rawAddress))

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(UnixLinuxlikeJniBridge.libcUnixLinuxlikeUselocale(loc.rawAddress))

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeMknodat(dirfd, pathname.rawAddress, mode.toInt(), dev.toLong())

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikePtsnameR(fd, buf.rawAddress, buflen.toLong())

public actual fun clearenv(): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeClearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeWaitid(idtype.toInt(), id.toInt(), infop.rawAddress, options)

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeGetresuid(ruid.rawAddress, euid.rawAddress, suid.rawAddress)

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeGetresgid(rgid.rawAddress, egid.rawAddress, sgid.rawAddress)

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeAcct(filename.rawAddress)

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeBrk(addr.rawAddress)

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    MutPtr(UnixLinuxlikeJniBridge.libcUnixLinuxlikeSbrk(increment))

public actual fun vfork(): PidT =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeVfork()

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeSetresgid(rgid.toShort(), egid.toShort(), sgid.toShort())

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeSetresuid(ruid.toShort(), euid.toShort(), suid.toShort())

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeWait4(pid, status.rawAddress, options, rusage.rawAddress)

public actual fun loginTty(fd: CInt): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeLoginTty(fd)

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeExecvpe(file.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeFexecve(fd, argv.rawAddress, envp.rawAddress)

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeGetifaddrs(ifap.rawAddress)

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeFreeifaddrs(ifa.rawAddress)
}

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeBind(socket, address.rawAddress, addressLen.toInt())

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeWritev(fd, iov.rawAddress, iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeReadv(fd, iov.rawAddress, iovcnt)

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeSendmsg(fd, msg.rawAddress, flags)

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeRecvmsg(fd, msg.rawAddress, flags)

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeUname(buf.rawAddress)

public actual fun strchrnul(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(UnixLinuxlikeJniBridge.libcUnixLinuxlikeStrchrnul(s.rawAddress, c))

public actual fun strftime(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>): SizeT =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeStrftime(s.rawAddress, max.toLong(), format.rawAddress, tm.rawAddress).toULong()

public actual fun strftimeL(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>, locale: LocaleT): SizeT =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeStrftimeL(s.rawAddress, max.toLong(), format.rawAddress, tm.rawAddress, locale.rawAddress).toULong()

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    MutPtr(UnixLinuxlikeJniBridge.libcUnixLinuxlikeStrptime(s.rawAddress, format.rawAddress, tm.rawAddress))

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeMkostemp(template.rawAddress, flags)

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeMkostemps(template.rawAddress, suffixlen, flags)

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeGetdomainname(name.rawAddress, len.toLong())

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeSetdomainname(name.rawAddress, len.toLong())

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    MutPtr(UnixLinuxlikeJniBridge.libcUnixLinuxlikeIfNameindex())

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeIfFreenameindex(ptr.rawAddress)
}

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeGetpwnamR(name.rawAddress, pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeGetpwuidR(uid.toShort(), pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun fstatfs64(fd: CInt, buf: MutPtr<Statfs64>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeFstatfs64(fd, buf.rawAddress)

public actual fun statvfs64(path: ConstPtr<CChar>, buf: MutPtr<Statvfs64>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeStatvfs64(path.rawAddress, buf.rawAddress)

public actual fun fstatvfs64(fd: CInt, buf: MutPtr<Statvfs64>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeFstatvfs64(fd, buf.rawAddress)

public actual fun statfs64(path: ConstPtr<CChar>, buf: MutPtr<Statfs64>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeStatfs64(path.rawAddress, buf.rawAddress)

public actual fun creat64(path: ConstPtr<CChar>, mode: ModeT): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeCreat64(path.rawAddress, mode.toInt())

public actual fun fstat64(fildes: CInt, buf: MutPtr<Stat64>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeFstat64(fildes, buf.rawAddress)

public actual fun fstatat64(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat64>, flags: CInt): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeFstatat64(dirfd, pathname.rawAddress, buf.rawAddress, flags)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeFtruncate64(fd, length)

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeLseek64(fd, offset, whence)

public actual fun lstat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeLstat64(path.rawAddress, buf.rawAddress)

public actual fun mmap64(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr<CVoid> =
    MutPtr(UnixLinuxlikeJniBridge.libcUnixLinuxlikeMmap64(addr.rawAddress, len.toLong(), prot, flags, fd, offset))

public actual fun open64(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeOpen64(path.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun openat64(fd: CInt, path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeOpenat64(fd, path.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikePosixFadvise64(fd, offset, len, advise)

public actual fun pread64(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikePread64(fd, buf.rawAddress, count.toLong(), offset)

public actual fun pwrite64(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikePwrite64(fd, buf.rawAddress, count.toLong(), offset)

public actual fun readdir64(dirp: MutPtr<DIR>): MutPtr<Dirent64> =
    MutPtr(UnixLinuxlikeJniBridge.libcUnixLinuxlikeReaddir64(dirp.rawAddress))

public actual fun readdir64R(dirp: MutPtr<DIR>, entry: MutPtr<Dirent64>, result: MutPtr<MutPtr<Dirent64>>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeReaddir64R(dirp.rawAddress, entry.rawAddress, result.rawAddress)

public actual fun stat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeStat64(path.rawAddress, buf.rawAddress)

public actual fun truncate64(path: ConstPtr<CChar>, length: Off64T): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeTruncate64(path.rawAddress, length)

public actual fun preadv64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikePreadv64(fd, iov.rawAddress, iovcnt, offset)

public actual fun pwritev64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikePwritev64(fd, iov.rawAddress, iovcnt, offset)

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeForkpty(amaster.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeOpenpty(amaster.rawAddress, aslave.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun statx(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, mask: CUint, statxbuf: MutPtr<Statx>): CInt =
    UnixLinuxlikeJniBridge.libcUnixLinuxlikeStatx(dirfd, pathname.rawAddress, flags, mask.toInt(), statxbuf.rawAddress)
