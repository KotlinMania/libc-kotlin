@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object UnixLinuxlikeLinuxMuslJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_getrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_setrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_prlimit(pid: Int, resource: Int, newLimit: Long, oldLimit: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_ptrace(request: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_getpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_setpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_fanotifyMark(fd: Int, flags: Int, mask: Long, dirfd: Int, path: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_preadv2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_pwritev2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_getauxval(type: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_explicitBzero(s: Long, len: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_reallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_adjtimex(buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_clockAdjtime(clkId: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_ctermid(s: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_memfdCreate(name: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_mlock2(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_mallocUsableSize(ptr: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_euidaccess(pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_eaccess(pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_asctimeR(tm: Long, buf: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_dirname(path: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_basename(path: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_getrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_posixSpawnFileActionsAddchdirNp(actions: Long, path: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_posixSpawnFileActionsAddfchdirNp(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_getutxent(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_getutxid(ut: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_getutxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_pututxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_setutxent()

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_endutxent()

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_utmpxname(file: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_pthreadTryjoinNp(thread: Long, retval: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_musl_pthreadTimedjoinNp(thread: Long, retval: Long, abstime: Long): Int
}

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_getrlimit(resource, (rlim?.value ?: 0L))

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_setrlimit(resource, (rlim?.value ?: 0L))

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_prlimit(pid, resource, (newLimit?.value ?: 0L), (oldLimit?.value ?: 0L))

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_ptrace(request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_getpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_setpriority(which, who.toInt(), prio)

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: String?): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_fanotifyMark(fd, flags.toInt(), mask.toLong(), dirfd, path)

public actual fun preadv2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_preadv2(fd, (iov?.value ?: 0L), iovcnt, offset, flags)

public actual fun pwritev2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_pwritev2(fd, (iov?.value ?: 0L), iovcnt, offset, flags)

public actual fun getauxval(type: CUlong): CUlong =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_getauxval(type.toLong()).toULong()

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_explicitBzero((s?.value ?: 0L), len.toLong())
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_reallocarray((ptr?.value ?: 0L), nmemb.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun adjtimex(buf: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_adjtimex((buf?.value ?: 0L))

public actual fun clockAdjtime(clkId: ClockidT, buf: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_clockAdjtime(clkId, (buf?.value ?: 0L))

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_ctermid((s?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_memfdCreate(name, flags.toInt())

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_mlock2((addr?.value ?: 0L), len.toLong(), flags.toInt())

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_mallocUsableSize((ptr?.value ?: 0L)).toULong()

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_euidaccess(pathname, mode)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_eaccess(pathname, mode)

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_asctimeR((tm?.value ?: 0L), (buf?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_dirname((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_basename((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_getrandom((buf?.value ?: 0L), buflen.toLong(), flags.toInt())

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_posixSpawnFileActionsAddchdirNp((actions?.value ?: 0L), path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_posixSpawnFileActionsAddfchdirNp((actions?.value ?: 0L), fd)

public actual fun getutxent(): COpaquePointer? =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_getutxent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_getutxid((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_getutxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_pututxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setutxent() {
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_setutxent()
}

public actual fun endutxent() {
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_endutxent()
}

public actual fun utmpxname(file: String?): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_utmpxname(file)

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_pthreadTryjoinNp((thread?.value ?: 0L), (retval?.value ?: 0L))

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxMuslJniBridge.libc_unix_linuxlike_linux_musl_pthreadTimedjoinNp((thread?.value ?: 0L), (retval?.value ?: 0L), (abstime?.value ?: 0L))
