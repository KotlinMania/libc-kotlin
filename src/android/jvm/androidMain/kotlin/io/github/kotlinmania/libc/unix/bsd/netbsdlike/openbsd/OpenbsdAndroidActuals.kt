@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object UnixBsdNetbsdlikeOpenbsdJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_settimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_pledge(promises: String?, execpromises: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_unveil(path: String?, permissions: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_strtonum(nptr: String?, minval: Long, maxval: Long, errstr: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_dup3(src: Int, dst: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_chflags(path: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_fchflags(fd: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_chflagsat(fd: Int, path: String?, flags: Int, atflag: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_dirfd(dirp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_getresgid(rgid: Long, egid: Long, sgid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_getresuid(ruid: Long, euid: Long, suid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_kevent(kq: Int, changelist: Long, nchanges: Int, eventlist: Long, nevents: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_getthrid(): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_pthreadMainNp(): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_pthreadGetNameNp(tid: Long, name: Long, len: Long)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_pthreadSetNameNp(tid: Long, name: String?)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_pthreadStacksegNp(thread: Long, sinfo: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_setresgid(rgid: Short, egid: Short, sgid: Short): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_setresuid(ruid: Short, euid: Short, suid: Short): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_ptrace(request: Int, pid: Int, addr: Long, data: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_utrace(label: String?, addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_dlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_uselocale(loc: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_freelocale(loc: Long)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_newlocale(mask: Int, locale: String?, base: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_duplocale(base: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_explicitBzero(s: Long, len: Long)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_freezero(ptr: Long, size: Long)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_mallocConceal(size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_callocConceal(nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_srand48Deterministic(seed: Long)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_seed48Deterministic(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_lcong48Deterministic(p: Long)

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_lsearch(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_lfind(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_hcreate(nelt: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_hdestroy()

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_futex(uaddr: Long, op: Int, value: Int, timeout: Long, uaddr2: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_mimmutable(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_reboot(mode: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_statfs(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_fstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_getmntinfo(mntbufp: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_getfsstat(buf: Long, bufsize: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_elfAuxInfo(aux: Int, buf: Long, buflen: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_backtrace(addrlist: Long, len: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_backtraceSymbols(addrlist: Long, len: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_backtraceSymbolsFd(addrlist: Long, len: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_openbsd_backtraceSymbolsFmt(addrlist: Long, len: Long, fmt: String?): Long
}

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun settimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_settimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun pledge(promises: String?, execpromises: String?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_pledge(promises, execpromises)

public actual fun unveil(path: String?, permissions: String?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_unveil(path, permissions)

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_strtonum(nptr, minval, maxval, (errstr?.value ?: 0L))

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_dup3(src, dst, flags)

public actual fun chflags(path: String?, flags: CUint): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_chflags(path, flags.toInt())

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_fchflags(fd, flags.toInt())

public actual fun chflagsat(fd: CInt, path: String?, flags: CUint, atflag: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_chflagsat(fd, path, flags.toInt(), atflag)

public actual fun dirfd(dirp: DIR?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_dirfd((dirp?.handle ?: 0L))

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_getnameinfo((sa?.value ?: 0L), salen.toInt(), (host?.value ?: 0L), hostlen.toLong(), (serv?.value ?: 0L), servlen.toLong(), flags)

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_getresgid((rgid?.value ?: 0L), (egid?.value ?: 0L), (sgid?.value ?: 0L))

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_getresuid((ruid?.value ?: 0L), (euid?.value ?: 0L), (suid?.value ?: 0L))

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_kevent(kq, (changelist?.value ?: 0L), nchanges, (eventlist?.value ?: 0L), nevents, (timeout?.value ?: 0L))

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun getthrid(): PidT =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_getthrid()

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_pthreadAttrGetguardsize((attr?.value ?: 0L), (guardsize?.value ?: 0L))

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_pthreadAttrSetguardsize((attr?.value ?: 0L), guardsize.toLong())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_pthreadAttrGetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun pthreadMainNp(): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_pthreadMainNp()

public actual fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_pthreadGetNameNp(tid.toLong(), (name?.value ?: 0L), len.toLong())
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_pthreadSetNameNp(tid.toLong(), name)
}

public actual fun pthreadStacksegNp(thread: PthreadT, sinfo: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_pthreadStacksegNp(thread.toLong(), (sinfo?.value ?: 0L))

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_openpty((amaster?.value ?: 0L), (aslave?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_forkpty((amaster?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_sysctl((name?.value ?: 0L), namelen.toInt(), (oldp?.value ?: 0L), (oldlenp?.value ?: 0L), (newp?.value ?: 0L), newlen.toLong())

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_setresgid(rgid.toShort(), egid.toShort(), sgid.toShort())

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_setresuid(ruid.toShort(), euid.toShort(), suid.toShort())

public actual fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_ptrace(request, pid, (addr?.value ?: 0L), data)

public actual fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_utrace(label, (addr?.value ?: 0L), len.toLong())

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_memmem((haystack?.value ?: 0L), haystacklen.toLong(), (needle?.value ?: 0L), needlelen.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlIteratePhdr(callback: FnCallback?, data: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_dlIteratePhdr(0L, (data?.value ?: 0L))

public actual fun uselocale(loc: LocaleT): LocaleT =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_uselocale((loc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun freelocale(loc: LocaleT) {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_freelocale((loc?.value ?: 0L))
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_newlocale(mask, locale, (base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun duplocale(base: LocaleT): LocaleT =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_duplocale((base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_explicitBzero((s?.value ?: 0L), len.toLong())
}

public actual fun setproctitle(fmt: String?, vararg variadicArgs: Long) {
}

public actual fun freezero(ptr: COpaquePointer?, size: SizeT) {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_freezero((ptr?.value ?: 0L), size.toLong())
}

public actual fun mallocConceal(size: SizeT): COpaquePointer? =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_mallocConceal(size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun callocConceal(nmemb: SizeT, size: SizeT): COpaquePointer? =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_callocConceal(nmemb.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun srand48Deterministic(seed: CLong) {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_srand48Deterministic(seed)
}

public actual fun seed48Deterministic(xseed: COpaquePointer?): COpaquePointer? =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_seed48Deterministic((xseed?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lcong48Deterministic(p: COpaquePointer?) {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_lcong48Deterministic((p?.value ?: 0L))
}

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: FnCallback1?): COpaquePointer? =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_lsearch((key?.value ?: 0L), (base?.value ?: 0L), (nelp?.value ?: 0L), width.toLong(), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: FnCallback1?): COpaquePointer? =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_lfind((key?.value ?: 0L), (base?.value ?: 0L), (nelp?.value ?: 0L), width.toLong(), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hcreate(nelt: SizeT): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_hcreate(nelt.toLong())

public actual fun hdestroy() {
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_hdestroy()
}

public actual fun hsearch(entry: Entry, action: Action): COpaquePointer? =
    null

public actual fun futex(uaddr: COpaquePointer?, op: CInt, value: CInt, timeout: COpaquePointer?, uaddr2: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_futex((uaddr?.value ?: 0L), op, value, (timeout?.value ?: 0L), (uaddr2?.value ?: 0L))

public actual fun mimmutable(addr: COpaquePointer?, len: SizeT): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_mimmutable((addr?.value ?: 0L), len.toLong())

public actual fun reboot(mode: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_reboot(mode)

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_statfs(path, (buf?.value ?: 0L))

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_fstatfs(fd, (buf?.value ?: 0L))

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_getmntinfo((mntbufp?.value ?: 0L), flags)

public actual fun getfsstat(buf: COpaquePointer?, bufsize: SizeT, flags: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_getfsstat((buf?.value ?: 0L), bufsize.toLong(), flags)

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_elfAuxInfo(aux, (buf?.value ?: 0L), buflen)

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_backtrace((addrlist?.value ?: 0L), len.toLong()).toULong()

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_backtraceSymbols((addrlist?.value ?: 0L), len.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_backtraceSymbolsFd((addrlist?.value ?: 0L), len.toLong(), fd)

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer? =
    UnixBsdNetbsdlikeOpenbsdJniBridge.libc_unix_bsd_netbsdlike_openbsd_backtraceSymbolsFmt((addrlist?.value ?: 0L), len.toLong(), fmt).let { if (it == 0L) null else COpaquePointer(it) }
