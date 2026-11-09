@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _unixSolarishNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_setrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else 0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_semDestroy((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) as Int) else 0

public actual fun abs(i: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_abs(i) as Int) else 0

public actual fun acct(filename: String?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_acct(filename) as Int) else 0

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_dirfd((dirp?.handle ?: 0L).toString()) as Int) else 0

public actual fun labs(i: CLong): CLong =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_labs(i.toString()) as String).toLong() else 0L

public actual fun rand(): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_rand() as Int) else 0

public actual fun srand(seed: CUint) {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_srand(seed.toInt())
    }
}

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun getrandom(bbuf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getrandom((bbuf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun settimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_settimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getifaddrs((ifap?.value ?: 0L).toString()) as Int) else 0

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_freeifaddrs((ifa?.value ?: 0L).toString())
    }
}

public actual fun stackGetbounds(sp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_stackGetbounds((sp?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getgrouplist(name, basegid.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) as Int) else 0

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_initgroups(name, basegid.toInt()) as Int) else 0

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_setgroups(ngroups, (ptr?.value ?: 0L).toString()) as Int) else 0

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else 0

public actual fun errno(): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_errno() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_clockGetres(clkId, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_clockGettime(clkId, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) as Int) else 0

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_clockSettime(clkId, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) as Int) else 0

public actual fun setpwent() {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_setpwent()
    }
}

public actual fun endpwent() {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_endpwent()
    }
}

public actual fun getpwent(): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getpwent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun fdatasync(fd: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_fdatasync(fd) as Int) else 0

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_nlLanginfoL(item, (locale?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_duplocale((base?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun freelocale(loc: LocaleT) {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_freelocale((loc?.value ?: 0L).toString())
    }
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_newlocale(mask, locale, (base?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_uselocale((loc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getprogname(): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getprogname() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setprogname(name: String?) {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_setprogname(name)
    }
}

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getloadavg((loadavg?.value ?: 0L).toString(), nelem) as Int) else 0

public actual fun getpriority(which: CInt, who: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getpriority(which, who) as Int) else 0

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_setpriority(which, who, prio) as Int) else 0

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_mknodat(dirfd, pathname, mode.toInt(), dev.toString()) as Int) else 0

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_mkfifoat(dirfd, pathname, mode.toInt()) as Int) else 0

public actual fun sethostname(name: String?, len: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_sethostname(name, len) as Int) else 0

public actual fun ifNameindex(): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ifNameindex() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_ifFreenameindex((ptr?.value ?: 0L).toString())
    }
}

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: FnCallback, value: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) as Int) else 0

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else 0

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadGetnameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_pthreadGetnameNp(tid.toLong().toString(), (name?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun pthreadSetnameNp(tid: PthreadT, name: String?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_pthreadSetnameNp(tid.toLong().toString(), name) as Int) else 0

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_waitid(idtype.toInt(), id, (infop?.value ?: 0L).toString(), options) as Int) else 0

public actual fun glob(pattern: String?, flags: CInt, errfunc: FnCallback1?, pglob: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) as Int) else 0

public actual fun globfree(pglob: COpaquePointer?) {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_globfree((pglob?.value ?: 0L).toString())
    }
}

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixFallocate(fd, offset.toString(), len.toString()) as Int) else 0

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else 0

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnFileActionsInit((fileActions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnFileActionsDestroy((fileActions?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnFileActionsAddopen((fileActions?.value ?: 0L).toString(), fildes, path, oflag, mode.toInt()) as Int) else 0

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnFileActionsAddclose((fileActions?.value ?: 0L).toString(), fildes) as Int) else 0

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnFileActionsAdddup2((fileActions?.value ?: 0L).toString(), fildes, newfildes) as Int) else 0

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: COpaquePointer?, lowfiledes: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnFileActionsAddclosefromNp((fileActions?.value ?: 0L).toString(), lowfiledes) as Int) else 0

public actual fun posixSpawnFileActionsAddchdir(fileActions: COpaquePointer?, path: String?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnFileActionsAddchdir((fileActions?.value ?: 0L).toString(), path) as Int) else 0

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: COpaquePointer?, path: String?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnFileActionsAddchdirNp((fileActions?.value ?: 0L).toString(), path) as Int) else 0

public actual fun posixSpawnFileActionsAddfchdir(fileActions: COpaquePointer?, fd: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnFileActionsAddfchdir((fileActions?.value ?: 0L).toString(), fd) as Int) else 0

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) as Int) else 0

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), pgroup) as Int) else 0

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (pgroup?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrSetschedpolicy((attr?.value ?: 0L).toString(), policy) as Int) else 0

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, policy: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrGetschedpolicy((attr?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (sigdefault?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (sigdefault?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigignoreNp(attr: COpaquePointer?, sigignore: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrSetsigignoreNp((attr?.value ?: 0L).toString(), (sigignore?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigignoreNp(attr: COpaquePointer?, sigignore: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrGetsigignoreNp((attr?.value ?: 0L).toString(), (sigignore?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) as Int) else 0

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) as Int) else 0

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_shmat(shmid, (shmaddr?.value ?: 0L).toString(), shmflg) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_shmctl(shmid, cmd, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_shmdt((shmaddr?.value ?: 0L).toString()) as Int) else 0

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_shmget(key, size.toString(), shmflg) as Int) else 0

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_shmOpen(name, oflag, mode.toInt()) as Int) else 0

public actual fun shmUnlink(name: String?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_shmUnlink(name) as Int) else 0

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_telldir((dirp?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else 0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_msync((addr?.value ?: 0L).toString(), len.toString(), flags) as Int) else 0

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_memalign(align.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_mkstemps((template?.value ?: 0L).toString(), suffixlen) as Int) else 0

public actual fun futimesat(fd: CInt, path: String?, times: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_futimesat(fd, path, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun futimens(dirfd: CInt, times: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_futimens(dirfd, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) as Int) else 0

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_nlLanginfo(item) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_bind(socket, (address?.value ?: 0L).toString(), addressLen.toInt()) as Int) else 0

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_writev(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else 0L

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_readv(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else 0L

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_sendmsg(fd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else 0L

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_recvmsg(fd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else 0L

public actual fun accept4(fd: CInt, address: COpaquePointer?, addressLen: COpaquePointer?, flags: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_accept4(fd, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    null

public actual fun mqClose(mqd: MqdT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_mqClose((mqd?.value ?: 0L).toString()) as Int) else 0

public actual fun mqUnlink(name: String?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_mqUnlink(name) as Int) else 0

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_mqReceive((mqd?.value ?: 0L).toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_mqTimedreceive((mqd?.value ?: 0L).toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString(), (absTimeout?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_mqSend((mqd?.value ?: 0L).toString(), msgPtr, msgLen.toString(), msgPrio.toInt()) as Int) else 0

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_mqTimedsend((mqd?.value ?: 0L).toString(), msgPtr, msgLen.toString(), msgPrio.toInt(), (absTimeout?.value ?: 0L).toString()) as Int) else 0

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_mqGetattr((mqd?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_mqSetattr((mqd?.value ?: 0L).toString(), (newattr?.value ?: 0L).toString(), (oldattr?.value ?: 0L).toString()) as Int) else 0

public actual fun portCreate(): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_portCreate() as Int) else 0

public actual fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_portAssociate(port, source, obj.toString(), events, (user?.value ?: 0L).toString()) as Int) else 0

public actual fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_portDissociate(port, source, obj.toString()) as Int) else 0

public actual fun portGet(port: CInt, pe: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_portGet(port, (pe?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun portGetn(port: CInt, peList: COpaquePointer?, max: CUint, nget: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_portGetn(port, (peList?.value ?: 0L).toString(), max.toInt(), (nget?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun portSend(port: CInt, events: CInt, user: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_portSend(port, events, (user?.value ?: 0L).toString()) as Int) else 0

public actual fun portSendn(portList: COpaquePointer?, errorList: COpaquePointer?, nent: CUint, events: CInt, user: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_portSendn((portList?.value ?: 0L).toString(), (errorList?.value ?: 0L).toString(), nent.toInt(), events, (user?.value ?: 0L).toString()) as Int) else 0

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) as Int) else 0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_sigsuspend((mask?.value ?: 0L).toString()) as Int) else 0

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_semClose((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun getdtablesize(): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getdtablesize() as Int) else 0

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun thrSelf(): ThreadT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_thrSelf() as String).toLong().toUInt() else 0u

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) as Int) else 0

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getgrnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_pthreadKill(thread.toLong().toString(), sig) as Int) else 0

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_schedGetPriorityMin(policy) as Int) else 0

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_schedGetPriorityMax(policy) as Int) else 0

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_schedGetparam(pid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_schedSetparam(pid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_schedGetscheduler(pid) as Int) else 0

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun semUnlink(name: String?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_semUnlink(name) as Int) else 0

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_daemon(nochdir, noclose) as Int) else 0

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun nativeGetpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_nativeGetpwentR((pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun nativeGetgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_nativeGetgrentR((grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAtfork(prepare: FnCallback2?, parent: FnCallback2?, child: FnCallback2?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else 0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getgrgid(gid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setgrent() {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_setgrent()
    }
}

public actual fun endgrent() {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_endgrent()
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getgrent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_popen(command, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_dup3(src, dst, flags) as Int) else 0

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_uname((buf?.value ?: 0L).toString()) as Int) else 0

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_pipe2((fds?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun makeutx(ux: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_makeutx((ux?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun modutx(ux: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_modutx((ux?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun updwtmpx(file: String?, ut: COpaquePointer?) {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_updwtmpx(file, (ut?.value ?: 0L).toString())
    }
}

public actual fun utmpxname(file: String?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_utmpxname(file) as Int) else 0

public actual fun getutxent(): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getutxent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getutxid((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getutxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_pututxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setutxent() {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_setutxent()
    }
}

public actual fun endutxent() {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_endutxent()
    }
}

public actual fun endutent() {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_endutent()
    }
}

public actual fun getutent(): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getutent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutid(u: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getutid((u?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutline(u: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getutline((u?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pututline(u: COpaquePointer?): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_pututline((u?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setutent() {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_setutent()
    }
}

public actual fun utmpname(file: String?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_utmpname(file) as Int) else 0

public actual fun getutmp(ux: COpaquePointer?, u: COpaquePointer?) {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_getutmp((ux?.value ?: 0L).toString(), (u?.value ?: 0L).toString())
    }
}

public actual fun getutmpx(u: COpaquePointer?, ux: COpaquePointer?) {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_getutmpx((u?.value ?: 0L).toString(), (ux?.value ?: 0L).toString())
    }
}

public actual fun updwtmp(file: String?, u: COpaquePointer?) {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_updwtmp(file, (u?.value ?: 0L).toString())
    }
}

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ntpAdjtime((buf?.value ?: 0L).toString()) as Int) else 0

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ntpGettime((buf?.value ?: 0L).toString()) as Int) else 0

public actual fun timerCreate(clockId: ClockidT, evp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_timerCreate(clockId, (evp?.value ?: 0L).toString(), (timerid?.value ?: 0L).toString()) as Int) else 0

public actual fun timerDelete(timerid: TimerT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_timerDelete(timerid.toLong().toString()) as Int) else 0

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_timerGetoverrun(timerid.toLong().toString()) as Int) else 0

public actual fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_timerGettime(timerid.toLong().toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_timerSettime(timerid.toLong().toString(), flags, (value?.value ?: 0L).toString(), (ovalue?.value ?: 0L).toString()) as Int) else 0

public actual fun ucredGet(pid: PidT): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ucredGet(pid) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getpeerucred(fd: CInt, ucred: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getpeerucred(fd, (ucred?.value ?: 0L).toString()) as Int) else 0

public actual fun ucredFree(ucred: COpaquePointer?) {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_ucredFree((ucred?.value ?: 0L).toString())
    }
}

public actual fun ucredGeteuid(ucred: COpaquePointer?): UidT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ucredGeteuid((ucred?.value ?: 0L).toString()) as Int).toUShort() else 0u

public actual fun ucredGetruid(ucred: COpaquePointer?): UidT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ucredGetruid((ucred?.value ?: 0L).toString()) as Int).toUShort() else 0u

public actual fun ucredGetsuid(ucred: COpaquePointer?): UidT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ucredGetsuid((ucred?.value ?: 0L).toString()) as Int).toUShort() else 0u

public actual fun ucredGetegid(ucred: COpaquePointer?): GidT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ucredGetegid((ucred?.value ?: 0L).toString()) as Int).toUShort() else 0u

public actual fun ucredGetrgid(ucred: COpaquePointer?): GidT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ucredGetrgid((ucred?.value ?: 0L).toString()) as Int).toUShort() else 0u

public actual fun ucredGetsgid(ucred: COpaquePointer?): GidT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ucredGetsgid((ucred?.value ?: 0L).toString()) as Int).toUShort() else 0u

public actual fun ucredGetgroups(ucred: COpaquePointer?, groups: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ucredGetgroups((ucred?.value ?: 0L).toString(), (groups?.value ?: 0L).toString()) as Int) else 0

public actual fun ucredGetpid(ucred: COpaquePointer?): PidT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ucredGetpid((ucred?.value ?: 0L).toString()) as Int) else 0

public actual fun ucredGetprojid(ucred: COpaquePointer?): ProjidT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ucredGetprojid((ucred?.value ?: 0L).toString()) as Int) else 0

public actual fun ucredGetzoneid(ucred: COpaquePointer?): ZoneidT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ucredGetzoneid((ucred?.value ?: 0L).toString()) as Int) else 0

public actual fun ucredGetpflags(ucred: COpaquePointer?, flags: CUint): CUint =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ucredGetpflags((ucred?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun ucredSize(): SizeT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_ucredSize() as String).toULong() else 0uL

public actual fun psetCreate(newpset: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_psetCreate((newpset?.value ?: 0L).toString()) as Int) else 0

public actual fun psetDestroy(pset: PsetidT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_psetDestroy(pset) as Int) else 0

public actual fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_psetAssign(pset, cpu, (opset?.value ?: 0L).toString()) as Int) else 0

public actual fun psetInfo(pset: PsetidT, tpe: COpaquePointer?, numcpus: COpaquePointer?, cpulist: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_psetInfo(pset, (tpe?.value ?: 0L).toString(), (numcpus?.value ?: 0L).toString(), (cpulist?.value ?: 0L).toString()) as Int) else 0

public actual fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_psetBind(pset, idtype.toInt(), id, (opset?.value ?: 0L).toString()) as Int) else 0

public actual fun psetList(pset: COpaquePointer?, numpsets: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_psetList((pset?.value ?: 0L).toString(), (numpsets?.value ?: 0L).toString()) as Int) else 0

public actual fun psetSetattr(pset: PsetidT, attr: CUint): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_psetSetattr(pset, attr.toInt()) as Int) else 0

public actual fun psetGetattr(pset: PsetidT, attr: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_psetGetattr(pset, (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_processorBind(idtype.toInt(), id, newBinding, (oldBinding?.value ?: 0L).toString()) as Int) else 0

public actual fun pOnline(processorid: ProcessoridT, flag: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_pOnline(processorid, flag) as Int) else 0

public actual fun processorInfo(processorid: ProcessoridT, infop: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_processorInfo(processorid, (infop?.value ?: 0L).toString()) as Int) else 0

public actual fun getexecname(): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getexecname() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun gethostid(): CLong =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_gethostid() as String).toLong() else 0L

public actual fun getpflags(flags: CUint): CUint =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getpflags(flags.toInt()) as Int).toUInt() else 0u

public actual fun setpflags(flags: CUint, value: CUint): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_setpflags(flags.toInt(), value.toInt()) as Int) else 0

public actual fun sysinfo(command: CInt, buf: COpaquePointer?, count: CLong): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_sysinfo(command, (buf?.value ?: 0L).toString(), count.toString()) as Int) else 0

public actual fun faccessat(fd: CInt, path: String?, amode: CInt, flag: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_faccessat(fd, path, amode, flag) as Int) else 0

public actual fun dlIteratePhdr(callback: FnCallback3?, data: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) as Int) else 0

public actual fun getpagesize(): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getpagesize() as Int) else 0

public actual fun getpagesizes(pagesize: COpaquePointer?, nelem: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getpagesizes((pagesize?.value ?: 0L).toString(), nelem) as Int) else 0

public actual fun mmapobj(fd: CInt, flags: CUint, storage: COpaquePointer?, elements: COpaquePointer?, arg: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_mmapobj(fd, flags.toInt(), (storage?.value ?: 0L).toString(), (elements?.value ?: 0L).toString(), (arg?.value ?: 0L).toString()) as Int) else 0

public actual fun meminfo(inaddr: COpaquePointer?, addrCount: CInt, infoReq: COpaquePointer?, infoCount: CInt, outdata: COpaquePointer?, validity: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_meminfo((inaddr?.value ?: 0L).toString(), addrCount, (infoReq?.value ?: 0L).toString(), infoCount, (outdata?.value ?: 0L).toString(), (validity?.value ?: 0L).toString()) as Int) else 0

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_strsep((string?.value ?: 0L).toString(), delim) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getisax(array: COpaquePointer?, n: CUint): CUint =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getisax((array?.value ?: 0L).toString(), n.toInt()) as Int).toUInt() else 0u

public actual fun backtrace(buffer: COpaquePointer?, size: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_backtrace((buffer?.value ?: 0L).toString(), size) as Int) else 0

public actual fun backtraceSymbols(buffer: COpaquePointer?, size: CInt): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_backtraceSymbols((buffer?.value ?: 0L).toString(), size) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, size: CInt, fd: CInt) {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_backtraceSymbolsFd((buffer?.value ?: 0L).toString(), size, fd)
    }
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_getoptLong(argc, (argv?.value ?: 0L).toString(), optstring, (longopts?.value ?: 0L).toString(), (longindex?.value ?: 0L).toString()) as Int) else 0

public actual fun sync() {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_sync()
    }
}

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_aioCancel(fd, (aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_aioError((aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_aioFsync(op, (aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_aioRead((aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_aioReturn((aiocbp?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_aioSuspend((aiocbList?.value ?: 0L).toString(), nitems, (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun aioWaitn(aiocbList: COpaquePointer?, nent: CUint, nwait: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_aioWaitn((aiocbList?.value ?: 0L).toString(), nent.toInt(), (nwait?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_aioWrite((aiocbp?.value ?: 0L).toString()) as Int) else 0

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_lioListio(mode, (aiocbList?.value ?: 0L).toString(), nitems, (sevp?.value ?: 0L).toString()) as Int) else 0

public actual fun major(version: CInt, devnum: DevT): MajorT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_major(version, devnum.toString()) as Int).toUInt() else 0u

public actual fun minor(version: CInt, devnum: DevT): MinorT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_minor(version, devnum.toString()) as Int).toUInt() else 0u

public actual fun makedev(version: CInt, majdev: MajorT, mindev: MinorT): DevT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_makedev(version, majdev.toInt(), mindev.toInt()) as String).toULong() else 0uL

public actual fun arc4random(): UInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_arc4random() as Int).toUInt() else 0u

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
    if (_unixSolarishNapiAddon != null) {
        _unixSolarishNapiAddon.libc_unix_solarish_arc4randomBuf((buf?.value ?: 0L).toString(), nbytes.toString())
    }
}

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_arc4randomUniform(upperBound.toInt()) as Int).toUInt() else 0u

public actual fun secureGetenv(name: String?): COpaquePointer? =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_secureGetenv(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_strftime((s?.value ?: 0L).toString(), maxsize.toString(), format, (timeptr?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun strftimeL(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?, loc: LocaleT): SizeT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_strftimeL((s?.value ?: 0L).toString(), maxsize.toString(), format, (timeptr?.value ?: 0L).toString(), (loc?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun sendfile(outFd: CInt, inFd: CInt, off: COpaquePointer?, len: SizeT): SsizeT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_sendfile(outFd, inFd, (off?.value ?: 0L).toString(), len.toString()) as String).toLong() else 0L

public actual fun sendfilev(fildes: CInt, vec: COpaquePointer?, sfvcnt: CInt, xferred: COpaquePointer?): SsizeT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_sendfilev(fildes, (vec?.value ?: 0L).toString(), sfvcnt, (xferred?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun lgrpInit(view: LgrpViewT): LgrpCookieT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_lgrpInit(view.toInt()) as String).toULong() else 0uL

public actual fun lgrpFini(cookie: LgrpCookieT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_lgrpFini(cookie.toString()) as Int) else 0

public actual fun lgrpAffinityGet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT): LgrpAffinityT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_lgrpAffinityGet(idtype.toInt(), id, lgrp) as Int) else 0

public actual fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_lgrpAffinitySet(idtype.toInt(), id, lgrp, aff) as Int) else 0

public actual fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: COpaquePointer?, count: CUint, content: LgrpContentT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_lgrpCpus(cookie.toString(), lgrp, (cpuids?.value ?: 0L).toString(), count.toInt(), content.toInt()) as Int) else 0

public actual fun lgrpMemSize(cookie: LgrpCookieT, lgrp: LgrpIdT, tpe: LgrpMemSizeFlagT, content: LgrpContentT): LgrpMemSizeT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_lgrpMemSize(cookie.toString(), lgrp, tpe.toInt(), content.toInt()) as String).toLong() else 0L

public actual fun lgrpNlgrps(cookie: LgrpCookieT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_lgrpNlgrps(cookie.toString()) as Int) else 0

public actual fun lgrpView(cookie: LgrpCookieT): LgrpViewT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_lgrpView(cookie.toString()) as Int).toUInt() else 0u

public actual fun lgrpHome(idtype: IdtypeT, id: IdT): LgrpIdT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_lgrpHome(idtype.toInt(), id) as Int) else 0

public actual fun lgrpVersion(version: CInt): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_lgrpVersion(version) as Int) else 0

public actual fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: COpaquePointer?, count: CUint, tpe: LgrpRsrcT): CInt =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_lgrpResources(cookie.toString(), lgrp, (lgrps?.value ?: 0L).toString(), count.toInt(), tpe) as Int) else 0

public actual fun lgrpRoot(cookie: LgrpCookieT): LgrpIdT =
    if (_unixSolarishNapiAddon != null) (_unixSolarishNapiAddon.libc_unix_solarish_lgrpRoot(cookie.toString()) as Int) else 0
