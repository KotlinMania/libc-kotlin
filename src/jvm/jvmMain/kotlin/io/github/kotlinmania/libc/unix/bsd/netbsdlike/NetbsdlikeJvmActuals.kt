@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.Utsname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.IdtypeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PosixSpawnFileActionsT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PosixSpawnattrT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PthreadCondattrT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PthreadMutexT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PthreadSpinlockT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.ShmidDs
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SiginfoT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SigsetT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.DevT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixBsdNetbsdlikeJniBridge {
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
        val stream = UnixBsdNetbsdlikeJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixBsdNetbsdlikeSetgrent()

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeDaemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeAccept4(s: Int, addr: Long, addrlen: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeMincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeClockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeClockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeClockSettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeErrno(): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeShmOpen(name: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeMemrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeMkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeMkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePreadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeUtimensat(dirfd: Int, path: Long, times: Long, flag: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeFdatasync(fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeLoginTty(fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSetpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeMknodat(dirfd: Int, pathname: Long, mode: Int, dev: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeMkfifoat(dirfd: Int, pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSemTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSemGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSethostname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePpoll(fds: Long, nfds: Int, ts: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeGetgrouplist(name: Long, basegid: Short, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeInitgroups(name: Long, basegid: Short): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeGetdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSetdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeUname(buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeShmget(key: Long, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeShmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeShmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeShmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeExecvpe(file: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeWaitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawn(pid: Long, path: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnp(pid: Long, file: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnFileActionsAddopen(actions: Long, fd: Int, path: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeReallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeGethostid(): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSethostid(hostid: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeFtok(path: Long, id: Int): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeDirname(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeBasename(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeGetentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSendmmsg(sockfd: Int, mmsg: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeRecvmmsg(sockfd: Int, mmsg: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeClosefrom(lowfd: Int): Int
}

public actual fun setgrent() {
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSetgrent()
}

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSemDestroy(sem.rawAddress)

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeDaemon(nochdir, noclose)

public actual fun accept4(s: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeAccept4(s, addr.rawAddress, addrlen.rawAddress, flags)

public actual fun mincore(addr: MutPtr<CVoid>, len: SizeT, vec: MutPtr<CChar>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeMincore(addr.rawAddress, len.toLong(), vec.rawAddress)

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeClockGetres(clkId, tp.rawAddress)

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeClockGettime(clkId, tp.rawAddress)

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeClockSettime(clkId, tp.rawAddress)

public actual fun errno(): MutPtr<CInt> =
    MutPtr(UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeErrno())

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeShmOpen(name.rawAddress, oflag, mode.toInt())

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeMemrchr(cx.rawAddress, c, n.toLong()))

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeMkostemp(template.rawAddress, flags)

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeMkostemps(template.rawAddress, suffixlen, flags)

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePwritev(fd, iov.rawAddress, iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePreadv(fd, iov.rawAddress, iovcnt, offset)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeFutimens(fd, times.rawAddress)

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeUtimensat(dirfd, path.rawAddress, times.rawAddress, flag)

public actual fun fdatasync(fd: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeFdatasync(fd)

public actual fun loginTty(fd: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeLoginTty(fd)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeGetpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSetpriority(which, who.toInt(), prio)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeMknodat(dirfd, pathname.rawAddress, mode.toInt(), dev)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeMkfifoat(dirfd, pathname.rawAddress, mode.toInt())

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSemTimedwait(sem.rawAddress, abstime.rawAddress)

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSemGetvalue(sem.rawAddress, sval.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadCondattrSetclock(attr.rawAddress, clockId)

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSethostname(name.rawAddress, len.toLong())

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadMutexTimedlock(lock.rawAddress, abstime.rawAddress)

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadSpinInit(lock.rawAddress, pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadSpinDestroy(lock.rawAddress)

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadSpinLock(lock.rawAddress)

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadSpinTrylock(lock.rawAddress)

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadSpinUnlock(lock.rawAddress)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadSetschedparam(native.toLong(), policy, param.rawAddress)

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadGetschedparam(native.toLong(), policy.rawAddress, param.rawAddress)

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePipe2(fds.rawAddress, flags)

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, ts: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePpoll(fds.rawAddress, nfds.toInt(), ts.rawAddress, sigmask.rawAddress)

public actual fun getgrouplist(name: ConstPtr<CChar>, basegid: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeGetgrouplist(name.rawAddress, basegid.toShort(), groups.rawAddress, ngroups.rawAddress)

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeInitgroups(name.rawAddress, basegid.toShort())

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeGetdomainname(name.rawAddress, len.toLong())

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSetdomainname(name.rawAddress, len.toLong())

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeUname(buf.rawAddress)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeShmget(key, size.toLong(), shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    MutPtr(UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeShmat(shmid, shmaddr.rawAddress, shmflg))

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeShmdt(shmaddr.rawAddress)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeShmctl(shmid, cmd, buf.rawAddress)

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeExecvpe(file.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeWaitid(idtype, id.toInt(), infop.rawAddress, options)

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawn(pid.rawAddress, path.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnp(pid.rawAddress, file.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrInit(attr.rawAddress)

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrDestroy(attr.rawAddress)

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrGetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrSetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrGetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrSetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrGetflags(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrSetflags(attr.rawAddress, flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrGetpgroup(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrSetpgroup(attr.rawAddress, flags)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrGetschedpolicy(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrSetschedpolicy(attr.rawAddress, flags)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnFileActionsInit(actions.rawAddress)

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnFileActionsDestroy(actions.rawAddress)

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnFileActionsAddopen(actions.rawAddress, fd, path.rawAddress, oflag, mode.toInt())

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnFileActionsAddclose(actions.rawAddress, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnFileActionsAdddup2(actions.rawAddress, fd, newfd)

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeReallocarray(ptr.rawAddress, nmemb.toLong(), size.toLong()))

public actual fun gethostid(): CLong =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeGethostid()

public actual fun sethostid(hostid: CLong): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSethostid(hostid)

public actual fun ftok(path: ConstPtr<CChar>, id: CInt): KeyT =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeFtok(path.rawAddress, id)

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeDirname(path.rawAddress))

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeBasename(path.rawAddress))

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeGetentropy(buf.rawAddress, buflen.toLong())

public actual fun sendmmsg(sockfd: CInt, mmsg: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSendmmsg(sockfd, mmsg.rawAddress, vlen.toInt(), flags)

public actual fun recvmmsg(sockfd: CInt, mmsg: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeRecvmmsg(sockfd, mmsg.rawAddress, vlen.toInt(), flags, timeout.rawAddress)

public actual fun closefrom(lowfd: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeClosefrom(lowfd)
