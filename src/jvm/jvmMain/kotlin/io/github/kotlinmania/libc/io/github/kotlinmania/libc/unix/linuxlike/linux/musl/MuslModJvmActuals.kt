package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.COpaquePointer

internal object MuslModRawLibc {
    external fun getrlimit(resource: Int, rlim: Long): Int
    external fun setrlimit(resource: Int, rlim: Long): Int
    external fun prlimit(pid: Int, resource: Int, newLimit: Long, oldLimit: Long): Int
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun getpriority(which: Int, who: Long): Int
    external fun setpriority(which: Int, who: Long, prio: Int): Int
    external fun fanotifyMark(fd: Int, flags: Int, mask: Long, dirfd: Int, path: String?): Int
    external fun preadv2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long
    external fun pwritev2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long
    external fun getauxval(type: Long): Long
    external fun explicitBzero(s: Long, len: Long)
    external fun reallocarray(ptr: Long, nmemb: Long, size: Long): Long?
    external fun adjtimex(buf: Long): Int
    external fun clockAdjtime(clkId: Int, buf: Long): Int
    external fun ctermid(s: Long): Long?
    external fun memfdCreate(name: String?, flags: Int): Int
    external fun mlock2(addr: Long, len: Long, flags: Int): Int
    external fun mallocUsableSize(ptr: Long): Long
    external fun euidaccess(pathname: String?, mode: Int): Int
    external fun eaccess(pathname: String?, mode: Int): Int
    external fun asctimeR(tm: Long, buf: Long): Long?
    external fun dirname(path: Long): Long?
    external fun basename(path: Long): Long?
    external fun getrandom(buf: Long, buflen: Long, flags: Int): Long
    external fun posixSpawnFileActionsAddchdirNp(actions: Long, path: String?): Int
    external fun posixSpawnFileActionsAddfchdirNp(actions: Long, fd: Int): Int
    external fun getutxent(): Long?
    external fun getutxid(ut: Long): Long?
    external fun getutxline(ut: Long): Long?
    external fun pututxline(ut: Long): Long?
    external fun setutxent()
    external fun endutxent()
    external fun utmpxname(file: String?): Int
    external fun pthreadTryjoinNp(thread: Long, retval: Long): Int
    external fun pthreadTimedjoinNp(thread: Long, retval: Long, abstime: Long): Int
}

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    MuslModRawLibc.getrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    MuslModRawLibc.setrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    MuslModRawLibc.prlimit(pid, resource, newLimit?.toLong() ?: 0L, oldLimit?.toLong() ?: 0L)

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    MuslModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    MuslModRawLibc.getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    MuslModRawLibc.setpriority(which, who, prio)

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: String?): CInt =
    MuslModRawLibc.fanotifyMark(fd, flags, mask, dirfd, path)

public actual fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    MuslModRawLibc.preadv2(fd, iov?.toLong() ?: 0L, iovcnt, offset, flags)

public actual fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    MuslModRawLibc.pwritev2(fd, iov?.toLong() ?: 0L, iovcnt, offset, flags)

public actual fun getauxval(type: CUlong): CUlong =
    MuslModRawLibc.getauxval(type)

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    MuslModRawLibc.explicitBzero(s?.value ?: 0L, len)
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    MuslModRawLibc.reallocarray(ptr?.value ?: 0L, nmemb, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun adjtimex(buf: io.github.kotlinmania.libc.Timex?): CInt =
    MuslModRawLibc.adjtimex(buf?.toLong() ?: 0L)

public actual fun clockAdjtime(clkId: ClockidT, buf: io.github.kotlinmania.libc.Timex?): CInt =
    MuslModRawLibc.clockAdjtime(clkId, buf?.toLong() ?: 0L)

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    MuslModRawLibc.ctermid(s?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    MuslModRawLibc.memfdCreate(name, flags)

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt =
    MuslModRawLibc.mlock2(addr?.value ?: 0L, len, flags)

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    MuslModRawLibc.mallocUsableSize(ptr?.value ?: 0L)

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    MuslModRawLibc.euidaccess(pathname, mode)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    MuslModRawLibc.eaccess(pathname, mode)

public actual fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? =
    MuslModRawLibc.asctimeR(tm?.toLong() ?: 0L, buf?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    MuslModRawLibc.dirname(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    MuslModRawLibc.basename(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    MuslModRawLibc.getrandom(buf?.value ?: 0L, buflen, flags)

public actual fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT?, path: String?): CInt =
    MuslModRawLibc.posixSpawnFileActionsAddchdirNp(actions?.toLong() ?: 0L, path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    MuslModRawLibc.posixSpawnFileActionsAddfchdirNp(actions?.toLong() ?: 0L, fd)

public actual fun getutxent(): Utmpx? =
    MuslModRawLibc.getutxent()

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    MuslModRawLibc.getutxid(ut?.toLong() ?: 0L)

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    MuslModRawLibc.getutxline(ut?.toLong() ?: 0L)

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    MuslModRawLibc.pututxline(ut?.toLong() ?: 0L)

public actual fun setutxent() {
    MuslModRawLibc.setutxent()
}

public actual fun endutxent() {
    MuslModRawLibc.endutxent()
}

public actual fun utmpxname(file: String?): CInt =
    MuslModRawLibc.utmpxname(file)

public actual fun pthreadTryjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?): CInt =
    MuslModRawLibc.pthreadTryjoinNp(thread, retval?.value ?: 0L)

public actual fun pthreadTimedjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt =
    MuslModRawLibc.pthreadTimedjoinNp(thread, retval?.value ?: 0L, abstime?.toLong() ?: 0L)
