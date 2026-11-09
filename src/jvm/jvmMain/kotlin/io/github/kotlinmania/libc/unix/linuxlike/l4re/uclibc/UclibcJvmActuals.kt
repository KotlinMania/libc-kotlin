@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.l4re.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.l4re.SocklenT

private object UnixLinuxlikeL4reUclibcJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_linuxlike_l4re_uclibc_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_l4re_uclibc_pthreadRwlockattrGetkindNp(attr: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_l4re_uclibc_pthreadRwlockattrSetkindNp(attr: Long, value: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_l4re_uclibc_openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_l4re_uclibc_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_l4re_uclibc_pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_l4re_uclibc_preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_l4re_uclibc_getrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_l4re_uclibc_setrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_l4re_uclibc_getrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_l4re_uclibc_setrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_l4re_uclibc_getauxval(type: Long): Long
}

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libc_unix_linuxlike_l4re_uclibc_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun pthreadRwlockattrGetkindNp(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libc_unix_linuxlike_l4re_uclibc_pthreadRwlockattrGetkindNp((attr?.value ?: 0L), (value?.value ?: 0L))

public actual fun pthreadRwlockattrSetkindNp(attr: COpaquePointer?, value: CInt): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libc_unix_linuxlike_l4re_uclibc_pthreadRwlockattrSetkindNp((attr?.value ?: 0L), value)

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libc_unix_linuxlike_l4re_uclibc_openpty((amaster?.value ?: 0L), (aslave?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libc_unix_linuxlike_l4re_uclibc_getnameinfo((sa?.value ?: 0L), salen.toInt(), (host?.value ?: 0L), hostlen.toInt(), (serv?.value ?: 0L), servlen.toInt(), flags)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixLinuxlikeL4reUclibcJniBridge.libc_unix_linuxlike_l4re_uclibc_pwritev(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixLinuxlikeL4reUclibcJniBridge.libc_unix_linuxlike_l4re_uclibc_preadv(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libc_unix_linuxlike_l4re_uclibc_getrlimit64(resource, (rlim?.value ?: 0L))

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libc_unix_linuxlike_l4re_uclibc_setrlimit64(resource, (rlim?.value ?: 0L))

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libc_unix_linuxlike_l4re_uclibc_getrlimit(resource, (rlim?.value ?: 0L))

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libc_unix_linuxlike_l4re_uclibc_setrlimit(resource, (rlim?.value ?: 0L))

public actual fun getauxval(type: CUlong): CUlong =
    UnixLinuxlikeL4reUclibcJniBridge.libc_unix_linuxlike_l4re_uclibc_getauxval(type.toLong()).toULong()
