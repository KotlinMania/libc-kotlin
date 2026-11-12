@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike

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
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeAccept4
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeBasename
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeClockGetres
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeClockGettime
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeClockSettime
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeClosefrom
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeDaemon
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeDirname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeErrno
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeExecvpe
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeFdatasync
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeFtok
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeFutimens
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeGetdomainname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeGetentropy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeGetgrouplist
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeGethostid
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeGetpriority
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeInitgroups
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeLoginTty
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeMemrchr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeMincore
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeMkfifoat
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeMknodat
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeMkostemp
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeMkostemps
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePipe2
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawn
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnattrGetschedparam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnattrGetschedpolicy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnattrInit
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnattrSetschedparam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnattrSetschedpolicy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePosixSpawnp
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePpoll
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePreadv
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePthreadGetschedparam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePthreadMutexTimedlock
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePthreadSetschedparam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePthreadSpinDestroy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePthreadSpinInit
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePthreadSpinLock
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePthreadSpinTrylock
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePthreadSpinUnlock
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikePwritev
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeReallocarray
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeRecvmmsg
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeSemDestroy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeSemGetvalue
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeSemInit
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeSemTimedwait
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeSendmmsg
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeSetdomainname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeSetgrent
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeSethostid
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeSethostname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeSetpriority
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeShmOpen
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeShmat
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeShmctl
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeShmdt
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeShmget
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeUname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeUtimensat
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libcUnixBsdNetbsdlikeWaitid
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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent() {
    libcUnixBsdNetbsdlikeSetgrent()
}

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    libcUnixBsdNetbsdlikeSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    libcUnixBsdNetbsdlikeSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libcUnixBsdNetbsdlikeDaemon(nochdir, noclose)

public actual fun accept4(s: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeAccept4(s, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mincore(addr: MutPtr<CVoid>, len: SizeT, vec: MutPtr<CChar>): CInt =
    libcUnixBsdNetbsdlikeMincore(addr.rawAddress.toCPointer<ByteVar>(), len, vec.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcUnixBsdNetbsdlikeClockGetres(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcUnixBsdNetbsdlikeClockGettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    libcUnixBsdNetbsdlikeClockSettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun errno(): MutPtr<CInt> =
    MutPtr(libcUnixBsdNetbsdlikeErrno()?.toLong() ?: 0L)

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    libcUnixBsdNetbsdlikeShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixBsdNetbsdlikeMemrchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeMkostemp(template.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeMkostemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixBsdNetbsdlikePwritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixBsdNetbsdlikePreadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    libcUnixBsdNetbsdlikeFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    libcUnixBsdNetbsdlikeUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun fdatasync(fd: CInt): CInt =
    libcUnixBsdNetbsdlikeFdatasync(fd)

public actual fun loginTty(fd: CInt): CInt =
    libcUnixBsdNetbsdlikeLoginTty(fd)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libcUnixBsdNetbsdlikeGetpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libcUnixBsdNetbsdlikeSetpriority(which, who, prio)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    libcUnixBsdNetbsdlikeMknodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    libcUnixBsdNetbsdlikeMkfifoat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixBsdNetbsdlikeSemTimedwait(sem.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    libcUnixBsdNetbsdlikeSemGetvalue(sem.rawAddress.toCPointer<ByteVar>(), sval.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    libcUnixBsdNetbsdlikePthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    libcUnixBsdNetbsdlikeSethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixBsdNetbsdlikePthreadMutexTimedlock(lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    libcUnixBsdNetbsdlikePthreadSpinInit(lock.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixBsdNetbsdlikePthreadSpinDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixBsdNetbsdlikePthreadSpinLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixBsdNetbsdlikePthreadSpinTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixBsdNetbsdlikePthreadSpinUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    libcUnixBsdNetbsdlikePthreadSetschedparam(native.toLong().toCPointer<ByteVar>(), policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    libcUnixBsdNetbsdlikePthreadGetschedparam(native.toLong().toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    libcUnixBsdNetbsdlikePipe2(fds.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, ts: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    libcUnixBsdNetbsdlikePpoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, ts.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun getgrouplist(name: ConstPtr<CChar>, basegid: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    libcUnixBsdNetbsdlikeGetgrouplist(name.rawAddress.toCPointer<ByteVar>(), basegid, groups.rawAddress.toCPointer<ByteVar>(), ngroups.rawAddress.toCPointer<ByteVar>())

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    libcUnixBsdNetbsdlikeInitgroups(name.rawAddress.toCPointer<ByteVar>(), basegid)

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    libcUnixBsdNetbsdlikeGetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    libcUnixBsdNetbsdlikeSetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    libcUnixBsdNetbsdlikeUname(buf.rawAddress.toCPointer<ByteVar>())

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    libcUnixBsdNetbsdlikeShmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    MutPtr(libcUnixBsdNetbsdlikeShmat(shmid, shmaddr.rawAddress.toCPointer<ByteVar>(), shmflg)?.toLong() ?: 0L)

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    libcUnixBsdNetbsdlikeShmdt(shmaddr.rawAddress.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    libcUnixBsdNetbsdlikeShmctl(shmid, cmd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    libcUnixBsdNetbsdlikeExecvpe(file.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    libcUnixBsdNetbsdlikeWaitid(idtype, id, infop.rawAddress.toCPointer<ByteVar>(), options)

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    libcUnixBsdNetbsdlikePosixSpawn(pid.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    libcUnixBsdNetbsdlikePosixSpawnp(pid.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    libcUnixBsdNetbsdlikePosixSpawnattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    libcUnixBsdNetbsdlikePosixSpawnattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    libcUnixBsdNetbsdlikePosixSpawnattrGetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    libcUnixBsdNetbsdlikePosixSpawnattrSetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    libcUnixBsdNetbsdlikePosixSpawnattrGetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    libcUnixBsdNetbsdlikePosixSpawnattrSetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    libcUnixBsdNetbsdlikePosixSpawnattrGetflags(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    libcUnixBsdNetbsdlikePosixSpawnattrSetflags(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    libcUnixBsdNetbsdlikePosixSpawnattrGetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    libcUnixBsdNetbsdlikePosixSpawnattrSetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    libcUnixBsdNetbsdlikePosixSpawnattrGetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    libcUnixBsdNetbsdlikePosixSpawnattrSetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    libcUnixBsdNetbsdlikePosixSpawnattrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    libcUnixBsdNetbsdlikePosixSpawnattrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    libcUnixBsdNetbsdlikePosixSpawnFileActionsInit(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    libcUnixBsdNetbsdlikePosixSpawnFileActionsDestroy(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    libcUnixBsdNetbsdlikePosixSpawnFileActionsAddopen(actions.rawAddress.toCPointer<ByteVar>(), fd, path.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    libcUnixBsdNetbsdlikePosixSpawnFileActionsAddclose(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    libcUnixBsdNetbsdlikePosixSpawnFileActionsAdddup2(actions.rawAddress.toCPointer<ByteVar>(), fd, newfd)

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixBsdNetbsdlikeReallocarray(ptr.rawAddress.toCPointer<ByteVar>(), nmemb, size)?.toLong() ?: 0L)

public actual fun gethostid(): CLong =
    libcUnixBsdNetbsdlikeGethostid()

public actual fun sethostid(hostid: CLong): CInt =
    libcUnixBsdNetbsdlikeSethostid(hostid)

public actual fun ftok(path: ConstPtr<CChar>, id: CInt): KeyT =
    libcUnixBsdNetbsdlikeFtok(path.rawAddress.toCPointer<ByteVar>(), id)

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixBsdNetbsdlikeDirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixBsdNetbsdlikeBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    libcUnixBsdNetbsdlikeGetentropy(buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun sendmmsg(sockfd: CInt, mmsg: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeSendmmsg(sockfd, mmsg.rawAddress.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, mmsg: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    libcUnixBsdNetbsdlikeRecvmmsg(sockfd, mmsg.rawAddress.toCPointer<ByteVar>(), vlen, flags, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun closefrom(lowfd: CInt): CInt =
    libcUnixBsdNetbsdlikeClosefrom(lowfd)
