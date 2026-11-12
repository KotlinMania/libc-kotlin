@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.linuxlike.l4re.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.l4re.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.aarch64.Termios
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeL4reUclibcJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixLinuxlikeL4reUclibcGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeL4reUclibcPthreadRwlockattrGetkindNp(attr: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeL4reUclibcPthreadRwlockattrSetkindNp(attr: Long, value: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeL4reUclibcOpenpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeL4reUclibcGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeL4reUclibcPwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeL4reUclibcPreadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeL4reUclibcGetrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeL4reUclibcSetrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeL4reUclibcGetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeL4reUclibcSetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeL4reUclibcGetauxval(type: Long): Long
}

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libcUnixLinuxlikeL4reUclibcGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libcUnixLinuxlikeL4reUclibcPthreadRwlockattrGetkindNp(attr.rawAddress, value.rawAddress)

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libcUnixLinuxlikeL4reUclibcPthreadRwlockattrSetkindNp(attr.rawAddress, value)

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libcUnixLinuxlikeL4reUclibcOpenpty(amaster.rawAddress, aslave.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libcUnixLinuxlikeL4reUclibcGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toInt(), serv.rawAddress, servlen.toInt(), flags)

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixLinuxlikeL4reUclibcJniBridge.libcUnixLinuxlikeL4reUclibcPwritev(fd, iov.rawAddress, iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixLinuxlikeL4reUclibcJniBridge.libcUnixLinuxlikeL4reUclibcPreadv(fd, iov.rawAddress, iovcnt, offset)

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr<Rlimit64>): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libcUnixLinuxlikeL4reUclibcGetrlimit64(resource, rlim.rawAddress)

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr<Rlimit64>): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libcUnixLinuxlikeL4reUclibcSetrlimit64(resource, rlim.rawAddress)

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr<Rlimit>): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libcUnixLinuxlikeL4reUclibcGetrlimit(resource, rlim.rawAddress)

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr<Rlimit>): CInt =
    UnixLinuxlikeL4reUclibcJniBridge.libcUnixLinuxlikeL4reUclibcSetrlimit(resource, rlim.rawAddress)

public actual fun getauxval(type: CUlong): CUlong =
    UnixLinuxlikeL4reUclibcJniBridge.libcUnixLinuxlikeL4reUclibcGetauxval(type.toLong()).toULong()
