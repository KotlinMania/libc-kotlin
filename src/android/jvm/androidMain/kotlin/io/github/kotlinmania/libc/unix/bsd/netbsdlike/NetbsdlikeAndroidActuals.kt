@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.IdtypeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.DevT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixBsdNetbsdlikeJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSetgrent()

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeDaemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeAccept4(s: Int, addr: Long, addrlen: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeMincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeClockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeClockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeClockSettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeErrno(): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeShmOpen(name: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeMemrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeMkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeMkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePreadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeUtimensat(dirfd: Int, path: Long, times: Long, flag: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeFdatasync(fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeLoginTty(fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSetpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeMknodat(dirfd: Int, pathname: Long, mode: Int, dev: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeMkfifoat(dirfd: Int, pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSemTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSemGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSethostname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePpoll(fds: Long, nfds: Int, ts: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeGetgrouplist(name: Long, basegid: Short, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeInitgroups(name: Long, basegid: Short): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeGetdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSetdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeUname(buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeShmget(key: Long, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeShmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeShmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeShmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeExecvpe(file: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeWaitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawn(pid: Long, path: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnp(pid: Long, file: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnFileActionsAddopen(actions: Long, fd: Int, path: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikePosixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeReallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeGethostid(): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSethostid(hostid: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeFtok(path: Long, id: Int): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeDirname(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeBasename(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeGetentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeSendmmsg(sockfd: Int, mmsg: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeRecvmmsg(sockfd: Int, mmsg: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdNetbsdlikeClosefrom(lowfd: Int): Int
}

public actual fun setgrent() {
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSetgrent()
}

public actual fun semDestroy(sem: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSemDestroy(sem.rawAddress)

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeDaemon(nochdir, noclose)

public actual fun accept4(s: CInt, addr: MutPtr, addrlen: MutPtr, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeAccept4(s, addr.rawAddress, addrlen.rawAddress, flags)

public actual fun mincore(addr: MutPtr, len: SizeT, vec: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeMincore(addr.rawAddress, len.toLong(), vec.rawAddress)

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeClockGetres(clkId, tp.rawAddress)

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeClockGettime(clkId, tp.rawAddress)

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeClockSettime(clkId, tp.rawAddress)

public actual fun errno(): MutPtr =
    MutPtr(UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeErrno())

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeShmOpen(name.rawAddress, oflag, mode.toInt())

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeMemrchr(cx.rawAddress, c, n.toLong()))

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeMkostemp(template.rawAddress, flags)

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeMkostemps(template.rawAddress, suffixlen, flags)

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePwritev(fd, iov.rawAddress, iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePreadv(fd, iov.rawAddress, iovcnt, offset)

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeFutimens(fd, times.rawAddress)

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeUtimensat(dirfd, path.rawAddress, times.rawAddress, flag)

public actual fun fdatasync(fd: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeFdatasync(fd)

public actual fun loginTty(fd: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeLoginTty(fd)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeGetpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSetpriority(which, who.toInt(), prio)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeMknodat(dirfd, pathname.rawAddress, mode.toInt(), dev)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeMkfifoat(dirfd, pathname.rawAddress, mode.toInt())

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSemTimedwait(sem.rawAddress, abstime.rawAddress)

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSemGetvalue(sem.rawAddress, sval.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadCondattrSetclock(attr.rawAddress, clockId)

public actual fun sethostname(name: ConstPtr, len: SizeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSethostname(name.rawAddress, len.toLong())

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadMutexTimedlock(lock.rawAddress, abstime.rawAddress)

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadSpinInit(lock.rawAddress, pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadSpinDestroy(lock.rawAddress)

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadSpinLock(lock.rawAddress)

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadSpinTrylock(lock.rawAddress)

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadSpinUnlock(lock.rawAddress)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadSetschedparam(native.toLong(), policy, param.rawAddress)

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePthreadGetschedparam(native.toLong(), policy.rawAddress, param.rawAddress)

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePipe2(fds.rawAddress, flags)

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, ts: ConstPtr, sigmask: ConstPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePpoll(fds.rawAddress, nfds.toInt(), ts.rawAddress, sigmask.rawAddress)

public actual fun getgrouplist(name: ConstPtr, basegid: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeGetgrouplist(name.rawAddress, basegid.toShort(), groups.rawAddress, ngroups.rawAddress)

public actual fun initgroups(name: ConstPtr, basegid: GidT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeInitgroups(name.rawAddress, basegid.toShort())

public actual fun getdomainname(name: MutPtr, len: SizeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeGetdomainname(name.rawAddress, len.toLong())

public actual fun setdomainname(name: ConstPtr, len: SizeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSetdomainname(name.rawAddress, len.toLong())

public actual fun uname(buf: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeUname(buf.rawAddress)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeShmget(key, size.toLong(), shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr =
    MutPtr(UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeShmat(shmid, shmaddr.rawAddress, shmflg))

public actual fun shmdt(shmaddr: ConstPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeShmdt(shmaddr.rawAddress)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeShmctl(shmid, cmd, buf.rawAddress)

public actual fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeExecvpe(file.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeWaitid(idtype, id.toInt(), infop.rawAddress, options)

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawn(pid.rawAddress, path.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnp(pid.rawAddress, file.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrInit(attr.rawAddress)

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrDestroy(attr.rawAddress)

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrGetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrSetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrGetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrSetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrGetflags(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrSetflags(attr.rawAddress, flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrGetpgroup(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrSetpgroup(attr.rawAddress, flags)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrGetschedpolicy(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrSetschedpolicy(attr.rawAddress, flags)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnattrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnFileActionsInit(actions.rawAddress)

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnFileActionsDestroy(actions.rawAddress)

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnFileActionsAddopen(actions.rawAddress, fd, path.rawAddress, oflag, mode.toInt())

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnFileActionsAddclose(actions.rawAddress, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikePosixSpawnFileActionsAdddup2(actions.rawAddress, fd, newfd)

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    MutPtr(UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeReallocarray(ptr.rawAddress, nmemb.toLong(), size.toLong()))

public actual fun gethostid(): CLong =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeGethostid()

public actual fun sethostid(hostid: CLong): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSethostid(hostid)

public actual fun ftok(path: ConstPtr, id: CInt): KeyT =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeFtok(path.rawAddress, id)

public actual fun dirname(path: MutPtr): MutPtr =
    MutPtr(UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeDirname(path.rawAddress))

public actual fun basename(path: MutPtr): MutPtr =
    MutPtr(UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeBasename(path.rawAddress))

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeGetentropy(buf.rawAddress, buflen.toLong())

public actual fun sendmmsg(sockfd: CInt, mmsg: MutPtr, vlen: CUint, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeSendmmsg(sockfd, mmsg.rawAddress, vlen.toInt(), flags)

public actual fun recvmmsg(sockfd: CInt, mmsg: MutPtr, vlen: CUint, flags: CInt, timeout: MutPtr): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeRecvmmsg(sockfd, mmsg.rawAddress, vlen.toInt(), flags, timeout.rawAddress)

public actual fun closefrom(lowfd: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libcUnixBsdNetbsdlikeClosefrom(lowfd)
