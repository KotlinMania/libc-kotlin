@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.Passwd
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.ClockidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MqAttr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MqdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.PthreadBarrierT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.PthreadBarrierattrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.SemT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Sigevent
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Utmpx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.Kevent
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.KinfoProc
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixBsdFreebsdlikeJniBridge {
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
        val stream = UnixBsdFreebsdlikeJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixBsdFreebsdlikeSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDaemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeAccept4(s: Int, addr: Long, addrlen: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeChflags(path: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeChflagsat(fd: Int, path: Long, flags: Long, atflag: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeClockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeClockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeClockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeClockSettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeClockGetcpuclockid(pid: Int, clkId: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadGetcpuclockid(thread: Long, clkId: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDirfd(dirp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDuplocale(base: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeEndutxent()

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFchflags(fd: Int, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeGetdomainname(name: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeGetgrentR(grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeGetpwentR(pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeGetgrouplist(name: Long, basegid: Short, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeGetresgid(rgid: Long, egid: Long, sgid: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeGetresuid(ruid: Long, euid: Long, suid: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeGetutxent(): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeGetutxid(ut: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeGetutxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeInitgroups(name: Long, basegid: Short): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeKevent(kq: Int, changelist: Long, nchanges: Int, eventlist: Long, nevents: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeLchflags(path: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeLutimes(file: Long, times: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMemrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMkfifoat(dirfd: Int, pathname: Long, mode: Short): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMknodat(dirfd: Int, pathname: Long, mode: Short, dev: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMallocUsableSize(ptr: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeNewlocale(mask: Int, locale: Long, base: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeNlLanginfoL(item: Int, locale: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePpoll(fds: Long, nfds: Int, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePreadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadAttrGetNp(tid: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadCondattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadCondattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadMainNp(): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadMutexattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadMutexattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadRwlockattrGetpshared(attr: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadRwlockattrSetpshared(attr: Long, value: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadBarrierattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadBarrierattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadBarrierattrGetpshared(attr: Long, shared: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadBarrierattrSetpshared(attr: Long, shared: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadBarrierDestroy(barrier: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadBarrierWait(barrier: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadGetNameNp(tid: Long, name: Long, len: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadSetNameNp(tid: Long, name: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadGetnameNp(thread: Long, buffer: Long, length: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadSetnameNp(thread: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePtrace(request: Int, pid: Int, addr: Long, data: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeUtrace(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePututxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeQuerylocale(mask: Int, loc: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeRtprio(function: Int, pid: Int, rtp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSchedRrGetInterval(pid: Int, t: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSchedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSchedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSchedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSchedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSemGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSemTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSendfile(fd: Int, s: Int, offset: Long, nbytes: Long, hdtr: Long, sbytes: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSetdomainname(name: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSethostname(name: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSetpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSetresgid(rgid: Short, egid: Short, sgid: Short): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSetresuid(ruid: Short, euid: Short, suid: Short): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSettimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSetutxent()

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeShmOpen(name: Long, oflag: Int, mode: Short): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSysctlbyname(name: Long, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSysctlnametomib(name: Long, mibp: Long, sizep: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeUselocale(loc: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeUtimensat(dirfd: Int, path: Long, times: Long, flag: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeNtpAdjtime(buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeNtpGettime(buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeDlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeIconvOpen(tocode: Long, fromcode: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeIconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeIconvClose(cd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeExplicitBzero(s: Long, len: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMemsetS(s: Long, smax: Long, c: Int, n: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeGethostid(): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeSethostid(hostid: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeEui64Aton(a: Long, e: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeEui64Ntoa(id: Long, a: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeEui64Ntohost(hostname: Long, len: Long, id: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeEui64Hostton(hostname: Long, id: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeEaccess(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeKenv(action: Int, name: Long, value: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeReboot(howto: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeExect(path: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeExecvP(file: Long, searchPath: Long, argv: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawn(pid: Long, path: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnp(pid: Long, file: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnFileActionsAddopen(actions: Long, fd: Int, path: Long, oflag: Int, mode: Short): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikePosixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMqClose(mqd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMqGetattr(mqd: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMqNotify(mqd: Long, notification: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMqOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMqSend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMqTimedsend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeMqUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeGetrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeGetentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeOpenpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeForkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeLoginTty(fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFparseln(stream: Long, len: Long, lineno: Long, delim: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeBacktrace(addrlist: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeBacktraceSymbols(addrlist: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeBacktraceSymbolsFd(addrlist: Long, len: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeKvmOpen(execfile: Long, corefile: Long, swapfile: Long, flags: Int, errstr: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeKvmClose(kd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeKvmGetprocs(kd: Long, op: Int, arg: Int, cnt: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeKvmGetloadavg(kd: Long, loadavg: Long, nelem: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeKvmOpenfiles(execfile: Long, corefile: Long, swapfile: Long, flags: Int, errbuf: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeKvmRead(kd: Long, addr: Long, buf: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeKvmWrite(kd: Long, addr: Long, buf: Long, nbytes: Long): Long
}

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSemDestroy(sem.rawAddress)

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeDaemon(nochdir, noclose)

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun accept4(s: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>, flags: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeAccept4(s, addr.rawAddress, addrlen.rawAddress, flags)

public actual fun chflags(path: ConstPtr<CChar>, flags: CUlong): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeChflags(path.rawAddress, flags.toLong())

public actual fun chflagsat(fd: CInt, path: ConstPtr<CChar>, flags: CUlong, atflag: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeChflagsat(fd, path.rawAddress, flags.toLong(), atflag)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeClockNanosleep(clkId, flags, rqtp.rawAddress, rmtp.rawAddress)

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeClockGetres(clkId, tp.rawAddress)

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeClockGettime(clkId, tp.rawAddress)

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeClockSettime(clkId, tp.rawAddress)

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeClockGetcpuclockid(pid, clkId.rawAddress)

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadGetcpuclockid(thread.toLong(), clkId.rawAddress)

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeDirfd(dirp.rawAddress)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeDuplocale(base.rawAddress))

public actual fun endutxent() {
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeEndutxent()
}

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeFchflags(fd, flags.toLong())

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeFexecve(fd, argv.rawAddress, envp.rawAddress)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeFutimens(fd, times.rawAddress)

public actual fun getdomainname(name: MutPtr<CChar>, len: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeGetdomainname(name.rawAddress, len)

public actual fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeGetgrentR(grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeGetpwentR(pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getgrouplist(name: ConstPtr<CChar>, basegid: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeGetgrouplist(name.rawAddress, basegid.toShort(), groups.rawAddress, ngroups.rawAddress)

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toLong(), serv.rawAddress, servlen.toLong(), flags)

public actual fun getpriority(which: CInt, who: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeGetpriority(which, who)

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeGetresgid(rgid.rawAddress, egid.rawAddress, sgid.rawAddress)

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeGetresuid(ruid.rawAddress, euid.rawAddress, suid.rawAddress)

public actual fun getutxent(): MutPtr<Utmpx> =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeGetutxent())

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeGetutxid(ut.rawAddress))

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeGetutxline(ut.rawAddress))

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeInitgroups(name.rawAddress, basegid.toShort())

public actual fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: CInt, eventlist: MutPtr<Kevent>, nevents: CInt, timeout: ConstPtr<Timespec>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeKevent(kq, changelist.rawAddress, nchanges, eventlist.rawAddress, nevents, timeout.rawAddress)

public actual fun lchflags(path: ConstPtr<CChar>, flags: CUlong): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeLchflags(path.rawAddress, flags.toLong())

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeLutimes(file.rawAddress, times.rawAddress)

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMemrchr(cx.rawAddress, c, n.toLong()))

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMkfifoat(dirfd, pathname.rawAddress, mode.toShort())

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMknodat(dirfd, pathname.rawAddress, mode.toShort(), dev.toInt())

public actual fun mallocUsableSize(ptr: ConstPtr<CVoid>): SizeT =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMallocUsableSize(ptr.rawAddress).toULong()

public actual fun mincore(addr: ConstPtr<CVoid>, len: SizeT, vec: MutPtr<CChar>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMincore(addr.rawAddress, len.toLong(), vec.rawAddress)

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeNewlocale(mask, locale.rawAddress, base.rawAddress))

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeNlLanginfoL(item, locale.rawAddress))

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePipe2(fds.rawAddress, flags)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixFallocate(fd, offset, len)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixFadvise(fd, offset, len, advise)

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePpoll(fds.rawAddress, nfds.toInt(), timeout.rawAddress, sigmask.rawAddress)

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePreadv(fd, iov.rawAddress, iovcnt, offset)

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadAttrGetNp(tid.toLong(), attr.rawAddress)

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadAttrGetguardsize(attr.rawAddress, guardsize.rawAddress)

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadAttrSetguardsize(attr.rawAddress, guardsize.toLong())

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadAttrGetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.rawAddress)

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadCondattrGetclock(attr.rawAddress, clockId.rawAddress)

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadCondattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadCondattrSetclock(attr.rawAddress, clockId)

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadCondattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadMainNp(): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadMainNp()

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadMutexTimedlock(lock.rawAddress, abstime.rawAddress)

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadMutexattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadMutexattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadRwlockattrGetpshared(attr.rawAddress, value.rawAddress)

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadRwlockattrSetpshared(attr.rawAddress, value)

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadBarrierattrInit(attr.rawAddress)

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadBarrierattrDestroy(attr.rawAddress)

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, shared: MutPtr<CInt>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadBarrierattrGetpshared(attr.rawAddress, shared.rawAddress)

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, shared: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadBarrierattrSetpshared(attr.rawAddress, shared)

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadBarrierInit(barrier.rawAddress, attr.rawAddress, count.toInt())

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadBarrierDestroy(barrier.rawAddress)

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadBarrierWait(barrier.rawAddress)

public actual fun pthreadGetNameNp(tid: PthreadT, name: MutPtr<CChar>, len: SizeT) {
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadGetNameNp(tid.toLong(), name.rawAddress, len.toLong())
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr<CChar>) {
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadSetNameNp(tid.toLong(), name.rawAddress)
}

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: MutPtr<CChar>, length: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadGetnameNp(thread.toLong(), buffer.rawAddress, length.toLong())

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadSetnameNp(thread.toLong(), name.rawAddress)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadSetschedparam(native.toLong(), policy, param.rawAddress)

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePthreadGetschedparam(native.toLong(), policy.rawAddress, param.rawAddress)

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr<CChar>, data: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePtrace(request, pid, addr.rawAddress, data)

public actual fun utrace(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeUtrace(addr.rawAddress, len.toLong())

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePututxline(ut.rawAddress))

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePwritev(fd, iov.rawAddress, iovcnt, offset)

public actual fun querylocale(mask: CInt, loc: LocaleT): ConstPtr<CChar> =
    ConstPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeQuerylocale(mask, loc.rawAddress))

public actual fun rtprio(function: CInt, pid: PidT, rtp: MutPtr<Rtprio>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeRtprio(function, pid, rtp.rawAddress)

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr<Timespec>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSchedRrGetInterval(pid, t.rawAddress)

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSchedGetparam(pid, param.rawAddress)

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSchedSetparam(pid, param.rawAddress)

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSchedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSchedSetscheduler(pid, policy, param.rawAddress)

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSemGetvalue(sem.rawAddress, sval.rawAddress)

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSemTimedwait(sem.rawAddress, abstime.rawAddress)

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: MutPtr<SfHdtr>, sbytes: MutPtr<OffT>, flags: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSendfile(fd, s, offset, nbytes.toLong(), hdtr.rawAddress, sbytes.rawAddress, flags)

public actual fun setdomainname(name: ConstPtr<CChar>, len: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSetdomainname(name.rawAddress, len)

public actual fun sethostname(name: ConstPtr<CChar>, len: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSethostname(name.rawAddress, len)

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSetpriority(which, who, prio)

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSetresgid(rgid.toShort(), egid.toShort(), sgid.toShort())

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSetresuid(ruid.toShort(), euid.toShort(), suid.toShort())

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSettimeofday(tv.rawAddress, tz.rawAddress)

public actual fun setutxent() {
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSetutxent()
}

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeShmOpen(name.rawAddress, oflag, mode.toShort())

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSigtimedwait(set.rawAddress, info.rawAddress, timeout.rawAddress)

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSigwaitinfo(set.rawAddress, info.rawAddress)

public actual fun sysctl(name: ConstPtr<CInt>, namelen: CUint, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSysctl(name.rawAddress, namelen.toInt(), oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun sysctlbyname(name: ConstPtr<CChar>, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSysctlbyname(name.rawAddress, oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun sysctlnametomib(name: ConstPtr<CChar>, mibp: MutPtr<CInt>, sizep: MutPtr<SizeT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSysctlnametomib(name.rawAddress, mibp.rawAddress, sizep.rawAddress)

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeUselocale(loc.rawAddress))

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeUtimensat(dirfd, path.rawAddress, times.rawAddress, flag)

public actual fun ntpAdjtime(buf: MutPtr<Timex>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeNtpAdjtime(buf.rawAddress)

public actual fun ntpGettime(buf: MutPtr<Ntptimeval>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeNtpGettime(buf.rawAddress)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeDlIteratePhdr(0L, data.rawAddress)

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeIconvOpen(tocode.rawAddress, fromcode.rawAddress))

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeIconv(cd.rawAddress, inbuf.rawAddress, inbytesleft.rawAddress, outbuf.rawAddress, outbytesleft.rawAddress).toULong()

public actual fun iconvClose(cd: IconvT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeIconvClose(cd.rawAddress)

public actual fun explicitBzero(s: MutPtr<CVoid>, len: SizeT) {
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeExplicitBzero(s.rawAddress, len.toLong())
}

public actual fun memsetS(s: MutPtr<CVoid>, smax: SizeT, c: CInt, n: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMemsetS(s.rawAddress, smax.toLong(), c, n.toLong())

public actual fun gethostid(): CLong =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeGethostid()

public actual fun sethostid(hostid: CLong) {
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeSethostid(hostid)
}

public actual fun eui64Aton(a: ConstPtr<CChar>, e: MutPtr<Eui64>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeEui64Aton(a.rawAddress, e.rawAddress)

public actual fun eui64Ntoa(id: ConstPtr<Eui64>, a: MutPtr<CChar>, len: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeEui64Ntoa(id.rawAddress, a.rawAddress, len.toLong())

public actual fun eui64Ntohost(hostname: MutPtr<CChar>, len: SizeT, id: ConstPtr<Eui64>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeEui64Ntohost(hostname.rawAddress, len.toLong(), id.rawAddress)

public actual fun eui64Hostton(hostname: ConstPtr<CChar>, id: MutPtr<Eui64>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeEui64Hostton(hostname.rawAddress, id.rawAddress)

public actual fun eaccess(path: ConstPtr<CChar>, mode: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeEaccess(path.rawAddress, mode)

public actual fun kenv(action: CInt, name: ConstPtr<CChar>, value: MutPtr<CChar>, len: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeKenv(action, name.rawAddress, value.rawAddress, len)

public actual fun reboot(howto: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeReboot(howto)

public actual fun exect(path: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeExect(path.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun execvP(file: ConstPtr<CChar>, searchPath: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeExecvP(file.rawAddress, searchPath.rawAddress, argv.rawAddress)

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMkostemp(template.rawAddress, flags)

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMkostemps(template.rawAddress, suffixlen, flags)

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawn(pid.rawAddress, path.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnp(pid.rawAddress, file.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnattrInit(attr.rawAddress)

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnattrDestroy(attr.rawAddress)

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnattrGetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnattrSetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnattrGetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnattrSetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnattrGetflags(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnattrSetflags(attr.rawAddress, flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnattrGetpgroup(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnattrSetpgroup(attr.rawAddress, flags)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnattrGetschedpolicy(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnattrSetschedpolicy(attr.rawAddress, flags)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnattrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnattrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnFileActionsInit(actions.rawAddress)

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnFileActionsDestroy(actions.rawAddress)

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnFileActionsAddopen(actions.rawAddress, fd, path.rawAddress, oflag, mode.toShort())

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnFileActionsAddclose(actions.rawAddress, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikePosixSpawnFileActionsAdddup2(actions.rawAddress, fd, newfd)

public actual fun mqClose(mqd: MqdT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMqClose(mqd.rawAddress)

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMqGetattr(mqd.rawAddress, attr.rawAddress)

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr<Sigevent>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMqNotify(mqd.rawAddress, notification.rawAddress)

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMqOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMqReceive(mqd.rawAddress, msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress)

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMqSend(mqd.rawAddress, msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt())

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMqSetattr(mqd.rawAddress, newattr.rawAddress, oldattr.rawAddress)

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMqTimedreceive(mqd.rawAddress, msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress, absTimeout.rawAddress)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMqTimedsend(mqd.rawAddress, msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt(), absTimeout.rawAddress)

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeMqUnlink(name.rawAddress)

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeGetrandom(buf.rawAddress, buflen.toLong(), flags.toInt())

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeGetentropy(buf.rawAddress, buflen.toLong())

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeOpenpty(amaster.rawAddress, aslave.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeForkpty(amaster.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun loginTty(fd: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeLoginTty(fd)

public actual fun fparseln(stream: MutPtr<FILE>, len: MutPtr<SizeT>, lineno: MutPtr<SizeT>, delim: ConstPtr<CChar>, flags: CInt): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeFparseln(stream.rawAddress, len.rawAddress, lineno.rawAddress, delim.rawAddress, flags))

public actual fun backtrace(addrlist: MutPtr<MutPtr<CVoid>>, len: SizeT): SizeT =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeBacktrace(addrlist.rawAddress, len.toLong()).toULong()

public actual fun backtraceSymbols(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT): MutPtr<MutPtr<CChar>> =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeBacktraceSymbols(addrlist.rawAddress, len.toLong()))

public actual fun backtraceSymbolsFd(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeBacktraceSymbolsFd(addrlist.rawAddress, len.toLong(), fd)

public actual fun kvmOpen(execfile: ConstPtr<CChar>, corefile: ConstPtr<CChar>, swapfile: ConstPtr<CChar>, flags: CInt, errstr: ConstPtr<CChar>): MutPtr<KvmT> =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeKvmOpen(execfile.rawAddress, corefile.rawAddress, swapfile.rawAddress, flags, errstr.rawAddress))

public actual fun kvmClose(kd: MutPtr<KvmT>): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeKvmClose(kd.rawAddress)

public actual fun kvmGetprocs(kd: MutPtr<KvmT>, op: CInt, arg: CInt, cnt: MutPtr<CInt>): MutPtr<KinfoProc> =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeKvmGetprocs(kd.rawAddress, op, arg, cnt.rawAddress))

public actual fun kvmGetloadavg(kd: MutPtr<KvmT>, loadavg: MutPtr<CDouble>, nelem: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeKvmGetloadavg(kd.rawAddress, loadavg.rawAddress, nelem)

public actual fun kvmOpenfiles(execfile: ConstPtr<CChar>, corefile: ConstPtr<CChar>, swapfile: ConstPtr<CChar>, flags: CInt, errbuf: MutPtr<CChar>): MutPtr<KvmT> =
    MutPtr(UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeKvmOpenfiles(execfile.rawAddress, corefile.rawAddress, swapfile.rawAddress, flags, errbuf.rawAddress))

public actual fun kvmRead(kd: MutPtr<KvmT>, addr: CUlong, buf: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeKvmRead(kd.rawAddress, addr.toLong(), buf.rawAddress, nbytes.toLong())

public actual fun kvmWrite(kd: MutPtr<KvmT>, addr: CUlong, buf: ConstPtr<CVoid>, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeJniBridge.libcUnixBsdFreebsdlikeKvmWrite(kd.rawAddress, addr.toLong(), buf.rawAddress, nbytes.toLong())
