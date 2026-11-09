@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.hermit

import io.github.kotlinmania.libc.*

public actual fun alloc(size: ULong, align: ULong): COpaquePointer? =
    null

public actual fun allocZeroed(size: ULong, align: ULong): COpaquePointer? =
    null

public actual fun realloc(ptr: COpaquePointer?, size: ULong, align: ULong, newSize: ULong): COpaquePointer? =
    null

public actual fun dealloc(ptr: COpaquePointer?, size: ULong, align: ULong) {
}

public actual fun exit(status: Int): Nothing =
    error("Unreachable noreturn C function exit")

public actual fun abort(): Nothing =
    error("Unreachable noreturn C function abort")

public actual fun errno(): Int =
    0

public actual fun clockGettime(clockid: ClockidT, tp: COpaquePointer?): Int =
    0

public actual fun nanosleep(req: COpaquePointer?): Int =
    0

public actual fun availableParallelism(): ULong =
    0uL

public actual fun futexWait(address: COpaquePointer?, expected: UInt, timeout: COpaquePointer?, flags: UInt): Int =
    0

public actual fun futexWake(address: COpaquePointer?, count: Int): Int =
    0

public actual fun stat(path: String?, stat: COpaquePointer?): Int =
    0

public actual fun fstat(fd: Int, stat: COpaquePointer?): Int =
    0

public actual fun lstat(path: String?, stat: COpaquePointer?): Int =
    0

public actual fun open(path: String?, flags: Int, mode: ModeT): Int =
    0

public actual fun unlink(path: String?): Int =
    0

public actual fun mkdir(path: String?, mode: ModeT): Int =
    0

public actual fun rmdir(path: String?): Int =
    0

public actual fun read(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    0L

public actual fun write(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    0L

public actual fun readv(fd: Int, iov: COpaquePointer?, iovcnt: ULong): Long =
    0L

public actual fun writev(fd: Int, iov: COpaquePointer?, iovcnt: ULong): Long =
    0L

public actual fun close(fd: Int): Int =
    0

public actual fun dup(fd: Int): Int =
    0

public actual fun fcntl(fd: Int, cmd: Int, arg: Int): Int =
    0

public actual fun getdents64(fd: Int, dirp: COpaquePointer?, count: ULong): Long =
    0L

public actual fun getaddrinfo(nodename: String?, servname: String?, hints: COpaquePointer?, res: COpaquePointer?): Int =
    0

public actual fun freeaddrinfo(ai: COpaquePointer?) {
}

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    0

public actual fun bind(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    0

public actual fun listen(sockfd: Int, backlog: Int): Int =
    0

public actual fun accept(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    0

public actual fun connect(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    0

public actual fun recv(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    0L

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Long =
    0L

public actual fun send(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    0L

public actual fun sendto(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: COpaquePointer?, tolen: SocklenT): Long =
    0L

public actual fun getpeername(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    0

public actual fun getsockname(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    0

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: COpaquePointer?): Int =
    0

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: SocklenT): Int =
    0

public actual fun ioctl(sockfd: Int, cmd: Int, argp: COpaquePointer?): Int =
    0

public actual fun shutdown(sockfd: Int, how: Int): Int =
    0

public actual fun eventfd(initval: ULong, flags: Short): Int =
    0

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: Int): Int =
    0
