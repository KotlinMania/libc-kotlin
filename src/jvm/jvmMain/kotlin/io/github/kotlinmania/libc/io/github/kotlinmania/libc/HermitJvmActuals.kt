package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.COpaquePointer

internal object HermitRawLibc {
    external fun alloc(size: Long, align: Long): Long?
    external fun allocZeroed(size: Long, align: Long): Long?
    external fun realloc(ptr: Long, size: Long, align: Long, newSize: Long): Long?
    external fun dealloc(ptr: Long, size: Long, align: Long)
    external fun exit(status: Int): Long
    external fun abort(): Long
    external fun errno(): Int
    external fun clockGettime(clockid: Int, tp: Long): Int
    external fun nanosleep(req: Long): Int
    external fun availableParallelism(): Long
    external fun futexWait(address: Long, expected: Int, timeout: Long, flags: Int): Int
    external fun futexWake(address: Long, count: Int): Int
    external fun stat(path: String?, stat: Long): Int
    external fun fstat(fd: Int, stat: Long): Int
    external fun lstat(path: String?, stat: Long): Int
    external fun open(path: String?, flags: Int, mode: Int): Int
    external fun unlink(path: String?): Int
    external fun mkdir(path: String?, mode: Int): Int
    external fun rmdir(path: String?): Int
    external fun read(fd: Int, buf: Long, len: Long): Long
    external fun write(fd: Int, buf: Long, len: Long): Long
    external fun readv(fd: Int, iov: Long, iovcnt: Long): Long
    external fun writev(fd: Int, iov: Long, iovcnt: Long): Long
    external fun close(fd: Int): Int
    external fun dup(fd: Int): Int
    external fun fcntl(fd: Int, cmd: Int, arg: Int): Int
    external fun getdents64(fd: Int, dirp: Long, count: Long): Long
    external fun getaddrinfo(nodename: String?, servname: String?, hints: Long, res: Long): Int
    external fun freeaddrinfo(ai: Long)
    external fun socket(domain: Int, ty: Int, protocol: Int): Int
    external fun bind(sockfd: Int, addr: Long, addrlen: Int): Int
    external fun listen(sockfd: Int, backlog: Int): Int
    external fun accept(sockfd: Int, addr: Long, addrlen: Long): Int
    external fun connect(sockfd: Int, addr: Long, addrlen: Int): Int
    external fun recv(sockfd: Int, buf: Long, len: Long, flags: Int): Long
    external fun recvfrom(sockfd: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long
    external fun send(sockfd: Int, buf: Long, len: Long, flags: Int): Long
    external fun sendto(sockfd: Int, buf: Long, len: Long, flags: Int, to: Long, tolen: Int): Long
    external fun getpeername(sockfd: Int, addr: Long, addrlen: Long): Int
    external fun getsockname(sockfd: Int, addr: Long, addrlen: Long): Int
    external fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Long): Int
    external fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Int): Int
    external fun ioctl(sockfd: Int, cmd: Int, argp: Long): Int
    external fun shutdown(sockfd: Int, how: Int): Int
    external fun eventfd(initval: Long, flags: Short): Int
    external fun poll(fds: Long, nfds: Long, timeout: Int): Int
}

public actual fun alloc(size: ULong, align: ULong): COpaquePointer? =
    HermitRawLibc.alloc(size, align).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun allocZeroed(size: ULong, align: ULong): COpaquePointer? =
    HermitRawLibc.allocZeroed(size, align).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(ptr: COpaquePointer?, size: ULong, align: ULong, newSize: ULong): COpaquePointer? =
    HermitRawLibc.realloc(ptr?.value ?: 0L, size, align, newSize).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dealloc(ptr: COpaquePointer?, size: ULong, align: ULong) {
    HermitRawLibc.dealloc(ptr?.value ?: 0L, size, align)
}

public actual fun exit(status: Int): Nothing =
    HermitRawLibc.exit(status)

public actual fun abort(): Nothing =
    HermitRawLibc.abort()

public actual fun errno(): Int =
    HermitRawLibc.errno()

public actual fun clockGettime(clockid: ClockidT, tp: Timespec?): Int =
    HermitRawLibc.clockGettime(clockid, tp?.toLong() ?: 0L)

public actual fun nanosleep(req: Timespec?): Int =
    HermitRawLibc.nanosleep(req?.toLong() ?: 0L)

public actual fun availableParallelism(): ULong =
    HermitRawLibc.availableParallelism()

public actual fun futexWait(address: UInt?, expected: UInt, timeout: Timespec?, flags: UInt): Int =
    HermitRawLibc.futexWait(address?.toLong() ?: 0L, expected, timeout?.toLong() ?: 0L, flags)

public actual fun futexWake(address: UInt?, count: Int): Int =
    HermitRawLibc.futexWake(address?.toLong() ?: 0L, count)

public actual fun stat(path: String?, stat: Stat?): Int =
    HermitRawLibc.stat(path, stat?.toLong() ?: 0L)

public actual fun fstat(fd: Int, stat: Stat?): Int =
    HermitRawLibc.fstat(fd, stat?.toLong() ?: 0L)

public actual fun lstat(path: String?, stat: Stat?): Int =
    HermitRawLibc.lstat(path, stat?.toLong() ?: 0L)

public actual fun open(path: String?, flags: Int, mode: ModeT): Int =
    HermitRawLibc.open(path, flags, mode)

public actual fun unlink(path: String?): Int =
    HermitRawLibc.unlink(path)

public actual fun mkdir(path: String?, mode: ModeT): Int =
    HermitRawLibc.mkdir(path, mode)

public actual fun rmdir(path: String?): Int =
    HermitRawLibc.rmdir(path)

public actual fun read(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    HermitRawLibc.read(fd, buf?.value ?: 0L, len)

public actual fun write(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    HermitRawLibc.write(fd, buf?.value ?: 0L, len)

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: ULong): Long =
    HermitRawLibc.readv(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: ULong): Long =
    HermitRawLibc.writev(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun close(fd: Int): Int =
    HermitRawLibc.close(fd)

public actual fun dup(fd: Int): Int =
    HermitRawLibc.dup(fd)

public actual fun fcntl(fd: Int, cmd: Int, arg: Int): Int =
    HermitRawLibc.fcntl(fd, cmd, arg)

public actual fun getdents64(fd: Int, dirp: Dirent64?, count: ULong): Long =
    HermitRawLibc.getdents64(fd, dirp?.toLong() ?: 0L, count)

public actual fun getaddrinfo(nodename: String?, servname: String?, hints: Addrinfo?, res: COpaquePointer?): Int =
    HermitRawLibc.getaddrinfo(nodename, servname, hints?.toLong() ?: 0L, res?.value ?: 0L)

public actual fun freeaddrinfo(ai: Addrinfo?) {
    HermitRawLibc.freeaddrinfo(ai?.toLong() ?: 0L)
}

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    HermitRawLibc.socket(domain, ty, protocol)

public actual fun bind(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int =
    HermitRawLibc.bind(sockfd, addr?.toLong() ?: 0L, addrlen)

public actual fun listen(sockfd: Int, backlog: Int): Int =
    HermitRawLibc.listen(sockfd, backlog)

public actual fun accept(sockfd: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    HermitRawLibc.accept(sockfd, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun connect(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int =
    HermitRawLibc.connect(sockfd, addr?.toLong() ?: 0L, addrlen)

public actual fun recv(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    HermitRawLibc.recv(sockfd, buf?.value ?: 0L, len, flags)

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    HermitRawLibc.recvfrom(sockfd, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun send(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    HermitRawLibc.send(sockfd, buf?.value ?: 0L, len, flags)

public actual fun sendto(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: Sockaddr?, tolen: SocklenT): Long =
    HermitRawLibc.sendto(sockfd, buf?.value ?: 0L, len, flags, to?.toLong() ?: 0L, tolen)

public actual fun getpeername(sockfd: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    HermitRawLibc.getpeername(sockfd, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun getsockname(sockfd: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    HermitRawLibc.getsockname(sockfd, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt?): Int =
    HermitRawLibc.getsockopt(sockfd, level, optname, optval?.value ?: 0L, optlen?.toLong() ?: 0L)

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: SocklenT): Int =
    HermitRawLibc.setsockopt(sockfd, level, optname, optval?.value ?: 0L, optlen)

public actual fun ioctl(sockfd: Int, cmd: Int, argp: COpaquePointer?): Int =
    HermitRawLibc.ioctl(sockfd, cmd, argp?.value ?: 0L)

public actual fun shutdown(sockfd: Int, how: Int): Int =
    HermitRawLibc.shutdown(sockfd, how)

public actual fun eventfd(initval: ULong, flags: Short): Int =
    HermitRawLibc.eventfd(initval, flags)

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: Int): Int =
    HermitRawLibc.poll(fds?.toLong() ?: 0L, nfds, timeout)
