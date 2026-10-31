package io.github.kotlinmania.libc.hermit

import io.github.kotlinmania.libc.COpaquePointer

public actual fun alloc(size: ULong, align: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alloc not available on Android — HermitOS target required")

public actual fun allocZeroed(size: ULong, align: ULong): COpaquePointer? =
    throw UnsupportedOperationException("allocZeroed not available on Android — HermitOS target required")

public actual fun realloc(ptr: COpaquePointer?, size: ULong, align: ULong, newSize: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on Android — HermitOS target required")

public actual fun dealloc(ptr: COpaquePointer?, size: ULong, align: ULong): Unit =
    throw UnsupportedOperationException("dealloc not available on Android — HermitOS target required")

public actual fun exit(status: Int): Nothing =
    throw UnsupportedOperationException("exit not available on Android — HermitOS target required")

public actual fun abort(): Nothing =
    throw UnsupportedOperationException("abort not available on Android — HermitOS target required")

public actual fun errno(): Int =
    throw UnsupportedOperationException("errno not available on Android — HermitOS target required")

public actual fun clockGettime(clockid: ClockidT, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime not available on Android — HermitOS target required")

public actual fun nanosleep(req: Timespec?): Int =
    throw UnsupportedOperationException("nanosleep not available on Android — HermitOS target required")

public actual fun availableParallelism(): ULong =
    throw UnsupportedOperationException("availableParallelism not available on Android — HermitOS target required")

public actual fun futexWait(
    address: UIntArray?,
    expected: UInt,
    timeout: Timespec?,
    flags: UInt,
): Int =
    throw UnsupportedOperationException("futexWait not available on Android — HermitOS target required")

public actual fun futexWake(address: UIntArray?, count: Int): Int =
    throw UnsupportedOperationException("futexWake not available on Android — HermitOS target required")

public actual fun stat(path: String?, stat: Stat?): Int =
    throw UnsupportedOperationException("stat not available on Android — HermitOS target required")

public actual fun fstat(fd: Int, stat: Stat?): Int =
    throw UnsupportedOperationException("fstat not available on Android — HermitOS target required")

public actual fun lstat(path: String?, stat: Stat?): Int =
    throw UnsupportedOperationException("lstat not available on Android — HermitOS target required")

public actual fun open(path: String?, flags: Int, mode: ModeT): Int =
    throw UnsupportedOperationException("open not available on Android — HermitOS target required")

public actual fun unlink(path: String?): Int =
    throw UnsupportedOperationException("unlink not available on Android — HermitOS target required")

public actual fun mkdir(path: String?, mode: ModeT): Int =
    throw UnsupportedOperationException("mkdir not available on Android — HermitOS target required")

public actual fun rmdir(path: String?): Int =
    throw UnsupportedOperationException("rmdir not available on Android — HermitOS target required")

public actual fun read(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    throw UnsupportedOperationException("read not available on Android — HermitOS target required")

public actual fun write(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    throw UnsupportedOperationException("write not available on Android — HermitOS target required")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: ULong): Long =
    throw UnsupportedOperationException("readv not available on Android — HermitOS target required")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: ULong): Long =
    throw UnsupportedOperationException("writev not available on Android — HermitOS target required")

public actual fun close(fd: Int): Int =
    throw UnsupportedOperationException("close not available on Android — HermitOS target required")

public actual fun dup(fd: Int): Int =
    throw UnsupportedOperationException("dup not available on Android — HermitOS target required")

public actual fun fcntl(fd: Int, cmd: Int, arg: Int): Int =
    throw UnsupportedOperationException("fcntl not available on Android — HermitOS target required")

public actual fun getdents64(fd: Int, dirp: Dirent64?, count: ULong): Long =
    throw UnsupportedOperationException("getdents64 not available on Android — HermitOS target required")

public actual fun getaddrinfo(
    nodename: String?,
    servname: String?,
    hints: Addrinfo?,
    res: COpaquePointer?,
): Int =
    throw UnsupportedOperationException("getaddrinfo not available on Android — HermitOS target required")

public actual fun freeaddrinfo(ai: Addrinfo?): Unit =
    throw UnsupportedOperationException("freeaddrinfo not available on Android — HermitOS target required")

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    throw UnsupportedOperationException("socket not available on Android — HermitOS target required")

public actual fun bind(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int =
    throw UnsupportedOperationException("bind not available on Android — HermitOS target required")

public actual fun listen(sockfd: Int, backlog: Int): Int =
    throw UnsupportedOperationException("listen not available on Android — HermitOS target required")

public actual fun accept(sockfd: Int, addr: Sockaddr?, addrlen: UIntArray?): Int =
    throw UnsupportedOperationException("accept not available on Android — HermitOS target required")

public actual fun connect(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int =
    throw UnsupportedOperationException("connect not available on Android — HermitOS target required")

public actual fun recv(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("recv not available on Android — HermitOS target required")

public actual fun recvfrom(
    sockfd: Int,
    buf: COpaquePointer?,
    len: ULong,
    flags: Int,
    addr: Sockaddr?,
    addrlen: UIntArray?,
): Long =
    throw UnsupportedOperationException("recvfrom not available on Android — HermitOS target required")

public actual fun send(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("send not available on Android — HermitOS target required")

public actual fun sendto(
    sockfd: Int,
    buf: COpaquePointer?,
    len: ULong,
    flags: Int,
    to: Sockaddr?,
    tolen: SocklenT,
): Long =
    throw UnsupportedOperationException("sendto not available on Android — HermitOS target required")

public actual fun getpeername(sockfd: Int, addr: Sockaddr?, addrlen: UIntArray?): Int =
    throw UnsupportedOperationException("getpeername not available on Android — HermitOS target required")

public actual fun getsockname(sockfd: Int, addr: Sockaddr?, addrlen: UIntArray?): Int =
    throw UnsupportedOperationException("getsockname not available on Android — HermitOS target required")

public actual fun getsockopt(
    sockfd: Int,
    level: Int,
    optname: Int,
    optval: COpaquePointer?,
    optlen: UIntArray?,
): Int =
    throw UnsupportedOperationException("getsockopt not available on Android — HermitOS target required")

public actual fun setsockopt(
    sockfd: Int,
    level: Int,
    optname: Int,
    optval: COpaquePointer?,
    optlen: SocklenT,
): Int =
    throw UnsupportedOperationException("setsockopt not available on Android — HermitOS target required")

public actual fun ioctl(sockfd: Int, cmd: Int, argp: COpaquePointer?): Int =
    throw UnsupportedOperationException("ioctl not available on Android — HermitOS target required")

public actual fun shutdown(sockfd: Int, how: Int): Int =
    throw UnsupportedOperationException("shutdown not available on Android — HermitOS target required")

public actual fun eventfd(initval: ULong, flags: Short): Int =
    throw UnsupportedOperationException("eventfd not available on Android — HermitOS target required")

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: Int): Int =
    throw UnsupportedOperationException("poll not available on Android — HermitOS target required")
