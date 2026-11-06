package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.COpaquePointer

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').prlimit(pid, resource, newLimit?.toLong() ?: 0L, oldLimit?.toLong() ?: 0L)") as CInt

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)") as CInt

public actual fun getpriority(which: CInt, who: IdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpriority(which, who)") as CInt

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setpriority(which, who, prio)") as CInt

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fanotifyMark(fd, flags, mask, dirfd, path)") as CInt

public actual fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv2(fd, iov?.toLong() ?: 0L, iovcnt, offset, flags)") as SsizeT

public actual fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev2(fd, iov?.toLong() ?: 0L, iovcnt, offset, flags)") as SsizeT

public actual fun getauxval(type: CUlong): CUlong =
    js("require('@kotlinmania/libc-native-bindings').getauxval(type)") as CUlong

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').explicitBzero(s?.value ?: 0L, len)")
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').reallocarray(ptr?.value ?: 0L, nmemb, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun adjtimex(buf: io.github.kotlinmania.libc.Timex?): CInt =
    js("require('@kotlinmania/libc-native-bindings').adjtimex(buf?.toLong() ?: 0L)") as CInt

public actual fun clockAdjtime(clkId: ClockidT, buf: io.github.kotlinmania.libc.Timex?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockAdjtime(clkId, buf?.toLong() ?: 0L)") as CInt

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctermid(s?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').memfdCreate(name, flags)") as CInt

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').mlock2(addr?.value ?: 0L, len, flags)") as CInt

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').mallocUsableSize(ptr?.value ?: 0L)") as SizeT

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').euidaccess(pathname, mode)") as CInt

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').eaccess(pathname, mode)") as CInt

public actual fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').asctimeR(tm?.toLong() ?: 0L, buf?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dirname(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').basename(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').getrandom(buf?.value ?: 0L, buflen, flags)") as SsizeT

public actual fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT?, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddchdirNp(actions?.toLong() ?: 0L, path)") as CInt

public actual fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddfchdirNp(actions?.toLong() ?: 0L, fd)") as CInt

public actual fun getutxent(): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxent()") as Utmpx?

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxid(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').pututxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun setutxent() {
    js("require('@kotlinmania/libc-native-bindings').setutxent()")
}

public actual fun endutxent() {
    js("require('@kotlinmania/libc-native-bindings').endutxent()")
}

public actual fun utmpxname(file: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utmpxname(file)") as CInt

public actual fun pthreadTryjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadTryjoinNp(thread, retval?.value ?: 0L)") as CInt

public actual fun pthreadTimedjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadTimedjoinNp(thread, retval?.value ?: 0L, abstime?.toLong() ?: 0L)") as CInt
