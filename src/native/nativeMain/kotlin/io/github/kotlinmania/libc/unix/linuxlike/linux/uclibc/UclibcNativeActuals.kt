@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcFanotifyMark
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcForkpty
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcGetauxval
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcGetnameinfo
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcGetpriority
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcGetrlimit
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcGetrlimit64
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcGettimeofday
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcOpenpty
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcPreadv
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrGetkindNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrSetkindNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcPtrace
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcPwritev
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcRecvmmsg
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcSendmmsg
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcSethostid
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcSetpriority
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcSetrlimit
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.cinterop.libcUnixLinuxlikeLinuxUclibcSetrlimit64
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    libcUnixLinuxlikeLinuxUclibcGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr, value: MutPtr): CInt =
    libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrGetkindNp(attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr, value: CInt): CInt =
    libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrSetkindNp(attr.rawAddress.toCPointer<ByteVar>(), value)

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    libcUnixLinuxlikeLinuxUclibcPtrace(request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxUclibcSendmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt, timeout: MutPtr): CInt =
    libcUnixLinuxlikeLinuxUclibcRecvmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    libcUnixLinuxlikeLinuxUclibcOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    libcUnixLinuxlikeLinuxUclibcForkpty(amaster.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxUclibcGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT =
    libcUnixLinuxlikeLinuxUclibcPwritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT =
    libcUnixLinuxlikeLinuxUclibcPreadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun sethostid(hostid: CLong): CInt =
    libcUnixLinuxlikeLinuxUclibcSethostid(hostid)

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxUclibcFanotifyMark(fd, flags, mask, dirfd, path.rawAddress.toCPointer<ByteVar>())

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr): CInt =
    libcUnixLinuxlikeLinuxUclibcGetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxUclibcSetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr): CInt =
    libcUnixLinuxlikeLinuxUclibcGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxUclibcSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    libcUnixLinuxlikeLinuxUclibcGetpriority(which, who)

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    libcUnixLinuxlikeLinuxUclibcSetpriority(which, who, prio)

public actual fun getauxval(type: CUlong): CUlong =
    libcUnixLinuxlikeLinuxUclibcGetauxval(type)
