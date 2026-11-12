@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.solarish.illumos.Aiocb
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpAffinityT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpRsrcT
import io.github.kotlinmania.libc.unix.solarish.illumos.ShmidDs
import io.github.kotlinmania.libc.unix.solarish.illumos.Utmpx
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetrlimit")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSetrlimit")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishStrerrorR")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSemDestroy")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSemInit")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishAbs")
private external fun wasiLibcUnixSolarishAbs(i: Int): Int

public actual fun abs(i: CInt): CInt =
    wasiLibcUnixSolarishAbs(i)

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishAcct")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishDirfd")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishLabs")
private external fun wasiLibcUnixSolarishLabs(i: Long): Long

public actual fun labs(i: CLong): CLong =
    wasiLibcUnixSolarishLabs(i)

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishRand")
private external fun wasiLibcUnixSolarishRand(): Int

public actual fun rand(): CInt =
    wasiLibcUnixSolarishRand()

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishSrand")
private external fun wasiLibcUnixSolarishSrand(seed: Int): Unit

public actual fun srand(seed: CUint): Unit =
    wasiLibcUnixSolarishSrand(seed.toInt())

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetentropy")

public actual fun getrandom(bbuf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetrandom")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGettimeofday")

public actual fun settimeofday(tp: ConstPtr<Timeval>, tz: ConstPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSettimeofday")

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetifaddrs")

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishFreeifaddrs")

public actual fun stackGetbounds(sp: MutPtr<StackT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishStackGetbounds")

public actual fun getgrouplist(name: ConstPtr<CChar>, basegid: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetgrouplist")

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishInitgroups")

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSetgroups")

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIoctl")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMprotect")

public actual fun errno(): MutPtr<CInt> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishErrno")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishClockGetres")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishClockGettime")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishClockNanosleep")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishClockSettime")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetnameinfo")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishSetpwent")
private external fun wasiLibcUnixSolarishSetpwent(): Unit

public actual fun setpwent(): Unit =
    wasiLibcUnixSolarishSetpwent()

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishEndpwent")
private external fun wasiLibcUnixSolarishEndpwent(): Unit

public actual fun endpwent(): Unit =
    wasiLibcUnixSolarishEndpwent()

public actual fun getpwent(): MutPtr<Passwd> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetpwent")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishFdatasync")
private external fun wasiLibcUnixSolarishFdatasync(fd: Int): Int

public actual fun fdatasync(fd: CInt): CInt =
    wasiLibcUnixSolarishFdatasync(fd)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishNlLanginfoL")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishDuplocale")

public actual fun freelocale(loc: LocaleT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishFreelocale")

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishNewlocale")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUselocale")

public actual fun getprogname(): ConstPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetprogname")

public actual fun setprogname(name: ConstPtr<CChar>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSetprogname")

public actual fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetloadavg")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishGetpriority")
private external fun wasiLibcUnixSolarishGetpriority(which: Int, who: Int): Int

public actual fun getpriority(which: CInt, who: CInt): CInt =
    wasiLibcUnixSolarishGetpriority(which, who)

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishSetpriority")
private external fun wasiLibcUnixSolarishSetpriority(which: Int, who: Int, prio: Int): Int

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    wasiLibcUnixSolarishSetpriority(which, who, prio)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMknodat")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMkfifoat")

public actual fun sethostname(name: ConstPtr<CChar>, len: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSethostname")

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIfNameindex")

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIfFreenameindex")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPthreadCreate")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPthreadAttrGetstack")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPthreadCondattrGetclock")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPthreadCondattrSetclock")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSemTimedwait")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSemGetvalue")

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPthreadMutexTimedlock")

public actual fun pthreadGetnameNp(tid: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPthreadGetnameNp")

public actual fun pthreadSetnameNp(tid: PthreadT, name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPthreadSetnameNp")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishWaitid")

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGlob")

public actual fun globfree(pglob: MutPtr<GlobT>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGlobfree")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishPosixFallocate")
private external fun wasiLibcUnixSolarishPosixFallocate(fd: Int, offset: Long, len: Long): Int

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    wasiLibcUnixSolarishPosixFallocate(fd, offset, len)

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixMadvise")

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawn")

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnp")

public actual fun posixSpawnFileActionsInit(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnFileActionsInit")

public actual fun posixSpawnFileActionsDestroy(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnFileActionsDestroy")

public actual fun posixSpawnFileActionsAddopen(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnFileActionsAddopen")

public actual fun posixSpawnFileActionsAddclose(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnFileActionsAddclose")

public actual fun posixSpawnFileActionsAdddup2(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, newfildes: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnFileActionsAdddup2")

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: MutPtr<PosixSpawnFileActionsT>, lowfiledes: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnFileActionsAddclosefromNp")

public actual fun posixSpawnFileActionsAddchdir(fileActions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnFileActionsAddchdir")

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnFileActionsAddchdirNp")

public actual fun posixSpawnFileActionsAddfchdir(fileActions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnFileActionsAddfchdir")

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrInit")

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrDestroy")

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrSetflags")

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrGetflags")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, pgroup: PidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrSetpgroup")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, pgroup: MutPtr<PidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrGetpgroup")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrSetschedparam")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrGetschedparam")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, policy: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrSetschedpolicy")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, policy: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrGetschedpolicy")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, sigdefault: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrSetsigdefault")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, sigdefault: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrGetsigdefault")

public actual fun posixSpawnattrSetsigignoreNp(attr: MutPtr<PosixSpawnattrT>, sigignore: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrSetsigignoreNp")

public actual fun posixSpawnattrGetsigignoreNp(attr: ConstPtr<PosixSpawnattrT>, sigignore: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrGetsigignoreNp")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, sigmask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrSetsigmask")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, sigmask: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPosixSpawnattrGetsigmask")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishShmat")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishShmctl")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishShmdt")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishShmget")
private external fun wasiLibcUnixSolarishShmget(key: Int, size: Long, shmflg: Int): Int

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    wasiLibcUnixSolarishShmget(key, size.toLong(), shmflg)

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishShmOpen")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishShmUnlink")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSeekdir")

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishTelldir")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMadvise")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMsync")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMemalign")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishRecvfrom")

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMkstemps")

public actual fun futimesat(fd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishFutimesat")

public actual fun futimens(dirfd: CInt, times: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishFutimens")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUtimensat")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishNlLanginfo")

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishBind")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishWritev")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishReadv")

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSendmsg")

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishRecvmsg")

public actual fun accept4(fd: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishAccept4")

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMqOpen")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMqClose")

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMqUnlink")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMqReceive")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMqTimedreceive")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMqSend")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMqTimedsend")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMqGetattr")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMqSetattr")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishPortCreate")
private external fun wasiLibcUnixSolarishPortCreate(): Int

public actual fun portCreate(): CInt =
    wasiLibcUnixSolarishPortCreate()

public actual fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPortAssociate")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishPortDissociate")
private external fun wasiLibcUnixSolarishPortDissociate(port: Int, source: Int, obj: Long): Int

public actual fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt =
    wasiLibcUnixSolarishPortDissociate(port, source, obj.toLong())

public actual fun portGet(port: CInt, pe: MutPtr<PortEvent>, timeout: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPortGet")

public actual fun portGetn(port: CInt, peList: MutPtr<PortEvent>, max: CUint, nget: MutPtr<CUint>, timeout: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPortGetn")

public actual fun portSend(port: CInt, events: CInt, user: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPortSend")

public actual fun portSendn(portList: MutPtr<CInt>, errorList: MutPtr<CInt>, nent: CUint, events: CInt, user: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPortSendn")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetgrgidR")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSigaltstack")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSigsuspend")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSemClose")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishGetdtablesize")
private external fun wasiLibcUnixSolarishGetdtablesize(): Int

public actual fun getdtablesize(): CInt =
    wasiLibcUnixSolarishGetdtablesize()

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetgrnamR")

public actual fun thrSelf(): ThreadT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishThrSelf")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPthreadSigmask")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSemOpen")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetgrnam")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPthreadKill")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishSchedGetPriorityMin")
private external fun wasiLibcUnixSolarishSchedGetPriorityMin(policy: Int): Int

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    wasiLibcUnixSolarishSchedGetPriorityMin(policy)

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishSchedGetPriorityMax")
private external fun wasiLibcUnixSolarishSchedGetPriorityMax(policy: Int): Int

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    wasiLibcUnixSolarishSchedGetPriorityMax(policy)

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSchedGetparam")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSchedSetparam")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishSchedGetscheduler")
private external fun wasiLibcUnixSolarishSchedGetscheduler(pid: Int): Int

public actual fun schedGetscheduler(pid: PidT): CInt =
    wasiLibcUnixSolarishSchedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSchedSetscheduler")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSemUnlink")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishDaemon")
private external fun wasiLibcUnixSolarishDaemon(nochdir: Int, noclose: Int): Int

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    wasiLibcUnixSolarishDaemon(nochdir, noclose)

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetpwnamR")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetpwuidR")

public actual fun nativeGetpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Passwd> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishNativeGetpwentR")

public actual fun nativeGetgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishNativeGetgrentR")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSigwait")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPthreadAtfork")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetgrgid")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishSetgrent")
private external fun wasiLibcUnixSolarishSetgrent(): Unit

public actual fun setgrent(): Unit =
    wasiLibcUnixSolarishSetgrent()

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishEndgrent")
private external fun wasiLibcUnixSolarishEndgrent(): Unit

public actual fun endgrent(): Unit =
    wasiLibcUnixSolarishEndgrent()

public actual fun getgrent(): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetgrent")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPopen")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishDup3")
private external fun wasiLibcUnixSolarishDup3(src: Int, dst: Int, flags: Int): Int

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    wasiLibcUnixSolarishDup3(src, dst, flags)

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUname")

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPipe2")

public actual fun makeutx(ux: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMakeutx")

public actual fun modutx(ux: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishModutx")

public actual fun updwtmpx(file: ConstPtr<CChar>, ut: MutPtr<Utmpx>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUpdwtmpx")

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUtmpxname")

public actual fun getutxent(): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetutxent")

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetutxid")

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetutxline")

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPututxline")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishSetutxent")
private external fun wasiLibcUnixSolarishSetutxent(): Unit

public actual fun setutxent(): Unit =
    wasiLibcUnixSolarishSetutxent()

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishEndutxent")
private external fun wasiLibcUnixSolarishEndutxent(): Unit

public actual fun endutxent(): Unit =
    wasiLibcUnixSolarishEndutxent()

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishEndutent")
private external fun wasiLibcUnixSolarishEndutent(): Unit

public actual fun endutent(): Unit =
    wasiLibcUnixSolarishEndutent()

public actual fun getutent(): MutPtr<Utmp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetutent")

public actual fun getutid(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetutid")

public actual fun getutline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetutline")

public actual fun pututline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPututline")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishSetutent")
private external fun wasiLibcUnixSolarishSetutent(): Unit

public actual fun setutent(): Unit =
    wasiLibcUnixSolarishSetutent()

public actual fun utmpname(file: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUtmpname")

public actual fun getutmp(ux: ConstPtr<Utmpx>, u: MutPtr<Utmp>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetutmp")

public actual fun getutmpx(u: ConstPtr<Utmp>, ux: MutPtr<Utmpx>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetutmpx")

public actual fun updwtmp(file: ConstPtr<CChar>, u: MutPtr<Utmp>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUpdwtmp")

public actual fun ntpAdjtime(buf: MutPtr<Timex>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishNtpAdjtime")

public actual fun ntpGettime(buf: MutPtr<Ntptimeval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishNtpGettime")

public actual fun timerCreate(clockId: ClockidT, evp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishTimerCreate")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishTimerDelete")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishTimerGetoverrun")

public actual fun timerGettime(timerid: TimerT, value: MutPtr<Itimerspec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishTimerGettime")

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr<Itimerspec>, ovalue: MutPtr<Itimerspec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishTimerSettime")

public actual fun ucredGet(pid: PidT): MutPtr<UcredT> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUcredGet")

public actual fun getpeerucred(fd: CInt, ucred: MutPtr<MutPtr<UcredT>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetpeerucred")

public actual fun ucredFree(ucred: MutPtr<UcredT>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUcredFree")

public actual fun ucredGeteuid(ucred: ConstPtr<UcredT>): UidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUcredGeteuid")

public actual fun ucredGetruid(ucred: ConstPtr<UcredT>): UidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUcredGetruid")

public actual fun ucredGetsuid(ucred: ConstPtr<UcredT>): UidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUcredGetsuid")

public actual fun ucredGetegid(ucred: ConstPtr<UcredT>): GidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUcredGetegid")

public actual fun ucredGetrgid(ucred: ConstPtr<UcredT>): GidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUcredGetrgid")

public actual fun ucredGetsgid(ucred: ConstPtr<UcredT>): GidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUcredGetsgid")

public actual fun ucredGetgroups(ucred: ConstPtr<UcredT>, groups: MutPtr<ConstPtr<GidT>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUcredGetgroups")

public actual fun ucredGetpid(ucred: ConstPtr<UcredT>): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUcredGetpid")

public actual fun ucredGetprojid(ucred: ConstPtr<UcredT>): ProjidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUcredGetprojid")

public actual fun ucredGetzoneid(ucred: ConstPtr<UcredT>): ZoneidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUcredGetzoneid")

public actual fun ucredGetpflags(ucred: ConstPtr<UcredT>, flags: CUint): CUint =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishUcredGetpflags")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishUcredSize")
private external fun wasiLibcUnixSolarishUcredSize(): Long

public actual fun ucredSize(): SizeT =
    wasiLibcUnixSolarishUcredSize().toULong()

public actual fun psetCreate(newpset: MutPtr<PsetidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPsetCreate")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishPsetDestroy")
private external fun wasiLibcUnixSolarishPsetDestroy(pset: Int): Int

public actual fun psetDestroy(pset: PsetidT): CInt =
    wasiLibcUnixSolarishPsetDestroy(pset)

public actual fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: MutPtr<PsetidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPsetAssign")

public actual fun psetInfo(pset: PsetidT, tpe: MutPtr<CInt>, numcpus: MutPtr<CUint>, cpulist: MutPtr<ProcessoridT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPsetInfo")

public actual fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: MutPtr<PsetidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPsetBind")

public actual fun psetList(pset: MutPtr<PsetidT>, numpsets: MutPtr<CUint>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPsetList")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishPsetSetattr")
private external fun wasiLibcUnixSolarishPsetSetattr(pset: Int, attr: Int): Int

public actual fun psetSetattr(pset: PsetidT, attr: CUint): CInt =
    wasiLibcUnixSolarishPsetSetattr(pset, attr.toInt())

public actual fun psetGetattr(pset: PsetidT, attr: MutPtr<CUint>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishPsetGetattr")

public actual fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: MutPtr<ProcessoridT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishProcessorBind")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishPOnline")
private external fun wasiLibcUnixSolarishPOnline(processorid: Int, flag: Int): Int

public actual fun pOnline(processorid: ProcessoridT, flag: CInt): CInt =
    wasiLibcUnixSolarishPOnline(processorid, flag)

public actual fun processorInfo(processorid: ProcessoridT, infop: MutPtr<ProcessorInfoT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishProcessorInfo")

public actual fun getexecname(): ConstPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetexecname")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishGethostid")
private external fun wasiLibcUnixSolarishGethostid(): Long

public actual fun gethostid(): CLong =
    wasiLibcUnixSolarishGethostid()

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishGetpflags")
private external fun wasiLibcUnixSolarishGetpflags(flags: Int): Int

public actual fun getpflags(flags: CUint): CUint =
    wasiLibcUnixSolarishGetpflags(flags.toInt()).toUInt()

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishSetpflags")
private external fun wasiLibcUnixSolarishSetpflags(flags: Int, value: Int): Int

public actual fun setpflags(flags: CUint, value: CUint): CInt =
    wasiLibcUnixSolarishSetpflags(flags.toInt(), value.toInt())

public actual fun sysinfo(command: CInt, buf: MutPtr<CChar>, count: CLong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSysinfo")

public actual fun faccessat(fd: CInt, path: ConstPtr<CChar>, amode: CInt, flag: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishFaccessat")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishDlIteratePhdr")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishGetpagesize")
private external fun wasiLibcUnixSolarishGetpagesize(): Int

public actual fun getpagesize(): CInt =
    wasiLibcUnixSolarishGetpagesize()

public actual fun getpagesizes(pagesize: MutPtr<SizeT>, nelem: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetpagesizes")

public actual fun mmapobj(fd: CInt, flags: CUint, storage: MutPtr<MmapobjResultT>, elements: MutPtr<CUint>, arg: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMmapobj")

public actual fun meminfo(inaddr: ConstPtr<ULong>, addrCount: CInt, infoReq: ConstPtr<CUint>, infoCount: CInt, outdata: MutPtr<ULong>, validity: MutPtr<CUint>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishMeminfo")

public actual fun strsep(string: MutPtr<MutPtr<CChar>>, delim: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishStrsep")

public actual fun getisax(array: MutPtr<UInt>, n: CUint): CUint =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetisax")

public actual fun backtrace(buffer: MutPtr<MutPtr<CVoid>>, size: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishBacktrace")

public actual fun backtraceSymbols(buffer: ConstPtr<MutPtr<CVoid>>, size: CInt): MutPtr<MutPtr<CChar>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishBacktraceSymbols")

public actual fun backtraceSymbolsFd(buffer: ConstPtr<MutPtr<CVoid>>, size: CInt, fd: CInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishBacktraceSymbolsFd")

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishGetoptLong")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishSync")
private external fun wasiLibcUnixSolarishSync(): Unit

public actual fun sync(): Unit =
    wasiLibcUnixSolarishSync()

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishAioCancel")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishAioError")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishAioFsync")

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishAioRead")

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishAioReturn")

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishAioSuspend")

public actual fun aioWaitn(aiocbList: MutPtr<MutPtr<Aiocb>>, nent: CUint, nwait: MutPtr<CUint>, timeout: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishAioWaitn")

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishAioWrite")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishLioListio")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishMajor")
private external fun wasiLibcUnixSolarishMajor(version: Int, devnum: Long): Int

public actual fun major(version: CInt, devnum: DevT): MajorT =
    wasiLibcUnixSolarishMajor(version, devnum.toLong()).toUInt()

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishMinor")
private external fun wasiLibcUnixSolarishMinor(version: Int, devnum: Long): Int

public actual fun minor(version: CInt, devnum: DevT): MinorT =
    wasiLibcUnixSolarishMinor(version, devnum.toLong()).toUInt()

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishMakedev")
private external fun wasiLibcUnixSolarishMakedev(version: Int, majdev: Int, mindev: Int): Long

public actual fun makedev(version: CInt, majdev: MajorT, mindev: MinorT): DevT =
    wasiLibcUnixSolarishMakedev(version, majdev.toInt(), mindev.toInt()).toULong()

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishArc4random")
private external fun wasiLibcUnixSolarishArc4random(): Int

public actual fun arc4random(): UInt =
    wasiLibcUnixSolarishArc4random().toUInt()

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, nbytes: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishArc4randomBuf")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishArc4randomUniform")
private external fun wasiLibcUnixSolarishArc4randomUniform(upperBound: Int): Int

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    wasiLibcUnixSolarishArc4randomUniform(upperBound.toInt()).toUInt()

public actual fun secureGetenv(name: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSecureGetenv")

public actual fun strftime(s: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishStrftime")

public actual fun strftimeL(s: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>, loc: LocaleT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishStrftimeL")

public actual fun sendfile(outFd: CInt, inFd: CInt, off: MutPtr<OffT>, len: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSendfile")

public actual fun sendfilev(fildes: CInt, vec: ConstPtr<SendfilevecT>, sfvcnt: CInt, xferred: MutPtr<SizeT>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSendfilev")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishLgrpInit")
private external fun wasiLibcUnixSolarishLgrpInit(view: Int): Long

public actual fun lgrpInit(view: LgrpViewT): LgrpCookieT =
    wasiLibcUnixSolarishLgrpInit(view.toInt()).toULong()

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishLgrpFini")
private external fun wasiLibcUnixSolarishLgrpFini(cookie: Long): Int

public actual fun lgrpFini(cookie: LgrpCookieT): CInt =
    wasiLibcUnixSolarishLgrpFini(cookie.toLong())

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishLgrpAffinityGet")
private external fun wasiLibcUnixSolarishLgrpAffinityGet(idtype: Int, id: Int, lgrp: Int): Int

public actual fun lgrpAffinityGet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT): LgrpAffinityT =
    wasiLibcUnixSolarishLgrpAffinityGet(idtype.toInt(), id, lgrp)

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishLgrpAffinitySet")
private external fun wasiLibcUnixSolarishLgrpAffinitySet(idtype: Int, id: Int, lgrp: Int, aff: Int): Int

public actual fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt =
    wasiLibcUnixSolarishLgrpAffinitySet(idtype.toInt(), id, lgrp, aff)

public actual fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: MutPtr<ProcessoridT>, count: CUint, content: LgrpContentT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishLgrpCpus")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishLgrpMemSize")
private external fun wasiLibcUnixSolarishLgrpMemSize(cookie: Long, lgrp: Int, tpe: Int, content: Int): Long

public actual fun lgrpMemSize(cookie: LgrpCookieT, lgrp: LgrpIdT, tpe: LgrpMemSizeFlagT, content: LgrpContentT): LgrpMemSizeT =
    wasiLibcUnixSolarishLgrpMemSize(cookie.toLong(), lgrp, tpe.toInt(), content.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishLgrpNlgrps")
private external fun wasiLibcUnixSolarishLgrpNlgrps(cookie: Long): Int

public actual fun lgrpNlgrps(cookie: LgrpCookieT): CInt =
    wasiLibcUnixSolarishLgrpNlgrps(cookie.toLong())

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishLgrpView")
private external fun wasiLibcUnixSolarishLgrpView(cookie: Long): Int

public actual fun lgrpView(cookie: LgrpCookieT): LgrpViewT =
    wasiLibcUnixSolarishLgrpView(cookie.toLong()).toUInt()

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishLgrpHome")
private external fun wasiLibcUnixSolarishLgrpHome(idtype: Int, id: Int): Int

public actual fun lgrpHome(idtype: IdtypeT, id: IdT): LgrpIdT =
    wasiLibcUnixSolarishLgrpHome(idtype.toInt(), id)

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishLgrpVersion")
private external fun wasiLibcUnixSolarishLgrpVersion(version: Int): Int

public actual fun lgrpVersion(version: CInt): CInt =
    wasiLibcUnixSolarishLgrpVersion(version)

public actual fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: MutPtr<LgrpIdT>, count: CUint, tpe: LgrpRsrcT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishLgrpResources")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishLgrpRoot")
private external fun wasiLibcUnixSolarishLgrpRoot(cookie: Long): Int

public actual fun lgrpRoot(cookie: LgrpCookieT): LgrpIdT =
    wasiLibcUnixSolarishLgrpRoot(cookie.toLong())
