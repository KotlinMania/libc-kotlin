@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun settimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_settimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun pledge(promises: String?, execpromises: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_pledge(promises, execpromises)

public actual fun unveil(path: String?, permissions: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_unveil(path, permissions)

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_strtonum(nptr, minval, maxval, errstr?.value?.toCPointer<ByteVar>())

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_dup3(src, dst, flags)

public actual fun chflags(path: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_chflags(path, flags)

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_fchflags(fd, flags)

public actual fun chflagsat(fd: CInt, path: String?, flags: CUint, atflag: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_chflagsat(fd, path, flags, atflag)

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_getresgid(rgid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>(), sgid?.value?.toCPointer<ByteVar>())

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_getresuid(ruid?.value?.toCPointer<ByteVar>(), euid?.value?.toCPointer<ByteVar>(), suid?.value?.toCPointer<ByteVar>())

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_kevent(kq, changelist?.value?.toCPointer<ByteVar>(), nchanges, eventlist?.value?.toCPointer<ByteVar>(), nevents, timeout?.value?.toCPointer<ByteVar>())

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun getthrid(): PidT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_getthrid()

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_pthreadAttrGetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_pthreadAttrSetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_pthreadAttrGetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadMainNp(): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_pthreadMainNp()

public actual fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_pthreadGetNameNp(tid.toLong().toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), len)
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_pthreadSetNameNp(tid.toLong().toCPointer<ByteVar>(), name)
}

public actual fun pthreadStacksegNp(thread: PthreadT, sinfo: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_pthreadStacksegNp(thread.toLong().toCPointer<ByteVar>(), sinfo?.value?.toCPointer<ByteVar>())

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_sysctl(name?.value?.toCPointer<ByteVar>(), namelen, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_setresuid(ruid, euid, suid)

public actual fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_ptrace(request, pid, addr?.value?.toCPointer<ByteVar>(), data)

public actual fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_utrace(label, addr?.value?.toCPointer<ByteVar>(), len)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_dlIteratePhdr(0L.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun uselocale(loc: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_uselocale(loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_freelocale(loc?.value?.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_newlocale(mask, locale, base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun duplocale(base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_duplocale(base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_explicitBzero(s?.value?.toCPointer<ByteVar>(), len)
}

public actual fun setproctitle(fmt: String?, vararg variadicArgs: Long) {
}

public actual fun freezero(ptr: COpaquePointer?, size: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_freezero(ptr?.value?.toCPointer<ByteVar>(), size)
}

public actual fun mallocConceal(size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_mallocConceal(size)?.let { COpaquePointer(it.toLong()) }

public actual fun callocConceal(nmemb: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_callocConceal(nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun srand48Deterministic(seed: CLong) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_srand48Deterministic(seed)
}

public actual fun seed48Deterministic(xseed: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_seed48Deterministic(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lcong48Deterministic(p: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_lcong48Deterministic(p?.value?.toCPointer<ByteVar>())
}

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_lsearch(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nelp?.value?.toCPointer<ByteVar>(), width, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_lfind(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nelp?.value?.toCPointer<ByteVar>(), width, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hcreate(nelt: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_hcreate(nelt)

public actual fun hdestroy() {
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_hdestroy()
}

public actual fun hsearch(entry: Entry, action: Action): COpaquePointer? =
    null

public actual fun futex(uaddr: COpaquePointer?, op: CInt, value: CInt, timeout: COpaquePointer?, uaddr2: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_futex(uaddr?.value?.toCPointer<ByteVar>(), op, value, timeout?.value?.toCPointer<ByteVar>(), uaddr2?.value?.toCPointer<ByteVar>())

public actual fun mimmutable(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_mimmutable(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun reboot(mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_reboot(mode)

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_getmntinfo(mntbufp?.value?.toCPointer<ByteVar>(), flags)

public actual fun getfsstat(buf: COpaquePointer?, bufsize: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_getfsstat(buf?.value?.toCPointer<ByteVar>(), bufsize, flags)

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_elfAuxInfo(aux, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_backtrace(addrlist?.value?.toCPointer<ByteVar>(), len)

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_backtraceSymbols(addrlist?.value?.toCPointer<ByteVar>(), len)?.let { COpaquePointer(it.toLong()) }

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_backtraceSymbolsFd(addrlist?.value?.toCPointer<ByteVar>(), len, fd)

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.cinterop.libc_unix_bsd_netbsdlike_openbsd_backtraceSymbolsFmt(addrlist?.value?.toCPointer<ByteVar>(), len, fmt)?.let { COpaquePointer(it.toLong()) }
