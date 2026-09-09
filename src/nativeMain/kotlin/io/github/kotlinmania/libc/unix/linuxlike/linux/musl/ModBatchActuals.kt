// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit requires manual FFI bridge — not yet implemented")

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit requires manual FFI bridge — not yet implemented")

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    throw UnsupportedOperationException("prlimit requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday requires manual FFI bridge — not yet implemented")

public actual fun ptrace(request: CInt, vararg args: Any?): CLong =
    throw UnsupportedOperationException("ptrace requires manual FFI bridge — not yet implemented")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority requires manual FFI bridge — not yet implemented")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority requires manual FFI bridge — not yet implemented")

public actual fun fanotifyMark(fd: CInt, flags: CUInt, mask: CULongLong, dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("fanotifyMark requires manual FFI bridge — not yet implemented")

public actual fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("preadv2 requires manual FFI bridge — not yet implemented")

public actual fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("pwritev2 requires manual FFI bridge — not yet implemented")

public actual fun getauxval(type: CULong): CULong =
    throw UnsupportedOperationException("getauxval requires manual FFI bridge — not yet implemented")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero requires manual FFI bridge — not yet implemented")
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires manual FFI bridge — not yet implemented")

public actual fun adjtimex(buf: Timex?): CInt =
    throw UnsupportedOperationException("adjtimex requires manual FFI bridge — not yet implemented")

public actual fun clockAdjtime(clkId: ClockidT, buf: Timex?): CInt =
    throw UnsupportedOperationException("clockAdjtime requires manual FFI bridge — not yet implemented")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid requires manual FFI bridge — not yet implemented")

public actual fun memfdCreate(name: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("memfdCreate requires manual FFI bridge — not yet implemented")

public actual fun mlock2(addr: COpaquePointer?, len: ULong, flags: CUInt): CInt =
    throw UnsupportedOperationException("mlock2 requires manual FFI bridge — not yet implemented")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires manual FFI bridge — not yet implemented")

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("euidaccess requires manual FFI bridge — not yet implemented")

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("eaccess requires manual FFI bridge — not yet implemented")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR requires manual FFI bridge — not yet implemented")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires manual FFI bridge — not yet implemented")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename requires manual FFI bridge — not yet implemented")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("getrandom requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT, path: String?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp requires manual FFI bridge — not yet implemented")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires manual FFI bridge — not yet implemented")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires manual FFI bridge — not yet implemented")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires manual FFI bridge — not yet implemented")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires manual FFI bridge — not yet implemented")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent requires manual FFI bridge — not yet implemented")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent requires manual FFI bridge — not yet implemented")
}

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname requires manual FFI bridge — not yet implemented")

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadTryjoinNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadTimedjoinNp requires manual FFI bridge — not yet implemented")
