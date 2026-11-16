@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun sendmmsg(sockfd: CInt, msgvec: io.github.kotlinmania.libc.Mmsghdr?, vlen: CUint, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: io.github.kotlinmania.libc.Mmsghdr?, vlen: CUint, flags: CUint, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun semDestroy(sem: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sem_destroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: SyncT?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sem_init(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_fdatasync(fd)

public actual fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getpriority(which, who)

public actual fun setpriority(which: CInt, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_setpriority(which, who, prio)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(fd: CInt, pathname: String?, mode: ModeT, dev: io.github.kotlinmania.libc.DevT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mknodat(fd, pathname, mode, dev)

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_clock_getres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_clock_gettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_clock_settime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: CInt?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_clock_getcpuclockid(pid, clkId?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_attr_getstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_fadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_nl_langinfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.SyncAttr?, clockId: CInt?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_condattr_getclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.SyncAttr?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_condattr_setclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_condattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMutexattrSetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_mutexattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadRwlockattrGetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, value: CInt?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_rwlockattr_getpshared(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_rwlockattr_setpshared(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_ptsname_r(fd, buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun clearenv(): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_clearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_wait4(pid, status?.value?.toCPointer<ByteVar>(), options, rusage?.value?.toCPointer<ByteVar>())

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_execvpe(file, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getifaddrs(ifap?.value?.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_freeifaddrs(ifa?.value?.toCPointer<ByteVar>())
}

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sendmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_recvmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_login_tty(fd)

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getpeereid(socket, euid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_strerror_r(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_abs(i)

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_labs(i)

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_rand()

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_srand(seed)
}

public actual fun setpwent() {
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_setpwent()
}

public actual fun endpwent() {
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_endpwent()
}

public actual fun getpwent(): Passwd? =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_setgrent()
}

public actual fun endgrent() {
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_endgrent()
}

public actual fun getgrent(): Group? =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun setspent() {
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_setspent()
}

public actual fun endspent() {
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_endspent()
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_shm_open(name, oflag, mode)

public actual fun ftok(pathname: String?, projId: CInt): io.github.kotlinmania.libc.KeyT =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_ftok(pathname, projId)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_fallocate(fd, offset, len)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(native: io.github.kotlinmania.libc.PthreadT, priority: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_setschedprio(native, priority)

public actual fun ifNameindex(): IfNameindex? =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_if_nameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_if_freenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobTGlErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_glob(pattern, flags, errfunc?.value?.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_shm_unlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_setdomainname(name, len)

public actual fun sync() {
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sync()
}

public actual fun pthreadGetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_getschedparam(native, policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun umount(target: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_umount(target, flags)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sched_get_priority_max(policy)

public actual fun settimeofday(tv: Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sched_rr_get_interval(pid, tp?.value?.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: SyncT?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sem_timedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: SyncT?, sval: CInt?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sem_getvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sched_setparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun mount(specialDevice: String?, mountDirectory: String?, flags: CInt, mountType: String?, mountData: COpaquePointer?, mountDatalen: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mount(specialDevice, mountDirectory, flags, mountType, mountData?.value?.toCPointer<ByteVar>(), mountDatalen)

public actual fun schedGetparam(pid: PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sched_getparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexConsistent(mutex: io.github.kotlinmania.libc.SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_mutex_consistent(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: io.github.kotlinmania.libc.SyncT?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_mutex_timedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: SyncT?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_spin_init(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_spin_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_spin_lock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_spin_trylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_spin_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrInit(attr: SyncAttr?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_barrierattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: SyncAttr?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_barrierattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: SyncAttr?, pshared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_barrierattr_getpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: SyncAttr?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_barrierattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadBarrierInit(barrier: io.github.kotlinmania.libc.PthreadBarrierT?, attr: SyncAttr?, count: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_barrier_init(barrier?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierDestroy(barrier: io.github.kotlinmania.libc.PthreadBarrierT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_barrier_destroy(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierWait(barrier: io.github.kotlinmania.libc.PthreadBarrierT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_barrier_wait(barrier?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sched_getscheduler(pid)

public actual fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_clock_nanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_attr_getguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_attr_setguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sethostname(name, len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sched_get_priority_min(policy)

public actual fun pthreadCondattrGetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, pshared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_condattr_getpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_setschedparam(native, policy, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sched_setscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: io.github.kotlinmania.libc.SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getgrgid_r(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sem_close(sem?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getdtablesize()

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getgrnam_r(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun initgroups(user: String?, group: GidT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_initgroups(user, group)

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_sigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun getgrnam(name: String?): Group? =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_cancel(thread)

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_kill(thread, sig)

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sem_unlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getpwnam_r(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getpwuid_r(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: FnCallback?, parent: FnCallback?, child: FnCallback?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_atfork(prepare?.value?.toCPointer<ByteVar>(), parent?.value?.toCPointer<ByteVar>(), child?.value?.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): Group? =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getgrouplist(user, group, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, pshared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_mutexattr_getpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetrobust(attr: io.github.kotlinmania.libc.SyncAttr?, robustness: CInt?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_mutexattr_getrobust(attr?.value?.toCPointer<ByteVar>(), robustness?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetrobust(attr: io.github.kotlinmania.libc.SyncAttr?, robustness: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_mutexattr_setrobust(attr?.value?.toCPointer<ByteVar>(), robustness)

public actual fun pthreadCreate(native: CInt?, attr: io.github.kotlinmania.libc.PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_create(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), f.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getitimer(which, currValue?.value?.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, value: Itimerval?, ovalue: Itimerval?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_setitimer(which, value?.value?.toCPointer<ByteVar>(), ovalue?.value?.toCPointer<ByteVar>())

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: UintptrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: UintptrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: UintptrT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawnattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: UintptrT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawnattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: UintptrT?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawnattr_getsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: UintptrT?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawnattr_setsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: UintptrT?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawnattr_getsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: UintptrT?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawnattr_setsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: UintptrT?, flags: CShort?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawnattr_getflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: UintptrT?, flags: CShort): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawnattr_setflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: UintptrT?, flags: PidT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawnattr_getpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: UintptrT?, flags: PidT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawnattr_setpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: UintptrT?, flags: CInt?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawnattr_getschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: UintptrT?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawnattr_setschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: UintptrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawnattr_getschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: UintptrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawnattr_setschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawn_file_actions_init(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawn_file_actions_destroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawn_file_actions_addopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawn_file_actions_addclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_posix_spawn_file_actions_adddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun popen(command: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_faccessat(dirfd, pathname, mode, flags)

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_inotify_rm_watch(fd, wd)

public actual fun inotifyInit(): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_inotify_init()

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_inotify_add_watch(fd, path, mask)

public actual fun gettid(): PidT =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_gettid()

public actual fun pthreadGetcpuclockid(thread: io.github.kotlinmania.libc.PthreadT, clkId: CInt?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_getcpuclockid(thread, clkId?.value?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun mallopt(param: CInt, value: Long): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mallopt(param, value)

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_ctermid(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mallinfo(): io.github.kotlinmania.libc.Mallinfo =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mallinfo()

public actual fun getpwentR(pwd: io.github.kotlinmania.libc.Passwd?, buf: COpaquePointer?, bufsize: CInt, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getpwent_r(pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), bufsize, result?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: COpaquePointer?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_getname_np(thread, name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadSetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: String?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_pthread_setname_np(thread, name)

public actual fun sysctl(arg0: CInt?, arg1: CUint, arg2: COpaquePointer?, arg3: SizeT?, arg4: COpaquePointer?, arg5: SizeT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_sysctl(arg0?.value?.toCPointer<ByteVar>(), arg1, arg2?.value?.toCPointer<ByteVar>(), arg3?.value?.toCPointer<ByteVar>(), arg4?.value?.toCPointer<ByteVar>(), arg5)

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlp: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_setrlimit(resource, rlp?.value?.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, list: COpaquePointer?, nent: CInt, sig: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_lio_listio(mode, list?.value?.toCPointer<ByteVar>(), nent, sig?.value?.toCPointer<ByteVar>())

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_dl_iterate_phdr(callback?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_memset_s(s?.value?.toCPointer<ByteVar>(), smax, c, n)

public actual fun regcomp(preg: io.github.kotlinmania.libc.RegexT?, pattern: String?, cflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_regcomp(preg?.value?.toCPointer<ByteVar>(), pattern, cflags)

public actual fun regexec(preg: io.github.kotlinmania.libc.RegexT?, str: String?, nmatch: SizeT, pmatch: io.github.kotlinmania.libc.RegmatchT?, eflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_regexec(preg?.value?.toCPointer<ByteVar>(), str, nmatch, pmatch?.value?.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: io.github.kotlinmania.libc.RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_regerror(errcode, preg?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: io.github.kotlinmania.libc.RegexT?) {
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_regfree(preg?.value?.toCPointer<ByteVar>())
}

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_aio_cancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_aio_error(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(operation: CInt, aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_aio_fsync(operation, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_aio_read(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocpb: io.github.kotlinmania.libc.Aiocb?): SsizeT =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_aio_return(aiocpb?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_aio_suspend(list?.value?.toCPointer<ByteVar>(), nent, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocpb: io.github.kotlinmania.libc.Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_aio_write(aiocpb?.value?.toCPointer<ByteVar>())

public actual fun mqClose(mqdes: io.github.kotlinmania.libc.MqdT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mq_close(mqdes)

public actual fun mqGetattr(mqdes: io.github.kotlinmania.libc.MqdT, mqstat: io.github.kotlinmania.libc.MqAttr?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mq_getattr(mqdes, mqstat?.value?.toCPointer<ByteVar>())

public actual fun mqNotify(mqdes: io.github.kotlinmania.libc.MqdT, notification: io.github.kotlinmania.libc.Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mq_notify(mqdes, notification?.value?.toCPointer<ByteVar>())

public actual fun mqReceive(mqdes: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mq_receive(mqdes, msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqdes: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mq_send(mqdes, msgPtr, msgLen, msgPrio)

public actual fun mqSetattr(mqdes: io.github.kotlinmania.libc.MqdT, mqstat: MqAttr?, omqstat: MqAttr?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mq_setattr(mqdes, mqstat?.value?.toCPointer<ByteVar>(), omqstat?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqdes: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mq_timedreceive(mqdes, msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqTimedsend(mqdes: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mq_timedsend(mqdes, msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_mq_unlink(name)

public actual fun getErrnoPtr(): CInt? =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_get_errno_ptr()?.let { COpaquePointer(it.toLong()) }

public actual fun myThreadExit(valuePtr: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_my_thread_exit(valuePtr?.value?.toCPointer<ByteVar>())
}

public actual fun cxaAtexit(cb: FnCallback, arg: COpaquePointer?, dso: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_nto_mod_cxa_atexit(cb.toInt(), arg?.value?.toCPointer<ByteVar>(), dso?.value?.toCPointer<ByteVar>())
