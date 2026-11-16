@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_setgrent()
}

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_sem_destroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_sem_init(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_daemon(nochdir, noclose)

public actual fun accept4(s: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_accept4(s, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>(), flags)

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_mincore(addr?.value?.toCPointer<ByteVar>(), len, vec?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_clock_getres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_clock_gettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_clock_settime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun errno(): CInt? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_errno()?.let { COpaquePointer(it.toLong()) }

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_shm_open(name, oflag, mode)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_fdatasync(fd)

public actual fun loginTty(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_login_tty(fd)

public actual fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_getpriority(which, who)

public actual fun setpriority(which: CInt, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_setpriority(which, who, prio)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_mknodat(dirfd, pathname, mode, dev.toInt())

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_mkfifoat(dirfd, pathname, mode)

public actual fun semTimedwait(sem: COpaquePointer?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_sem_timedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: COpaquePointer?, sval: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_sem_getvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_pthread_condattr_setclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_sethostname(name, len)

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_pthread_mutex_timedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_pthread_spin_init(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_pthread_spin_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_pthread_spin_lock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_pthread_spin_trylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_pthread_spin_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_pthread_setschedparam(native.toInt(), policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_pthread_getschedparam(native.toInt(), policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, ts: Timespec?, sigmask: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_ppoll(fds?.value?.toCPointer<ByteVar>(), nfds.toInt(), ts?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_getgrouplist(name, basegid, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_initgroups(name, basegid)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_setdomainname(name, len)

public actual fun uname(buf: Utsname?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun shmget(key: io.github.kotlinmania.libc.KeyT, size: SizeT, shmflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_shmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_execvpe(file, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: io.github.kotlinmania.libc.IdT, infop: SiginfoT?, options: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_waitid(idtype.toInt(), id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawnattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawnattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawnattr_getsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawnattr_setsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawnattr_getsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawnattr_setsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawnattr_getflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawnattr_setflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawnattr_getpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawnattr_setpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawnattr_getschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawnattr_setschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawnattr_getschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawnattr_setschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawn_file_actions_init(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawn_file_actions_destroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawn_file_actions_addopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawn_file_actions_addclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_posix_spawn_file_actions_adddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_reallocarray(ptr?.value?.toCPointer<ByteVar>(), nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun gethostid(): CLong =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_gethostid()

public actual fun sethostid(hostid: CLong): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_sethostid(hostid)

public actual fun ftok(path: String?, id: CInt): io.github.kotlinmania.libc.KeyT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_ftok(path, id)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun sendmmsg(sockfd: CInt, mmsg: io.github.kotlinmania.libc.Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_sendmmsg(sockfd, mmsg?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, mmsg: io.github.kotlinmania.libc.Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_recvmmsg(sockfd, mmsg?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun closefrom(lowfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_netbsdlike_mod_closefrom(lowfd)
