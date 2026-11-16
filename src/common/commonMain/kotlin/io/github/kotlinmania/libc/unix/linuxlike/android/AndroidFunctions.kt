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
import io.github.kotlinmania.libc.unix.linuxlike.cmsgAlign
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Cmsghdr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Msghdr
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface CloneCbCallback {
    public operator fun invoke(arg0: MutPtr): CInt
}

public fun interface SystemPropertyForeachCallbackCallback {
    public operator fun invoke(pi: ConstPtr, cookie: MutPtr)
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr, size: ULong, data: MutPtr): CInt
}

// Most `* _SUPER_MAGIC` constants are defined at the `linuxLike` level; the
// following are only available on newer Linux versions than the versions
// currently used in CI in some configurations, so we define them here.
public fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr {
    val next = MutPtr((cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if ((MutPtr((next).rawAddress + ((1).toLong() * (Cmsghdr.typeLayout()).strideBytes))).rawAddress.toInt() > max) {
        MutPtr(0L)
    } else {
        next
    }
}

public fun cpuAllocSize(count: CInt): SizeT {
    val dummy: CpuSetT? = null
    val sizeInBits = 8 * sizeOfVal(dummy!!.bits[0], PrimitiveLayouts.U64)
    return ((count.toULong() + sizeInBits.toULong() - 1uL) / 8uL)
}

public fun cpuZero(cpuset: CpuSetT) {
    for (idx in cpuset.bits.indices) {
        cpuset.bits[idx] = 0uL
    }
}

public fun cpuSet(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] or (1uL shl offset)
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] and (1uL shl offset).inv()
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    return 0uL != (cpuset.bits[idx] and (1uL shl offset))
}

public fun cpuCountS(size: Int, cpuset: CpuSetT): CInt {
    var s: UInt = 0u
    val sizeOfMask = sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    for (i in ((cpuset.bits).slice(0 until (size / sizeOfMask)))) {
        s += i.countOneBits().toUInt()
    }
    return s.toInt()
}

public fun cpuCount(cpuset: CpuSetT): CInt = cpuCountS(sizeOf<CpuSetT>(typeLayoutT = CpuSetT.typeLayout()), cpuset)

public fun cpuEqual(set1: CpuSetT, set2: CpuSetT): Boolean = set1.bits.contentEquals(set2.bits)

public fun nlaAlign(len: CInt): CInt = ((len) + NLA_ALIGNTO - 1) and (NLA_ALIGNTO - 1).inv()

public fun soEeOffender(ee: ConstPtr): MutPtr = MutPtr(ConstPtr((ee).rawAddress + ((1).toLong() * (SockExtendedErr.typeLayout()).strideBytes)).rawAddress, ConstPtr((ee).rawAddress + ((1).toLong() * (SockExtendedErr.typeLayout()).strideBytes)).rawMeta)

public fun makedev(ma: CUint, mi: CUint): DevT {
    val ma1 = ma.toULong()
    val mi1 = mi.toULong()
    return ((ma1 and 0xfffuL) shl 8) or (mi1 and 0xffuL) or ((mi1 and 0xfff00uL) shl 12)
}

public fun major(dev: DevT): CInt = ((dev shr 8) and 0xfffuL).toInt()

public fun minor(dev: DevT): CInt = ((dev and 0xffuL) or ((dev shr 12) and 0xfff00uL)).toInt()

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): MutPtr

public expect fun getrlimit64(resource: CInt, rlim: MutPtr): CInt

public expect fun setrlimit64(resource: CInt, rlim: ConstPtr): CInt

public expect fun getrlimit(resource: CInt, rlim: MutPtr): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr): CInt

public expect fun prlimit(pid: PidT, resource: CInt, newLimit: ConstPtr, oldLimit: MutPtr): CInt

public expect fun prlimit64(pid: PidT, resource: CInt, newLimit: ConstPtr, oldLimit: MutPtr): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun mlock2(addr: ConstPtr, len: SizeT, flags: CInt): CInt

public expect fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SizeT, serv: MutPtr, servlen: SizeT, flags: CInt): CInt

public expect fun preadv(fd: CInt, iov: ConstPtr, count: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iov: ConstPtr, count: CInt, offset: OffT): SsizeT

public expect fun processVmReadv(pid: PidT, localIov: ConstPtr, localIovCount: CUlong, remoteIov: ConstPtr, remoteIovCount: CUlong, flags: CUlong): SsizeT

public expect fun processVmWritev(pid: PidT, localIov: ConstPtr, localIovCount: CUlong, remoteIov: ConstPtr, remoteIovCount: CUlong, flags: CUlong): SsizeT

public expect fun ptrace(request: CInt, vararg variadicArgs: Long): CLong

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun schedCpualloc(count: SizeT): MutPtr

public expect fun schedCpufree(set: MutPtr)

public expect fun schedCpucount(setsize: SizeT, set: ConstPtr): CInt

public expect fun schedGetcpu(): CInt

public expect fun mallinfo(): Mallinfo

// available from API 23
public expect fun mallocInfo(options: CInt, stream: MutPtr): CInt

public expect fun mallocUsableSize(ptr: ConstPtr): SizeT

public expect fun utmpname(name: ConstPtr): CInt

public expect fun setutent()

public expect fun getutent(): MutPtr

public expect fun seekdir(dirp: MutPtr, loc: CLong)

public expect fun telldir(dirp: MutPtr): CLong

public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt

public expect fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt

public expect fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT

public expect fun lgetxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT

public expect fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT

public expect fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt

public expect fun lsetxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt

public expect fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt

public expect fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT

public expect fun llistxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT

public expect fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT): SsizeT

public expect fun removexattr(path: ConstPtr, name: ConstPtr): CInt

public expect fun lremovexattr(path: ConstPtr, name: ConstPtr): CInt

public expect fun fremovexattr(filedes: CInt, name: ConstPtr): CInt

public expect fun signalfd(fd: CInt, mask: ConstPtr, flags: CInt): CInt

public expect fun timerfdCreate(clock: ClockidT, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currentValue: MutPtr): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt

public expect fun syscall(num: CLong, vararg variadicArgs: Long): CLong

public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr): CInt

public expect fun epollCreate(size: CInt): CInt

public expect fun epollCreate1(flags: CInt): CInt

public expect fun epollWait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt): CInt

public expect fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr): CInt

public expect fun unshare(flags: CInt): CInt

public expect fun umount(target: ConstPtr): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT

public expect fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt

public expect fun splice(fdIn: CInt, offIn: MutPtr, fdOut: CInt, offOut: MutPtr, len: SizeT, flags: CUint): SsizeT

public expect fun eventfd(initval: CUint, flags: CInt): CInt

public expect fun eventfdRead(fd: CInt, value: MutPtr): CInt

public expect fun eventfdWrite(fd: CInt, value: EventfdT): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: MutPtr): CInt

public expect fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt

public expect fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr): CInt

public expect fun setns(fd: CInt, nstype: CInt): CInt

public expect fun swapoff(puath: ConstPtr): CInt

public expect fun vmsplice(fd: CInt, iov: ConstPtr, nrSegs: SizeT, flags: CUint): SsizeT

public expect fun mount(src: ConstPtr, target: ConstPtr, fstype: ConstPtr, flags: CUlong, data: ConstPtr): CInt

public expect fun personality(persona: CUint): CInt

public expect fun prctl(option: CInt, vararg variadicArgs: Long): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr): CInt

public expect fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt

public expect fun clone(cb: CloneCbCallback, childStack: MutPtr, flags: CInt, arg: MutPtr, vararg variadicArgs: Long): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt

public expect fun sethostname(name: ConstPtr, len: SizeT): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun sysinfo(info: MutPtr): CInt

public expect fun umount2(target: ConstPtr, flags: CInt): CInt

public expect fun swapon(path: ConstPtr, swapflags: CInt): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt

public expect fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT

public expect fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT

public expect fun setfsgid(gid: GidT): CInt

public expect fun setfsuid(uid: UidT): CInt

public expect fun sigsuspend(mask: ConstPtr): CInt

public expect fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt

public expect fun semClose(sem: MutPtr): CInt

public expect fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr

public expect fun getgrnam(name: ConstPtr): MutPtr

public expect fun semUnlink(name: ConstPtr): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt

public expect fun sigwait(set: ConstPtr, sig: MutPtr): CInt

public expect fun getgrgid(gid: GidT): MutPtr

public expect fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt

public expect fun initgroups(user: ConstPtr, group: GidT): CInt

public expect fun popen(command: ConstPtr, mode: ConstPtr): MutPtr

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt

public expect fun errno(): MutPtr

public expect fun inotifyRmWatch(fd: CInt, wd: UInt): CInt

public expect fun inotifyInit(): CInt

public expect fun inotifyInit1(flags: CInt): CInt

public expect fun inotifyAddWatch(fd: CInt, path: ConstPtr, mask: UInt): CInt

public expect fun regcomp(preg: MutPtr, pattern: ConstPtr, cflags: CInt): CInt

public expect fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT

public expect fun regfree(preg: MutPtr)

public expect fun androidSetAbortMessage(msg: ConstPtr)

public expect fun gettid(): PidT

public expect fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt

public expect fun getauxval(type: CUlong): CUlong

/**
 * Only available in API Version 28+
 */
public expect fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT

public expect fun getentropy(buf: MutPtr, buflen: SizeT): CInt

public expect fun systemPropertySet(name: ConstPtr, value: ConstPtr): CInt

public expect fun systemPropertyGet(name: ConstPtr, value: MutPtr): CInt

public expect fun systemPropertyFind(name: ConstPtr): ConstPtr

public expect fun systemPropertyFindNth(n: CUint): ConstPtr

public expect fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: MutPtr): CInt

// #include <link.h>

/**
 * Only available in API Version 21+
 */
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt

public expect fun arc4random(): UInt

public expect fun arc4randomUniform(upperBound: UInt): UInt

public expect fun arc4randomBuf(buf: MutPtr, n: SizeT)

public expect fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr

public expect fun dirname(path: ConstPtr): MutPtr

public expect fun basename(path: ConstPtr): MutPtr

public expect fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt

public expect fun sync()

public expect fun syncfs(fd: CInt): CInt

public expect fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr

public expect fun freadUnlocked(buf: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT

public expect fun fwriteUnlocked(buf: ConstPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT

public expect fun fflushUnlocked(stream: MutPtr): CInt

public expect fun fgetsUnlocked(buf: MutPtr, size: CInt, stream: MutPtr): MutPtr

public expect fun klogctl(syslogType: CInt, bufp: MutPtr, len: CInt): CInt

public expect fun memfdCreate(name: ConstPtr, flags: CUint): CInt

public expect fun renameat2(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CUint): CInt
