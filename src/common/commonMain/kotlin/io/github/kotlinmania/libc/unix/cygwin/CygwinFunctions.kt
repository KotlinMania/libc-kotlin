@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: ConstPtr, arg1: ConstPtr, arg2: MutPtr): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

public fun fdClr(fd: CInt, set: MutPtr) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] and (1uL shl (fd1 % size)).inv()
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
}

public fun fdIsset(fd: CInt, set: ConstPtr): Boolean {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] and (1uL shl (fd1 % size))) != 0uL
}

public fun fdSet(fd: CInt, set: MutPtr) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] or (1uL shl (fd1 % size))
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
}

public fun fdZero(set: MutPtr) {
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    for (idx in cur.fdsBits.indices) {
        cur.fdsBits[idx] = 0uL
    }
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
}

public fun cpuAllocSize(count: CInt): SizeT {
    val dummy: CpuSetT = CpuSetT(bits = ULongArray(16) { 0uL })
    val sizeInBits = 8 * sizeOfVal(dummy.bits[0], PrimitiveLayouts.U64)
    return ((count.toULong() + sizeInBits.toULong() - 1uL) / 8uL)
}

public fun cpuCountS(size: Int, cpuset: CpuSetT): CInt {
    var s: UInt = 0u
    val sizeOfMask = sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    for (i in ((cpuset.bits).slice(0 until (size / sizeOfMask)))) {
        s += i.countOneBits().toUInt()
    }
    return s.toInt()
}

public fun cpuZero(cpuset: CpuSetT) {
    for (idx in cpuset.bits.indices) {
        cpuset.bits[idx] = 0uL
    }
}

public fun cpuSet(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    if (cpu < sizeInBits) {
        val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
        cpuset.bits[idx] = cpuset.bits[idx] or (1uL shl offset)
    }
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    if (cpu < sizeInBits) {
        val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
        cpuset.bits[idx] = cpuset.bits[idx] and (1uL shl offset).inv()
    }
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    return if (cpu < sizeInBits) {
        val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
        0uL != (cpuset.bits[idx] and (1uL shl offset))
    } else {
        false
    }
}

public fun cpuCount(cpuset: CpuSetT): CInt = cpuCountS(sizeOf<CpuSetT>(typeLayoutT = CpuSetT.typeLayout()), cpuset)

public fun cpuEqual(set1: CpuSetT, set2: CpuSetT): Boolean = set1.bits.contentEquals(set2.bits)

public fun cmsgLen(length: CUint): CUint = cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toUInt() + length

public fun cmsgSpace(length: CUint): CUint = (cmsgAlign(length.toInt()) + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toUInt()

public fun cmsgFirsthdr(mhdr: ConstPtr): MutPtr =
    if ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen >= sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        MutPtr(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress)
    } else {
        MutPtr(0L)
    }

public fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr {
    val next = MutPtr((cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + (Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen
    return if (next.rawAddress.toInt() + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) > max) {
        MutPtr(0L)
    } else {
        next
    }
}

public fun cmsgData(cmsg: ConstPtr): MutPtr = MutPtr((MutPtr((ConstPtr((cmsg).rawAddress + ((1).toLong() * (Cmsghdr.typeLayout()).strideBytes))).rawAddress)).rawAddress)

public fun makedev(ma: CUint, mi: CUint): DevT {
    val ma1 = ma
    val mi1 = mi
    return (ma1 shl 16) or (mi1 and 0xffffu)
}

public fun major(dev: DevT): CUint = ((dev shr 16) and 0xffffu)

public fun minor(dev: DevT): CUint = (dev and 0xffffu)

public fun wifexited(status: CInt): Boolean = (status and 0xff) == 0

public fun wifsignaled(status: CInt): Boolean = (status and 127) != 127 && (status and 127) != 0

public fun wifstopped(status: CInt): Boolean = (status and 0xff) == 127

public fun wifcontinued(status: CInt): Boolean = (status and 65535) == 65535

public fun wexitstatus(status: CInt): CInt = (status shr 8) and 0xff

public fun wtermsig(status: CInt): CInt = status and 127

public fun wstopsig(status: CInt): CInt = (status shr 8) and 0xff

public fun wcoredump(status: CInt): Boolean = wifsignaled(status) && (status and 0x80) != 0

public fun cmsgAlign(len: Int): Int = len + sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1 and (sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1).inv()

public expect fun sigwait(set: ConstPtr, sig: MutPtr): CInt

public expect fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt

public expect fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt

public expect fun sigsuspend(mask: ConstPtr): CInt

public expect fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt

public expect fun strftime(s: MutPtr, max: SizeT, format: ConstPtr, tm: ConstPtr): SizeT

public expect fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr

public expect fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr

public expect fun strptime(s: ConstPtr, format: ConstPtr, tm: MutPtr): MutPtr

public expect fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt

public expect fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt

public expect fun timerGettime(timerid: TimerT, currValue: MutPtr): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt

public expect fun futimes(fd: CInt, times: ConstPtr): CInt

public expect fun lutimes(file: ConstPtr, times: ConstPtr): CInt

public expect fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt

public expect fun getitimer(which: CInt, currValue: MutPtr): CInt

public expect fun setitimer(which: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun futimesat(fd: CInt, path: ConstPtr, times: ConstPtr): CInt

public expect fun getrlimit(resource: CInt, rlim: MutPtr): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getpwent(): MutPtr

public expect fun setpwent()

public expect fun endpwent()

public expect fun ifNameindex(): MutPtr

public expect fun ifFreenameindex(ptr: MutPtr)

public expect fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt

public expect fun futimens(fd: CInt, times: ConstPtr): CInt

public expect fun dlfork(value: CInt)

public expect fun accept4(s: CInt, addr: MutPtr, addrlen: MutPtr, flags: CInt): CInt

public expect fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt

public expect fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT

public expect fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT

public expect fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, sevlen: SocklenT, flags: CInt): CInt

public expect fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt

public expect fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt

public expect fun semDestroy(sem: MutPtr): CInt

public expect fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr

public expect fun semClose(sem: MutPtr): CInt

public expect fun semUnlink(name: ConstPtr): CInt

public expect fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt

public expect fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt

public expect fun clearenv(): CInt

public expect fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun getpt(): CInt

public expect fun memalign(align: SizeT, size: SizeT): MutPtr

public expect fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt

public expect fun abs(i: CInt): CInt

public expect fun arc4random(): UInt

public expect fun arc4randomUniform(l: UInt): UInt

public expect fun arc4randomBuf(buf: MutPtr, size: SizeT)

public expect fun labs(i: CLong): CLong

public expect fun mkostemp(template: MutPtr, flags: CInt): CInt

public expect fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt

public expect fun mkstemps(template: MutPtr, suffixlen: CInt): CInt

public expect fun rand(): CInt

public expect fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr

public expect fun reallocf(ptr: MutPtr, size: SizeT): MutPtr

public expect fun srand(seed: CUint)

public expect fun drand48(): CDouble

public expect fun erand48(xseed: MutPtr): CDouble

public expect fun jrand48(xseed: MutPtr): CLong

public expect fun lcong48(p: MutPtr)

public expect fun lrand48(): CLong

public expect fun mrand48(): CLong

public expect fun nrand48(xseed: MutPtr): CLong

public expect fun seed48(xseed: MutPtr): MutPtr

public expect fun srand48(seed: CLong)

public expect fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr)

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt

public expect fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: ConstPtr): CInt

public expect fun explicitBzero(s: MutPtr, len: SizeT)

public expect fun ffs(value: CInt): CInt

public expect fun ffsl(value: CLong): CInt

public expect fun ffsll(value: CLonglong): CInt

public expect fun fls(value: CInt): CInt

public expect fun flsl(value: CLong): CInt

public expect fun flsll(value: CLonglong): CInt

public expect fun strcasecmpL(s1: ConstPtr, s2: ConstPtr, loc: LocaleT): CInt

public expect fun strncasecmpL(s1: ConstPtr, s2: ConstPtr, n: SizeT, loc: LocaleT): CInt

public expect fun timingsafeBcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt

public expect fun timingsafeMemcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt

public expect fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr

public expect fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun strsep(string: MutPtr, delim: ConstPtr): MutPtr

public expect fun basename(path: ConstPtr): MutPtr

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun eaccess(pathname: ConstPtr, mode: CInt): CInt

public expect fun euidaccess(pathname: ConstPtr, mode: CInt): CInt

public expect fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt

public expect fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun getdomainname(name: MutPtr, len: SizeT): CInt

public expect fun getentropy(buf: MutPtr, buflen: SizeT): CInt

public expect fun gethostid(): CLong

public expect fun getpagesize(): CInt

public expect fun getpeereid(socket: CInt, euid: MutPtr, egid: MutPtr): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun pipe2(fds: MutPtr, flags: CInt): CInt

public expect fun sbrk(increment: IntptrT): MutPtr

public expect fun setgroups(ngroups: CInt, ptr: ConstPtr): CInt

public expect fun sethostname(name: ConstPtr, len: SizeT): CInt

public expect fun vhangup(): CInt

public expect fun getdtablesize(): CInt

public expect fun sync()

public expect fun errno(): MutPtr

public expect fun schedSetparam(pid: PidT, param: ConstPtr): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedRrGetInterval(pid: PidT, t: MutPtr): CInt

public expect fun schedGetcpu(): CInt

public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: MutPtr): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt

public expect fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt

public expect fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt

public expect fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadBarrierattrInit(attr: MutPtr): CInt

public expect fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt

public expect fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt

public expect fun pthreadBarrierattrDestroy(attr: MutPtr): CInt

public expect fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt

public expect fun pthreadBarrierDestroy(barrier: MutPtr): CInt

public expect fun pthreadBarrierWait(barrier: MutPtr): CInt

public expect fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt

public expect fun pthreadMutexattrGetprotocol(attr: ConstPtr, protocol: MutPtr): CInt

public expect fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt

public expect fun pthreadMutexattrSetprotocol(attr: MutPtr, protocol: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr): CInt

public expect fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt

public expect fun pthreadSpinLock(lock: MutPtr): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr): CInt

public expect fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt

public expect fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt

public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

public expect fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: MutPtr): CInt

public expect fun pthreadGetattrNp(native: PthreadT, attr: MutPtr): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: SizeT): CInt

public expect fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: ConstPtr): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): CInt

public expect fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT

public expect fun mount(src: ConstPtr, target: ConstPtr, flags: CUint): CInt

public expect fun umount(target: ConstPtr): CInt

public expect fun cygwinUmount(target: ConstPtr, flags: CUint): CInt

public expect fun dirfd(dirp: MutPtr): CInt

public expect fun seekdir(dirp: MutPtr, loc: CLong)

public expect fun telldir(dirp: MutPtr): CLong

public expect fun uname(buf: MutPtr): CInt

public expect fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun posixSpawnattrInit(attr: MutPtr): CInt

public expect fun posixSpawnattrDestroy(attr: MutPtr): CInt

public expect fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt

public expect fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt

public expect fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt

public expect fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt

public expect fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt

public expect fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt

public expect fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt

public expect fun posixSpawnFileActionsInit(actions: MutPtr): CInt

public expect fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt

public expect fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt

public expect fun posixSpawnFileActionsAddchdir(actions: MutPtr, path: ConstPtr): CInt

public expect fun posixSpawnFileActionsAddfchdir(actions: MutPtr, fd: CInt): CInt

public expect fun posixSpawnFileActionsAddchdirNp(actions: MutPtr, path: ConstPtr): CInt

public expect fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr, fd: CInt): CInt

public expect fun forkpty(amaster: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): PidT

public expect fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt

public expect fun getgrgid(gid: GidT): MutPtr

public expect fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt

public expect fun getgrnam(name: ConstPtr): MutPtr

public expect fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun initgroups(user: ConstPtr, group: GidT): CInt

public expect fun statfs(path: ConstPtr, buf: MutPtr): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt

public expect fun endutxent()

public expect fun getutxent(): MutPtr

public expect fun getutxid(id: ConstPtr): MutPtr

public expect fun getutxline(line: ConstPtr): MutPtr

public expect fun pututxline(utmpx: ConstPtr): MutPtr

public expect fun setutxent()

public expect fun utmpxname(file: ConstPtr): CInt

public expect fun updwtmpx(file: ConstPtr, utmpx: ConstPtr)
