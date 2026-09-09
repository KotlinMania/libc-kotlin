// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_getentropy
import kotlinx.cinterop.toKString

public actual fun setgrent() {
    libc.cinterop.libc_setgrent()
}

public actual fun semDestroy(sem: SemT): CInt =
    libc.cinterop.libc_sem_destroy(sem?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun semInit(sem: SemT, pshared: CInt, value: CUInt): CInt =
    libc.cinterop.libc_sem_init(sem?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), pshared, value)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libc.cinterop.libc_daemon(nochdir, noclose)
public actual fun accept4(s: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt =
    throw UnsupportedOperationException("accept4 requires manual FFI bridge — not yet implemented")

public actual fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): CInt =
    throw UnsupportedOperationException("mincore requires manual FFI bridge — type mismatch")
public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    libc.cinterop.libc_clock_getres(clkId, tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    libc.cinterop.libc_clock_gettime(clkId, tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    libc.cinterop.libc_clock_settime(clkId, tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun errno(): CInt? =
    throw UnsupportedOperationException("errno requires manual FFI bridge — not yet implemented")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    libc.cinterop.libc_shm_open(name, oflag, mode.toInt())

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires manual FFI bridge — not yet implemented")

public actual fun mkostemp(template: String?, flags: CInt): CInt =
    libc.cinterop.libc_mkostemp(template, flags)
public actual fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt =
    libc.cinterop.libc_mkostemps(template, suffixlen, flags)
public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    libc.cinterop.libc_pwritev(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    libc.cinterop.libc_preadv(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt, offset)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    libc.cinterop.libc_futimens(fd, times?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    libc.cinterop.libc_utimensat(dirfd, path, times?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), flag)

public actual fun fdatasync(fd: CInt): CInt =
    libc.cinterop.libc_fdatasync(fd)
public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty requires manual FFI bridge — not yet implemented")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libc.cinterop.libc_getpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libc.cinterop.libc_setpriority(which, who.toInt(), prio)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    libc.cinterop.libc_mknodat(dirfd, pathname, mode.toInt(), dev.toULong())

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    libc.cinterop.libc_mkfifoat_int(dirfd, pathname, mode.toInt())
public actual fun semTimedwait(sem: SemT, abstime: Timespec?): CInt =
    libc.cinterop.libc_sem_timedwait(sem.value.toCPointer<kotlinx.cinterop.ByteVar>(), abstime?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun semGetvalue(sem: SemT, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun sethostname(name: String?, len: ULong): CInt =
    libc.cinterop.libc_sethostname(name, len)
public actual fun pthreadMutexTimedlock(lock: PthreadMutexT, abstime: Timespec?): CInt =
    libc.cinterop.libc_pthread_mutex_timedlock(lock.value.toCPointer<kotlinx.cinterop.ByteVar>(), abstime?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    libc.cinterop.libc_pthread_spin_init(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_destroy(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_lock(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_trylock(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_unlock(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 requires manual FFI bridge — not yet implemented")

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, ts: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("ppoll requires manual FFI bridge — not yet implemented")

public actual fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist requires GidT? pointer bridge — not yet implemented"), groups?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), ngroups?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    libc.cinterop.libc_initgroups(name, basegid.toInt())
public actual fun getdomainname(name: String?, len: ULong): CInt =
    libc.cinterop.libc_getdomainname(name, len)
public actual fun setdomainname(name: String?, len: ULong): CInt =
    libc.cinterop.libc_setdomainname(name, len)
public actual fun uname(buf: Utsname?): CInt =
    libc.cinterop.libc_uname(buf?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget requires manual FFI bridge — not yet implemented")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires manual FFI bridge — not yet implemented")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    libc.cinterop.libc_shmdt(shmaddr?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl requires manual FFI bridge — not yet implemented")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe requires manual FFI bridge — not yet implemented")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid requires manual FFI bridge — not yet implemented")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT, flags: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT, flags: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT, flags: CInt?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT, flags: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires manual FFI bridge — not yet implemented")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires manual FFI bridge — not yet implemented")

public actual fun gethostid(): CLong =
    libc.cinterop.libc_gethostid()
public actual fun sethostid(hostid: CLong): CInt =
    throw UnsupportedOperationException("sethostid requires manual FFI bridge — not yet implemented")

public actual fun dirname(path: String?): String? =
    libc.cinterop.libc_dirname(path)?.toKString()

public actual fun basename(path: String?): String? =
    libc.cinterop.libc_basename(path)?.toKString()

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt {
    val cPtr: CPointer<ByteVar>? = buf?.value?.toCPointer()
    return libc.cinterop.libc_getentropy(cPtr, buflen)
}

public actual fun sendmmsg(sockfd: CInt, mmsg: Mmsghdr?, vlen: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("sendmmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmmsg(sockfd: CInt, mmsg: Mmsghdr?, vlen: CUInt, flags: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("recvmmsg requires manual FFI bridge — not yet implemented")

public actual fun closefrom(lowfd: CInt): CInt =
    throw UnsupportedOperationException("closefrom requires manual FFI bridge — not yet implemented")
