package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.COpaquePointer

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun settimeofday(tp: Timeval?, tz: Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').settimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun pledge(promises: String?, execpromises: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pledge(promises, execpromises)") as CInt

public actual fun unveil(path: String?, permissions: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').unveil(path, permissions)") as CInt

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').strtonum(nptr, minval, maxval, errstr?.value ?: 0L)") as CLonglong

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dup3(src, dst, flags)") as CInt

public actual fun chflags(path: String?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').chflags(path, flags)") as CInt

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').fchflags(fd, flags)") as CInt

public actual fun chflagsat(fd: CInt, path: String?, flags: CUint, atflag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').chflagsat(fd, path, flags, atflag)") as CInt

public actual fun dirfd(dirp: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dirfd(dirp?.toLong() ?: 0L)") as CInt

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getresgid(rgid?.toLong() ?: 0L, egid?.toLong() ?: 0L, sgid?.toLong() ?: 0L)") as CInt

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getresuid(ruid?.toLong() ?: 0L, euid?.toLong() ?: 0L, suid?.toLong() ?: 0L)") as CInt

public actual fun kevent(kq: CInt, changelist: io.github.kotlinmania.libc.Kevent?, nchanges: CInt, eventlist: io.github.kotlinmania.libc.Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').kevent(kq, changelist?.toLong() ?: 0L, nchanges, eventlist?.toLong() ?: 0L, nevents, timeout?.toLong() ?: 0L)") as CInt

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun getthrid(): PidT =
    js("require('@kotlinmania/libc-native-bindings').getthrid()") as PidT

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetguardsize(attr?.value ?: 0L, guardsize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetguardsize(attr?.value ?: 0L, guardsize)") as CInt

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstack(attr?.value ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)") as CInt

public actual fun pthreadMainNp(): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMainNp()") as CInt

public actual fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').pthreadGetNameNp(tid, name?.value ?: 0L, len)")
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    js("require('@kotlinmania/libc-native-bindings').pthreadSetNameNp(tid, name)")
}

public actual fun pthreadStacksegNp(thread: PthreadT, sinfo: StackT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadStacksegNp(thread, sinfo?.toLong() ?: 0L)") as CInt

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    js("require('@kotlinmania/libc-native-bindings').openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as CInt

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    js("require('@kotlinmania/libc-native-bindings').forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as PidT

public actual fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)") as CInt

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setresgid(rgid, egid, sgid)") as CInt

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setresuid(ruid, euid, suid)") as CInt

public actual fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').ptrace(request, pid, addr, data)") as CInt

public actual fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').utrace(label, addr?.value ?: 0L, len)") as CInt

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)") as CInt

public actual fun uselocale(loc: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').uselocale(loc)") as LocaleT

public actual fun freelocale(loc: LocaleT) {
    js("require('@kotlinmania/libc-native-bindings').freelocale(loc)")
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').newlocale(mask, locale, base)") as LocaleT

public actual fun duplocale(base: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').duplocale(base)") as LocaleT

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').explicitBzero(s?.value ?: 0L, len)")
}

public actual fun freezero(ptr: COpaquePointer?, size: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').freezero(ptr?.value ?: 0L, size)")
}

public actual fun mallocConceal(size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mallocConceal(size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun callocConceal(nmemb: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').callocConceal(nmemb, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun srand48Deterministic(seed: CLong) {
    js("require('@kotlinmania/libc-native-bindings').srand48Deterministic(seed)")
}

public actual fun seed48Deterministic(xseed: CUshort?): CUshort? =
    js("require('@kotlinmania/libc-native-bindings').seed48Deterministic(xseed?.toLong() ?: 0L)") as CUshort?

public actual fun lcong48Deterministic(p: CUshort?) {
    js("require('@kotlinmania/libc-native-bindings').lcong48Deterministic(p?.toLong() ?: 0L)")
}

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').lsearch(key?.value ?: 0L, base?.value ?: 0L, nelp?.toLong() ?: 0L, width, compar?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').lfind(key?.value ?: 0L, base?.value ?: 0L, nelp?.toLong() ?: 0L, width, compar?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hcreate(nelt: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').hcreate(nelt)") as CInt

public actual fun hdestroy() {
    js("require('@kotlinmania/libc-native-bindings').hdestroy()")
}

public actual fun hsearch(entry: io.github.kotlinmania.libc.Entry, action: io.github.kotlinmania.libc.Action): Entry? =
    js("require('@kotlinmania/libc-native-bindings').hsearch(entry, action)") as Entry?

public actual fun futex(uaddr: UInt?, op: CInt, value: CInt, timeout: Timespec?, uaddr2: UInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futex(uaddr?.toLong() ?: 0L, op, value, timeout?.toLong() ?: 0L, uaddr2?.toLong() ?: 0L)") as CInt

public actual fun mimmutable(addr: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mimmutable(addr?.value ?: 0L, len)") as CInt

public actual fun reboot(mode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').reboot(mode)") as CInt

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statfs(path, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatfs(fd, buf?.toLong() ?: 0L)") as CInt

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getmntinfo(mntbufp?.value ?: 0L, flags)") as CInt

public actual fun getfsstat(buf: Statfs?, bufsize: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getfsstat(buf?.toLong() ?: 0L, bufsize, flags)") as CInt

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').elfAuxInfo(aux, buf?.value ?: 0L, buflen)") as CInt

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').backtrace(addrlist?.value ?: 0L, len)") as SizeT

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').backtraceSymbols(addrlist?.value ?: 0L, len)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').backtraceSymbolsFd(addrlist?.value ?: 0L, len, fd)") as CInt

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').backtraceSymbolsFmt(addrlist?.value ?: 0L, len, fmt)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }
