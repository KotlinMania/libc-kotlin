package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.COpaquePointer

internal object NetbsdlikeModRawLibc {
    external fun setgrent()
    external fun semDestroy(sem: Long): Int
    external fun semInit(sem: Long, pshared: Int, value: Int): Int
    external fun daemon(nochdir: Int, noclose: Int): Int
    external fun accept4(s: Int, addr: Long, addrlen: Long, flags: Int): Int
    external fun mincore(addr: Long, len: Long, vec: Long): Int
    external fun clockGetres(clkId: Long, tp: Long): Int
    external fun clockGettime(clkId: Long, tp: Long): Int
    external fun clockSettime(clkId: Long, tp: Long): Int
    external fun errno(): Long?
    external fun shmOpen(name: String?, oflag: Int, mode: Int): Int
    external fun memrchr(cx: Long, c: Int, n: Long): Long?
    external fun mkostemp(template: Long, flags: Int): Int
    external fun mkostemps(template: Long, suffixlen: Int, flags: Int): Int
    external fun pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun futimens(fd: Int, times: Long): Int
    external fun utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int
    external fun fdatasync(fd: Int): Int
    external fun loginTty(fd: Int): Int
    external fun getpriority(which: Int, who: Long): Int
    external fun setpriority(which: Int, who: Long, prio: Int): Int
    external fun mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Long): Int
    external fun mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int
    external fun semTimedwait(sem: Long, abstime: Long): Int
    external fun semGetvalue(sem: Long, sval: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Long): Int
    external fun sethostname(name: String?, len: Long): Int
    external fun pthreadMutexTimedlock(lock: Long, abstime: Long): Int
    external fun pthreadSpinInit(lock: Long, pshared: Int): Int
    external fun pthreadSpinDestroy(lock: Long): Int
    external fun pthreadSpinLock(lock: Long): Int
    external fun pthreadSpinTrylock(lock: Long): Int
    external fun pthreadSpinUnlock(lock: Long): Int
    external fun pthreadSetschedparam(native: Long, policy: Int, param: Long): Int
    external fun pthreadGetschedparam(native: Long, policy: Long, param: Long): Int
    external fun pipe2(fds: Long, flags: Int): Int
    external fun ppoll(fds: Long, nfds: Long, ts: Long, sigmask: Long): Int
    external fun getgrouplist(name: String?, basegid: Int, groups: Long, ngroups: Long): Int
    external fun initgroups(name: String?, basegid: Int): Int
    external fun getdomainname(name: Long, len: Long): Int
    external fun setdomainname(name: String?, len: Long): Int
    external fun uname(buf: Long): Int
    external fun shmget(key: Long, size: Long, shmflg: Int): Int
    external fun shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long?
    external fun shmdt(shmaddr: Long): Int
    external fun shmctl(shmid: Int, cmd: Int, buf: Long): Int
    external fun execvpe(file: String?, argv: Long, envp: Long): Int
    external fun waitid(idtype: Long, id: Long, infop: Long, options: Int): Int
    external fun posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun posixSpawnattrInit(attr: Long): Int
    external fun posixSpawnattrDestroy(attr: Long): Int
    external fun posixSpawnattrGetsigdefault(attr: Long, default: Long): Int
    external fun posixSpawnattrSetsigdefault(attr: Long, default: Long): Int
    external fun posixSpawnattrGetsigmask(attr: Long, default: Long): Int
    external fun posixSpawnattrSetsigmask(attr: Long, default: Long): Int
    external fun posixSpawnattrGetflags(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetflags(attr: Long, flags: Short): Int
    external fun posixSpawnattrGetpgroup(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetpgroup(attr: Long, flags: Int): Int
    external fun posixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int
    external fun posixSpawnattrGetschedparam(attr: Long, param: Long): Int
    external fun posixSpawnattrSetschedparam(attr: Long, param: Long): Int
    external fun posixSpawnFileActionsInit(actions: Long): Int
    external fun posixSpawnFileActionsDestroy(actions: Long): Int
    external fun posixSpawnFileActionsAddopen(actions: Long, fd: Int, path: String?, oflag: Int, mode: Int): Int
    external fun posixSpawnFileActionsAddclose(actions: Long, fd: Int): Int
    external fun posixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int
    external fun reallocarray(ptr: Long, nmemb: Long, size: Long): Long?
    external fun gethostid(): Long
    external fun sethostid(hostid: Long): Int
    external fun ftok(path: String?, id: Int): Long
    external fun dirname(path: Long): Long?
    external fun basename(path: Long): Long?
    external fun getentropy(buf: Long, buflen: Long): Int
    external fun sendmmsg(sockfd: Int, mmsg: Long, vlen: Int, flags: Int): Int
    external fun recvmmsg(sockfd: Int, mmsg: Long, vlen: Int, flags: Int, timeout: Long): Int
    external fun closefrom(lowfd: Int): Int
}

public actual fun setgrent() {
    NetbsdlikeModRawLibc.setgrent()
}

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    NetbsdlikeModRawLibc.semDestroy(sem?.value ?: 0L)

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    NetbsdlikeModRawLibc.semInit(sem?.value ?: 0L, pshared, value)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    NetbsdlikeModRawLibc.daemon(nochdir, noclose)

public actual fun accept4(s: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt =
    NetbsdlikeModRawLibc.accept4(s, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L, flags)

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    NetbsdlikeModRawLibc.mincore(addr?.value ?: 0L, len, vec?.value ?: 0L)

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    NetbsdlikeModRawLibc.clockGetres(clkId, tp?.toLong() ?: 0L)

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    NetbsdlikeModRawLibc.clockGettime(clkId, tp?.toLong() ?: 0L)

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    NetbsdlikeModRawLibc.clockSettime(clkId, tp?.toLong() ?: 0L)

public actual fun errno(): CInt? =
    NetbsdlikeModRawLibc.errno()

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    NetbsdlikeModRawLibc.shmOpen(name, oflag, mode)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    NetbsdlikeModRawLibc.memrchr(cx?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    NetbsdlikeModRawLibc.mkostemp(template?.value ?: 0L, flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    NetbsdlikeModRawLibc.mkostemps(template?.value ?: 0L, suffixlen, flags)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    NetbsdlikeModRawLibc.pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    NetbsdlikeModRawLibc.preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    NetbsdlikeModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    NetbsdlikeModRawLibc.utimensat(dirfd, path, times?.toLong() ?: 0L, flag)

public actual fun fdatasync(fd: CInt): CInt =
    NetbsdlikeModRawLibc.fdatasync(fd)

public actual fun loginTty(fd: CInt): CInt =
    NetbsdlikeModRawLibc.loginTty(fd)

public actual fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt =
    NetbsdlikeModRawLibc.getpriority(which, who)

public actual fun setpriority(which: CInt, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt =
    NetbsdlikeModRawLibc.setpriority(which, who, prio)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    NetbsdlikeModRawLibc.mknodat(dirfd, pathname, mode, dev)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    NetbsdlikeModRawLibc.mkfifoat(dirfd, pathname, mode)

public actual fun semTimedwait(sem: COpaquePointer?, abstime: Timespec?): CInt =
    NetbsdlikeModRawLibc.semTimedwait(sem?.value ?: 0L, abstime?.toLong() ?: 0L)

public actual fun semGetvalue(sem: COpaquePointer?, sval: CInt?): CInt =
    NetbsdlikeModRawLibc.semGetvalue(sem?.value ?: 0L, sval?.toLong() ?: 0L)

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    NetbsdlikeModRawLibc.pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    NetbsdlikeModRawLibc.sethostname(name, len)

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    NetbsdlikeModRawLibc.pthreadMutexTimedlock(lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    NetbsdlikeModRawLibc.pthreadSpinInit(lock?.toLong() ?: 0L, pshared)

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    NetbsdlikeModRawLibc.pthreadSpinDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    NetbsdlikeModRawLibc.pthreadSpinLock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    NetbsdlikeModRawLibc.pthreadSpinTrylock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    NetbsdlikeModRawLibc.pthreadSpinUnlock(lock?.toLong() ?: 0L)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    NetbsdlikeModRawLibc.pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    NetbsdlikeModRawLibc.pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    NetbsdlikeModRawLibc.pipe2(fds?.toLong() ?: 0L, flags)

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, ts: Timespec?, sigmask: SigsetT?): CInt =
    NetbsdlikeModRawLibc.ppoll(fds?.toLong() ?: 0L, nfds, ts?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)

public actual fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt =
    NetbsdlikeModRawLibc.getgrouplist(name, basegid, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    NetbsdlikeModRawLibc.initgroups(name, basegid)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    NetbsdlikeModRawLibc.getdomainname(name?.value ?: 0L, len)

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    NetbsdlikeModRawLibc.setdomainname(name, len)

public actual fun uname(buf: Utsname?): CInt =
    NetbsdlikeModRawLibc.uname(buf?.toLong() ?: 0L)

public actual fun shmget(key: io.github.kotlinmania.libc.KeyT, size: SizeT, shmflg: CInt): CInt =
    NetbsdlikeModRawLibc.shmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    NetbsdlikeModRawLibc.shmat(shmid, shmaddr?.value ?: 0L, shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    NetbsdlikeModRawLibc.shmdt(shmaddr?.value ?: 0L)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    NetbsdlikeModRawLibc.shmctl(shmid, cmd, buf?.toLong() ?: 0L)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    NetbsdlikeModRawLibc.execvpe(file, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun waitid(idtype: IdtypeT, id: io.github.kotlinmania.libc.IdT, infop: SiginfoT?, options: CInt): CInt =
    NetbsdlikeModRawLibc.waitid(idtype, id, infop?.toLong() ?: 0L, options)

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    NetbsdlikeModRawLibc.posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.toLong() ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    NetbsdlikeModRawLibc.posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.toLong() ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    NetbsdlikeModRawLibc.posixSpawnattrInit(attr?.toLong() ?: 0L)

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    NetbsdlikeModRawLibc.posixSpawnattrDestroy(attr?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    NetbsdlikeModRawLibc.posixSpawnattrGetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    NetbsdlikeModRawLibc.posixSpawnattrSetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    NetbsdlikeModRawLibc.posixSpawnattrGetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    NetbsdlikeModRawLibc.posixSpawnattrSetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    NetbsdlikeModRawLibc.posixSpawnattrGetflags(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    NetbsdlikeModRawLibc.posixSpawnattrSetflags(attr?.toLong() ?: 0L, flags)

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt =
    NetbsdlikeModRawLibc.posixSpawnattrGetpgroup(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt =
    NetbsdlikeModRawLibc.posixSpawnattrSetpgroup(attr?.toLong() ?: 0L, flags)

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    NetbsdlikeModRawLibc.posixSpawnattrGetschedpolicy(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    NetbsdlikeModRawLibc.posixSpawnattrSetschedpolicy(attr?.toLong() ?: 0L, flags)

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    NetbsdlikeModRawLibc.posixSpawnattrGetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    NetbsdlikeModRawLibc.posixSpawnattrSetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt =
    NetbsdlikeModRawLibc.posixSpawnFileActionsInit(actions?.toLong() ?: 0L)

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt =
    NetbsdlikeModRawLibc.posixSpawnFileActionsDestroy(actions?.toLong() ?: 0L)

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    NetbsdlikeModRawLibc.posixSpawnFileActionsAddopen(actions?.toLong() ?: 0L, fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    NetbsdlikeModRawLibc.posixSpawnFileActionsAddclose(actions?.toLong() ?: 0L, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt =
    NetbsdlikeModRawLibc.posixSpawnFileActionsAdddup2(actions?.toLong() ?: 0L, fd, newfd)

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    NetbsdlikeModRawLibc.reallocarray(ptr?.value ?: 0L, nmemb, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gethostid(): CLong =
    NetbsdlikeModRawLibc.gethostid()

public actual fun sethostid(hostid: CLong): CInt =
    NetbsdlikeModRawLibc.sethostid(hostid)

public actual fun ftok(path: String?, id: CInt): io.github.kotlinmania.libc.KeyT =
    NetbsdlikeModRawLibc.ftok(path, id)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    NetbsdlikeModRawLibc.dirname(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    NetbsdlikeModRawLibc.basename(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    NetbsdlikeModRawLibc.getentropy(buf?.value ?: 0L, buflen)

public actual fun sendmmsg(sockfd: CInt, mmsg: io.github.kotlinmania.libc.Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    NetbsdlikeModRawLibc.sendmmsg(sockfd, mmsg?.toLong() ?: 0L, vlen, flags)

public actual fun recvmmsg(sockfd: CInt, mmsg: io.github.kotlinmania.libc.Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt =
    NetbsdlikeModRawLibc.recvmmsg(sockfd, mmsg?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)

public actual fun closefrom(lowfd: CInt): CInt =
    NetbsdlikeModRawLibc.closefrom(lowfd)
