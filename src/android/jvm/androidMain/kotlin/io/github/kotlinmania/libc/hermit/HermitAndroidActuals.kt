@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.hermit

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object HermitJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcHermitAlloc(size: Long, align: Long): Long

    @JvmStatic
    external fun libcHermitAllocZeroed(size: Long, align: Long): Long

    @JvmStatic
    external fun libcHermitRealloc(ptr: Long, size: Long, align: Long, newSize: Long): Long

    @JvmStatic
    external fun libcHermitDealloc(ptr: Long, size: Long, align: Long)

    @JvmStatic
    external fun libcHermitExit(status: Int)

    @JvmStatic
    external fun libcHermitAbort()

    @JvmStatic
    external fun libcHermitErrno(): Int

    @JvmStatic
    external fun libcHermitClockGettime(clockid: Int, tp: Long): Int

    @JvmStatic
    external fun libcHermitNanosleep(req: Long): Int

    @JvmStatic
    external fun libcHermitAvailableParallelism(): Long

    @JvmStatic
    external fun libcHermitFutexWait(address: Long, expected: Int, timeout: Long, flags: Int): Int

    @JvmStatic
    external fun libcHermitFutexWake(address: Long, count: Int): Int

    @JvmStatic
    external fun libcHermitStat(path: Long, stat: Long): Int

    @JvmStatic
    external fun libcHermitFstat(fd: Int, stat: Long): Int

    @JvmStatic
    external fun libcHermitLstat(path: Long, stat: Long): Int

    @JvmStatic
    external fun libcHermitOpen(path: Long, flags: Int, mode: Int): Int

    @JvmStatic
    external fun libcHermitUnlink(path: Long): Int

    @JvmStatic
    external fun libcHermitMkdir(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcHermitRmdir(path: Long): Int

    @JvmStatic
    external fun libcHermitRead(fd: Int, buf: Long, len: Long): Long

    @JvmStatic
    external fun libcHermitWrite(fd: Int, buf: Long, len: Long): Long

    @JvmStatic
    external fun libcHermitReadv(fd: Int, iov: Long, iovcnt: Long): Long

    @JvmStatic
    external fun libcHermitWritev(fd: Int, iov: Long, iovcnt: Long): Long

    @JvmStatic
    external fun libcHermitClose(fd: Int): Int

    @JvmStatic
    external fun libcHermitDup(fd: Int): Int

    @JvmStatic
    external fun libcHermitFcntl(fd: Int, cmd: Int, arg: Int): Int

    @JvmStatic
    external fun libcHermitGetdents64(fd: Int, dirp: Long, count: Long): Long

    @JvmStatic
    external fun libcHermitGetaddrinfo(nodename: Long, servname: Long, hints: Long, res: Long): Int

    @JvmStatic
    external fun libcHermitFreeaddrinfo(ai: Long)

    @JvmStatic
    external fun libcHermitSocket(domain: Int, ty: Int, protocol: Int): Int

    @JvmStatic
    external fun libcHermitBind(sockfd: Int, addr: Long, addrlen: Int): Int

    @JvmStatic
    external fun libcHermitListen(sockfd: Int, backlog: Int): Int

    @JvmStatic
    external fun libcHermitAccept(sockfd: Int, addr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libcHermitConnect(sockfd: Int, addr: Long, addrlen: Int): Int

    @JvmStatic
    external fun libcHermitRecv(sockfd: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcHermitRecvfrom(sockfd: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libcHermitSend(sockfd: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcHermitSendto(sockfd: Int, buf: Long, len: Long, flags: Int, to: Long, tolen: Int): Long

    @JvmStatic
    external fun libcHermitGetpeername(sockfd: Int, addr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libcHermitGetsockname(sockfd: Int, addr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libcHermitGetsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Long): Int

    @JvmStatic
    external fun libcHermitSetsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Int): Int

    @JvmStatic
    external fun libcHermitIoctl(sockfd: Int, cmd: Int, argp: Long): Int

    @JvmStatic
    external fun libcHermitShutdown(sockfd: Int, how: Int): Int

    @JvmStatic
    external fun libcHermitEventfd(initval: Long, flags: Short): Int

    @JvmStatic
    external fun libcHermitPoll(fds: Long, nfds: Long, timeout: Int): Int
}

public actual fun alloc(size: ULong, align: ULong): MutPtr<UByte> =
    MutPtr(HermitJniBridge.libcHermitAlloc(size.toLong(), align.toLong()))

public actual fun allocZeroed(size: ULong, align: ULong): MutPtr<UByte> =
    MutPtr(HermitJniBridge.libcHermitAllocZeroed(size.toLong(), align.toLong()))

public actual fun realloc(ptr: MutPtr<UByte>, size: ULong, align: ULong, newSize: ULong): MutPtr<UByte> =
    MutPtr(HermitJniBridge.libcHermitRealloc(ptr.rawAddress, size.toLong(), align.toLong(), newSize.toLong()))

public actual fun dealloc(ptr: MutPtr<UByte>, size: ULong, align: ULong) {
    HermitJniBridge.libcHermitDealloc(ptr.rawAddress, size.toLong(), align.toLong())
}

public actual fun exit(status: Int): Nothing {
    HermitJniBridge.libcHermitExit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    HermitJniBridge.libcHermitAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun errno(): Int =
    HermitJniBridge.libcHermitErrno()

public actual fun clockGettime(clockid: ClockidT, tp: MutPtr<Timespec>): Int =
    HermitJniBridge.libcHermitClockGettime(clockid, tp.rawAddress)

public actual fun nanosleep(req: ConstPtr<Timespec>): Int =
    HermitJniBridge.libcHermitNanosleep(req.rawAddress)

public actual fun availableParallelism(): ULong =
    HermitJniBridge.libcHermitAvailableParallelism().toULong()

public actual fun futexWait(address: MutPtr<UInt>, expected: UInt, timeout: ConstPtr<Timespec>, flags: UInt): Int =
    HermitJniBridge.libcHermitFutexWait(address.rawAddress, expected.toInt(), timeout.rawAddress, flags.toInt())

public actual fun futexWake(address: MutPtr<UInt>, count: Int): Int =
    HermitJniBridge.libcHermitFutexWake(address.rawAddress, count)

public actual fun stat(path: ConstPtr<CChar>, stat: MutPtr<Stat>): Int =
    HermitJniBridge.libcHermitStat(path.rawAddress, stat.rawAddress)

public actual fun fstat(fd: Int, stat: MutPtr<Stat>): Int =
    HermitJniBridge.libcHermitFstat(fd, stat.rawAddress)

public actual fun lstat(path: ConstPtr<CChar>, stat: MutPtr<Stat>): Int =
    HermitJniBridge.libcHermitLstat(path.rawAddress, stat.rawAddress)

public actual fun open(path: ConstPtr<CChar>, flags: Int, mode: ModeT): Int =
    HermitJniBridge.libcHermitOpen(path.rawAddress, flags, mode.toInt())

public actual fun unlink(path: ConstPtr<CChar>): Int =
    HermitJniBridge.libcHermitUnlink(path.rawAddress)

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): Int =
    HermitJniBridge.libcHermitMkdir(path.rawAddress, mode.toInt())

public actual fun rmdir(path: ConstPtr<CChar>): Int =
    HermitJniBridge.libcHermitRmdir(path.rawAddress)

public actual fun read(fd: Int, buf: MutPtr<UByte>, len: ULong): Long =
    HermitJniBridge.libcHermitRead(fd, buf.rawAddress, len.toLong())

public actual fun write(fd: Int, buf: ConstPtr<UByte>, len: ULong): Long =
    HermitJniBridge.libcHermitWrite(fd, buf.rawAddress, len.toLong())

public actual fun readv(fd: Int, iov: ConstPtr<Iovec>, iovcnt: ULong): Long =
    HermitJniBridge.libcHermitReadv(fd, iov.rawAddress, iovcnt.toLong())

public actual fun writev(fd: Int, iov: ConstPtr<Iovec>, iovcnt: ULong): Long =
    HermitJniBridge.libcHermitWritev(fd, iov.rawAddress, iovcnt.toLong())

public actual fun close(fd: Int): Int =
    HermitJniBridge.libcHermitClose(fd)

public actual fun dup(fd: Int): Int =
    HermitJniBridge.libcHermitDup(fd)

public actual fun fcntl(fd: Int, cmd: Int, arg: Int): Int =
    HermitJniBridge.libcHermitFcntl(fd, cmd, arg)

public actual fun getdents64(fd: Int, dirp: MutPtr<Dirent64>, count: ULong): Long =
    HermitJniBridge.libcHermitGetdents64(fd, dirp.rawAddress, count.toLong())

public actual fun getaddrinfo(nodename: ConstPtr<CChar>, servname: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): Int =
    HermitJniBridge.libcHermitGetaddrinfo(nodename.rawAddress, servname.rawAddress, hints.rawAddress, res.rawAddress)

public actual fun freeaddrinfo(ai: MutPtr<Addrinfo>) {
    HermitJniBridge.libcHermitFreeaddrinfo(ai.rawAddress)
}

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    HermitJniBridge.libcHermitSocket(domain, ty, protocol)

public actual fun bind(sockfd: Int, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): Int =
    HermitJniBridge.libcHermitBind(sockfd, addr.rawAddress, addrlen.toInt())

public actual fun listen(sockfd: Int, backlog: Int): Int =
    HermitJniBridge.libcHermitListen(sockfd, backlog)

public actual fun accept(sockfd: Int, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Int =
    HermitJniBridge.libcHermitAccept(sockfd, addr.rawAddress, addrlen.rawAddress)

public actual fun connect(sockfd: Int, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): Int =
    HermitJniBridge.libcHermitConnect(sockfd, addr.rawAddress, addrlen.toInt())

public actual fun recv(sockfd: Int, buf: MutPtr<UByte>, len: ULong, flags: Int): Long =
    HermitJniBridge.libcHermitRecv(sockfd, buf.rawAddress, len.toLong(), flags)

public actual fun recvfrom(sockfd: Int, buf: MutPtr<CVoid>, len: ULong, flags: Int, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Long =
    HermitJniBridge.libcHermitRecvfrom(sockfd, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.rawAddress)

public actual fun send(sockfd: Int, buf: ConstPtr<CVoid>, len: ULong, flags: Int): Long =
    HermitJniBridge.libcHermitSend(sockfd, buf.rawAddress, len.toLong(), flags)

public actual fun sendto(sockfd: Int, buf: ConstPtr<CVoid>, len: ULong, flags: Int, to: ConstPtr<Sockaddr>, tolen: SocklenT): Long =
    HermitJniBridge.libcHermitSendto(sockfd, buf.rawAddress, len.toLong(), flags, to.rawAddress, tolen.toInt())

public actual fun getpeername(sockfd: Int, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Int =
    HermitJniBridge.libcHermitGetpeername(sockfd, addr.rawAddress, addrlen.rawAddress)

public actual fun getsockname(sockfd: Int, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Int =
    HermitJniBridge.libcHermitGetsockname(sockfd, addr.rawAddress, addrlen.rawAddress)

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): Int =
    HermitJniBridge.libcHermitGetsockopt(sockfd, level, optname, optval.rawAddress, optlen.rawAddress)

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: ConstPtr<CVoid>, optlen: SocklenT): Int =
    HermitJniBridge.libcHermitSetsockopt(sockfd, level, optname, optval.rawAddress, optlen.toInt())

public actual fun ioctl(sockfd: Int, cmd: Int, argp: MutPtr<CVoid>): Int =
    HermitJniBridge.libcHermitIoctl(sockfd, cmd, argp.rawAddress)

public actual fun shutdown(sockfd: Int, how: Int): Int =
    HermitJniBridge.libcHermitShutdown(sockfd, how)

public actual fun eventfd(initval: ULong, flags: Short): Int =
    HermitJniBridge.libcHermitEventfd(initval.toLong(), flags)

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: Int): Int =
    HermitJniBridge.libcHermitPoll(fds.rawAddress, nfds.toLong(), timeout)
