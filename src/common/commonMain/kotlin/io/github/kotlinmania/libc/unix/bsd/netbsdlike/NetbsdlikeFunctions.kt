package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
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
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.ioc
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.DevT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun io(g: CUlong, n: CUlong): CUlong = ioc(IOC_VOID, g, n, 0uL)

/**
 * Build an ioctl number for an read-only ioctl.
 */
public fun <T> ior(g: CUlong, n: CUlong, typeLayoutT: TypeLayout<T>): CUlong = ioc(IOC_OUT, g, n, sizeOf<T>(typeLayoutT = typeLayoutT).toULong())

/**
 * Build an ioctl number for an write-only ioctl.
 */
public fun <T> iow(g: CUlong, n: CUlong, typeLayoutT: TypeLayout<T>): CUlong = ioc(IOC_IN, g, n, sizeOf<T>(typeLayoutT = typeLayoutT).toULong())

/**
 * Build an ioctl number for a read-write ioctl.
 */
public fun <T> iowr(g: CUlong, n: CUlong, typeLayoutT: TypeLayout<T>): CUlong = ioc(IOC_INOUT, g, n, sizeOf<T>(typeLayoutT = typeLayoutT).toULong())

public expect fun setgrent()

public expect fun semDestroy(sem: MutPtr<SemT>): CInt

public expect fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun accept4(s: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>, flags: CInt): CInt

public expect fun mincore(addr: MutPtr<CVoid>, len: SizeT, vec: MutPtr<CChar>): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt

public expect fun errno(): MutPtr<CInt>

public expect fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt

public expect fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt

public expect fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

public expect fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun loginTty(fd: CInt): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt

public expect fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt

public expect fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt

public expect fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt

public expect fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt

public expect fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, ts: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt

public expect fun getgrouplist(name: ConstPtr<CChar>, basegid: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt

public expect fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt

public expect fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt

public expect fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt

public expect fun uname(buf: MutPtr<Utsname>): CInt

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid>

public expect fun shmdt(shmaddr: ConstPtr<CVoid>): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt

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

public expect fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun gethostid(): CLong

public expect fun sethostid(hostid: CLong): CInt

public expect fun ftok(path: ConstPtr<CChar>, id: CInt): KeyT

public expect fun dirname(path: MutPtr<CChar>): MutPtr<CChar>

public expect fun basename(path: MutPtr<CChar>): MutPtr<CChar>

public expect fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt

public expect fun sendmmsg(sockfd: CInt, mmsg: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt

public expect fun recvmmsg(sockfd: CInt, mmsg: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt

public expect fun closefrom(lowfd: CInt): CInt
