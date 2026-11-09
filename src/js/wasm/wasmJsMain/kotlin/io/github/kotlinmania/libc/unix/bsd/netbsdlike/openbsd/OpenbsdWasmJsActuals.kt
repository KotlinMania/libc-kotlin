@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun settimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun pledge(promises: String?, execpromises: String?): CInt =
    0

public actual fun unveil(path: String?, permissions: String?): CInt =
    0

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    0L

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    0

public actual fun chflags(path: String?, flags: CUint): CInt =
    0

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    0

public actual fun chflagsat(fd: CInt, path: String?, flags: CUint, atflag: CInt): CInt =
    0

public actual fun dirfd(dirp: DIR?): CInt =
    0

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    0

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    0

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    0

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    0

public actual fun getthrid(): PidT =
    0

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    0

public actual fun pthreadMainNp(): CInt =
    0

public actual fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
}

public actual fun pthreadStacksegNp(thread: PthreadT, sinfo: COpaquePointer?): CInt =
    0

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    0

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    0

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    0

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    0

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    0

public actual fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt =
    0

public actual fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    null

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    0

public actual fun uselocale(loc: LocaleT): LocaleT =
    null

public actual fun freelocale(loc: LocaleT) {
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    null

public actual fun duplocale(base: LocaleT): LocaleT =
    null

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
}

public actual fun setproctitle(fmt: String?) {
}

public actual fun freezero(ptr: COpaquePointer?, size: SizeT) {
}

public actual fun mallocConceal(size: SizeT): COpaquePointer? =
    null

public actual fun callocConceal(nmemb: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun srand48Deterministic(seed: CLong) {
}

public actual fun seed48Deterministic(xseed: COpaquePointer?): COpaquePointer? =
    null

public actual fun lcong48Deterministic(p: COpaquePointer?) {
}

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    null

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    null

public actual fun hcreate(nelt: SizeT): CInt =
    0

public actual fun hdestroy() {
}

public actual fun hsearch(entry: Entry, action: Action): COpaquePointer? =
    null

public actual fun futex(uaddr: COpaquePointer?, op: CInt, value: CInt, timeout: COpaquePointer?, uaddr2: COpaquePointer?): CInt =
    0

public actual fun mimmutable(addr: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun reboot(mode: CInt): CInt =
    0

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun getfsstat(buf: COpaquePointer?, bufsize: SizeT, flags: CInt): CInt =
    0

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    0

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    0uL

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    null

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    0

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer? =
    null
