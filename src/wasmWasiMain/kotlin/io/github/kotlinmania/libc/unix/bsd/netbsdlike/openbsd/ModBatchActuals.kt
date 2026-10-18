package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.StackT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.Termios
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.Winsize

import io.github.kotlinmania.libc.*

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on WASI — no C library access")

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on WASI — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("gettimeofday not available on WASI — no C library access")

public actual fun settimeofday(tp: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("settimeofday not available on WASI — no C library access")

public actual fun pledge(promises: String?, execpromises: String?): Int =
    throw UnsupportedOperationException("pledge not available on WASI — no C library access")

public actual fun unveil(path: String?, permissions: String?): Int =
    throw UnsupportedOperationException("unveil not available on WASI — no C library access")

public actual fun strtonum(nptr: String?, minval: Long, maxval: Long, errstr: COpaquePointer?): Long =
    throw UnsupportedOperationException("strtonum not available on WASI — no C library access")

public actual fun dup3(src: Int, dst: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 not available on WASI — no C library access")

public actual fun chflags(path: String?, flags: UInt): Int =
    throw UnsupportedOperationException("chflags not available on WASI — no C library access")

public actual fun fchflags(fd: Int, flags: UInt): Int =
    throw UnsupportedOperationException("fchflags not available on WASI — no C library access")

public actual fun chflagsat(fd: Int, path: String?, flags: UInt, atflag: Int): Int =
    throw UnsupportedOperationException("chflagsat not available on WASI — no C library access")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd not available on WASI — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo not available on WASI — no C library access")

public actual fun getresgid(rgid: UInt?, egid: UInt?, sgid: UInt?): Int =
    throw UnsupportedOperationException("getresgid not available on WASI — no C library access")

public actual fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): Int =
    throw UnsupportedOperationException("getresuid not available on WASI — no C library access")

public actual fun kevent(kq: Int, changelist: Kevent?, nchanges: Int, eventlist: Kevent?, nevents: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent not available on WASI — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on WASI — no C library access")

public actual fun getthrid(): Int =
    throw UnsupportedOperationException("getthrid not available on WASI — no C library access")

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize not available on WASI — no C library access")

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize not available on WASI — no C library access")

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on WASI — no C library access")

public actual fun pthreadMainNp(): Int =
    throw UnsupportedOperationException("pthreadMainNp not available on WASI — no C library access")

public actual fun pthreadGetNameNp(tid: ULong, name: String?, len: ULong): Unit = throw UnsupportedOperationException("pthreadGetNameNp not available on WASI — no C library access")

public actual fun pthreadSetNameNp(tid: ULong, name: String?): Unit = throw UnsupportedOperationException("pthreadSetNameNp not available on WASI — no C library access")

public actual fun pthreadStacksegNp(thread: ULong, sinfo: StackT?): Int =
    throw UnsupportedOperationException("pthreadStacksegNp not available on WASI — no C library access")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty not available on WASI — no C library access")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty not available on WASI — no C library access")

public actual fun sysctl(name: Int?, namelen: UInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctl not available on WASI — no C library access")

public actual fun setresgid(rgid: UInt, egid: UInt, sgid: UInt): Int =
    throw UnsupportedOperationException("setresgid not available on WASI — no C library access")

public actual fun setresuid(ruid: UInt, euid: UInt, suid: UInt): Int =
    throw UnsupportedOperationException("setresuid not available on WASI — no C library access")

public actual fun ptrace(request: Int, pid: Int, addr: String?, data: Int): Int =
    throw UnsupportedOperationException("ptrace not available on WASI — no C library access")

public actual fun utrace(label: String?, addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("utrace not available on WASI — no C library access")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on WASI — no C library access")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale not available on WASI — no C library access")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale not available on WASI — no C library access")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale not available on WASI — no C library access")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale not available on WASI — no C library access")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("explicitBzero not available on WASI — no C library access")

public actual fun setproctitle(fmt: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("setproctitle not available on WASI — no C library access")

public actual fun freezero(ptr: COpaquePointer?, size: ULong): Unit = throw UnsupportedOperationException("freezero not available on WASI — no C library access")

public actual fun mallocConceal(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocConceal not available on WASI — no C library access")

public actual fun callocConceal(nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("callocConceal not available on WASI — no C library access")

public actual fun srand48Deterministic(seed: Long): Unit = throw UnsupportedOperationException("srand48Deterministic not available on WASI — no C library access")

public actual fun seed48Deterministic(xseed: UShort?): UShort? =
    throw UnsupportedOperationException("seed48Deterministic not available on WASI — no C library access")

public actual fun lcong48Deterministic(p: UShort?): Unit = throw UnsupportedOperationException("lcong48Deterministic not available on WASI — no C library access")

public actual fun hcreate(nelt: ULong): Int =
    throw UnsupportedOperationException("hcreate not available on WASI — no C library access")

public actual fun hdestroy(): Unit = throw UnsupportedOperationException("hdestroy not available on WASI — no C library access")

public actual fun hsearch(entry: io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.Entry, action: UInt): io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.Entry? =
    throw UnsupportedOperationException("hsearch not available on WASI — no C library access")

public actual fun futex(uaddr: UInt?, op: Int, `val`: Int, timeout: Timespec?, uaddr2: UInt?): Int =
    throw UnsupportedOperationException("futex not available on WASI — no C library access")

public actual fun mimmutable(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("mimmutable not available on WASI — no C library access")

public actual fun reboot(mode: Int): Int =
    throw UnsupportedOperationException("reboot not available on WASI — no C library access")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs not available on WASI — no C library access")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs not available on WASI — no C library access")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("getmntinfo not available on WASI — no C library access")

public actual fun getfsstat(buf: Statfs?, bufsize: ULong, flags: Int): Int =
    throw UnsupportedOperationException("getfsstat not available on WASI — no C library access")

public actual fun elfAuxInfo(aux: Int, buf: COpaquePointer?, buflen: Int): Int =
    throw UnsupportedOperationException("elfAuxInfo not available on WASI — no C library access")

public actual fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong =
    throw UnsupportedOperationException("backtrace not available on WASI — no C library access")

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols not available on WASI — no C library access")

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: Int): Int =
    throw UnsupportedOperationException("backtraceSymbolsFd not available on WASI — no C library access")

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: ULong, fmt: String?): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbolsFmt not available on WASI — no C library access")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr not available on WASI — no C library access")

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("lsearch not available on WASI — no C library access")

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("lfind not available on WASI — no C library access")
