@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT

private val _unixBsdNetbsdlikeOpenbsdNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun settimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_settimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun pledge(promises: String?, execpromises: String?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_pledge(promises, execpromises) as Int) else 0

public actual fun unveil(path: String?, permissions: String?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_unveil(path, permissions) as Int) else 0

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_strtonum(nptr, minval.toString(), maxval.toString(), (errstr?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_dup3(src, dst, flags) as Int) else 0

public actual fun chflags(path: String?, flags: CUint): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_chflags(path, flags.toInt()) as Int) else 0

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_fchflags(fd, flags.toInt()) as Int) else 0

public actual fun chflagsat(fd: CInt, path: String?, flags: CUint, atflag: CInt): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_chflagsat(fd, path, flags.toInt(), atflag) as Int) else 0

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_dirfd((dirp?.handle ?: 0L).toString()) as Int) else 0

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toString(), (serv?.value ?: 0L).toString(), servlen.toString(), flags) as Int) else 0

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_getresgid((rgid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString(), (sgid?.value ?: 0L).toString()) as Int) else 0

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_getresuid((ruid?.value ?: 0L).toString(), (euid?.value ?: 0L).toString(), (suid?.value ?: 0L).toString()) as Int) else 0

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_kevent(kq, (changelist?.value ?: 0L).toString(), nchanges, (eventlist?.value ?: 0L).toString(), nevents, (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else 0

public actual fun getthrid(): PidT =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_getthrid() as Int) else 0

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_pthreadAttrSetguardsize((attr?.value ?: 0L).toString(), guardsize.toString()) as Int) else 0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMainNp(): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_pthreadMainNp() as Int) else 0

public actual fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        _unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_pthreadGetNameNp(tid.toLong().toString(), (name?.value ?: 0L).toString(), len.toString())
    }
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        _unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_pthreadSetNameNp(tid.toLong().toString(), name)
    }
}

public actual fun pthreadStacksegNp(thread: PthreadT, sinfo: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_pthreadStacksegNp(thread.toLong().toString(), (sinfo?.value ?: 0L).toString()) as Int) else 0

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_sysctl((name?.value ?: 0L).toString(), namelen.toInt(), (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) as Int) else 0

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_setresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) as Int) else 0

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_setresuid(ruid.toInt(), euid.toInt(), suid.toInt()) as Int) else 0

public actual fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_ptrace(request, pid, (addr?.value ?: 0L).toString(), data) as Int) else 0

public actual fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_utrace(label, (addr?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_memmem((haystack?.value ?: 0L).toString(), haystacklen.toString(), (needle?.value ?: 0L).toString(), needlelen.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) as Int) else 0

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_uselocale(loc.toLong().toString()) as String).toLong().toULong()() else null

public actual fun freelocale(loc: LocaleT) {
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        _unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_freelocale(loc.toLong().toString())
    }
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_newlocale(mask, locale, base.toLong().toString()) as String).toLong().toULong()() else null

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_duplocale(base.toLong().toString()) as String).toLong().toULong()() else null

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        _unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_explicitBzero((s?.value ?: 0L).toString(), len.toString())
    }
}

public actual fun setproctitle(fmt: String?) {
}

public actual fun freezero(ptr: COpaquePointer?, size: SizeT) {
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        _unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_freezero((ptr?.value ?: 0L).toString(), size.toString())
    }
}

public actual fun mallocConceal(size: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_mallocConceal(size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun callocConceal(nmemb: SizeT, size: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_callocConceal(nmemb.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun srand48Deterministic(seed: CLong) {
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        _unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_srand48Deterministic(seed.toString())
    }
}

public actual fun seed48Deterministic(xseed: COpaquePointer?): COpaquePointer? =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_seed48Deterministic((xseed?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun lcong48Deterministic(p: COpaquePointer?) {
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        _unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_lcong48Deterministic((p?.value ?: 0L).toString())
    }
}

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_lsearch((key?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), (nelp?.value ?: 0L).toString(), width.toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_lfind((key?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), (nelp?.value ?: 0L).toString(), width.toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun hcreate(nelt: SizeT): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_hcreate(nelt.toString()) as Int) else 0

public actual fun hdestroy() {
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) {
        _unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_hdestroy()
    }
}

public actual fun hsearch(entry: Entry, action: Action): COpaquePointer? =
    null

public actual fun futex(uaddr: COpaquePointer?, op: CInt, value: CInt, timeout: COpaquePointer?, uaddr2: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_futex((uaddr?.value ?: 0L).toString(), op, value, (timeout?.value ?: 0L).toString(), (uaddr2?.value ?: 0L).toString()) as Int) else 0

public actual fun mimmutable(addr: COpaquePointer?, len: SizeT): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_mimmutable((addr?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun reboot(mode: CInt): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_reboot(mode) as Int) else 0

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_statfs(path, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_fstatfs(fd, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_getmntinfo((mntbufp?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun getfsstat(buf: COpaquePointer?, bufsize: SizeT, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_getfsstat((buf?.value ?: 0L).toString(), bufsize.toString(), flags) as Int) else 0

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_elfAuxInfo(aux, (buf?.value ?: 0L).toString(), buflen) as Int) else 0

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_backtrace((addrlist?.value ?: 0L).toString(), len.toString()) as String).toULong() else 0uL

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_backtraceSymbols((addrlist?.value ?: 0L).toString(), len.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_backtraceSymbolsFd((addrlist?.value ?: 0L).toString(), len.toString(), fd) as Int) else 0

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer? =
    if (_unixBsdNetbsdlikeOpenbsdNapiAddon != null) (_unixBsdNetbsdlikeOpenbsdNapiAddon.libc_unix_bsd_netbsdlike_openbsd_backtraceSymbolsFmt((addrlist?.value ?: 0L).toString(), len.toString(), fmt) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null
