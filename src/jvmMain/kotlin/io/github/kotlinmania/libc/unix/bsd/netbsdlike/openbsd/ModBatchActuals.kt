// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on JVM — no C library access")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on JVM — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on JVM — no C library access")

public actual fun settimeofday(tp: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("settimeofday not available on JVM — no C library access")

public actual fun pledge(promises: String?, execpromises: String?): CInt =
    throw UnsupportedOperationException("pledge not available on JVM — no C library access")

public actual fun unveil(path: String?, permissions: String?): CInt =
    throw UnsupportedOperationException("unveil not available on JVM — no C library access")

public actual fun strtonum(nptr: String?, minval: CLongLong, maxval: CLongLong, errstr: COpaquePointer?): CLongLong =
    throw UnsupportedOperationException("strtonum not available on JVM — no C library access")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 not available on JVM — no C library access")

public actual fun chflags(path: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("chflags not available on JVM — no C library access")

public actual fun fchflags(fd: CInt, flags: CUInt): CInt =
    throw UnsupportedOperationException("fchflags not available on JVM — no C library access")

public actual fun chflagsat(fd: CInt, path: String?, flags: CUInt, atflag: CInt): CInt =
    throw UnsupportedOperationException("chflagsat not available on JVM — no C library access")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd not available on JVM — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo not available on JVM — no C library access")

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    throw UnsupportedOperationException("getresgid not available on JVM — no C library access")

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    throw UnsupportedOperationException("getresuid not available on JVM — no C library access")

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("kevent not available on JVM — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect not available on JVM — no C library access")

public actual fun getthrid(): PidT =
    throw UnsupportedOperationException("getthrid not available on JVM — no C library access")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize not available on JVM — no C library access")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize not available on JVM — no C library access")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on JVM — no C library access")

public actual fun pthreadMainNp(): CInt =
    throw UnsupportedOperationException("pthreadMainNp not available on JVM — no C library access")

public actual fun pthreadGetNameNp(tid: PthreadT, name: String?, len: ULong) {
    throw UnsupportedOperationException("pthreadGetNameNp not available on JVM — no C library access")
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    throw UnsupportedOperationException("pthreadSetNameNp not available on JVM — no C library access")
}

public actual fun pthreadStacksegNp(thread: PthreadT, sinfo: StackT?): CInt =
    throw UnsupportedOperationException("pthreadStacksegNp not available on JVM — no C library access")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty not available on JVM — no C library access")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty not available on JVM — no C library access")

public actual fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctl not available on JVM — no C library access")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    throw UnsupportedOperationException("setresgid not available on JVM — no C library access")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    throw UnsupportedOperationException("setresuid not available on JVM — no C library access")

public actual fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt =
    throw UnsupportedOperationException("ptrace not available on JVM — no C library access")

public actual fun utrace(label: String?, addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("utrace not available on JVM — no C library access")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on JVM — no C library access")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale not available on JVM — no C library access")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale not available on JVM — no C library access")
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale not available on JVM — no C library access")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale not available on JVM — no C library access")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero not available on JVM — no C library access")
}

public actual fun setproctitle(fmt: String?, vararg args: Any?) {
    throw UnsupportedOperationException("setproctitle not available on JVM — no C library access")
}

public actual fun freezero(ptr: COpaquePointer?, size: ULong) {
    throw UnsupportedOperationException("freezero not available on JVM — no C library access")
}

public actual fun mallocConceal(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocConceal not available on JVM — no C library access")

public actual fun callocConceal(nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("callocConceal not available on JVM — no C library access")

public actual fun srand48Deterministic(seed: CLong) {
    throw UnsupportedOperationException("srand48Deterministic not available on JVM — no C library access")
}

public actual fun seed48Deterministic(xseed: CUShort?): CUShort? =
    throw UnsupportedOperationException("seed48Deterministic not available on JVM — no C library access")

public actual fun lcong48Deterministic(p: CUShort?) {
    throw UnsupportedOperationException("lcong48Deterministic not available on JVM — no C library access")
}

public actual fun hcreate(nelt: ULong): CInt =
    throw UnsupportedOperationException("hcreate not available on JVM — no C library access")

public actual fun hdestroy() {
    throw UnsupportedOperationException("hdestroy not available on JVM — no C library access")
}

public actual fun hsearch(entry: ENTRY, action: ACTION): ENTRY? =
    throw UnsupportedOperationException("hsearch not available on JVM — no C library access")

public actual fun futex(uaddr: UInt?, op: CInt, `val`: CInt, timeout: Timespec?, uaddr2: UInt?): CInt =
    throw UnsupportedOperationException("futex not available on JVM — no C library access")

public actual fun mimmutable(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("mimmutable not available on JVM — no C library access")

public actual fun reboot(mode: CInt): CInt =
    throw UnsupportedOperationException("reboot not available on JVM — no C library access")

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs not available on JVM — no C library access")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs not available on JVM — no C library access")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("getmntinfo not available on JVM — no C library access")

public actual fun getfsstat(buf: Statfs?, bufsize: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("getfsstat not available on JVM — no C library access")

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    throw UnsupportedOperationException("elfAuxInfo not available on JVM — no C library access")

public actual fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong =
    throw UnsupportedOperationException("backtrace not available on JVM — no C library access")

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols not available on JVM — no C library access")

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: CInt): CInt =
    throw UnsupportedOperationException("backtraceSymbolsFd not available on JVM — no C library access")

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: ULong, fmt: String?): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbolsFmt not available on JVM — no C library access")

