@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_chflags
import libc.cinterop.libc_dirfd
import libc.cinterop.libc_fchflags
import libc.cinterop.libc_gettimeofday
import libc.cinterop.libc_reboot
import libc.cinterop.libc_settimeofday
import libc.cinterop.libc_strtonum

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires manual FFI bridge — not yet implemented")

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.handle.toCPointer()
    val result = libc_gettimeofday(tpPtr, tzPtr)
    return result
}

public actual fun settimeofday(tp: Timeval?, tz: Timezone?): Int {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.handle.toCPointer()
    val result = libc_settimeofday(tpPtr, tzPtr)
    return result
}

public actual fun pledge(promises: String?, execpromises: String?): Int =
    throw UnsupportedOperationException("pledge requires manual FFI bridge — not yet implemented")

public actual fun unveil(path: String?, permissions: String?): Int =
    throw UnsupportedOperationException("unveil requires manual FFI bridge — not yet implemented")

public actual fun strtonum(nptr: String?, minval: Long, maxval: Long, errstr: COpaquePointer?): Long {
    if (errstr == null) return -1L
    val errstrPtr: CPointer<ByteVar>? = errstr.value.toCPointer()
    val result = libc_strtonum(nptr, minval, maxval, errstrPtr)
    return result
}

public actual fun dup3(src: Int, dst: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 requires manual FFI bridge — not yet implemented")

public actual fun chflags(path: String?, flags: UInt): Int {
    if (path == null) return -1
    return libc.cinterop.libc_chflags(path, flags)
}

public actual fun fchflags(fd: Int, flags: UInt): Int =
    libc.cinterop.libc_fchflags(fd, flags)

public actual fun chflagsat(fd: Int, path: String?, flags: UInt, atflag: Int): Int =
    throw UnsupportedOperationException("chflagsat requires manual FFI bridge — not yet implemented")

public actual fun dirfd(dirp: DIR?): Int =
    libc.cinterop.libc_dirfd(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun getresgid(rgid: UInt?, egid: UInt?, sgid: UInt?): Int =
    throw UnsupportedOperationException("getresgid requires manual FFI bridge — not yet implemented")

public actual fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): Int =
    throw UnsupportedOperationException("getresuid requires manual FFI bridge — not yet implemented")

public actual fun kevent(kq: Int, changelist: Kevent?, nchanges: Int, eventlist: Kevent?, nevents: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent requires manual FFI bridge — not yet implemented")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires FFI bridge")

public actual fun getthrid(): Int =
    throw UnsupportedOperationException("getthrid requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadMainNp(): Int =
    throw UnsupportedOperationException("pthreadMainNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetNameNp(tid: ULong, name: String?, len: ULong): Unit = throw UnsupportedOperationException("pthreadGetNameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetNameNp(tid: ULong, name: String?): Unit = throw UnsupportedOperationException("pthreadSetNameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadStacksegNp(thread: ULong, sinfo: StackT?): Int =
    throw UnsupportedOperationException("pthreadStacksegNp requires manual FFI bridge — not yet implemented")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty requires manual FFI bridge — not yet implemented")

public actual fun sysctl(name: Int?, namelen: UInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctl requires manual FFI bridge — not yet implemented")

public actual fun setresgid(rgid: UInt, egid: UInt, sgid: UInt): Int =
    throw UnsupportedOperationException("setresgid requires manual FFI bridge — not yet implemented")

public actual fun setresuid(ruid: UInt, euid: UInt, suid: UInt): Int =
    throw UnsupportedOperationException("setresuid requires manual FFI bridge — not yet implemented")

public actual fun ptrace(request: Int, pid: Int, addr: String?, data: Int): Int =
    throw UnsupportedOperationException("ptrace requires manual FFI bridge — not yet implemented")

public actual fun utrace(label: String?, addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("utrace requires manual FFI bridge — not yet implemented")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires FFI bridge")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale requires manual FFI bridge — not yet implemented")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale requires manual FFI bridge — not yet implemented")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale requires manual FFI bridge — not yet implemented")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("explicitBzero requires manual FFI bridge — not yet implemented")

public actual fun setproctitle(fmt: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("setproctitle requires manual FFI bridge — not yet implemented")

public actual fun freezero(ptr: COpaquePointer?, size: ULong): Unit = throw UnsupportedOperationException("freezero requires manual FFI bridge — not yet implemented")

public actual fun mallocConceal(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocConceal requires manual FFI bridge — not yet implemented")

public actual fun callocConceal(nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("callocConceal requires manual FFI bridge — not yet implemented")

public actual fun srand48Deterministic(seed: Long): Unit = throw UnsupportedOperationException("srand48Deterministic requires manual FFI bridge — not yet implemented")

public actual fun seed48Deterministic(xseed: UShort?): UShort? =
    throw UnsupportedOperationException("seed48Deterministic requires manual FFI bridge — not yet implemented")

public actual fun lcong48Deterministic(p: UShort?): Unit = throw UnsupportedOperationException("lcong48Deterministic requires manual FFI bridge — not yet implemented")

public actual fun hcreate(nelt: ULong): Int =
    throw UnsupportedOperationException("hcreate requires manual FFI bridge — not yet implemented")

public actual fun hdestroy(): Unit = throw UnsupportedOperationException("hdestroy requires manual FFI bridge — not yet implemented")

public actual fun hsearch(entry: io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.Entry, action: UInt): io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.Entry? =
    throw UnsupportedOperationException("hsearch requires manual FFI bridge — not yet implemented")

public actual fun futex(uaddr: UInt?, op: Int, `val`: Int, timeout: Timespec?, uaddr2: UInt?): Int =
    throw UnsupportedOperationException("futex requires manual FFI bridge — not yet implemented")

public actual fun mimmutable(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("mimmutable requires manual FFI bridge — not yet implemented")

public actual fun reboot(mode: Int): Int =
    libc.cinterop.libc_reboot(mode)

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs requires manual FFI bridge — not yet implemented")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs requires manual FFI bridge — not yet implemented")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("getmntinfo requires manual FFI bridge — not yet implemented")

public actual fun getfsstat(buf: Statfs?, bufsize: ULong, flags: Int): Int =
    throw UnsupportedOperationException("getfsstat requires manual FFI bridge — not yet implemented")

public actual fun elfAuxInfo(aux: Int, buf: COpaquePointer?, buflen: Int): Int =
    throw UnsupportedOperationException("elfAuxInfo requires manual FFI bridge — not yet implemented")

public actual fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong =
    throw UnsupportedOperationException("backtrace requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: Int): Int =
    throw UnsupportedOperationException("backtraceSymbolsFd requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: ULong, fmt: String?): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbolsFmt requires manual FFI bridge — not yet implemented")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr requires manual FFI bridge — not yet implemented")

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("lsearch requires manual FFI bridge — not yet implemented")

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("lfind requires manual FFI bridge — not yet implemented")
