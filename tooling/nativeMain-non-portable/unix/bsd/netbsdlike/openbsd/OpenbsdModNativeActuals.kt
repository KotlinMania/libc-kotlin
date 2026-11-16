@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun settimeofday(tp: Timeval?, tz: Timezone?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_settimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun pledge(promises: String?, execpromises: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_pledge(promises, execpromises)

public actual fun unveil(path: String?, permissions: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_unveil(path, permissions)

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_strtonum(nptr, minval, maxval, errstr?.value?.toCPointer<ByteVar>())

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_dup3(src, dst, flags)

public actual fun chflags(path: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_chflags(path, flags)

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_fchflags(fd, flags)

public actual fun chflagsat(fd: CInt, path: String?, flags: CUint, atflag: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_chflagsat(fd, path, flags, atflag)

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_getresgid(rgid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>(), sgid?.value?.toCPointer<ByteVar>())

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_getresuid(ruid?.value?.toCPointer<ByteVar>(), euid?.value?.toCPointer<ByteVar>(), suid?.value?.toCPointer<ByteVar>())

public actual fun kevent(kq: CInt, changelist: io.github.kotlinmania.libc.Kevent?, nchanges: CInt, eventlist: io.github.kotlinmania.libc.Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_kevent(kq, changelist?.value?.toCPointer<ByteVar>(), nchanges, eventlist?.value?.toCPointer<ByteVar>(), nevents, timeout?.value?.toCPointer<ByteVar>())

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun getthrid(): PidT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_getthrid()

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_pthread_attr_getguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_pthread_attr_setguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_pthread_attr_getstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadMainNp(): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_pthread_main_np()

public actual fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_pthread_get_name_np(tid.toInt(), name?.value?.toCPointer<ByteVar>(), len)
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_pthread_set_name_np(tid.toInt(), name)
}

public actual fun pthreadStacksegNp(thread: PthreadT, sinfo: StackT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_pthread_stackseg_np(thread.toInt(), sinfo?.value?.toCPointer<ByteVar>())

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_sysctl(name?.value?.toCPointer<ByteVar>(), namelen, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_setresuid(ruid, euid, suid)

public actual fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_ptrace(request, pid, addr?.value?.toCPointer<ByteVar>(), data)

public actual fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_utrace(label, addr?.value?.toCPointer<ByteVar>(), len)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_dl_iterate_phdr(callback?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun uselocale(loc: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_uselocale(loc.toInt())

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_freelocale(loc.toInt())
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_newlocale(mask, locale, base.toInt())

public actual fun duplocale(base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_duplocale(base.toInt())

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_explicit_bzero(s?.value?.toCPointer<ByteVar>(), len)
}

public actual fun freezero(ptr: COpaquePointer?, size: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_freezero(ptr?.value?.toCPointer<ByteVar>(), size)
}

public actual fun mallocConceal(size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_malloc_conceal(size)?.let { COpaquePointer(it.toLong()) }

public actual fun callocConceal(nmemb: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_calloc_conceal(nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun srand48Deterministic(seed: CLong) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_srand48deterministic(seed)
}

public actual fun seed48Deterministic(xseed: CUshort?): CUshort? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_seed48deterministic(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lcong48Deterministic(p: CUshort?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_lcong48deterministic(p?.value?.toCPointer<ByteVar>())
}

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_lsearch(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nelp?.value?.toCPointer<ByteVar>(), width, compar?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_lfind(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nelp?.value?.toCPointer<ByteVar>(), width, compar?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hcreate(nelt: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_hcreate(nelt)

public actual fun hdestroy() {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_hdestroy()
}

public actual fun hsearch(entry: io.github.kotlinmania.libc.Entry, action: io.github.kotlinmania.libc.Action): Entry? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_hsearch(entry.toInt(), action)?.let { COpaquePointer(it.toLong()) }

public actual fun futex(uaddr: UInt?, op: CInt, value: CInt, timeout: Timespec?, uaddr2: UInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_futex(uaddr?.value?.toCPointer<ByteVar>(), op, value, timeout?.value?.toCPointer<ByteVar>(), uaddr2?.value?.toCPointer<ByteVar>())

public actual fun mimmutable(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_mimmutable(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun reboot(mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_reboot(mode)

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_getmntinfo(mntbufp?.value?.toCPointer<ByteVar>(), flags)

public actual fun getfsstat(buf: Statfs?, bufsize: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_getfsstat(buf?.value?.toCPointer<ByteVar>(), bufsize, flags)

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_elf_aux_info(aux, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_backtrace(addrlist?.value?.toCPointer<ByteVar>(), len)

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_backtrace_symbols(addrlist?.value?.toCPointer<ByteVar>(), len)?.let { COpaquePointer(it.toLong()) }

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_backtrace_symbols_fd(addrlist?.value?.toCPointer<ByteVar>(), len, fd)

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_openbsd_mod_backtrace_symbols_fmt(addrlist?.value?.toCPointer<ByteVar>(), len, fmt)?.let { COpaquePointer(it.toLong()) }
