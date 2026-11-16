@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.hermit

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitAbort
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitAccept
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitAlloc
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitAllocZeroed
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitAvailableParallelism
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitBind
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitClockGettime
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitClose
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitConnect
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitDealloc
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitDup
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitErrno
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitEventfd
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitExit
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitFcntl
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitFreeaddrinfo
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitFstat
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitFutexWait
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitFutexWake
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitGetaddrinfo
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitGetdents64
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitGetpeername
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitGetsockname
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitGetsockopt
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitIoctl
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitListen
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitLstat
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitMkdir
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitNanosleep
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitOpen
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitPoll
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitRead
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitReadv
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitRealloc
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitRecv
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitRecvfrom
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitRmdir
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitSend
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitSendto
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitSetsockopt
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitShutdown
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitSocket
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitStat
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitUnlink
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitWrite
import io.github.kotlinmania.libc.hermit.cinterop.libcHermitWritev
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun alloc(size: ULong, align: ULong): MutPtr =
    MutPtr(libcHermitAlloc(size, align)?.toLong() ?: 0L)

public actual fun allocZeroed(size: ULong, align: ULong): MutPtr =
    MutPtr(libcHermitAllocZeroed(size, align)?.toLong() ?: 0L)

public actual fun realloc(ptr: MutPtr, size: ULong, align: ULong, newSize: ULong): MutPtr =
    MutPtr(libcHermitRealloc(ptr.rawAddress.toCPointer<ByteVar>(), size, align, newSize)?.toLong() ?: 0L)

public actual fun dealloc(ptr: MutPtr, size: ULong, align: ULong) {
    libcHermitDealloc(ptr.rawAddress.toCPointer<ByteVar>(), size, align)
}

public actual fun exit(status: Int): Nothing {
    libcHermitExit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    libcHermitAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun errno(): Int =
    libcHermitErrno()

public actual fun clockGettime(clockid: ClockidT, tp: MutPtr): Int =
    libcHermitClockGettime(clockid, tp.rawAddress.toCPointer<ByteVar>())

public actual fun nanosleep(req: ConstPtr): Int =
    libcHermitNanosleep(req.rawAddress.toCPointer<ByteVar>())

public actual fun availableParallelism(): ULong =
    libcHermitAvailableParallelism()

public actual fun futexWait(address: MutPtr, expected: UInt, timeout: ConstPtr, flags: UInt): Int =
    libcHermitFutexWait(address.rawAddress.toCPointer<ByteVar>(), expected, timeout.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun futexWake(address: MutPtr, count: Int): Int =
    libcHermitFutexWake(address.rawAddress.toCPointer<ByteVar>(), count)

public actual fun stat(path: ConstPtr, stat: MutPtr): Int =
    libcHermitStat(path.rawAddress.toCPointer<ByteVar>(), stat.rawAddress.toCPointer<ByteVar>())

public actual fun fstat(fd: Int, stat: MutPtr): Int =
    libcHermitFstat(fd, stat.rawAddress.toCPointer<ByteVar>())

public actual fun lstat(path: ConstPtr, stat: MutPtr): Int =
    libcHermitLstat(path.rawAddress.toCPointer<ByteVar>(), stat.rawAddress.toCPointer<ByteVar>())

public actual fun open(path: ConstPtr, flags: Int, mode: ModeT): Int =
    libcHermitOpen(path.rawAddress.toCPointer<ByteVar>(), flags, mode)

public actual fun unlink(path: ConstPtr): Int =
    libcHermitUnlink(path.rawAddress.toCPointer<ByteVar>())

public actual fun mkdir(path: ConstPtr, mode: ModeT): Int =
    libcHermitMkdir(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun rmdir(path: ConstPtr): Int =
    libcHermitRmdir(path.rawAddress.toCPointer<ByteVar>())

public actual fun read(fd: Int, buf: MutPtr, len: ULong): Long =
    libcHermitRead(fd, buf.rawAddress.toCPointer<ByteVar>(), len)

public actual fun write(fd: Int, buf: ConstPtr, len: ULong): Long =
    libcHermitWrite(fd, buf.rawAddress.toCPointer<ByteVar>(), len)

public actual fun readv(fd: Int, iov: ConstPtr, iovcnt: ULong): Long =
    libcHermitReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun writev(fd: Int, iov: ConstPtr, iovcnt: ULong): Long =
    libcHermitWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun close(fd: Int): Int =
    libcHermitClose(fd)

public actual fun dup(fd: Int): Int =
    libcHermitDup(fd)

public actual fun fcntl(fd: Int, cmd: Int, arg: Int): Int =
    libcHermitFcntl(fd, cmd, arg)

public actual fun getdents64(fd: Int, dirp: MutPtr, count: ULong): Long =
    libcHermitGetdents64(fd, dirp.rawAddress.toCPointer<ByteVar>(), count)

public actual fun getaddrinfo(nodename: ConstPtr, servname: ConstPtr, hints: ConstPtr, res: MutPtr): Int =
    libcHermitGetaddrinfo(nodename.rawAddress.toCPointer<ByteVar>(), servname.rawAddress.toCPointer<ByteVar>(), hints.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())

public actual fun freeaddrinfo(ai: MutPtr) {
    libcHermitFreeaddrinfo(ai.rawAddress.toCPointer<ByteVar>())
}

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    libcHermitSocket(domain, ty, protocol)

public actual fun bind(sockfd: Int, addr: ConstPtr, addrlen: SocklenT): Int =
    libcHermitBind(sockfd, addr.rawAddress.toCPointer<ByteVar>(), addrlen)

public actual fun listen(sockfd: Int, backlog: Int): Int =
    libcHermitListen(sockfd, backlog)

public actual fun accept(sockfd: Int, addr: MutPtr, addrlen: MutPtr): Int =
    libcHermitAccept(sockfd, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun connect(sockfd: Int, addr: ConstPtr, addrlen: SocklenT): Int =
    libcHermitConnect(sockfd, addr.rawAddress.toCPointer<ByteVar>(), addrlen)

public actual fun recv(sockfd: Int, buf: MutPtr, len: ULong, flags: Int): Long =
    libcHermitRecv(sockfd, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(sockfd: Int, buf: MutPtr, len: ULong, flags: Int, addr: MutPtr, addrlen: MutPtr): Long =
    libcHermitRecvfrom(sockfd, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun send(sockfd: Int, buf: ConstPtr, len: ULong, flags: Int): Long =
    libcHermitSend(sockfd, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun sendto(sockfd: Int, buf: ConstPtr, len: ULong, flags: Int, to: ConstPtr, tolen: SocklenT): Long =
    libcHermitSendto(sockfd, buf.rawAddress.toCPointer<ByteVar>(), len, flags, to.rawAddress.toCPointer<ByteVar>(), tolen)

public actual fun getpeername(sockfd: Int, addr: MutPtr, addrlen: MutPtr): Int =
    libcHermitGetpeername(sockfd, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun getsockname(sockfd: Int, addr: MutPtr, addrlen: MutPtr): Int =
    libcHermitGetsockname(sockfd, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: MutPtr, optlen: MutPtr): Int =
    libcHermitGetsockopt(sockfd, level, optname, optval.rawAddress.toCPointer<ByteVar>(), optlen.rawAddress.toCPointer<ByteVar>())

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: ConstPtr, optlen: SocklenT): Int =
    libcHermitSetsockopt(sockfd, level, optname, optval.rawAddress.toCPointer<ByteVar>(), optlen)

public actual fun ioctl(sockfd: Int, cmd: Int, argp: MutPtr): Int =
    libcHermitIoctl(sockfd, cmd, argp.rawAddress.toCPointer<ByteVar>())

public actual fun shutdown(sockfd: Int, how: Int): Int =
    libcHermitShutdown(sockfd, how)

public actual fun eventfd(initval: ULong, flags: Short): Int =
    libcHermitEventfd(initval, flags)

public actual fun poll(fds: MutPtr, nfds: NfdsT, timeout: Int): Int =
    libcHermitPoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout)
