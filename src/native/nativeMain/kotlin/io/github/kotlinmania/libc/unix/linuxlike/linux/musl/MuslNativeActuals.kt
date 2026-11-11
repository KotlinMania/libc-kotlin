@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

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
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_adjtimex
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_asctimeR
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_basename
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_clockAdjtime
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_ctermid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_dirname
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_eaccess
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_endutxent
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_euidaccess
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_explicitBzero
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_fanotifyMark
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_getauxval
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_getpriority
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_getrandom
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_getrlimit
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_gettimeofday
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_getutxent
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_getutxid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_getutxline
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_mallocUsableSize
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_memfdCreate
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_mlock2
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_posixSpawnFileActionsAddchdirNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_posixSpawnFileActionsAddfchdirNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_preadv2
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_prlimit
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_pthreadTimedjoinNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_pthreadTryjoinNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_ptrace
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_pututxline
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_pwritev2
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_reallocarray
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_setpriority
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_setrlimit
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_setutxent
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_unix_linuxlike_linux_musl_utmpxname
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_musl_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_musl_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_musl_prlimit(pid, resource, newLimit?.value?.toCPointer<ByteVar>(), oldLimit?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_musl_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    libc_unix_linuxlike_linux_musl_ptrace(request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libc_unix_linuxlike_linux_musl_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libc_unix_linuxlike_linux_musl_setpriority(which, who, prio)

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: String?): CInt =
    libc_unix_linuxlike_linux_musl_fanotifyMark(fd, flags, mask, dirfd, path)

public actual fun preadv2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    libc_unix_linuxlike_linux_musl_preadv2(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun pwritev2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    libc_unix_linuxlike_linux_musl_pwritev2(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun getauxval(type: CUlong): CUlong =
    libc_unix_linuxlike_linux_musl_getauxval(type)

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    libc_unix_linuxlike_linux_musl_explicitBzero(s?.value?.toCPointer<ByteVar>(), len)
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    libc_unix_linuxlike_linux_musl_reallocarray(ptr?.value?.toCPointer<ByteVar>(), nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun adjtimex(buf: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_musl_adjtimex(buf?.value?.toCPointer<ByteVar>())

public actual fun clockAdjtime(clkId: ClockidT, buf: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_musl_clockAdjtime(clkId, buf?.value?.toCPointer<ByteVar>())

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    libc_unix_linuxlike_linux_musl_ctermid(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    libc_unix_linuxlike_linux_musl_memfdCreate(name, flags)

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt =
    libc_unix_linuxlike_linux_musl_mlock2(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    libc_unix_linuxlike_linux_musl_mallocUsableSize(ptr?.value?.toCPointer<ByteVar>())

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    libc_unix_linuxlike_linux_musl_euidaccess(pathname, mode)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    libc_unix_linuxlike_linux_musl_eaccess(pathname, mode)

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    libc_unix_linuxlike_linux_musl_asctimeR(tm?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    libc_unix_linuxlike_linux_musl_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    libc_unix_linuxlike_linux_musl_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    libc_unix_linuxlike_linux_musl_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    libc_unix_linuxlike_linux_musl_posixSpawnFileActionsAddchdirNp(actions?.value?.toCPointer<ByteVar>(), path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    libc_unix_linuxlike_linux_musl_posixSpawnFileActionsAddfchdirNp(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun getutxent(): COpaquePointer? =
    libc_unix_linuxlike_linux_musl_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    libc_unix_linuxlike_linux_musl_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    libc_unix_linuxlike_linux_musl_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    libc_unix_linuxlike_linux_musl_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutxent() {
    libc_unix_linuxlike_linux_musl_setutxent()
}

public actual fun endutxent() {
    libc_unix_linuxlike_linux_musl_endutxent()
}

public actual fun utmpxname(file: String?): CInt =
    libc_unix_linuxlike_linux_musl_utmpxname(file)

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_musl_pthreadTryjoinNp(thread?.value?.toCPointer<ByteVar>(), retval?.value?.toCPointer<ByteVar>())

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_musl_pthreadTimedjoinNp(thread?.value?.toCPointer<ByteVar>(), retval?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())
