@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.Utsname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.IdtypeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PosixSpawnFileActionsT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PosixSpawnattrT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PthreadCondattrT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PthreadMutexT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PthreadSpinlockT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.ShmidDs
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SiginfoT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SigsetT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.DevT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeSetgrent")
private external fun wasiLibcUnixBsdNetbsdlikeSetgrent(): Unit

public actual fun setgrent(): Unit =
    wasiLibcUnixBsdNetbsdlikeSetgrent()

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeSemDestroy")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeSemInit")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeDaemon")
private external fun wasiLibcUnixBsdNetbsdlikeDaemon(nochdir: Int, noclose: Int): Int

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    wasiLibcUnixBsdNetbsdlikeDaemon(nochdir, noclose).toInt()

public actual fun accept4(s: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeAccept4")

public actual fun mincore(addr: MutPtr<CVoid>, len: SizeT, vec: MutPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeMincore")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeClockGetres")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeClockGettime")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeClockSettime")

public actual fun errno(): MutPtr<CInt> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeErrno")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeShmOpen")

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeMemrchr")

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeMkostemp")

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeMkostemps")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePwritev")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePreadv")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeFutimens")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeUtimensat")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeFdatasync")
private external fun wasiLibcUnixBsdNetbsdlikeFdatasync(fd: Int): Int

public actual fun fdatasync(fd: CInt): CInt =
    wasiLibcUnixBsdNetbsdlikeFdatasync(fd).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeLoginTty")
private external fun wasiLibcUnixBsdNetbsdlikeLoginTty(fd: Int): Int

public actual fun loginTty(fd: CInt): CInt =
    wasiLibcUnixBsdNetbsdlikeLoginTty(fd).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeGetpriority")
private external fun wasiLibcUnixBsdNetbsdlikeGetpriority(which: Int, who: Int): Int

public actual fun getpriority(which: CInt, who: IdT): CInt =
    wasiLibcUnixBsdNetbsdlikeGetpriority(which, who.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeSetpriority")
private external fun wasiLibcUnixBsdNetbsdlikeSetpriority(which: Int, who: Int, prio: Int): Int

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    wasiLibcUnixBsdNetbsdlikeSetpriority(which, who.toInt(), prio).toInt()

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeMknodat")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeMkfifoat")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeSemTimedwait")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeSemGetvalue")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePthreadCondattrSetclock")

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeSethostname")

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePthreadMutexTimedlock")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePthreadSpinInit")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePthreadSpinDestroy")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePthreadSpinLock")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePthreadSpinTrylock")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePthreadSpinUnlock")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePthreadSetschedparam")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePthreadGetschedparam")

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePipe2")

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, ts: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePpoll")

public actual fun getgrouplist(name: ConstPtr<CChar>, basegid: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeGetgrouplist")

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeInitgroups")

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeGetdomainname")

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeSetdomainname")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeUname")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeShmget")
private external fun wasiLibcUnixBsdNetbsdlikeShmget(key: Long, size: Long, shmflg: Int): Int

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    wasiLibcUnixBsdNetbsdlikeShmget(key, size.toLong(), shmflg).toInt()

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeShmat")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeShmdt")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeShmctl")

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeExecvpe")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeWaitid")

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawn")

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnp")

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnattrInit")

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnattrDestroy")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnattrGetsigdefault")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnattrSetsigdefault")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnattrGetsigmask")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnattrSetsigmask")

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnattrGetflags")

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnattrSetflags")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnattrGetpgroup")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnattrSetpgroup")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnattrGetschedpolicy")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnattrSetschedpolicy")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnattrGetschedparam")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnattrSetschedparam")

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnFileActionsInit")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnFileActionsDestroy")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnFileActionsAddopen")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnFileActionsAddclose")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikePosixSpawnFileActionsAdddup2")

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeReallocarray")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeGethostid")
private external fun wasiLibcUnixBsdNetbsdlikeGethostid(): Long

public actual fun gethostid(): CLong =
    wasiLibcUnixBsdNetbsdlikeGethostid().toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeSethostid")
private external fun wasiLibcUnixBsdNetbsdlikeSethostid(hostid: Long): Int

public actual fun sethostid(hostid: CLong): CInt =
    wasiLibcUnixBsdNetbsdlikeSethostid(hostid).toInt()

public actual fun ftok(path: ConstPtr<CChar>, id: CInt): KeyT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeFtok")

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeDirname")

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeBasename")

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeGetentropy")

public actual fun sendmmsg(sockfd: CInt, mmsg: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeSendmmsg")

public actual fun recvmmsg(sockfd: CInt, mmsg: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeRecvmmsg")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeClosefrom")
private external fun wasiLibcUnixBsdNetbsdlikeClosefrom(lowfd: Int): Int

public actual fun closefrom(lowfd: CInt): CInt =
    wasiLibcUnixBsdNetbsdlikeClosefrom(lowfd).toInt()
