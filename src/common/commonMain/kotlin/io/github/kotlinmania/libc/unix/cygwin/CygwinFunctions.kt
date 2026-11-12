@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: ConstPtr<CVoid>, arg1: ConstPtr<CVoid>, arg2: MutPtr<CVoid>): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

public fun fdClr(fd: CInt, set: MutPtr<FdSet>) {
    val fd1 = fd
    val size = sizeOfVal((ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[0]) * 8
    (ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[fd1 / size] = (ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[fd1 / size] and (1uL shl (fd1 % size)).inv()
}

public fun fdIsset(fd: CInt, set: ConstPtr<FdSet>): Boolean {
    val fd1 = fd
    val size = sizeOfVal((ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[0]) * 8
    return ((ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[fd1 / size] and (1uL shl (fd1 % size))) != 0uL
}

public fun fdSet(fd: CInt, set: MutPtr<FdSet>) {
    val fd1 = fd
    val size = sizeOfVal((ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[0]) * 8
    (ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[fd1 / size] = (ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[fd1 / size] or (1uL shl (fd1 % size))
}

public fun fdZero(set: MutPtr<FdSet>) {
    for (idx in ((ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits).indices) {
        ((ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits)[idx] = 0uL
    }
}

public fun cpuAllocSize(count: CInt): SizeT {
    val dummy: CpuSetT = CpuSetT(bits = ULongArray(16) { 0uL })
    val sizeInBits = 8 * sizeOfVal(dummy.bits[0])
    return ((count.toULong() + sizeInBits.toULong() - 1uL) / 8uL)
}

public fun cpuCountS(size: Int, cpuset: CpuSetT): CInt {
    var s: UInt = 0u
    val sizeOfMask = sizeOfVal(cpuset.bits[0])
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
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0])
    if (cpu < sizeInBits) {
        val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
        cpuset.bits[idx] = cpuset.bits[idx] or (1uL shl offset)
    }
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0])
    if (cpu < sizeInBits) {
        val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
        cpuset.bits[idx] = cpuset.bits[idx] and (1uL shl offset).inv()
    }
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0])
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

public fun cmsgFirsthdr(mhdr: ConstPtr<Msghdr>): MutPtr<Cmsghdr> =
    if ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen >= sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        MutPtr<Cmsghdr>(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress)
    } else {
        MutPtr(0L)
    }

public fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> {
    val next = MutPtr<Cmsghdr>((cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + (Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen
    return if (next.rawAddress.toInt() + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) > max) {
        MutPtr(0L)
    } else {
        next
    }
}

public fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> = MutPtr<CUchar>((MutPtr<Cmsghdr>((ConstPtr((cmsg).rawAddress + ((1).toLong() * (Cmsghdr.typeLayout()).strideBytes))).rawAddress)).rawAddress)

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

public expect fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt

public expect fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt

public expect fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt

public expect fun sigsuspend(mask: ConstPtr<SigsetT>): CInt

public expect fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt

public expect fun strftime(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>): SizeT

public expect fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar>

public expect fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar>

public expect fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar>

public expect fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt

public expect fun timerGettime(timerid: TimerT, currValue: MutPtr<Itimerspec>): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt

public expect fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt

public expect fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt

public expect fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt

public expect fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt

public expect fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt

public expect fun futimesat(fd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt

public expect fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getpwent(): MutPtr<Passwd>

public expect fun setpwent()

public expect fun endpwent()

public expect fun ifNameindex(): MutPtr<IfNameindex>

public expect fun ifFreenameindex(ptr: MutPtr<IfNameindex>)

public expect fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt

public expect fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt

public expect fun dlfork(value: CInt)

public expect fun accept4(s: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>, flags: CInt): CInt

public expect fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt

public expect fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT

public expect fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT

public expect fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, sevlen: SocklenT, flags: CInt): CInt

public expect fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt

public expect fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt

public expect fun semDestroy(sem: MutPtr<SemT>): CInt

public expect fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT>

public expect fun semClose(sem: MutPtr<SemT>): CInt

public expect fun semUnlink(name: ConstPtr<CChar>): CInt

public expect fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt

public expect fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt

public expect fun clearenv(): CInt

public expect fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun getpt(): CInt

public expect fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt

public expect fun abs(i: CInt): CInt

public expect fun arc4random(): UInt

public expect fun arc4randomUniform(l: UInt): UInt

public expect fun arc4randomBuf(buf: MutPtr<CVoid>, size: SizeT)

public expect fun labs(i: CLong): CLong

public expect fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt

public expect fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt

public expect fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt

public expect fun rand(): CInt

public expect fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun reallocf(ptr: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid>

public expect fun srand(seed: CUint)

public expect fun drand48(): CDouble

public expect fun erand48(xseed: MutPtr<CUshort>): CDouble

public expect fun jrand48(xseed: MutPtr<CUshort>): CLong

public expect fun lcong48(p: MutPtr<CUshort>)

public expect fun lrand48(): CLong

public expect fun mrand48(): CLong

public expect fun nrand48(xseed: MutPtr<CUshort>): CLong

public expect fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort>

public expect fun srand48(seed: CLong)

public expect fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>)

public expect fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt

public expect fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt

public expect fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: ConstPtr<CChar>): CInt

public expect fun explicitBzero(s: MutPtr<CVoid>, len: SizeT)

public expect fun ffs(value: CInt): CInt

public expect fun ffsl(value: CLong): CInt

public expect fun ffsll(value: CLonglong): CInt

public expect fun fls(value: CInt): CInt

public expect fun flsl(value: CLong): CInt

public expect fun flsll(value: CLonglong): CInt

public expect fun strcasecmpL(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, loc: LocaleT): CInt

public expect fun strncasecmpL(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT, loc: LocaleT): CInt

public expect fun timingsafeBcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt

public expect fun timingsafeMemcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt

public expect fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid>

public expect fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun strsep(string: MutPtr<MutPtr<CChar>>, delim: ConstPtr<CChar>): MutPtr<CChar>

public expect fun basename(path: ConstPtr<CChar>): MutPtr<CChar>

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun eaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt

public expect fun euidaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt

public expect fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt

public expect fun fexecve(fd: CInt, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt

public expect fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt

public expect fun gethostid(): CLong

public expect fun getpagesize(): CInt

public expect fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt

public expect fun sbrk(increment: IntptrT): MutPtr<CVoid>

public expect fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt

public expect fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt

public expect fun vhangup(): CInt

public expect fun getdtablesize(): CInt

public expect fun sync()

public expect fun errno(): MutPtr<CInt>

public expect fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedRrGetInterval(pid: PidT, t: MutPtr<Timespec>): CInt

public expect fun schedGetcpu(): CInt

public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: MutPtr<CpuSetT>): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt

public expect fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt

public expect fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt

public expect fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt

public expect fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, shared: CInt): CInt

public expect fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, shared: MutPtr<CInt>): CInt

public expect fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt

public expect fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt

public expect fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt

public expect fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt

public expect fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt

public expect fun pthreadMutexattrGetprotocol(attr: ConstPtr<PthreadMutexattrT>, protocol: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrSetprotocol(attr: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt

public expect fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt

public expect fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

public expect fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt

public expect fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt

public expect fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt

public expect fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT

public expect fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, flags: CUint): CInt

public expect fun umount(target: ConstPtr<CChar>): CInt

public expect fun cygwinUmount(target: ConstPtr<CChar>, flags: CUint): CInt

public expect fun dirfd(dirp: MutPtr<DIR>): CInt

public expect fun seekdir(dirp: MutPtr<DIR>, loc: CLong)

public expect fun telldir(dirp: MutPtr<DIR>): CLong

public expect fun uname(buf: MutPtr<Utsname>): CInt

public expect fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt

public expect fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt

public expect fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt

public expect fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt

public expect fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt

public expect fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt

public expect fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt

public expect fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt

public expect fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt

public expect fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt

public expect fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt

public expect fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt

public expect fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt

public expect fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt

public expect fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt

public expect fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt

public expect fun posixSpawnFileActionsAddchdir(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt

public expect fun posixSpawnFileActionsAddfchdir(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt

public expect fun posixSpawnFileActionsAddchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt

public expect fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt

public expect fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT

public expect fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt

public expect fun getgrgid(gid: GidT): MutPtr<Group>

public expect fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt

public expect fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group>

public expect fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt

public expect fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt

public expect fun endutxent()

public expect fun getutxent(): MutPtr<Utmpx>

public expect fun getutxid(id: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun getutxline(line: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun pututxline(utmpx: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun setutxent()

public expect fun utmpxname(file: ConstPtr<CChar>): CInt

public expect fun updwtmpx(file: ConstPtr<CChar>, utmpx: ConstPtr<Utmpx>)
