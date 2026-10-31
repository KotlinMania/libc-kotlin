@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.hermit

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import libc.cinterop.libc_abort
import libc.cinterop.libc_aligned_alloc
import libc.cinterop.libc_aligned_free
import libc.cinterop.libc_aligned_realloc
import libc.cinterop.libc_clock_gettime
import libc.cinterop.libc_clock_nanosleep
import libc.cinterop.libc_close
import libc.cinterop.libc_dup
import libc.cinterop.libc_exit
import libc.cinterop.libc_free
import libc.cinterop.libc_get_errno
import libc.cinterop.libc_ioctl
import libc.cinterop.libc_listen
import libc.cinterop.libc_memset
import libc.cinterop.libc_mkdir
import libc.cinterop.libc_open
import libc.cinterop.libc_read
import libc.cinterop.libc_readv
import libc.cinterop.libc_recv
import libc.cinterop.libc_rmdir
import libc.cinterop.libc_send
import libc.cinterop.libc_shutdown
import libc.cinterop.libc_socket
import libc.cinterop.libc_unlink
import libc.cinterop.libc_write
import libc.cinterop.libc_writev

public actual fun alloc(size: ULong, align: ULong): COpaquePointer? =
    libc_aligned_alloc(align, size)?.let { COpaquePointer(it.toLong(), align) }

public actual fun allocZeroed(size: ULong, align: ULong): COpaquePointer? {
    val raw = libc_aligned_alloc(align, size) ?: return null
    libc_memset(raw, 0, size)
    return COpaquePointer(raw.toLong(), align)
}

public actual fun realloc(ptr: COpaquePointer?, size: ULong, align: ULong, newSize: ULong): COpaquePointer? {
    val pPtr: CPointer<ByteVar>? = ptr?.value?.toCPointer()
    return libc_aligned_realloc(pPtr, newSize, align)?.let { COpaquePointer(it.toLong(), align) }
}

public actual fun dealloc(ptr: COpaquePointer?, size: ULong, align: ULong) {
    if (ptr == null) return
    val pPtr: CPointer<ByteVar>? = ptr.value.toCPointer()
    if (ptr.allocationAlignment != 0uL || align != 0uL) {
        libc_aligned_free(pPtr)
    } else {
        libc_free(pPtr)
    }
}

public actual fun exit(status: Int): Nothing {
    libc_exit(status)
    throw IllegalStateException("exit returned unexpectedly")
}

public actual fun abort(): Nothing {
    libc_abort()
    throw IllegalStateException("abort returned unexpectedly")
}

public actual fun errno(): Int =
    libc_get_errno()

public actual fun clockGettime(clockid: ClockidT, tp: Timespec?): Int {
    val handle = tp?.handle ?: 0L
    val tpPtr: CPointer<ByteVar>? = if (handle != 0L) handle.toCPointer() else null
    return libc_clock_gettime(clockid, tpPtr)
}

public actual fun nanosleep(req: Timespec?): Int {
    val handle = req?.handle ?: 0L
    val reqPtr: CPointer<ByteVar>? = if (handle != 0L) handle.toCPointer() else null
    return libc_clock_nanosleep(0, 0, reqPtr, null)
}

public actual fun availableParallelism(): ULong =
    throw UnsupportedOperationException("availableParallelism requires HermitOS runtime")

public actual fun futexWait(
    address: UIntArray?,
    expected: UInt,
    timeout: Timespec?,
    flags: UInt,
): Int =
    throw UnsupportedOperationException("futexWait requires HermitOS runtime")

public actual fun futexWake(address: UIntArray?, count: Int): Int =
    throw UnsupportedOperationException("futexWake requires HermitOS runtime")

public actual fun stat(path: String?, stat: Stat?): Int =
    throw UnsupportedOperationException("stat requires HermitOS runtime")

public actual fun fstat(fd: Int, stat: Stat?): Int =
    throw UnsupportedOperationException("fstat requires HermitOS runtime")

public actual fun lstat(path: String?, stat: Stat?): Int =
    throw UnsupportedOperationException("lstat requires HermitOS runtime")

public actual fun open(path: String?, flags: Int, mode: ModeT): Int =
    if (path == null) -1 else libc_open(path, flags, mode)

public actual fun unlink(path: String?): Int =
    if (path == null) -1 else libc_unlink(path)

public actual fun mkdir(path: String?, mode: ModeT): Int =
    if (path == null) -1 else libc_mkdir(path, mode.toInt())

public actual fun rmdir(path: String?): Int =
    if (path == null) -1 else libc_rmdir(path)

public actual fun read(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    libc_read(fd, buf?.value?.toCPointer<ByteVar>(), len)

public actual fun write(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    libc_write(fd, buf?.value?.toCPointer<ByteVar>(), len)

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: ULong): Long {
    val handle = iov?.handle ?: 0L
    val iovPtr: CPointer<ByteVar>? = if (handle != 0L) handle.toCPointer() else null
    return libc_readv(fd, iovPtr, iovcnt.toInt())
}

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: ULong): Long {
    val handle = iov?.handle ?: 0L
    val iovPtr: CPointer<ByteVar>? = if (handle != 0L) handle.toCPointer() else null
    return libc_writev(fd, iovPtr, iovcnt.toInt())
}

public actual fun close(fd: Int): Int =
    libc_close(fd)

public actual fun dup(fd: Int): Int =
    libc_dup(fd)

public actual fun fcntl(fd: Int, cmd: Int, arg: Int): Int =
    throw UnsupportedOperationException("fcntl requires HermitOS runtime")

public actual fun getdents64(fd: Int, dirp: Dirent64?, count: ULong): Long =
    throw UnsupportedOperationException("getdents64 requires HermitOS runtime")

public actual fun getaddrinfo(
    nodename: String?,
    servname: String?,
    hints: Addrinfo?,
    res: COpaquePointer?,
): Int =
    throw UnsupportedOperationException("getaddrinfo requires HermitOS runtime")

public actual fun freeaddrinfo(ai: Addrinfo?): Unit =
    throw UnsupportedOperationException("freeaddrinfo requires HermitOS runtime")

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    libc_socket(domain, ty, protocol)

public actual fun bind(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int =
    throw UnsupportedOperationException("bind requires HermitOS runtime")

public actual fun listen(sockfd: Int, backlog: Int): Int =
    libc_listen(sockfd, backlog)

public actual fun accept(sockfd: Int, addr: Sockaddr?, addrlen: UIntArray?): Int =
    throw UnsupportedOperationException("accept requires HermitOS runtime")

public actual fun connect(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int =
    throw UnsupportedOperationException("connect requires HermitOS runtime")

public actual fun recv(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    libc_recv(sockfd, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(
    sockfd: Int,
    buf: COpaquePointer?,
    len: ULong,
    flags: Int,
    addr: Sockaddr?,
    addrlen: UIntArray?,
): Long =
    throw UnsupportedOperationException("recvfrom requires HermitOS runtime")

public actual fun send(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    libc_send(sockfd, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun sendto(
    sockfd: Int,
    buf: COpaquePointer?,
    len: ULong,
    flags: Int,
    to: Sockaddr?,
    tolen: SocklenT,
): Long =
    throw UnsupportedOperationException("sendto requires HermitOS runtime")

public actual fun getpeername(sockfd: Int, addr: Sockaddr?, addrlen: UIntArray?): Int =
    throw UnsupportedOperationException("getpeername requires HermitOS runtime")

public actual fun getsockname(sockfd: Int, addr: Sockaddr?, addrlen: UIntArray?): Int =
    throw UnsupportedOperationException("getsockname requires HermitOS runtime")

public actual fun getsockopt(
    sockfd: Int,
    level: Int,
    optname: Int,
    optval: COpaquePointer?,
    optlen: UIntArray?,
): Int =
    throw UnsupportedOperationException("getsockopt requires HermitOS runtime")

public actual fun setsockopt(
    sockfd: Int,
    level: Int,
    optname: Int,
    optval: COpaquePointer?,
    optlen: SocklenT,
): Int =
    throw UnsupportedOperationException("setsockopt requires HermitOS runtime")

public actual fun ioctl(sockfd: Int, cmd: Int, argp: COpaquePointer?): Int =
    libc_ioctl(sockfd, cmd.toULong(), argp?.value?.toCPointer<ByteVar>())

public actual fun shutdown(sockfd: Int, how: Int): Int =
    libc_shutdown(sockfd, how)

public actual fun eventfd(initval: ULong, flags: Short): Int =
    throw UnsupportedOperationException("eventfd requires HermitOS runtime")

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: Int): Int =
    throw UnsupportedOperationException("poll requires HermitOS runtime")
