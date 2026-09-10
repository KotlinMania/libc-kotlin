// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    throw UnsupportedOperationException("prlimit requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun ptrace(request: CInt, vararg args: Any?): CLong =
    throw UnsupportedOperationException("ptrace requires N-API addon")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun fanotifyMark(fd: CInt, flags: CUInt, mask: CULongLong, dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("fanotifyMark requires N-API addon")

public actual fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("preadv2 requires N-API addon")

public actual fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("pwritev2 requires N-API addon")

public actual fun getauxval(type: CULong): CULong =
    throw UnsupportedOperationException("getauxval requires N-API addon")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero requires N-API addon")
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires N-API addon")

public actual fun adjtimex(buf: Timex?): CInt =
    throw UnsupportedOperationException("adjtimex requires N-API addon")

public actual fun clockAdjtime(clkId: ClockidT, buf: Timex?): CInt =
    throw UnsupportedOperationException("clockAdjtime requires N-API addon")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid requires N-API addon")

public actual fun memfdCreate(name: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("memfdCreate requires N-API addon")

public actual fun mlock2(addr: COpaquePointer?, len: ULong, flags: CUInt): CInt =
    throw UnsupportedOperationException("mlock2 requires N-API addon")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires N-API addon")

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("euidaccess requires N-API addon")

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("eaccess requires N-API addon")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR requires N-API addon")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires N-API addon")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename requires N-API addon")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("getrandom requires N-API addon")

public actual fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT, path: String?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp requires N-API addon")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp requires N-API addon")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires N-API addon")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires N-API addon")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires N-API addon")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires N-API addon")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent requires N-API addon")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent requires N-API addon")
}

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname requires N-API addon")

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadTryjoinNp requires N-API addon")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadTimedjoinNp requires N-API addon")

