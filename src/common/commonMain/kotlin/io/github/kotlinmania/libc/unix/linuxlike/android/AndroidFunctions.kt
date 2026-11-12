package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Sysinfo
import io.github.kotlinmania.libc.unix.linuxlike.cmsgAlign
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Cmsghdr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Msghdr
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface CloneCbCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): CInt
}

public fun interface SystemPropertyForeachCallbackCallback {
    public operator fun invoke(pi: ConstPtr<PropInfo>, cookie: MutPtr<CVoid>)
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr<DlPhdrInfo>, size: ULong, data: MutPtr<CVoid>): CInt
}

// Most `* _SUPER_MAGIC` constants are defined at the `linuxLike` level; the
// following are only available on newer Linux versions than the versions
// currently used in CI in some configurations, so we define them here.
public fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> {
    val next = MutPtr<Cmsghdr>((cmsg.rawAddress.toInt() + cmsgAlign(((ObjectSlotLayout<Cmsghdr>()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    val max = ((ObjectSlotLayout<Msghdr>()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((ObjectSlotLayout<Msghdr>()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if ((MutPtr((next).rawAddress + ((1).toLong() * (ObjectSlotLayout<Cmsghdr>()).strideBytes))).rawAddress.toInt() > max) {
        MutPtr<Cmsghdr>(0L)
    } else {
        next
    }
}

public fun cpuAllocSize(count: CInt): SizeT {
    val dummy: CpuSetT? = null
    val sizeInBits = 8 * sizeOfVal(dummy!!.bits[0])
    return ((count.toULong() + sizeInBits.toULong() - 1uL) / 8uL)
}

public fun cpuZero(cpuset: CpuSetT) {
    for (idx in cpuset.bits.indices) {
        cpuset.bits[idx] = 0uL
    }
}

public fun cpuSet(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0])
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] or (1uL shl offset)
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0])
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] and (1uL shl offset).inv()
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0])
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    return 0uL != (cpuset.bits[idx] and (1uL shl offset))
}

public fun cpuCountS(size: Int, cpuset: CpuSetT): CInt {
    var s: UInt = 0u
    val sizeOfMask = sizeOfVal(cpuset.bits[0])
    for (i in ((cpuset.bits).slice(0 until (size / sizeOfMask)))) {
        s += i.countOneBits().toUInt()
    }
    return s.toInt()
}

public fun cpuCount(cpuset: CpuSetT): CInt = cpuCountS(sizeOf<CpuSetT>(typeLayoutT = ObjectSlotLayout<CpuSetT>()), cpuset)

public fun cpuEqual(set1: CpuSetT, set2: CpuSetT): Boolean = set1.bits.contentEquals(set2.bits)

public fun nlaAlign(len: CInt): CInt = ((len) + NLA_ALIGNTO - 1) and (NLA_ALIGNTO - 1).inv()

public fun soEeOffender(ee: ConstPtr<SockExtendedErr>): MutPtr<Sockaddr> = MutPtr<Sockaddr>(ConstPtr((ee).rawAddress + ((1).toLong() * (SockExtendedErr.typeLayout()).strideBytes)).rawAddress, ConstPtr((ee).rawAddress + ((1).toLong() * (SockExtendedErr.typeLayout()).strideBytes)).rawMeta)

public fun makedev(ma: CUint, mi: CUint): DevT {
    val ma1 = ma.toULong()
    val mi1 = mi.toULong()
    return ((ma1 and 0xfffuL) shl 8) or (mi1 and 0xffuL) or ((mi1 and 0xfff00uL) shl 12)
}

public fun major(dev: DevT): CInt = ((dev shr 8) and 0xfffuL).toInt()

public fun minor(dev: DevT): CInt = ((dev and 0xffuL) or ((dev shr 12) and 0xfff00uL)).toInt()

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): MutPtr<Group>

public expect fun getrlimit64(resource: CInt, rlim: MutPtr<Rlimit64>): CInt

public expect fun setrlimit64(resource: CInt, rlim: ConstPtr<Rlimit64>): CInt

public expect fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt

public expect fun prlimit(pid: PidT, resource: CInt, newLimit: ConstPtr<Rlimit>, oldLimit: MutPtr<Rlimit>): CInt

public expect fun prlimit64(pid: PidT, resource: CInt, newLimit: ConstPtr<Rlimit64>, oldLimit: MutPtr<Rlimit64>): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt

public expect fun mlock2(addr: ConstPtr<CVoid>, len: SizeT, flags: CInt): CInt

public expect fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt

public expect fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt

public expect fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt

public expect fun preadv(fd: CInt, iov: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT

public expect fun processVmReadv(pid: PidT, localIov: ConstPtr<Iovec>, localIovCount: CUlong, remoteIov: ConstPtr<Iovec>, remoteIovCount: CUlong, flags: CUlong): SsizeT

public expect fun processVmWritev(pid: PidT, localIov: ConstPtr<Iovec>, localIovCount: CUlong, remoteIov: ConstPtr<Iovec>, remoteIovCount: CUlong, flags: CUlong): SsizeT

public expect fun ptrace(request: CInt, vararg variadicArgs: Long): CLong

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun schedCpualloc(count: SizeT): MutPtr<CpuSetT>

public expect fun schedCpufree(set: MutPtr<CpuSetT>)

public expect fun schedCpucount(setsize: SizeT, set: ConstPtr<CpuSetT>): CInt

public expect fun schedGetcpu(): CInt

public expect fun mallinfo(): Mallinfo

// available from API 23
public expect fun mallocInfo(options: CInt, stream: MutPtr<FILE>): CInt

public expect fun mallocUsableSize(ptr: ConstPtr<CVoid>): SizeT

public expect fun utmpname(name: ConstPtr<CChar>): CInt

public expect fun setutent()

public expect fun getutent(): MutPtr<Utmp>

public expect fun seekdir(dirp: MutPtr<DIR>, loc: CLong)

public expect fun telldir(dirp: MutPtr<DIR>): CLong

public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt

public expect fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt

public expect fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT

public expect fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT

public expect fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT

public expect fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt

public expect fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt

public expect fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt

public expect fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT

public expect fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT

public expect fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT

public expect fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt

public expect fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt

public expect fun fremovexattr(filedes: CInt, name: ConstPtr<CChar>): CInt

public expect fun signalfd(fd: CInt, mask: ConstPtr<SigsetT>, flags: CInt): CInt

public expect fun timerfdCreate(clock: ClockidT, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currentValue: MutPtr<Itimerspec>): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt

public expect fun syscall(num: CLong, vararg variadicArgs: Long): CLong

public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt

public expect fun epollCreate(size: CInt): CInt

public expect fun epollCreate1(flags: CInt): CInt

public expect fun epollWait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt): CInt

public expect fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr<EpollEvent>): CInt

public expect fun unshare(flags: CInt): CInt

public expect fun umount(target: ConstPtr<CChar>): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT

public expect fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt

public expect fun splice(fdIn: CInt, offIn: MutPtr<LoffT>, fdOut: CInt, offOut: MutPtr<LoffT>, len: SizeT, flags: CUint): SsizeT

public expect fun eventfd(initval: CUint, flags: CInt): CInt

public expect fun eventfdRead(fd: CInt, value: MutPtr<EventfdT>): CInt

public expect fun eventfdWrite(fd: CInt, value: EventfdT): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt

public expect fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt

public expect fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt

public expect fun setns(fd: CInt, nstype: CInt): CInt

public expect fun swapoff(puath: ConstPtr<CChar>): CInt

public expect fun vmsplice(fd: CInt, iov: ConstPtr<Iovec>, nrSegs: SizeT, flags: CUint): SsizeT

public expect fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, fstype: ConstPtr<CChar>, flags: CUlong, data: ConstPtr<CVoid>): CInt

public expect fun personality(persona: CUint): CInt

public expect fun prctl(option: CInt, vararg variadicArgs: Long): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt

public expect fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt

public expect fun clone(cb: CloneCbCallback, childStack: MutPtr<CVoid>, flags: CInt, arg: MutPtr<CVoid>, vararg variadicArgs: Long): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt

public expect fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun sysinfo(info: MutPtr<Sysinfo>): CInt

public expect fun umount2(target: ConstPtr<CChar>, flags: CInt): CInt

public expect fun swapon(path: ConstPtr<CChar>, swapflags: CInt): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr<OffT>, count: SizeT): SsizeT

public expect fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr<Off64T>, count: SizeT): SsizeT

public expect fun setfsgid(gid: GidT): CInt

public expect fun setfsuid(uid: UidT): CInt

public expect fun sigsuspend(mask: ConstPtr<SigsetT>): CInt

public expect fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt

public expect fun semClose(sem: MutPtr<SemT>): CInt

public expect fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT>

public expect fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group>

public expect fun semUnlink(name: ConstPtr<CChar>): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt

public expect fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt

public expect fun getgrgid(gid: GidT): MutPtr<Group>

public expect fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt

public expect fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt

public expect fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt

public expect fun errno(): MutPtr<CInt>

public expect fun inotifyRmWatch(fd: CInt, wd: UInt): CInt

public expect fun inotifyInit(): CInt

public expect fun inotifyInit1(flags: CInt): CInt

public expect fun inotifyAddWatch(fd: CInt, path: ConstPtr<CChar>, mask: UInt): CInt

public expect fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt

public expect fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT

public expect fun regfree(preg: MutPtr<RegexT>)

public expect fun androidSetAbortMessage(msg: ConstPtr<CChar>)

public expect fun gettid(): PidT

public expect fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt

public expect fun getauxval(type: CUlong): CUlong

/**
 * Only available in API Version 28+
 */
public expect fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT

public expect fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt

public expect fun systemPropertySet(name: ConstPtr<CChar>, value: ConstPtr<CChar>): CInt

public expect fun systemPropertyGet(name: ConstPtr<CChar>, value: MutPtr<CChar>): CInt

public expect fun systemPropertyFind(name: ConstPtr<CChar>): ConstPtr<PropInfo>

public expect fun systemPropertyFindNth(n: CUint): ConstPtr<PropInfo>

public expect fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: MutPtr<CVoid>): CInt

// #include <link.h>

/**
 * Only available in API Version 21+
 */
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt

public expect fun arc4random(): UInt

public expect fun arc4randomUniform(upperBound: UInt): UInt

public expect fun arc4randomBuf(buf: MutPtr<CVoid>, n: SizeT)

public expect fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun dirname(path: ConstPtr<CChar>): MutPtr<CChar>

public expect fun basename(path: ConstPtr<CChar>): MutPtr<CChar>

public expect fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt

public expect fun sync()

public expect fun syncfs(fd: CInt): CInt

public expect fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid>

public expect fun freadUnlocked(buf: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT

public expect fun fwriteUnlocked(buf: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT

public expect fun fflushUnlocked(stream: MutPtr<FILE>): CInt

public expect fun fgetsUnlocked(buf: MutPtr<CChar>, size: CInt, stream: MutPtr<FILE>): MutPtr<CChar>

public expect fun klogctl(syslogType: CInt, bufp: MutPtr<CChar>, len: CInt): CInt

public expect fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt

public expect fun renameat2(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CUint): CInt
