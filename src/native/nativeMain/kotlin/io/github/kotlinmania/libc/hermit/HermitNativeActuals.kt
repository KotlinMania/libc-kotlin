@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.hermit

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun alloc(size: ULong, align: ULong): COpaquePointer? =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_alloc(size, align)?.let { COpaquePointer(it.toLong()) }

public actual fun allocZeroed(size: ULong, align: ULong): COpaquePointer? =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_allocZeroed(size, align)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(ptr: COpaquePointer?, size: ULong, align: ULong, newSize: ULong): COpaquePointer? =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_realloc(ptr?.value?.toCPointer<ByteVar>(), size, align, newSize)?.let { COpaquePointer(it.toLong()) }

public actual fun dealloc(ptr: COpaquePointer?, size: ULong, align: ULong) {
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_dealloc(ptr?.value?.toCPointer<ByteVar>(), size, align)
}

public actual fun exit(status: Int): Nothing {
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun errno(): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_errno()

public actual fun clockGettime(clockid: ClockidT, tp: COpaquePointer?): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_clockGettime(clockid, tp?.value?.toCPointer<ByteVar>())

public actual fun nanosleep(req: COpaquePointer?): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_nanosleep(req?.value?.toCPointer<ByteVar>())

public actual fun availableParallelism(): ULong =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_availableParallelism()

public actual fun futexWait(address: COpaquePointer?, expected: UInt, timeout: COpaquePointer?, flags: UInt): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_futexWait(address?.value?.toCPointer<ByteVar>(), expected, timeout?.value?.toCPointer<ByteVar>(), flags)

public actual fun futexWake(address: COpaquePointer?, count: Int): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_futexWake(address?.value?.toCPointer<ByteVar>(), count)

public actual fun stat(path: String?, stat: COpaquePointer?): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_stat(path, stat?.value?.toCPointer<ByteVar>())

public actual fun fstat(fd: Int, stat: COpaquePointer?): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_fstat(fd, stat?.value?.toCPointer<ByteVar>())

public actual fun lstat(path: String?, stat: COpaquePointer?): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_lstat(path, stat?.value?.toCPointer<ByteVar>())

public actual fun open(path: String?, flags: Int, mode: ModeT): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_open(path, flags, mode)

public actual fun unlink(path: String?): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_unlink(path)

public actual fun mkdir(path: String?, mode: ModeT): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_mkdir(path, mode)

public actual fun rmdir(path: String?): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_rmdir(path)

public actual fun read(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_read(fd, buf?.value?.toCPointer<ByteVar>(), len)

public actual fun write(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_write(fd, buf?.value?.toCPointer<ByteVar>(), len)

public actual fun readv(fd: Int, iov: COpaquePointer?, iovcnt: ULong): Long =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun writev(fd: Int, iov: COpaquePointer?, iovcnt: ULong): Long =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun close(fd: Int): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_close(fd)

public actual fun dup(fd: Int): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_dup(fd)

public actual fun fcntl(fd: Int, cmd: Int, arg: Int): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_fcntl(fd, cmd, arg)

public actual fun getdents64(fd: Int, dirp: COpaquePointer?, count: ULong): Long =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_getdents64(fd, dirp?.value?.toCPointer<ByteVar>(), count)

public actual fun getaddrinfo(nodename: String?, servname: String?, hints: COpaquePointer?, res: COpaquePointer?): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_getaddrinfo(nodename, servname, hints?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())

public actual fun freeaddrinfo(ai: COpaquePointer?) {
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_freeaddrinfo(ai?.value?.toCPointer<ByteVar>())
}

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_socket(domain, ty, protocol)

public actual fun bind(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_bind(sockfd, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun listen(sockfd: Int, backlog: Int): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_listen(sockfd, backlog)

public actual fun accept(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_accept(sockfd, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun connect(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_connect(sockfd, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun recv(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_recv(sockfd, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Long =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_recvfrom(sockfd, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun send(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_send(sockfd, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun sendto(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: COpaquePointer?, tolen: SocklenT): Long =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_sendto(sockfd, buf?.value?.toCPointer<ByteVar>(), len, flags, to?.value?.toCPointer<ByteVar>(), tolen)

public actual fun getpeername(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_getpeername(sockfd, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun getsockname(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_getsockname(sockfd, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: COpaquePointer?): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_getsockopt(sockfd, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen?.value?.toCPointer<ByteVar>())

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: SocklenT): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_setsockopt(sockfd, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen)

public actual fun ioctl(sockfd: Int, cmd: Int, argp: COpaquePointer?): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_ioctl(sockfd, cmd, argp?.value?.toCPointer<ByteVar>())

public actual fun shutdown(sockfd: Int, how: Int): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_shutdown(sockfd, how)

public actual fun eventfd(initval: ULong, flags: Short): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_eventfd(initval, flags)

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: Int): Int =
    io.github.kotlinmania.libc.hermit.cinterop.libc_hermit_poll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout)
