@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSetgrent")
private external fun wasiLibcUnixLinuxlikeAndroidSetgrent(): Unit

public actual fun setgrent(): Unit =
    wasiLibcUnixLinuxlikeAndroidSetgrent()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidEndgrent")
private external fun wasiLibcUnixLinuxlikeAndroidEndgrent(): Unit

public actual fun endgrent(): Unit =
    wasiLibcUnixLinuxlikeAndroidEndgrent()

public actual fun getgrent(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetgrent")

public actual fun getrlimit64(resource: CInt, rlim: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetrlimit64")

public actual fun setrlimit64(resource: CInt, rlim: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSetrlimit64")

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetrlimit")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSetrlimit")

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: ConstPtr, oldLimit: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPrlimit")

public actual fun prlimit64(pid: PidT, resource: CInt, newLimit: ConstPtr, oldLimit: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPrlimit64")

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidStrerrorR")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGettimeofday")

public actual fun mlock2(addr: ConstPtr, len: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMlock2")

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMadvise")

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMsync")

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMprotect")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SizeT, serv: MutPtr, servlen: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetnameinfo")

public actual fun preadv(fd: CInt, iov: ConstPtr, count: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPreadv")

public actual fun pwritev(fd: CInt, iov: ConstPtr, count: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPwritev")

public actual fun processVmReadv(pid: PidT, localIov: ConstPtr, localIovCount: CUlong, remoteIov: ConstPtr, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidProcessVmReadv")

public actual fun processVmWritev(pid: PidT, localIov: ConstPtr, localIovCount: CUlong, remoteIov: ConstPtr, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidProcessVmWritev")

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPtrace")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidGetpriority")
private external fun wasiLibcUnixLinuxlikeAndroidGetpriority(which: Int, who: Int): Int

public actual fun getpriority(which: CInt, who: IdT): CInt =
    wasiLibcUnixLinuxlikeAndroidGetpriority(which, who.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSetpriority")
private external fun wasiLibcUnixLinuxlikeAndroidSetpriority(which: Int, who: Int, prio: Int): Int

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidSetpriority(which, who.toInt(), prio)

public actual fun schedCpualloc(count: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedCpualloc")

public actual fun schedCpufree(set: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedCpufree")

public actual fun schedCpucount(setsize: SizeT, set: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedCpucount")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSchedGetcpu")
private external fun wasiLibcUnixLinuxlikeAndroidSchedGetcpu(): Int

public actual fun schedGetcpu(): CInt =
    wasiLibcUnixLinuxlikeAndroidSchedGetcpu()

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMallinfo")

public actual fun mallocInfo(options: CInt, stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMallocInfo")

public actual fun mallocUsableSize(ptr: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMallocUsableSize")

public actual fun utmpname(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidUtmpname")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSetutent")
private external fun wasiLibcUnixLinuxlikeAndroidSetutent(): Unit

public actual fun setutent(): Unit =
    wasiLibcUnixLinuxlikeAndroidSetutent()

public actual fun getutent(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetutent")

public actual fun seekdir(dirp: MutPtr, loc: CLong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSeekdir")

public actual fun telldir(dirp: MutPtr): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidTelldir")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidFallocate")
private external fun wasiLibcUnixLinuxlikeAndroidFallocate(fd: Int, mode: Int, offset: Long, len: Long): Int

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    wasiLibcUnixLinuxlikeAndroidFallocate(fd, mode, offset, len)

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidFallocate64")
private external fun wasiLibcUnixLinuxlikeAndroidFallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    wasiLibcUnixLinuxlikeAndroidFallocate64(fd, mode, offset, len)

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidPosixFallocate")
private external fun wasiLibcUnixLinuxlikeAndroidPosixFallocate(fd: Int, offset: Long, len: Long): Int

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    wasiLibcUnixLinuxlikeAndroidPosixFallocate(fd, offset, len)

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidPosixFallocate64")
private external fun wasiLibcUnixLinuxlikeAndroidPosixFallocate64(fd: Int, offset: Long, len: Long): Int

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    wasiLibcUnixLinuxlikeAndroidPosixFallocate64(fd, offset, len)

public actual fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetxattr")

public actual fun lgetxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidLgetxattr")

public actual fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFgetxattr")

public actual fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSetxattr")

public actual fun lsetxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidLsetxattr")

public actual fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFsetxattr")

public actual fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidListxattr")

public actual fun llistxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidLlistxattr")

public actual fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFlistxattr")

public actual fun removexattr(path: ConstPtr, name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidRemovexattr")

public actual fun lremovexattr(path: ConstPtr, name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidLremovexattr")

public actual fun fremovexattr(filedes: CInt, name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFremovexattr")

public actual fun signalfd(fd: CInt, mask: ConstPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSignalfd")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidTimerfdCreate")
private external fun wasiLibcUnixLinuxlikeAndroidTimerfdCreate(clock: Int, flags: Int): Int

public actual fun timerfdCreate(clock: ClockidT, flags: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidTimerfdCreate(clock, flags)

public actual fun timerfdGettime(fd: CInt, currentValue: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidTimerfdGettime")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidTimerfdSettime")

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSyscall")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedGetaffinity")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedSetaffinity")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidEpollCreate")
private external fun wasiLibcUnixLinuxlikeAndroidEpollCreate(size: Int): Int

public actual fun epollCreate(size: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidEpollCreate(size)

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidEpollCreate1")
private external fun wasiLibcUnixLinuxlikeAndroidEpollCreate1(flags: Int): Int

public actual fun epollCreate1(flags: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidEpollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidEpollWait")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidEpollCtl")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidUnshare")
private external fun wasiLibcUnixLinuxlikeAndroidUnshare(flags: Int): Int

public actual fun unshare(flags: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidUnshare(flags)

public actual fun umount(target: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidUmount")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSchedGetPriorityMax")
private external fun wasiLibcUnixLinuxlikeAndroidSchedGetPriorityMax(policy: Int): Int

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidSchedGetPriorityMax(policy)

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidTee")
private external fun wasiLibcUnixLinuxlikeAndroidTee(fdIn: Int, fdOut: Int, len: Long, flags: Int): Long

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    wasiLibcUnixLinuxlikeAndroidTee(fdIn, fdOut, len.toLong(), flags.toInt())

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSettimeofday")

public actual fun splice(fdIn: CInt, offIn: MutPtr, fdOut: CInt, offOut: MutPtr, len: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSplice")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidEventfd")
private external fun wasiLibcUnixLinuxlikeAndroidEventfd(initval: Int, flags: Int): Int

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidEventfd(initval.toInt(), flags)

public actual fun eventfdRead(fd: CInt, value: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidEventfdRead")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidEventfdWrite")
private external fun wasiLibcUnixLinuxlikeAndroidEventfdWrite(fd: Int, value: Long): Int

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    wasiLibcUnixLinuxlikeAndroidEventfdWrite(fd, value.toLong())

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedRrGetInterval")

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSemTimedwait")

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSemGetvalue")

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedSetparam")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSetns")
private external fun wasiLibcUnixLinuxlikeAndroidSetns(fd: Int, nstype: Int): Int

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidSetns(fd, nstype)

public actual fun swapoff(puath: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSwapoff")

public actual fun vmsplice(fd: CInt, iov: ConstPtr, nrSegs: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidVmsplice")

public actual fun mount(src: ConstPtr, target: ConstPtr, fstype: ConstPtr, flags: CUlong, data: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMount")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidPersonality")
private external fun wasiLibcUnixLinuxlikeAndroidPersonality(persona: Int): Int

public actual fun personality(persona: CUint): CInt =
    wasiLibcUnixLinuxlikeAndroidPersonality(persona.toInt())

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPrctl")

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedGetparam")

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPpoll")

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr, flags: CInt, arg: MutPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidClone")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSchedGetscheduler")
private external fun wasiLibcUnixLinuxlikeAndroidSchedGetscheduler(pid: Int): Int

public actual fun schedGetscheduler(pid: PidT): CInt =
    wasiLibcUnixLinuxlikeAndroidSchedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidClockNanosleep")

public actual fun sethostname(name: ConstPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSethostname")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSchedGetPriorityMin")
private external fun wasiLibcUnixLinuxlikeAndroidSchedGetPriorityMin(policy: Int): Int

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidSchedGetPriorityMin(policy)

public actual fun sysinfo(info: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSysinfo")

public actual fun umount2(target: ConstPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidUmount2")

public actual fun swapon(path: ConstPtr, swapflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSwapon")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedSetscheduler")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSendfile")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSendfile64")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSetfsgid")
private external fun wasiLibcUnixLinuxlikeAndroidSetfsgid(gid: Int): Int

public actual fun setfsgid(gid: GidT): CInt =
    wasiLibcUnixLinuxlikeAndroidSetfsgid(gid.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSetfsuid")
private external fun wasiLibcUnixLinuxlikeAndroidSetfsuid(uid: Int): Int

public actual fun setfsuid(uid: UidT): CInt =
    wasiLibcUnixLinuxlikeAndroidSetfsuid(uid.toInt())

public actual fun sigsuspend(mask: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSigsuspend")

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetgrgidR")

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSigaltstack")

public actual fun semClose(sem: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSemClose")

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetgrnamR")

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSemOpen")

public actual fun getgrnam(name: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetgrnam")

public actual fun semUnlink(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSemUnlink")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidDaemon")
private external fun wasiLibcUnixLinuxlikeAndroidDaemon(nochdir: Int, noclose: Int): Int

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidDaemon(nochdir, noclose)

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSigtimedwait")

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSigwait")

public actual fun getgrgid(gid: GidT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetgrgid")

public actual fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetgrouplist")

public actual fun initgroups(user: ConstPtr, group: GidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidInitgroups")

public actual fun popen(command: ConstPtr, mode: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPopen")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFaccessat")

public actual fun errno(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidErrno")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidInotifyRmWatch")
private external fun wasiLibcUnixLinuxlikeAndroidInotifyRmWatch(fd: Int, wd: Int): Int

public actual fun inotifyRmWatch(fd: CInt, wd: UInt): CInt =
    wasiLibcUnixLinuxlikeAndroidInotifyRmWatch(fd, wd.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidInotifyInit")
private external fun wasiLibcUnixLinuxlikeAndroidInotifyInit(): Int

public actual fun inotifyInit(): CInt =
    wasiLibcUnixLinuxlikeAndroidInotifyInit()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidInotifyInit1")
private external fun wasiLibcUnixLinuxlikeAndroidInotifyInit1(flags: Int): Int

public actual fun inotifyInit1(flags: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidInotifyInit1(flags)

public actual fun inotifyAddWatch(fd: CInt, path: ConstPtr, mask: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidInotifyAddWatch")

public actual fun regcomp(preg: MutPtr, pattern: ConstPtr, cflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidRegcomp")

public actual fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidRegexec")

public actual fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidRegerror")

public actual fun regfree(preg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidRegfree")

public actual fun androidSetAbortMessage(msg: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidAndroidSetAbortMessage")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidGettid")
private external fun wasiLibcUnixLinuxlikeAndroidGettid(): Int

public actual fun gettid(): PidT =
    wasiLibcUnixLinuxlikeAndroidGettid()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidTgkill")
private external fun wasiLibcUnixLinuxlikeAndroidTgkill(tgid: Int, tid: Int, sig: Int): Int

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidTgkill(tgid, tid, sig)

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidGetauxval")
private external fun wasiLibcUnixLinuxlikeAndroidGetauxval(type: Long): Long

public actual fun getauxval(type: CUlong): CUlong =
    wasiLibcUnixLinuxlikeAndroidGetauxval(type.toLong()).toULong()

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetrandom")

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetentropy")

public actual fun systemPropertySet(name: ConstPtr, value: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSystemPropertySet")

public actual fun systemPropertyGet(name: ConstPtr, value: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSystemPropertyGet")

public actual fun systemPropertyFind(name: ConstPtr): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSystemPropertyFind")

public actual fun systemPropertyFindNth(n: CUint): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSystemPropertyFindNth")

public actual fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSystemPropertyForeach")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidDlIteratePhdr")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidArc4random")
private external fun wasiLibcUnixLinuxlikeAndroidArc4random(): Int

public actual fun arc4random(): UInt =
    wasiLibcUnixLinuxlikeAndroidArc4random().toUInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidArc4randomUniform")
private external fun wasiLibcUnixLinuxlikeAndroidArc4randomUniform(upperBound: Int): Int

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    wasiLibcUnixLinuxlikeAndroidArc4randomUniform(upperBound.toInt()).toUInt()

public actual fun arc4randomBuf(buf: MutPtr, n: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidArc4randomBuf")

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidReallocarray")

public actual fun dirname(path: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidDirname")

public actual fun basename(path: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidBasename")

public actual fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetoptLong")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSync")
private external fun wasiLibcUnixLinuxlikeAndroidSync(): Unit

public actual fun sync(): Unit =
    wasiLibcUnixLinuxlikeAndroidSync()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSyncfs")
private external fun wasiLibcUnixLinuxlikeAndroidSyncfs(fd: Int): Int

public actual fun syncfs(fd: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidSyncfs(fd)

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMemmem")

public actual fun freadUnlocked(buf: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFreadUnlocked")

public actual fun fwriteUnlocked(buf: ConstPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFwriteUnlocked")

public actual fun fflushUnlocked(stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFflushUnlocked")

public actual fun fgetsUnlocked(buf: MutPtr, size: CInt, stream: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFgetsUnlocked")

public actual fun klogctl(syslogType: CInt, bufp: MutPtr, len: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidKlogctl")

public actual fun memfdCreate(name: ConstPtr, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMemfdCreate")

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidRenameat2")
