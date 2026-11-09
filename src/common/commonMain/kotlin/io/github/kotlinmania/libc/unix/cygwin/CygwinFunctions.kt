@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT

public fun fdClr(fd: CInt, set: FdSet?) {
    val fd1 = fd.toInt()
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set!!.fdsBits[fd1 / size] and (1uL shl (fd1 % size)).inv()
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val fd1 = fd.toInt()
    val size = 8 * 8
    return (set!!.fdsBits[fd1 / size] and (1uL shl (fd1 % size))) != 0uL
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val fd1 = fd.toInt()
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set!!.fdsBits[fd1 / size] or (1uL shl (fd1 % size))
}

public fun fdZero(set: FdSet?) {
    for (idx in (set!!.fdsBits).indices) {
        (set!!.fdsBits)[idx] = 0uL
    }
}

public fun cpuAllocSize(count: CInt): SizeT {
    val dummy: CpuSetT = CpuSetT(bits = ULongArray(16) { 0uL })
    val sizeInBits = 8 * 8
    return ((count.toULong() + sizeInBits.toULong() - 1uL) / 8uL).toULong()
}

public fun cpuCountS(size: Int, cpuset: CpuSetT): CInt {
    var s: UInt = 0u
    val sizeOfMask = 8
    for (i in cpuset.bits.slice(0 until (size / sizeOfMask))) {
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
    val sizeInBits = 8 * 8
    if (cpu < sizeInBits) {
        val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
        cpuset.bits[idx] = cpuset.bits[idx] or (1uL shl offset.toInt())
    }
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * 8
    if (cpu < sizeInBits) {
        val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
        cpuset.bits[idx] = cpuset.bits[idx] and (1uL shl offset.toInt()).inv()
    }
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * 8
    return if (cpu < sizeInBits) {
        val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
        0uL != (cpuset.bits[idx] and (1uL shl offset.toInt()))
    } else {
        false
    }
}

public fun cpuCount(cpuset: CpuSetT): CInt {
    return cpuCountS(8, cpuset)
}

public fun cpuEqual(set1: CpuSetT, set2: CpuSetT): Boolean {
    return set1.bits == set2.bits
}

public fun cmsgLen(length: CUint): CUint {
    return cmsgAlign(8).toUInt() + length
}

public fun cmsgSpace(length: CUint): CUint {
    return (cmsgAlign(length.toInt()) + cmsgAlign(8)).toUInt()
}

public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? {
    return if ((mhdr!!.msgControllen).toInt() >= 8) {
        ((mhdr!!.msgControl as Any?) as Cmsghdr?)
    } else {
        null
    }
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    val next: Cmsghdr? = null
    val max = ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + (mhdr!!.msgControllen).toInt()
    return if (((next)?.hashCode()?.toLong() ?: 0L).toInt() + cmsgAlign(8).toInt() > max) {
        null
    } else {
        next
    }
}

public fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? {
    return ((cmsg)?.let { COpaquePointer(it.hashCode().toLong() + (1).toLong()) })?.let { COpaquePointer(it.hashCode().toLong()) }
}

public fun makedev(ma: CUint, mi: CUint): DevT {
    val ma1 = ma.toUInt()
    val mi1 = mi.toUInt()
    return (ma1 shl 16) or (mi1 and 0xffffu)
}

public fun major(dev: DevT): CUint {
    return ((dev shr 16) and 0xffffu).toUInt()
}

public fun minor(dev: DevT): CUint {
    return (dev and 0xffffu).toUInt()
}

public fun wifexited(status: CInt): Boolean {
    return (status and 0xff) == 0
}

public fun wifsignaled(status: CInt): Boolean {
    return (status and 127) != 127 && (status and 127) != 0
}

public fun wifstopped(status: CInt): Boolean {
    return (status and 0xff) == 127
}

public fun wifcontinued(status: CInt): Boolean {
    return (status and 65535) == 65535
}

public fun wexitstatus(status: CInt): CInt {
    return (status shr 8) and 0xff
}

public fun wtermsig(status: CInt): CInt {
    return status and 127
}

public fun wstopsig(status: CInt): CInt {
    return (status shr 8) and 0xff
}

public fun wcoredump(status: CInt): Boolean {
    return wifsignaled(status) && (status and 0x80) != 0
}

public fun cmsgAlign(len: Int): Int {
    return len + 8 - 1 and (8 - 1).inv()
}

public expect fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt

public expect fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt

public expect fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt

public expect fun sigsuspend(mask: COpaquePointer?): CInt

public expect fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT

public expect fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer?

public expect fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer?

public expect fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer?

public expect fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt

public expect fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt

public expect fun futimes(fd: CInt, times: COpaquePointer?): CInt

public expect fun lutimes(file: String?, times: COpaquePointer?): CInt

public expect fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun getitimer(which: CInt, currValue: COpaquePointer?): CInt

public expect fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun futimesat(fd: CInt, path: String?, times: COpaquePointer?): CInt

public expect fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwent(): COpaquePointer?

public expect fun setpwent()

public expect fun endpwent()

public expect fun ifNameindex(): COpaquePointer?

public expect fun ifFreenameindex(ptr: COpaquePointer?)

public expect fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt

public expect fun futimens(fd: CInt, times: COpaquePointer?): CInt

public expect fun dlfork(value: CInt)

public expect fun accept4(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt

public expect fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT

public expect fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, sevlen: SocklenT, flags: CInt): CInt

public expect fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt

public expect fun semDestroy(sem: COpaquePointer?): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer?

public expect fun semClose(sem: COpaquePointer?): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt

public expect fun clearenv(): CInt

public expect fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun getpt(): CInt

public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

public expect fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt

public expect fun abs(i: CInt): CInt

public expect fun arc4random(): UInt

public expect fun arc4randomUniform(l: UInt): UInt

public expect fun arc4randomBuf(buf: COpaquePointer?, size: SizeT)

public expect fun labs(i: CLong): CLong

public expect fun mkostemp(template: COpaquePointer?, flags: CInt): CInt

public expect fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt

public expect fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt

public expect fun rand(): CInt

public expect fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer?

public expect fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun srand(seed: CUint)

public expect fun drand48(): CDouble

public expect fun erand48(xseed: COpaquePointer?): CDouble

public expect fun jrand48(xseed: COpaquePointer?): CLong

public expect fun lcong48(p: COpaquePointer?)

public expect fun lrand48(): CLong

public expect fun mrand48(): CLong

public expect fun nrand48(xseed: COpaquePointer?): CLong

public expect fun seed48(xseed: COpaquePointer?): COpaquePointer?

public expect fun srand48(seed: CLong)

public expect fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: FnCallback?, arg: COpaquePointer?)

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun explicitBzero(s: COpaquePointer?, len: SizeT)

public expect fun ffs(value: CInt): CInt

public expect fun ffsl(value: CLong): CInt

public expect fun ffsll(value: CLonglong): CInt

public expect fun fls(value: CInt): CInt

public expect fun flsl(value: CLong): CInt

public expect fun flsll(value: CLonglong): CInt

public expect fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt

public expect fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt

public expect fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt

public expect fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt

public expect fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer?

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer?

public expect fun basename(path: String?): COpaquePointer?

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun eaccess(pathname: String?, mode: CInt): CInt

public expect fun euidaccess(pathname: String?, mode: CInt): CInt

public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun getdomainname(name: COpaquePointer?, len: SizeT): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun gethostid(): CLong

public expect fun getpagesize(): CInt

public expect fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt

public expect fun pthreadAtfork(prepare: FnCallback1?, parent: FnCallback1?, child: FnCallback1?): CInt

public expect fun pipe2(fds: COpaquePointer?, flags: CInt): CInt

public expect fun sbrk(increment: IntptrT): COpaquePointer?

public expect fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt

public expect fun sethostname(name: String?, len: SizeT): CInt

public expect fun vhangup(): CInt

public expect fun getdtablesize(): CInt

public expect fun sync()

public expect fun errno(): COpaquePointer?

public expect fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedRrGetInterval(pid: PidT, t: COpaquePointer?): CInt

public expect fun schedGetcpu(): CInt

public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt

public expect fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt

public expect fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt

public expect fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt

public expect fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt

public expect fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt

public expect fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt

public expect fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt

public expect fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt

public expect fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt

public expect fun pthreadBarrierWait(barrier: COpaquePointer?): CInt

public expect fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: FnCallback2, value: COpaquePointer?): CInt

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: COpaquePointer?): CInt

public expect fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt

public expect fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: COpaquePointer?): CInt

public expect fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadSpinLock(lock: COpaquePointer?): CInt

public expect fun pthreadSpinTrylock(lock: COpaquePointer?): CInt

public expect fun pthreadSpinUnlock(lock: COpaquePointer?): CInt

public expect fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt

public expect fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt

public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

public expect fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt

public expect fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt

public expect fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt

public expect fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT

public expect fun mount(src: String?, target: String?, flags: CUint): CInt

public expect fun umount(target: String?): CInt

public expect fun cygwinUmount(target: String?, flags: CUint): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun uname(buf: COpaquePointer?): CInt

public expect fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnattrInit(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt

public expect fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt

public expect fun posixSpawnFileActionsAddchdir(actions: COpaquePointer?, path: String?): CInt

public expect fun posixSpawnFileActionsAddfchdir(actions: COpaquePointer?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt

public expect fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt

public expect fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT

public expect fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt

public expect fun getgrgid(gid: GidT): COpaquePointer?

public expect fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt

public expect fun getgrnam(name: String?): COpaquePointer?

public expect fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun initgroups(user: String?, group: GidT): CInt

public expect fun statfs(path: String?, buf: COpaquePointer?): CInt

public expect fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt

public expect fun endutxent()

public expect fun getutxent(): COpaquePointer?

public expect fun getutxid(id: COpaquePointer?): COpaquePointer?

public expect fun getutxline(line: COpaquePointer?): COpaquePointer?

public expect fun pututxline(utmpx: COpaquePointer?): COpaquePointer?

public expect fun setutxent()

public expect fun utmpxname(file: String?): CInt

public expect fun updwtmpx(file: String?, utmpx: COpaquePointer?)
