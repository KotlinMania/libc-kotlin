package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT

public expect fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun prlimit(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun ptrace(request: CInt, vararg variadicArgs: Long): CLong

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

// Musl targets need the `mask` argument of `fanotifyMark` be specified
// `cUlonglong` instead of `ULong` or there will be a type mismatch between
// `long long unsigned int` and the expected `uint64T`.
public expect fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: String?): CInt

public expect fun preadv2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun pwritev2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun getauxval(type: CUlong): CUlong

// Added in `musl` 1.1.20
public expect fun explicitBzero(s: COpaquePointer?, len: SizeT)

// Added in `musl` 1.2.2
public expect fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer?

public expect fun adjtimex(buf: COpaquePointer?): CInt

public expect fun clockAdjtime(clkId: ClockidT, buf: COpaquePointer?): CInt

public expect fun ctermid(s: COpaquePointer?): COpaquePointer?

public expect fun memfdCreate(name: String?, flags: CUint): CInt

public expect fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt

public expect fun mallocUsableSize(ptr: COpaquePointer?): SizeT

public expect fun euidaccess(pathname: String?, mode: CInt): CInt

public expect fun eaccess(pathname: String?, mode: CInt): CInt

public expect fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer?

public expect fun dirname(path: COpaquePointer?): COpaquePointer?

public expect fun basename(path: COpaquePointer?): COpaquePointer?

// Added in `musl` 1.1.20
public expect fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT

// Added in `musl` 1.1.24
public expect fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt

// Added in `musl` 1.1.24
public expect fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt

public expect fun getutxent(): COpaquePointer?

public expect fun getutxid(ut: COpaquePointer?): COpaquePointer?

public expect fun getutxline(ut: COpaquePointer?): COpaquePointer?

public expect fun pututxline(ut: COpaquePointer?): COpaquePointer?

public expect fun setutxent()

public expect fun endutxent()

public expect fun utmpxname(file: String?): CInt

public expect fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt

public expect fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt
