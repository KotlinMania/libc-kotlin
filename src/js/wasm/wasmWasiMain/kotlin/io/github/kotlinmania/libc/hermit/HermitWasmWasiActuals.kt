@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.hermit

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

public actual fun alloc(size: ULong, align: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun allocZeroed(size: ULong, align: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realloc(ptr: COpaquePointer?, size: ULong, align: ULong, newSize: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dealloc(ptr: COpaquePointer?, size: ULong, align: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exit(status: Int): Nothing =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun abort(): Nothing =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun errno(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockGettime(clockid: ClockidT, tp: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nanosleep(req: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun availableParallelism(): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun futexWait(address: COpaquePointer?, expected: UInt, timeout: COpaquePointer?, flags: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun futexWake(address: COpaquePointer?, count: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stat(path: String?, stat: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fstat(fd: Int, stat: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lstat(path: String?, stat: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun open(path: String?, flags: Int, mode: ModeT): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unlink(path: String?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkdir(path: String?, mode: ModeT): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rmdir(path: String?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun read(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun write(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readv(fd: Int, iov: COpaquePointer?, iovcnt: ULong): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun writev(fd: Int, iov: COpaquePointer?, iovcnt: ULong): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun close(fd: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dup(fd: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fcntl(fd: Int, cmd: Int, arg: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getdents64(fd: Int, dirp: COpaquePointer?, count: ULong): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getaddrinfo(nodename: String?, servname: String?, hints: COpaquePointer?, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freeaddrinfo(ai: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bind(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun listen(sockfd: Int, backlog: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun accept(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun connect(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun recv(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun send(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendto(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: COpaquePointer?, tolen: SocklenT): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpeername(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getsockname(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: SocklenT): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioctl(sockfd: Int, cmd: Int, argp: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shutdown(sockfd: Int, how: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventfd(initval: ULong, flags: Short): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
