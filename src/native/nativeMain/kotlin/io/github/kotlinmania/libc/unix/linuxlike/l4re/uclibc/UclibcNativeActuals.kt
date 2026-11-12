@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

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
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libcUnixLinuxlikeL4reUclibcGetauxval
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libcUnixLinuxlikeL4reUclibcGetnameinfo
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libcUnixLinuxlikeL4reUclibcGetrlimit
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libcUnixLinuxlikeL4reUclibcGetrlimit64
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libcUnixLinuxlikeL4reUclibcGettimeofday
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libcUnixLinuxlikeL4reUclibcOpenpty
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libcUnixLinuxlikeL4reUclibcPreadv
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libcUnixLinuxlikeL4reUclibcPthreadRwlockattrGetkindNp
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libcUnixLinuxlikeL4reUclibcPthreadRwlockattrSetkindNp
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libcUnixLinuxlikeL4reUclibcPwritev
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libcUnixLinuxlikeL4reUclibcSetrlimit
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.cinterop.libcUnixLinuxlikeL4reUclibcSetrlimit64
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    libcUnixLinuxlikeL4reUclibcGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    libcUnixLinuxlikeL4reUclibcPthreadRwlockattrGetkindNp(attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    libcUnixLinuxlikeL4reUclibcPthreadRwlockattrSetkindNp(attr.rawAddress.toCPointer<ByteVar>(), value)

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    libcUnixLinuxlikeL4reUclibcOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    libcUnixLinuxlikeL4reUclibcGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    libcUnixLinuxlikeL4reUclibcPwritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    libcUnixLinuxlikeL4reUclibcPreadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr<Rlimit64>): CInt =
    libcUnixLinuxlikeL4reUclibcGetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr<Rlimit64>): CInt =
    libcUnixLinuxlikeL4reUclibcSetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr<Rlimit>): CInt =
    libcUnixLinuxlikeL4reUclibcGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr<Rlimit>): CInt =
    libcUnixLinuxlikeL4reUclibcSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun getauxval(type: CUlong): CUlong =
    libcUnixLinuxlikeL4reUclibcGetauxval(type)
