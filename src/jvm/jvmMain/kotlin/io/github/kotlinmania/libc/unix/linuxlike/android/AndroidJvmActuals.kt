@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeAndroidJniBridge {
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
        val stream = UnixLinuxlikeAndroidJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixLinuxlikeAndroidSetgrent()

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidEndgrent()

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetgrent(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSetrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidPrlimit(pid: Int, resource: Int, newLimit: Long, oldLimit: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidPrlimit64(pid: Int, resource: Int, newLimit: Long, oldLimit: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidMlock2(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidMsync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidPreadv(fd: Int, iov: Long, count: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidPwritev(fd: Int, iov: Long, count: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidProcessVmReadv(pid: Int, localIov: Long, localIovCount: Long, remoteIov: Long, remoteIovCount: Long, flags: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidProcessVmWritev(pid: Int, localIov: Long, localIovCount: Long, remoteIov: Long, remoteIovCount: Long, flags: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidPtrace(request: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSetpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSchedCpualloc(count: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSchedCpufree(set: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSchedCpucount(setsize: Long, set: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSchedGetcpu(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidMallocInfo(options: Int, stream: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidMallocUsableSize(ptr: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidUtmpname(name: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSetutent()

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetutent(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSeekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidTelldir(dirp: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidFallocate(fd: Int, mode: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidFallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidPosixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidPosixFallocate64(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetxattr(path: Long, name: Long, value: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidLgetxattr(path: Long, name: Long, value: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidFgetxattr(filedes: Int, name: Long, value: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSetxattr(path: Long, name: Long, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidLsetxattr(path: Long, name: Long, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidFsetxattr(filedes: Int, name: Long, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidListxattr(path: Long, list: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidLlistxattr(path: Long, list: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidFlistxattr(filedes: Int, list: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidRemovexattr(path: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidLremovexattr(path: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidFremovexattr(filedes: Int, name: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSignalfd(fd: Int, mask: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidTimerfdCreate(clock: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidTimerfdGettime(fd: Int, currentValue: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidTimerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSyscall(num: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSchedGetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSchedSetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidEpollCreate(size: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidEpollCreate1(flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidEpollWait(epfd: Int, events: Long, maxevents: Int, timeout: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidEpollCtl(epfd: Int, op: Int, fd: Int, event: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidUnshare(flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidUmount(target: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSchedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidTee(fdIn: Int, fdOut: Int, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSettimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSplice(fdIn: Int, offIn: Long, fdOut: Int, offOut: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidEventfd(initval: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidEventfdRead(fd: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidEventfdWrite(fd: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSchedRrGetInterval(pid: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSemTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSemGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSchedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSetns(fd: Int, nstype: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSwapoff(puath: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidVmsplice(fd: Int, iov: Long, nrSegs: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidMount(src: Long, target: Long, fstype: Long, flags: Long, data: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidPersonality(persona: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidPrctl(option: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSchedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidPpoll(fds: Long, nfds: Int, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidClone(cb: Long, childStack: Long, flags: Int, arg: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSchedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidClockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSethostname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSchedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSysinfo(info: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidUmount2(target: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSwapon(path: Long, swapflags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSchedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSendfile(outFd: Int, inFd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSendfile64(outFd: Int, inFd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSetfsgid(gid: Short): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSetfsuid(uid: Short): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSigsuspend(mask: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSemClose(sem: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetgrnamR(name: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSemOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetgrnam(name: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSemUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidDaemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetgrgid(gid: Short): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetgrouplist(user: Long, group: Short, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidInitgroups(user: Long, group: Short): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidPopen(command: Long, mode: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidFaccessat(dirfd: Int, pathname: Long, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidErrno(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidInotifyRmWatch(fd: Int, wd: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidInotifyInit(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidInotifyInit1(flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidInotifyAddWatch(fd: Int, path: Long, mask: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidRegcomp(preg: Long, pattern: Long, cflags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidRegexec(preg: Long, input: Long, nmatch: Long, pmatch: Long, eflags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidRegerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidRegfree(preg: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidAndroidSetAbortMessage(msg: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGettid(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidTgkill(tgid: Int, tid: Int, sig: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetauxval(type: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSystemPropertySet(name: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSystemPropertyGet(name: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSystemPropertyFind(name: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSystemPropertyFindNth(n: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSystemPropertyForeach(callback: Long, cookie: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidDlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidArc4random(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidArc4randomUniform(upperBound: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidArc4randomBuf(buf: Long, n: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidReallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidDirname(path: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidBasename(path: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidGetoptLong(argc: Int, argv: Long, optstring: Long, longopts: Long, longindex: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSync()

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidSyncfs(fd: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidMemmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidFreadUnlocked(buf: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidFwriteUnlocked(buf: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidFflushUnlocked(stream: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidFgetsUnlocked(buf: Long, size: Int, stream: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidKlogctl(syslogType: Int, bufp: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidMemfdCreate(name: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidRenameat2(olddirfd: Int, oldpath: Long, newdirfd: Int, newpath: Long, flags: Int): Int
}

public actual fun setgrent() {
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSetgrent()
}

public actual fun endgrent() {
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidEndgrent()
}

public actual fun getgrent(): MutPtr =
    MutPtr(UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetgrent())

public actual fun getrlimit64(resource: CInt, rlim: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetrlimit64(resource, rlim.rawAddress)

public actual fun setrlimit64(resource: CInt, rlim: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSetrlimit64(resource, rlim.rawAddress)

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetrlimit(resource, rlim.rawAddress)

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSetrlimit(resource, rlim.rawAddress)

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: ConstPtr, oldLimit: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidPrlimit(pid, resource, newLimit.rawAddress, oldLimit.rawAddress)

public actual fun prlimit64(pid: PidT, resource: CInt, newLimit: ConstPtr, oldLimit: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidPrlimit64(pid, resource, newLimit.rawAddress, oldLimit.rawAddress)

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun mlock2(addr: ConstPtr, len: SizeT, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidMlock2(addr.rawAddress, len.toLong(), flags)

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidMsync(addr.rawAddress, len.toLong(), flags)

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SizeT, serv: MutPtr, servlen: SizeT, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toLong(), serv.rawAddress, servlen.toLong(), flags)

public actual fun preadv(fd: CInt, iov: ConstPtr, count: CInt, offset: OffT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidPreadv(fd, iov.rawAddress, count, offset)

public actual fun pwritev(fd: CInt, iov: ConstPtr, count: CInt, offset: OffT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidPwritev(fd, iov.rawAddress, count, offset)

public actual fun processVmReadv(pid: PidT, localIov: ConstPtr, localIovCount: CUlong, remoteIov: ConstPtr, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidProcessVmReadv(pid, localIov.rawAddress, localIovCount.toLong(), remoteIov.rawAddress, remoteIovCount.toLong(), flags.toLong())

public actual fun processVmWritev(pid: PidT, localIov: ConstPtr, localIovCount: CUlong, remoteIov: ConstPtr, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidProcessVmWritev(pid, localIov.rawAddress, localIovCount.toLong(), remoteIov.rawAddress, remoteIovCount.toLong(), flags.toLong())

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidPtrace(request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSetpriority(which, who.toInt(), prio)

public actual fun schedCpualloc(count: SizeT): MutPtr =
    MutPtr(UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSchedCpualloc(count.toLong()))

public actual fun schedCpufree(set: MutPtr) {
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSchedCpufree(set.rawAddress)
}

public actual fun schedCpucount(setsize: SizeT, set: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSchedCpucount(setsize.toLong(), set.rawAddress)

public actual fun schedGetcpu(): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSchedGetcpu()

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallocInfo(options: CInt, stream: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidMallocInfo(options, stream.rawAddress)

public actual fun mallocUsableSize(ptr: ConstPtr): SizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidMallocUsableSize(ptr.rawAddress).toULong()

public actual fun utmpname(name: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidUtmpname(name.rawAddress)

public actual fun setutent() {
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSetutent()
}

public actual fun getutent(): MutPtr =
    MutPtr(UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetutent())

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSeekdir(dirp.rawAddress, loc)
}

public actual fun telldir(dirp: MutPtr): CLong =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidTelldir(dirp.rawAddress)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidFallocate(fd, mode, offset, len)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidFallocate64(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidPosixFallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidPosixFallocate64(fd, offset, len)

public actual fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong())

public actual fun lgetxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidLgetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong())

public actual fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidFgetxattr(filedes, name.rawAddress, value.rawAddress, size.toLong())

public actual fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong(), flags)

public actual fun lsetxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidLsetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong(), flags)

public actual fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidFsetxattr(filedes, name.rawAddress, value.rawAddress, size.toLong(), flags)

public actual fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidListxattr(path.rawAddress, list.rawAddress, size.toLong())

public actual fun llistxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidLlistxattr(path.rawAddress, list.rawAddress, size.toLong())

public actual fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidFlistxattr(filedes, list.rawAddress, size.toLong())

public actual fun removexattr(path: ConstPtr, name: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidRemovexattr(path.rawAddress, name.rawAddress)

public actual fun lremovexattr(path: ConstPtr, name: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidLremovexattr(path.rawAddress, name.rawAddress)

public actual fun fremovexattr(filedes: CInt, name: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidFremovexattr(filedes, name.rawAddress)

public actual fun signalfd(fd: CInt, mask: ConstPtr, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSignalfd(fd, mask.rawAddress, flags)

public actual fun timerfdCreate(clock: ClockidT, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidTimerfdCreate(clock, flags)

public actual fun timerfdGettime(fd: CInt, currentValue: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidTimerfdGettime(fd, currentValue.rawAddress)

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidTimerfdSettime(fd, flags, newValue.rawAddress, oldValue.rawAddress)

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSyscall(num, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSchedGetaffinity(pid, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSchedSetaffinity(pid, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun epollCreate(size: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidEpollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidEpollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidEpollWait(epfd, events.rawAddress, maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidEpollCtl(epfd, op, fd, event.rawAddress)

public actual fun unshare(flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidUnshare(flags)

public actual fun umount(target: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidUmount(target.rawAddress)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSchedGetPriorityMax(policy)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidTee(fdIn, fdOut, len.toLong(), flags.toInt())

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSettimeofday(tv.rawAddress, tz.rawAddress)

public actual fun splice(fdIn: CInt, offIn: MutPtr, fdOut: CInt, offOut: MutPtr, len: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSplice(fdIn, offIn.rawAddress, fdOut, offOut.rawAddress, len.toLong(), flags.toInt())

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidEventfd(initval.toInt(), flags)

public actual fun eventfdRead(fd: CInt, value: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidEventfdRead(fd, value.rawAddress)

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidEventfdWrite(fd, value.toLong())

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSchedRrGetInterval(pid, tp.rawAddress)

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSemTimedwait(sem.rawAddress, abstime.rawAddress)

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSemGetvalue(sem.rawAddress, sval.rawAddress)

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSchedSetparam(pid, param.rawAddress)

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSetns(fd, nstype)

public actual fun swapoff(puath: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSwapoff(puath.rawAddress)

public actual fun vmsplice(fd: CInt, iov: ConstPtr, nrSegs: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidVmsplice(fd, iov.rawAddress, nrSegs.toLong(), flags.toInt())

public actual fun mount(src: ConstPtr, target: ConstPtr, fstype: ConstPtr, flags: CUlong, data: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidMount(src.rawAddress, target.rawAddress, fstype.rawAddress, flags.toLong(), data.rawAddress)

public actual fun personality(persona: CUint): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidPersonality(persona.toInt())

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidPrctl(option, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSchedGetparam(pid, param.rawAddress)

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidPpoll(fds.rawAddress, nfds.toInt(), timeout.rawAddress, sigmask.rawAddress)

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr, flags: CInt, arg: MutPtr, vararg variadicArgs: Long): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidClone(0L, childStack.rawAddress, flags, arg.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSchedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidClockNanosleep(clkId, flags, rqtp.rawAddress, rmtp.rawAddress)

public actual fun sethostname(name: ConstPtr, len: SizeT): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSethostname(name.rawAddress, len.toLong())

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSchedGetPriorityMin(policy)

public actual fun sysinfo(info: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSysinfo(info.rawAddress)

public actual fun umount2(target: ConstPtr, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidUmount2(target.rawAddress, flags)

public actual fun swapon(path: ConstPtr, swapflags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSwapon(path.rawAddress, swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSchedSetscheduler(pid, policy, param.rawAddress)

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSendfile(outFd, inFd, offset.rawAddress, count.toLong())

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSendfile64(outFd, inFd, offset.rawAddress, count.toLong())

public actual fun setfsgid(gid: GidT): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSetfsgid(gid.toShort())

public actual fun setfsuid(uid: UidT): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSetfsuid(uid.toShort())

public actual fun sigsuspend(mask: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSigsuspend(mask.rawAddress)

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetgrgidR(gid.toShort(), grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSigaltstack(ss.rawAddress, oss.rawAddress)

public actual fun semClose(sem: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSemClose(sem.rawAddress)

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetgrnamR(name.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSemOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun getgrnam(name: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetgrnam(name.rawAddress))

public actual fun semUnlink(name: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSemUnlink(name.rawAddress)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidDaemon(nochdir, noclose)

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSigtimedwait(set.rawAddress, info.rawAddress, timeout.rawAddress)

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSigwait(set.rawAddress, sig.rawAddress)

public actual fun getgrgid(gid: GidT): MutPtr =
    MutPtr(UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetgrgid(gid.toShort()))

public actual fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetgrouplist(user.rawAddress, group.toShort(), groups.rawAddress, ngroups.rawAddress)

public actual fun initgroups(user: ConstPtr, group: GidT): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidInitgroups(user.rawAddress, group.toShort())

public actual fun popen(command: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidPopen(command.rawAddress, mode.rawAddress))

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidFaccessat(dirfd, pathname.rawAddress, mode, flags)

public actual fun errno(): MutPtr =
    MutPtr(UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidErrno())

public actual fun inotifyRmWatch(fd: CInt, wd: UInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidInotifyRmWatch(fd, wd.toInt())

public actual fun inotifyInit(): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidInotifyInit()

public actual fun inotifyInit1(flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidInotifyInit1(flags)

public actual fun inotifyAddWatch(fd: CInt, path: ConstPtr, mask: UInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidInotifyAddWatch(fd, path.rawAddress, mask.toInt())

public actual fun regcomp(preg: MutPtr, pattern: ConstPtr, cflags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidRegcomp(preg.rawAddress, pattern.rawAddress, cflags)

public actual fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidRegexec(preg.rawAddress, input.rawAddress, nmatch.toLong(), pmatch.rawAddress, eflags)

public actual fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidRegerror(errcode, preg.rawAddress, errbuf.rawAddress, errbufSize.toLong()).toULong()

public actual fun regfree(preg: MutPtr) {
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidRegfree(preg.rawAddress)
}

public actual fun androidSetAbortMessage(msg: ConstPtr) {
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidAndroidSetAbortMessage(msg.rawAddress)
}

public actual fun gettid(): PidT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGettid()

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidTgkill(tgid, tid, sig)

public actual fun getauxval(type: CUlong): CUlong =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetauxval(type.toLong()).toULong()

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetrandom(buf.rawAddress, buflen.toLong(), flags.toInt())

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetentropy(buf.rawAddress, buflen.toLong())

public actual fun systemPropertySet(name: ConstPtr, value: ConstPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSystemPropertySet(name.rawAddress, value.rawAddress)

public actual fun systemPropertyGet(name: ConstPtr, value: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSystemPropertyGet(name.rawAddress, value.rawAddress)

public actual fun systemPropertyFind(name: ConstPtr): ConstPtr =
    ConstPtr(UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSystemPropertyFind(name.rawAddress))

public actual fun systemPropertyFindNth(n: CUint): ConstPtr =
    ConstPtr(UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSystemPropertyFindNth(n.toInt()))

public actual fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSystemPropertyForeach(0L, cookie.rawAddress)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidDlIteratePhdr(0L, data.rawAddress)

public actual fun arc4random(): UInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidArc4random().toUInt()

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidArc4randomUniform(upperBound.toInt()).toUInt()

public actual fun arc4randomBuf(buf: MutPtr, n: SizeT) {
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidArc4randomBuf(buf.rawAddress, n.toLong())
}

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    MutPtr(UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidReallocarray(ptr.rawAddress, nmemb.toLong(), size.toLong()))

public actual fun dirname(path: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidDirname(path.rawAddress))

public actual fun basename(path: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidBasename(path.rawAddress))

public actual fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidGetoptLong(argc, argv.rawAddress, optstring.rawAddress, longopts.rawAddress, longindex.rawAddress)

public actual fun sync() {
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSync()
}

public actual fun syncfs(fd: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidSyncfs(fd)

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    MutPtr(UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidMemmem(haystack.rawAddress, haystacklen.toLong(), needle.rawAddress, needlelen.toLong()))

public actual fun freadUnlocked(buf: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidFreadUnlocked(buf.rawAddress, size.toLong(), nobj.toLong(), stream.rawAddress).toULong()

public actual fun fwriteUnlocked(buf: ConstPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidFwriteUnlocked(buf.rawAddress, size.toLong(), nobj.toLong(), stream.rawAddress).toULong()

public actual fun fflushUnlocked(stream: MutPtr): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidFflushUnlocked(stream.rawAddress)

public actual fun fgetsUnlocked(buf: MutPtr, size: CInt, stream: MutPtr): MutPtr =
    MutPtr(UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidFgetsUnlocked(buf.rawAddress, size, stream.rawAddress))

public actual fun klogctl(syslogType: CInt, bufp: MutPtr, len: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidKlogctl(syslogType, bufp.rawAddress, len)

public actual fun memfdCreate(name: ConstPtr, flags: CUint): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidMemfdCreate(name.rawAddress, flags.toInt())

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CUint): CInt =
    UnixLinuxlikeAndroidJniBridge.libcUnixLinuxlikeAndroidRenameat2(olddirfd, oldpath.rawAddress, newdirfd, newpath.rawAddress, flags.toInt())
