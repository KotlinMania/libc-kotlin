package io.github.kotlinmania.libc.unix.linuxlike.linux.musl
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.Tm

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun prlimit(pid: Int, resource: Int, newLimit: Rlimit?, oldLimit: Rlimit?): Int =
    throw UnsupportedOperationException("prlimit requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun ptrace(request: Int, vararg args: Any?): Long =
    throw UnsupportedOperationException("ptrace requires N-API addon")

public actual fun getpriority(which: Int, who: UInt): Int =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun setpriority(which: Int, who: UInt, prio: Int): Int =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun fanotifyMark(fd: Int, flags: UInt, mask: ULong, dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("fanotifyMark requires N-API addon")

public actual fun preadv2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long =
    throw UnsupportedOperationException("preadv2 requires N-API addon")

public actual fun pwritev2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long =
    throw UnsupportedOperationException("pwritev2 requires N-API addon")

public actual fun getauxval(type: ULong): ULong =
    throw UnsupportedOperationException("getauxval requires N-API addon")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("explicitBzero requires N-API addon")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires N-API addon")

public actual fun adjtimex(buf: Timex?): Int =
    throw UnsupportedOperationException("adjtimex requires N-API addon")

public actual fun clockAdjtime(clkId: Int, buf: Timex?): Int =
    throw UnsupportedOperationException("clockAdjtime requires N-API addon")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid requires N-API addon")

public actual fun memfdCreate(name: String?, flags: UInt): Int =
    throw UnsupportedOperationException("memfdCreate requires N-API addon")

public actual fun mlock2(addr: COpaquePointer?, len: ULong, flags: UInt): Int =
    throw UnsupportedOperationException("mlock2 requires N-API addon")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires N-API addon")

public actual fun euidaccess(pathname: String?, mode: Int): Int =
    throw UnsupportedOperationException("euidaccess requires N-API addon")

public actual fun eaccess(pathname: String?, mode: Int): Int =
    throw UnsupportedOperationException("eaccess requires N-API addon")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR requires N-API addon")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires N-API addon")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename requires N-API addon")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom requires N-API addon")

public actual fun posixSpawnFileActionsAddchdirNp(actions: io.github.kotlinmania.libc.COpaquePointer?, path: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp requires N-API addon")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp requires N-API addon")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires N-API addon")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires N-API addon")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires N-API addon")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires N-API addon")

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent requires N-API addon")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent requires N-API addon")

public actual fun utmpxname(file: String?): Int =
    throw UnsupportedOperationException("utmpxname requires N-API addon")

public actual fun pthreadTryjoinNp(thread: io.github.kotlinmania.libc.COpaquePointer?, retval: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadTryjoinNp requires N-API addon")

public actual fun pthreadTimedjoinNp(thread: io.github.kotlinmania.libc.COpaquePointer?, retval: COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadTimedjoinNp requires N-API addon")
