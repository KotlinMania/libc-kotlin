@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

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
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslAdjtimex
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslAsctimeR
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslBasename
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslClockAdjtime
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslCtermid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslDirname
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslEaccess
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslEndutxent
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslEuidaccess
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslExplicitBzero
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslFanotifyMark
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslGetauxval
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslGetpriority
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslGetrandom
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslGetrlimit
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslGettimeofday
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslGetutxent
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslGetutxid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslGetutxline
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslMallocUsableSize
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslMemfdCreate
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslMlock2
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddchdirNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddfchdirNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslPreadv2
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslPrlimit
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslPthreadTimedjoinNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslPthreadTryjoinNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslPtrace
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslPututxline
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslPwritev2
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslReallocarray
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslSetpriority
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslSetrlimit
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslSetutxent
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libcUnixLinuxlikeLinuxMuslUtmpxname
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    libcUnixLinuxlikeLinuxMuslGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxMuslSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: ConstPtr, oldLimit: MutPtr): CInt =
    libcUnixLinuxlikeLinuxMuslPrlimit(pid, resource, newLimit.rawAddress.toCPointer<ByteVar>(), oldLimit.rawAddress.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    libcUnixLinuxlikeLinuxMuslGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    libcUnixLinuxlikeLinuxMuslPtrace(request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libcUnixLinuxlikeLinuxMuslGetpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libcUnixLinuxlikeLinuxMuslSetpriority(which, who, prio)

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxMuslFanotifyMark(fd, flags, mask, dirfd, path.rawAddress.toCPointer<ByteVar>())

public actual fun preadv2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    libcUnixLinuxlikeLinuxMuslPreadv2(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun pwritev2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    libcUnixLinuxlikeLinuxMuslPwritev2(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun getauxval(type: CUlong): CUlong =
    libcUnixLinuxlikeLinuxMuslGetauxval(type)

public actual fun explicitBzero(s: MutPtr, len: SizeT) {
    libcUnixLinuxlikeLinuxMuslExplicitBzero(s.rawAddress.toCPointer<ByteVar>(), len)
}

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxMuslReallocarray(ptr.rawAddress.toCPointer<ByteVar>(), nmemb, size)?.toLong() ?: 0L)

public actual fun adjtimex(buf: MutPtr): CInt =
    libcUnixLinuxlikeLinuxMuslAdjtimex(buf.rawAddress.toCPointer<ByteVar>())

public actual fun clockAdjtime(clkId: ClockidT, buf: MutPtr): CInt =
    libcUnixLinuxlikeLinuxMuslClockAdjtime(clkId, buf.rawAddress.toCPointer<ByteVar>())

public actual fun ctermid(s: MutPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxMuslCtermid(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun memfdCreate(name: ConstPtr, flags: CUint): CInt =
    libcUnixLinuxlikeLinuxMuslMemfdCreate(name.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mlock2(addr: ConstPtr, len: SizeT, flags: CUint): CInt =
    libcUnixLinuxlikeLinuxMuslMlock2(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun mallocUsableSize(ptr: MutPtr): SizeT =
    libcUnixLinuxlikeLinuxMuslMallocUsableSize(ptr.rawAddress.toCPointer<ByteVar>())

public actual fun euidaccess(pathname: ConstPtr, mode: CInt): CInt =
    libcUnixLinuxlikeLinuxMuslEuidaccess(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun eaccess(pathname: ConstPtr, mode: CInt): CInt =
    libcUnixLinuxlikeLinuxMuslEaccess(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxMuslAsctimeR(tm.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dirname(path: MutPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxMuslDirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun basename(path: MutPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxMuslBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    libcUnixLinuxlikeLinuxMuslGetrandom(buf.rawAddress.toCPointer<ByteVar>(), buflen, flags)

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr, path: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddchdirNp(actions.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr, fd: CInt): CInt =
    libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddfchdirNp(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun getutxent(): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxMuslGetutxent()?.toLong() ?: 0L)

public actual fun getutxid(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxMuslGetutxid(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutxline(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxMuslGetutxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pututxline(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxMuslPututxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setutxent() {
    libcUnixLinuxlikeLinuxMuslSetutxent()
}

public actual fun endutxent() {
    libcUnixLinuxlikeLinuxMuslEndutxent()
}

public actual fun utmpxname(file: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxMuslUtmpxname(file.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr): CInt =
    libcUnixLinuxlikeLinuxMuslPthreadTryjoinNp(thread.rawAddress.toCPointer<ByteVar>(), retval.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr, abstime: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxMuslPthreadTimedjoinNp(thread.rawAddress.toCPointer<ByteVar>(), retval.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())
