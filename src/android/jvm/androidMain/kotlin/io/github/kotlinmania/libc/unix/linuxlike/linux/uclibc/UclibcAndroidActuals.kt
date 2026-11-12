@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.SocklenT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeLinuxUclibcJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrGetkindNp(attr: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrSetkindNp(attr: Long, value: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcPtrace(request: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcSendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcRecvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcOpenpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcForkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcPwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcPreadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcSethostid(hostid: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcFanotifyMark(fd: Int, flags: Int, mask: Long, dirfd: Int, path: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcGetrlimit64(resource: Long, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcSetrlimit64(resource: Long, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcGetrlimit(resource: Long, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcSetrlimit(resource: Long, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcSetpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUclibcGetauxval(type: Long): Long
}

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr, value: MutPtr): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrGetkindNp(attr.rawAddress, value.rawAddress)

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr, value: CInt): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrSetkindNp(attr.rawAddress, value)

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcPtrace(request.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcSendmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt, timeout: MutPtr): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcRecvmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags, timeout.rawAddress)

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcOpenpty(amaster.rawAddress, aslave.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcForkpty(amaster.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toInt(), serv.rawAddress, servlen.toInt(), flags)

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcPwritev(fd, iov.rawAddress, iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcPreadv(fd, iov.rawAddress, iovcnt, offset)

public actual fun sethostid(hostid: CLong): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcSethostid(hostid)

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: ConstPtr): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcFanotifyMark(fd, flags.toInt(), mask.toLong(), dirfd, path.rawAddress)

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcGetrlimit64(resource.toLong(), rlim.rawAddress)

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcSetrlimit64(resource.toLong(), rlim.rawAddress)

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcGetrlimit(resource.toLong(), rlim.rawAddress)

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcSetrlimit(resource.toLong(), rlim.rawAddress)

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcGetpriority(which.toInt(), who.toInt())

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcSetpriority(which.toInt(), who.toInt(), prio)

public actual fun getauxval(type: CUlong): CUlong =
    UnixLinuxlikeLinuxUclibcJniBridge.libcUnixLinuxlikeLinuxUclibcGetauxval(type.toLong()).toULong()
