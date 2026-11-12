package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.IdtypeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.ioc
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.DevT
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

public expect fun semDestroy(sem: MutPtr): CInt

public expect fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun accept4(s: CInt, addr: MutPtr, addrlen: MutPtr, flags: CInt): CInt

public expect fun mincore(addr: MutPtr, len: SizeT, vec: MutPtr): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt

public expect fun errno(): MutPtr

public expect fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun mkostemp(template: MutPtr, flags: CInt): CInt

public expect fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt

public expect fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT

public expect fun futimens(fd: CInt, times: ConstPtr): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun loginTty(fd: CInt): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt

public expect fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt

public expect fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt

public expect fun sethostname(name: ConstPtr, len: SizeT): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt

public expect fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr): CInt

public expect fun pthreadSpinLock(lock: MutPtr): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt

public expect fun pipe2(fds: MutPtr, flags: CInt): CInt

public expect fun ppoll(fds: MutPtr, nfds: NfdsT, ts: ConstPtr, sigmask: ConstPtr): CInt

public expect fun getgrouplist(name: ConstPtr, basegid: GidT, groups: MutPtr, ngroups: MutPtr): CInt

public expect fun initgroups(name: ConstPtr, basegid: GidT): CInt

public expect fun getdomainname(name: MutPtr, len: SizeT): CInt

public expect fun setdomainname(name: ConstPtr, len: SizeT): CInt

public expect fun uname(buf: MutPtr): CInt

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr

public expect fun shmdt(shmaddr: ConstPtr): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt

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

public expect fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr

public expect fun gethostid(): CLong

public expect fun sethostid(hostid: CLong): CInt

public expect fun ftok(path: ConstPtr, id: CInt): KeyT

public expect fun dirname(path: MutPtr): MutPtr

public expect fun basename(path: MutPtr): MutPtr

public expect fun getentropy(buf: MutPtr, buflen: SizeT): CInt

public expect fun sendmmsg(sockfd: CInt, mmsg: MutPtr, vlen: CUint, flags: CInt): CInt

public expect fun recvmmsg(sockfd: CInt, mmsg: MutPtr, vlen: CUint, flags: CInt, timeout: MutPtr): CInt

public expect fun closefrom(lowfd: CInt): CInt
