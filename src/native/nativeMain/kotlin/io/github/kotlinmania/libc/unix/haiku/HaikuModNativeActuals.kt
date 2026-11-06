@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getpriority(which: CInt, who: IdT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_setpriority(which, who, priority)

public actual fun endusershell() {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_endusershell()
}

public actual fun getpass(prompt: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getpass(prompt)?.let { COpaquePointer(it.toLong()) }

public actual fun getusershell(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getusershell()?.let { COpaquePointer(it.toLong()) }

public actual fun issetugid(): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_issetugid()

public actual fun setusershell() {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_setusershell()
}

public actual fun utimensat(fd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_utimensat(fd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_strerror_r(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun errnop(): CInt? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_errnop()?.let { COpaquePointer(it.toLong()) }

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_abs(i)

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_labs(i)

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_rand()

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_srand(seed)
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getifaddrs(ifap?.value?.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_freeifaddrs(ifa?.value?.toCPointer<ByteVar>())
}

public actual fun ppoll(fds: Pollfd?, numfds: io.github.kotlinmania.libc.NfdsT, timeout: Timespec?, sigMask: ULong?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_ppoll(fds?.value?.toCPointer<ByteVar>(), numfds, timeout?.value?.toCPointer<ByteVar>(), sigMask?.value?.toCPointer<ByteVar>())

public actual fun getspent(): Spwd? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getspent()?.let { COpaquePointer(it.toLong()) }

public actual fun getspentR(pwd: Spwd?, buf: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getspent_r(pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), bufferSize, res?.value?.toCPointer<ByteVar>())

public actual fun setspent() {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_setspent()
}

public actual fun endspent() {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_endspent()
}

public actual fun getspnam(name: String?): Spwd? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getspnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getspnamR(name: String?, spwd: Spwd?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getspnam_r(name, spwd?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferSize, res?.value?.toCPointer<ByteVar>())

public actual fun sgetspent(line: String?): Spwd? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_sgetspent(line)?.let { COpaquePointer(it.toLong()) }

public actual fun sgetspentR(line: String?, spwd: Spwd?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_sgetspent_r(line, spwd?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferSize, res?.value?.toCPointer<ByteVar>())

public actual fun fgetspent(file: FILE?): Spwd? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_fgetspent(file?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fgetspentR(file: FILE?, spwd: Spwd?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_fgetspent_r(file?.handle?.toCPointer<ByteVar>(), spwd?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferSize, res?.value?.toCPointer<ByteVar>())

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_mknodat(dirfd, pathname, mode, dev)

public actual fun semDestroy(sem: SemT?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_sem_destroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_sem_init(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_clock_getres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_clock_gettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_clock_settime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: Int?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_clock_getcpuclockid(pid, clkId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCreate(thread: UintptrT?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_create(thread?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), f.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_attr_getguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_attr_setguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_attr_getstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: UintptrT?, clockId: Int?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_condattr_getclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: UintptrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_condattr_setclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun valloc(numBytes: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_valloc(numBytes)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_malloc_usable_size(ptr?.value?.toCPointer<ByteVar>())

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_initgroups(name, basegid)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_mutex_timedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadSigqueue(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt, value: Sigval): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_sigqueue(thread, sig, value.toInt())

public actual fun pthreadSpinInit(lock: io.github.kotlinmania.libc.PthreadSpinlockT?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_spin_init(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_spin_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_spin_lock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_spin_trylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_spin_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_glob(pattern, flags, errfunc?.value?.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_fadvise(fd, offset, len, advice)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_fallocate(fd, offset, len)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_shm_open(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_shm_unlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_nl_langinfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun accept4(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLength: UInt?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_accept4(socket, address?.value?.toCPointer<ByteVar>(), addressLength?.value?.toCPointer<ByteVar>(), flags)

public actual fun writev(fd: CInt, iov: Iovec?, count: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_writev(fd, iov?.value?.toCPointer<ByteVar>(), count)

public actual fun readv(fd: CInt, iov: Iovec?, count: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_readv(fd, iov?.value?.toCPointer<ByteVar>(), count)

public actual fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_sendmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_recvmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_execvpe(file, argv?.value?.toCPointer<ByteVar>(), environment?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getgrgid_r(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrouplist(user: String?, basegroup: GidT, grouplist: GidT?, groupcount: CInt?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getgrouplist(user, basegroup, grouplist?.value?.toCPointer<ByteVar>(), groupcount?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: ULong?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: SemT?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_sem_close(sem?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getdtablesize()

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getgrnam_r(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: ULong?, oldset: ULong?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_sigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun getgrnam(name: String?): Group? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_kill(thread, sig)

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_sem_unlink(name)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getpwnam_r(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getpwuid_r(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwent(): Passwd? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setpwent() {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_setpwent()
}

public actual fun endpwent() {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_endpwent()
}

public actual fun endgrent() {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_endgrent()
}

public actual fun getgrent(): Group? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_setgrent()
}

public actual fun sigwait(set: ULong?, sig: CInt?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_atfork(prepare?.value?.toCPointer<ByteVar>(), parent?.value?.toCPointer<ByteVar>(), child?.value?.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): Group? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun sethostname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_sethostname(name, len)

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun getutxent(): Utmpx? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutxent() {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_setutxent()
}

public actual fun endutxent() {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_endutxent()
}

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_faccessat(dirfd, pathname, mode, flags)

public actual fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: ULong?, info: SiginfoT?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getitimer(which, currValue?.value?.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_setitimer(which, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_regcomp(preg?.value?.toCPointer<ByteVar>(), pattern, cflags)

public actual fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_regexec(preg?.value?.toCPointer<ByteVar>(), input, nmatch, pmatch?.value?.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_regerror(errcode, preg?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: RegexT?) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_regfree(preg?.value?.toCPointer<ByteVar>())
}

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_msgctl(msqid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun msgget(key: io.github.kotlinmania.libc.KeyT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtype, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_msgsnd(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun semget(key: io.github.kotlinmania.libc.KeyT, nsems: CInt, semflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_semget(key, nsems, semflg)

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_semop(semid, sops?.value?.toCPointer<ByteVar>(), nsops)

public actual fun ftok(pathname: String?, projId: CInt): io.github.kotlinmania.libc.KeyT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_ftok(pathname, projId)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_lsearch(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nelp?.value?.toCPointer<ByteVar>(), width, compar?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_lfind(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nelp?.value?.toCPointer<ByteVar>(), width, compar?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hcreate(nelt: SizeT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_hcreate(nelt)

public actual fun hdestroy() {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_hdestroy()
}

public actual fun hsearch(entry: io.github.kotlinmania.libc.Entry, action: io.github.kotlinmania.libc.Action): Entry? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_hsearch(entry.toInt(), action)?.let { COpaquePointer(it.toLong()) }

public actual fun drand48(): CDouble =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_drand48()

public actual fun erand48(xseed: CUshort?): CDouble =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_erand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_lrand48()

public actual fun nrand48(xseed: CUshort?): CLong =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_nrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_mrand48()

public actual fun jrand48(xseed: CUshort?): CLong =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_jrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun srand48(seed: CLong) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_srand48(seed)
}

public actual fun seed48(xseed: CUshort?): CUshort? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_seed48(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lcong48(p: CUshort?) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_lcong48(p?.value?.toCPointer<ByteVar>())
}

public actual fun clearenv(): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_clearenv()

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_ctermid(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun sync() {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_sync()
}

public actual fun getpagesize(): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getpagesize()

public actual fun brk(addr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_brk(addr?.value?.toCPointer<ByteVar>())

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawn_file_actions_init(fileActions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawn_file_actions_destroy(fileActions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawn_file_actions_addopen(fileActions?.value?.toCPointer<ByteVar>(), fildes, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawn_file_actions_addclose(fileActions?.value?.toCPointer<ByteVar>(), fildes)

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawn_file_actions_adddup2(fileActions?.value?.toCPointer<ByteVar>(), fildes, newfildes)

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawnattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawnattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawnattr_getflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawnattr_setflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: PidT?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawnattr_getpgroup(attr?.value?.toCPointer<ByteVar>(), pgroup?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawnattr_setpgroup(attr?.value?.toCPointer<ByteVar>(), pgroup)

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: ULong?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawnattr_getsigdefault(attr?.value?.toCPointer<ByteVar>(), sigdefault?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: ULong?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawnattr_setsigdefault(attr?.value?.toCPointer<ByteVar>(), sigdefault?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: ULong?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawnattr_getsigmask(attr?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: ULong?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_posix_spawnattr_setsigmask(attr?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getopt_long(argc, argv?.value?.toCPointer<ByteVar>(), optstring, longopts?.value?.toCPointer<ByteVar>(), longindex?.value?.toCPointer<ByteVar>())

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_strcasecmp_l(string1, string2, locale.toInt())

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_strncasecmp_l(string1, string2, length, locale.toInt())

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun memmem(source: COpaquePointer?, sourceLength: SizeT, search: COpaquePointer?, searchLength: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_memmem(source?.value?.toCPointer<ByteVar>(), sourceLength, search?.value?.toCPointer<ByteVar>(), searchLength)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadGetattrNp(thread: io.github.kotlinmania.libc.PthreadT, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_getattr_np(thread, attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: io.github.kotlinmania.libc.PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_getname_np(thread, buffer?.value?.toCPointer<ByteVar>(), length)

public actual fun pthreadSetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: String?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_haiku_mod_pthread_setname_np(thread, name)
