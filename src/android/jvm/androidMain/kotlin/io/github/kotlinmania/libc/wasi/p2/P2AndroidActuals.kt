@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi.p2

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.wasi.SizeT
import io.github.kotlinmania.libc.wasi.SsizeT

private object WasiP2JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_wasi_p2_socket(domain: Int, type: Int, protocol: Int): Int

    @JvmStatic
    external fun libc_wasi_p2_connect(fd: Int, name: Long, addrlen: Int): Int

    @JvmStatic
    external fun libc_wasi_p2_bind(socket: Int, addr: Long, addrlen: Int): Int

    @JvmStatic
    external fun libc_wasi_p2_listen(socket: Int, backlog: Int): Int

    @JvmStatic
    external fun libc_wasi_p2_accept(socket: Int, addr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libc_wasi_p2_accept4(socket: Int, addr: Long, addrlen: Long, flags: Int): Int

    @JvmStatic
    external fun libc_wasi_p2_getsockname(socket: Int, addr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libc_wasi_p2_getpeername(socket: Int, addr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libc_wasi_p2_sendto(socket: Int, buffer: Long, length: Long, flags: Int, addr: Long, addrlen: Int): Long

    @JvmStatic
    external fun libc_wasi_p2_recvfrom(socket: Int, buffer: Long, length: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libc_wasi_p2_getsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Long): Int

    @JvmStatic
    external fun libc_wasi_p2_setsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Int): Int

    @JvmStatic
    external fun libc_wasi_p2_getaddrinfo(host: String?, serv: String?, hint: Long, res: Long): Int

    @JvmStatic
    external fun libc_wasi_p2_freeaddrinfo(p: Long)

    @JvmStatic
    external fun libc_wasi_p2_gaiStrerror(ecode: Int): Long
}

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    WasiP2JniBridge.libc_wasi_p2_socket(domain, type, protocol)

public actual fun connect(fd: CInt, name: COpaquePointer?, addrlen: SocklenT): CInt =
    WasiP2JniBridge.libc_wasi_p2_connect(fd, (name?.value ?: 0L), addrlen.toInt())

public actual fun bind(socket: CInt, addr: COpaquePointer?, addrlen: SocklenT): CInt =
    WasiP2JniBridge.libc_wasi_p2_bind(socket, (addr?.value ?: 0L), addrlen.toInt())

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    WasiP2JniBridge.libc_wasi_p2_listen(socket, backlog)

public actual fun accept(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    WasiP2JniBridge.libc_wasi_p2_accept(socket, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun accept4(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    WasiP2JniBridge.libc_wasi_p2_accept4(socket, (addr?.value ?: 0L), (addrlen?.value ?: 0L), flags)

public actual fun getsockname(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    WasiP2JniBridge.libc_wasi_p2_getsockname(socket, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun getpeername(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    WasiP2JniBridge.libc_wasi_p2_getpeername(socket, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun sendto(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    WasiP2JniBridge.libc_wasi_p2_sendto(socket, (buffer?.value ?: 0L), length.toLong(), flags, (addr?.value ?: 0L), addrlen.toInt())

public actual fun recvfrom(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    WasiP2JniBridge.libc_wasi_p2_recvfrom(socket, (buffer?.value ?: 0L), length.toLong(), flags, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    WasiP2JniBridge.libc_wasi_p2_getsockopt(sockfd, level, optname, (optval?.value ?: 0L), (optlen?.value ?: 0L))

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT): CInt =
    WasiP2JniBridge.libc_wasi_p2_setsockopt(sockfd, level, optname, (optval?.value ?: 0L), optlen.toInt())

public actual fun getaddrinfo(host: String?, serv: String?, hint: COpaquePointer?, res: COpaquePointer?): CInt =
    WasiP2JniBridge.libc_wasi_p2_getaddrinfo(host, serv, (hint?.value ?: 0L), (res?.value ?: 0L))

public actual fun freeaddrinfo(p: COpaquePointer?) {
    WasiP2JniBridge.libc_wasi_p2_freeaddrinfo((p?.value ?: 0L))
}

public actual fun gaiStrerror(ecode: CInt): COpaquePointer? =
    WasiP2JniBridge.libc_wasi_p2_gaiStrerror(ecode).let { if (it == 0L) null else COpaquePointer(it) }
