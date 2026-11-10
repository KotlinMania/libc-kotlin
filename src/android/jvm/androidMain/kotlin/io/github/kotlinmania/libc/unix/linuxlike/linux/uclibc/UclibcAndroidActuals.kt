@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.SocklenT

private object UnixLinuxlikeLinuxUclibcJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrGetkindNp(attr: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrSetkindNp(attr: Long, value: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_ptrace(request: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_sendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_recvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_sethostid(hostid: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_fanotifyMark(fd: Int, flags: Int, mask: Long, dirfd: Int, path: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_getrlimit64(resource: Long, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_setrlimit64(resource: Long, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_getrlimit(resource: Long, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_setrlimit(resource: Long, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_getpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_setpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_uclibc_getauxval(type: Long): Long
}

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun pthreadRwlockattrGetkindNp(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrGetkindNp((attr?.value ?: 0L), (value?.value ?: 0L))

public actual fun pthreadRwlockattrSetkindNp(attr: COpaquePointer?, value: CInt): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrSetkindNp((attr?.value ?: 0L), value)

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_ptrace(request.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_sendmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toInt(), flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_recvmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toInt(), flags, (timeout?.value ?: 0L))

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_openpty((amaster?.value ?: 0L), (aslave?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_forkpty((amaster?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_getnameinfo((sa?.value ?: 0L), salen.toInt(), (host?.value ?: 0L), hostlen.toInt(), (serv?.value ?: 0L), servlen.toInt(), flags)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_pwritev(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_preadv(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun sethostid(hostid: CLong): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_sethostid(hostid)

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_fanotifyMark(fd, flags.toInt(), mask.toLong(), dirfd, path)

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_getrlimit64(resource.toLong(), (rlim?.value ?: 0L))

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_setrlimit64(resource.toLong(), (rlim?.value ?: 0L))

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_getrlimit(resource.toLong(), (rlim?.value ?: 0L))

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_setrlimit(resource.toLong(), (rlim?.value ?: 0L))

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_getpriority(which.toInt(), who.toInt())

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_setpriority(which.toInt(), who.toInt(), prio)

public actual fun getauxval(type: CUlong): CUlong =
    UnixLinuxlikeLinuxUclibcJniBridge.libc_unix_linuxlike_linux_uclibc_getauxval(type.toLong()).toULong()
