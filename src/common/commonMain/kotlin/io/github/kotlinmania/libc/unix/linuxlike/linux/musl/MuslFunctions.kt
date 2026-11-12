package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.Tm
import io.github.kotlinmania.libc.unix.linuxlike.linux.PosixSpawnFileActionsT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt

public expect fun prlimit(pid: PidT, resource: CInt, newLimit: ConstPtr<Rlimit>, oldLimit: MutPtr<Rlimit>): CInt

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt

public expect fun ptrace(request: CInt, vararg variadicArgs: Long): CLong

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

// Musl targets need the `mask` argument of `fanotifyMark` be specified
// `cUlonglong` instead of `ULong` or there will be a type mismatch between
// `long long unsigned int` and the expected `uint64T`.
public expect fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: ConstPtr<CChar>): CInt

public expect fun preadv2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun pwritev2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun getauxval(type: CUlong): CUlong

// Added in `musl` 1.1.20
public expect fun explicitBzero(s: MutPtr<CVoid>, len: SizeT)

// Added in `musl` 1.2.2
public expect fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun adjtimex(buf: MutPtr<Timex>): CInt

public expect fun clockAdjtime(clkId: ClockidT, buf: MutPtr<Timex>): CInt

public expect fun ctermid(s: MutPtr<CChar>): MutPtr<CChar>

public expect fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt

public expect fun mlock2(addr: ConstPtr<CVoid>, len: SizeT, flags: CUint): CInt

public expect fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT

public expect fun euidaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt

public expect fun eaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt

public expect fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar>

public expect fun dirname(path: MutPtr<CChar>): MutPtr<CChar>

public expect fun basename(path: MutPtr<CChar>): MutPtr<CChar>

// Added in `musl` 1.1.20
public expect fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT

// Added in `musl` 1.1.24
public expect fun posixSpawnFileActionsAddchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt

// Added in `musl` 1.1.24
public expect fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt

public expect fun getutxent(): MutPtr<Utmpx>

public expect fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun setutxent()

public expect fun endutxent()

public expect fun utmpxname(file: ConstPtr<CChar>): CInt

public expect fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>): CInt

public expect fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>, abstime: ConstPtr<Timespec>): CInt
