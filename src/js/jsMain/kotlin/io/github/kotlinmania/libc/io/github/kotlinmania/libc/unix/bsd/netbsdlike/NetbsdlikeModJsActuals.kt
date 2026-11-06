package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.COpaquePointer

public actual fun setgrent() {
    js("require('@kotlinmania/libc-native-bindings').setgrent()")
}

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semDestroy(sem?.value ?: 0L)") as CInt

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').semInit(sem?.value ?: 0L, pshared, value)") as CInt

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').daemon(nochdir, noclose)") as CInt

public actual fun accept4(s: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').accept4(s, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L, flags)") as CInt

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mincore(addr?.value ?: 0L, len, vec?.value ?: 0L)") as CInt

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetres(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockSettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun errno(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').errno()") as CInt?

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmOpen(name, oflag, mode)") as CInt

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memrchr(cx?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemp(template?.value ?: 0L, flags)") as CInt

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemps(template?.value ?: 0L, suffixlen, flags)") as CInt

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimens(fd, times?.toLong() ?: 0L)") as CInt

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').utimensat(dirfd, path, times?.toLong() ?: 0L, flag)") as CInt

public actual fun fdatasync(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fdatasync(fd)") as CInt

public actual fun loginTty(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').loginTty(fd)") as CInt

public actual fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpriority(which, who)") as CInt

public actual fun setpriority(which: CInt, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setpriority(which, who, prio)") as CInt

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mknodat(dirfd, pathname, mode, dev)") as CInt

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkfifoat(dirfd, pathname, mode)") as CInt

public actual fun semTimedwait(sem: COpaquePointer?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semTimedwait(sem?.value ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun semGetvalue(sem: COpaquePointer?, sval: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semGetvalue(sem?.value ?: 0L, sval?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)") as CInt

public actual fun sethostname(name: String?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostname(name, len)") as CInt

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexTimedlock(lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinInit(lock?.toLong() ?: 0L, pshared)") as CInt

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinDestroy(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinLock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinTrylock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinUnlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pipe2(fds?.toLong() ?: 0L, flags)") as CInt

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, ts: Timespec?, sigmask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ppoll(fds?.toLong() ?: 0L, nfds, ts?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)") as CInt

public actual fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrouplist(name, basegid, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)") as CInt

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').initgroups(name, basegid)") as CInt

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdomainname(name?.value ?: 0L, len)") as CInt

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setdomainname(name, len)") as CInt

public actual fun uname(buf: Utsname?): CInt =
    js("require('@kotlinmania/libc-native-bindings').uname(buf?.toLong() ?: 0L)") as CInt

public actual fun shmget(key: io.github.kotlinmania.libc.KeyT, size: SizeT, shmflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmget(key, size, shmflg)") as CInt

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').shmat(shmid, shmaddr?.value ?: 0L, shmflg)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmdt(shmaddr?.value ?: 0L)") as CInt

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmctl(shmid, cmd, buf?.toLong() ?: 0L)") as CInt

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execvpe(file, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun waitid(idtype: IdtypeT, id: io.github.kotlinmania.libc.IdT, infop: SiginfoT?, options: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').waitid(idtype, id, infop?.toLong() ?: 0L, options)") as CInt

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.toLong() ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.toLong() ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetflags(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetflags(attr?.toLong() ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetpgroup(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetpgroup(attr?.toLong() ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetschedpolicy(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetschedpolicy(attr?.toLong() ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsInit(actions?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsDestroy(actions?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddopen(actions?.toLong() ?: 0L, fd, path, oflag, mode)") as CInt

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddclose(actions?.toLong() ?: 0L, fd)") as CInt

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAdddup2(actions?.toLong() ?: 0L, fd, newfd)") as CInt

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').reallocarray(ptr?.value ?: 0L, nmemb, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gethostid(): CLong =
    js("require('@kotlinmania/libc-native-bindings').gethostid()") as CLong

public actual fun sethostid(hostid: CLong): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostid(hostid)") as CInt

public actual fun ftok(path: String?, id: CInt): io.github.kotlinmania.libc.KeyT =
    js("require('@kotlinmania/libc-native-bindings').ftok(path, id)") as io.github.kotlinmania.libc.KeyT

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dirname(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').basename(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getentropy(buf?.value ?: 0L, buflen)") as CInt

public actual fun sendmmsg(sockfd: CInt, mmsg: io.github.kotlinmania.libc.Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sendmmsg(sockfd, mmsg?.toLong() ?: 0L, vlen, flags)") as CInt

public actual fun recvmmsg(sockfd: CInt, mmsg: io.github.kotlinmania.libc.Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').recvmmsg(sockfd, mmsg?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)") as CInt

public actual fun closefrom(lowfd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').closefrom(lowfd)") as CInt
