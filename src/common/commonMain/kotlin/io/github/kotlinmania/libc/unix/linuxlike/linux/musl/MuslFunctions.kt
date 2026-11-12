package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun getrlimit(resource: CInt, rlim: MutPtr): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr): CInt

public expect fun prlimit(pid: PidT, resource: CInt, newLimit: ConstPtr, oldLimit: MutPtr): CInt

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun ptrace(request: CInt, vararg variadicArgs: Long): CLong

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

// Musl targets need the `mask` argument of `fanotifyMark` be specified
// `cUlonglong` instead of `ULong` or there will be a type mismatch between
// `long long unsigned int` and the expected `uint64T`.
public expect fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: ConstPtr): CInt

public expect fun preadv2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun pwritev2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun getauxval(type: CUlong): CUlong

// Added in `musl` 1.1.20
public expect fun explicitBzero(s: MutPtr, len: SizeT)

// Added in `musl` 1.2.2
public expect fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr

public expect fun adjtimex(buf: MutPtr): CInt

public expect fun clockAdjtime(clkId: ClockidT, buf: MutPtr): CInt

public expect fun ctermid(s: MutPtr): MutPtr

public expect fun memfdCreate(name: ConstPtr, flags: CUint): CInt

public expect fun mlock2(addr: ConstPtr, len: SizeT, flags: CUint): CInt

public expect fun mallocUsableSize(ptr: MutPtr): SizeT

public expect fun euidaccess(pathname: ConstPtr, mode: CInt): CInt

public expect fun eaccess(pathname: ConstPtr, mode: CInt): CInt

public expect fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr

public expect fun dirname(path: MutPtr): MutPtr

public expect fun basename(path: MutPtr): MutPtr

// Added in `musl` 1.1.20
public expect fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT

// Added in `musl` 1.1.24
public expect fun posixSpawnFileActionsAddchdirNp(actions: MutPtr, path: ConstPtr): CInt

// Added in `musl` 1.1.24
public expect fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr, fd: CInt): CInt

public expect fun getutxent(): MutPtr

public expect fun getutxid(ut: ConstPtr): MutPtr

public expect fun getutxline(ut: ConstPtr): MutPtr

public expect fun pututxline(ut: ConstPtr): MutPtr

public expect fun setutxent()

public expect fun endutxent()

public expect fun utmpxname(file: ConstPtr): CInt

public expect fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr): CInt

public expect fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr, abstime: ConstPtr): CInt
