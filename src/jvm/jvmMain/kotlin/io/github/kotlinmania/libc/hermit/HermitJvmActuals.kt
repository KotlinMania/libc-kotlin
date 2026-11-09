@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.hermit

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

private object HermitJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_hermit_alloc(size: Long, align: Long): Long

    @JvmStatic
    external fun libc_hermit_allocZeroed(size: Long, align: Long): Long

    @JvmStatic
    external fun libc_hermit_realloc(ptr: Long, size: Long, align: Long, newSize: Long): Long

    @JvmStatic
    external fun libc_hermit_dealloc(ptr: Long, size: Long, align: Long)

    @JvmStatic
    external fun libc_hermit_exit(status: Int)

    @JvmStatic
    external fun libc_hermit_abort()

    @JvmStatic
    external fun libc_hermit_errno(): Int

    @JvmStatic
    external fun libc_hermit_clockGettime(clockid: Int, tp: Long): Int

    @JvmStatic
    external fun libc_hermit_nanosleep(req: Long): Int

    @JvmStatic
    external fun libc_hermit_availableParallelism(): Long

    @JvmStatic
    external fun libc_hermit_futexWait(address: Long, expected: Int, timeout: Long, flags: Int): Int

    @JvmStatic
    external fun libc_hermit_futexWake(address: Long, count: Int): Int

    @JvmStatic
    external fun libc_hermit_stat(path: String?, stat: Long): Int

    @JvmStatic
    external fun libc_hermit_fstat(fd: Int, stat: Long): Int

    @JvmStatic
    external fun libc_hermit_lstat(path: String?, stat: Long): Int

    @JvmStatic
    external fun libc_hermit_open(path: String?, flags: Int, mode: Int): Int

    @JvmStatic
    external fun libc_hermit_unlink(path: String?): Int

    @JvmStatic
    external fun libc_hermit_mkdir(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_hermit_rmdir(path: String?): Int

    @JvmStatic
    external fun libc_hermit_read(fd: Int, buf: Long, len: Long): Long

    @JvmStatic
    external fun libc_hermit_write(fd: Int, buf: Long, len: Long): Long

    @JvmStatic
    external fun libc_hermit_readv(fd: Int, iov: Long, iovcnt: Long): Long

    @JvmStatic
    external fun libc_hermit_writev(fd: Int, iov: Long, iovcnt: Long): Long

    @JvmStatic
    external fun libc_hermit_close(fd: Int): Int

    @JvmStatic
    external fun libc_hermit_dup(fd: Int): Int

    @JvmStatic
    external fun libc_hermit_fcntl(fd: Int, cmd: Int, arg: Int): Int

    @JvmStatic
    external fun libc_hermit_getdents64(fd: Int, dirp: Long, count: Long): Long

    @JvmStatic
    external fun libc_hermit_getaddrinfo(nodename: String?, servname: String?, hints: Long, res: Long): Int

    @JvmStatic
    external fun libc_hermit_freeaddrinfo(ai: Long)

    @JvmStatic
    external fun libc_hermit_socket(domain: Int, ty: Int, protocol: Int): Int

    @JvmStatic
    external fun libc_hermit_bind(sockfd: Int, addr: Long, addrlen: Int): Int

    @JvmStatic
    external fun libc_hermit_listen(sockfd: Int, backlog: Int): Int

    @JvmStatic
    external fun libc_hermit_accept(sockfd: Int, addr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libc_hermit_connect(sockfd: Int, addr: Long, addrlen: Int): Int

    @JvmStatic
    external fun libc_hermit_recv(sockfd: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_hermit_recvfrom(sockfd: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libc_hermit_send(sockfd: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_hermit_sendto(sockfd: Int, buf: Long, len: Long, flags: Int, to: Long, tolen: Int): Long

    @JvmStatic
    external fun libc_hermit_getpeername(sockfd: Int, addr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libc_hermit_getsockname(sockfd: Int, addr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libc_hermit_getsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Long): Int

    @JvmStatic
    external fun libc_hermit_setsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Int): Int

    @JvmStatic
    external fun libc_hermit_ioctl(sockfd: Int, cmd: Int, argp: Long): Int

    @JvmStatic
    external fun libc_hermit_shutdown(sockfd: Int, how: Int): Int

    @JvmStatic
    external fun libc_hermit_eventfd(initval: Long, flags: Short): Int

    @JvmStatic
    external fun libc_hermit_poll(fds: Long, nfds: Long, timeout: Int): Int
}

public actual fun alloc(size: ULong, align: ULong): COpaquePointer? =
    HermitJniBridge.libc_hermit_alloc(size.toLong(), align.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun allocZeroed(size: ULong, align: ULong): COpaquePointer? =
    HermitJniBridge.libc_hermit_allocZeroed(size.toLong(), align.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(ptr: COpaquePointer?, size: ULong, align: ULong, newSize: ULong): COpaquePointer? =
    HermitJniBridge.libc_hermit_realloc((ptr?.value ?: 0L), size.toLong(), align.toLong(), newSize.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dealloc(ptr: COpaquePointer?, size: ULong, align: ULong) {
    HermitJniBridge.libc_hermit_dealloc((ptr?.value ?: 0L), size.toLong(), align.toLong())
}

public actual fun exit(status: Int): Nothing {
    HermitJniBridge.libc_hermit_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    HermitJniBridge.libc_hermit_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun errno(): Int =
    HermitJniBridge.libc_hermit_errno()

public actual fun clockGettime(clockid: ClockidT, tp: COpaquePointer?): Int =
    HermitJniBridge.libc_hermit_clockGettime(clockid, (tp?.value ?: 0L))

public actual fun nanosleep(req: COpaquePointer?): Int =
    HermitJniBridge.libc_hermit_nanosleep((req?.value ?: 0L))

public actual fun availableParallelism(): ULong =
    HermitJniBridge.libc_hermit_availableParallelism().toULong()

public actual fun futexWait(address: COpaquePointer?, expected: UInt, timeout: COpaquePointer?, flags: UInt): Int =
    HermitJniBridge.libc_hermit_futexWait((address?.value ?: 0L), expected.toInt(), (timeout?.value ?: 0L), flags.toInt())

public actual fun futexWake(address: COpaquePointer?, count: Int): Int =
    HermitJniBridge.libc_hermit_futexWake((address?.value ?: 0L), count)

public actual fun stat(path: String?, stat: COpaquePointer?): Int =
    HermitJniBridge.libc_hermit_stat(path, (stat?.value ?: 0L))

public actual fun fstat(fd: Int, stat: COpaquePointer?): Int =
    HermitJniBridge.libc_hermit_fstat(fd, (stat?.value ?: 0L))

public actual fun lstat(path: String?, stat: COpaquePointer?): Int =
    HermitJniBridge.libc_hermit_lstat(path, (stat?.value ?: 0L))

public actual fun open(path: String?, flags: Int, mode: ModeT): Int =
    HermitJniBridge.libc_hermit_open(path, flags, mode.toInt())

public actual fun unlink(path: String?): Int =
    HermitJniBridge.libc_hermit_unlink(path)

public actual fun mkdir(path: String?, mode: ModeT): Int =
    HermitJniBridge.libc_hermit_mkdir(path, mode.toInt())

public actual fun rmdir(path: String?): Int =
    HermitJniBridge.libc_hermit_rmdir(path)

public actual fun read(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    HermitJniBridge.libc_hermit_read(fd, (buf?.value ?: 0L), len.toLong())

public actual fun write(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    HermitJniBridge.libc_hermit_write(fd, (buf?.value ?: 0L), len.toLong())

public actual fun readv(fd: Int, iov: COpaquePointer?, iovcnt: ULong): Long =
    HermitJniBridge.libc_hermit_readv(fd, (iov?.value ?: 0L), iovcnt.toLong())

public actual fun writev(fd: Int, iov: COpaquePointer?, iovcnt: ULong): Long =
    HermitJniBridge.libc_hermit_writev(fd, (iov?.value ?: 0L), iovcnt.toLong())

public actual fun close(fd: Int): Int =
    HermitJniBridge.libc_hermit_close(fd)

public actual fun dup(fd: Int): Int =
    HermitJniBridge.libc_hermit_dup(fd)

public actual fun fcntl(fd: Int, cmd: Int, arg: Int): Int =
    HermitJniBridge.libc_hermit_fcntl(fd, cmd, arg)

public actual fun getdents64(fd: Int, dirp: COpaquePointer?, count: ULong): Long =
    HermitJniBridge.libc_hermit_getdents64(fd, (dirp?.value ?: 0L), count.toLong())

public actual fun getaddrinfo(nodename: String?, servname: String?, hints: COpaquePointer?, res: COpaquePointer?): Int =
    HermitJniBridge.libc_hermit_getaddrinfo(nodename, servname, (hints?.value ?: 0L), (res?.value ?: 0L))

public actual fun freeaddrinfo(ai: COpaquePointer?) {
    HermitJniBridge.libc_hermit_freeaddrinfo((ai?.value ?: 0L))
}

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    HermitJniBridge.libc_hermit_socket(domain, ty, protocol)

public actual fun bind(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    HermitJniBridge.libc_hermit_bind(sockfd, (addr?.value ?: 0L), addrlen.toInt())

public actual fun listen(sockfd: Int, backlog: Int): Int =
    HermitJniBridge.libc_hermit_listen(sockfd, backlog)

public actual fun accept(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    HermitJniBridge.libc_hermit_accept(sockfd, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun connect(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    HermitJniBridge.libc_hermit_connect(sockfd, (addr?.value ?: 0L), addrlen.toInt())

public actual fun recv(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    HermitJniBridge.libc_hermit_recv(sockfd, (buf?.value ?: 0L), len.toLong(), flags)

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Long =
    HermitJniBridge.libc_hermit_recvfrom(sockfd, (buf?.value ?: 0L), len.toLong(), flags, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun send(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    HermitJniBridge.libc_hermit_send(sockfd, (buf?.value ?: 0L), len.toLong(), flags)

public actual fun sendto(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: COpaquePointer?, tolen: SocklenT): Long =
    HermitJniBridge.libc_hermit_sendto(sockfd, (buf?.value ?: 0L), len.toLong(), flags, (to?.value ?: 0L), tolen.toInt())

public actual fun getpeername(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    HermitJniBridge.libc_hermit_getpeername(sockfd, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun getsockname(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    HermitJniBridge.libc_hermit_getsockname(sockfd, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: COpaquePointer?): Int =
    HermitJniBridge.libc_hermit_getsockopt(sockfd, level, optname, (optval?.value ?: 0L), (optlen?.value ?: 0L))

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: SocklenT): Int =
    HermitJniBridge.libc_hermit_setsockopt(sockfd, level, optname, (optval?.value ?: 0L), optlen.toInt())

public actual fun ioctl(sockfd: Int, cmd: Int, argp: COpaquePointer?): Int =
    HermitJniBridge.libc_hermit_ioctl(sockfd, cmd, (argp?.value ?: 0L))

public actual fun shutdown(sockfd: Int, how: Int): Int =
    HermitJniBridge.libc_hermit_shutdown(sockfd, how)

public actual fun eventfd(initval: ULong, flags: Short): Int =
    HermitJniBridge.libc_hermit_eventfd(initval.toLong(), flags)

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: Int): Int =
    HermitJniBridge.libc_hermit_poll((fds?.value ?: 0L), nfds.toLong(), timeout)
