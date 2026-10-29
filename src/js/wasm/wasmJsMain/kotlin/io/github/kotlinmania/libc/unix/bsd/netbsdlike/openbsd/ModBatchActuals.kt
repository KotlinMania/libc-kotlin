package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.StackT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.Termios
import io.github.kotlinmania.libc.unix.linuxlike.Timezone

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun settimeofday(tp: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun pledge(promises: String?, execpromises: String?): Int =
    throw UnsupportedOperationException("pledge requires N-API addon")

public actual fun unveil(path: String?, permissions: String?): Int =
    throw UnsupportedOperationException("unveil requires N-API addon")

public actual fun strtonum(nptr: String?, minval: Long, maxval: Long, errstr: COpaquePointer?): Long =
    throw UnsupportedOperationException("strtonum requires N-API addon")

public actual fun dup3(src: Int, dst: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 requires N-API addon")

public actual fun chflags(path: String?, flags: UInt): Int =
    throw UnsupportedOperationException("chflags requires N-API addon")

public actual fun fchflags(fd: Int, flags: UInt): Int =
    throw UnsupportedOperationException("fchflags requires N-API addon")

public actual fun chflagsat(fd: Int, path: String?, flags: UInt, atflag: Int): Int =
    throw UnsupportedOperationException("chflagsat requires N-API addon")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun getresgid(rgid: UInt?, egid: UInt?, sgid: UInt?): Int =
    throw UnsupportedOperationException("getresgid requires N-API addon")

public actual fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): Int =
    throw UnsupportedOperationException("getresuid requires N-API addon")

public actual fun kevent(kq: Int, changelist: Kevent?, nchanges: Int, eventlist: Kevent?, nevents: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun getthrid(): Int =
    throw UnsupportedOperationException("getthrid requires N-API addon")

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires N-API addon")

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires N-API addon")

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack requires N-API addon")

public actual fun pthreadMainNp(): Int =
    throw UnsupportedOperationException("pthreadMainNp requires N-API addon")

public actual fun pthreadGetNameNp(tid: ULong, name: String?, len: ULong): Unit = throw UnsupportedOperationException("pthreadGetNameNp requires N-API addon")

public actual fun pthreadSetNameNp(tid: ULong, name: String?): Unit = throw UnsupportedOperationException("pthreadSetNameNp requires N-API addon")

public actual fun pthreadStacksegNp(thread: ULong, sinfo: StackT?): Int =
    throw UnsupportedOperationException("pthreadStacksegNp requires N-API addon")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty requires N-API addon")

public actual fun sysctl(name: Int?, namelen: UInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctl requires N-API addon")

public actual fun setresgid(rgid: UInt, egid: UInt, sgid: UInt): Int =
    throw UnsupportedOperationException("setresgid requires N-API addon")

public actual fun setresuid(ruid: UInt, euid: UInt, suid: UInt): Int =
    throw UnsupportedOperationException("setresuid requires N-API addon")

public actual fun ptrace(request: Int, pid: Int, addr: String?, data: Int): Int =
    throw UnsupportedOperationException("ptrace requires N-API addon")

public actual fun utrace(label: String?, addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("utrace requires N-API addon")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires N-API addon")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale requires N-API addon")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires N-API addon")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("explicitBzero requires N-API addon")

public actual fun setproctitle(fmt: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("setproctitle requires N-API addon")

public actual fun freezero(ptr: COpaquePointer?, size: ULong): Unit = throw UnsupportedOperationException("freezero requires N-API addon")

public actual fun mallocConceal(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocConceal requires N-API addon")

public actual fun callocConceal(nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("callocConceal requires N-API addon")

public actual fun srand48Deterministic(seed: Long): Unit = throw UnsupportedOperationException("srand48Deterministic requires N-API addon")

public actual fun seed48Deterministic(xseed: UShort?): UShort? =
    throw UnsupportedOperationException("seed48Deterministic requires N-API addon")

public actual fun lcong48Deterministic(p: UShort?): Unit = throw UnsupportedOperationException("lcong48Deterministic requires N-API addon")

public actual fun hcreate(nelt: ULong): Int =
    throw UnsupportedOperationException("hcreate requires N-API addon")

public actual fun hdestroy(): Unit = throw UnsupportedOperationException("hdestroy requires N-API addon")

public actual fun hsearch(entry: io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.Entry, action: UInt): io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.Entry? =
    throw UnsupportedOperationException("hsearch requires N-API addon")

public actual fun futex(uaddr: UInt?, op: Int, `val`: Int, timeout: Timespec?, uaddr2: UInt?): Int =
    throw UnsupportedOperationException("futex requires N-API addon")

public actual fun mimmutable(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("mimmutable requires N-API addon")

public actual fun reboot(mode: Int): Int =
    throw UnsupportedOperationException("reboot requires N-API addon")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs requires N-API addon")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs requires N-API addon")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("getmntinfo requires N-API addon")

public actual fun getfsstat(buf: Statfs?, bufsize: ULong, flags: Int): Int =
    throw UnsupportedOperationException("getfsstat requires N-API addon")

public actual fun elfAuxInfo(aux: Int, buf: COpaquePointer?, buflen: Int): Int =
    throw UnsupportedOperationException("elfAuxInfo requires N-API addon")

public actual fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong =
    throw UnsupportedOperationException("backtrace requires N-API addon")

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires N-API addon")

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: Int): Int =
    throw UnsupportedOperationException("backtraceSymbolsFd requires N-API addon")

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: ULong, fmt: String?): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbolsFmt requires N-API addon")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr requires N-API addon")

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("lsearch requires N-API addon")

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("lfind requires N-API addon")
