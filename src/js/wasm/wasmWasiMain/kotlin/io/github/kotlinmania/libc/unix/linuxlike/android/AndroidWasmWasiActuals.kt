@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android

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

public actual fun setgrent() {
}

public actual fun endgrent() {
}

public actual fun getgrent(): COpaquePointer? =
    null

public actual fun getrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun setrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    0

public actual fun prlimit64(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    0

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    0

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    0

public actual fun preadv(fd: CInt, iov: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    0L

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    0L

public actual fun processVmReadv(pid: PidT, localIov: COpaquePointer?, localIovCount: CUlong, remoteIov: COpaquePointer?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    0L

public actual fun processVmWritev(pid: PidT, localIov: COpaquePointer?, localIovCount: CUlong, remoteIov: COpaquePointer?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    0L

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    0L

public actual fun getpriority(which: CInt, who: IdT): CInt =
    0

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    0

public actual fun schedCpualloc(count: SizeT): COpaquePointer? =
    null

public actual fun schedCpufree(set: COpaquePointer?) {
}

public actual fun schedCpucount(setsize: SizeT, set: COpaquePointer?): CInt =
    0

public actual fun schedGetcpu(): CInt =
    0

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    0

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    0uL

public actual fun utmpname(name: String?): CInt =
    0

public actual fun setutent() {
}

public actual fun getutent(): COpaquePointer? =
    null

public actual fun seekdir(dirp: DIR?, loc: CLong) {
}

public actual fun telldir(dirp: DIR?): CLong =
    0L

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    0

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    0

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    0

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    0

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    0L

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    0L

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    0L

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    0

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    0

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    0

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    0L

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    0L

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    0L

public actual fun removexattr(path: String?, name: String?): CInt =
    0

public actual fun lremovexattr(path: String?, name: String?): CInt =
    0

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    0

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun timerfdCreate(clock: ClockidT, flags: CInt): CInt =
    0

public actual fun timerfdGettime(fd: CInt, currentValue: COpaquePointer?): CInt =
    0

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    0

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    0L

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    0

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    0

public actual fun epollCreate(size: CInt): CInt =
    0

public actual fun epollCreate1(flags: CInt): CInt =
    0

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    0

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    0

public actual fun unshare(flags: CInt): CInt =
    0

public actual fun umount(target: String?): CInt =
    0

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    0

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    0L

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    0L

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    0

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    0

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    0

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    0

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    0

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    0

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    0

public actual fun swapoff(puath: String?): CInt =
    0

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    0L

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    0

public actual fun personality(persona: CUint): CInt =
    0

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    0

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    0

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt =
    0

public actual fun schedGetscheduler(pid: PidT): CInt =
    0

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    0

public actual fun sethostname(name: String?, len: SizeT): CInt =
    0

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    0

public actual fun sysinfo(info: COpaquePointer?): CInt =
    0

public actual fun umount2(target: String?, flags: CInt): CInt =
    0

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    0

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    0

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    0L

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    0L

public actual fun setfsgid(gid: GidT): CInt =
    0

public actual fun setfsuid(uid: UidT): CInt =
    0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    0

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    0

public actual fun semClose(sem: COpaquePointer?): CInt =
    0

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    null

public actual fun semUnlink(name: String?): CInt =
    0

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    0

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    0

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    null

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    0

public actual fun initgroups(user: String?, group: GidT): CInt =
    0

public actual fun popen(command: String?, mode: String?): FILE? =
    null

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    0

public actual fun errno(): COpaquePointer? =
    null

public actual fun inotifyRmWatch(fd: CInt, wd: UInt): CInt =
    0

public actual fun inotifyInit(): CInt =
    0

public actual fun inotifyInit1(flags: CInt): CInt =
    0

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    0

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    0

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    0

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    0uL

public actual fun regfree(preg: COpaquePointer?) {
}

public actual fun androidSetAbortMessage(msg: String?) {
}

public actual fun gettid(): PidT =
    0

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    0

public actual fun getauxval(type: CUlong): CUlong =
    0uL

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    0L

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun systemPropertySet(name: String?, value: String?): CInt =
    0

public actual fun systemPropertyGet(name: String?, value: COpaquePointer?): CInt =
    0

public actual fun systemPropertyFind(name: String?): COpaquePointer? =
    null

public actual fun systemPropertyFindNth(n: CUint): COpaquePointer? =
    null

public actual fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: COpaquePointer?): CInt =
    0

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    0

public actual fun arc4random(): UInt =
    0u

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    0u

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun dirname(path: String?): COpaquePointer? =
    null

public actual fun basename(path: String?): COpaquePointer? =
    null

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    0

public actual fun sync() {
}

public actual fun syncfs(fd: CInt): CInt =
    0

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    null

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    0uL

public actual fun fwriteUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    0uL

public actual fun fflushUnlocked(stream: FILE?): CInt =
    0

public actual fun fgetsUnlocked(buf: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    null

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    0

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    0

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    0
