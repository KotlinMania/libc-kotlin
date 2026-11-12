@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
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

public actual fun getgrent(): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetgrent")

public actual fun getrlimit64(resource: CInt, rlim: MutPtr<Rlimit64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetrlimit64")

public actual fun setrlimit64(resource: CInt, rlim: ConstPtr<Rlimit64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSetrlimit64")

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetrlimit")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSetrlimit")

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: ConstPtr<Rlimit>, oldLimit: MutPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPrlimit")

public actual fun prlimit64(pid: PidT, resource: CInt, newLimit: ConstPtr<Rlimit64>, oldLimit: MutPtr<Rlimit64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPrlimit64")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidStrerrorR")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGettimeofday")

public actual fun mlock2(addr: ConstPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMlock2")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMadvise")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMsync")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMprotect")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetnameinfo")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPreadv")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPwritev")

public actual fun processVmReadv(pid: PidT, localIov: ConstPtr<Iovec>, localIovCount: CUlong, remoteIov: ConstPtr<Iovec>, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidProcessVmReadv")

public actual fun processVmWritev(pid: PidT, localIov: ConstPtr<Iovec>, localIovCount: CUlong, remoteIov: ConstPtr<Iovec>, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidProcessVmWritev")

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPtrace")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidGetpriority")
private external fun wasiLibcUnixLinuxlikeAndroidGetpriority(which: Int, who: Int): Int

public actual fun getpriority(which: CInt, who: IdT): CInt =
    wasiLibcUnixLinuxlikeAndroidGetpriority(which, who.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSetpriority")
private external fun wasiLibcUnixLinuxlikeAndroidSetpriority(which: Int, who: Int, prio: Int): Int

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidSetpriority(which, who.toInt(), prio).toInt()

public actual fun schedCpualloc(count: SizeT): MutPtr<CpuSetT> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedCpualloc")

public actual fun schedCpufree(set: MutPtr<CpuSetT>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedCpufree")

public actual fun schedCpucount(setsize: SizeT, set: ConstPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedCpucount")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSchedGetcpu")
private external fun wasiLibcUnixLinuxlikeAndroidSchedGetcpu(): Int

public actual fun schedGetcpu(): CInt =
    wasiLibcUnixLinuxlikeAndroidSchedGetcpu().toInt()

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMallinfo")

public actual fun mallocInfo(options: CInt, stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMallocInfo")

public actual fun mallocUsableSize(ptr: ConstPtr<CVoid>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMallocUsableSize")

public actual fun utmpname(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidUtmpname")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSetutent")
private external fun wasiLibcUnixLinuxlikeAndroidSetutent(): Unit

public actual fun setutent(): Unit =
    wasiLibcUnixLinuxlikeAndroidSetutent()

public actual fun getutent(): MutPtr<Utmp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetutent")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSeekdir")

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidTelldir")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidFallocate")
private external fun wasiLibcUnixLinuxlikeAndroidFallocate(fd: Int, mode: Int, offset: Long, len: Long): Int

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    wasiLibcUnixLinuxlikeAndroidFallocate(fd, mode, offset, len).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidFallocate64")
private external fun wasiLibcUnixLinuxlikeAndroidFallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    wasiLibcUnixLinuxlikeAndroidFallocate64(fd, mode, offset, len).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidPosixFallocate")
private external fun wasiLibcUnixLinuxlikeAndroidPosixFallocate(fd: Int, offset: Long, len: Long): Int

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    wasiLibcUnixLinuxlikeAndroidPosixFallocate(fd, offset, len).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidPosixFallocate64")
private external fun wasiLibcUnixLinuxlikeAndroidPosixFallocate64(fd: Int, offset: Long, len: Long): Int

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    wasiLibcUnixLinuxlikeAndroidPosixFallocate64(fd, offset, len).toInt()

public actual fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetxattr")

public actual fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidLgetxattr")

public actual fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFgetxattr")

public actual fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSetxattr")

public actual fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidLsetxattr")

public actual fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFsetxattr")

public actual fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidListxattr")

public actual fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidLlistxattr")

public actual fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFlistxattr")

public actual fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidRemovexattr")

public actual fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidLremovexattr")

public actual fun fremovexattr(filedes: CInt, name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFremovexattr")

public actual fun signalfd(fd: CInt, mask: ConstPtr<SigsetT>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSignalfd")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidTimerfdCreate")
private external fun wasiLibcUnixLinuxlikeAndroidTimerfdCreate(clock: Int, flags: Int): Int

public actual fun timerfdCreate(clock: ClockidT, flags: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidTimerfdCreate(clock, flags).toInt()

public actual fun timerfdGettime(fd: CInt, currentValue: MutPtr<Itimerspec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidTimerfdGettime")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidTimerfdSettime")

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSyscall")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedGetaffinity")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedSetaffinity")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidEpollCreate")
private external fun wasiLibcUnixLinuxlikeAndroidEpollCreate(size: Int): Int

public actual fun epollCreate(size: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidEpollCreate(size).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidEpollCreate1")
private external fun wasiLibcUnixLinuxlikeAndroidEpollCreate1(flags: Int): Int

public actual fun epollCreate1(flags: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidEpollCreate1(flags).toInt()

public actual fun epollWait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidEpollWait")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr<EpollEvent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidEpollCtl")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidUnshare")
private external fun wasiLibcUnixLinuxlikeAndroidUnshare(flags: Int): Int

public actual fun unshare(flags: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidUnshare(flags).toInt()

public actual fun umount(target: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidUmount")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSchedGetPriorityMax")
private external fun wasiLibcUnixLinuxlikeAndroidSchedGetPriorityMax(policy: Int): Int

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidSchedGetPriorityMax(policy).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidTee")
private external fun wasiLibcUnixLinuxlikeAndroidTee(fdIn: Int, fdOut: Int, len: Long, flags: Int): Long

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    wasiLibcUnixLinuxlikeAndroidTee(fdIn, fdOut, len.toLong(), flags.toInt()).toLong()

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSettimeofday")

public actual fun splice(fdIn: CInt, offIn: MutPtr<LoffT>, fdOut: CInt, offOut: MutPtr<LoffT>, len: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSplice")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidEventfd")
private external fun wasiLibcUnixLinuxlikeAndroidEventfd(initval: Int, flags: Int): Int

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidEventfd(initval.toInt(), flags).toInt()

public actual fun eventfdRead(fd: CInt, value: MutPtr<EventfdT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidEventfdRead")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidEventfdWrite")
private external fun wasiLibcUnixLinuxlikeAndroidEventfdWrite(fd: Int, value: Long): Int

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    wasiLibcUnixLinuxlikeAndroidEventfdWrite(fd, value.toLong()).toInt()

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedRrGetInterval")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSemTimedwait")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSemGetvalue")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedSetparam")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSetns")
private external fun wasiLibcUnixLinuxlikeAndroidSetns(fd: Int, nstype: Int): Int

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidSetns(fd, nstype).toInt()

public actual fun swapoff(puath: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSwapoff")

public actual fun vmsplice(fd: CInt, iov: ConstPtr<Iovec>, nrSegs: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidVmsplice")

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, fstype: ConstPtr<CChar>, flags: CUlong, data: ConstPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMount")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidPersonality")
private external fun wasiLibcUnixLinuxlikeAndroidPersonality(persona: Int): Int

public actual fun personality(persona: CUint): CInt =
    wasiLibcUnixLinuxlikeAndroidPersonality(persona.toInt()).toInt()

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPrctl")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedGetparam")

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPpoll")

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr<CVoid>, flags: CInt, arg: MutPtr<CVoid>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidClone")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSchedGetscheduler")
private external fun wasiLibcUnixLinuxlikeAndroidSchedGetscheduler(pid: Int): Int

public actual fun schedGetscheduler(pid: PidT): CInt =
    wasiLibcUnixLinuxlikeAndroidSchedGetscheduler(pid).toInt()

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidClockNanosleep")

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSethostname")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSchedGetPriorityMin")
private external fun wasiLibcUnixLinuxlikeAndroidSchedGetPriorityMin(policy: Int): Int

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidSchedGetPriorityMin(policy).toInt()

public actual fun sysinfo(info: MutPtr<Sysinfo>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSysinfo")

public actual fun umount2(target: ConstPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidUmount2")

public actual fun swapon(path: ConstPtr<CChar>, swapflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSwapon")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSchedSetscheduler")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr<OffT>, count: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSendfile")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr<Off64T>, count: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSendfile64")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSetfsgid")
private external fun wasiLibcUnixLinuxlikeAndroidSetfsgid(gid: Int): Int

public actual fun setfsgid(gid: GidT): CInt =
    wasiLibcUnixLinuxlikeAndroidSetfsgid(gid.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSetfsuid")
private external fun wasiLibcUnixLinuxlikeAndroidSetfsuid(uid: Int): Int

public actual fun setfsuid(uid: UidT): CInt =
    wasiLibcUnixLinuxlikeAndroidSetfsuid(uid.toInt()).toInt()

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSigsuspend")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetgrgidR")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSigaltstack")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSemClose")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetgrnamR")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSemOpen")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetgrnam")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSemUnlink")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidDaemon")
private external fun wasiLibcUnixLinuxlikeAndroidDaemon(nochdir: Int, noclose: Int): Int

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidDaemon(nochdir, noclose).toInt()

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSigtimedwait")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSigwait")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetgrgid")

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetgrouplist")

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidInitgroups")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidPopen")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFaccessat")

public actual fun errno(): MutPtr<CInt> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidErrno")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidInotifyRmWatch")
private external fun wasiLibcUnixLinuxlikeAndroidInotifyRmWatch(fd: Int, wd: Int): Int

public actual fun inotifyRmWatch(fd: CInt, wd: UInt): CInt =
    wasiLibcUnixLinuxlikeAndroidInotifyRmWatch(fd, wd.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidInotifyInit")
private external fun wasiLibcUnixLinuxlikeAndroidInotifyInit(): Int

public actual fun inotifyInit(): CInt =
    wasiLibcUnixLinuxlikeAndroidInotifyInit().toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidInotifyInit1")
private external fun wasiLibcUnixLinuxlikeAndroidInotifyInit1(flags: Int): Int

public actual fun inotifyInit1(flags: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidInotifyInit1(flags).toInt()

public actual fun inotifyAddWatch(fd: CInt, path: ConstPtr<CChar>, mask: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidInotifyAddWatch")

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidRegcomp")

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidRegexec")

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidRegerror")

public actual fun regfree(preg: MutPtr<RegexT>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidRegfree")

public actual fun androidSetAbortMessage(msg: ConstPtr<CChar>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidAndroidSetAbortMessage")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidGettid")
private external fun wasiLibcUnixLinuxlikeAndroidGettid(): Int

public actual fun gettid(): PidT =
    wasiLibcUnixLinuxlikeAndroidGettid().toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidTgkill")
private external fun wasiLibcUnixLinuxlikeAndroidTgkill(tgid: Int, tid: Int, sig: Int): Int

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidTgkill(tgid, tid, sig).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidGetauxval")
private external fun wasiLibcUnixLinuxlikeAndroidGetauxval(type: Long): Long

public actual fun getauxval(type: CUlong): CUlong =
    wasiLibcUnixLinuxlikeAndroidGetauxval(type.toLong()).toULong()

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetrandom")

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetentropy")

public actual fun systemPropertySet(name: ConstPtr<CChar>, value: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSystemPropertySet")

public actual fun systemPropertyGet(name: ConstPtr<CChar>, value: MutPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSystemPropertyGet")

public actual fun systemPropertyFind(name: ConstPtr<CChar>): ConstPtr<PropInfo> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSystemPropertyFind")

public actual fun systemPropertyFindNth(n: CUint): ConstPtr<PropInfo> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSystemPropertyFindNth")

public actual fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidSystemPropertyForeach")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidDlIteratePhdr")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidArc4random")
private external fun wasiLibcUnixLinuxlikeAndroidArc4random(): Int

public actual fun arc4random(): UInt =
    wasiLibcUnixLinuxlikeAndroidArc4random().toUInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidArc4randomUniform")
private external fun wasiLibcUnixLinuxlikeAndroidArc4randomUniform(upperBound: Int): Int

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    wasiLibcUnixLinuxlikeAndroidArc4randomUniform(upperBound.toInt()).toUInt()

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, n: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidArc4randomBuf")

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidReallocarray")

public actual fun dirname(path: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidDirname")

public actual fun basename(path: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidBasename")

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidGetoptLong")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSync")
private external fun wasiLibcUnixLinuxlikeAndroidSync(): Unit

public actual fun sync(): Unit =
    wasiLibcUnixLinuxlikeAndroidSync()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeAndroidSyncfs")
private external fun wasiLibcUnixLinuxlikeAndroidSyncfs(fd: Int): Int

public actual fun syncfs(fd: CInt): CInt =
    wasiLibcUnixLinuxlikeAndroidSyncfs(fd).toInt()

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMemmem")

public actual fun freadUnlocked(buf: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFreadUnlocked")

public actual fun fwriteUnlocked(buf: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFwriteUnlocked")

public actual fun fflushUnlocked(stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFflushUnlocked")

public actual fun fgetsUnlocked(buf: MutPtr<CChar>, size: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidFgetsUnlocked")

public actual fun klogctl(syslogType: CInt, bufp: MutPtr<CChar>, len: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidKlogctl")

public actual fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidMemfdCreate")

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidRenameat2")
