// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit not available on WASI — no C library access")

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit not available on WASI — no C library access")

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    throw UnsupportedOperationException("prlimit not available on WASI — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on WASI — no C library access")

public actual fun ptrace(request: CInt, vararg args: Any?): CLong =
    throw UnsupportedOperationException("ptrace not available on WASI — no C library access")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority not available on WASI — no C library access")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority not available on WASI — no C library access")

public actual fun fanotifyMark(fd: CInt, flags: CUInt, mask: CULongLong, dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("fanotifyMark not available on WASI — no C library access")

public actual fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("preadv2 not available on WASI — no C library access")

public actual fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("pwritev2 not available on WASI — no C library access")

public actual fun getauxval(type: CULong): CULong =
    throw UnsupportedOperationException("getauxval not available on WASI — no C library access")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero not available on WASI — no C library access")
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray not available on WASI — no C library access")

public actual fun adjtimex(buf: Timex?): CInt =
    throw UnsupportedOperationException("adjtimex not available on WASI — no C library access")

public actual fun clockAdjtime(clkId: ClockidT, buf: Timex?): CInt =
    throw UnsupportedOperationException("clockAdjtime not available on WASI — no C library access")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid not available on WASI — no C library access")

public actual fun memfdCreate(name: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("memfdCreate not available on WASI — no C library access")

public actual fun mlock2(addr: COpaquePointer?, len: ULong, flags: CUInt): CInt =
    throw UnsupportedOperationException("mlock2 not available on WASI — no C library access")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize not available on WASI — no C library access")

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("euidaccess not available on WASI — no C library access")

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("eaccess not available on WASI — no C library access")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR not available on WASI — no C library access")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname not available on WASI — no C library access")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename not available on WASI — no C library access")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("getrandom not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT, path: String?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp not available on WASI — no C library access")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent not available on WASI — no C library access")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid not available on WASI — no C library access")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline not available on WASI — no C library access")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline not available on WASI — no C library access")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent not available on WASI — no C library access")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent not available on WASI — no C library access")
}

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname not available on WASI — no C library access")

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadTryjoinNp not available on WASI — no C library access")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadTimedjoinNp not available on WASI — no C library access")

