@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpAffinityT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpRsrcT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_abs(i)

public actual fun acct(filename: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_acct(filename)

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_labs(i)

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_rand()

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_srand(seed)
}

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun getrandom(bbuf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getrandom(bbuf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun settimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_settimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getifaddrs(ifap?.value?.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_freeifaddrs(ifa?.value?.toCPointer<ByteVar>())
}

public actual fun stackGetbounds(sp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_stackGetbounds(sp?.value?.toCPointer<ByteVar>())

public actual fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getgrouplist(name, basegid, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_initgroups(name, basegid)

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun errno(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_errno()?.let { COpaquePointer(it.toLong()) }

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_clockGetres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_clockGettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_clockNanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_clockSettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun setpwent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_setpwent()
}

public actual fun endpwent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_endpwent()
}

public actual fun getpwent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_fdatasync(fd)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_nlLanginfoL(item, locale?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun duplocale(base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_duplocale(base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_freelocale(loc?.value?.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_newlocale(mask, locale, base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uselocale(loc: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_uselocale(loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getprogname(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getprogname()?.let { COpaquePointer(it.toLong()) }

public actual fun setprogname(name: String?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_setprogname(name)
}

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getloadavg(loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun getpriority(which: CInt, who: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getpriority(which, who)

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_setpriority(which, who, prio)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_mknodat(dirfd, pathname, mode, dev)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_mkfifoat(dirfd, pathname, mode)

public actual fun sethostname(name: String?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_sethostname(name, len)

public actual fun ifNameindex(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ifNameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ifFreenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_pthreadAttrGetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_pthreadCondattrGetclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_semTimedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_semGetvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_pthreadMutexTimedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_pthreadGetnameNp(tid.toLong().toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadSetnameNp(tid: PthreadT, name: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_pthreadSetnameNp(tid.toLong().toCPointer<ByteVar>(), name)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_glob(pattern, flags, 0L.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixFallocate(fd, offset, len)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixMadvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnFileActionsInit(fileActions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnFileActionsDestroy(fileActions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnFileActionsAddopen(fileActions?.value?.toCPointer<ByteVar>(), fildes, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnFileActionsAddclose(fileActions?.value?.toCPointer<ByteVar>(), fildes)

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnFileActionsAdddup2(fileActions?.value?.toCPointer<ByteVar>(), fildes, newfildes)

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: COpaquePointer?, lowfiledes: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnFileActionsAddclosefromNp(fileActions?.value?.toCPointer<ByteVar>(), lowfiledes)

public actual fun posixSpawnFileActionsAddchdir(fileActions: COpaquePointer?, path: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnFileActionsAddchdir(fileActions?.value?.toCPointer<ByteVar>(), path)

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: COpaquePointer?, path: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnFileActionsAddchdirNp(fileActions?.value?.toCPointer<ByteVar>(), path)

public actual fun posixSpawnFileActionsAddfchdir(fileActions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnFileActionsAddfchdir(fileActions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrSetflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrGetflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrSetpgroup(attr?.value?.toCPointer<ByteVar>(), pgroup)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrGetpgroup(attr?.value?.toCPointer<ByteVar>(), pgroup?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrSetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrGetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrSetschedpolicy(attr?.value?.toCPointer<ByteVar>(), policy)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, policy: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrGetschedpolicy(attr?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrSetsigdefault(attr?.value?.toCPointer<ByteVar>(), sigdefault?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrGetsigdefault(attr?.value?.toCPointer<ByteVar>(), sigdefault?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigignoreNp(attr: COpaquePointer?, sigignore: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrSetsigignoreNp(attr?.value?.toCPointer<ByteVar>(), sigignore?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigignoreNp(attr: COpaquePointer?, sigignore: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrGetsigignoreNp(attr?.value?.toCPointer<ByteVar>(), sigignore?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrSetsigmask(attr?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_posixSpawnattrGetsigmask(attr?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_shmget(key, size, shmflg)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun futimesat(fd: CInt, path: String?, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_futimesat(fd, path, times?.value?.toCPointer<ByteVar>())

public actual fun futimens(dirfd: CInt, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_futimens(dirfd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_nlLanginfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_sendmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_recvmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun accept4(fd: CInt, address: COpaquePointer?, addressLen: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_accept4(fd, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>(), flags)

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    null

public actual fun mqClose(mqd: MqdT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_mqClose(mqd?.value?.toCPointer<ByteVar>())

public actual fun mqUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_mqUnlink(name)

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_mqReceive(mqd?.value?.toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_mqTimedreceive(mqd?.value?.toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_mqSend(mqd?.value?.toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_mqTimedsend(mqd?.value?.toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_mqGetattr(mqd?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_mqSetattr(mqd?.value?.toCPointer<ByteVar>(), newattr?.value?.toCPointer<ByteVar>(), oldattr?.value?.toCPointer<ByteVar>())

public actual fun portCreate(): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_portCreate()

public actual fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_portAssociate(port, source, obj, events, user?.value?.toCPointer<ByteVar>())

public actual fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_portDissociate(port, source, obj)

public actual fun portGet(port: CInt, pe: COpaquePointer?, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_portGet(port, pe?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun portGetn(port: CInt, peList: COpaquePointer?, max: CUint, nget: COpaquePointer?, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_portGetn(port, peList?.value?.toCPointer<ByteVar>(), max, nget?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun portSend(port: CInt, events: CInt, user: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_portSend(port, events, user?.value?.toCPointer<ByteVar>())

public actual fun portSendn(portList: COpaquePointer?, errorList: COpaquePointer?, nent: CUint, events: CInt, user: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_portSendn(portList?.value?.toCPointer<ByteVar>(), errorList?.value?.toCPointer<ByteVar>(), nent, events, user?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getgrgidR(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_semClose(sem?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getdtablesize()

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getgrnamR(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun thrSelf(): ThreadT =
    (io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_thrSelf()?.toLong() ?: 0L).toUInt()

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_pthreadSigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_pthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_schedGetPriorityMin(policy)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_schedGetPriorityMax(policy)

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_schedGetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_schedSetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_schedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_schedSetscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getpwnamR(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getpwuidR(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun nativeGetpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_nativeGetpwentR(pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun nativeGetgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_nativeGetgrentR(grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_pthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_setgrent()
}

public actual fun endgrent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_dup3(src, dst, flags)

public actual fun uname(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun makeutx(ux: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_makeutx(ux?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun modutx(ux: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_modutx(ux?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun updwtmpx(file: String?, ut: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_updwtmpx(file, ut?.value?.toCPointer<ByteVar>())
}

public actual fun utmpxname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_utmpxname(file)

public actual fun getutxent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutxent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_setutxent()
}

public actual fun endutxent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_endutxent()
}

public actual fun endutent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_endutent()
}

public actual fun getutent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getutent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutid(u: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getutid(u?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutline(u: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getutline(u?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututline(u: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_pututline(u?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutent() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_setutent()
}

public actual fun utmpname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_utmpname(file)

public actual fun getutmp(ux: COpaquePointer?, u: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getutmp(ux?.value?.toCPointer<ByteVar>(), u?.value?.toCPointer<ByteVar>())
}

public actual fun getutmpx(u: COpaquePointer?, ux: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getutmpx(u?.value?.toCPointer<ByteVar>(), ux?.value?.toCPointer<ByteVar>())
}

public actual fun updwtmp(file: String?, u: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_updwtmp(file, u?.value?.toCPointer<ByteVar>())
}

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ntpAdjtime(buf?.value?.toCPointer<ByteVar>())

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ntpGettime(buf?.value?.toCPointer<ByteVar>())

public actual fun timerCreate(clockId: ClockidT, evp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_timerCreate(clockId, evp?.value?.toCPointer<ByteVar>(), timerid?.value?.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_timerDelete(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_timerGetoverrun(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_timerGettime(timerid.toLong().toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_timerSettime(timerid.toLong().toCPointer<ByteVar>(), flags, value?.value?.toCPointer<ByteVar>(), ovalue?.value?.toCPointer<ByteVar>())

public actual fun ucredGet(pid: PidT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ucredGet(pid)?.let { COpaquePointer(it.toLong()) }

public actual fun getpeerucred(fd: CInt, ucred: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getpeerucred(fd, ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredFree(ucred: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ucredFree(ucred?.value?.toCPointer<ByteVar>())
}

public actual fun ucredGeteuid(ucred: COpaquePointer?): UidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ucredGeteuid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetruid(ucred: COpaquePointer?): UidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ucredGetruid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetsuid(ucred: COpaquePointer?): UidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ucredGetsuid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetegid(ucred: COpaquePointer?): GidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ucredGetegid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetrgid(ucred: COpaquePointer?): GidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ucredGetrgid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetsgid(ucred: COpaquePointer?): GidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ucredGetsgid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetgroups(ucred: COpaquePointer?, groups: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ucredGetgroups(ucred?.value?.toCPointer<ByteVar>(), groups?.value?.toCPointer<ByteVar>())

public actual fun ucredGetpid(ucred: COpaquePointer?): PidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ucredGetpid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetprojid(ucred: COpaquePointer?): ProjidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ucredGetprojid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetzoneid(ucred: COpaquePointer?): ZoneidT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ucredGetzoneid(ucred?.value?.toCPointer<ByteVar>())

public actual fun ucredGetpflags(ucred: COpaquePointer?, flags: CUint): CUint =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ucredGetpflags(ucred?.value?.toCPointer<ByteVar>(), flags)

public actual fun ucredSize(): SizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_ucredSize()

public actual fun psetCreate(newpset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_psetCreate(newpset?.value?.toCPointer<ByteVar>())

public actual fun psetDestroy(pset: PsetidT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_psetDestroy(pset)

public actual fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_psetAssign(pset, cpu, opset?.value?.toCPointer<ByteVar>())

public actual fun psetInfo(pset: PsetidT, tpe: COpaquePointer?, numcpus: COpaquePointer?, cpulist: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_psetInfo(pset, tpe?.value?.toCPointer<ByteVar>(), numcpus?.value?.toCPointer<ByteVar>(), cpulist?.value?.toCPointer<ByteVar>())

public actual fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_psetBind(pset, idtype, id, opset?.value?.toCPointer<ByteVar>())

public actual fun psetList(pset: COpaquePointer?, numpsets: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_psetList(pset?.value?.toCPointer<ByteVar>(), numpsets?.value?.toCPointer<ByteVar>())

public actual fun psetSetattr(pset: PsetidT, attr: CUint): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_psetSetattr(pset, attr)

public actual fun psetGetattr(pset: PsetidT, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_psetGetattr(pset, attr?.value?.toCPointer<ByteVar>())

public actual fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_processorBind(idtype, id, newBinding, oldBinding?.value?.toCPointer<ByteVar>())

public actual fun pOnline(processorid: ProcessoridT, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_pOnline(processorid, flag)

public actual fun processorInfo(processorid: ProcessoridT, infop: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_processorInfo(processorid, infop?.value?.toCPointer<ByteVar>())

public actual fun getexecname(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getexecname()?.let { COpaquePointer(it.toLong()) }

public actual fun gethostid(): CLong =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_gethostid()

public actual fun getpflags(flags: CUint): CUint =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getpflags(flags)

public actual fun setpflags(flags: CUint, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_setpflags(flags, value)

public actual fun sysinfo(command: CInt, buf: COpaquePointer?, count: CLong): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_sysinfo(command, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun faccessat(fd: CInt, path: String?, amode: CInt, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_faccessat(fd, path, amode, flag)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_dlIteratePhdr(0L.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun getpagesize(): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getpagesize()

public actual fun getpagesizes(pagesize: COpaquePointer?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getpagesizes(pagesize?.value?.toCPointer<ByteVar>(), nelem)

public actual fun mmapobj(fd: CInt, flags: CUint, storage: COpaquePointer?, elements: COpaquePointer?, arg: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_mmapobj(fd, flags, storage?.value?.toCPointer<ByteVar>(), elements?.value?.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())

public actual fun meminfo(inaddr: COpaquePointer?, addrCount: CInt, infoReq: COpaquePointer?, infoCount: CInt, outdata: COpaquePointer?, validity: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_meminfo(inaddr?.value?.toCPointer<ByteVar>(), addrCount, infoReq?.value?.toCPointer<ByteVar>(), infoCount, outdata?.value?.toCPointer<ByteVar>(), validity?.value?.toCPointer<ByteVar>())

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_strsep(string?.value?.toCPointer<ByteVar>(), delim)?.let { COpaquePointer(it.toLong()) }

public actual fun getisax(array: COpaquePointer?, n: CUint): CUint =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getisax(array?.value?.toCPointer<ByteVar>(), n)

public actual fun backtrace(buffer: COpaquePointer?, size: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_backtrace(buffer?.value?.toCPointer<ByteVar>(), size)

public actual fun backtraceSymbols(buffer: COpaquePointer?, size: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_backtraceSymbols(buffer?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, size: CInt, fd: CInt) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_backtraceSymbolsFd(buffer?.value?.toCPointer<ByteVar>(), size, fd)
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_getoptLong(argc, argv?.value?.toCPointer<ByteVar>(), optstring, longopts?.value?.toCPointer<ByteVar>(), longindex?.value?.toCPointer<ByteVar>())

public actual fun sync() {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_sync()
}

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_aioCancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_aioError(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_aioFsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_aioRead(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_aioReturn(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_aioSuspend(aiocbList?.value?.toCPointer<ByteVar>(), nitems, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioWaitn(aiocbList: COpaquePointer?, nent: CUint, nwait: COpaquePointer?, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_aioWaitn(aiocbList?.value?.toCPointer<ByteVar>(), nent, nwait?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_aioWrite(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_lioListio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nitems, sevp?.value?.toCPointer<ByteVar>())

public actual fun major(version: CInt, devnum: DevT): MajorT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_major(version, devnum)

public actual fun minor(version: CInt, devnum: DevT): MinorT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_minor(version, devnum)

public actual fun makedev(version: CInt, majdev: MajorT, mindev: MinorT): DevT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_makedev(version, majdev, mindev)

public actual fun arc4random(): UInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_arc4random()

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_arc4randomBuf(buf?.value?.toCPointer<ByteVar>(), nbytes)
}

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_arc4randomUniform(upperBound)

public actual fun secureGetenv(name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_secureGetenv(name)?.let { COpaquePointer(it.toLong()) }

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_strftime(s?.value?.toCPointer<ByteVar>(), maxsize, format, timeptr?.value?.toCPointer<ByteVar>())

public actual fun strftimeL(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?, loc: LocaleT): SizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_strftimeL(s?.value?.toCPointer<ByteVar>(), maxsize, format, timeptr?.value?.toCPointer<ByteVar>(), loc?.value?.toCPointer<ByteVar>())

public actual fun sendfile(outFd: CInt, inFd: CInt, off: COpaquePointer?, len: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_sendfile(outFd, inFd, off?.value?.toCPointer<ByteVar>(), len)

public actual fun sendfilev(fildes: CInt, vec: COpaquePointer?, sfvcnt: CInt, xferred: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_sendfilev(fildes, vec?.value?.toCPointer<ByteVar>(), sfvcnt, xferred?.value?.toCPointer<ByteVar>())

public actual fun lgrpInit(view: LgrpViewT): LgrpCookieT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_lgrpInit(view)

public actual fun lgrpFini(cookie: LgrpCookieT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_lgrpFini(cookie)

public actual fun lgrpAffinityGet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT): LgrpAffinityT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_lgrpAffinityGet(idtype, id, lgrp)

public actual fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_lgrpAffinitySet(idtype, id, lgrp, aff)

public actual fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: COpaquePointer?, count: CUint, content: LgrpContentT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_lgrpCpus(cookie, lgrp, cpuids?.value?.toCPointer<ByteVar>(), count, content)

public actual fun lgrpMemSize(cookie: LgrpCookieT, lgrp: LgrpIdT, tpe: LgrpMemSizeFlagT, content: LgrpContentT): LgrpMemSizeT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_lgrpMemSize(cookie, lgrp, tpe, content)

public actual fun lgrpNlgrps(cookie: LgrpCookieT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_lgrpNlgrps(cookie)

public actual fun lgrpView(cookie: LgrpCookieT): LgrpViewT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_lgrpView(cookie)

public actual fun lgrpHome(idtype: IdtypeT, id: IdT): LgrpIdT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_lgrpHome(idtype, id)

public actual fun lgrpVersion(version: CInt): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_lgrpVersion(version)

public actual fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: COpaquePointer?, count: CUint, tpe: LgrpRsrcT): CInt =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_lgrpResources(cookie, lgrp, lgrps?.value?.toCPointer<ByteVar>(), count, tpe)

public actual fun lgrpRoot(cookie: LgrpCookieT): LgrpIdT =
    io.github.kotlinmania.libc.unix.solarish.cinterop.libc_unix_solarish_lgrpRoot(cookie)
