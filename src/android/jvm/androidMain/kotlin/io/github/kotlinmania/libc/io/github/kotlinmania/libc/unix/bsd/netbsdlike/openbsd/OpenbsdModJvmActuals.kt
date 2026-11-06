package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.COpaquePointer

internal object OpenbsdModRawLibc {
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun settimeofday(tp: Long, tz: Long): Int
    external fun pledge(promises: String?, execpromises: String?): Int
    external fun unveil(path: String?, permissions: String?): Int
    external fun strtonum(nptr: String?, minval: Long, maxval: Long, errstr: Long): Long
    external fun dup3(src: Int, dst: Int, flags: Int): Int
    external fun chflags(path: String?, flags: Int): Int
    external fun fchflags(fd: Int, flags: Int): Int
    external fun chflagsat(fd: Int, path: String?, flags: Int, atflag: Int): Int
    external fun dirfd(dirp: Long): Int
    external fun getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int
    external fun getresgid(rgid: Long, egid: Long, sgid: Long): Int
    external fun getresuid(ruid: Long, euid: Long, suid: Long): Int
    external fun kevent(kq: Int, changelist: Long, nchanges: Int, eventlist: Long, nevents: Int, timeout: Long): Int
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun getthrid(): Int
    external fun pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun pthreadMainNp(): Int
    external fun pthreadGetNameNp(tid: Long, name: Long, len: Long)
    external fun pthreadSetNameNp(tid: Long, name: String?)
    external fun pthreadStacksegNp(thread: Long, sinfo: Long): Int
    external fun openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int
    external fun forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int
    external fun sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
    external fun setresgid(rgid: Int, egid: Int, sgid: Int): Int
    external fun setresuid(ruid: Int, euid: Int, suid: Int): Int
    external fun ptrace(request: Int, pid: Int, addr: Long, data: Int): Int
    external fun utrace(label: String?, addr: Long, len: Long): Int
    external fun memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long?
    external fun dlIteratePhdr(callback: Long, data: Long): Int
    external fun uselocale(loc: Long): Long
    external fun freelocale(loc: Long)
    external fun newlocale(mask: Int, locale: String?, base: Long): Long
    external fun duplocale(base: Long): Long
    external fun explicitBzero(s: Long, len: Long)
    external fun freezero(ptr: Long, size: Long)
    external fun mallocConceal(size: Long): Long?
    external fun callocConceal(nmemb: Long, size: Long): Long?
    external fun srand48Deterministic(seed: Long)
    external fun seed48Deterministic(xseed: Long): Long?
    external fun lcong48Deterministic(p: Long)
    external fun lsearch(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long?
    external fun lfind(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long?
    external fun hcreate(nelt: Long): Int
    external fun hdestroy()
    external fun hsearch(entry: Long, action: Long): Long?
    external fun futex(uaddr: Long, op: Int, value: Int, timeout: Long, uaddr2: Long): Int
    external fun mimmutable(addr: Long, len: Long): Int
    external fun reboot(mode: Int): Int
    external fun statfs(path: String?, buf: Long): Int
    external fun fstatfs(fd: Int, buf: Long): Int
    external fun getmntinfo(mntbufp: Long, flags: Int): Int
    external fun getfsstat(buf: Long, bufsize: Long, flags: Int): Int
    external fun elfAuxInfo(aux: Int, buf: Long, buflen: Int): Int
    external fun backtrace(addrlist: Long, len: Long): Long
    external fun backtraceSymbols(addrlist: Long, len: Long): Long?
    external fun backtraceSymbolsFd(addrlist: Long, len: Long, fd: Int): Int
    external fun backtraceSymbolsFmt(addrlist: Long, len: Long, fmt: String?): Long?
}

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    OpenbsdModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun settimeofday(tp: Timeval?, tz: Timezone?): CInt =
    OpenbsdModRawLibc.settimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun pledge(promises: String?, execpromises: String?): CInt =
    OpenbsdModRawLibc.pledge(promises, execpromises)

public actual fun unveil(path: String?, permissions: String?): CInt =
    OpenbsdModRawLibc.unveil(path, permissions)

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    OpenbsdModRawLibc.strtonum(nptr, minval, maxval, errstr?.value ?: 0L)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    OpenbsdModRawLibc.dup3(src, dst, flags)

public actual fun chflags(path: String?, flags: CUint): CInt =
    OpenbsdModRawLibc.chflags(path, flags)

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    OpenbsdModRawLibc.fchflags(fd, flags)

public actual fun chflagsat(fd: CInt, path: String?, flags: CUint, atflag: CInt): CInt =
    OpenbsdModRawLibc.chflagsat(fd, path, flags, atflag)

public actual fun dirfd(dirp: DIR?): CInt =
    OpenbsdModRawLibc.dirfd(dirp?.toLong() ?: 0L)

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    OpenbsdModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    OpenbsdModRawLibc.getresgid(rgid?.toLong() ?: 0L, egid?.toLong() ?: 0L, sgid?.toLong() ?: 0L)

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    OpenbsdModRawLibc.getresuid(ruid?.toLong() ?: 0L, euid?.toLong() ?: 0L, suid?.toLong() ?: 0L)

public actual fun kevent(kq: CInt, changelist: io.github.kotlinmania.libc.Kevent?, nchanges: CInt, eventlist: io.github.kotlinmania.libc.Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    OpenbsdModRawLibc.kevent(kq, changelist?.toLong() ?: 0L, nchanges, eventlist?.toLong() ?: 0L, nevents, timeout?.toLong() ?: 0L)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    OpenbsdModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun getthrid(): PidT =
    OpenbsdModRawLibc.getthrid()

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt =
    OpenbsdModRawLibc.pthreadAttrGetguardsize(attr?.value ?: 0L, guardsize?.toLong() ?: 0L)

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    OpenbsdModRawLibc.pthreadAttrSetguardsize(attr?.value ?: 0L, guardsize)

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    OpenbsdModRawLibc.pthreadAttrGetstack(attr?.value ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun pthreadMainNp(): CInt =
    OpenbsdModRawLibc.pthreadMainNp()

public actual fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
    OpenbsdModRawLibc.pthreadGetNameNp(tid, name?.value ?: 0L, len)
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    OpenbsdModRawLibc.pthreadSetNameNp(tid, name)
}

public actual fun pthreadStacksegNp(thread: PthreadT, sinfo: StackT?): CInt =
    OpenbsdModRawLibc.pthreadStacksegNp(thread, sinfo?.toLong() ?: 0L)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    OpenbsdModRawLibc.openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    OpenbsdModRawLibc.forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    OpenbsdModRawLibc.sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    OpenbsdModRawLibc.setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    OpenbsdModRawLibc.setresuid(ruid, euid, suid)

public actual fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt =
    OpenbsdModRawLibc.ptrace(request, pid, addr, data)

public actual fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt =
    OpenbsdModRawLibc.utrace(label, addr?.value ?: 0L, len)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    OpenbsdModRawLibc.memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    OpenbsdModRawLibc.dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)

public actual fun uselocale(loc: LocaleT): LocaleT =
    OpenbsdModRawLibc.uselocale(loc)

public actual fun freelocale(loc: LocaleT) {
    OpenbsdModRawLibc.freelocale(loc)
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    OpenbsdModRawLibc.newlocale(mask, locale, base)

public actual fun duplocale(base: LocaleT): LocaleT =
    OpenbsdModRawLibc.duplocale(base)

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    OpenbsdModRawLibc.explicitBzero(s?.value ?: 0L, len)
}

public actual fun freezero(ptr: COpaquePointer?, size: SizeT) {
    OpenbsdModRawLibc.freezero(ptr?.value ?: 0L, size)
}

public actual fun mallocConceal(size: SizeT): COpaquePointer? =
    OpenbsdModRawLibc.mallocConceal(size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun callocConceal(nmemb: SizeT, size: SizeT): COpaquePointer? =
    OpenbsdModRawLibc.callocConceal(nmemb, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun srand48Deterministic(seed: CLong) {
    OpenbsdModRawLibc.srand48Deterministic(seed)
}

public actual fun seed48Deterministic(xseed: CUshort?): CUshort? =
    OpenbsdModRawLibc.seed48Deterministic(xseed?.toLong() ?: 0L)

public actual fun lcong48Deterministic(p: CUshort?) {
    OpenbsdModRawLibc.lcong48Deterministic(p?.toLong() ?: 0L)
}

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    OpenbsdModRawLibc.lsearch(key?.value ?: 0L, base?.value ?: 0L, nelp?.toLong() ?: 0L, width, compar?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    OpenbsdModRawLibc.lfind(key?.value ?: 0L, base?.value ?: 0L, nelp?.toLong() ?: 0L, width, compar?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hcreate(nelt: SizeT): CInt =
    OpenbsdModRawLibc.hcreate(nelt)

public actual fun hdestroy() {
    OpenbsdModRawLibc.hdestroy()
}

public actual fun hsearch(entry: io.github.kotlinmania.libc.Entry, action: io.github.kotlinmania.libc.Action): Entry? =
    OpenbsdModRawLibc.hsearch(entry, action)

public actual fun futex(uaddr: UInt?, op: CInt, value: CInt, timeout: Timespec?, uaddr2: UInt?): CInt =
    OpenbsdModRawLibc.futex(uaddr?.toLong() ?: 0L, op, value, timeout?.toLong() ?: 0L, uaddr2?.toLong() ?: 0L)

public actual fun mimmutable(addr: COpaquePointer?, len: SizeT): CInt =
    OpenbsdModRawLibc.mimmutable(addr?.value ?: 0L, len)

public actual fun reboot(mode: CInt): CInt =
    OpenbsdModRawLibc.reboot(mode)

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    OpenbsdModRawLibc.statfs(path, buf?.toLong() ?: 0L)

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    OpenbsdModRawLibc.fstatfs(fd, buf?.toLong() ?: 0L)

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    OpenbsdModRawLibc.getmntinfo(mntbufp?.value ?: 0L, flags)

public actual fun getfsstat(buf: Statfs?, bufsize: SizeT, flags: CInt): CInt =
    OpenbsdModRawLibc.getfsstat(buf?.toLong() ?: 0L, bufsize, flags)

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    OpenbsdModRawLibc.elfAuxInfo(aux, buf?.value ?: 0L, buflen)

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    OpenbsdModRawLibc.backtrace(addrlist?.value ?: 0L, len)

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    OpenbsdModRawLibc.backtraceSymbols(addrlist?.value ?: 0L, len).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    OpenbsdModRawLibc.backtraceSymbolsFd(addrlist?.value ?: 0L, len, fd)

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer? =
    OpenbsdModRawLibc.backtraceSymbolsFmt(addrlist?.value ?: 0L, len, fmt).let { if (it == 0L) null else COpaquePointer(it) }
