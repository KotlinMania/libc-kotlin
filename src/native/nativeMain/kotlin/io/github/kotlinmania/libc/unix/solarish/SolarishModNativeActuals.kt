@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_strerror_r(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun semDestroy(sem: SemT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sem_destroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sem_init(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_abs(i)

public actual fun acct(filename: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_acct(filename)

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_labs(i)

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_rand()

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_srand(seed)
}

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun getrandom(bbuf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getrandom(bbuf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun settimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_settimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getifaddrs(ifap?.value?.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_freeifaddrs(ifa?.value?.toCPointer<ByteVar>())
}

public actual fun stackGetbounds(sp: io.github.kotlinmania.libc.StackT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_stack_getbounds(sp?.value?.toCPointer<ByteVar>())

public actual fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getgrouplist(name, basegid, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_initgroups(name, basegid)

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun errno(): CInt? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_errno()?.let { COpaquePointer(it.toLong()) }

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_clock_getres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_clock_gettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_clock_nanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_clock_settime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun setpwent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_setpwent()
}

public actual fun endpwent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_endpwent()
}

public actual fun getpwent(): Passwd? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_fdatasync(fd)

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_nl_langinfo_l(item, locale.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun duplocale(base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_duplocale(base.toInt())

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_freelocale(loc.toInt())
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_newlocale(mask, locale, base.toInt())

public actual fun uselocale(loc: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_uselocale(loc.toInt())

public actual fun getprogname(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getprogname()?.let { COpaquePointer(it.toLong()) }

public actual fun setprogname(name: String?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_setprogname(name)
}

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getloadavg(loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun getpriority(which: CInt, who: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getpriority(which, who)

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_setpriority(which, who, prio)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_mknodat(dirfd, pathname, mode, dev)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_mkfifoat(dirfd, pathname, mode)

public actual fun sethostname(name: String?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sethostname(name, len)

public actual fun ifNameindex(): IfNameindex? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_if_nameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_if_freenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun pthreadCreate(native: CUint?, attr: io.github.kotlinmania.libc.PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pthread_create(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), f.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pthread_attr_getstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: CInt?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pthread_condattr_getclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pthread_condattr_setclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sem_timedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sem_getvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pthread_mutex_timedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(tid: io.github.kotlinmania.libc.PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pthread_getname_np(tid, name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadSetnameNp(tid: io.github.kotlinmania.libc.PthreadT, name: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pthread_setname_np(tid, name)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_glob(pattern, flags, errfunc?.value?.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_fallocate(fd, offset, len)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawn_file_actions_init(fileActions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawn_file_actions_destroy(fileActions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawn_file_actions_addopen(fileActions?.value?.toCPointer<ByteVar>(), fildes, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawn_file_actions_addclose(fileActions?.value?.toCPointer<ByteVar>(), fildes)

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawn_file_actions_adddup2(fileActions?.value?.toCPointer<ByteVar>(), fildes, newfildes)

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: COpaquePointer?, lowfiledes: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawn_file_actions_addclosefrom_np(fileActions?.value?.toCPointer<ByteVar>(), lowfiledes)

public actual fun posixSpawnFileActionsAddchdir(fileActions: COpaquePointer?, path: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawn_file_actions_addchdir(fileActions?.value?.toCPointer<ByteVar>(), path)

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: COpaquePointer?, path: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawn_file_actions_addchdir_np(fileActions?.value?.toCPointer<ByteVar>(), path)

public actual fun posixSpawnFileActionsAddfchdir(fileActions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawn_file_actions_addfchdir(fileActions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_setflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_getflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_setpgroup(attr?.value?.toCPointer<ByteVar>(), pgroup)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: PidT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_getpgroup(attr?.value?.toCPointer<ByteVar>(), pgroup?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_setschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_getschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_setschedpolicy(attr?.value?.toCPointer<ByteVar>(), policy)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, policy: CInt?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_getschedpolicy(attr?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_setsigdefault(attr?.value?.toCPointer<ByteVar>(), sigdefault?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_getsigdefault(attr?.value?.toCPointer<ByteVar>(), sigdefault?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigignoreNp(attr: COpaquePointer?, sigignore: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_setsigignore_np(attr?.value?.toCPointer<ByteVar>(), sigignore?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigignoreNp(attr: COpaquePointer?, sigignore: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_getsigignore_np(attr?.value?.toCPointer<ByteVar>(), sigignore?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_setsigmask(attr?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_posix_spawnattr_getsigmask(attr?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_shmget(key, size, shmflg)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_shm_open(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_shm_unlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CUint?): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun futimesat(fd: CInt, path: String?, times: Timeval?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_futimesat(fd, path, times?.value?.toCPointer<ByteVar>())

public actual fun futimens(dirfd: CInt, times: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_futimens(dirfd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_nl_langinfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sendmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_recvmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun accept4(fd: CInt, address: Sockaddr?, addressLen: CUint?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_accept4(fd, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>(), flags)

public actual fun mqClose(mqd: io.github.kotlinmania.libc.MqdT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_mq_close(mqd?.value?.toCPointer<ByteVar>())

public actual fun mqUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_mq_unlink(name)

public actual fun mqReceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_mq_receive(mqd?.value?.toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_mq_timedreceive(mqd?.value?.toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_mq_send(mqd?.value?.toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio)

public actual fun mqTimedsend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_mq_timedsend(mqd?.value?.toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: io.github.kotlinmania.libc.MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_mq_getattr(mqd?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun mqSetattr(mqd: io.github.kotlinmania.libc.MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_mq_setattr(mqd?.value?.toCPointer<ByteVar>(), newattr?.value?.toCPointer<ByteVar>(), oldattr?.value?.toCPointer<ByteVar>())

public actual fun portCreate(): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_port_create()

public actual fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_port_associate(port, source, obj, events, user?.value?.toCPointer<ByteVar>())

public actual fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_port_dissociate(port, source, obj)

public actual fun portGet(port: CInt, pe: PortEvent?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_port_get(port, pe?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun portGetn(port: CInt, peList: PortEvent?, max: CUint, nget: CUint?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_port_getn(port, peList?.value?.toCPointer<ByteVar>(), max, nget?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun portSend(port: CInt, events: CInt, user: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_port_send(port, events, user?.value?.toCPointer<ByteVar>())

public actual fun portSendn(portList: CInt?, errorList: CInt?, nent: CUint, events: CInt, user: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_port_sendn(portList?.value?.toCPointer<ByteVar>(), errorList?.value?.toCPointer<ByteVar>(), nent, events, user?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getgrgid_r(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: io.github.kotlinmania.libc.SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: SemT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sem_close(sem?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getdtablesize()

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getgrnam_r(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun thrSelf(): io.github.kotlinmania.libc.ThreadT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_thr_self()

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pthread_sigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun getgrnam(name: String?): Group? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pthread_kill(thread, sig)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sched_get_priority_min(policy)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sched_get_priority_max(policy)

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sched_getparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sched_setparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sched_getscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sched_setscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sem_unlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getpwnam_r(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getpwuid_r(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun nativeGetpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: CInt): Passwd? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_native_getpwent_r(pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun nativeGetgrentR(grp: Group?, buf: COpaquePointer?, buflen: CInt): Group? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_native_getgrent_r(grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pthread_atfork(prepare?.value?.toCPointer<ByteVar>(), parent?.value?.toCPointer<ByteVar>(), child?.value?.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): Group? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_setgrent()
}

public actual fun endgrent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_endgrent()
}

public actual fun getgrent(): Group? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_dup3(src, dst, flags)

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun makeutx(ux: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_makeutx(ux?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun modutx(ux: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_modutx(ux?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun updwtmpx(file: String?, ut: Utmpx?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_updwtmpx(file, ut?.value?.toCPointer<ByteVar>())
}

public actual fun utmpxname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_utmpxname(file)

public actual fun getutxent(): Utmpx? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutxent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_setutxent()
}

public actual fun endutxent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_endutxent()
}

public actual fun endutent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_endutent()
}

public actual fun getutent(): Utmp? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getutent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutid(u: Utmp?): Utmp? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getutid(u?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutline(u: Utmp?): Utmp? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getutline(u?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututline(u: Utmp?): Utmp? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pututline(u?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_setutent()
}

public actual fun utmpname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_utmpname(file)

public actual fun getutmp(ux: Utmpx?, u: Utmp?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getutmp(ux?.value?.toCPointer<ByteVar>(), u?.value?.toCPointer<ByteVar>())
}

public actual fun getutmpx(u: Utmp?, ux: Utmpx?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getutmpx(u?.value?.toCPointer<ByteVar>(), ux?.value?.toCPointer<ByteVar>())
}

public actual fun updwtmp(file: String?, u: Utmp?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_updwtmp(file, u?.value?.toCPointer<ByteVar>())
}

public actual fun ntpAdjtime(buf: Timex?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ntp_adjtime(buf?.value?.toCPointer<ByteVar>())

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ntp_gettime(buf?.value?.toCPointer<ByteVar>())

public actual fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: CInt?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_timer_create(clockId, evp?.value?.toCPointer<ByteVar>(), timerid?.value?.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_timer_delete(timerid)

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_timer_getoverrun(timerid)

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_timer_gettime(timerid, value?.value?.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_timer_settime(timerid, flags, value?.value?.toCPointer<ByteVar>(), ovalue?.value?.toCPointer<ByteVar>())

public actual fun ucredGet(pid: PidT): UcredT? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ucred_get(pid)?.let { COpaquePointer(it.toLong()) }

public actual fun getpeerucred(fd: CInt, ucred: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getpeerucred(fd, ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredFree(ucred: UcredT?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ucred_free(ucred?.value?.toCPointer<ByteVar>())
}

public actual fun ucredGeteuid(ucred: UcredT?): UidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ucred_geteuid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetruid(ucred: UcredT?): UidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ucred_getruid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetsuid(ucred: UcredT?): UidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ucred_getsuid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetegid(ucred: UcredT?): GidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ucred_getegid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetrgid(ucred: UcredT?): GidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ucred_getrgid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetsgid(ucred: UcredT?): GidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ucred_getsgid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetgroups(ucred: UcredT?, groups: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ucred_getgroups(ucred?.value?.toCPointer<ByteVar>(), groups?.value?.toCPointer<ByteVar>())

public actual fun ucredGetpid(ucred: UcredT?): PidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ucred_getpid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetprojid(ucred: UcredT?): ProjidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ucred_getprojid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetzoneid(ucred: UcredT?): ZoneidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ucred_getzoneid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetpflags(ucred: UcredT?, flags: CUint): CUint =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ucred_getpflags(ucred?.value?.toCPointer<ByteVar>(), flags)

public actual fun ucredSize(): SizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_ucred_size()

public actual fun psetCreate(newpset: CInt?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pset_create(newpset?.value?.toCPointer<ByteVar>())

public actual fun psetDestroy(pset: io.github.kotlinmania.libc.PsetidT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pset_destroy(pset)

public actual fun psetAssign(pset: io.github.kotlinmania.libc.PsetidT, cpu: io.github.kotlinmania.libc.ProcessoridT, opset: CInt?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pset_assign(pset, cpu, opset?.value?.toCPointer<ByteVar>())

public actual fun psetInfo(pset: io.github.kotlinmania.libc.PsetidT, tpe: CInt?, numcpus: CUint?, cpulist: CInt?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pset_info(pset, tpe?.value?.toCPointer<ByteVar>(), numcpus?.value?.toCPointer<ByteVar>(), cpulist?.value?.toCPointer<ByteVar>())

public actual fun psetBind(pset: io.github.kotlinmania.libc.PsetidT, idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, opset: CInt?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pset_bind(pset, idtype, id, opset?.value?.toCPointer<ByteVar>())

public actual fun psetList(pset: CInt?, numpsets: CUint?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pset_list(pset?.value?.toCPointer<ByteVar>(), numpsets?.value?.toCPointer<ByteVar>())

public actual fun psetSetattr(pset: PsetidT, attr: CUint): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pset_setattr(pset, attr)

public actual fun psetGetattr(pset: PsetidT, attr: CUint?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_pset_getattr(pset, attr?.value?.toCPointer<ByteVar>())

public actual fun processorBind(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, newBinding: io.github.kotlinmania.libc.ProcessoridT, oldBinding: CInt?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_processor_bind(idtype, id, newBinding, oldBinding?.value?.toCPointer<ByteVar>())

public actual fun pOnline(processorid: io.github.kotlinmania.libc.ProcessoridT, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_p_online(processorid, flag)

public actual fun processorInfo(processorid: io.github.kotlinmania.libc.ProcessoridT, infop: ProcessorInfoT?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_processor_info(processorid, infop?.value?.toCPointer<ByteVar>())

public actual fun getexecname(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getexecname()?.let { COpaquePointer(it.toLong()) }

public actual fun gethostid(): CLong =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_gethostid()

public actual fun getpflags(flags: CUint): CUint =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getpflags(flags)

public actual fun setpflags(flags: CUint, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_setpflags(flags, value)

public actual fun sysinfo(command: CInt, buf: COpaquePointer?, count: CLong): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sysinfo(command, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun faccessat(fd: CInt, path: String?, amode: CInt, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_faccessat(fd, path, amode, flag)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_dl_iterate_phdr(callback?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun getpagesize(): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getpagesize()

public actual fun getpagesizes(pagesize: SizeT?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getpagesizes(pagesize?.value?.toCPointer<ByteVar>(), nelem)

public actual fun mmapobj(fd: CInt, flags: CUint, storage: MmapobjResultT?, elements: CUint?, arg: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_mmapobj(fd, flags, storage?.value?.toCPointer<ByteVar>(), elements?.value?.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())

public actual fun meminfo(inaddr: ULong?, addrCount: CInt, infoReq: CUint?, infoCount: CInt, outdata: ULong?, validity: CUint?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_meminfo(inaddr?.value?.toCPointer<ByteVar>(), addrCount, infoReq?.value?.toCPointer<ByteVar>(), infoCount, outdata?.value?.toCPointer<ByteVar>(), validity?.value?.toCPointer<ByteVar>())

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_strsep(string?.value?.toCPointer<ByteVar>(), delim)?.let { COpaquePointer(it.toLong()) }

public actual fun getisax(array: UInt?, n: CUint): CUint =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getisax(array?.value?.toCPointer<ByteVar>(), n)

public actual fun backtrace(buffer: COpaquePointer?, size: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_backtrace(buffer?.value?.toCPointer<ByteVar>(), size)

public actual fun backtraceSymbols(buffer: COpaquePointer?, size: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_backtrace_symbols(buffer?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, size: CInt, fd: CInt) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_backtrace_symbols_fd(buffer?.value?.toCPointer<ByteVar>(), size, fd)
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_getopt_long(argc, argv?.value?.toCPointer<ByteVar>(), optstring, longopts?.value?.toCPointer<ByteVar>(), longindex?.value?.toCPointer<ByteVar>())

public actual fun sync() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sync()
}

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_aio_cancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_aio_error(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_aio_fsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_aio_read(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_aio_return(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_aio_suspend(aiocbList?.value?.toCPointer<ByteVar>(), nitems, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioWaitn(aiocbList: COpaquePointer?, nent: CUint, nwait: CUint?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_aio_waitn(aiocbList?.value?.toCPointer<ByteVar>(), nent, nwait?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_aio_write(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_lio_listio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nitems, sevp?.value?.toCPointer<ByteVar>())

public actual fun major(version: CInt, devnum: io.github.kotlinmania.libc.DevT): io.github.kotlinmania.libc.MajorT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_major(version, devnum)

public actual fun minor(version: CInt, devnum: io.github.kotlinmania.libc.DevT): io.github.kotlinmania.libc.MinorT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_minor(version, devnum)

public actual fun makedev(version: CInt, majdev: io.github.kotlinmania.libc.MajorT, mindev: io.github.kotlinmania.libc.MinorT): io.github.kotlinmania.libc.DevT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_makedev(version, majdev, mindev)

public actual fun arc4random(): UInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_arc4random()

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_arc4random_buf(buf?.value?.toCPointer<ByteVar>(), nbytes)
}

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_arc4random_uniform(upperBound)

public actual fun secureGetenv(name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_secure_getenv(name)?.let { COpaquePointer(it.toLong()) }

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: io.github.kotlinmania.libc.Tm?): SizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_strftime(s?.value?.toCPointer<ByteVar>(), maxsize, format, timeptr?.value?.toCPointer<ByteVar>())

public actual fun strftimeL(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: io.github.kotlinmania.libc.Tm?, loc: LocaleT): SizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_strftime_l(s?.value?.toCPointer<ByteVar>(), maxsize, format, timeptr?.value?.toCPointer<ByteVar>(), loc.toInt())

public actual fun sendfile(outFd: CInt, inFd: CInt, off: CLong?, len: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sendfile(outFd, inFd, off?.value?.toCPointer<ByteVar>(), len)

public actual fun sendfilev(fildes: CInt, vec: SendfilevecT?, sfvcnt: CInt, xferred: SizeT?): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_sendfilev(fildes, vec?.value?.toCPointer<ByteVar>(), sfvcnt, xferred?.value?.toCPointer<ByteVar>())

public actual fun lgrpInit(view: LgrpViewT): LgrpCookieT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_lgrp_init(view)

public actual fun lgrpFini(cookie: LgrpCookieT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_lgrp_fini(cookie)

public actual fun lgrpAffinityGet(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, lgrp: io.github.kotlinmania.libc.LgrpIdT): LgrpAffinityT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_lgrp_affinity_get(idtype, id, lgrp)

public actual fun lgrpAffinitySet(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, lgrp: io.github.kotlinmania.libc.LgrpIdT, aff: LgrpAffinityT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_lgrp_affinity_set(idtype, id, lgrp, aff.toInt())

public actual fun lgrpCpus(cookie: io.github.kotlinmania.libc.LgrpCookieT, lgrp: io.github.kotlinmania.libc.LgrpIdT, cpuids: CInt?, count: CUint, content: io.github.kotlinmania.libc.LgrpContentT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_lgrp_cpus(cookie, lgrp, cpuids?.value?.toCPointer<ByteVar>(), count, content)

public actual fun lgrpMemSize(cookie: io.github.kotlinmania.libc.LgrpCookieT, lgrp: io.github.kotlinmania.libc.LgrpIdT, tpe: io.github.kotlinmania.libc.LgrpMemSizeFlagT, content: io.github.kotlinmania.libc.LgrpContentT): io.github.kotlinmania.libc.LgrpMemSizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_lgrp_mem_size(cookie, lgrp, tpe, content)

public actual fun lgrpNlgrps(cookie: io.github.kotlinmania.libc.LgrpCookieT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_lgrp_nlgrps(cookie)

public actual fun lgrpView(cookie: io.github.kotlinmania.libc.LgrpCookieT): io.github.kotlinmania.libc.LgrpViewT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_lgrp_view(cookie)

public actual fun lgrpHome(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT): io.github.kotlinmania.libc.LgrpIdT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_lgrp_home(idtype, id)

public actual fun lgrpVersion(version: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_lgrp_version(version)

public actual fun lgrpResources(cookie: io.github.kotlinmania.libc.LgrpCookieT, lgrp: io.github.kotlinmania.libc.LgrpIdT, lgrps: CInt?, count: CUint, tpe: LgrpRsrcT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_lgrp_resources(cookie, lgrp, lgrps?.value?.toCPointer<ByteVar>(), count, tpe.toInt())

public actual fun lgrpRoot(cookie: io.github.kotlinmania.libc.LgrpCookieT): io.github.kotlinmania.libc.LgrpIdT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_solarish_mod_lgrp_root(cookie)
