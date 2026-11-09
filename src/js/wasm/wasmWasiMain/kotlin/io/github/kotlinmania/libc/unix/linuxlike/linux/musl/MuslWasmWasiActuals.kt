@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun ptrace(request: CInt): CLong =
    0L

public actual fun getpriority(which: CInt, who: IdT): CInt =
    0

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    0

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: String?): CInt =
    0

public actual fun preadv2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    0L

public actual fun pwritev2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    0L

public actual fun getauxval(type: CUlong): CUlong =
    0uL

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun adjtimex(buf: COpaquePointer?): CInt =
    0

public actual fun clockAdjtime(clkId: ClockidT, buf: COpaquePointer?): CInt =
    0

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    null

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    0

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt =
    0

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    0uL

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    0

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    0

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    null

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    null

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    null

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    0L

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    0

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    0

public actual fun getutxent(): COpaquePointer? =
    null

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun setutxent() {
}

public actual fun endutxent() {
}

public actual fun utmpxname(file: String?): CInt =
    0

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt =
    0

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0
