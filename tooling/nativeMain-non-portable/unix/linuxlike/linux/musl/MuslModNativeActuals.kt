@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_prlimit(pid, resource, newLimit?.value?.toCPointer<ByteVar>(), oldLimit?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getpriority(which: CInt, who: IdT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_setpriority(which, who, prio)

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_fanotify_mark(fd, flags, mask, dirfd, path)

public actual fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_preadv2(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_pwritev2(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun getauxval(type: CUlong): CUlong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_getauxval(type)

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_explicit_bzero(s?.value?.toCPointer<ByteVar>(), len)
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_reallocarray(ptr?.value?.toCPointer<ByteVar>(), nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun adjtimex(buf: io.github.kotlinmania.libc.Timex?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_adjtimex(buf?.value?.toCPointer<ByteVar>())

public actual fun clockAdjtime(clkId: ClockidT, buf: io.github.kotlinmania.libc.Timex?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_clock_adjtime(clkId, buf?.value?.toCPointer<ByteVar>())

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_ctermid(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_memfd_create(name, flags)

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_mlock2(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_malloc_usable_size(ptr?.value?.toCPointer<ByteVar>())

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_euidaccess(pathname, mode)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_eaccess(pathname, mode)

public actual fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_asctime_r(tm?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT?, path: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_posix_spawn_file_actions_addchdir_np(actions?.value?.toCPointer<ByteVar>(), path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_posix_spawn_file_actions_addfchdir_np(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun getutxent(): Utmpx? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutxent() {
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_setutxent()
}

public actual fun endutxent() {
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_endutxent()
}

public actual fun utmpxname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_utmpxname(file)

public actual fun pthreadTryjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_pthread_tryjoin_np(thread?.value?.toCPointer<ByteVar>(), retval?.value?.toCPointer<ByteVar>())

public actual fun pthreadTimedjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.cinterop.libc_musl_mod_pthread_timedjoin_np(thread?.value?.toCPointer<ByteVar>(), retval?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())
