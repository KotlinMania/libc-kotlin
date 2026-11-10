@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT

private object UnixLinuxlikeAndroidJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_linuxlike_android_setgrent()

    @JvmStatic
    external fun libc_unix_linuxlike_android_endgrent()

    @JvmStatic
    external fun libc_unix_linuxlike_android_getgrent(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_getrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_setrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_getrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_setrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_prlimit(pid: Int, resource: Int, newLimit: Long, oldLimit: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_prlimit64(pid: Int, resource: Int, newLimit: Long, oldLimit: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_strerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_mlock2(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_madvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_msync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_preadv(fd: Int, iov: Long, count: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_pwritev(fd: Int, iov: Long, count: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_processVmReadv(pid: Int, localIov: Long, localIovCount: Long, remoteIov: Long, remoteIovCount: Long, flags: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_processVmWritev(pid: Int, localIov: Long, localIovCount: Long, remoteIov: Long, remoteIovCount: Long, flags: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_getpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_setpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_schedCpualloc(count: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_schedCpufree(set: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_android_schedCpucount(setsize: Long, set: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_schedGetcpu(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_mallocInfo(options: Int, stream: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_mallocUsableSize(ptr: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_utmpname(name: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_setutent()

    @JvmStatic
    external fun libc_unix_linuxlike_android_getutent(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_seekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_android_telldir(dirp: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_fallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_posixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_posixFallocate64(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_getxattr(path: String?, name: String?, value: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_lgetxattr(path: String?, name: String?, value: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_fgetxattr(filedes: Int, name: String?, value: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_setxattr(path: String?, name: String?, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_lsetxattr(path: String?, name: String?, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_fsetxattr(filedes: Int, name: String?, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_listxattr(path: String?, list: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_llistxattr(path: String?, list: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_flistxattr(filedes: Int, list: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_removexattr(path: String?, name: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_lremovexattr(path: String?, name: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_fremovexattr(filedes: Int, name: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_signalfd(fd: Int, mask: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_timerfdCreate(clock: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_timerfdGettime(fd: Int, currentValue: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_timerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_schedGetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_schedSetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_epollCreate(size: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_epollCreate1(flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_epollWait(epfd: Int, events: Long, maxevents: Int, timeout: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_epollCtl(epfd: Int, op: Int, fd: Int, event: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_unshare(flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_umount(target: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_schedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_tee(fdIn: Int, fdOut: Int, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_settimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_splice(fdIn: Int, offIn: Long, fdOut: Int, offOut: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_eventfd(initval: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_eventfdRead(fd: Int, value: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_eventfdWrite(fd: Int, value: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_schedRrGetInterval(pid: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_semTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_semGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_schedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_setns(fd: Int, nstype: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_swapoff(puath: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_vmsplice(fd: Int, iov: Long, nrSegs: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_mount(src: String?, target: String?, fstype: String?, flags: Long, data: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_personality(persona: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_schedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_ppoll(fds: Long, nfds: Int, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_schedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_clockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_sethostname(name: String?, len: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_schedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_sysinfo(info: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_umount2(target: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_swapon(path: String?, swapflags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_schedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_sendfile(outFd: Int, inFd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_sendfile64(outFd: Int, inFd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_setfsgid(gid: Short): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_setfsuid(uid: Short): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_sigsuspend(mask: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_getgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_sigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_semClose(sem: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_getgrnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_semUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_daemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_sigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_sigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_getgrgid(gid: Short): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_getgrouplist(user: String?, group: Short, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_initgroups(user: String?, group: Short): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_popen(command: String?, mode: String?): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_errno(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_inotifyRmWatch(fd: Int, wd: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_inotifyInit(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_inotifyInit1(flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_inotifyAddWatch(fd: Int, path: String?, mask: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_regcomp(preg: Long, pattern: String?, cflags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_regexec(preg: Long, input: String?, nmatch: Long, pmatch: Long, eflags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_regerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_regfree(preg: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_android_androidSetAbortMessage(msg: String?)

    @JvmStatic
    external fun libc_unix_linuxlike_android_gettid(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_tgkill(tgid: Int, tid: Int, sig: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_getauxval(type: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_getrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_getentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_systemPropertySet(name: String?, value: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_systemPropertyGet(name: String?, value: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_systemPropertyFind(name: String?): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_systemPropertyFindNth(n: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_systemPropertyForeach(callback: Long, cookie: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_dlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_arc4random(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_arc4randomUniform(upperBound: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_arc4randomBuf(buf: Long, n: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_android_reallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_dirname(path: String?): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_basename(path: String?): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_getoptLong(argc: Int, argv: Long, optstring: String?, longopts: Long, longindex: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_sync()

    @JvmStatic
    external fun libc_unix_linuxlike_android_syncfs(fd: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_freadUnlocked(buf: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_fwriteUnlocked(buf: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_fflushUnlocked(stream: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_fgetsUnlocked(buf: Long, size: Int, stream: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_android_klogctl(syslogType: Int, bufp: Long, len: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_memfdCreate(name: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_android_renameat2(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int
}

public actual fun setgrent() {
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_setgrent()
}

public actual fun endgrent() {
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getgrent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getrlimit64(resource, (rlim?.value ?: 0L))

public actual fun setrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_setrlimit64(resource, (rlim?.value ?: 0L))

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getrlimit(resource, (rlim?.value ?: 0L))

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_setrlimit(resource, (rlim?.value ?: 0L))

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_prlimit(pid, resource, (newLimit?.value ?: 0L), (oldLimit?.value ?: 0L))

public actual fun prlimit64(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_prlimit64(pid, resource, (newLimit?.value ?: 0L), (oldLimit?.value ?: 0L))

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_strerrorR(errnum, (buf?.value ?: 0L), buflen.toLong())

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_mlock2((addr?.value ?: 0L), len.toLong(), flags)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_madvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_msync((addr?.value ?: 0L), len.toLong(), flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getnameinfo((sa?.value ?: 0L), salen.toInt(), (host?.value ?: 0L), hostlen.toLong(), (serv?.value ?: 0L), servlen.toLong(), flags)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_preadv(fd, (iov?.value ?: 0L), count, offset)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_pwritev(fd, (iov?.value ?: 0L), count, offset)

public actual fun processVmReadv(pid: PidT, localIov: COpaquePointer?, localIovCount: CUlong, remoteIov: COpaquePointer?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_processVmReadv(pid, (localIov?.value ?: 0L), localIovCount.toLong(), (remoteIov?.value ?: 0L), remoteIovCount.toLong(), flags.toLong())

public actual fun processVmWritev(pid: PidT, localIov: COpaquePointer?, localIovCount: CUlong, remoteIov: COpaquePointer?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_processVmWritev(pid, (localIov?.value ?: 0L), localIovCount.toLong(), (remoteIov?.value ?: 0L), remoteIovCount.toLong(), flags.toLong())

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    0L

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_setpriority(which, who.toInt(), prio)

public actual fun schedCpualloc(count: SizeT): COpaquePointer? =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_schedCpualloc(count.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun schedCpufree(set: COpaquePointer?) {
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_schedCpufree((set?.value ?: 0L))
}

public actual fun schedCpucount(setsize: SizeT, set: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_schedCpucount(setsize.toLong(), (set?.value ?: 0L))

public actual fun schedGetcpu(): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_schedGetcpu()

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_mallocInfo(options, (stream?.handle ?: 0L))

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_mallocUsableSize((ptr?.value ?: 0L)).toULong()

public actual fun utmpname(name: String?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_utmpname(name)

public actual fun setutent() {
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_setutent()
}

public actual fun getutent(): COpaquePointer? =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getutent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_seekdir((dirp?.handle ?: 0L), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_telldir((dirp?.handle ?: 0L))

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_fallocate(fd, mode, offset, len)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_fallocate64(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_posixFallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_posixFallocate64(fd, offset, len)

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getxattr(path, name, (value?.value ?: 0L), size.toLong())

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_lgetxattr(path, name, (value?.value ?: 0L), size.toLong())

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_fgetxattr(filedes, name, (value?.value ?: 0L), size.toLong())

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_setxattr(path, name, (value?.value ?: 0L), size.toLong(), flags)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_lsetxattr(path, name, (value?.value ?: 0L), size.toLong(), flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_fsetxattr(filedes, name, (value?.value ?: 0L), size.toLong(), flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_listxattr(path, (list?.value ?: 0L), size.toLong())

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_llistxattr(path, (list?.value ?: 0L), size.toLong())

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_flistxattr(filedes, (list?.value ?: 0L), size.toLong())

public actual fun removexattr(path: String?, name: String?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_lremovexattr(path, name)

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_fremovexattr(filedes, name)

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_signalfd(fd, (mask?.value ?: 0L), flags)

public actual fun timerfdCreate(clock: ClockidT, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_timerfdCreate(clock, flags)

public actual fun timerfdGettime(fd: CInt, currentValue: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_timerfdGettime(fd, (currentValue?.value ?: 0L))

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_timerfdSettime(fd, flags, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    0L

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_schedGetaffinity(pid, cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_schedSetaffinity(pid, cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun epollCreate(size: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_epollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_epollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_epollWait(epfd, (events?.value ?: 0L), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_epollCtl(epfd, op, fd, (event?.value ?: 0L))

public actual fun unshare(flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_unshare(flags)

public actual fun umount(target: String?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_umount(target)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_schedGetPriorityMax(policy)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_tee(fdIn, fdOut, len.toLong(), flags.toInt())

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_settimeofday((tv?.value ?: 0L), (tz?.value ?: 0L))

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_splice(fdIn, (offIn?.value ?: 0L), fdOut, (offOut?.value ?: 0L), len.toLong(), flags.toInt())

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_eventfd(initval.toInt(), flags)

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_eventfdRead(fd, (value?.value ?: 0L))

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_eventfdWrite(fd, value.toLong())

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_schedRrGetInterval(pid, (tp?.value ?: 0L))

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_semTimedwait((sem?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_semGetvalue((sem?.value ?: 0L), (sval?.value ?: 0L))

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_schedSetparam(pid, (param?.value ?: 0L))

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_setns(fd, nstype)

public actual fun swapoff(puath: String?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_swapoff(puath)

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_vmsplice(fd, (iov?.value ?: 0L), nrSegs.toLong(), flags.toInt())

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_mount(src, target, fstype, flags.toLong(), (data?.value ?: 0L))

public actual fun personality(persona: CUint): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_personality(persona.toInt())

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_schedGetparam(pid, (param?.value ?: 0L))

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_ppoll((fds?.value ?: 0L), nfds.toInt(), (timeout?.value ?: 0L), (sigmask?.value ?: 0L))

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt =
    0

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_schedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L), (rmtp?.value ?: 0L))

public actual fun sethostname(name: String?, len: SizeT): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_sethostname(name, len.toLong())

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_schedGetPriorityMin(policy)

public actual fun sysinfo(info: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_sysinfo((info?.value ?: 0L))

public actual fun umount2(target: String?, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_umount2(target, flags)

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_swapon(path, swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_schedSetscheduler(pid, policy, (param?.value ?: 0L))

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_sendfile(outFd, inFd, (offset?.value ?: 0L), count.toLong())

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_sendfile64(outFd, inFd, (offset?.value ?: 0L), count.toLong())

public actual fun setfsgid(gid: GidT): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_setfsgid(gid.toShort())

public actual fun setfsuid(uid: UidT): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_setfsuid(uid.toShort())

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_sigsuspend((mask?.value ?: 0L))

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getgrgidR(gid.toShort(), (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_sigaltstack((ss?.value ?: 0L), (oss?.value ?: 0L))

public actual fun semClose(sem: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_semClose((sem?.value ?: 0L))

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getgrnamR(name, (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getgrnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun semUnlink(name: String?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_daemon(nochdir, noclose)

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_sigtimedwait((set?.value ?: 0L), (info?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_sigwait((set?.value ?: 0L), (sig?.value ?: 0L))

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getgrgid(gid.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getgrouplist(user, group.toShort(), (groups?.value ?: 0L), (ngroups?.value ?: 0L))

public actual fun initgroups(user: String?, group: GidT): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_initgroups(user, group.toShort())

public actual fun popen(command: String?, mode: String?): FILE? =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_popen(command, mode).let { if (it == 0L) null else FILE(it) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_faccessat(dirfd, pathname, mode, flags)

public actual fun errno(): COpaquePointer? =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_errno().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun inotifyRmWatch(fd: CInt, wd: UInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_inotifyRmWatch(fd, wd.toInt())

public actual fun inotifyInit(): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_inotifyInit()

public actual fun inotifyInit1(flags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_inotifyInit1(flags)

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_inotifyAddWatch(fd, path, mask.toInt())

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_regcomp((preg?.value ?: 0L), pattern, cflags)

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_regexec((preg?.value ?: 0L), input, nmatch.toLong(), (pmatch?.value ?: 0L), eflags)

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_regerror(errcode, (preg?.value ?: 0L), (errbuf?.value ?: 0L), errbufSize.toLong()).toULong()

public actual fun regfree(preg: COpaquePointer?) {
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_regfree((preg?.value ?: 0L))
}

public actual fun androidSetAbortMessage(msg: String?) {
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_androidSetAbortMessage(msg)
}

public actual fun gettid(): PidT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_gettid()

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_tgkill(tgid, tid, sig)

public actual fun getauxval(type: CUlong): CUlong =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getauxval(type.toLong()).toULong()

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getrandom((buf?.value ?: 0L), buflen.toLong(), flags.toInt())

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getentropy((buf?.value ?: 0L), buflen.toLong())

public actual fun systemPropertySet(name: String?, value: String?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_systemPropertySet(name, value)

public actual fun systemPropertyGet(name: String?, value: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_systemPropertyGet(name, (value?.value ?: 0L))

public actual fun systemPropertyFind(name: String?): COpaquePointer? =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_systemPropertyFind(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun systemPropertyFindNth(n: CUint): COpaquePointer? =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_systemPropertyFindNth(n.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_systemPropertyForeach(0L, (cookie?.value ?: 0L))

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_dlIteratePhdr(0L, (data?.value ?: 0L))

public actual fun arc4random(): UInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_arc4random().toUInt()

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_arc4randomUniform(upperBound.toInt()).toUInt()

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_arc4randomBuf((buf?.value ?: 0L), n.toLong())
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_reallocarray((ptr?.value ?: 0L), nmemb.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dirname(path: String?): COpaquePointer? =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_dirname(path).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: String?): COpaquePointer? =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_basename(path).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_getoptLong(argc, (argv?.value ?: 0L), optstring, (longopts?.value ?: 0L), (longindex?.value ?: 0L))

public actual fun sync() {
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_sync()
}

public actual fun syncfs(fd: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_syncfs(fd)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_memmem((haystack?.value ?: 0L), haystacklen.toLong(), (needle?.value ?: 0L), needlelen.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_freadUnlocked((buf?.value ?: 0L), size.toLong(), nobj.toLong(), (stream?.handle ?: 0L)).toULong()

public actual fun fwriteUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_fwriteUnlocked((buf?.value ?: 0L), size.toLong(), nobj.toLong(), (stream?.handle ?: 0L)).toULong()

public actual fun fflushUnlocked(stream: FILE?): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_fflushUnlocked((stream?.handle ?: 0L))

public actual fun fgetsUnlocked(buf: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_fgetsUnlocked((buf?.value ?: 0L), size, (stream?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_klogctl(syslogType, (bufp?.value ?: 0L), len)

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_memfdCreate(name, flags.toInt())

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    UnixLinuxlikeAndroidJniBridge.libc_unix_linuxlike_android_renameat2(olddirfd, oldpath, newdirfd, newpath, flags.toInt())
